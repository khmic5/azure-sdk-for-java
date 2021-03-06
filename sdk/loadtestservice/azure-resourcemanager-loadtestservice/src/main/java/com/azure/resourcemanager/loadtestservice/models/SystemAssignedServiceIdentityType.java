// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtestservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SystemAssignedServiceIdentityType. */
public final class SystemAssignedServiceIdentityType extends ExpandableStringEnum<SystemAssignedServiceIdentityType> {
    /** Static value None for SystemAssignedServiceIdentityType. */
    public static final SystemAssignedServiceIdentityType NONE = fromString("None");

    /** Static value SystemAssigned for SystemAssignedServiceIdentityType. */
    public static final SystemAssignedServiceIdentityType SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /**
     * Creates or finds a SystemAssignedServiceIdentityType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SystemAssignedServiceIdentityType.
     */
    @JsonCreator
    public static SystemAssignedServiceIdentityType fromString(String name) {
        return fromString(name, SystemAssignedServiceIdentityType.class);
    }

    /** @return known SystemAssignedServiceIdentityType values. */
    public static Collection<SystemAssignedServiceIdentityType> values() {
        return values(SystemAssignedServiceIdentityType.class);
    }
}
