// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Returns true if point is within the polygon, false otherwise. */
@Fluent
public final class PointInPolygonResult {
    /*
     * Point In Polygon Summary object
     */
    @JsonProperty(value = "summary", access = JsonProperty.Access.WRITE_ONLY)
    private PointInPolygonSummary summary;

    /*
     * Point In Polygon Result Object
     */
    @JsonProperty(value = "result")
    private PointInPolygonResultAutoGenerated result;

    /**
     * Get the summary property: Point In Polygon Summary object.
     *
     * @return the summary value.
     */
    public PointInPolygonSummary getSummary() {
        return this.summary;
    }

    /**
     * Get the result property: Point In Polygon Result Object.
     *
     * @return the result value.
     */
    public PointInPolygonResultAutoGenerated getResult() {
        return this.result;
    }

    /**
     * Set the result property: Point In Polygon Result Object.
     *
     * @param result the result value to set.
     * @return the PointInPolygonResult object itself.
     */
    public PointInPolygonResult setResult(PointInPolygonResultAutoGenerated result) {
        this.result = result;
        return this;
    }
}
