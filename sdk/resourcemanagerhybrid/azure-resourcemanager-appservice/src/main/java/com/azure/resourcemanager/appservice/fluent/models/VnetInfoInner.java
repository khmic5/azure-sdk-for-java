// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Virtual Network information contract. */
@Fluent
public final class VnetInfoInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VnetInfoInner.class);

    /*
     * VnetInfo resource specific properties
     */
    @JsonProperty(value = "properties")
    private VnetInfoProperties innerProperties;

    /**
     * Get the innerProperties property: VnetInfo resource specific properties.
     *
     * @return the innerProperties value.
     */
    private VnetInfoProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public VnetInfoInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the vnetResourceId property: The Virtual Network's resource ID.
     *
     * @return the vnetResourceId value.
     */
    public String vnetResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().vnetResourceId();
    }

    /**
     * Set the vnetResourceId property: The Virtual Network's resource ID.
     *
     * @param vnetResourceId the vnetResourceId value to set.
     * @return the VnetInfoInner object itself.
     */
    public VnetInfoInner withVnetResourceId(String vnetResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetInfoProperties();
        }
        this.innerProperties().withVnetResourceId(vnetResourceId);
        return this;
    }

    /**
     * Get the certThumbprint property: The client certificate thumbprint.
     *
     * @return the certThumbprint value.
     */
    public String certThumbprint() {
        return this.innerProperties() == null ? null : this.innerProperties().certThumbprint();
    }

    /**
     * Get the certBlob property: A certificate file (.cer) blob containing the public key of the private key used to
     * authenticate a Point-To-Site VPN connection.
     *
     * @return the certBlob value.
     */
    public String certBlob() {
        return this.innerProperties() == null ? null : this.innerProperties().certBlob();
    }

    /**
     * Set the certBlob property: A certificate file (.cer) blob containing the public key of the private key used to
     * authenticate a Point-To-Site VPN connection.
     *
     * @param certBlob the certBlob value to set.
     * @return the VnetInfoInner object itself.
     */
    public VnetInfoInner withCertBlob(String certBlob) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetInfoProperties();
        }
        this.innerProperties().withCertBlob(certBlob);
        return this;
    }

    /**
     * Get the routes property: The routes that this Virtual Network connection uses.
     *
     * @return the routes value.
     */
    public List<VnetRouteInner> routes() {
        return this.innerProperties() == null ? null : this.innerProperties().routes();
    }

    /**
     * Get the resyncRequired property: &lt;code&gt;true&lt;/code&gt; if a resync is required; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the resyncRequired value.
     */
    public Boolean resyncRequired() {
        return this.innerProperties() == null ? null : this.innerProperties().resyncRequired();
    }

    /**
     * Get the dnsServers property: DNS servers to be used by this Virtual Network. This should be a comma-separated
     * list of IP addresses.
     *
     * @return the dnsServers value.
     */
    public String dnsServers() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsServers();
    }

    /**
     * Set the dnsServers property: DNS servers to be used by this Virtual Network. This should be a comma-separated
     * list of IP addresses.
     *
     * @param dnsServers the dnsServers value to set.
     * @return the VnetInfoInner object itself.
     */
    public VnetInfoInner withDnsServers(String dnsServers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetInfoProperties();
        }
        this.innerProperties().withDnsServers(dnsServers);
        return this;
    }

    /**
     * Get the isSwift property: Flag that is used to denote if this is VNET injection.
     *
     * @return the isSwift value.
     */
    public Boolean isSwift() {
        return this.innerProperties() == null ? null : this.innerProperties().isSwift();
    }

    /**
     * Set the isSwift property: Flag that is used to denote if this is VNET injection.
     *
     * @param isSwift the isSwift value to set.
     * @return the VnetInfoInner object itself.
     */
    public VnetInfoInner withIsSwift(Boolean isSwift) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VnetInfoProperties();
        }
        this.innerProperties().withIsSwift(isSwift);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
