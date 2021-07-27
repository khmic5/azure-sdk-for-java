// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The elevation data. */
@Fluent
public final class PointElevationResult {
    /*
     * A location represented as a latitude and longitude.
     */
    @JsonProperty(value = "coordinate")
    private CoordinatesPair coordinate;

    /*
     * The elevation value in meters.
     */
    @JsonProperty(value = "elevationInMeter", access = JsonProperty.Access.WRITE_ONLY)
    private Float elevationInMeter;

    /**
     * Get the coordinate property: A location represented as a latitude and longitude.
     *
     * @return the coordinate value.
     */
    public CoordinatesPair getCoordinate() {
        return this.coordinate;
    }

    /**
     * Set the coordinate property: A location represented as a latitude and longitude.
     *
     * @param coordinate the coordinate value to set.
     * @return the PointElevationResult object itself.
     */
    public PointElevationResult setCoordinate(CoordinatesPair coordinate) {
        this.coordinate = coordinate;
        return this;
    }

    /**
     * Get the elevationInMeter property: The elevation value in meters.
     *
     * @return the elevationInMeter value.
     */
    public Float getElevationInMeter() {
        return this.elevationInMeter;
    }
}
