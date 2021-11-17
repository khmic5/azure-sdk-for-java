// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;
import com.azure.maps.search.implementation.models.Polygon;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This object is returned from a successful Search Polygon call. */
@Immutable
public final class PolygonResult {
    /*
     * Results array
     */
    @JsonProperty(value = "additionalData", access = JsonProperty.Access.WRITE_ONLY)
    private List<Polygon> polygons;

    /**
     * Get the polygons property: Results array.
     *
     * @return the polygons value.
     */
    public List<Polygon> getPolygons() {
        return this.polygons;
    }
}
