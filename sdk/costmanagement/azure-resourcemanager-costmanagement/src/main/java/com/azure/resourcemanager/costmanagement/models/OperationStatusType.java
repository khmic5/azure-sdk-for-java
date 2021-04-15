// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OperationStatusType. */
public final class OperationStatusType extends ExpandableStringEnum<OperationStatusType> {
    /** Static value Running for OperationStatusType. */
    public static final OperationStatusType RUNNING = fromString("Running");

    /** Static value Completed for OperationStatusType. */
    public static final OperationStatusType COMPLETED = fromString("Completed");

    /** Static value Failed for OperationStatusType. */
    public static final OperationStatusType FAILED = fromString("Failed");

    /**
     * Creates or finds a OperationStatusType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OperationStatusType.
     */
    @JsonCreator
    public static OperationStatusType fromString(String name) {
        return fromString(name, OperationStatusType.class);
    }

    /** @return known OperationStatusType values. */
    public static Collection<OperationStatusType> values() {
        return values(OperationStatusType.class);
    }
}