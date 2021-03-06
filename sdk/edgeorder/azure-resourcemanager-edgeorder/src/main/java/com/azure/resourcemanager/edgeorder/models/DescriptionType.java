// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DescriptionType. */
public final class DescriptionType extends ExpandableStringEnum<DescriptionType> {
    /** Static value Base for DescriptionType. */
    public static final DescriptionType BASE = fromString("Base");

    /**
     * Creates or finds a DescriptionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DescriptionType.
     */
    @JsonCreator
    public static DescriptionType fromString(String name) {
        return fromString(name, DescriptionType.class);
    }

    /** @return known DescriptionType values. */
    public static Collection<DescriptionType> values() {
        return values(DescriptionType.class);
    }
}
