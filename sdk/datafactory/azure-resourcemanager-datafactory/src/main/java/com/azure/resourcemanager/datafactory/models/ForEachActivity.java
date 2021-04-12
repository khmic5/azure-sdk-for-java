// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** This activity is used for iterating over a collection and execute given activities. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ForEach")
@JsonFlatten
@Fluent
public class ForEachActivity extends ControlActivity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ForEachActivity.class);

    /*
     * Should the loop be executed in sequence or in parallel (max 50)
     */
    @JsonProperty(value = "typeProperties.isSequential")
    private Boolean isSequential;

    /*
     * Batch count to be used for controlling the number of parallel execution
     * (when isSequential is set to false).
     */
    @JsonProperty(value = "typeProperties.batchCount")
    private Integer batchCount;

    /*
     * Collection to iterate.
     */
    @JsonProperty(value = "typeProperties.items", required = true)
    private Expression items;

    /*
     * List of activities to execute .
     */
    @JsonProperty(value = "typeProperties.activities", required = true)
    private List<Activity> activities;

    /**
     * Get the isSequential property: Should the loop be executed in sequence or in parallel (max 50).
     *
     * @return the isSequential value.
     */
    public Boolean isSequential() {
        return this.isSequential;
    }

    /**
     * Set the isSequential property: Should the loop be executed in sequence or in parallel (max 50).
     *
     * @param isSequential the isSequential value to set.
     * @return the ForEachActivity object itself.
     */
    public ForEachActivity withIsSequential(Boolean isSequential) {
        this.isSequential = isSequential;
        return this;
    }

    /**
     * Get the batchCount property: Batch count to be used for controlling the number of parallel execution (when
     * isSequential is set to false).
     *
     * @return the batchCount value.
     */
    public Integer batchCount() {
        return this.batchCount;
    }

    /**
     * Set the batchCount property: Batch count to be used for controlling the number of parallel execution (when
     * isSequential is set to false).
     *
     * @param batchCount the batchCount value to set.
     * @return the ForEachActivity object itself.
     */
    public ForEachActivity withBatchCount(Integer batchCount) {
        this.batchCount = batchCount;
        return this;
    }

    /**
     * Get the items property: Collection to iterate.
     *
     * @return the items value.
     */
    public Expression items() {
        return this.items;
    }

    /**
     * Set the items property: Collection to iterate.
     *
     * @param items the items value to set.
     * @return the ForEachActivity object itself.
     */
    public ForEachActivity withItems(Expression items) {
        this.items = items;
        return this;
    }

    /**
     * Get the activities property: List of activities to execute .
     *
     * @return the activities value.
     */
    public List<Activity> activities() {
        return this.activities;
    }

    /**
     * Set the activities property: List of activities to execute .
     *
     * @param activities the activities value to set.
     * @return the ForEachActivity object itself.
     */
    public ForEachActivity withActivities(List<Activity> activities) {
        this.activities = activities;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ForEachActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ForEachActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ForEachActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ForEachActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (items() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property items in model ForEachActivity"));
        } else {
            items().validate();
        }
        if (activities() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property activities in model ForEachActivity"));
        } else {
            activities().forEach(e -> e.validate());
        }
    }
}