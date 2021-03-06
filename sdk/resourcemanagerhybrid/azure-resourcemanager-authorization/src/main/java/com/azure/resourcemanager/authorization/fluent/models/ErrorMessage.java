// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Active Directory error message. */
@Fluent
public final class ErrorMessage {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ErrorMessage.class);

    /*
     * Error message value.
     */
    @JsonProperty(value = "value")
    private String message;

    /**
     * Get the message property: Error message value.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Error message value.
     *
     * @param message the message value to set.
     * @return the ErrorMessage object itself.
     */
    public ErrorMessage withMessage(String message) {
        this.message = message;
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
