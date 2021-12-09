// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.

package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;
import com.azure.maps.search.implementation.models.SearchSummary;

import java.util.ArrayList;
import java.util.List;

/** This object is returned from a successful Search calls. */
@Immutable
public class SearchAddressResult {

    /*
     * Internal model
     */
    private com.azure.maps.search.implementation.models.SearchAddressResult internalModel = null;

    /*
     * A list of Search API results.
     */
    private List<SearchAddressResultItem> results;

    /**
     * Constructor
     */
    public SearchAddressResult(com.azure.maps.search.implementation.models.SearchAddressResult internalModel) {
        this.internalModel = internalModel;

        // configure results to replace SearchAddressResultItem with the proper model
        // this is a heavy operation so it will be done here and cached.
        this.results = new ArrayList<>(this.internalModel.getResults().size());

        for (com.azure.maps.search.implementation.models.SearchAddressResultItem item :
            this.internalModel.getResults()) {
            this.results.add(new SearchAddressResultItem(item));
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
