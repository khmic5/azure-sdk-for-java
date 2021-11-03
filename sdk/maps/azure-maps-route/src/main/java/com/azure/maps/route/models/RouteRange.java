// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Reachable Range. */
@Fluent
public final class RouteRange {
    /*
     * Center point of the reachable range
     */
    @JsonProperty(value = "center")
    private LatLongPair center;

    /*
     * Polygon boundary of the reachable range represented as a list of points.
     */
    @JsonProperty(value = "boundary", access = JsonProperty.Access.WRITE_ONLY)
    private List<LatLongPair> boundary;

    /**
     * Get the center property: Center point of the reachable range.
     *
     * @return the center value.
     */
    public LatLongPair getCenter() {
        return this.center;
    }

    /**
     * Set the center property: Center point of the reachable range.
     *
     * @param center the center value to set.
     * @return the RouteRange object itself.
     */
    public RouteRange setCenter(LatLongPair center) {
        this.center = center;
        return this;
    }

    /**
     * Get the boundary property: Polygon boundary of the reachable range represented as a list of points.
     *
     * @return the boundary value.
     */
    public List<LatLongPair> getBoundary() {
        return this.boundary;
    }
}
