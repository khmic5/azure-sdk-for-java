// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Error details for the alert. */
@Immutable
public final class AlertErrorDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AlertErrorDetails.class);

    /*
     * Error code.
     */
    @JsonProperty(value = "errorCode", access = JsonProperty.Access.WRITE_ONLY)
    private String errorCode;

    /*
     * Error Message.
     */
    @JsonProperty(value = "errorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String errorMessage;

    /*
     * Number of occurrences.
     */
    @JsonProperty(value = "occurrences", access = JsonProperty.Access.WRITE_ONLY)
    private Integer occurrences;

    /**
     * Get the errorCode property: Error code.
     *
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Get the errorMessage property: Error Message.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Get the occurrences property: Number of occurrences.
     *
     * @return the occurrences value.
     */
    public Integer occurrences() {
        return this.occurrences;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}