// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.implementation;

import com.azure.maps.search.fluent.models.SearchAddressReverseBatchResponseInner;
import com.azure.maps.search.models.BatchResponseSummary;
import com.azure.maps.search.models.SearchAddressReverseBatchItem;
import com.azure.maps.search.models.SearchAddressReverseBatchResponse;
import java.util.Collections;
import java.util.List;

public final class SearchAddressReverseBatchResponseImpl implements SearchAddressReverseBatchResponse {
    private SearchAddressReverseBatchResponseInner innerObject;

    private final com.azure.maps.search.SearchManager serviceManager;

    SearchAddressReverseBatchResponseImpl(
        SearchAddressReverseBatchResponseInner innerObject, com.azure.maps.search.SearchManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public BatchResponseSummary summary() {
        return this.innerModel().summary();
    }

    public List<SearchAddressReverseBatchItem> batchItems() {
        List<SearchAddressReverseBatchItem> inner = this.innerModel().batchItems();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SearchAddressReverseBatchResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.maps.search.SearchManager manager() {
        return this.serviceManager;
    }
}
