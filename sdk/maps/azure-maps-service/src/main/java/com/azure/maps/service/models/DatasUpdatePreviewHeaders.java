// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DatasUpdatePreviewHeaders model. */
@Fluent
public final class DatasUpdatePreviewHeaders {
    /*
     * The Operation-Location property.
     */
    @JsonProperty(value = "Operation-Location")
    private String operationLocation;

    /*
     * The Resource-Location property.
     */
    @JsonProperty(value = "Resource-Location")
    private String resourceLocation;

    /**
     * Get the operationLocation property: The Operation-Location property.
     *
     * @return the operationLocation value.
     */
    public String getOperationLocation() {
        return this.operationLocation;
    }

    /**
     * Set the operationLocation property: The Operation-Location property.
     *
     * @param operationLocation the operationLocation value to set.
     * @return the DatasUpdatePreviewHeaders object itself.
     */
    public DatasUpdatePreviewHeaders setOperationLocation(String operationLocation) {
        this.operationLocation = operationLocation;
        return this;
    }

    /**
     * Get the resourceLocation property: The Resource-Location property.
     *
     * @return the resourceLocation value.
     */
    public String getResourceLocation() {
        return this.resourceLocation;
    }

    /**
     * Set the resourceLocation property: The Resource-Location property.
     *
     * @param resourceLocation the resourceLocation value to set.
     * @return the DatasUpdatePreviewHeaders object itself.
     */
    public DatasUpdatePreviewHeaders setResourceLocation(String resourceLocation) {
        this.resourceLocation = resourceLocation;
        return this;
    }
}
