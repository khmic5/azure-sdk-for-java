// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AddonProvisioningState. */
public final class AddonProvisioningState extends ExpandableStringEnum<AddonProvisioningState> {
    /** Static value Succeeded for AddonProvisioningState. */
    public static final AddonProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for AddonProvisioningState. */
    public static final AddonProvisioningState FAILED = fromString("Failed");

    /** Static value Cancelled for AddonProvisioningState. */
    public static final AddonProvisioningState CANCELLED = fromString("Cancelled");

    /** Static value Building for AddonProvisioningState. */
    public static final AddonProvisioningState BUILDING = fromString("Building");

    /** Static value Deleting for AddonProvisioningState. */
    public static final AddonProvisioningState DELETING = fromString("Deleting");

    /** Static value Updating for AddonProvisioningState. */
    public static final AddonProvisioningState UPDATING = fromString("Updating");

    /**
     * Creates or finds a AddonProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AddonProvisioningState.
     */
    @JsonCreator
    public static AddonProvisioningState fromString(String name) {
        return fromString(name, AddonProvisioningState.class);
    }

    /** @return known AddonProvisioningState values. */
    public static Collection<AddonProvisioningState> values() {
        return values(AddonProvisioningState.class);
    }
}
