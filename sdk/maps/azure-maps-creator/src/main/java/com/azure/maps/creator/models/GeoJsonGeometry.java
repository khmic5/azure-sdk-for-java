// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A valid `GeoJSON` geometry object. The type must be one of the seven valid GeoJSON geometry types - Point,
 * MultiPoint, LineString, MultiLineString, Polygon, MultiPolygon and GeometryCollection. Please refer to [RFC
 * 7946](https://tools.ietf.org/html/rfc7946#section-3.1) for details.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = GeoJsonGeometry.class)
@JsonTypeName("GeoJsonGeometry")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Point", value = GeoJsonPoint.class),
    @JsonSubTypes.Type(name = "MultiPoint", value = GeoJsonMultiPoint.class),
    @JsonSubTypes.Type(name = "LineString", value = GeoJsonLineString.class),
    @JsonSubTypes.Type(name = "MultiLineString", value = GeoJsonMultiLineString.class),
    @JsonSubTypes.Type(name = "Polygon", value = GeoJsonPolygon.class),
    @JsonSubTypes.Type(name = "MultiPolygon", value = GeoJsonMultiPolygon.class),
    @JsonSubTypes.Type(name = "GeometryCollection", value = GeoJsonGeometryCollection.class)
})
@Immutable
public class GeoJsonGeometry extends GeoJsonObject {}
