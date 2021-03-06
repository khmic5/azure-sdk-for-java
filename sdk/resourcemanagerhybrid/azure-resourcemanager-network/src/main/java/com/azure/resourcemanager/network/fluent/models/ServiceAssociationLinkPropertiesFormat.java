// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of ServiceAssociationLink. */
@Fluent
public final class ServiceAssociationLinkPropertiesFormat {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceAssociationLinkPropertiesFormat.class);

    /*
     * Resource type of the linked resource.
     */
    @JsonProperty(value = "linkedResourceType")
    private String linkedResourceType;

    /*
     * Link to the external resource.
     */
    @JsonProperty(value = "link")
    private String link;

    /*
     * Provisioning state of the ServiceAssociationLink resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the linkedResourceType property: Resource type of the linked resource.
     *
     * @return the linkedResourceType value.
     */
    public String linkedResourceType() {
        return this.linkedResourceType;
    }

    /**
     * Set the linkedResourceType property: Resource type of the linked resource.
     *
     * @param linkedResourceType the linkedResourceType value to set.
     * @return the ServiceAssociationLinkPropertiesFormat object itself.
     */
    public ServiceAssociationLinkPropertiesFormat withLinkedResourceType(String linkedResourceType) {
        this.linkedResourceType = linkedResourceType;
        return this;
    }

    /**
     * Get the link property: Link to the external resource.
     *
     * @return the link value.
     */
    public String link() {
        return this.link;
    }

    /**
     * Set the link property: Link to the external resource.
     *
     * @param link the link value to set.
     * @return the ServiceAssociationLinkPropertiesFormat object itself.
     */
    public ServiceAssociationLinkPropertiesFormat withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the ServiceAssociationLink resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
