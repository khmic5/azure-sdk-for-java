// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.Configuration;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.maps.search.implementation.SearchClientImpl;
import com.azure.maps.search.models.Geography;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** A builder for creating a new instance of the SearchClient type. */
@ServiceClientBuilder(serviceClients = {SearchClient.class, SearchAsyncClient.class})
public final class SearchClientBuilder {
    private static final String SDK_NAME = "name";

    private static final String SDK_VERSION = "version";

    static final String[] DEFAULT_SCOPES = new String[] {"https://atlas.microsoft.com/.default"};

    private final Map<String, String> properties = new HashMap<>();

    /** Create an instance of the SearchClientBuilder. */
    public SearchClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * Specifies which account is intended for usage in conjunction with the
     * Azure AD security model.  It represents a unique ID for the Azure Maps
     * account and can be retrieved from the Azure Maps management  plane
     * Account API. To use Azure AD security in Azure Maps see the following
     * [articles](https://aka.ms/amauthdetails) for guidance.
     */
    private String xMsClientId;

    /**
     * Sets Specifies which account is intended for usage in conjunction with the Azure AD security model. It represents
     * a unique ID for the Azure Maps account and can be retrieved from the Azure Maps management plane Account API. To
     * use Azure AD security in Azure Maps see the following [articles](https://aka.ms/amauthdetails) for guidance.
     *
     * @param xMsClientId the xMsClientId value.
     * @return the SearchClientBuilder.
     */
    public SearchClientBuilder xMsClientId(String xMsClientId) {
        this.xMsClientId = xMsClientId;
        return this;
    }

    /*
     * This parameter specifies where the Azure Maps Creator resource is
     * located.  Valid values are us and eu.
     */
    private Geography geography;

    /**
     * Sets This parameter specifies where the Azure Maps Creator resource is located. Valid values are us and eu.
     *
     * @param geography the geography value.
     * @return the SearchClientBuilder.
     */
    public SearchClientBuilder geography(Geography geography) {
        this.geography = geography;
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
     * @return the SearchClientBuilder.
     */
    public SearchClientBuilder apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the SearchClientBuilder.
     */
    public SearchClientBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
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
     * @return the SearchClientBuilder.
     */
    public SearchClientBuilder serializerAdapter(SerializerAdapter serializerAdapter) {
        this.serializerAdapter = serializerAdapter;
        return this;
    }

    /*
     * The HTTP client used to send the request.
     */
    private HttpClient httpClient;

    /**
     * Sets The HTTP client used to send the request.
     *
     * @param httpClient the httpClient value.
     * @return the SearchClientBuilder.
     */
    public SearchClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The configuration store that is used during construction of the service
     * client.
     */
    private Configuration configuration;

    /**
     * Sets The configuration store that is used during construction of the service client.
     *
     * @param configuration the configuration value.
     * @return the SearchClientBuilder.
     */
    public SearchClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The logging configuration for HTTP requests and responses.
     */
    private HttpLogOptions httpLogOptions;

    /**
     * Sets The logging configuration for HTTP requests and responses.
     *
     * @param httpLogOptions the httpLogOptions value.
     * @return the SearchClientBuilder.
     */
    public SearchClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = httpLogOptions;
        return this;
    }

    /*
     * The retry policy that will attempt to retry failed requests, if
     * applicable.
     */
    private RetryPolicy retryPolicy;

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the SearchClientBuilder.
     */
    public SearchClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /*
     * The list of Http pipeline policies to add.
     */
    private final List<HttpPipelinePolicy> pipelinePolicies;

    /**
     * Adds a custom Http pipeline policy.
     *
     * @param customPolicy The custom Http pipeline policy to add.
     * @return the SearchClientBuilder.
     */
    public SearchClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        pipelinePolicies.add(customPolicy);
        return this;
    }

    /**
     * Builds an instance of SearchClientImpl with the provided parameters.
     *
     * @return an instance of SearchClientImpl.
     */
    private SearchClientImpl buildInnerClient() {
        if (geography == null) {
            this.geography = Geography.US;
        }
        if (apiVersion == null) {
            this.apiVersion = "1.0";
        }
        if (pipeline == null) {
            this.pipeline = createHttpPipeline();
        }
        if (serializerAdapter == null) {
            this.serializerAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        }
        SearchClientImpl client = new SearchClientImpl(pipeline, serializerAdapter, xMsClientId, geography, apiVersion);
        return client;
    }

    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration =
                (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        if (httpLogOptions == null) {
            httpLogOptions = new HttpLogOptions();
        }
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        String clientName = properties.getOrDefault(SDK_NAME, "UnknownName");
        String clientVersion = properties.getOrDefault(SDK_VERSION, "UnknownVersion");
        policies.add(
                new UserAgentPolicy(httpLogOptions.getApplicationId(), clientName, clientVersion, buildConfiguration));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(retryPolicy == null ? new RetryPolicy() : retryPolicy);
        policies.add(new CookiePolicy());
        policies.addAll(this.pipelinePolicies);
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(httpLogOptions));
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
    public SearchAsyncClient buildAsyncClient() {
        return new SearchAsyncClient(buildInnerClient().getSearches());
    }

    /**
     * Builds an instance of SearchClient sync client.
     *
     * @return an instance of SearchClient.
     */
    public SearchClient buildClient() {
        return new SearchClient(buildInnerClient().getSearches());
    }
}
