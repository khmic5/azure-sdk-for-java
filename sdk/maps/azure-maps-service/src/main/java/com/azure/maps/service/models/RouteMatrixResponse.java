// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * This object is returned from a successful Route Matrix call. For ex, if 2 origins and 3 destinations are provided,
 * there are going to 2 arrays with 3 elements in each. Each element's content depends on the options provided in the
 * query.
 */
@Immutable
public final class RouteMatrixResponse {
    /*
     * Format Version property
     */
    @JsonProperty(value = "formatVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String formatVersion;

    /*
     * Results as a 2 dimensional array of route summaries.
     */
    @JsonProperty(value = "matrix", access = JsonProperty.Access.WRITE_ONLY)
    private List<List<RouteMatrixResult>> matrix;

    /*
     * Summary object
     */
    @JsonProperty(value = "summary", access = JsonProperty.Access.WRITE_ONLY)
    private RouteMatrixSummary summary;

    /**
     * Get the formatVersion property: Format Version property.
     *
     * @return the formatVersion value.
     */
    public String getFormatVersion() {
        return this.formatVersion;
    }

    /**
     * Get the matrix property: Results as a 2 dimensional array of route summaries.
     *
     * @return the matrix value.
     */
    public List<List<RouteMatrixResult>> getMatrix() {
        return this.matrix;
    }

    /**
     * Get the summary property: Summary object.
     *
     * @return the summary value.
     */
    public RouteMatrixSummary getSummary() {
        return this.summary;
    }
}
