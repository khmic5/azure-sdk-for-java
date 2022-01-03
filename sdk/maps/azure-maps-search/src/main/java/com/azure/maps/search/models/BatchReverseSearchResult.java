// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;
import java.util.List;

/** This object is returned from a successful Search Address Batch service call. */
@Immutable
public final class BatchReverseSearchResult {
    private BatchResultSummary batchSummary;
    private List<ReverseSearchAddressBatchItem> batchItems;

    public BatchReverseSearchResult() {

    }

    /**
     * Creates a new BatchSearchResult with a summary and batch items.
     *
     * @param batchSummary
     * @param batchItems
     */
    public BatchReverseSearchResult(BatchResultSummary batchSummary, List<ReverseSearchAddressBatchItem> batchItems) {
        this.batchSummary = batchSummary;
        this.batchItems = batchItems;
    }

    /**
     * Get the batchSummary property: Summary of the results for the batch request.
     *
     * @return the batchSummary value.
     */
    public BatchResultSummary getBatchSummary() {
        return this.batchSummary;
    }

    /**
     * Get the batchItems property: Array containing the batch results.
     *
     * @return the batchItems value.
     */
    public List<ReverseSearchAddressBatchItem> getBatchItems() {
        return this.batchItems;
    }
}
