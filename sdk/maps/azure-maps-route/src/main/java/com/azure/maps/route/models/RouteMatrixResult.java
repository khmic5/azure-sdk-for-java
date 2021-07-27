// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Matrix result object. */
@Immutable
public final class RouteMatrixResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RouteMatrixResult.class);

    /*
     * StatusCode property for the current cell in the input matrix.
     */
    @JsonProperty(value = "statusCode", access = JsonProperty.Access.WRITE_ONLY)
    private Integer statusCode;

    /*
     * Response object of the current cell in the input matrix.
     */
    @JsonProperty(value = "response", access = JsonProperty.Access.WRITE_ONLY)
    private RouteMatrixResultResponse response;

    /**
     * Get the statusCode property: StatusCode property for the current cell in the input matrix.
     *
     * @return the statusCode value.
     */
    public Integer statusCode() {
        return this.statusCode;
    }

    /**
     * Get the response property: Response object of the current cell in the input matrix.
     *
     * @return the response value.
     */
    public RouteMatrixResultResponse response() {
        return this.response;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (response() != null) {
            response().validate();
        }
    }
}
