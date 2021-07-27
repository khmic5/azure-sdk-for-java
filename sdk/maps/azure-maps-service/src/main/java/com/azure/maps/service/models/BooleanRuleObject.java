// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The boolean rule. The color is selected based on the logic value of the key. */
@Fluent
public final class BooleanRuleObject {
    /*
     * The color when value is true. Color is a JSON string in a variety of
     * permitted formats, HTML-style hex values, RGB ("#ff0", "#ffff00",
     * "rgb(255, 255, 0)"), RGBA ("rgba(255, 255, 0, 1)"), HSL("hsl(100, 50%,
     * 50%)"), and HSLA("hsla(100, 50%, 50%, 1)"). Predefined HTML colors
     * names, like yellow and blue, are also permitted.
     */
    @JsonProperty(value = "true")
    private String trueProperty;

    /*
     * The color when value is false. Color is a JSON string in a variety of
     * permitted formats, HTML-style hex values, RGB ("#ff0", "#ffff00",
     * "rgb(255, 255, 0)"), RGBA ("rgba(255, 255, 0, 1)"), HSL("hsl(100, 50%,
     * 50%)"), and HSLA("hsla(100, 50%, 50%, 1)"). Predefined HTML colors
     * names, like yellow and blue, are also permitted.
     */
    @JsonProperty(value = "false")
    private String falseProperty;

    /**
     * Get the trueProperty property: The color when value is true. Color is a JSON string in a variety of permitted
     * formats, HTML-style hex values, RGB ("#ff0", "#ffff00", "rgb(255, 255, 0)"), RGBA ("rgba(255, 255, 0, 1)"),
     * HSL("hsl(100, 50%, 50%)"), and HSLA("hsla(100, 50%, 50%, 1)"). Predefined HTML colors names, like yellow and
     * blue, are also permitted.
     *
     * @return the trueProperty value.
     */
    public String getTrueProperty() {
        return this.trueProperty;
    }

    /**
     * Set the trueProperty property: The color when value is true. Color is a JSON string in a variety of permitted
     * formats, HTML-style hex values, RGB ("#ff0", "#ffff00", "rgb(255, 255, 0)"), RGBA ("rgba(255, 255, 0, 1)"),
     * HSL("hsl(100, 50%, 50%)"), and HSLA("hsla(100, 50%, 50%, 1)"). Predefined HTML colors names, like yellow and
     * blue, are also permitted.
     *
     * @param trueProperty the trueProperty value to set.
     * @return the BooleanRuleObject object itself.
     */
    public BooleanRuleObject setTrueProperty(String trueProperty) {
        this.trueProperty = trueProperty;
        return this;
    }

    /**
     * Get the falseProperty property: The color when value is false. Color is a JSON string in a variety of permitted
     * formats, HTML-style hex values, RGB ("#ff0", "#ffff00", "rgb(255, 255, 0)"), RGBA ("rgba(255, 255, 0, 1)"),
     * HSL("hsl(100, 50%, 50%)"), and HSLA("hsla(100, 50%, 50%, 1)"). Predefined HTML colors names, like yellow and
     * blue, are also permitted.
     *
     * @return the falseProperty value.
     */
    public String getFalseProperty() {
        return this.falseProperty;
    }

    /**
     * Set the falseProperty property: The color when value is false. Color is a JSON string in a variety of permitted
     * formats, HTML-style hex values, RGB ("#ff0", "#ffff00", "rgb(255, 255, 0)"), RGBA ("rgba(255, 255, 0, 1)"),
     * HSL("hsl(100, 50%, 50%)"), and HSLA("hsla(100, 50%, 50%, 1)"). Predefined HTML colors names, like yellow and
     * blue, are also permitted.
     *
     * @param falseProperty the falseProperty value to set.
     * @return the BooleanRuleObject object itself.
     */
    public BooleanRuleObject setFalseProperty(String falseProperty) {
        this.falseProperty = falseProperty;
        return this;
    }
}
