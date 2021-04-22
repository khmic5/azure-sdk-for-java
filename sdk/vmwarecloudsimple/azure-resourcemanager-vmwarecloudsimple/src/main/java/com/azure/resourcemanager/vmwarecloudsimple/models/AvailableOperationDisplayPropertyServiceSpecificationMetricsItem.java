// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Available operation display property service specification metrics item. */
@Fluent
public final class AvailableOperationDisplayPropertyServiceSpecificationMetricsItem {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(AvailableOperationDisplayPropertyServiceSpecificationMetricsItem.class);

    /*
     * Metric's aggregation type for e.g. (Average, Total)
     */
    @JsonProperty(value = "aggregationType", required = true)
    private AggregationType aggregationType;

    /*
     * Metric's description
     */
    @JsonProperty(value = "displayDescription", required = true)
    private String displayDescription;

    /*
     * Human readable metric's name
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /*
     * Metric's name/id
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Metric's unit
     */
    @JsonProperty(value = "unit", required = true)
    private String unit;

    /**
     * Get the aggregationType property: Metric's aggregation type for e.g. (Average, Total).
     *
     * @return the aggregationType value.
     */
    public AggregationType aggregationType() {
        return this.aggregationType;
    }

    /**
     * Set the aggregationType property: Metric's aggregation type for e.g. (Average, Total).
     *
     * @param aggregationType the aggregationType value to set.
     * @return the AvailableOperationDisplayPropertyServiceSpecificationMetricsItem object itself.
     */
    public AvailableOperationDisplayPropertyServiceSpecificationMetricsItem withAggregationType(
        AggregationType aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Get the displayDescription property: Metric's description.
     *
     * @return the displayDescription value.
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the displayDescription property: Metric's description.
     *
     * @param displayDescription the displayDescription value to set.
     * @return the AvailableOperationDisplayPropertyServiceSpecificationMetricsItem object itself.
     */
    public AvailableOperationDisplayPropertyServiceSpecificationMetricsItem withDisplayDescription(
        String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the displayName property: Human readable metric's name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Human readable metric's name.
     *
     * @param displayName the displayName value to set.
     * @return the AvailableOperationDisplayPropertyServiceSpecificationMetricsItem object itself.
     */
    public AvailableOperationDisplayPropertyServiceSpecificationMetricsItem withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the name property: Metric's name/id.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Metric's name/id.
     *
     * @param name the name value to set.
     * @return the AvailableOperationDisplayPropertyServiceSpecificationMetricsItem object itself.
     */
    public AvailableOperationDisplayPropertyServiceSpecificationMetricsItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the unit property: Metric's unit.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: Metric's unit.
     *
     * @param unit the unit value to set.
     * @return the AvailableOperationDisplayPropertyServiceSpecificationMetricsItem object itself.
     */
    public AvailableOperationDisplayPropertyServiceSpecificationMetricsItem withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (aggregationType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property aggregationType in model"
                            + " AvailableOperationDisplayPropertyServiceSpecificationMetricsItem"));
        }
        if (displayDescription() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property displayDescription in model"
                            + " AvailableOperationDisplayPropertyServiceSpecificationMetricsItem"));
        }
        if (displayName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property displayName in model"
                            + " AvailableOperationDisplayPropertyServiceSpecificationMetricsItem"));
        }
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model"
                            + " AvailableOperationDisplayPropertyServiceSpecificationMetricsItem"));
        }
        if (unit() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property unit in model"
                            + " AvailableOperationDisplayPropertyServiceSpecificationMetricsItem"));
        }
    }
}