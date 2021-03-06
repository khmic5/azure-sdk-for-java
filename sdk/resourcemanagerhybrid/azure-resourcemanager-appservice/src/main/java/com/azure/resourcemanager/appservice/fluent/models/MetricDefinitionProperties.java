// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.MetricAvailabilily;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** MetricDefinition resource specific properties. */
@Immutable
public final class MetricDefinitionProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricDefinitionProperties.class);

    /*
     * Unit of the metric.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /*
     * Primary aggregation type.
     */
    @JsonProperty(value = "primaryAggregationType", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryAggregationType;

    /*
     * List of time grains supported for the metric together with retention
     * period.
     */
    @JsonProperty(value = "metricAvailabilities", access = JsonProperty.Access.WRITE_ONLY)
    private List<MetricAvailabilily> metricAvailabilities;

    /*
     * Friendly name shown in the UI.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /**
     * Get the unit property: Unit of the metric.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the primaryAggregationType property: Primary aggregation type.
     *
     * @return the primaryAggregationType value.
     */
    public String primaryAggregationType() {
        return this.primaryAggregationType;
    }

    /**
     * Get the metricAvailabilities property: List of time grains supported for the metric together with retention
     * period.
     *
     * @return the metricAvailabilities value.
     */
    public List<MetricAvailabilily> metricAvailabilities() {
        return this.metricAvailabilities;
    }

    /**
     * Get the displayName property: Friendly name shown in the UI.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metricAvailabilities() != null) {
            metricAvailabilities().forEach(e -> e.validate());
        }
    }
}
