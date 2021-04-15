// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RegistryArtifactOrderBy. */
public final class RegistryArtifactOrderBy extends ExpandableStringEnum<RegistryArtifactOrderBy> {
    /** Static value time_desc for RegistryArtifactOrderBy. */
    public static final RegistryArtifactOrderBy LAST_UPDATED_ON_DESCENDING = fromString("time_desc");

    /** Static value time_asc for RegistryArtifactOrderBy. */
    public static final RegistryArtifactOrderBy LAST_UPDATED_ON_ASCENDING = fromString("time_asc");

    /**
     * Creates or finds a RegistryArtifactOrderBy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RegistryArtifactOrderBy.
     */
    @JsonCreator
    public static RegistryArtifactOrderBy fromString(String name) {
        return fromString(name, RegistryArtifactOrderBy.class);
    }

    /** @return known RegistryArtifactOrderBy values. */
    public static Collection<RegistryArtifactOrderBy> values() {
        return values(RegistryArtifactOrderBy.class);
    }
}