// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.implementation;

import com.azure.maps.creator.fluent.models.ExtendedGeoJsonFeatureCollectionInner;
import com.azure.maps.creator.models.ExtendedGeoJsonFeatureCollection;
import com.azure.maps.creator.models.GeoJsonFeature;
import com.azure.maps.creator.models.WfsEndpointLink;
import java.util.Collections;
import java.util.List;

public final class ExtendedGeoJsonFeatureCollectionImpl implements ExtendedGeoJsonFeatureCollection {
    private ExtendedGeoJsonFeatureCollectionInner innerObject;

    private final com.azure.maps.creator.CreatorManager serviceManager;

    ExtendedGeoJsonFeatureCollectionImpl(
        ExtendedGeoJsonFeatureCollectionInner innerObject, com.azure.maps.creator.CreatorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<GeoJsonFeature> features() {
        List<GeoJsonFeature> inner = this.innerModel().features();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String ontology() {
        return this.innerModel().ontology();
    }

    public Integer numberReturned() {
        return this.innerModel().numberReturned();
    }

    public List<WfsEndpointLink> links() {
        List<WfsEndpointLink> inner = this.innerModel().links();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ExtendedGeoJsonFeatureCollectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.maps.creator.CreatorManager manager() {
        return this.serviceManager;
    }
}
