// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The set of properties that can be update in a PATCH request to a monitor resource. */
@Fluent
public final class MonitorUpdateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MonitorUpdateProperties.class);

    /*
     * Flag specifying if the resource monitoring is enabled or disabled.
     */
    @JsonProperty(value = "monitoringStatus")
    private MonitoringStatus monitoringStatus;

    /**
     * Get the monitoringStatus property: Flag specifying if the resource monitoring is enabled or disabled.
     *
     * @return the monitoringStatus value.
     */
    public MonitoringStatus monitoringStatus() {
        return this.monitoringStatus;
    }

    /**
     * Set the monitoringStatus property: Flag specifying if the resource monitoring is enabled or disabled.
     *
     * @param monitoringStatus the monitoringStatus value to set.
     * @return the MonitorUpdateProperties object itself.
     */
    public MonitorUpdateProperties withMonitoringStatus(MonitoringStatus monitoringStatus) {
        this.monitoringStatus = monitoringStatus;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
