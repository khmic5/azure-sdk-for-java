package com.azure.core.amqp;

import com.azure.core.amqp.models.CbsAuthorizationType;
import com.azure.core.amqp.models.SslVerifyMode;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import reactor.core.scheduler.Scheduler;

import java.net.URL;

/**
 * Builder to instantiate an {@link AmqpConnection}.
 */
public final class AmqpConnectionBuilder {
    /**
     * Sets the authorization type on the CBS node.
     *
     * @param authorizationType Authorization type.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     */
    public AmqpConnectionBuilder authorizationType(CbsAuthorizationType authorizationType) {
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
     * @see <a href="https://azure.github.io/azure-sdk/general_azurecore.html#telemetry-policy">Azure Core: Telemetry
     *     policy</a>
     */
    public AmqpConnectionBuilder clientOptions(ClientOptions clientOptions) {
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
        return this;
    }

    /**
     * Sets the proxy configuration to use for {@link AmqpConnection}. When a proxy is configured, {@link
     * AmqpTransportType#AMQP_WEB_SOCKETS} must be used for the transport type.
     *
     * @param proxyOptions The proxy configuration to use.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     */
    public AmqpConnectionBuilder proxyOptions(ProxyOptions proxyOptions) {
        return this;
    }

    /**
     * Sets the retry options. If not specified, the default retry options are used.
     *
     * @param retryOptions The retry options to use.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     */
    public AmqpConnectionBuilder retryOptions(AmqpRetryOptions retryOptions) {
        return this;
    }

    /**
     * Sets the credential used to authenticate requests to the AMQP message broker.
     *
     * @param tokenCredential {@link TokenCredential} to be used for authentication.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     */
    public AmqpConnectionBuilder tokenCredential(TokenCredential tokenCredential) {
        return this;
    }

    /**
     * Sets the transport type by which all the communication the message broker. Default value is {@link
     * AmqpTransportType#AMQP}.
     *
     * @param transportType The transport type to use.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     */
    public AmqpConnectionBuilder transportType(AmqpTransportType transportType) {
        return this;
    }

    /**
     * Sets the verify mode for this connection.
     *
     * @param verifyMode The verification mode.
     *
     * @return The updated {@link AmqpConnectionBuilder} object.
     */
    public AmqpConnectionBuilder verifyMode(SslVerifyMode verifyMode) {
        return this;
    }

    /**
     * Creates a new AMQP connection.
     *
     * @return A new AMQP connection.
     */
    public AmqpConnection buildConnection() {
        return null;
    }
}
