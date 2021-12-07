// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SearchesGetFuzzySearchBatchHeaders model. */
@Fluent
public final class SearchesGetFuzzySearchBatchHeaders {
    /*
     * The Location property.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * Get the location property: The Location property.
     *
     * @return the location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The Location property.
     *
     * @param location the location value to set.
     * @return the SearchesGetFuzzySearchBatchHeaders object itself.
     */
    public SearchesGetFuzzySearchBatchHeaders setLocation(String location) {
        this.location = location;
        return this;
    }
}
