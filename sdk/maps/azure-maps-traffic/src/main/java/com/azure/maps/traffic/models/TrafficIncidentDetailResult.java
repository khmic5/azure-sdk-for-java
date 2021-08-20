// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.traffic.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This object is returned from a successful Traffic incident Detail call. */
@Immutable
public final class TrafficIncidentDetailResult {
    /*
     * Main response element
     */
    @JsonProperty(value = "tm", access = JsonProperty.Access.WRITE_ONLY)
    private TrafficIncidentDetailResultTm tm;

    /**
     * Get the tm property: Main response element.
     *
     * @return the tm value.
     */
    public TrafficIncidentDetailResultTm getTm() {
        return this.tm;
    }
}
