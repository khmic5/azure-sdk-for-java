// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.traffic.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.maps.traffic.models.TrafficIncidentViewportResultViewpResp;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This object is returned from a successful Traffic Incident Viewport call. */
@Immutable
public final class TrafficIncidentViewportResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TrafficIncidentViewportResultInner.class);

    /*
     * Viewport Response object
     */
    @JsonProperty(value = "viewpResp", access = JsonProperty.Access.WRITE_ONLY)
    private TrafficIncidentViewportResultViewpResp viewpResp;

    /**
     * Get the viewpResp property: Viewport Response object.
     *
     * @return the viewpResp value.
     */
    public TrafficIncidentViewportResultViewpResp viewpResp() {
        return this.viewpResp;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (viewpResp() != null) {
            viewpResp().validate();
        }
    }
}
