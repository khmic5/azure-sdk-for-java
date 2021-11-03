// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SearchAddressResultType. */
public final class SearchAddressResultType extends ExpandableStringEnum<SearchAddressResultType> {
    /** Static value POI for SearchAddressResultType. */
    public static final SearchAddressResultType POI = fromString("POI");

    /** Static value Street for SearchAddressResultType. */
    public static final SearchAddressResultType STREET = fromString("Street");

    /** Static value Geography for SearchAddressResultType. */
    public static final SearchAddressResultType GEOGRAPHY = fromString("Geography");

    /** Static value Point Address for SearchAddressResultType. */
    public static final SearchAddressResultType POINT_ADDRESS = fromString("Point Address");

    /** Static value Address Range for SearchAddressResultType. */
    public static final SearchAddressResultType ADDRESS_RANGE = fromString("Address Range");

    /** Static value Cross Street for SearchAddressResultType. */
    public static final SearchAddressResultType CROSS_STREET = fromString("Cross Street");

    /**
     * Creates or finds a SearchAddressResultType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SearchAddressResultType.
     */
    @JsonCreator
    public static SearchAddressResultType fromString(String name) {
        return fromString(name, SearchAddressResultType.class);
    }

    /** @return known SearchAddressResultType values. */
    public static Collection<SearchAddressResultType> values() {
        return values(SearchAddressResultType.class);
    }
}
