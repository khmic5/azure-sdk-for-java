// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This object is returned from a successful Search Address Reverse CrossStreet call. */
@Immutable
public final class ReverseSearchCrossStreetAddressResultPrivate {
    /*
     * Summary object for a Search Address Reverse Cross Street response
     */
    @JsonProperty(value = "summary", access = JsonProperty.Access.WRITE_ONLY)
    private SearchSummaryPrivate summary;

    /*
     * Addresses array
     */
    @JsonProperty(value = "addresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReverseSearchCrossStreetAddressResultItemPrivate> addresses;

    /**
     * Get the summary property: Summary object for a Search Address Reverse Cross Street response.
     *
     * @return the summary value.
     */
    public SearchSummaryPrivate getSummary() {
        return this.summary;
    }

    /**
     * Get the addresses property: Addresses array.
     *
     * @return the addresses value.
     */
    public List<ReverseSearchCrossStreetAddressResultItemPrivate> getAddresses() {
        return this.addresses;
    }
}
