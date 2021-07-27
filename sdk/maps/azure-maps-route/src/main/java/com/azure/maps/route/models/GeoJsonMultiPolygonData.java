// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The GeoJsonMultiPolygonData model. */
@Fluent
public class GeoJsonMultiPolygonData {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GeoJsonMultiPolygonData.class);

    /*
     * Contains a list of valid `GeoJSON Polygon` objects. **Note** that
     * coordinates in GeoJSON are in x, y order (longitude, latitude).
     */
    @JsonProperty(value = "coordinates", required = true)
    private List<List<List<List<Double>>>> coordinates;

    /**
     * Get the coordinates property: Contains a list of valid `GeoJSON Polygon` objects. **Note** that coordinates in
     * GeoJSON are in x, y order (longitude, latitude).
     *
     * @return the coordinates value.
     */
    public List<List<List<List<Double>>>> coordinates() {
        return this.coordinates;
    }

    /**
     * Set the coordinates property: Contains a list of valid `GeoJSON Polygon` objects. **Note** that coordinates in
     * GeoJSON are in x, y order (longitude, latitude).
     *
     * @param coordinates the coordinates value to set.
     * @return the GeoJsonMultiPolygonData object itself.
     */
    public GeoJsonMultiPolygonData withCoordinates(List<List<List<List<Double>>>> coordinates) {
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
                        "Missing required property coordinates in model GeoJsonMultiPolygonData"));
        }
    }
}
