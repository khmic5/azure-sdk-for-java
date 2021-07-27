// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This object is returned from a successful Great Circle Distance call. */
@Immutable
public final class GreatCircleDistanceResponse {
    /*
     * Summary object
     */
    @JsonProperty(value = "summary", access = JsonProperty.Access.WRITE_ONLY)
    private GreatCircleDistanceResponseSummary summary;

    /*
     * Result Object
     */
    @JsonProperty(value = "result", access = JsonProperty.Access.WRITE_ONLY)
    private GreatCircleDistanceResponseResult result;

    /**
     * Get the summary property: Summary object.
     *
     * @return the summary value.
     */
    public GreatCircleDistanceResponseSummary getSummary() {
        return this.summary;
    }

    /**
     * Get the result property: Result Object.
     *
     * @return the result value.
     */
    public GreatCircleDistanceResponseResult getResult() {
        return this.result;
    }
}
