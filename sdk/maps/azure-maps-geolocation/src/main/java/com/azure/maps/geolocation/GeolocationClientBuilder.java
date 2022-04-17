// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.geolocation;

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
import com.azure.maps.geolocation.implementation.GeolocationClientImpl;
import com.azure.maps.geolocation.implementation.GeolocationClientImplBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A builder for creating a new instance of the GeolocationClient type. */
@ServiceClientBuilder(serviceClients = {GeolocationClient.class, GeolocationAsyncClient.class})
public final class GeolocationClientBuilder {
    // auth scope
    static final String[] DEFAULT_SCOPES = new String[] {"https://atlas.microsoft.com/.default"};

    // constants
    private static final String SDK_NAME = "name";
    private static final String SDK_VERSION = "version";
    private static final String GEOLOCATION_SUBSCRIPTION_KEY = "subscription-key";
    private static final String X_MS_CLIENT_ID = "x-ms-client-id";
    //subscription-key

    // instance fields
    private final Map<String, String> properties = new HashMap<>();
    private String endpoint;
    private GeolocationServiceVersion serviceVersion;
    /*
     * Specifies which account is intended for usage in conjunction with the
     * Azure AD security model.  It represents a unique ID for the Azure Maps
     * account and can be retrieved from the Azure Maps management  plane
     * Account API. To use Azure AD security in Azure Maps see the following
     * [articles](https://aka.ms/amauthdetails) for guidance.
     */
    private String clientId;
    private HttpPipeline pipeline;
    private HttpClient httpClient;
    private Configuration configuration;
    private HttpLogOptions httpLogOptions;
    private final List<HttpPipelinePolicy> pipelinePolicies;
    private ClientOptions clientOptions;
    private RetryPolicy retryPolicy;

    // credentials
    private AzureKeyCredential keyCredential;
    private TokenCredential tokenCredential;

    /**
     * Default constructor for the builder class.
     */
    public GeolocationClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /**
     * Sets Specifies which account is intended for usage in conjunction with the Azure AD security model. It represents
     * a unique ID for the Azure Maps account and can be retrieved from the Azure Maps management plane Account API. To
     * use Azure AD security in Azure Maps see the following [articles](https://aka.ms/amauthdetails) for guidance.
     *
     * @param clientId the clientId value.
     * @return the GeolocationClientBuilder.
     */
    public GeolocationClientBuilder clientId(String clientId) {
        this.clientId = Objects.requireNonNull(clientId, "'clientId' cannot be null.");;
        return this;
    }

     /**
     * Set endpoint of the service.
     *
     * @param endpoint url of the service
     * @return GeolocationClientBuilder
     */
    public GeolocationClientBuilder endpoint(String endpoint) {
        this.endpoint = Objects.requireNonNull(endpoint, "'endpoint' cannot be null.");
        return this;
    }

