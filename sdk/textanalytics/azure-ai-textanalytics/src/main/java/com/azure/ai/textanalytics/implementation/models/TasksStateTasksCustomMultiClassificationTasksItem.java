// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TasksStateTasksCustomMultiClassificationTasksItem model. */
@Fluent
public final class TasksStateTasksCustomMultiClassificationTasksItem extends TaskState {
    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private CustomMultiClassificationResult results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public CustomMultiClassificationResult getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the TasksStateTasksCustomMultiClassificationTasksItem object itself.
     */
    public TasksStateTasksCustomMultiClassificationTasksItem setResults(CustomMultiClassificationResult results) {
        this.results = results;
        return this;
    }
}
