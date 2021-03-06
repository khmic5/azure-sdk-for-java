// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PipelineRunSourceType. */
public final class PipelineRunSourceType extends ExpandableStringEnum<PipelineRunSourceType> {
    /** Static value AzureStorageBlob for PipelineRunSourceType. */
    public static final PipelineRunSourceType AZURE_STORAGE_BLOB = fromString("AzureStorageBlob");

    /**
     * Creates or finds a PipelineRunSourceType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PipelineRunSourceType.
     */
    @JsonCreator
    public static PipelineRunSourceType fromString(String name) {
        return fromString(name, PipelineRunSourceType.class);
    }

    /** @return known PipelineRunSourceType values. */
    public static Collection<PipelineRunSourceType> values() {
        return values(PipelineRunSourceType.class);
    }
}
