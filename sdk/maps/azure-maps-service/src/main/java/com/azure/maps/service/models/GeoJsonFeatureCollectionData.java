// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The GeoJsonFeatureCollectionData model. */
@Fluent
public class GeoJsonFeatureCollectionData {
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
     * @return the GeoJsonFeatureCollectionData object itself.
     */
    public GeoJsonFeatureCollectionData setFeatures(List<GeoJsonFeature> features) {
        this.features = features;
        return this;
    }
}
