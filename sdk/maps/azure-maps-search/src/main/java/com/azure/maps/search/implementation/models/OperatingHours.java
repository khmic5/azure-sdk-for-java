// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Opening hours for a POI (Points of Interest). */
@Immutable
public final class OperatingHours {
    /*
     * Value used in the request: none or "nextSevenDays"
     */
    @JsonProperty(value = "mode", access = JsonProperty.Access.WRITE_ONLY)
    private String mode;

    /*
     * List of time ranges for the next 7 days
     */
    @JsonProperty(value = "timeRanges", access = JsonProperty.Access.WRITE_ONLY)
    private List<OperatingHoursTimeRange> timeRanges;

    /**
     * Get the mode property: Value used in the request: none or "nextSevenDays".
     *
     * @return the mode value.
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * Get the timeRanges property: List of time ranges for the next 7 days.
     *
     * @return the timeRanges value.
     */
    public List<OperatingHoursTimeRange> getTimeRanges() {
        return this.timeRanges;
    }
}
