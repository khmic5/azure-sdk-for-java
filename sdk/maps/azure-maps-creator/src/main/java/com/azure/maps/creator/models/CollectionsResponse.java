// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The CollectionsResponse model. */
@Fluent
public final class CollectionsResponse {
    /*
     * The ontology version of this dataset.
     */
    @JsonProperty(value = "ontology", access = JsonProperty.Access.WRITE_ONLY)
    private String ontology;

    /*
     * Links to other WFS endpoints.
     */
    @JsonProperty(value = "links", required = true)
    private List<WfsEndpointLink> links;

    /*
     * All the collections in a given dataset.
     */
    @JsonProperty(value = "collections", required = true)
    private List<CollectionInfo> collections;

    /**
     * Get the ontology property: The ontology version of this dataset.
     *
     * @return the ontology value.
     */
    public String getOntology() {
        return this.ontology;
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
     * @return the CollectionsResponse object itself.
     */
    public CollectionsResponse setLinks(List<WfsEndpointLink> links) {
        this.links = links;
        return this;
    }

    /**
     * Get the collections property: All the collections in a given dataset.
     *
     * @return the collections value.
     */
    public List<CollectionInfo> getCollections() {
        return this.collections;
    }

    /**
     * Set the collections property: All the collections in a given dataset.
     *
     * @param collections the collections value to set.
     * @return the CollectionsResponse object itself.
     */
    public CollectionsResponse setCollections(List<CollectionInfo> collections) {
        this.collections = collections;
        return this;
    }
}
