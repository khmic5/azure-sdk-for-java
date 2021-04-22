// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An object that represents the status of ingress on an environment. */
@Fluent
public final class IngressEnvironmentStatus {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IngressEnvironmentStatus.class);

    /*
     * This string represents the state of ingress operations on an
     * environment. It can be "Disabled", "Ready", "Running", "Paused" or
     * "Unknown"
     */
    @JsonProperty(value = "state")
    private IngressState state;

    /*
     * An object that contains the details about an environment's state.
     */
    @JsonProperty(value = "stateDetails", access = JsonProperty.Access.WRITE_ONLY)
    private EnvironmentStateDetails stateDetails;

    /**
     * Get the state property: This string represents the state of ingress operations on an environment. It can be
     * "Disabled", "Ready", "Running", "Paused" or "Unknown".
     *
     * @return the state value.
     */
    public IngressState state() {
        return this.state;
    }

    /**
     * Set the state property: This string represents the state of ingress operations on an environment. It can be
     * "Disabled", "Ready", "Running", "Paused" or "Unknown".
     *
     * @param state the state value to set.
     * @return the IngressEnvironmentStatus object itself.
     */
    public IngressEnvironmentStatus withState(IngressState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the stateDetails property: An object that contains the details about an environment's state.
     *
     * @return the stateDetails value.
     */
    public EnvironmentStateDetails stateDetails() {
        return this.stateDetails;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (stateDetails() != null) {
            stateDetails().validate();
        }
    }
}