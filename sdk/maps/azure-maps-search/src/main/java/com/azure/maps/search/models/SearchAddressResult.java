// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.

package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;
import com.azure.maps.search.models.SearchSummary;

import java.util.List;
import java.util.stream.Collectors;

/** This object is returned from a successful Search calls. */
@Immutable
public final class SearchAddressResult {

    /*
     * Internal model
     */
    private com.azure.maps.search.implementation.models.SearchAddressResult internalModel = null;

    /*
     * A list of Search API results.
     */
    private List<SearchAddressResultItem> results = null;

    /**
     * Constructor
     */
    public SearchAddressResult(com.azure.maps.search.implementation.models.SearchAddressResult internalModel) {
        this.internalModel = internalModel;

        // configure results to replace SearchAddressResultItem with the proper model
        // this is a heavy operation so it will be done here and cached.
        if (this.internalModel != null && this.internalModel.getResults() != null) {
            this.results = this.internalModel.getResults().stream().map(item -> new SearchAddressResultItem(item))
                .collect(Collectors.toList());
        }
    }

    /**
     * Get the summary property: Summary object for a Search API response.
     *
     * @return the summary value.
     */
    public SearchSummary getSummary() {
        return this.internalModel.getSummary();
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
