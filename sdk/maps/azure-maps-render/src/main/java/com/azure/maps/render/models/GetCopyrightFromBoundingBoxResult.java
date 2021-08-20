// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.render.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This object is returned from a successful Get Copyright From Bounding Box call. */
@Immutable
public final class GetCopyrightFromBoundingBoxResult {
    /*
     * Format Version property
     */
    @JsonProperty(value = "formatVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String formatVersion;

    /*
     * General Copyrights array
     */
    @JsonProperty(value = "generalCopyrights", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> generalCopyrights;

    /*
     * Regions array
     */
    @JsonProperty(value = "regions", access = JsonProperty.Access.WRITE_ONLY)
    private List<RegionCopyrights> regions;

    /**
     * Get the formatVersion property: Format Version property.
     *
     * @return the formatVersion value.
     */
    public String getFormatVersion() {
        return this.formatVersion;
    }

    /**
     * Get the generalCopyrights property: General Copyrights array.
     *
     * @return the generalCopyrights value.
     */
    public List<String> getGeneralCopyrights() {
        return this.generalCopyrights;
    }

    /**
     * Get the regions property: Regions array.
     *
     * @return the regions value.
     */
    public List<RegionCopyrights> getRegions() {
        return this.regions;
    }
}