    /**
     * Sets the {@link GeolocationServiceVersion} that is used when making API requests.
     * <p>
     * If a service version is not provided, the service version that will be used will be the latest known service
     * version based on the version of the client library being used. If no service version is specified, updating to a
     * newer version of the client library will have the result of potentially moving to a newer service version.
     * <p>
     * Targeting a specific service version may also mean that the service will return an error for newer APIs.
     *
     * @param version {@link GeolocationServiceVersion} of the service to be used when making requests.
     * @return the updated RouteClientBuilder object
     */
    public GeolocationClientBuilder serviceVersion(GeolocationServiceVersion version) {
        this.serviceVersion = version;
        return this;
    }

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the GeolocationClientBuilder.
     */
    public GeolocationClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = Objects.requireNonNull(pipeline, "'pipeline' cannot be null.");
        return this;
    }

    /**
     * Sets The HTTP client used to send the request.
     *
     * @param httpClient the httpClient value.
     * @return the GeolocationClientBuilder.
     */
    public GeolocationClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
        return this;
    }

    /**
     * Sets The configuration store that is used during construction of the service client.
     *
     * @param configuration the configuration value.
     * @return the GeolocationClientBuilder.
     */
    public GeolocationClientBuilder configuration(Configuration configuration) {
        this.configuration = Objects.requireNonNull(configuration, "'configuration' cannot be null.");;
        return this;
    }

    /**
     * Sets The logging configuration for HTTP requests and responses.
     *
     * @param httpLogOptions the httpLogOptions value.
     * @return the GeolocationClientBuilder.
     */
    public GeolocationClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'logOptions' cannot be null.");
        return this;
    }

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the GeolocationClientBuilder.
     */
    public GeolocationClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
        return this;
    }

    /**
     * Sets The client options such as application ID and custom headers to set on a request.
     *
     * @param clientOptions the clientOptions value.
     * @return the GeolocationClientBuilder.
     */
    public GeolocationClientBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = Objects.requireNonNull(clientOptions, "'clientOptions' cannot be null.");
        return this;
    }

    /**
     * Adds a custom Http pipeline policy.
     *
     * @param customPolicy The custom Http pipeline policy to add.
     * @return the GeolocationClientBuilder.
     */
    public GeolocationClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        pipelinePolicies.add(Objects.requireNonNull(customPolicy, "'customPolicy' cannot be null."));
        return this;
    }

    /**
     * Sets the {@link TokenCredential} used to authenticate HTTP requests.
     *
     * @param tokenCredential {@link TokenCredential} used to authenticate HTTP requests.
     * @return The updated {@link GeolocationClientBuilder} object.
     * @throws NullPointerException If {@code tokenCredential} is null.
     */
    public GeolocationClientBuilder credential(TokenCredential tokenCredential) {
        this.tokenCredential = Objects.requireNonNull(tokenCredential, "'tokenCredential' cannot be null.");
        return this;
    }

    /**
     * Sets the {@link AzureKeyCredential} used to authenticate HTTP requests.
     *
     * @param keyCredential The {@link AzureKeyCredential} used to authenticate HTTP requests.
     * @return The updated {@link GeolocationClientBuilder} object.
     * @throws NullPointerException If {@code keyCredential} is null.
     */
    public GeolocationClientBuilder credential(AzureKeyCredential keyCredential)  {
        this.keyCredential = Objects.requireNonNull(keyCredential, "'keyCredential' cannot be null.");
        return this;
    }

    /**
     * Builds an instance of GeolocationClientImpl with the provided parameters.
     *
     * @return an instance of GeolocationClientImpl.
     */
    private GeolocationClientImpl buildInnerClient() {
        if (endpoint == null) {
            this.endpoint = "https://atlas.microsoft.com";
        }
        if (serviceVersion == null) {
            this.serviceVersion = GeolocationServiceVersion.getLatest();
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        // client impl
        GeolocationClientImplBuilder builder = new GeolocationClientImplBuilder();
        builder.host(this.endpoint);
        builder.apiVersion(this.serviceVersion.getVersion());
        builder.pipeline(this.pipeline);
        builder.clientId(this.clientId);
        builder.httpClient(this.httpClient);
        builder.httpLogOptions(this.httpLogOptions);

        GeolocationClientImpl client = builder.buildClient();
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
            if (this.clientId == null) {
                throw new IllegalArgumentException("Missing 'clientId' parameter required for Azure AD Authentication");
            }
            // we need the x-ms-client header
            HttpHeaders clientHeader = new HttpHeaders();
            clientHeader.add(X_MS_CLIENT_ID, this.clientId);
            policies.add(new AddHeadersPolicy(clientHeader));

            // User token based policy
            policies.add(new BearerTokenAuthenticationPolicy(tokenCredential, DEFAULT_SCOPES));
        } else if (keyCredential != null) {
            policies.add(new AzureKeyCredentialPolicy(GEOLOCATION_SUBSCRIPTION_KEY, keyCredential));
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

    /**
     * Builds an instance of SearchAsyncClient async client.
     *
     * @return an instance of SearchAsyncClient.
     */
    public GeolocationAsyncClient buildAsyncClient() {
        return new GeolocationAsyncClient(buildInnerClient().getGeolocations());
    }

    /**
     * Builds an instance of SearchClient sync client.
     *
     * @return an instance of SearchClient.
     */
    public GeolocationClient buildClient() {
        return new GeolocationClient(buildAsyncClient());
    }
}
