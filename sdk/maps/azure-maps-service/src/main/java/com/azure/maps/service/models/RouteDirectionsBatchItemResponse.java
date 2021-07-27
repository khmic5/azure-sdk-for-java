// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The result of the query. RouteDirectionsResponse if the query completed successfully, ErrorResponse otherwise. */
@Fluent
public final class RouteDirectionsBatchItemResponse extends RouteDirectionsResponse {
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
     * @return the RouteDirectionsBatchItemResponse object itself.
     */
    public RouteDirectionsBatchItemResponse setError(ErrorDetail error) {
        this.error = error;
        return this;
    }
}
