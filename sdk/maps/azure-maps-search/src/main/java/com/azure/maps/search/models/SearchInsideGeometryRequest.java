// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Fluent;
import com.azure.maps.search.implementation.models.GeoJsonObject;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This type represents the request body for the Search Inside Geometry service. */
@Fluent
public final class SearchInsideGeometryRequest {
    /*
     * A valid `GeoJSON` object. Please refer to [RFC
     * 7946](https://tools.ietf.org/html/rfc7946#section-3) for details.
     */
    @JsonProperty(value = "geometry")
    private GeoJsonObject geometry;

    /**
     * Get the geometry property: A valid `GeoJSON` object. Please refer to [RFC
     * 7946](https://tools.ietf.org/html/rfc7946#section-3) for details.
     *
     * @return the geometry value.
     */
    public GeoJsonObject getGeometry() {
        return this.geometry;
    }

    /**
     * Set the geometry property: A valid `GeoJSON` object. Please refer to [RFC
     * 7946](https://tools.ietf.org/html/rfc7946#section-3) for details.
     *
     * @param geometry the geometry value to set.
     * @return the SearchInsideGeometryRequest object itself.
     */
    public SearchInsideGeometryRequest setGeometry(GeoJsonObject geometry) {
        this.geometry = geometry;
        return this;
    }
}
