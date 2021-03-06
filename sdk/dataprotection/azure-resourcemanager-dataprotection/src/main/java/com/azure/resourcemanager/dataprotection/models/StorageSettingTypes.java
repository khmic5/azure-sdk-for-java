// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for StorageSettingTypes. */
public final class StorageSettingTypes extends ExpandableStringEnum<StorageSettingTypes> {
    /** Static value GeoRedundant for StorageSettingTypes. */
    public static final StorageSettingTypes GEO_REDUNDANT = fromString("GeoRedundant");

    /** Static value LocallyRedundant for StorageSettingTypes. */
    public static final StorageSettingTypes LOCALLY_REDUNDANT = fromString("LocallyRedundant");

    /**
     * Creates or finds a StorageSettingTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StorageSettingTypes.
     */
    @JsonCreator
    public static StorageSettingTypes fromString(String name) {
        return fromString(name, StorageSettingTypes.class);
    }

    /** @return known StorageSettingTypes values. */
    public static Collection<StorageSettingTypes> values() {
        return values(StorageSettingTypes.class);
    }
}
