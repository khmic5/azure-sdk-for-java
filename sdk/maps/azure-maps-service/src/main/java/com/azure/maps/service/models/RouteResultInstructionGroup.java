// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Groups a sequence of instruction elements which are related to each other. The sequence range is constrained with
 * firstInstructionIndex and lastInstructionIndex. When human-readable text messages are requested for guidance
 * (instructionType=text or tagged), then the instructionGroup has a summary message returned when available.
 */
@Immutable
public final class RouteResultInstructionGroup {
    /*
     * Index of the first instruction.
     */
    @JsonProperty(value = "firstInstructionIndex", access = JsonProperty.Access.WRITE_ONLY)
    private Integer firstInstructionIndex;

    /*
     * Index of the last instruction.
     */
    @JsonProperty(value = "lastInstructionIndex", access = JsonProperty.Access.WRITE_ONLY)
    private Integer lastInstructionIndex;

    /*
     * Length of the group.
     */
    @JsonProperty(value = "groupLengthInMeters", access = JsonProperty.Access.WRITE_ONLY)
    private Integer groupLengthInMeters;

    /*
     * Summary message when human-readable text messages are requested for
     * guidance (instructionType=text or tagged).
     */
    @JsonProperty(value = "groupMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String groupMessage;

    /**
     * Get the firstInstructionIndex property: Index of the first instruction.
     *
     * @return the firstInstructionIndex value.
     */
    public Integer getFirstInstructionIndex() {
        return this.firstInstructionIndex;
    }

    /**
     * Get the lastInstructionIndex property: Index of the last instruction.
     *
     * @return the lastInstructionIndex value.
     */
    public Integer getLastInstructionIndex() {
        return this.lastInstructionIndex;
    }

    /**
     * Get the groupLengthInMeters property: Length of the group.
     *
     * @return the groupLengthInMeters value.
     */
    public Integer getGroupLengthInMeters() {
        return this.groupLengthInMeters;
    }

    /**
     * Get the groupMessage property: Summary message when human-readable text messages are requested for guidance
     * (instructionType=text or tagged).
     *
     * @return the groupMessage value.
     */
    public String getGroupMessage() {
        return this.groupMessage;
    }
}
