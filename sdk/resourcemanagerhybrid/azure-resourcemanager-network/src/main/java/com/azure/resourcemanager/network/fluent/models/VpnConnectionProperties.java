// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.IpsecPolicy;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.VirtualNetworkGatewayConnectionProtocol;
import com.azure.resourcemanager.network.models.VpnConnectionStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Parameters for VpnConnection. */
@Fluent
public final class VpnConnectionProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnConnectionProperties.class);

    /*
     * Id of the connected vpn site.
     */
    @JsonProperty(value = "remoteVpnSite")
    private SubResource remoteVpnSite;

    /*
     * routing weight for vpn connection.
     */
    @JsonProperty(value = "routingWeight")
    private Integer routingWeight;

    /*
     * The connection status.
     */
    @JsonProperty(value = "connectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private VpnConnectionStatus connectionStatus;

    /*
     * Connection protocol used for this connection
     */
    @JsonProperty(value = "vpnConnectionProtocolType")
    private VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType;

    /*
     * Ingress bytes transferred.
     */
    @JsonProperty(value = "ingressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long ingressBytesTransferred;

    /*
     * Egress bytes transferred.
     */
    @JsonProperty(value = "egressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long egressBytesTransferred;

    /*
     * Expected bandwidth in MBPS.
     */
    @JsonProperty(value = "connectionBandwidth")
    private Integer connectionBandwidth;

    /*
     * SharedKey for the vpn connection.
     */
    @JsonProperty(value = "sharedKey")
    private String sharedKey;

    /*
     * EnableBgp flag
     */
    @JsonProperty(value = "enableBgp")
    private Boolean enableBgp;

    /*
     * The IPSec Policies to be considered by this connection.
     */
    @JsonProperty(value = "ipsecPolicies")
    private List<IpsecPolicy> ipsecPolicies;

    /*
     * EnableBgp flag
     */
    @JsonProperty(value = "enableRateLimiting")
    private Boolean enableRateLimiting;

    /*
     * Enable internet security
     */
    @JsonProperty(value = "enableInternetSecurity")
    private Boolean enableInternetSecurity;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState")
    private ProvisioningState provisioningState;

    /**
     * Get the remoteVpnSite property: Id of the connected vpn site.
     *
     * @return the remoteVpnSite value.
     */
    public SubResource remoteVpnSite() {
        return this.remoteVpnSite;
    }

    /**
     * Set the remoteVpnSite property: Id of the connected vpn site.
     *
     * @param remoteVpnSite the remoteVpnSite value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withRemoteVpnSite(SubResource remoteVpnSite) {
        this.remoteVpnSite = remoteVpnSite;
        return this;
    }

    /**
     * Get the routingWeight property: routing weight for vpn connection.
     *
     * @return the routingWeight value.
     */
    public Integer routingWeight() {
        return this.routingWeight;
    }

    /**
     * Set the routingWeight property: routing weight for vpn connection.
     *
     * @param routingWeight the routingWeight value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withRoutingWeight(Integer routingWeight) {
        this.routingWeight = routingWeight;
        return this;
    }

    /**
     * Get the connectionStatus property: The connection status.
     *
     * @return the connectionStatus value.
     */
    public VpnConnectionStatus connectionStatus() {
        return this.connectionStatus;
    }

    /**
     * Get the vpnConnectionProtocolType property: Connection protocol used for this connection.
     *
     * @return the vpnConnectionProtocolType value.
     */
    public VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType() {
        return this.vpnConnectionProtocolType;
    }

    /**
     * Set the vpnConnectionProtocolType property: Connection protocol used for this connection.
     *
     * @param vpnConnectionProtocolType the vpnConnectionProtocolType value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withVpnConnectionProtocolType(
        VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType) {
        this.vpnConnectionProtocolType = vpnConnectionProtocolType;
        return this;
    }

    /**
     * Get the ingressBytesTransferred property: Ingress bytes transferred.
     *
     * @return the ingressBytesTransferred value.
     */
    public Long ingressBytesTransferred() {
        return this.ingressBytesTransferred;
    }

    /**
     * Get the egressBytesTransferred property: Egress bytes transferred.
     *
     * @return the egressBytesTransferred value.
     */
    public Long egressBytesTransferred() {
        return this.egressBytesTransferred;
    }

    /**
     * Get the connectionBandwidth property: Expected bandwidth in MBPS.
     *
     * @return the connectionBandwidth value.
     */
    public Integer connectionBandwidth() {
        return this.connectionBandwidth;
    }

    /**
     * Set the connectionBandwidth property: Expected bandwidth in MBPS.
     *
     * @param connectionBandwidth the connectionBandwidth value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withConnectionBandwidth(Integer connectionBandwidth) {
        this.connectionBandwidth = connectionBandwidth;
        return this;
    }

    /**
     * Get the sharedKey property: SharedKey for the vpn connection.
     *
     * @return the sharedKey value.
     */
    public String sharedKey() {
        return this.sharedKey;
    }

    /**
     * Set the sharedKey property: SharedKey for the vpn connection.
     *
     * @param sharedKey the sharedKey value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    /**
     * Get the enableBgp property: EnableBgp flag.
     *
     * @return the enableBgp value.
     */
    public Boolean enableBgp() {
        return this.enableBgp;
    }

    /**
     * Set the enableBgp property: EnableBgp flag.
     *
     * @param enableBgp the enableBgp value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
        return this;
    }

    /**
     * Get the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     *
     * @return the ipsecPolicies value.
     */
    public List<IpsecPolicy> ipsecPolicies() {
        return this.ipsecPolicies;
    }

    /**
     * Set the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     *
     * @param ipsecPolicies the ipsecPolicies value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withIpsecPolicies(List<IpsecPolicy> ipsecPolicies) {
        this.ipsecPolicies = ipsecPolicies;
        return this;
    }

    /**
     * Get the enableRateLimiting property: EnableBgp flag.
     *
     * @return the enableRateLimiting value.
     */
    public Boolean enableRateLimiting() {
        return this.enableRateLimiting;
    }

    /**
     * Set the enableRateLimiting property: EnableBgp flag.
     *
     * @param enableRateLimiting the enableRateLimiting value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withEnableRateLimiting(Boolean enableRateLimiting) {
        this.enableRateLimiting = enableRateLimiting;
        return this;
    }

    /**
     * Get the enableInternetSecurity property: Enable internet security.
     *
     * @return the enableInternetSecurity value.
     */
    public Boolean enableInternetSecurity() {
        return this.enableInternetSecurity;
    }

    /**
     * Set the enableInternetSecurity property: Enable internet security.
     *
     * @param enableInternetSecurity the enableInternetSecurity value to set.
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withEnableInternetSecurity(Boolean enableInternetSecurity) {
        this.enableInternetSecurity = enableInternetSecurity;
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
     * @return the VpnConnectionProperties object itself.
     */
    public VpnConnectionProperties withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipsecPolicies() != null) {
            ipsecPolicies().forEach(e -> e.validate());
        }
    }
}
