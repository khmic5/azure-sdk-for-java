// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.common.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * A valid `GeoJSON FeatureCollection` object type. Please refer to [RFC
 * 7946](https://tools.ietf.org/html/rfc7946#section-3.3) for details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("FeatureCollection")
@Fluent
public final class GeoJsonFeatureCollection extends GeoJsonObject {
    /*
     * Contains a list of valid `GeoJSON Feature` objects.
     */
    @JsonProperty(value = "features", required = true)
    private List<GeoJsonFeature> features;

    /**
     * Get the features property: Contains a list of valid `GeoJSON Feature` objects.
     *
     * @return the features value.
     */
    public List<GeoJsonFeature> getFeatures() {
        return this.features;
    }

    /**
     * Set the features property: Contains a list of valid `GeoJSON Feature` objects.
     *
     * @param features the features value to set.
     * @return the GeoJsonFeatureCollection object itself.
     */
    public GeoJsonFeatureCollection setFeatures(List<GeoJsonFeature> features) {
        this.features = features;
        return this;
    }
}
