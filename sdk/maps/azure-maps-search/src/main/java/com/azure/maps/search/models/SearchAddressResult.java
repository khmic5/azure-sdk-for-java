// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;
import com.azure.maps.search.implementation.models.SearchAddressResultItem;
import com.azure.maps.search.implementation.models.SearchSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This object is returned from a successful Search calls. */
@Immutable
public class SearchAddressResult {
    /*
     * Summary object for a Search API response
     */
    @JsonProperty(value = "summary", access = JsonProperty.Access.WRITE_ONLY)
    private SearchSummary summary;

    /*
     * A list of Search API results.
     */
    @JsonProperty(value = "results", access = JsonProperty.Access.WRITE_ONLY)
    private List<SearchAddressResultItem> results;

    /**
     * Get the summary property: Summary object for a Search API response.
     *
     * @return the summary value.
     */
    public SearchSummary getSummary() {
        return this.summary;
    }

    /**
     * Get the results property: A list of Search API results.
     *
     * @return the results value.
     */
    public List<SearchAddressResultItem> getResults() {
        return this.results;
    }
}
