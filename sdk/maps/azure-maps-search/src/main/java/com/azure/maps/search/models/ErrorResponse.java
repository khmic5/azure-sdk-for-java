// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Fluent;
import com.azure.maps.search.implementation.models.ErrorDetail;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error response Common error response for all Azure Resource Manager APIs to return error details for failed
 * operations. (This also follows the OData error response format.).
 */
@Fluent
public class ErrorResponse {
    /*
     * The error object.
     */
    @JsonProperty(value = "error")
    private ErrorDetail error;

    /**
     * Get the error property: The error object.
     *
     * @return the error value.
     */
    public ErrorDetail getError() {
        return this.error;
    }

    /**
     * Set the error property: The error object.
     *
     * @param error the error value to set.
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse setError(ErrorDetail error) {
        this.error = error;
        return this;
    }
}
