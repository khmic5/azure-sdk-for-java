// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This type represents the request body for the Search Along Route service. */
@Fluent
public final class SearchAlongRouteRequestBody {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SearchAlongRouteRequestBody.class);

    /*
     * A valid `GeoJSON LineString` geometry type. Please refer to [RFC
     * 7946](https://tools.ietf.org/html/rfc7946#section-3.1.4) for details.
     */
    @JsonProperty(value = "route")
    private GeoJsonLineString route;

    /**
     * Get the route property: A valid `GeoJSON LineString` geometry type. Please refer to [RFC
     * 7946](https://tools.ietf.org/html/rfc7946#section-3.1.4) for details.
     *
     * @return the route value.
     */
    public GeoJsonLineString route() {
        return this.route;
    }

    /**
     * Set the route property: A valid `GeoJSON LineString` geometry type. Please refer to [RFC
     * 7946](https://tools.ietf.org/html/rfc7946#section-3.1.4) for details.
     *
     * @param route the route value to set.
     * @return the SearchAlongRouteRequestBody object itself.
     */
    public SearchAlongRouteRequestBody withRoute(GeoJsonLineString route) {
        this.route = route;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (route() != null) {
            route().validate();
        }
    }
}
