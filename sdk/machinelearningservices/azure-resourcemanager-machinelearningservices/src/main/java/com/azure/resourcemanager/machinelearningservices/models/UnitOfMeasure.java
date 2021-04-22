// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UnitOfMeasure. */
public final class UnitOfMeasure extends ExpandableStringEnum<UnitOfMeasure> {
    /** Static value OneHour for UnitOfMeasure. */
    public static final UnitOfMeasure ONE_HOUR = fromString("OneHour");

    /**
     * Creates or finds a UnitOfMeasure from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UnitOfMeasure.
     */
    @JsonCreator
    public static UnitOfMeasure fromString(String name) {
        return fromString(name, UnitOfMeasure.class);
    }

    /** @return known UnitOfMeasure values. */
    public static Collection<UnitOfMeasure> values() {
        return values(UnitOfMeasure.class);
    }
}