// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resources.models.PolicyMode;
import com.azure.resourcemanager.resources.models.PolicyType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The policy definition. */
@Fluent
public final class PolicyDefinitionInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PolicyDefinitionInner.class);

    /*
     * The policy definition properties.
     */
    @JsonProperty(value = "properties")
    private PolicyDefinitionProperties innerProperties;

    /*
     * The ID of the policy definition.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The name of the policy definition.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Get the innerProperties property: The policy definition properties.
     *
     * @return the innerProperties value.
     */
    private PolicyDefinitionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the id property: The ID of the policy definition.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the policy definition.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the policyType property: The type of policy definition. Possible values are NotSpecified, BuiltIn, and
     * Custom.
     *
     * @return the policyType value.
     */
    public PolicyType policyType() {
        return this.innerProperties() == null ? null : this.innerProperties().policyType();
    }

    /**
     * Set the policyType property: The type of policy definition. Possible values are NotSpecified, BuiltIn, and
     * Custom.
     *
     * @param policyType the policyType value to set.
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withPolicyType(PolicyType policyType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyDefinitionProperties();
        }
        this.innerProperties().withPolicyType(policyType);
        return this;
    }

    /**
     * Get the mode property: The policy definition mode. Possible values are NotSpecified, Indexed, and All.
     *
     * @return the mode value.
     */
    public PolicyMode mode() {
        return this.innerProperties() == null ? null : this.innerProperties().mode();
    }

    /**
     * Set the mode property: The policy definition mode. Possible values are NotSpecified, Indexed, and All.
     *
     * @param mode the mode value to set.
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withMode(PolicyMode mode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyDefinitionProperties();
        }
        this.innerProperties().withMode(mode);
        return this;
    }

    /**
     * Get the displayName property: The display name of the policy definition.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name of the policy definition.
     *
     * @param displayName the displayName value to set.
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyDefinitionProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the description property: The policy definition description.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The policy definition description.
     *
     * @param description the description value to set.
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyDefinitionProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the policyRule property: The policy rule.
     *
     * @return the policyRule value.
     */
    public Object policyRule() {
        return this.innerProperties() == null ? null : this.innerProperties().policyRule();
    }

    /**
     * Set the policyRule property: The policy rule.
     *
     * @param policyRule the policyRule value to set.
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withPolicyRule(Object policyRule) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyDefinitionProperties();
        }
        this.innerProperties().withPolicyRule(policyRule);
        return this;
    }

    /**
     * Get the metadata property: The policy definition metadata.
     *
     * @return the metadata value.
     */
    public Object metadata() {
        return this.innerProperties() == null ? null : this.innerProperties().metadata();
    }

    /**
     * Set the metadata property: The policy definition metadata.
     *
     * @param metadata the metadata value to set.
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withMetadata(Object metadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyDefinitionProperties();
        }
        this.innerProperties().withMetadata(metadata);
        return this;
    }

    /**
     * Get the parameters property: Required if a parameter is used in policy rule.
     *
     * @return the parameters value.
     */
    public Object parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Set the parameters property: Required if a parameter is used in policy rule.
     *
     * @param parameters the parameters value to set.
     * @return the PolicyDefinitionInner object itself.
     */
    public PolicyDefinitionInner withParameters(Object parameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyDefinitionProperties();
        }
        this.innerProperties().withParameters(parameters);
        return this;
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
