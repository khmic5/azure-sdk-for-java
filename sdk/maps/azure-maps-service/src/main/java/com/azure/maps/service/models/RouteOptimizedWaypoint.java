// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Optimized way point object. */
@Immutable
public final class RouteOptimizedWaypoint {
    /*
     * Way point index provided by the user.
     */
    @JsonProperty(value = "providedIndex", access = JsonProperty.Access.WRITE_ONLY)
    private Integer providedIndex;

    /*
     * Optimized way point index from the system.
     */
    @JsonProperty(value = "optimizedIndex", access = JsonProperty.Access.WRITE_ONLY)
    private Integer optimizedIndex;

    /**
     * Get the providedIndex property: Way point index provided by the user.
     *
     * @return the providedIndex value.
     */
    public Integer getProvidedIndex() {
        return this.providedIndex;
    }

    /**
     * Get the optimizedIndex property: Optimized way point index from the system.
     *
     * @return the optimizedIndex value.
     */
    public Integer getOptimizedIndex() {
        return this.optimizedIndex;
    }
}
