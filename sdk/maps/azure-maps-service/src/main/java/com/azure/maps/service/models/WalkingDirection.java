// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The walking directions guidance. */
@Fluent
public final class WalkingDirection {
    /*
     * The relative walking direction associated with applicable step.
     */
    @JsonProperty(value = "relativeDirection")
    private RelativeDirection relativeDirection;

    /*
     * The absolute walking direction associated with this step.
     */
    @JsonProperty(value = "absoluteDirection")
    private AbsoluteDirection absoluteDirection;

    /**
     * Get the relativeDirection property: The relative walking direction associated with applicable step.
     *
     * @return the relativeDirection value.
     */
    public RelativeDirection getRelativeDirection() {
        return this.relativeDirection;
    }

    /**
     * Set the relativeDirection property: The relative walking direction associated with applicable step.
     *
     * @param relativeDirection the relativeDirection value to set.
     * @return the WalkingDirection object itself.
     */
    public WalkingDirection setRelativeDirection(RelativeDirection relativeDirection) {
        this.relativeDirection = relativeDirection;
        return this;
    }

    /**
     * Get the absoluteDirection property: The absolute walking direction associated with this step.
     *
     * @return the absoluteDirection value.
     */
    public AbsoluteDirection getAbsoluteDirection() {
        return this.absoluteDirection;
    }

    /**
     * Set the absoluteDirection property: The absolute walking direction associated with this step.
     *
     * @param absoluteDirection the absoluteDirection value to set.
     * @return the WalkingDirection object itself.
     */
    public WalkingDirection setAbsoluteDirection(AbsoluteDirection absoluteDirection) {
        this.absoluteDirection = absoluteDirection;
        return this;
    }
}
