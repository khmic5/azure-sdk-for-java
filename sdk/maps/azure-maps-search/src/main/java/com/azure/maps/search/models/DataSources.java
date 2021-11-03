// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Optional section. Reference ids for use with the [Get Search
 * Polygon](https://docs.microsoft.com/rest/api/maps/search/getsearchpolygon) API.
 */
@Fluent
public final class DataSources {
    /*
     * Information about the geometric shape of the result. Only present if
     * type == Geography.
     */
    @JsonProperty(value = "geometry")
    private Geometry geometry;

    /**
     * Get the geometry property: Information about the geometric shape of the result. Only present if type ==
     * Geography.
     *
     * @return the geometry value.
     */
    public Geometry getGeometry() {
        return this.geometry;
    }

    /**
     * Set the geometry property: Information about the geometric shape of the result. Only present if type ==
     * Geography.
     *
     * @param geometry the geometry value to set.
     * @return the DataSources object itself.
     */
    public DataSources setGeometry(Geometry geometry) {
        this.geometry = geometry;
        return this;
    }
}
