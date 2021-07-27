// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An item returned from Search Fuzzy Batch service call. */
@Immutable
public final class SearchFuzzyBatchItem extends BatchItem {
    /*
     * The result of the query. SearchCommonResponse if the query completed
     * successfully, ErrorResponse otherwise.
     */
    @JsonProperty(value = "response", access = JsonProperty.Access.WRITE_ONLY)
    private SearchFuzzyBatchItemResponse response;

    /**
     * Get the response property: The result of the query. SearchCommonResponse if the query completed successfully,
     * ErrorResponse otherwise.
     *
     * @return the response value.
     */
    public SearchFuzzyBatchItemResponse getResponse() {
        return this.response;
    }
}
