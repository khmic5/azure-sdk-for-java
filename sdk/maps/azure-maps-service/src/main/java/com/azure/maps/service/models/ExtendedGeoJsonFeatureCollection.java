// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * A valid `GeoJSON FeatureCollection` object type extended with numberReturned and links array. Please refer to [RFC
 * 7946](https://tools.ietf.org/html/rfc7946#section-3.3) for details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("FeatureCollection")
@Fluent
public final class ExtendedGeoJsonFeatureCollection extends GeoJsonFeatureCollection {
    /*
     * The ontology version of this dataset.
     */
    @JsonProperty(value = "ontology", access = JsonProperty.Access.WRITE_ONLY)
    private String ontology;

    /*
     * Number of returned features.
     */
    @JsonProperty(value = "numberReturned")
    private Integer numberReturned;

    /*
     * Links to other WFS endpoints.
     */
    @JsonProperty(value = "links")
    private List<WfsEndpointLink> links;

    /**
     * Get the ontology property: The ontology version of this dataset.
     *
     * @return the ontology value.
     */
    public String getOntology() {
        return this.ontology;
    }

    /**
     * Get the numberReturned property: Number of returned features.
     *
     * @return the numberReturned value.
     */
    public Integer getNumberReturned() {
        return this.numberReturned;
    }

    /**
     * Set the numberReturned property: Number of returned features.
     *
     * @param numberReturned the numberReturned value to set.
     * @return the ExtendedGeoJsonFeatureCollection object itself.
     */
    public ExtendedGeoJsonFeatureCollection setNumberReturned(Integer numberReturned) {
        this.numberReturned = numberReturned;
        return this;
    }

    /**
     * Get the links property: Links to other WFS endpoints.
     *
     * @return the links value.
     */
    public List<WfsEndpointLink> getLinks() {
        return this.links;
    }

    /**
     * Set the links property: Links to other WFS endpoints.
     *
     * @param links the links value to set.
     * @return the ExtendedGeoJsonFeatureCollection object itself.
     */
    public ExtendedGeoJsonFeatureCollection setLinks(List<WfsEndpointLink> links) {
        this.links = links;
        return this;
    }
}
