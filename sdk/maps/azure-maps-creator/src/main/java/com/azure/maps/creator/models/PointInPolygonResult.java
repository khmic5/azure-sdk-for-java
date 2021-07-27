// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Point In Polygon Result Object. */
@Immutable
public final class PointInPolygonResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PointInPolygonResult.class);

    /*
     * Point In Polygons Property
     */
    @JsonProperty(value = "pointInPolygons", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean pointInPolygons;

    /*
     * Geometries array
     */
    @JsonProperty(value = "intersectingGeometries", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> intersectingGeometries;

    /**
     * Get the pointInPolygons property: Point In Polygons Property.
     *
     * @return the pointInPolygons value.
     */
    public Boolean pointInPolygons() {
        return this.pointInPolygons;
    }

    /**
     * Get the intersectingGeometries property: Geometries array.
     *
     * @return the intersectingGeometries value.
     */
    public List<String> intersectingGeometries() {
        return this.intersectingGeometries;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
