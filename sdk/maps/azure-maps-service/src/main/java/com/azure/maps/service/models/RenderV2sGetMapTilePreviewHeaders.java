// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RenderV2sGetMapTilePreviewHeaders model. */
@Fluent
public final class RenderV2sGetMapTilePreviewHeaders {
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
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The Content-Type property.
     *
     * @param contentType the contentType value to set.
     * @return the RenderV2sGetMapTilePreviewHeaders object itself.
     */
    public RenderV2sGetMapTilePreviewHeaders setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
}
