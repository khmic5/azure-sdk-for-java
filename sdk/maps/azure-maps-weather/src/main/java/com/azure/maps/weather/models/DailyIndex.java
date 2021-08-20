// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Information about a daily index. */
@Fluent
public final class DailyIndex {
    /*
     * Name of the index, for example, "Construction", "Outdoor Activity",
     * "Flight Delays".
     */
    @JsonProperty(value = "indexName")
    private String indexName;

    /*
     * Numeric ID used to identify the specific index. Please refer to [Weather
     * Service Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details
     * and to see the supported index IDs. For example, the index ID can
     * support UI visualization scenarios.
     */
    @JsonProperty(value = "indexId")
    private Integer indexId;

    /*
     * Date and time of the current observation displayed in ISO 8601 format,
     * for example, 2019-10-27T19:39:57-08:00.
     */
    @JsonProperty(value = "dateTime")
    private OffsetDateTime dateTime;

    /*
     * Index value. Ranges from 0.0 to 10.0. Please refer to [Weather Service
     * Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details and to
     * see the supported ranges.
     */
    @JsonProperty(value = "value")
    private Float value;

    /*
     * Textual description for `categoryValue` corresponding to the level that
     * the index value falls under, for example "Very Good".
     */
    @JsonProperty(value = "category")
    private String category;

    /*
     * Level that the index value falls under, represented by an integer. This
     * value can be 1 through 5 and should be used in combination with the
     * `ascending` flag because it can differ among indices. For example, the
     * following values apply for Mosquito Activity: Low=1, Moderate=2, High=3,
     * Very High=4, and Extreme=5.
     */
    @JsonProperty(value = "categoryValue")
    private Integer categoryValue;

    /*
     * Describes the direction of the `value` and `categoryValue`. For example,
     * when `ascending`=True, the poorest index value is 0 and the best index
     * value is 10. When `ascending`=True, the poorest index value is 10 and
     * the best index value is 0.
     */
    @JsonProperty(value = "ascending")
    private Boolean ascending;

    /*
     * A textual explanation that can be used for display purposes to summarize
     * the index value and category. For example, when the index value for
     * Flight Delays is very good, the description will be "Conditions are
     * excellent for flying!".
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the indexName property: Name of the index, for example, "Construction", "Outdoor Activity", "Flight Delays".
     *
     * @return the indexName value.
     */
    public String getIndexName() {
        return this.indexName;
    }

    /**
     * Set the indexName property: Name of the index, for example, "Construction", "Outdoor Activity", "Flight Delays".
     *
     * @param indexName the indexName value to set.
     * @return the DailyIndex object itself.
     */
    public DailyIndex setIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * Get the indexId property: Numeric ID used to identify the specific index. Please refer to [Weather Service
     * Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details and to see the supported index IDs. For example,
     * the index ID can support UI visualization scenarios.
     *
     * @return the indexId value.
     */
    public Integer getIndexId() {
        return this.indexId;
    }

    /**
     * Set the indexId property: Numeric ID used to identify the specific index. Please refer to [Weather Service
     * Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details and to see the supported index IDs. For example,
     * the index ID can support UI visualization scenarios.
     *
     * @param indexId the indexId value to set.
     * @return the DailyIndex object itself.
     */
    public DailyIndex setIndexId(Integer indexId) {
        this.indexId = indexId;
        return this;
    }

    /**
     * Get the dateTime property: Date and time of the current observation displayed in ISO 8601 format, for example,
     * 2019-10-27T19:39:57-08:00.
     *
     * @return the dateTime value.
     */
    public OffsetDateTime getDateTime() {
        return this.dateTime;
    }

    /**
     * Set the dateTime property: Date and time of the current observation displayed in ISO 8601 format, for example,
     * 2019-10-27T19:39:57-08:00.
     *
     * @param dateTime the dateTime value to set.
     * @return the DailyIndex object itself.
     */
    public DailyIndex setDateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    /**
     * Get the value property: Index value. Ranges from 0.0 to 10.0. Please refer to [Weather Service
     * Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details and to see the supported ranges.
     *
     * @return the value value.
     */
    public Float getValue() {
        return this.value;
    }

    /**
     * Set the value property: Index value. Ranges from 0.0 to 10.0. Please refer to [Weather Service
     * Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details and to see the supported ranges.
     *
     * @param value the value value to set.
     * @return the DailyIndex object itself.
     */
    public DailyIndex setValue(Float value) {
        this.value = value;
        return this;
    }

    /**
     * Get the category property: Textual description for `categoryValue` corresponding to the level that the index
     * value falls under, for example "Very Good".
     *
     * @return the category value.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Set the category property: Textual description for `categoryValue` corresponding to the level that the index
     * value falls under, for example "Very Good".
     *
     * @param category the category value to set.
     * @return the DailyIndex object itself.
     */
    public DailyIndex setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the categoryValue property: Level that the index value falls under, represented by an integer. This value can
     * be 1 through 5 and should be used in combination with the `ascending` flag because it can differ among indices.
     * For example, the following values apply for Mosquito Activity: Low=1, Moderate=2, High=3, Very High=4, and
     * Extreme=5.
     *
     * @return the categoryValue value.
     */
    public Integer getCategoryValue() {
        return this.categoryValue;
    }

    /**
     * Set the categoryValue property: Level that the index value falls under, represented by an integer. This value can
     * be 1 through 5 and should be used in combination with the `ascending` flag because it can differ among indices.
     * For example, the following values apply for Mosquito Activity: Low=1, Moderate=2, High=3, Very High=4, and
     * Extreme=5.
     *
     * @param categoryValue the categoryValue value to set.
     * @return the DailyIndex object itself.
     */
    public DailyIndex setCategoryValue(Integer categoryValue) {
        this.categoryValue = categoryValue;
        return this;
    }

    /**
     * Get the ascending property: Describes the direction of the `value` and `categoryValue`. For example, when
     * `ascending`=True, the poorest index value is 0 and the best index value is 10. When `ascending`=True, the poorest
     * index value is 10 and the best index value is 0.
     *
     * @return the ascending value.
     */
    public Boolean isAscending() {
        return this.ascending;
    }

    /**
     * Set the ascending property: Describes the direction of the `value` and `categoryValue`. For example, when
     * `ascending`=True, the poorest index value is 0 and the best index value is 10. When `ascending`=True, the poorest
     * index value is 10 and the best index value is 0.
     *
     * @param ascending the ascending value to set.
     * @return the DailyIndex object itself.
     */
    public DailyIndex setAscending(Boolean ascending) {
        this.ascending = ascending;
        return this;
    }

    /**
     * Get the description property: A textual explanation that can be used for display purposes to summarize the index
     * value and category. For example, when the index value for Flight Delays is very good, the description will be
     * "Conditions are excellent for flying!".
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: A textual explanation that can be used for display purposes to summarize the index
     * value and category. For example, when the index value for Flight Delays is very good, the description will be
     * "Conditions are excellent for flying!".
     *
     * @param description the description value to set.
     * @return the DailyIndex object itself.
     */
    public DailyIndex setDescription(String description) {
        this.description = description;
        return this;
    }
}
