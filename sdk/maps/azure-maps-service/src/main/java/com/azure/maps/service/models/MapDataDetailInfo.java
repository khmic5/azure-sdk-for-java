// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Detail information for the data. */
@Immutable
public final class MapDataDetailInfo {
    /*
     * The unique data id for the data.
     */
    @JsonProperty(value = "udid", access = JsonProperty.Access.WRITE_ONLY)
    private String udid;

    /*
     * The location of the data. Execute a HTTP `GET` on this location to
     * download the data.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * The size of the content in bytes.
     */
    @JsonProperty(value = "sizeInBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long sizeInBytes;

    /*
     * The current upload status of the content.
     */
    @JsonProperty(value = "uploadStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String uploadStatus;

    /*
     * The current data format.
     */
    @JsonProperty(value = "dataFormat", access = JsonProperty.Access.WRITE_ONLY)
    private String dataFormat;

    /*
     * The current description.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Get the udid property: The unique data id for the data.
     *
     * @return the udid value.
     */
    public String getUdid() {
        return this.udid;
    }

    /**
     * Get the location property: The location of the data. Execute a HTTP `GET` on this location to download the data.
     *
     * @return the location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Get the sizeInBytes property: The size of the content in bytes.
     *
     * @return the sizeInBytes value.
     */
    public Long getSizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Get the uploadStatus property: The current upload status of the content.
     *
     * @return the uploadStatus value.
     */
    public String getUploadStatus() {
        return this.uploadStatus;
    }

    /**
     * Get the dataFormat property: The current data format.
     *
     * @return the dataFormat value.
     */
    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * Get the description property: The current description.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }
}
