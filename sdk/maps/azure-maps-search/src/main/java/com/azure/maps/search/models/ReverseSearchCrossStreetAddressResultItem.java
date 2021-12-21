// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.

package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;
import com.azure.maps.search.implementation.models.ReverseSearchCrossStreetAddressResultItemPrivate;

/** Result object for a Search Address Reverse Cross Street response. */
@Immutable
public final class ReverseSearchCrossStreetAddressResultItem {

    /*
     * Internal model
     */
    private ReverseSearchCrossStreetAddressResultItemPrivate internalModel = null;

    /**
     * Constructor
     * @param internalModel
     */

    public ReverseSearchCrossStreetAddressResultItem(ReverseSearchCrossStreetAddressResultItemPrivate internalModel) {
        this.internalModel = internalModel;
    }

    /**
     * Get the address property: The address of the result.
     *
     * @return the address value.
     */
    public Address getAddress() {
        return new Address(this.internalModel.getAddress());
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
}
