// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.models.VpnClientRevokedCertificatePropertiesFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** VPN client revoked certificate of virtual network gateway. */
@Fluent
public final class VpnClientRevokedCertificate extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnClientRevokedCertificate.class);

    /*
     * Properties of the vpn client revoked certificate.
     */
    @JsonProperty(value = "properties")
    private VpnClientRevokedCertificatePropertiesFormat innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the innerProperties property: Properties of the vpn client revoked certificate.
     *
     * @return the innerProperties value.
     */
    private VpnClientRevokedCertificatePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the VpnClientRevokedCertificate object itself.
     */
    public VpnClientRevokedCertificate withName(String name) {
        this.name = name;
        return this;
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
     * @return the VpnClientRevokedCertificate object itself.
     */
    public VpnClientRevokedCertificate withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VpnClientRevokedCertificate withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the thumbprint property: The revoked VPN client certificate thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.innerProperties() == null ? null : this.innerProperties().thumbprint();
    }

    /**
     * Set the thumbprint property: The revoked VPN client certificate thumbprint.
     *
     * @param thumbprint the thumbprint value to set.
     * @return the VpnClientRevokedCertificate object itself.
     */
    public VpnClientRevokedCertificate withThumbprint(String thumbprint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnClientRevokedCertificatePropertiesFormat();
        }
        this.innerProperties().withThumbprint(thumbprint);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN client revoked certificate resource.
     * Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
