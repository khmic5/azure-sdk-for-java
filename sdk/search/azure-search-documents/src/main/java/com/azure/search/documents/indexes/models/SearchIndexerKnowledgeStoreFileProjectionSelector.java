// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Projection definition for what data to store in Azure Files. */
@Fluent
public final class SearchIndexerKnowledgeStoreFileProjectionSelector
        extends SearchIndexerKnowledgeStoreBlobProjectionSelector {
    /**
     * Creates an instance of SearchIndexerKnowledgeStoreFileProjectionSelector class.
     *
     * @param storageContainer the storageContainer value to set.
     */
    @JsonCreator
    public SearchIndexerKnowledgeStoreFileProjectionSelector(
            @JsonProperty(value = "storageContainer", required = true) String storageContainer) {
        super(storageContainer);
    }

    @Override
    public SearchIndexerKnowledgeStoreFileProjectionSelector setReferenceKeyName(String referenceKeyName) {
        super.setReferenceKeyName(referenceKeyName);
        return this;
    }

    @Override
    public SearchIndexerKnowledgeStoreFileProjectionSelector setGeneratedKeyName(String generatedKeyName) {
        super.setGeneratedKeyName(generatedKeyName);
        return this;
    }

    @Override
    public SearchIndexerKnowledgeStoreFileProjectionSelector setSource(String source) {
        super.setSource(source);

        return this;
    }

    @Override
    public SearchIndexerKnowledgeStoreFileProjectionSelector setSourceContext(String sourceContext) {
        super.setSourceContext(sourceContext);
        return this;
    }

    @Override
    public SearchIndexerKnowledgeStoreFileProjectionSelector setInputs(List<InputFieldMappingEntry> inputs) {
        super.setInputs(inputs);
        return this;
    }
}
