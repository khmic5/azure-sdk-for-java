// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.

package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;
import java.util.List;
import java.util.stream.Collectors;

/** This object is returned from a successful Search Address Reverse CrossStreet call. */
@Immutable
public final class ReverseSearchCrossStreetAddressResult {

    /*
     * Internal model
     */
    private com.azure.maps.search.implementation.models.ReverseSearchCrossStreetAddressResult internalModel = null;

    /*
     * A list of Search API results.
     */
    private List<ReverseSearchCrossStreetAddressResultItem> addresses = null;

    /**
     * Constructor
     */
    public ReverseSearchCrossStreetAddressResult(com.azure.maps.search.implementation.models.ReverseSearchCrossStreetAddressResult internalModel) {
        this.internalModel = internalModel;

        // configure results to replace ReverseSearchAddressResultItem with the proper model
        // this is a heavy operation so it will be done here and cached.
        if (this.internalModel != null && this.internalModel.getAddresses() != null) {
            this.addresses = this.internalModel.getAddresses().stream().map(item ->
                new ReverseSearchCrossStreetAddressResultItem(item)).collect(Collectors.toList());
        }
    }

    /**
     * Get the summary property: Summary object for a Search Address Reverse Cross Street response.
     *
     * @return the summary value.
     */
    public SearchSummary getSummary() {
        return this.internalModel.getSummary();
    }

    /**
     * Get the addresses property: Addresses array.
     *
     * @return the addresses value.
     */
    public List<ReverseSearchCrossStreetAddressResultItem> getAddresses() {
        return this.addresses;
    }
}
