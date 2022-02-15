// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.render;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.AddHeadersPolicy;
import com.azure.core.http.policy.AzureKeyCredentialPolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.maps.render.implementation.RenderClientImpl;
import com.azure.maps.render.implementation.RenderClientImplBuilder;

/** A builder for creating a new instance of the RenderClient type. */
@ServiceClientBuilder(serviceClients = {RenderClient.class, RenderAsyncClient.class})
public final class RenderClientBuilder {
    // auth scope
    static final String[] DEFAULT_SCOPES = new String[] {"https://atlas.microsoft.com/.default"};

    //constants
    private static final String SDK_NAME = "name";
    private static final String SDK_VERSION = "version";
    private static final String RENDER_SUBSCRIPTION_KEY = "subscription-key";
    private static final String X_MS_CLIENT_ID = "x-ms-client-id";

    // instance fields
    private final Map<String, String> properties = new HashMap<>();
    private String endpoint;
    private RenderServiceVersion serviceVersion;
    private String mapsClientId;
    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;
    /*
     * The HTTP client used to send the request.
     */
    private HttpClient httpClient;
    /*
     * The configuration store that is used during construction of the service
     * client.
     */
    private Configuration configuration;
    /*
     * The logging configuration for HTTP requests and responses.
     */
    private HttpLogOptions httpLogOptions;
    /*
     * The list of Http pipeline policies to add.
     */
    private final List<HttpPipelinePolicy> pipelinePolicies;
    /*
     * The client options such as application ID and custom headers to set on a
     * request.
     */
    private ClientOptions clientOptions;
    /*
     * The retry policy that will attempt to retry failed requests, if
     * applicable.
     */
    private RetryPolicy retryPolicy;

    /** Create an instance of the RenderClientBuilder. */
    public RenderClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    // credentials
    private AzureKeyCredential keyCredential;
    private TokenCredential tokenCredential;

    /**
     * Sets the Azure Maps client id for use with Azure AD Authentication. This client id
     * is the account-based GUID that appears on the Azure Maps Authentication page.
     *
     * More details: <a href="https://docs.microsoft.com/azure/azure-maps/azure-maps-authentication">Azure Maps AD Authentication</a>
     *
     * @param mapsClientId the clientId value.
     * @return the SearchClientBuilder.
     */
    public RenderClientBuilder mapsClientId(String mapsClientId) {
        this.mapsClientId = Objects.requireNonNull(mapsClientId, "'mapsClientId' cannot be null.");;
        return this;
    }

    /**
     * Set endpoint of the service.
     *
     * @param endpoint url of the service
     * @return SearchClientBuilder
     */
    public RenderClientBuilder endpoint(String endpoint) {
        this.endpoint = Objects.requireNonNull(endpoint, "'endpoint' cannot be null.");
        return this;
    }

