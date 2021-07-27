// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Data contained by a `GeoJson Point`. */
@Fluent
public class GeoJsonPointData {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GeoJsonPointData.class);

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
     * @return the GeoJsonPointData object itself.
     */
    public GeoJsonPointData withCoordinates(List<Double> coordinates) {
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
                    new IllegalArgumentException("Missing required property coordinates in model GeoJsonPointData"));
        }
    }
}
