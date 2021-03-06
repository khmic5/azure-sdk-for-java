// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.models.ImportPipelineSourceProperties;
import com.azure.resourcemanager.containerregistry.models.PipelineOptions;
import com.azure.resourcemanager.containerregistry.models.PipelineTriggerProperties;
import com.azure.resourcemanager.containerregistry.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of an import pipeline. */
@Fluent
public final class ImportPipelineProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImportPipelineProperties.class);

    /*
     * The source properties of the import pipeline.
     */
    @JsonProperty(value = "source", required = true)
    private ImportPipelineSourceProperties source;

    /*
     * The properties that describe the trigger of the import pipeline.
     */
    @JsonProperty(value = "trigger")
    private PipelineTriggerProperties trigger;

    /*
     * The list of all options configured for the pipeline.
     */
    @JsonProperty(value = "options")
    private List<PipelineOptions> options;

    /*
     * The provisioning state of the pipeline at the time the operation was
     * called.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the source property: The source properties of the import pipeline.
     *
     * @return the source value.
     */
    public ImportPipelineSourceProperties source() {
        return this.source;
    }

    /**
     * Set the source property: The source properties of the import pipeline.
     *
     * @param source the source value to set.
     * @return the ImportPipelineProperties object itself.
     */
    public ImportPipelineProperties withSource(ImportPipelineSourceProperties source) {
        this.source = source;
        return this;
    }

    /**
     * Get the trigger property: The properties that describe the trigger of the import pipeline.
     *
     * @return the trigger value.
     */
    public PipelineTriggerProperties trigger() {
        return this.trigger;
    }

    /**
     * Set the trigger property: The properties that describe the trigger of the import pipeline.
     *
     * @param trigger the trigger value to set.
     * @return the ImportPipelineProperties object itself.
     */
    public ImportPipelineProperties withTrigger(PipelineTriggerProperties trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Get the options property: The list of all options configured for the pipeline.
     *
     * @return the options value.
     */
    public List<PipelineOptions> options() {
        return this.options;
    }

    /**
     * Set the options property: The list of all options configured for the pipeline.
     *
     * @param options the options value to set.
     * @return the ImportPipelineProperties object itself.
     */
    public ImportPipelineProperties withOptions(List<PipelineOptions> options) {
        this.options = options;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the pipeline at the time the operation was called.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property source in model ImportPipelineProperties"));
        } else {
            source().validate();
        }
        if (trigger() != null) {
            trigger().validate();
        }
    }
}
