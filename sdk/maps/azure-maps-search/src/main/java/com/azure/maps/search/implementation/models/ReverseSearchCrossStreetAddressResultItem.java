// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Result object for a Search Address Reverse Cross Street response. */
@Immutable
public final class ReverseSearchCrossStreetAddressResultItem {
    /*
     * The address of the result
     */
    @JsonProperty(value = "address", access = JsonProperty.Access.WRITE_ONLY)
    private AddressPrivate address;

    /*
     * Position property in the form of "{latitude},{longitude}"
     */
    @JsonProperty(value = "position", access = JsonProperty.Access.WRITE_ONLY)
    private String position;

    /**
     * Get the address property: The address of the result.
     *
     * @return the address value.
     */
    public AddressPrivate getAddress() {
        return this.address;
    }

    /**
     * Get the position property: Position property in the form of "{latitude},{longitude}".
     *
     * @return the position value.
     */
    public String getPosition() {
        return this.position;
    }
}
