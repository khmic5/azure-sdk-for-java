// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.IpsecPolicy;
import com.azure.resourcemanager.network.models.P2SVpnServerConfigRadiusClientRootCertificate;
import com.azure.resourcemanager.network.models.P2SVpnServerConfigRadiusServerRootCertificate;
import com.azure.resourcemanager.network.models.P2SVpnServerConfigVpnClientRevokedCertificate;
import com.azure.resourcemanager.network.models.P2SVpnServerConfigVpnClientRootCertificate;
import com.azure.resourcemanager.network.models.VpnGatewayTunnelingProtocol;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Parameters for P2SVpnServerConfiguration. */
@Fluent
public final class P2SVpnServerConfigurationProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(P2SVpnServerConfigurationProperties.class);

    /*
     * The name of the P2SVpnServerConfiguration that is unique within a
     * VirtualWan in a resource group. This name can be used to access the
     * resource along with Paren VirtualWan resource name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * vpnProtocols for the P2SVpnServerConfiguration.
     */
    @JsonProperty(value = "vpnProtocols")
    private List<VpnGatewayTunnelingProtocol> vpnProtocols;

    /*
     * VPN client root certificate of P2SVpnServerConfiguration.
     */
    @JsonProperty(value = "p2SVpnServerConfigVpnClientRootCertificates")
    private List<P2SVpnServerConfigVpnClientRootCertificate> p2SVpnServerConfigVpnClientRootCertificates;

    /*
     * VPN client revoked certificate of P2SVpnServerConfiguration.
     */
    @JsonProperty(value = "p2SVpnServerConfigVpnClientRevokedCertificates")
    private List<P2SVpnServerConfigVpnClientRevokedCertificate> p2SVpnServerConfigVpnClientRevokedCertificates;

    /*
     * Radius Server root certificate of P2SVpnServerConfiguration.
     */
    @JsonProperty(value = "p2SVpnServerConfigRadiusServerRootCertificates")
    private List<P2SVpnServerConfigRadiusServerRootCertificate> p2SVpnServerConfigRadiusServerRootCertificates;

    /*
     * Radius client root certificate of P2SVpnServerConfiguration.
     */
    @JsonProperty(value = "p2SVpnServerConfigRadiusClientRootCertificates")
    private List<P2SVpnServerConfigRadiusClientRootCertificate> p2SVpnServerConfigRadiusClientRootCertificates;

    /*
     * VpnClientIpsecPolicies for P2SVpnServerConfiguration.
     */
    @JsonProperty(value = "vpnClientIpsecPolicies")
    private List<IpsecPolicy> vpnClientIpsecPolicies;

    /*
     * The radius server address property of the P2SVpnServerConfiguration
     * resource for point to site client connection.
     */
    @JsonProperty(value = "radiusServerAddress")
    private String radiusServerAddress;

    /*
     * The radius secret property of the P2SVpnServerConfiguration resource for
     * point to site client connection.
     */
    @JsonProperty(value = "radiusServerSecret")
    private String radiusServerSecret;

    /*
     * The provisioning state of the P2SVpnServerConfiguration resource.
     * Possible values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The p2SVpnGateways property.
     */
    @JsonProperty(value = "p2SVpnGateways", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> p2SVpnGateways;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the name property: The name of the P2SVpnServerConfiguration that is unique within a VirtualWan in a resource
     * group. This name can be used to access the resource along with Paren VirtualWan resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the P2SVpnServerConfiguration that is unique within a VirtualWan in a resource
     * group. This name can be used to access the resource along with Paren VirtualWan resource name.
     *
     * @param name the name value to set.
     * @return the P2SVpnServerConfigurationProperties object itself.
     */
    public P2SVpnServerConfigurationProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the vpnProtocols property: vpnProtocols for the P2SVpnServerConfiguration.
     *
     * @return the vpnProtocols value.
     */
    public List<VpnGatewayTunnelingProtocol> vpnProtocols() {
        return this.vpnProtocols;
    }

    /**
     * Set the vpnProtocols property: vpnProtocols for the P2SVpnServerConfiguration.
     *
     * @param vpnProtocols the vpnProtocols value to set.
     * @return the P2SVpnServerConfigurationProperties object itself.
     */
    public P2SVpnServerConfigurationProperties withVpnProtocols(List<VpnGatewayTunnelingProtocol> vpnProtocols) {
        this.vpnProtocols = vpnProtocols;
        return this;
    }

    /**
     * Get the p2SVpnServerConfigVpnClientRootCertificates property: VPN client root certificate of
     * P2SVpnServerConfiguration.
     *
     * @return the p2SVpnServerConfigVpnClientRootCertificates value.
     */
    public List<P2SVpnServerConfigVpnClientRootCertificate> p2SVpnServerConfigVpnClientRootCertificates() {
        return this.p2SVpnServerConfigVpnClientRootCertificates;
    }

    /**
     * Set the p2SVpnServerConfigVpnClientRootCertificates property: VPN client root certificate of
     * P2SVpnServerConfiguration.
     *
     * @param p2SVpnServerConfigVpnClientRootCertificates the p2SVpnServerConfigVpnClientRootCertificates value to set.
     * @return the P2SVpnServerConfigurationProperties object itself.
     */
    public P2SVpnServerConfigurationProperties withP2SVpnServerConfigVpnClientRootCertificates(
        List<P2SVpnServerConfigVpnClientRootCertificate> p2SVpnServerConfigVpnClientRootCertificates) {
        this.p2SVpnServerConfigVpnClientRootCertificates = p2SVpnServerConfigVpnClientRootCertificates;
        return this;
    }

    /**
     * Get the p2SVpnServerConfigVpnClientRevokedCertificates property: VPN client revoked certificate of
     * P2SVpnServerConfiguration.
     *
     * @return the p2SVpnServerConfigVpnClientRevokedCertificates value.
     */
    public List<P2SVpnServerConfigVpnClientRevokedCertificate> p2SVpnServerConfigVpnClientRevokedCertificates() {
        return this.p2SVpnServerConfigVpnClientRevokedCertificates;
    }

    /**
     * Set the p2SVpnServerConfigVpnClientRevokedCertificates property: VPN client revoked certificate of
     * P2SVpnServerConfiguration.
     *
     * @param p2SVpnServerConfigVpnClientRevokedCertificates the p2SVpnServerConfigVpnClientRevokedCertificates value to
     *     set.
     * @return the P2SVpnServerConfigurationProperties object itself.
     */
    public P2SVpnServerConfigurationProperties withP2SVpnServerConfigVpnClientRevokedCertificates(
        List<P2SVpnServerConfigVpnClientRevokedCertificate> p2SVpnServerConfigVpnClientRevokedCertificates) {
        this.p2SVpnServerConfigVpnClientRevokedCertificates = p2SVpnServerConfigVpnClientRevokedCertificates;
        return this;
    }

    /**
     * Get the p2SVpnServerConfigRadiusServerRootCertificates property: Radius Server root certificate of
     * P2SVpnServerConfiguration.
     *
     * @return the p2SVpnServerConfigRadiusServerRootCertificates value.
     */
    public List<P2SVpnServerConfigRadiusServerRootCertificate> p2SVpnServerConfigRadiusServerRootCertificates() {
        return this.p2SVpnServerConfigRadiusServerRootCertificates;
    }

    /**
     * Set the p2SVpnServerConfigRadiusServerRootCertificates property: Radius Server root certificate of
     * P2SVpnServerConfiguration.
     *
     * @param p2SVpnServerConfigRadiusServerRootCertificates the p2SVpnServerConfigRadiusServerRootCertificates value to
     *     set.
     * @return the P2SVpnServerConfigurationProperties object itself.
     */
    public P2SVpnServerConfigurationProperties withP2SVpnServerConfigRadiusServerRootCertificates(
        List<P2SVpnServerConfigRadiusServerRootCertificate> p2SVpnServerConfigRadiusServerRootCertificates) {
        this.p2SVpnServerConfigRadiusServerRootCertificates = p2SVpnServerConfigRadiusServerRootCertificates;
        return this;
    }

    /**
     * Get the p2SVpnServerConfigRadiusClientRootCertificates property: Radius client root certificate of
     * P2SVpnServerConfiguration.
     *
     * @return the p2SVpnServerConfigRadiusClientRootCertificates value.
     */
    public List<P2SVpnServerConfigRadiusClientRootCertificate> p2SVpnServerConfigRadiusClientRootCertificates() {
        return this.p2SVpnServerConfigRadiusClientRootCertificates;
    }

    /**
     * Set the p2SVpnServerConfigRadiusClientRootCertificates property: Radius client root certificate of
     * P2SVpnServerConfiguration.
     *
     * @param p2SVpnServerConfigRadiusClientRootCertificates the p2SVpnServerConfigRadiusClientRootCertificates value to
     *     set.
     * @return the P2SVpnServerConfigurationProperties object itself.
     */
    public P2SVpnServerConfigurationProperties withP2SVpnServerConfigRadiusClientRootCertificates(
        List<P2SVpnServerConfigRadiusClientRootCertificate> p2SVpnServerConfigRadiusClientRootCertificates) {
        this.p2SVpnServerConfigRadiusClientRootCertificates = p2SVpnServerConfigRadiusClientRootCertificates;
        return this;
    }

    /**
     * Get the vpnClientIpsecPolicies property: VpnClientIpsecPolicies for P2SVpnServerConfiguration.
     *
     * @return the vpnClientIpsecPolicies value.
     */
    public List<IpsecPolicy> vpnClientIpsecPolicies() {
        return this.vpnClientIpsecPolicies;
    }

    /**
     * Set the vpnClientIpsecPolicies property: VpnClientIpsecPolicies for P2SVpnServerConfiguration.
     *
     * @param vpnClientIpsecPolicies the vpnClientIpsecPolicies value to set.
     * @return the P2SVpnServerConfigurationProperties object itself.
     */
    public P2SVpnServerConfigurationProperties withVpnClientIpsecPolicies(List<IpsecPolicy> vpnClientIpsecPolicies) {
        this.vpnClientIpsecPolicies = vpnClientIpsecPolicies;
        return this;
    }

    /**
     * Get the radiusServerAddress property: The radius server address property of the P2SVpnServerConfiguration
     * resource for point to site client connection.
     *
     * @return the radiusServerAddress value.
     */
    public String radiusServerAddress() {
        return this.radiusServerAddress;
    }

    /**
     * Set the radiusServerAddress property: The radius server address property of the P2SVpnServerConfiguration
     * resource for point to site client connection.
     *
     * @param radiusServerAddress the radiusServerAddress value to set.
     * @return the P2SVpnServerConfigurationProperties object itself.
     */
    public P2SVpnServerConfigurationProperties withRadiusServerAddress(String radiusServerAddress) {
        this.radiusServerAddress = radiusServerAddress;
        return this;
    }

    /**
     * Get the radiusServerSecret property: The radius secret property of the P2SVpnServerConfiguration resource for
     * point to site client connection.
     *
     * @return the radiusServerSecret value.
     */
    public String radiusServerSecret() {
        return this.radiusServerSecret;
    }

    /**
     * Set the radiusServerSecret property: The radius secret property of the P2SVpnServerConfiguration resource for
     * point to site client connection.
     *
     * @param radiusServerSecret the radiusServerSecret value to set.
     * @return the P2SVpnServerConfigurationProperties object itself.
     */
    public P2SVpnServerConfigurationProperties withRadiusServerSecret(String radiusServerSecret) {
        this.radiusServerSecret = radiusServerSecret;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the P2SVpnServerConfiguration resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the p2SVpnGateways property: The p2SVpnGateways property.
     *
     * @return the p2SVpnGateways value.
     */
    public List<SubResource> p2SVpnGateways() {
        return this.p2SVpnGateways;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the P2SVpnServerConfigurationProperties object itself.
     */
    public P2SVpnServerConfigurationProperties withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (p2SVpnServerConfigVpnClientRootCertificates() != null) {
            p2SVpnServerConfigVpnClientRootCertificates().forEach(e -> e.validate());
        }
        if (p2SVpnServerConfigVpnClientRevokedCertificates() != null) {
            p2SVpnServerConfigVpnClientRevokedCertificates().forEach(e -> e.validate());
        }
        if (p2SVpnServerConfigRadiusServerRootCertificates() != null) {
            p2SVpnServerConfigRadiusServerRootCertificates().forEach(e -> e.validate());
        }
        if (p2SVpnServerConfigRadiusClientRootCertificates() != null) {
            p2SVpnServerConfigRadiusClientRootCertificates().forEach(e -> e.validate());
        }
        if (vpnClientIpsecPolicies() != null) {
            vpnClientIpsecPolicies().forEach(e -> e.validate());
        }
    }
}
