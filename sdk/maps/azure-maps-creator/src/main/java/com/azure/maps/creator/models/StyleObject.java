// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The stateset style model. The style rule could be a numeric type style rule or a boolean type style rule. Refer to
 * NumberRuleObject, StringRuleObject and BooleanRuleObject definitions
 * [here](https://aka.ms/AzureMapsStatesetStylesObject).
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = StyleObject.class)
@JsonTypeName("StyleObject")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "boolean", value = BooleanTypeStyleRule.class),
    @JsonSubTypes.Type(name = "number", value = NumberTypeStyleRule.class),
    @JsonSubTypes.Type(name = "string", value = StringTypeStyleRule.class)
})
@Fluent
public class StyleObject {
    /*
     * Stateset style key name. Key names are random strings but they should be
     * unique inside style array.
     */
    @JsonProperty(value = "keyName", required = true)
    private String keyName;

    /**
     * Get the keyName property: Stateset style key name. Key names are random strings but they should be unique inside
     * style array.
     *
     * @return the keyName value.
     */
    public String getKeyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: Stateset style key name. Key names are random strings but they should be unique inside
     * style array.
     *
     * @param keyName the keyName value to set.
     * @return the StyleObject object itself.
     */
    public StyleObject setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
}
