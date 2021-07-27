// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Single feature state model. */
@Fluent
public final class FeatureStateObject {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FeatureStateObject.class);

    /*
     * Feature state Keyname. Maximum length allowed is 1000.
     */
    @JsonProperty(value = "keyName")
    private String keyName;

    /*
     * Value for the feature state. Type should comply with the style
     * definition attached to the featurestate. Maximum length allowed for
     * string type is 1024.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * Valid Timestamp when the feature state was captured.
     */
    @JsonProperty(value = "eventTimestamp")
    private String eventTimestamp;

    /**
     * Get the keyName property: Feature state Keyname. Maximum length allowed is 1000.
     *
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: Feature state Keyname. Maximum length allowed is 1000.
     *
     * @param keyName the keyName value to set.
     * @return the FeatureStateObject object itself.
     */
    public FeatureStateObject withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the value property: Value for the feature state. Type should comply with the style definition attached to the
     * featurestate. Maximum length allowed for string type is 1024.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value for the feature state. Type should comply with the style definition attached to the
     * featurestate. Maximum length allowed for string type is 1024.
     *
     * @param value the value value to set.
     * @return the FeatureStateObject object itself.
     */
    public FeatureStateObject withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the eventTimestamp property: Valid Timestamp when the feature state was captured.
     *
     * @return the eventTimestamp value.
     */
    public String eventTimestamp() {
        return this.eventTimestamp;
    }

    /**
     * Set the eventTimestamp property: Valid Timestamp when the feature state was captured.
     *
     * @param eventTimestamp the eventTimestamp value to set.
     * @return the FeatureStateObject object itself.
     */
    public FeatureStateObject withEventTimestamp(String eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
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
