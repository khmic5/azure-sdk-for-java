// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An object with a matrix of coordinates. */
@Fluent
public final class PostRouteMatrixRequestBody {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PostRouteMatrixRequestBody.class);

    /*
     * A valid `GeoJSON MultiPoint` geometry type. Please refer to [RFC
     * 7946](https://tools.ietf.org/html/rfc7946#section-3.1.3) for details.
     */
    @JsonProperty(value = "origins")
    private GeoJsonMultiPoint origins;

    /*
     * A valid `GeoJSON MultiPoint` geometry type. Please refer to [RFC
     * 7946](https://tools.ietf.org/html/rfc7946#section-3.1.3) for details.
     */
    @JsonProperty(value = "destinations")
    private GeoJsonMultiPoint destinations;

    /**
     * Get the origins property: A valid `GeoJSON MultiPoint` geometry type. Please refer to [RFC
     * 7946](https://tools.ietf.org/html/rfc7946#section-3.1.3) for details.
     *
     * @return the origins value.
     */
    public GeoJsonMultiPoint origins() {
        return this.origins;
    }

    /**
     * Set the origins property: A valid `GeoJSON MultiPoint` geometry type. Please refer to [RFC
     * 7946](https://tools.ietf.org/html/rfc7946#section-3.1.3) for details.
     *
     * @param origins the origins value to set.
     * @return the PostRouteMatrixRequestBody object itself.
     */
    public PostRouteMatrixRequestBody withOrigins(GeoJsonMultiPoint origins) {
        this.origins = origins;
        return this;
    }

    /**
     * Get the destinations property: A valid `GeoJSON MultiPoint` geometry type. Please refer to [RFC
     * 7946](https://tools.ietf.org/html/rfc7946#section-3.1.3) for details.
     *
     * @return the destinations value.
     */
    public GeoJsonMultiPoint destinations() {
        return this.destinations;
    }

    /**
     * Set the destinations property: A valid `GeoJSON MultiPoint` geometry type. Please refer to [RFC
     * 7946](https://tools.ietf.org/html/rfc7946#section-3.1.3) for details.
     *
     * @param destinations the destinations value to set.
     * @return the PostRouteMatrixRequestBody object itself.
     */
    public PostRouteMatrixRequestBody withDestinations(GeoJsonMultiPoint destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (origins() != null) {
            origins().validate();
        }
        if (destinations() != null) {
            destinations().validate();
        }
    }
}
