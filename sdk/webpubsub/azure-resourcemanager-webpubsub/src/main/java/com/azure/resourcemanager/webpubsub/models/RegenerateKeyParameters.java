// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters describes the request to regenerate access keys. */
@Fluent
public final class RegenerateKeyParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RegenerateKeyParameters.class);

    /*
     * The keyType to regenerate. Must be either 'primary' or
     * 'secondary'(case-insensitive).
     */
    @JsonProperty(value = "keyType")
    private KeyType keyType;

    /**
     * Get the keyType property: The keyType to regenerate. Must be either 'primary' or 'secondary'(case-insensitive).
     *
     * @return the keyType value.
     */
    public KeyType keyType() {
        return this.keyType;
    }

    /**
     * Set the keyType property: The keyType to regenerate. Must be either 'primary' or 'secondary'(case-insensitive).
     *
     * @param keyType the keyType value to set.
     * @return the RegenerateKeyParameters object itself.
     */
    public RegenerateKeyParameters withKeyType(KeyType keyType) {
        this.keyType = keyType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
