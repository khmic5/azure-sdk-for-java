// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.AddressSpace;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.VpnClientConnectionHealth;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters for P2SVpnGateway. */
@Fluent
public final class P2SVpnGatewayProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(P2SVpnGatewayProperties.class);

    /*
     * The VirtualHub to which the gateway belongs
     */
    @JsonProperty(value = "virtualHub")
    private SubResource virtualHub;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState")
    private ProvisioningState provisioningState;

    /*
     * The scale unit for this p2s vpn gateway.
     */
    @JsonProperty(value = "vpnGatewayScaleUnit")
    private Integer vpnGatewayScaleUnit;

    /*
     * The P2SVpnServerConfiguration to which the p2sVpnGateway is attached to.
     */
    @JsonProperty(value = "p2SVpnServerConfiguration")
    private SubResource p2SVpnServerConfiguration;

    /*
     * The reference of the address space resource which represents Address
     * space for P2S VpnClient.
     */
    @JsonProperty(value = "vpnClientAddressPool")
    private AddressSpace vpnClientAddressPool;

    /*
     * All P2S VPN clients' connection health status.
     */
    @JsonProperty(value = "vpnClientConnectionHealth", access = JsonProperty.Access.WRITE_ONLY)
    private VpnClientConnectionHealth vpnClientConnectionHealth;

    /**
     * Get the virtualHub property: The VirtualHub to which the gateway belongs.
     *
     * @return the virtualHub value.
     */
    public SubResource virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the virtualHub property: The VirtualHub to which the gateway belongs.
     *
     * @param virtualHub the virtualHub value to set.
     * @return the P2SVpnGatewayProperties object itself.
     */
    public P2SVpnGatewayProperties withVirtualHub(SubResource virtualHub) {
        this.virtualHub = virtualHub;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the resource.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the P2SVpnGatewayProperties object itself.
     */
    public P2SVpnGatewayProperties withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the vpnGatewayScaleUnit property: The scale unit for this p2s vpn gateway.
     *
     * @return the vpnGatewayScaleUnit value.
     */
    public Integer vpnGatewayScaleUnit() {
        return this.vpnGatewayScaleUnit;
    }

    /**
     * Set the vpnGatewayScaleUnit property: The scale unit for this p2s vpn gateway.
     *
     * @param vpnGatewayScaleUnit the vpnGatewayScaleUnit value to set.
     * @return the P2SVpnGatewayProperties object itself.
     */
    public P2SVpnGatewayProperties withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit) {
        this.vpnGatewayScaleUnit = vpnGatewayScaleUnit;
        return this;
    }

    /**
     * Get the p2SVpnServerConfiguration property: The P2SVpnServerConfiguration to which the p2sVpnGateway is attached
     * to.
     *
     * @return the p2SVpnServerConfiguration value.
     */
    public SubResource p2SVpnServerConfiguration() {
        return this.p2SVpnServerConfiguration;
    }

    /**
     * Set the p2SVpnServerConfiguration property: The P2SVpnServerConfiguration to which the p2sVpnGateway is attached
     * to.
     *
     * @param p2SVpnServerConfiguration the p2SVpnServerConfiguration value to set.
     * @return the P2SVpnGatewayProperties object itself.
     */
    public P2SVpnGatewayProperties withP2SVpnServerConfiguration(SubResource p2SVpnServerConfiguration) {
        this.p2SVpnServerConfiguration = p2SVpnServerConfiguration;
        return this;
    }

    /**
     * Get the vpnClientAddressPool property: The reference of the address space resource which represents Address space
     * for P2S VpnClient.
     *
     * @return the vpnClientAddressPool value.
     */
    public AddressSpace vpnClientAddressPool() {
        return this.vpnClientAddressPool;
    }

    /**
     * Set the vpnClientAddressPool property: The reference of the address space resource which represents Address space
     * for P2S VpnClient.
     *
     * @param vpnClientAddressPool the vpnClientAddressPool value to set.
     * @return the P2SVpnGatewayProperties object itself.
     */
    public P2SVpnGatewayProperties withVpnClientAddressPool(AddressSpace vpnClientAddressPool) {
        this.vpnClientAddressPool = vpnClientAddressPool;
        return this;
    }

    /**
     * Get the vpnClientConnectionHealth property: All P2S VPN clients' connection health status.
     *
     * @return the vpnClientConnectionHealth value.
     */
    public VpnClientConnectionHealth vpnClientConnectionHealth() {
        return this.vpnClientConnectionHealth;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vpnClientAddressPool() != null) {
            vpnClientAddressPool().validate();
        }
        if (vpnClientConnectionHealth() != null) {
            vpnClientConnectionHealth().validate();
        }
    }
}
