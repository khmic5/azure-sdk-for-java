// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.render.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RendersGetMapStaticImageHeaders model. */
@Fluent
public final class RendersGetMapStaticImageHeaders {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RendersGetMapStaticImageHeaders.class);

    /*
     * The Content-Type property.
     */
    @JsonProperty(value = "Content-Type")
    private String contentType;

    /**
     * Get the contentType property: The Content-Type property.
     *
     * @return the contentType value.
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The Content-Type property.
     *
     * @param contentType the contentType value to set.
     * @return the RendersGetMapStaticImageHeaders object itself.
     */
    public RendersGetMapStaticImageHeaders withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
