// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Management resource preference to link device. */
@Fluent
public final class ManagementResourcePreferences {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagementResourcePreferences.class);

    /*
     * Customer preferred Management resource ARM ID
     */
    @JsonProperty(value = "preferredManagementResourceId")
    private String preferredManagementResourceId;

    /**
     * Get the preferredManagementResourceId property: Customer preferred Management resource ARM ID.
     *
     * @return the preferredManagementResourceId value.
     */
    public String preferredManagementResourceId() {
        return this.preferredManagementResourceId;
    }

    /**
     * Set the preferredManagementResourceId property: Customer preferred Management resource ARM ID.
     *
     * @param preferredManagementResourceId the preferredManagementResourceId value to set.
     * @return the ManagementResourcePreferences object itself.
     */
    public ManagementResourcePreferences withPreferredManagementResourceId(String preferredManagementResourceId) {
        this.preferredManagementResourceId = preferredManagementResourceId;
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
