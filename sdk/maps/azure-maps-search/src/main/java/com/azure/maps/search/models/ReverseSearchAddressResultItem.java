// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.

package com.azure.maps.search.models;

import java.util.List;

import com.azure.core.annotation.Immutable;
import com.azure.maps.search.implementation.models.Address;

/** Result object for a Search Address Reverse response. */
@Immutable
public final class ReverseSearchAddressResultItem {

    /*
     * Internal model
     */
    private com.azure.maps.search.implementation.models.ReverseSearchAddressResultItem internalModel = null;

    /**
     * Constructor
     * @param internalModel
     */
    public ReverseSearchAddressResultItem(com.azure.maps.search.implementation.models.ReverseSearchAddressResultItem
        internalModel) {
        this.internalModel = internalModel;
    }

    /**
     * Get the address property: The address of the result.
     *
     * @return the address value.
     */
    public Address getAddress() {
        return this.internalModel.getAddress();
    }

    /**
     * Get the position property: Position property as LatLong.
     *
     * @return the position value.
     */
    public LatLong getPosition() {
        // position in the internal model is a string separated by commas
        final String position = this.internalModel.getPosition();

        if (position != null) {
            final String[] coords = position.split(",");

            if (coords != null && coords.length == 2) {
                return new LatLong(Double.parseDouble(coords[0]), Double.parseDouble(coords[1]));
            }
        }
        return null;
    }

    /**
     * Get the roadUse property: The roadUse property.
     *
     * @return the roadUse value.
     */
    public List<RoadUseType> getRoadUse() {
        return this.internalModel.getRoadUse();
    }

    /**
     * Get the matchType property: Information on the type of match.
     *
     * <p>One of: * AddressPoint * HouseNumberRange * Street.
     *
     * @return the matchType value.
     */
    public MatchType getMatchType() {
        return this.internalModel.getMatchType();
    }
}
