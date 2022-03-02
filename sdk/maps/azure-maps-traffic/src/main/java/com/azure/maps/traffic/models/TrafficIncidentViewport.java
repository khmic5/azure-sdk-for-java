// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.traffic.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This object is returned from a successful Traffic Incident Viewport call. */
@Immutable
public final class TrafficIncidentViewport {
    /*
     * Viewport Response object
     */
    @JsonProperty(value = "viewpResp", access = JsonProperty.Access.WRITE_ONLY)
    private TrafficIncidentViewportViewpResp viewpResp;

    /**
     * Get the viewpResp property: Viewport Response object.
     *
     * @return the viewpResp value.
     */
    public TrafficIncidentViewportViewpResp getViewpResp() {
        return this.viewpResp;
    }
}
