// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Opening hours for a POI (Points of Interest). */
@Immutable
public final class SearchResultPoiOpeningHours {
    /*
     * Value used in the Request
     */
    @JsonProperty(value = "mode", access = JsonProperty.Access.WRITE_ONLY)
    private String mode;

    /*
     * List of time ranges for the next 7 days
     */
    @JsonProperty(value = "timeRanges", access = JsonProperty.Access.WRITE_ONLY)
    private List<SearchResultPoiOpeningHoursTimeRange> timeRanges;

    /**
     * Get the mode property: Value used in the Request.
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
    public List<SearchResultPoiOpeningHoursTimeRange> getTimeRanges() {
        return this.timeRanges;
    }
}
