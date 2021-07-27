// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.implementation;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.maps.route.models.Geography;
import java.time.Duration;

/** A builder for creating a new instance of the RouteClientImpl type. */
@ServiceClientBuilder(serviceClients = {RouteClientImpl.class})
public final class RouteClientBuilder {
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
     * @return the RouteClientBuilder.
     */
    public RouteClientBuilder xMsClientId(String xMsClientId) {
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
     * @return the RouteClientBuilder.
     */
    public RouteClientBuilder geography(Geography geography) {
        this.geography = geography;
        return this;
    }

    /*
     * The environment to connect to
     */
    private AzureEnvironment environment;

    /**
     * Sets The environment to connect to.
     *
     * @param environment the environment value.
     * @return the RouteClientBuilder.
     */
    public RouteClientBuilder environment(AzureEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /*
     * The default poll interval for long-running operation
     */
    private Duration defaultPollInterval;

    /**
     * Sets The default poll interval for long-running operation.
     *
     * @param defaultPollInterval the defaultPollInterval value.
     * @return the RouteClientBuilder.
     */
    public RouteClientBuilder defaultPollInterval(Duration defaultPollInterval) {
        this.defaultPollInterval = defaultPollInterval;
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
     * @return the RouteClientBuilder.
     */
    public RouteClientBuilder pipeline(HttpPipeline pipeline) {
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
     * @return the RouteClientBuilder.
     */
    public RouteClientBuilder serializerAdapter(SerializerAdapter serializerAdapter) {
        this.serializerAdapter = serializerAdapter;
        return this;
    }

    /**
     * Builds an instance of RouteClientImpl with the provided parameters.
     *
     * @return an instance of RouteClientImpl.
     */
    public RouteClientImpl buildClient() {
        if (geography == null) {
            this.geography = Geography.US;
        }
        if (environment == null) {
            this.environment = AzureEnvironment.AZURE;
        }
        if (defaultPollInterval == null) {
            this.defaultPollInterval = Duration.ofSeconds(30);
        }
        if (pipeline == null) {
            this.pipeline =
                new HttpPipelineBuilder()
                    .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                    .build();
        }
        if (serializerAdapter == null) {
            this.serializerAdapter = SerializerFactory.createDefaultManagementSerializerAdapter();
        }
        RouteClientImpl client =
            new RouteClientImpl(pipeline, serializerAdapter, defaultPollInterval, environment, xMsClientId, geography);
        return client;
    }
}
