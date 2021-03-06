// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.models.ValidationResponseErrorInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Validation response. */
@Fluent
public final class ValidationResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ValidationResponseInner.class);

    /*
     * Whether or not validation succeeded
     */
    @JsonProperty(value = "isValid", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isValid;

    /*
     * Failed validation result details
     */
    @JsonProperty(value = "errorInfo")
    private ValidationResponseErrorInfo errorInfo;

    /**
     * Get the isValid property: Whether or not validation succeeded.
     *
     * @return the isValid value.
     */
    public Boolean isValid() {
        return this.isValid;
    }

    /**
     * Get the errorInfo property: Failed validation result details.
     *
     * @return the errorInfo value.
     */
    public ValidationResponseErrorInfo errorInfo() {
        return this.errorInfo;
    }

    /**
     * Set the errorInfo property: Failed validation result details.
     *
     * @param errorInfo the errorInfo value to set.
     * @return the ValidationResponseInner object itself.
     */
    public ValidationResponseInner withErrorInfo(ValidationResponseErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (errorInfo() != null) {
            errorInfo().validate();
        }
    }
}
