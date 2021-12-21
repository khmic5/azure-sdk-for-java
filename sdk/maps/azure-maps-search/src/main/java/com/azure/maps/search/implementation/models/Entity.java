// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Entity. */
public final class Entity extends ExpandableStringEnum<Entity> {
    /** Static value position for Entity. */
    public static final Entity POSITION = fromString("position");

    /**
     * Creates or finds a Entity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Entity.
     */
    @JsonCreator
    public static Entity fromString(String name) {
        return fromString(name, Entity.class);
    }

    /** @return known Entity values. */
    public static Collection<Entity> values() {
        return values(Entity.class);
    }
}
