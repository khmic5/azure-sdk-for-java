// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An item returned from Batch API. Extend with 'response' property. */
@Immutable
public class BatchResultItem {
    /*
     * HTTP request status code.
     */
    @JsonProperty(value = "statusCode", access = JsonProperty.Access.WRITE_ONLY)
    private Integer statusCode;

    /**
     * Get the statusCode property: HTTP request status code.
     *
     * @return the statusCode value.
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }
}
