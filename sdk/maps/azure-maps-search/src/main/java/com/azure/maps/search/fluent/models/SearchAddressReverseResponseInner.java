// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.maps.search.models.SearchAddressReverseResult;
import com.azure.maps.search.models.SearchCommonSummary;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This object is returned from a successful Search Address Reverse call. */
@Immutable
public class SearchAddressReverseResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SearchAddressReverseResponseInner.class);

    /*
     * Summary object for a Search Address Reverse response
     */
    @JsonProperty(value = "summary", access = JsonProperty.Access.WRITE_ONLY)
    private SearchCommonSummary summary;

    /*
     * Addresses array
     */
    @JsonProperty(value = "addresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<SearchAddressReverseResult> addresses;

    /**
     * Get the summary property: Summary object for a Search Address Reverse response.
     *
     * @return the summary value.
     */
    public SearchCommonSummary summary() {
        return this.summary;
    }

    /**
     * Get the addresses property: Addresses array.
     *
     * @return the addresses value.
     */
    public List<SearchAddressReverseResult> addresses() {
        return this.addresses;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (summary() != null) {
            summary().validate();
        }
        if (addresses() != null) {
            addresses().forEach(e -> e.validate());
        }
    }
}
