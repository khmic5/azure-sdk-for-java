// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.

package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;
import com.azure.maps.search.implementation.helpers.EntryPointPropertiesHelper;
import com.azure.maps.search.implementation.models.LatLongPairAbbreviated;

/** The entry point for the POI being returned. */
@Immutable
public final class EntryPoint {
    private EntryPointType type;
    private LatLong position;

    static {
        EntryPointPropertiesHelper.setAccessor(new EntryPointPropertiesHelper.EntryPointAccessor() {
            @Override
            public void setType(EntryPoint entryPoint, EntryPointType type) {
                entryPoint.setType(type);
            }

            @Override
            public void setPosition(EntryPoint entryPoint, LatLongPairAbbreviated position) {
                entryPoint.setPosition(position);
            }
        });
    }

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
    public LatLong getPosition() {
        return position;
    }

    // private setters
    private void setType(EntryPointType type) {
        this.type = type;
    }

    private void setPosition(LatLongPairAbbreviated position) {
        this.position = new LatLong(position);
    }
}
