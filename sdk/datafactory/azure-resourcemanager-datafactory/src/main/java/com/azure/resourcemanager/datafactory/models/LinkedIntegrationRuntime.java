// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The linked integration runtime information. */
@Immutable
public final class LinkedIntegrationRuntime {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LinkedIntegrationRuntime.class);

    /*
     * The name of the linked integration runtime.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The subscription ID for which the linked integration runtime belong to.
     */
    @JsonProperty(value = "subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /*
     * The name of the data factory for which the linked integration runtime
     * belong to.
     */
    @JsonProperty(value = "dataFactoryName", access = JsonProperty.Access.WRITE_ONLY)
    private String dataFactoryName;

    /*
     * The location of the data factory for which the linked integration
     * runtime belong to.
     */
    @JsonProperty(value = "dataFactoryLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String dataFactoryLocation;

    /*
     * The creating time of the linked integration runtime.
     */
    @JsonProperty(value = "createTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createTime;

    /**
     * Get the name property: The name of the linked integration runtime.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the subscriptionId property: The subscription ID for which the linked integration runtime belong to.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the dataFactoryName property: The name of the data factory for which the linked integration runtime belong
     * to.
     *
     * @return the dataFactoryName value.
     */
    public String dataFactoryName() {
        return this.dataFactoryName;
    }

    /**
     * Get the dataFactoryLocation property: The location of the data factory for which the linked integration runtime
     * belong to.
     *
     * @return the dataFactoryLocation value.
     */
    public String dataFactoryLocation() {
        return this.dataFactoryLocation;
    }

    /**
     * Get the createTime property: The creating time of the linked integration runtime.
     *
     * @return the createTime value.
     */
    public OffsetDateTime createTime() {
        return this.createTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}