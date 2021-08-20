// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Summary of the call. */
@Immutable
public final class BufferResponseSummary {
    /*
     * The udid for the user data if one exists
     */
    @JsonProperty(value = "udid", access = JsonProperty.Access.WRITE_ONLY)
    private String udid;

    /*
     * The information about what happened during the call.
     */
    @JsonProperty(value = "information", access = JsonProperty.Access.WRITE_ONLY)
    private String information;

    /**
     * Get the udid property: The udid for the user data if one exists.
     *
     * @return the udid value.
     */
    public String getUdid() {
        return this.udid;
    }

    /**
     * Get the information property: The information about what happened during the call.
     *
     * @return the information value.
     */
    public String getInformation() {
        return this.information;
    }
}
