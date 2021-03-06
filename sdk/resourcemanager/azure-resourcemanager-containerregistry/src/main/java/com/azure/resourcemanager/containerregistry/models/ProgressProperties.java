// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ProgressProperties model. */
@Fluent
public final class ProgressProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProgressProperties.class);

    /*
     * The percentage complete of the copy operation.
     */
    @JsonProperty(value = "percentage")
    private String percentage;

    /**
     * Get the percentage property: The percentage complete of the copy operation.
     *
     * @return the percentage value.
     */
    public String percentage() {
        return this.percentage;
    }

    /**
     * Set the percentage property: The percentage complete of the copy operation.
     *
     * @param percentage the percentage value to set.
     * @return the ProgressProperties object itself.
     */
    public ProgressProperties withPercentage(String percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
