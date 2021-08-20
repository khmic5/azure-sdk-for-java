// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * A valid `GeoJSON MultiPoint` geometry type. Please refer to [RFC
 * 7946](https://tools.ietf.org/html/rfc7946#section-3.1.3) for details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("MultiPoint")
@Fluent
public final class GeoJsonMultiPoint extends GeoJsonGeometry {
    /*
     * Coordinates for the `GeoJson MultiPoint` geometry.
     */
    @JsonProperty(value = "coordinates", required = true)
    private List<List<Double>> coordinates;

    /**
     * Get the coordinates property: Coordinates for the `GeoJson MultiPoint` geometry.
     *
     * @return the coordinates value.
     */
    public List<List<Double>> getCoordinates() {
        return this.coordinates;
    }

    /**
     * Set the coordinates property: Coordinates for the `GeoJson MultiPoint` geometry.
     *
     * @param coordinates the coordinates value to set.
     * @return the GeoJsonMultiPoint object itself.
     */
    public GeoJsonMultiPoint setCoordinates(List<List<Double>> coordinates) {
        this.coordinates = coordinates;
        return this;
    }
}
