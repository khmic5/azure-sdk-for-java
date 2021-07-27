// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * A valid `GeoJSON Point` geometry type. Please refer to [RFC 7946](https://tools.ietf.org/html/rfc7946#section-3.1.2)
 * for details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Point")
@Fluent
public final class GeoJsonPoint extends GeoJsonGeometry {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GeoJsonPoint.class);

    /*
     * A `Position` is an array of numbers with two or more elements. The first
     * two elements are _longitude_ and _latitude_, precisely in that order.
     * _Altitude/Elevation_ is an optional third element. Please refer to [RFC
     * 7946](https://tools.ietf.org/html/rfc7946#section-3.1.1) for details.
     */
    @JsonProperty(value = "coordinates", required = true)
    private List<Double> coordinates;

    /**
     * Get the coordinates property: A `Position` is an array of numbers with two or more elements. The first two
     * elements are _longitude_ and _latitude_, precisely in that order. _Altitude/Elevation_ is an optional third
     * element. Please refer to [RFC 7946](https://tools.ietf.org/html/rfc7946#section-3.1.1) for details.
     *
     * @return the coordinates value.
     */
    public List<Double> coordinates() {
        return this.coordinates;
    }

    /**
     * Set the coordinates property: A `Position` is an array of numbers with two or more elements. The first two
     * elements are _longitude_ and _latitude_, precisely in that order. _Altitude/Elevation_ is an optional third
     * element. Please refer to [RFC 7946](https://tools.ietf.org/html/rfc7946#section-3.1.1) for details.
     *
     * @param coordinates the coordinates value to set.
     * @return the GeoJsonPoint object itself.
     */
    public GeoJsonPoint withCoordinates(List<Double> coordinates) {
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
                    new IllegalArgumentException("Missing required property coordinates in model GeoJsonPoint"));
        }
    }
}
