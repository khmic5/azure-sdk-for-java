// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The entry point for the POI being returned. */
@Fluent
public final class SearchResultEntryPoint {
    /*
     * The type of entry point. Value can be either _main_ or _minor_.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private EntryPointType type;

    /*
     * A location represented as a latitude and longitude using short names
     * 'lat' & 'lon'.
     */
    @JsonProperty(value = "position")
    private CoordinatesPairAbbreviated position;

    /**
     * Get the type property: The type of entry point. Value can be either _main_ or _minor_.
     *
     * @return the type value.
     */
    public EntryPointType getType() {
        return this.type;
    }

    /**
     * Get the position property: A location represented as a latitude and longitude using short names 'lat' &amp;
     * 'lon'.
     *
     * @return the position value.
     */
    public CoordinatesPairAbbreviated getPosition() {
        return this.position;
    }

    /**
     * Set the position property: A location represented as a latitude and longitude using short names 'lat' &amp;
     * 'lon'.
     *
     * @param position the position value to set.
     * @return the SearchResultEntryPoint object itself.
     */
    public SearchResultEntryPoint setPosition(CoordinatesPairAbbreviated position) {
        this.position = position;
        return this;
    }
}
