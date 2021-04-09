// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HeaderActionType. */
public final class HeaderActionType extends ExpandableStringEnum<HeaderActionType> {
    /** Static value Append for HeaderActionType. */
    public static final HeaderActionType APPEND = fromString("Append");

    /** Static value Delete for HeaderActionType. */
    public static final HeaderActionType DELETE = fromString("Delete");

    /** Static value Overwrite for HeaderActionType. */
    public static final HeaderActionType OVERWRITE = fromString("Overwrite");

    /**
     * Creates or finds a HeaderActionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HeaderActionType.
     */
    @JsonCreator
    public static HeaderActionType fromString(String name) {
        return fromString(name, HeaderActionType.class);
    }

    /** @return known HeaderActionType values. */
    public static Collection<HeaderActionType> values() {
        return values(HeaderActionType.class);
    }
}
