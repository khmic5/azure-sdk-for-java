// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the address range on both sides of the street for a search result. Coordinates for the start and end
 * locations of the address range are included.
 */
@Fluent
public final class SearchResultAddressRanges {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SearchResultAddressRanges.class);

    /*
     * Address range on the left side of the street.
     */
    @JsonProperty(value = "rangeLeft")
    private String rangeLeft;

    /*
     * Address range on the right side of the street.
     */
    @JsonProperty(value = "rangeRight")
    private String rangeRight;

    /*
     * A location represented as a latitude and longitude using short names
     * 'lat' & 'lon'.
     */
    @JsonProperty(value = "from")
    private CoordinatesPairAbbreviated from;

    /*
     * A location represented as a latitude and longitude using short names
     * 'lat' & 'lon'.
     */
    @JsonProperty(value = "to")
    private CoordinatesPairAbbreviated to;

    /**
     * Get the rangeLeft property: Address range on the left side of the street.
     *
     * @return the rangeLeft value.
     */
    public String rangeLeft() {
        return this.rangeLeft;
    }

    /**
     * Set the rangeLeft property: Address range on the left side of the street.
     *
     * @param rangeLeft the rangeLeft value to set.
     * @return the SearchResultAddressRanges object itself.
     */
    public SearchResultAddressRanges withRangeLeft(String rangeLeft) {
        this.rangeLeft = rangeLeft;
        return this;
    }

    /**
     * Get the rangeRight property: Address range on the right side of the street.
     *
     * @return the rangeRight value.
     */
    public String rangeRight() {
        return this.rangeRight;
    }

    /**
     * Set the rangeRight property: Address range on the right side of the street.
     *
     * @param rangeRight the rangeRight value to set.
     * @return the SearchResultAddressRanges object itself.
     */
    public SearchResultAddressRanges withRangeRight(String rangeRight) {
        this.rangeRight = rangeRight;
        return this;
    }

    /**
     * Get the from property: A location represented as a latitude and longitude using short names 'lat' &amp; 'lon'.
     *
     * @return the from value.
     */
    public CoordinatesPairAbbreviated from() {
        return this.from;
    }

    /**
     * Set the from property: A location represented as a latitude and longitude using short names 'lat' &amp; 'lon'.
     *
     * @param from the from value to set.
     * @return the SearchResultAddressRanges object itself.
     */
    public SearchResultAddressRanges withFrom(CoordinatesPairAbbreviated from) {
        this.from = from;
        return this;
    }

    /**
     * Get the to property: A location represented as a latitude and longitude using short names 'lat' &amp; 'lon'.
     *
     * @return the to value.
     */
    public CoordinatesPairAbbreviated to() {
        return this.to;
    }

    /**
     * Set the to property: A location represented as a latitude and longitude using short names 'lat' &amp; 'lon'.
     *
     * @param to the to value to set.
     * @return the SearchResultAddressRanges object itself.
     */
    public SearchResultAddressRanges withTo(CoordinatesPairAbbreviated to) {
        this.to = to;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (from() != null) {
            from().validate();
        }
        if (to() != null) {
            to().validate();
        }
    }
}
