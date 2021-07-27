// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GeoJsonFeatureData model. */
@Fluent
public class GeoJsonFeatureData {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GeoJsonFeatureData.class);

    /*
     * A valid `GeoJSON` geometry object. The type must be one of the seven
     * valid GeoJSON geometry types - Point, MultiPoint, LineString,
     * MultiLineString, Polygon, MultiPolygon and GeometryCollection. Please
     * refer to [RFC 7946](https://tools.ietf.org/html/rfc7946#section-3.1) for
     * details.
     */
    @JsonProperty(value = "geometry", required = true)
    private GeoJsonGeometry geometry;

    /*
     * Properties can contain any additional metadata about the `Feature`.
     * Value can be any JSON object or a JSON null value
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /*
     * Identifier for the feature.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The type of the feature. The value depends on the data model the current
     * feature is part of. Some data models may have an empty value.
     */
    @JsonProperty(value = "featureType")
    private String featureType;

    /**
     * Get the geometry property: A valid `GeoJSON` geometry object. The type must be one of the seven valid GeoJSON
     * geometry types - Point, MultiPoint, LineString, MultiLineString, Polygon, MultiPolygon and GeometryCollection.
     * Please refer to [RFC 7946](https://tools.ietf.org/html/rfc7946#section-3.1) for details.
     *
     * @return the geometry value.
     */
    public GeoJsonGeometry geometry() {
        return this.geometry;
    }

    /**
     * Set the geometry property: A valid `GeoJSON` geometry object. The type must be one of the seven valid GeoJSON
     * geometry types - Point, MultiPoint, LineString, MultiLineString, Polygon, MultiPolygon and GeometryCollection.
     * Please refer to [RFC 7946](https://tools.ietf.org/html/rfc7946#section-3.1) for details.
     *
     * @param geometry the geometry value to set.
     * @return the GeoJsonFeatureData object itself.
     */
    public GeoJsonFeatureData withGeometry(GeoJsonGeometry geometry) {
        this.geometry = geometry;
        return this;
    }

    /**
     * Get the properties property: Properties can contain any additional metadata about the `Feature`. Value can be any
     * JSON object or a JSON null value.
     *
     * @return the properties value.
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties can contain any additional metadata about the `Feature`. Value can be any
     * JSON object or a JSON null value.
     *
     * @param properties the properties value to set.
     * @return the GeoJsonFeatureData object itself.
     */
    public GeoJsonFeatureData withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the id property: Identifier for the feature.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Identifier for the feature.
     *
     * @param id the id value to set.
     * @return the GeoJsonFeatureData object itself.
     */
    public GeoJsonFeatureData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the featureType property: The type of the feature. The value depends on the data model the current feature is
     * part of. Some data models may have an empty value.
     *
     * @return the featureType value.
     */
    public String featureType() {
        return this.featureType;
    }

    /**
     * Set the featureType property: The type of the feature. The value depends on the data model the current feature is
     * part of. Some data models may have an empty value.
     *
     * @param featureType the featureType value to set.
     * @return the GeoJsonFeatureData object itself.
     */
    public GeoJsonFeatureData withFeatureType(String featureType) {
        this.featureType = featureType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (geometry() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property geometry in model GeoJsonFeatureData"));
        } else {
            geometry().validate();
        }
    }
}
