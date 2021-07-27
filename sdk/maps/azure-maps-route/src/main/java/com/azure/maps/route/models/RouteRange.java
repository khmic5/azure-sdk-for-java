// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Reachable Range. */
@Fluent
public final class RouteRange {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RouteRange.class);

    /*
     * Center point of the reachable range
     */
    @JsonProperty(value = "center")
    private CoordinatesPair center;

    /*
     * Polygon boundary of the reachable range represented as a list of points.
     */
    @JsonProperty(value = "boundary", access = JsonProperty.Access.WRITE_ONLY)
    private List<CoordinatesPair> boundary;

    /**
     * Get the center property: Center point of the reachable range.
     *
     * @return the center value.
     */
    public CoordinatesPair center() {
        return this.center;
    }

    /**
     * Set the center property: Center point of the reachable range.
     *
     * @param center the center value to set.
     * @return the RouteRange object itself.
     */
    public RouteRange withCenter(CoordinatesPair center) {
        this.center = center;
        return this;
    }

    /**
     * Get the boundary property: Polygon boundary of the reachable range represented as a list of points.
     *
     * @return the boundary value.
     */
    public List<CoordinatesPair> boundary() {
        return this.boundary;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (center() != null) {
            center().validate();
        }
        if (boundary() != null) {
            boundary().forEach(e -> e.validate());
        }
    }
}
