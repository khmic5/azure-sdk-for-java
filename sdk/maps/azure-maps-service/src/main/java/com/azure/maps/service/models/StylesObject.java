// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The styles model. */
@Fluent
public final class StylesObject {
    /*
     * An array of stateset styles. The style rule could be a numeric or string
     * or a boolean type style rule.  Refer to NumberRuleObject,
     * StringRuleObject and BooleanRuleObject definitions
     * [here](https://aka.ms/AzureMapsStatesetStylesObject).
     */
    @JsonProperty(value = "styles")
    private List<StyleObject> styles;

    /**
     * Get the styles property: An array of stateset styles. The style rule could be a numeric or string or a boolean
     * type style rule. Refer to NumberRuleObject, StringRuleObject and BooleanRuleObject definitions
     * [here](https://aka.ms/AzureMapsStatesetStylesObject).
     *
     * @return the styles value.
     */
    public List<StyleObject> getStyles() {
        return this.styles;
    }

    /**
     * Set the styles property: An array of stateset styles. The style rule could be a numeric or string or a boolean
     * type style rule. Refer to NumberRuleObject, StringRuleObject and BooleanRuleObject definitions
     * [here](https://aka.ms/AzureMapsStatesetStylesObject).
     *
     * @param styles the styles value to set.
     * @return the StylesObject object itself.
     */
    public StylesObject setStyles(List<StyleObject> styles) {
        this.styles = styles;
        return this;
    }
}
