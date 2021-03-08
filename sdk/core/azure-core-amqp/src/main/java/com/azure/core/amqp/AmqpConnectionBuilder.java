// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp;

import com.azure.core.amqp.implementation.AzureTokenManagerProvider;
import com.azure.core.amqp.implementation.ConnectionOptions;
import com.azure.core.amqp.implementation.MessageSerializer;
import com.azure.core.amqp.implementation.ReactorConnection;
import com.azure.core.amqp.implementation.ReactorHandlerProvider;
import com.azure.core.amqp.implementation.ReactorProvider;
import com.azure.core.amqp.implementation.StringUtil;
import com.azure.core.amqp.implementation.TokenManagerProvider;
import com.azure.core.amqp.models.CbsAuthorizationType;
import com.azure.core.amqp.models.SslVerifyMode;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import org.apache.qpid.proton.amqp.transport.ReceiverSettleMode;
import org.apache.qpid.proton.amqp.transport.SenderSettleMode;
import reactor.core.scheduler.Schedulers;

import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.time.Duration;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 * Builder to instantiate an {@link AmqpConnection}.
 */
public final class AmqpConnectionBuilder {
    private static final AmqpRetryOptions DEFAULT_RETRY = new AmqpRetryOptions()
        .setTryTimeout(Duration.ofSeconds(60));
    private static final Pattern HOST_PORT_PATTERN = Pattern.compile("^[^:]+:\\d+");
    private static final String NAME_KEY = "name";
    private static final String PROPERTIES_FILE = "azure-core-amqp.properties";
    private static final String UNKNOWN = "UNKNOWN";
    private static final String VERSION_KEY = "version";

    private final ClientLogger logger = new ClientLogger(AmqpConnectionBuilder.class);

    private String activeDirectoryScope;
    private CbsAuthorizationType authorizationType;
    private ClientOptions clientOptions;
    private Configuration configuration;
    private URL customEndpointAddress;
    private String fullyQualifiedNamespace;
    private ProxyOptions proxyOptions;
    private AmqpRetryOptions retryOptions;
    private TokenCredential credential;
    private AmqpTransportType transportType;
    private SslVerifyMode verifyMode;

    /**
     * Creates a new builder with default AMQP properties set:
     *
     * <ul>
     *     <li>{@link #transportType(AmqpTransportType) transportType} of {@link AmqpTransportType#AMQP}</li>
     *     <li>{@link #verifyMode(SslVerifyMode) verifyMode} of {@link SslVerifyMode#VERIFY_PEER_NAME}</li>
     *     <li>{@link #retryOptions(AmqpRetryOptions) retryOptions} with 3 attempts and operation timeout of 60s</li>
     * </ul>
     */
    public AmqpConnectionBuilder() {
        this.transportType = AmqpTransportType.AMQP;
        this.verifyMode = SslVerifyMode.VERIFY_PEER_NAME;
        this.retryOptions = DEFAULT_RETRY;
    }

    /**
     * Sets the active directory scope to use when authorizing with the CBS node. Required when {@link
     * #authorizationType(CbsAuthorizationType) authorizationType} is {@link CbsAuthorizationType#JSON_WEB_TOKEN}.
     *
     * @param activeDirectoryScope The active directory scope to use.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     *
     * @throws NullPointerException if {@code activeDirectoryScope} is null.
     */
    public AmqpConnectionBuilder activeDirectoryScope(String activeDirectoryScope) {
        this.activeDirectoryScope = Objects.requireNonNull(activeDirectoryScope,
            "'activeDirectoryScope' cannot be null.");
        return this;
    }

    /**
     * Sets the authorization type on the CBS node. If {@code authorizationType} is {@link
     * CbsAuthorizationType#JSON_WEB_TOKEN JSON_WEB_TOKEN}, then the {@link #activeDirectoryScope(String)
     * activeDirectoryScope} must be set.
     *
     * @param authorizationType Authorization type to use with the CBS node.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     *
     * @throws NullPointerException if {@code authorizationType} is null.
     */
    public AmqpConnectionBuilder authorizationType(CbsAuthorizationType authorizationType) {
        this.authorizationType = Objects.requireNonNull(authorizationType, "'authorizationType' cannot be null.");
        return this;
    }

