// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridnetwork.models.ProvisioningState;
import com.azure.resourcemanager.hybridnetwork.models.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Device properties. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "deviceType")
@JsonTypeName("DevicePropertiesFormat")
@Fluent
public final class DevicePropertiesFormat {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DevicePropertiesFormat.class);

    /*
     * The current device status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private Status status;

    /*
     * The provisioning state of the device resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The reference to the Azure stack edge device. Once set, it cannot be
     * updated.
     */
    @JsonProperty(value = "azureStackEdge")
    private SubResource azureStackEdge;

    /*
     * The list of network functions deployed on the device.
     */
    @JsonProperty(value = "networkFunctions", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> networkFunctions;

    /**
     * Get the status property: The current device status.
     *
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Get the provisioningState property: The provisioning state of the device resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the azureStackEdge property: The reference to the Azure stack edge device. Once set, it cannot be updated.
     *
     * @return the azureStackEdge value.
     */
    public SubResource azureStackEdge() {
        return this.azureStackEdge;
    }

    /**
     * Set the azureStackEdge property: The reference to the Azure stack edge device. Once set, it cannot be updated.
     *
     * @param azureStackEdge the azureStackEdge value to set.
     * @return the DevicePropertiesFormat object itself.
     */
    public DevicePropertiesFormat withAzureStackEdge(SubResource azureStackEdge) {
        this.azureStackEdge = azureStackEdge;
        return this;
    }

    /**
     * Get the networkFunctions property: The list of network functions deployed on the device.
     *
     * @return the networkFunctions value.
     */
    public List<SubResource> networkFunctions() {
        return this.networkFunctions;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
