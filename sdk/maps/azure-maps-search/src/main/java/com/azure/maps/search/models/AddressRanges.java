// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.

package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;

/**
 * Describes the address range on both sides of the street for a search result. Coordinates for the start and end
 * locations of the address range are included.
 */
@Immutable
public final class AddressRanges {

    /*
     * Internal representation of AddressRanges
     */
    private com.azure.maps.search.implementation.models.AddressRanges internalModel;

    AddressRanges(com.azure.maps.search.implementation.models.AddressRanges internalModel) {
        this.internalModel = internalModel;
    }

    /**
     * Get the rangeLeft property: Address range on the left side of the street.
     *
     * @return the rangeLeft value.
     */
    public String getRangeLeft() {
        return this.internalModel.getRangeLeft();
    }

    /**
     * Get the rangeRight property: Address range on the right side of the street.
     *
     * @return the rangeRight value.
     */
    public String getRangeRight() {
        return this.internalModel.getRangeRight();
    }

    /**
     * Get the from property: A location represented as a latitude and longitude using short names 'lat' &amp; 'lon'.
     *
     * @return the from value.
     */
    public LatLong getFrom() {
        return new LatLong(internalModel.getFrom());
    }

    /**
     * Get the to property: A location represented as a latitude and longitude using short names 'lat' &amp; 'lon'.
     *
     * @return the to value.
     */
    public LatLong getTo() {
        return new LatLong(internalModel.getTo());
    }
}
