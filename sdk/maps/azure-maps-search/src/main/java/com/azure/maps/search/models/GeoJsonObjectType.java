// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for GeoJsonObjectType. */
public final class GeoJsonObjectType extends ExpandableStringEnum<GeoJsonObjectType> {
    /** Static value Point for GeoJsonObjectType. */
    public static final GeoJsonObjectType GEO_JSON_POINT = fromString("Point");

    /** Static value MultiPoint for GeoJsonObjectType. */
    public static final GeoJsonObjectType GEO_JSON_MULTI_POINT = fromString("MultiPoint");

    /** Static value LineString for GeoJsonObjectType. */
    public static final GeoJsonObjectType GEO_JSON_LINE_STRING = fromString("LineString");

    /** Static value MultiLineString for GeoJsonObjectType. */
    public static final GeoJsonObjectType GEO_JSON_MULTI_LINE_STRING = fromString("MultiLineString");

    /** Static value Polygon for GeoJsonObjectType. */
    public static final GeoJsonObjectType GEO_JSON_POLYGON = fromString("Polygon");

    /** Static value MultiPolygon for GeoJsonObjectType. */
    public static final GeoJsonObjectType GEO_JSON_MULTI_POLYGON = fromString("MultiPolygon");

    /** Static value GeometryCollection for GeoJsonObjectType. */
    public static final GeoJsonObjectType GEO_JSON_GEOMETRY_COLLECTION = fromString("GeometryCollection");

    /** Static value Feature for GeoJsonObjectType. */
    public static final GeoJsonObjectType GEO_JSON_FEATURE = fromString("Feature");

    /** Static value FeatureCollection for GeoJsonObjectType. */
    public static final GeoJsonObjectType GEO_JSON_FEATURE_COLLECTION = fromString("FeatureCollection");

    /**
     * Creates or finds a GeoJsonObjectType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GeoJsonObjectType.
     */
    @JsonCreator
    public static GeoJsonObjectType fromString(String name) {
        return fromString(name, GeoJsonObjectType.class);
    }

    /** @return known GeoJsonObjectType values. */
    public static Collection<GeoJsonObjectType> values() {
        return values(GeoJsonObjectType.class);
    }
}
