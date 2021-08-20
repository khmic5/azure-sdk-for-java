// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The boolean type style rule object. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("boolean")
@Fluent
public final class BooleanTypeStyleRule extends StyleObject {
    /*
     * Boolean style rules.
     */
    @JsonProperty(value = "rules", required = true)
    private List<BooleanRuleObject> rules;

    /**
     * Get the rules property: Boolean style rules.
     *
     * @return the rules value.
     */
    public List<BooleanRuleObject> getRules() {
        return this.rules;
    }

    /**
     * Set the rules property: Boolean style rules.
     *
     * @param rules the rules value to set.
     * @return the BooleanTypeStyleRule object itself.
     */
    public BooleanTypeStyleRule setRules(List<BooleanRuleObject> rules) {
        this.rules = rules;
        return this;
    }
}
