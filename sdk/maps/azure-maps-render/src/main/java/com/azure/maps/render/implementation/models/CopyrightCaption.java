// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.render.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This object is returned from a successful copyright call. */
@Immutable
public final class CopyrightCaption {
    /*
     * Format Version property
     */
    @JsonProperty(value = "formatVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String formatVersion;

    /*
     * Copyrights Caption property
     */
    @JsonProperty(value = "copyrightsCaption", access = JsonProperty.Access.WRITE_ONLY)
    private String copyrightsCaption;

    /**
     * Get the formatVersion property: Format Version property.
     *
     * @return the formatVersion value.
     */
    public String getFormatVersion() {
        return this.formatVersion;
    }

    /**
     * Get the copyrightsCaption property: Copyrights Caption property.
     *
     * @return the copyrightsCaption value.
     */
    public String getCopyrightsCaption() {
        return this.copyrightsCaption;
    }
}
