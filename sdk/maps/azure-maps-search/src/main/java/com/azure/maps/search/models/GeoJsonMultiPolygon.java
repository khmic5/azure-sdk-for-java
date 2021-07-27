// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * A valid `GeoJSON MultiPolygon` object type. Please refer to [RFC
 * 7946](https://tools.ietf.org/html/rfc7946#section-3.1.7) for details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("MultiPolygon")
@Fluent
public final class GeoJsonMultiPolygon extends GeoJsonGeometry {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GeoJsonMultiPolygon.class);

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
     * @return the GeoJsonMultiPolygon object itself.
     */
    public GeoJsonMultiPolygon withCoordinates(List<List<List<List<Double>>>> coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (coordinates() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property coordinates in model GeoJsonMultiPolygon"));
        }
    }
}
