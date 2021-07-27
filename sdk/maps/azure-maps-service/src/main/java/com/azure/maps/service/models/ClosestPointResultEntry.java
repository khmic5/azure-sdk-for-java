// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Closest Point Result Entry Object. */
@Fluent
public final class ClosestPointResultEntry {
    /*
     * The distance in meters from the source point to the closest point
     */
    @JsonProperty(value = "distanceInMeters", access = JsonProperty.Access.WRITE_ONLY)
    private Float distanceInMeters;

    /*
     * A location represented as a latitude and longitude
     */
    @JsonProperty(value = "position")
    private SpatialCoordinate position;

    /*
     * The unique id identifies a geometry
     */
    @JsonProperty(value = "geometryId", access = JsonProperty.Access.WRITE_ONLY)
    private String geometryId;

    /**
     * Get the distanceInMeters property: The distance in meters from the source point to the closest point.
     *
     * @return the distanceInMeters value.
     */
    public Float getDistanceInMeters() {
        return this.distanceInMeters;
    }

    /**
     * Get the position property: A location represented as a latitude and longitude.
     *
     * @return the position value.
     */
    public SpatialCoordinate getPosition() {
        return this.position;
    }

    /**
     * Set the position property: A location represented as a latitude and longitude.
     *
     * @param position the position value to set.
     * @return the ClosestPointResultEntry object itself.
     */
    public ClosestPointResultEntry setPosition(SpatialCoordinate position) {
        this.position = position;
        return this;
    }

    /**
     * Get the geometryId property: The unique id identifies a geometry.
     *
     * @return the geometryId value.
     */
    public String getGeometryId() {
        return this.geometryId;
    }
}
