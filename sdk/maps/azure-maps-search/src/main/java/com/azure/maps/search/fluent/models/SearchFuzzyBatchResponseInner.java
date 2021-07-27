// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.maps.search.models.BatchResponse;
import com.azure.maps.search.models.SearchFuzzyBatchItem;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This object is returned from a successful Search Fuzzy Batch service call. */
@Immutable
public final class SearchFuzzyBatchResponseInner extends BatchResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SearchFuzzyBatchResponseInner.class);

    /*
     * Array containing the batch results.
     */
    @JsonProperty(value = "batchItems", access = JsonProperty.Access.WRITE_ONLY)
    private List<SearchFuzzyBatchItem> batchItems;

    /**
     * Get the batchItems property: Array containing the batch results.
     *
     * @return the batchItems value.
     */
    public List<SearchFuzzyBatchItem> batchItems() {
        return this.batchItems;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (batchItems() != null) {
            batchItems().forEach(e -> e.validate());
        }
    }
}
