// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This object is returned from a successful Spatial Closest Point call. */
@Fluent
public final class ClosestPointResponse {
    /*
     * Closest Point Summary object
     */
    @JsonProperty(value = "summary", access = JsonProperty.Access.WRITE_ONLY)
    private ClosestPointSummary summary;

    /*
     * Closest Point Result Array
     */
    @JsonProperty(value = "result")
    private List<ClosestPointResultEntry> result;

    /**
     * Get the summary property: Closest Point Summary object.
     *
     * @return the summary value.
     */
    public ClosestPointSummary getSummary() {
        return this.summary;
    }

    /**
     * Get the result property: Closest Point Result Array.
     *
     * @return the result value.
     */
    public List<ClosestPointResultEntry> getResult() {
        return this.result;
    }

    /**
     * Set the result property: Closest Point Result Array.
     *
     * @param result the result value to set.
     * @return the ClosestPointResponse object itself.
     */
    public ClosestPointResponse setResult(List<ClosestPointResultEntry> result) {
        this.result = result;
        return this;
    }
}
