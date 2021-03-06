// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.iotcentral.models.AppState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of an IoT Central application. */
@Fluent
public final class AppProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AppProperties.class);

    /*
     * The ID of the application.
     */
    @JsonProperty(value = "applicationId", access = JsonProperty.Access.WRITE_ONLY)
    private String applicationId;

    /*
     * The display name of the application.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The subdomain of the application.
     */
    @JsonProperty(value = "subdomain")
    private String subdomain;

    /*
     * The ID of the application template, which is a blueprint that defines
     * the characteristics and behaviors of an application. Optional; if not
     * specified, defaults to a blank blueprint and allows the application to
     * be defined from scratch.
     */
    @JsonProperty(value = "template")
    private String template;

    /*
     * The current state of the application.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private AppState state;

    /**
     * Get the applicationId property: The ID of the application.
     *
     * @return the applicationId value.
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Get the displayName property: The display name of the application.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the application.
     *
     * @param displayName the displayName value to set.
     * @return the AppProperties object itself.
     */
    public AppProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the subdomain property: The subdomain of the application.
     *
     * @return the subdomain value.
     */
    public String subdomain() {
        return this.subdomain;
    }

    /**
     * Set the subdomain property: The subdomain of the application.
     *
     * @param subdomain the subdomain value to set.
     * @return the AppProperties object itself.
     */
    public AppProperties withSubdomain(String subdomain) {
        this.subdomain = subdomain;
        return this;
    }

    /**
     * Get the template property: The ID of the application template, which is a blueprint that defines the
     * characteristics and behaviors of an application. Optional; if not specified, defaults to a blank blueprint and
     * allows the application to be defined from scratch.
     *
     * @return the template value.
     */
    public String template() {
        return this.template;
    }

    /**
     * Set the template property: The ID of the application template, which is a blueprint that defines the
     * characteristics and behaviors of an application. Optional; if not specified, defaults to a blank blueprint and
     * allows the application to be defined from scratch.
     *
     * @param template the template value to set.
     * @return the AppProperties object itself.
     */
    public AppProperties withTemplate(String template) {
        this.template = template;
        return this;
    }

    /**
     * Get the state property: The current state of the application.
     *
     * @return the state value.
     */
    public AppState state() {
        return this.state;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
