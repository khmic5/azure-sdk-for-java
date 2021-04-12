// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Defines the request body for updating move collection. */
@Fluent
public final class UpdateMoveCollectionRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UpdateMoveCollectionRequest.class);

    /*
     * Gets or sets the Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Defines the MSI properties of the Move Collection.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /**
     * Get the tags property: Gets or sets the Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Gets or sets the Resource tags.
     *
     * @param tags the tags value to set.
     * @return the UpdateMoveCollectionRequest object itself.
     */
    public UpdateMoveCollectionRequest withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: Defines the MSI properties of the Move Collection.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Defines the MSI properties of the Move Collection.
     *
     * @param identity the identity value to set.
     * @return the UpdateMoveCollectionRequest object itself.
     */
    public UpdateMoveCollectionRequest withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
    }
}