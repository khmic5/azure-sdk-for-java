// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The GeoJsonPolygonData model. */
@Fluent
public class GeoJsonPolygonData {
    /*
     * Coordinates for the `GeoJson Polygon` geometry type.
     */
    @JsonProperty(value = "coordinates", required = true)
    private List<List<List<Double>>> coordinates;

    /**
     * Get the coordinates property: Coordinates for the `GeoJson Polygon` geometry type.
     *
     * @return the coordinates value.
     */
    public List<List<List<Double>>> getCoordinates() {
        return this.coordinates;
    }

    /**
     * Set the coordinates property: Coordinates for the `GeoJson Polygon` geometry type.
     *
     * @param coordinates the coordinates value to set.
     * @return the GeoJsonPolygonData object itself.
     */
    public GeoJsonPolygonData setCoordinates(List<List<List<Double>>> coordinates) {
        this.coordinates = coordinates;
        return this;
    }
}
