// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resourcemover.models.MoveResourceProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the move resource. */
@Fluent
public final class MoveResourceInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MoveResourceInner.class);

    /*
     * Defines the move resource properties.
     */
    @JsonProperty(value = "properties")
    private MoveResourceProperties properties;

    /**
     * Get the properties property: Defines the move resource properties.
     *
     * @return the properties value.
     */
    public MoveResourceProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Defines the move resource properties.
     *
     * @param properties the properties value to set.
     * @return the MoveResourceInner object itself.
     */
    public MoveResourceInner withProperties(MoveResourceProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}