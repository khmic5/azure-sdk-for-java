// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Data contained by a `GeoJson MultiPoint`. */
@Fluent
public class GeoJsonMultiPointData {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GeoJsonMultiPointData.class);

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
    public List<List<Double>> coordinates() {
        return this.coordinates;
    }

    /**
     * Set the coordinates property: Coordinates for the `GeoJson MultiPoint` geometry.
     *
     * @param coordinates the coordinates value to set.
     * @return the GeoJsonMultiPointData object itself.
     */
    public GeoJsonMultiPointData withCoordinates(List<List<Double>> coordinates) {
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
                        "Missing required property coordinates in model GeoJsonMultiPointData"));
        }
    }
}
