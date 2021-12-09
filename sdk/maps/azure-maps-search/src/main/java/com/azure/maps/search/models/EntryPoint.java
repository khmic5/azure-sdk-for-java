// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.

package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;

/** The entry point for the POI being returned. */
@Immutable
public final class EntryPoint {

    /*
     * Internal model
     */
    private com.azure.maps.search.implementation.models.EntryPoint internalModel = null;

    /**
     * Constructor
     */
    public EntryPoint(com.azure.maps.search.implementation.models.EntryPoint internalModel) {
        this.internalModel = internalModel;
    }

    /**
     * Get the type property: The type of entry point. Value can be either _main_ or _minor_.
     *
     * @return the type value.
     */
    public EntryPointType getType() {
        return this.internalModel.getType();
    }

    /**
     * Get the position property: A location represented as a latitude and longitude using short names 'lat' &amp;
     * 'lon'.
     *
     * @return the position value.
     */
    public LatLong getPosition() {
        return new LatLong(this.internalModel.getPosition());
    }
}
