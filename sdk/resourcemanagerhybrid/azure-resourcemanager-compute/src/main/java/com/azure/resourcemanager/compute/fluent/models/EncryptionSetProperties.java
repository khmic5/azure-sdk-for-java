// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.KeyVaultAndKeyReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The EncryptionSetProperties model. */
@Fluent
public final class EncryptionSetProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EncryptionSetProperties.class);

    /*
     * The key vault key which is currently used by this disk encryption set.
     */
    @JsonProperty(value = "activeKey")
    private KeyVaultAndKeyReference activeKey;

    /*
     * A readonly collection of key vault keys previously used by this disk
     * encryption set while a key rotation is in progress. It will be empty if
     * there is no ongoing key rotation.
     */
    @JsonProperty(value = "previousKeys", access = JsonProperty.Access.WRITE_ONLY)
    private List<KeyVaultAndKeyReference> previousKeys;

    /*
     * The disk encryption set provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the activeKey property: The key vault key which is currently used by this disk encryption set.
     *
     * @return the activeKey value.
     */
    public KeyVaultAndKeyReference activeKey() {
        return this.activeKey;
    }

    /**
     * Set the activeKey property: The key vault key which is currently used by this disk encryption set.
     *
     * @param activeKey the activeKey value to set.
     * @return the EncryptionSetProperties object itself.
     */
    public EncryptionSetProperties withActiveKey(KeyVaultAndKeyReference activeKey) {
        this.activeKey = activeKey;
        return this;
    }

    /**
     * Get the previousKeys property: A readonly collection of key vault keys previously used by this disk encryption
     * set while a key rotation is in progress. It will be empty if there is no ongoing key rotation.
     *
     * @return the previousKeys value.
     */
    public List<KeyVaultAndKeyReference> previousKeys() {
        return this.previousKeys;
    }

    /**
     * Get the provisioningState property: The disk encryption set provisioning state.
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
        if (activeKey() != null) {
            activeKey().validate();
        }
        if (previousKeys() != null) {
            previousKeys().forEach(e -> e.validate());
        }
    }
}
