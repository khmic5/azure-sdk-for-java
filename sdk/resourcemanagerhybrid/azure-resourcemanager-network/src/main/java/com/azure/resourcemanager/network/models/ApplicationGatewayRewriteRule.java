// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Rewrite rule of an application gateway. */
@Fluent
public final class ApplicationGatewayRewriteRule {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayRewriteRule.class);

    /*
     * Name of the rewrite rule that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Set of actions to be done as part of the rewrite Rule.
     */
    @JsonProperty(value = "actionSet")
    private ApplicationGatewayRewriteRuleActionSet actionSet;

    /**
     * Get the name property: Name of the rewrite rule that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the rewrite rule that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayRewriteRule object itself.
     */
    public ApplicationGatewayRewriteRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the actionSet property: Set of actions to be done as part of the rewrite Rule.
     *
     * @return the actionSet value.
     */
    public ApplicationGatewayRewriteRuleActionSet actionSet() {
        return this.actionSet;
    }

    /**
     * Set the actionSet property: Set of actions to be done as part of the rewrite Rule.
     *
     * @param actionSet the actionSet value to set.
     * @return the ApplicationGatewayRewriteRule object itself.
     */
    public ApplicationGatewayRewriteRule withActionSet(ApplicationGatewayRewriteRuleActionSet actionSet) {
        this.actionSet = actionSet;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (actionSet() != null) {
            actionSet().validate();
        }
    }
}
