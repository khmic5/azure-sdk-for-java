// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.notificationhubs.fluent.models.SharedAccessAuthorizationRuleProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters supplied to the CreateOrUpdate Namespace AuthorizationRules. */
@Fluent
public final class SharedAccessAuthorizationRuleCreateOrUpdateParameters {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(SharedAccessAuthorizationRuleCreateOrUpdateParameters.class);

    /*
     * Properties of the Namespace AuthorizationRules.
     */
    @JsonProperty(value = "properties", required = true)
    private SharedAccessAuthorizationRuleProperties properties;

    /**
     * Get the properties property: Properties of the Namespace AuthorizationRules.
     *
     * @return the properties value.
     */
    public SharedAccessAuthorizationRuleProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the Namespace AuthorizationRules.
     *
     * @param properties the properties value to set.
     * @return the SharedAccessAuthorizationRuleCreateOrUpdateParameters object itself.
     */
    public SharedAccessAuthorizationRuleCreateOrUpdateParameters withProperties(
        SharedAccessAuthorizationRuleProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property properties in model"
                            + " SharedAccessAuthorizationRuleCreateOrUpdateParameters"));
        } else {
            properties().validate();
        }
    }
}