    /**
     * Sets the {@link ClientOptions} which enables various options to be set on the client. For example setting {@code
     * applicationId} using {@link ClientOptions#setApplicationId(String)} to configure {@link UserAgentPolicy} for
     * telemetry/monitoring purpose.
     * <p>
     *
     * @param clientOptions to be set on the client.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     *
     * @throws NullPointerException if {@code clientOptions} is null.
     * @see <a href="https://azure.github.io/azure-sdk/general_azurecore.html#telemetry-policy">Azure Core: Telemetry
     *     policy</a>
     */
    public AmqpConnectionBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = Objects.requireNonNull(clientOptions, "'clientOptions' cannot be null.");
        return this;
    }

    /**
     * Sets the credential used to authenticate requests to the AMQP message broker.
     *
     * @param credential {@link TokenCredential} to be used for authentication.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     */
    public AmqpConnectionBuilder credential(TokenCredential credential) {
        this.credential = Objects.requireNonNull(credential, "'credential' cannot be null.");
        return this;
    }

    /**
     * Sets the configuration store that is used during construction of the service client.
     *
     * If not specified, the default configuration store is used to configure the {@link AmqpConnection}. Use {@link
     * Configuration#NONE} to bypass using configuration settings during construction.
     *
     * @param configuration The configuration store used to configure the {@link AmqpConnection}.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     */
    public AmqpConnectionBuilder configuration(Configuration configuration) {
        this.configuration = Objects.requireNonNull(configuration, "'configuration' cannot be null.");
        return this;
    }

    /**
     * Sets a custom endpoint address when connecting to the AMQP message broker. This can be useful when your network
     * does not allow connecting to the standard endpoint address, but does allow connecting through an intermediary.
     * For example: {@literal https://my.custom.endpoint.com:55300}.
     * <p>
     * If no port is specified, the default port for the {@link #transportType(AmqpTransportType) transport type} is
     * used.
     *
     * @param customEndpointAddress The custom endpoint address.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     *
     * @throws IllegalArgumentException if {@code customEndpointAddress} cannot be parsed into a valid {@link URL}.
     */
    public AmqpConnectionBuilder customEndpointAddress(String customEndpointAddress) {
        if (customEndpointAddress == null) {
            this.customEndpointAddress = null;
            return this;
        }

        try {
            this.customEndpointAddress = new URL(customEndpointAddress);
        } catch (MalformedURLException e) {
            throw logger.logExceptionAsError(
                new IllegalArgumentException(customEndpointAddress + ": is not a valid URL.", e));
        }

        return this;
    }

    /**
     * Sets the fully qualified namespace for the connection.
     *
     * @param fullyQualifiedNamespace domain name for the connection.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     */
    public AmqpConnectionBuilder fullyQualifiedNamespace(String fullyQualifiedNamespace) {
        if (CoreUtils.isNullOrEmpty(fullyQualifiedNamespace)) {
            throw logger.logExceptionAsError(new IllegalArgumentException(
                "'fullyQualifiedNamespace' cannot be null or an empty string."));
        }

        this.fullyQualifiedNamespace = fullyQualifiedNamespace;
        return this;
    }

    /**
     * Sets the proxy configuration to use for {@link AmqpConnection}. When a proxy is configured, {@link
     * AmqpTransportType#AMQP_WEB_SOCKETS} must be used for the transport type.
     *
     * @param proxyOptions The proxy configuration to use.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     *
     * @throws NullPointerException if {@code proxyOptions} is null.
     */
    public AmqpConnectionBuilder proxyOptions(ProxyOptions proxyOptions) {
        this.proxyOptions = Objects.requireNonNull(proxyOptions, "'proxyOptions' cannot be null.");
        return this;
    }

    /**
     * Sets the retry options. If not specified, the default retry options are used.
     *
     * @param retryOptions The retry options to use.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     *
     * @throws NullPointerException if {@code retryOptions} is null.
     */
    public AmqpConnectionBuilder retryOptions(AmqpRetryOptions retryOptions) {
        this.retryOptions = Objects.requireNonNull(retryOptions, "'retryOptions' cannot be null.");
        return this;
    }

    /**
     * Sets the transport type by which all the communication the message broker. Default value is {@link
     * AmqpTransportType#AMQP}.
     *
     * @param transportType The transport type to use.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     *
     * @throws NullPointerException if {@code transportType} is null.
     */
    public AmqpConnectionBuilder transportType(AmqpTransportType transportType) {
        this.transportType = Objects.requireNonNull(transportType, "'transportType' cannot be null.");
        return this;
    }

    /**
     * Sets the verify mode for this connection.
     *
     * @param verifyMode The verification mode.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     *
     * @throws NullPointerException if {@code transportType} is null.
     */
    public AmqpConnectionBuilder verifyMode(SslVerifyMode verifyMode) {
        this.verifyMode = Objects.requireNonNull(verifyMode, "'verifyMode' cannot be null.");
        return this;
    }

    /**
     * Creates a new AMQP connection.
     *
     * @return A new AMQP connection.
     */
    public AmqpConnection buildConnection() {
        final ConnectionOptions connectionOptions = getConnectionOptions();

        final TokenManagerProvider tokenManagerProvider = new AzureTokenManagerProvider(
            connectionOptions.getAuthorizationType(), connectionOptions.getFullyQualifiedNamespace(),
            activeDirectoryScope);
        final ReactorProvider provider = new ReactorProvider();
        final ReactorHandlerProvider handlerProvider = new ReactorHandlerProvider(provider);

        final String connectionId = StringUtil.getRandomString("MF");
        logger.info("connectionId[{}]: Emitting a single connection.", connectionId);

        final MessageSerializer serializer = new AmqpAnnotatedMessageSerializer();

        return new ReactorConnection(connectionId, connectionOptions, provider, handlerProvider, tokenManagerProvider,
            serializer, SenderSettleMode.SETTLED, ReceiverSettleMode.SECOND);
    }

    private ConnectionOptions getConnectionOptions() {
        if (authorizationType == null) {
            throw logger.logExceptionAsError(new IllegalStateException(
                "'authorizationType' is required. Set it in the builder."));
        }

        // If the proxy has been configured by the user but they have overridden the TransportType with
        // something that is not AMQP_WEB_SOCKETS.
        final ProxyOptions proxyToUse = proxyOptions != null ? proxyOptions : getDefaultProxyConfiguration();

        if (proxyToUse != null && proxyToUse.isProxyAddressConfigured()
            && transportType != AmqpTransportType.AMQP_WEB_SOCKETS) {
            throw logger.logExceptionAsError(new IllegalArgumentException(
                "Cannot use a proxy when TransportType is not AMQP Web Sockets."));
        }

        final ClientOptions clientOptionsToUse = clientOptions != null ? clientOptions : new ClientOptions();
        final Map<String, String> properties = CoreUtils.getProperties(PROPERTIES_FILE);
        final String product = properties.getOrDefault(NAME_KEY, UNKNOWN);
        final String clientVersion = properties.getOrDefault(VERSION_KEY, UNKNOWN);

        if (customEndpointAddress == null) {
            return new ConnectionOptions(fullyQualifiedNamespace, credential, authorizationType, transportType,
                retryOptions, proxyToUse, Schedulers.elastic(), clientOptionsToUse, verifyMode, product, clientVersion);
        } else {
            return new ConnectionOptions(fullyQualifiedNamespace, credential, authorizationType, transportType,
                retryOptions, proxyToUse, Schedulers.elastic(), clientOptionsToUse, verifyMode, product, clientVersion,
                customEndpointAddress.getHost(), customEndpointAddress.getPort());
        }
    }

    private ProxyOptions getDefaultProxyConfiguration() {
        ProxyAuthenticationType authentication = ProxyAuthenticationType.NONE;
        if (proxyOptions != null) {
            authentication = proxyOptions.getAuthentication();
        }

        final Configuration configurationToUse = this.configuration == null
            ? Configuration.getGlobalConfiguration()
            : this.configuration;
        final String proxyAddress = configurationToUse.get(Configuration.PROPERTY_HTTP_PROXY);

        if (CoreUtils.isNullOrEmpty(proxyAddress)) {
            return ProxyOptions.SYSTEM_DEFAULTS;
        }

        if (HOST_PORT_PATTERN.matcher(proxyAddress.trim()).find()) {
            final String[] hostPort = proxyAddress.split(":");
            final String host = hostPort[0];
            final int port = Integer.parseInt(hostPort[1]);

            final Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port));
            final String username = configurationToUse.get(ProxyOptions.PROXY_USERNAME);
            final String password = configurationToUse.get(ProxyOptions.PROXY_PASSWORD);

            return new ProxyOptions(authentication, proxy, username, password);
        } else {
            com.azure.core.http.ProxyOptions coreProxyOptions = com.azure.core.http.ProxyOptions
                .fromConfiguration(configurationToUse);

            return new ProxyOptions(authentication, new Proxy(coreProxyOptions.getType().toProxyType(),
                coreProxyOptions.getAddress()), coreProxyOptions.getUsername(), coreProxyOptions.getPassword());
        }
    }
}
