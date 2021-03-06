// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.models.State;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Regulatory compliance standard details and state. */
@JsonFlatten
@Fluent
public class RegulatoryComplianceStandardInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RegulatoryComplianceStandardInner.class);

    /*
     * Aggregative state based on the standard's supported controls states
     */
    @JsonProperty(value = "properties.state")
    private State state;

    /*
     * The number of supported regulatory compliance controls of the given
     * standard with a passed state
     */
    @JsonProperty(value = "properties.passedControls", access = JsonProperty.Access.WRITE_ONLY)
    private Integer passedControls;

    /*
     * The number of supported regulatory compliance controls of the given
     * standard with a failed state
     */
    @JsonProperty(value = "properties.failedControls", access = JsonProperty.Access.WRITE_ONLY)
    private Integer failedControls;

    /*
     * The number of supported regulatory compliance controls of the given
     * standard with a skipped state
     */
    @JsonProperty(value = "properties.skippedControls", access = JsonProperty.Access.WRITE_ONLY)
    private Integer skippedControls;

    /*
     * The number of regulatory compliance controls of the given standard which
     * are unsupported by automated assessments
     */
    @JsonProperty(value = "properties.unsupportedControls", access = JsonProperty.Access.WRITE_ONLY)
    private Integer unsupportedControls;

    /**
     * Get the state property: Aggregative state based on the standard's supported controls states.
     *
     * @return the state value.
     */
    public State state() {
        return this.state;
    }

    /**
     * Set the state property: Aggregative state based on the standard's supported controls states.
     *
     * @param state the state value to set.
     * @return the RegulatoryComplianceStandardInner object itself.
     */
    public RegulatoryComplianceStandardInner withState(State state) {
        this.state = state;
        return this;
    }

    /**
     * Get the passedControls property: The number of supported regulatory compliance controls of the given standard
     * with a passed state.
     *
     * @return the passedControls value.
     */
    public Integer passedControls() {
        return this.passedControls;
    }

    /**
     * Get the failedControls property: The number of supported regulatory compliance controls of the given standard
     * with a failed state.
     *
     * @return the failedControls value.
     */
    public Integer failedControls() {
        return this.failedControls;
    }

    /**
     * Get the skippedControls property: The number of supported regulatory compliance controls of the given standard
     * with a skipped state.
     *
     * @return the skippedControls value.
     */
    public Integer skippedControls() {
        return this.skippedControls;
    }

    /**
     * Get the unsupportedControls property: The number of regulatory compliance controls of the given standard which
     * are unsupported by automated assessments.
     *
     * @return the unsupportedControls value.
     */
    public Integer unsupportedControls() {
        return this.unsupportedControls;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
