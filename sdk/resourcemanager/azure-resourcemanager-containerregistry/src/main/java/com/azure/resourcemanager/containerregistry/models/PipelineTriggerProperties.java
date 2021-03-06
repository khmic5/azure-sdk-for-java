// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PipelineTriggerProperties model. */
@Fluent
public final class PipelineTriggerProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PipelineTriggerProperties.class);

    /*
     * The source trigger properties of the pipeline.
     */
    @JsonProperty(value = "sourceTrigger")
    private PipelineSourceTriggerProperties sourceTrigger;

    /**
     * Get the sourceTrigger property: The source trigger properties of the pipeline.
     *
     * @return the sourceTrigger value.
     */
    public PipelineSourceTriggerProperties sourceTrigger() {
        return this.sourceTrigger;
    }

    /**
     * Set the sourceTrigger property: The source trigger properties of the pipeline.
     *
     * @param sourceTrigger the sourceTrigger value to set.
     * @return the PipelineTriggerProperties object itself.
     */
    public PipelineTriggerProperties withSourceTrigger(PipelineSourceTriggerProperties sourceTrigger) {
        this.sourceTrigger = sourceTrigger;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceTrigger() != null) {
            sourceTrigger().validate();
        }
    }
}
