// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ExpressRouteCircuitPeeringConfig;
import com.azure.resourcemanager.network.models.ExpressRoutePeeringState;
import com.azure.resourcemanager.network.models.ExpressRoutePeeringType;
import com.azure.resourcemanager.network.models.Ipv6ExpressRouteCircuitPeeringConfig;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ExpressRouteCrossConnectionPeeringProperties model. */
@Fluent
public final class ExpressRouteCrossConnectionPeeringPropertiesInner {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ExpressRouteCrossConnectionPeeringPropertiesInner.class);

    /*
     * The peering type.
     */
    @JsonProperty(value = "peeringType")
    private ExpressRoutePeeringType peeringType;

    /*
     * The peering state.
     */
    @JsonProperty(value = "state")
    private ExpressRoutePeeringState state;

    /*
     * The Azure ASN.
     */
    @JsonProperty(value = "azureASN", access = JsonProperty.Access.WRITE_ONLY)
    private Integer azureAsn;

    /*
     * The peer ASN.
     */
    @JsonProperty(value = "peerASN")
    private Long peerAsn;

    /*
     * The primary address prefix.
     */
    @JsonProperty(value = "primaryPeerAddressPrefix")
    private String primaryPeerAddressPrefix;

    /*
     * The secondary address prefix.
     */
    @JsonProperty(value = "secondaryPeerAddressPrefix")
    private String secondaryPeerAddressPrefix;

    /*
     * The primary port.
     */
    @JsonProperty(value = "primaryAzurePort", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryAzurePort;

    /*
     * The secondary port.
     */
    @JsonProperty(value = "secondaryAzurePort", access = JsonProperty.Access.WRITE_ONLY)
    private String secondaryAzurePort;

    /*
     * The shared key.
     */
    @JsonProperty(value = "sharedKey")
    private String sharedKey;

    /*
     * The VLAN ID.
     */
    @JsonProperty(value = "vlanId")
    private Integer vlanId;

    /*
     * The Microsoft peering configuration.
     */
    @JsonProperty(value = "microsoftPeeringConfig")
    private ExpressRouteCircuitPeeringConfig microsoftPeeringConfig;

    /*
     * Gets the provisioning state of the public IP resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The GatewayManager Etag.
     */
    @JsonProperty(value = "gatewayManagerEtag")
    private String gatewayManagerEtag;

    /*
     * Gets whether the provider or the customer last modified the peering.
     */
    @JsonProperty(value = "lastModifiedBy")
    private String lastModifiedBy;

    /*
     * The IPv6 peering configuration.
     */
    @JsonProperty(value = "ipv6PeeringConfig")
    private Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig;

    /**
     * Get the peeringType property: The peering type.
     *
     * @return the peeringType value.
     */
    public ExpressRoutePeeringType peeringType() {
        return this.peeringType;
    }

    /**
     * Set the peeringType property: The peering type.
     *
     * @param peeringType the peeringType value to set.
     * @return the ExpressRouteCrossConnectionPeeringPropertiesInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringPropertiesInner withPeeringType(ExpressRoutePeeringType peeringType) {
        this.peeringType = peeringType;
        return this;
    }

    /**
     * Get the state property: The peering state.
     *
     * @return the state value.
     */
    public ExpressRoutePeeringState state() {
        return this.state;
    }

    /**
     * Set the state property: The peering state.
     *
     * @param state the state value to set.
     * @return the ExpressRouteCrossConnectionPeeringPropertiesInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringPropertiesInner withState(ExpressRoutePeeringState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the azureAsn property: The Azure ASN.
     *
     * @return the azureAsn value.
     */
    public Integer azureAsn() {
        return this.azureAsn;
    }

    /**
     * Get the peerAsn property: The peer ASN.
     *
     * @return the peerAsn value.
     */
    public Long peerAsn() {
        return this.peerAsn;
    }

    /**
     * Set the peerAsn property: The peer ASN.
     *
     * @param peerAsn the peerAsn value to set.
     * @return the ExpressRouteCrossConnectionPeeringPropertiesInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringPropertiesInner withPeerAsn(Long peerAsn) {
        this.peerAsn = peerAsn;
        return this;
    }

    /**
     * Get the primaryPeerAddressPrefix property: The primary address prefix.
     *
     * @return the primaryPeerAddressPrefix value.
     */
    public String primaryPeerAddressPrefix() {
        return this.primaryPeerAddressPrefix;
    }

    /**
     * Set the primaryPeerAddressPrefix property: The primary address prefix.
     *
     * @param primaryPeerAddressPrefix the primaryPeerAddressPrefix value to set.
     * @return the ExpressRouteCrossConnectionPeeringPropertiesInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringPropertiesInner withPrimaryPeerAddressPrefix(
        String primaryPeerAddressPrefix) {
        this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
        return this;
    }

    /**
     * Get the secondaryPeerAddressPrefix property: The secondary address prefix.
     *
     * @return the secondaryPeerAddressPrefix value.
     */
    public String secondaryPeerAddressPrefix() {
        return this.secondaryPeerAddressPrefix;
    }

    /**
     * Set the secondaryPeerAddressPrefix property: The secondary address prefix.
     *
     * @param secondaryPeerAddressPrefix the secondaryPeerAddressPrefix value to set.
     * @return the ExpressRouteCrossConnectionPeeringPropertiesInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringPropertiesInner withSecondaryPeerAddressPrefix(
        String secondaryPeerAddressPrefix) {
        this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
        return this;
    }

    /**
     * Get the primaryAzurePort property: The primary port.
     *
     * @return the primaryAzurePort value.
     */
    public String primaryAzurePort() {
        return this.primaryAzurePort;
    }

    /**
     * Get the secondaryAzurePort property: The secondary port.
     *
     * @return the secondaryAzurePort value.
     */
    public String secondaryAzurePort() {
        return this.secondaryAzurePort;
    }

    /**
     * Get the sharedKey property: The shared key.
     *
     * @return the sharedKey value.
     */
    public String sharedKey() {
        return this.sharedKey;
    }

    /**
     * Set the sharedKey property: The shared key.
     *
     * @param sharedKey the sharedKey value to set.
     * @return the ExpressRouteCrossConnectionPeeringPropertiesInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringPropertiesInner withSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    /**
     * Get the vlanId property: The VLAN ID.
     *
     * @return the vlanId value.
     */
    public Integer vlanId() {
        return this.vlanId;
    }

    /**
     * Set the vlanId property: The VLAN ID.
     *
     * @param vlanId the vlanId value to set.
     * @return the ExpressRouteCrossConnectionPeeringPropertiesInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringPropertiesInner withVlanId(Integer vlanId) {
        this.vlanId = vlanId;
        return this;
    }

    /**
     * Get the microsoftPeeringConfig property: The Microsoft peering configuration.
     *
     * @return the microsoftPeeringConfig value.
     */
    public ExpressRouteCircuitPeeringConfig microsoftPeeringConfig() {
        return this.microsoftPeeringConfig;
    }

    /**
     * Set the microsoftPeeringConfig property: The Microsoft peering configuration.
     *
     * @param microsoftPeeringConfig the microsoftPeeringConfig value to set.
     * @return the ExpressRouteCrossConnectionPeeringPropertiesInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringPropertiesInner withMicrosoftPeeringConfig(
        ExpressRouteCircuitPeeringConfig microsoftPeeringConfig) {
        this.microsoftPeeringConfig = microsoftPeeringConfig;
        return this;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the gatewayManagerEtag property: The GatewayManager Etag.
     *
     * @return the gatewayManagerEtag value.
     */
    public String gatewayManagerEtag() {
        return this.gatewayManagerEtag;
    }

    /**
     * Set the gatewayManagerEtag property: The GatewayManager Etag.
     *
     * @param gatewayManagerEtag the gatewayManagerEtag value to set.
     * @return the ExpressRouteCrossConnectionPeeringPropertiesInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringPropertiesInner withGatewayManagerEtag(String gatewayManagerEtag) {
        this.gatewayManagerEtag = gatewayManagerEtag;
        return this;
    }

    /**
     * Get the lastModifiedBy property: Gets whether the provider or the customer last modified the peering.
     *
     * @return the lastModifiedBy value.
     */
    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Set the lastModifiedBy property: Gets whether the provider or the customer last modified the peering.
     *
     * @param lastModifiedBy the lastModifiedBy value to set.
     * @return the ExpressRouteCrossConnectionPeeringPropertiesInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringPropertiesInner withLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * Get the ipv6PeeringConfig property: The IPv6 peering configuration.
     *
     * @return the ipv6PeeringConfig value.
     */
    public Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig() {
        return this.ipv6PeeringConfig;
    }

    /**
     * Set the ipv6PeeringConfig property: The IPv6 peering configuration.
     *
     * @param ipv6PeeringConfig the ipv6PeeringConfig value to set.
     * @return the ExpressRouteCrossConnectionPeeringPropertiesInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringPropertiesInner withIpv6PeeringConfig(
        Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig) {
        this.ipv6PeeringConfig = ipv6PeeringConfig;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (microsoftPeeringConfig() != null) {
            microsoftPeeringConfig().validate();
        }
        if (ipv6PeeringConfig() != null) {
            ipv6PeeringConfig().validate();
        }
    }
}
