// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The GeoJsonMultiLineStringData model. */
@Fluent
public class GeoJsonMultiLineStringData {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GeoJsonMultiLineStringData.class);

    /*
     * Coordinates for the `GeoJson MultiLineString` geometry.
     */
    @JsonProperty(value = "coordinates", required = true)
    private List<List<List<Double>>> coordinates;

    /**
     * Get the coordinates property: Coordinates for the `GeoJson MultiLineString` geometry.
     *
     * @return the coordinates value.
     */
    public List<List<List<Double>>> coordinates() {
        return this.coordinates;
    }

    /**
     * Set the coordinates property: Coordinates for the `GeoJson MultiLineString` geometry.
     *
     * @param coordinates the coordinates value to set.
     * @return the GeoJsonMultiLineStringData object itself.
     */
    public GeoJsonMultiLineStringData withCoordinates(List<List<List<Double>>> coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (coordinates() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property coordinates in model GeoJsonMultiLineStringData"));
        }
    }
}