    public RenderClientBuilder serviceVersion(RenderServiceVersion version) {
        this.serviceVersion = version;
        return this;
    }

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the RenderClientBuilder.
     */
    public RenderClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = Objects.requireNonNull(pipeline, "'pipeline' cannot be null.");
        return this;
    }

    /**
     * Sets The HTTP client used to send the request.
     *
     * @param httpClient the httpClient value.
     * @return the RenderClientBuilder.
     */
    public RenderClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
        return this;
    }

    /**
     * Sets The configuration store that is used during construction of the service client.
     *
     * @param configuration the configuration value.
     * @return the RenderClientBuilder.
     */
    public RenderClientBuilder configuration(Configuration configuration) {
        this.configuration = Objects.requireNonNull(configuration, "'configuration' cannot be null.");;
        return this;
    }

    /**
     * Sets The configuration store that is used during construction of the service client.
     *
     * @param configuration the configuration value.
     * @return the RenderClientBuilder.
     */
    public RenderClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'logOptions' cannot be null.");
        return this;
    }

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the RenderClientBuilder.
     */
    public RenderClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
        return this;
    }

    /**
     * Sets The client options such as application ID and custom headers to set on a request.
     *
     * @param clientOptions the clientOptions value.
     * @return the RenderClientBuilder.
     */
    public RenderClientBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = Objects.requireNonNull(clientOptions, "'clientOptions' cannot be null.");
        return this;
    }

    /**
     * Adds a custom Http pipeline policy.
     *
     * @param customPolicy The custom Http pipeline policy to add.
     * @return the RenderClientBuilder.
     */
    public RenderClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        pipelinePolicies.add(Objects.requireNonNull(customPolicy, "'customPolicy' cannot be null."));
        return this;
    }

    /**
     * Sets the {@link TokenCredential} used to authenticate HTTP requests.
     *
     * @param tokenCredential {@link TokenCredential} used to authenticate HTTP requests.
     * @return The updated {@link MapsSearchClientBuilder} object.
     * @throws NullPointerException If {@code tokenCredential} is null.
     */
    public RenderClientBuilder credential(TokenCredential tokenCredential) {
        this.tokenCredential = Objects.requireNonNull(tokenCredential, "'tokenCredential' cannot be null.");
        return this;
    }

    /**
     * Sets the {@link AzureKeyCredential} used to authenticate HTTP requests.
     *
     * @param keyCredential The {@link AzureKeyCredential} used to authenticate HTTP requests.
     * @return The updated {@link MapsSearchClientBuilder} object.
     * @throws NullPointerException If {@code keyCredential} is null.
     */
    public RenderClientBuilder credential(AzureKeyCredential keyCredential)  {
        this.keyCredential = Objects.requireNonNull(keyCredential, "'keyCredential' cannot be null.");
        return this;
    }

    /**
     * Builds an instance of RenderClientImpl with the provided parameters.
     *
     * @return an instance of RenderClientImpl.
     */
    private RenderClientImpl buildInnerClient() {
        if (endpoint == null) {
            this.endpoint = "https://atlas.microsoft.com";
        }
        if (serviceVersion == null) {
            this.serviceVersion = RenderServiceVersion.getLatest();
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        // client impl
        RenderClientImplBuilder builder = new RenderClientImplBuilder();
        builder.host(this.endpoint);
        builder.apiVersion(this.serviceVersion.getVersion());
        builder.pipeline(this.pipeline);
        builder.clientId(this.mapsClientId);
        builder.httpClient(this.httpClient);
        builder.httpLogOptions(this.httpLogOptions);

        RenderClientImpl client = builder.buildClient();
        return client;
    }

    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration =
                (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        if (httpLogOptions == null) {
            httpLogOptions = new HttpLogOptions();
        }
        if (clientOptions == null) {
            clientOptions = new ClientOptions();
        }

        // Configure pipelines and user agent
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        String clientName = properties.getOrDefault(SDK_NAME, "JavaSearchSDK");
        String clientVersion = properties.getOrDefault(SDK_VERSION, serviceVersion.getVersion());
        String applicationId = CoreUtils.getApplicationId(clientOptions, httpLogOptions);
        policies.add(new UserAgentPolicy(applicationId, clientName, clientVersion, buildConfiguration));

        // configure headers
        HttpHeaders headers = new HttpHeaders();
        clientOptions.getHeaders().forEach(header -> headers.set(header.getName(), header.getValue()));
        if (headers.getSize() > 0) {
            policies.add(new AddHeadersPolicy(headers));
        }

        // Authentications
        if (tokenCredential != null) {
            if (this.mapsClientId == null) {
                throw new IllegalArgumentException("Missing 'mapsClientId' parameter required for Azure AD Authentication");
            }
            // we need the x-ms-client header
            HttpHeaders clientHeader = new HttpHeaders();
            clientHeader.add(X_MS_CLIENT_ID, this.mapsClientId);
            policies.add(new AddHeadersPolicy(clientHeader));

            // User token based policy
            policies.add(new BearerTokenAuthenticationPolicy(tokenCredential, DEFAULT_SCOPES));
        } else if (keyCredential != null) {
            policies.add(new AzureKeyCredentialPolicy(RENDER_SUBSCRIPTION_KEY, keyCredential));
        } else {
            // Throw exception that credential and tokenCredential cannot be null
            throw new IllegalArgumentException("Missing credential information while building a client.");
        }

        // Add final policies
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(retryPolicy == null ? new RetryPolicy() : retryPolicy);
        policies.add(new CookiePolicy());
        policies.addAll(this.pipelinePolicies);
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(httpLogOptions));

        // build the http pipeline
        HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                        .policies(policies.toArray(new HttpPipelinePolicy[0]))
                        .httpClient(httpClient)
                        .build();
        return httpPipeline;
    }

    /*
     * server parameter
     */
    private String host;

    /**
     * Sets server parameter.
     *
     * @param host the host value.
     * @return the RenderClientBuilder.
     */
    public RenderClientBuilder host(String host) {
        this.host = host;
        return this;
    }

    /*
     * Api Version
     */
    private String apiVersion;

    /**
     * Sets Api Version.
     *
     * @param apiVersion the apiVersion value.
     * @return the RenderClientBuilder.
     */
    public RenderClientBuilder apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /*
     * The serializer to serialize an object into a string
     */
    private SerializerAdapter serializerAdapter;

    /**
     * Sets The serializer to serialize an object into a string.
     *
     * @param serializerAdapter the serializerAdapter value.
     * @return the RenderClientBuilder.
     */
    public RenderClientBuilder serializerAdapter(SerializerAdapter serializerAdapter) {
        this.serializerAdapter = serializerAdapter;
        return this;
    }

    /**
     * Builds an instance of RenderAsyncClient async client.
     *
     * @return an instance of RenderAsyncClient.
     */
    public RenderAsyncClient buildAsyncClient() {
        return new RenderAsyncClient(buildInnerClient());
    }

    /**
     * Builds an instance of RenderClient sync client.
     *
     * @return an instance of RenderClient.
     */
    public RenderClient buildClient() {
        return new RenderClient(buildAsyncClient());
    }
}