// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;
import com.azure.maps.search.implementation.models.ReverseSearchAddressResultItem;
import com.azure.maps.search.implementation.models.SearchSummary;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This object is returned from a successful Search Address Reverse call. */
@Immutable
public class ReverseSearchAddressResult {
    /*
     * Summary object for a Search Address Reverse response
     */
    @JsonProperty(value = "summary", access = JsonProperty.Access.WRITE_ONLY)
    private SearchSummary summary;

    /*
     * Addresses array
     */
    @JsonProperty(value = "addresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReverseSearchAddressResultItem> addresses;

    /**
     * Get the summary property: Summary object for a Search Address Reverse response.
     *
     * @return the summary value.
     */
    public SearchSummary getSummary() {
        return this.summary;
    }

    /**
     * Get the addresses property: Addresses array.
     *
     * @return the addresses value.
     */
    public List<ReverseSearchAddressResultItem> getAddresses() {
        return this.addresses;
    }
}
