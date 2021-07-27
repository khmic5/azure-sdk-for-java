// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The CollectionInfo model. */
@Fluent
public final class CollectionInfo {
    /*
     * identifier of the collection used, for example, in URIs
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * human readable title of the collection
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * The ontology version of this dataset.
     */
    @JsonProperty(value = "ontology", access = JsonProperty.Access.WRITE_ONLY)
    private String ontology;

    /*
     * a description of the features in the collection
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Links to other WFS endpoints.
     */
    @JsonProperty(value = "links", required = true)
    private List<WfsEndpointLink> links;

    /**
     * Get the name property: identifier of the collection used, for example, in URIs.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: identifier of the collection used, for example, in URIs.
     *
     * @param name the name value to set.
     * @return the CollectionInfo object itself.
     */
    public CollectionInfo setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the title property: human readable title of the collection.
     *
     * @return the title value.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Set the title property: human readable title of the collection.
     *
     * @param title the title value to set.
     * @return the CollectionInfo object itself.
     */
    public CollectionInfo setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the ontology property: The ontology version of this dataset.
     *
     * @return the ontology value.
     */
    public String getOntology() {
        return this.ontology;
    }

    /**
     * Get the description property: a description of the features in the collection.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: a description of the features in the collection.
     *
     * @param description the description value to set.
     * @return the CollectionInfo object itself.
     */
    public CollectionInfo setDescription(String description) {
        this.description = description;
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
     * @return the CollectionInfo object itself.
     */
    public CollectionInfo setLinks(List<WfsEndpointLink> links) {
        this.links = links;
        return this;
    }
}
