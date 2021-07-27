// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about a severe weather alert. */
@Fluent
public final class SevereWeatherAlert {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SevereWeatherAlert.class);

    /*
     * 2-character ISO 3166-1 Alpha-2 country code, for example, "US".
     */
    @JsonProperty(value = "countryCode")
    private String countryCode;

    /*
     * A unique numerical identifier for a weather alert.
     */
    @JsonProperty(value = "alertId")
    private Integer alertId;

    /*
     * Description of the alert.
     */
    @JsonProperty(value = "description")
    private SevereWeatherAlertDescription description;

    /*
     * Category of the alert.
     */
    @JsonProperty(value = "category")
    private String category;

    /*
     * Number signifying the importance or ranking order of the given alert
     * within the country/region it has originated. A lower number signifies a
     * higher priority. For example, 1 is the highest priority. The number
     * varies by country/region and can change over time as each country/region
     * evolves their alert systems.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /*
     * Classification of the alert. This field is not available for all
     * countries and therefore not always returned.
     */
    @JsonProperty(value = "class")
    private String classProperty;

    /*
     * Severity level of the alert. This field is not available for all
     * countries and therefore not always returned.
     */
    @JsonProperty(value = "level")
    private String level;

    /*
     * The provider of the alert information. By default the source is returned
     * in English (en-US). The alerts are from official Government
     * Meteorological Agencies and leading global weather alert providers.
     */
    @JsonProperty(value = "source")
    private String source;

    /*
     * A numerical identifier associated with the source provider name of the
     * alert data.
     */
    @JsonProperty(value = "sourceId")
    private Integer sourceId;

    /*
     * A disclaimer regarding the source of the alert information. This field
     * is not always available. For example, disclaimer may include details
     * about the delays or potential issues related to the alarm.
     */
    @JsonProperty(value = "disclaimer")
    private String disclaimer;

    /*
     * Information about the alert specific to the affected area(s).
     */
    @JsonProperty(value = "alertAreas")
    private List<AlertArea> alertAreas;

    /**
     * Get the countryCode property: 2-character ISO 3166-1 Alpha-2 country code, for example, "US".
     *
     * @return the countryCode value.
     */
    public String countryCode() {
        return this.countryCode;
    }

    /**
     * Set the countryCode property: 2-character ISO 3166-1 Alpha-2 country code, for example, "US".
     *
     * @param countryCode the countryCode value to set.
     * @return the SevereWeatherAlert object itself.
     */
    public SevereWeatherAlert withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Get the alertId property: A unique numerical identifier for a weather alert.
     *
     * @return the alertId value.
     */
    public Integer alertId() {
        return this.alertId;
    }

    /**
     * Set the alertId property: A unique numerical identifier for a weather alert.
     *
     * @param alertId the alertId value to set.
     * @return the SevereWeatherAlert object itself.
     */
    public SevereWeatherAlert withAlertId(Integer alertId) {
        this.alertId = alertId;
        return this;
    }

    /**
     * Get the description property: Description of the alert.
     *
     * @return the description value.
     */
    public SevereWeatherAlertDescription description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the alert.
     *
     * @param description the description value to set.
     * @return the SevereWeatherAlert object itself.
     */
    public SevereWeatherAlert withDescription(SevereWeatherAlertDescription description) {
        this.description = description;
        return this;
    }

    /**
     * Get the category property: Category of the alert.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: Category of the alert.
     *
     * @param category the category value to set.
     * @return the SevereWeatherAlert object itself.
     */
    public SevereWeatherAlert withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the priority property: Number signifying the importance or ranking order of the given alert within the
     * country/region it has originated. A lower number signifies a higher priority. For example, 1 is the highest
     * priority. The number varies by country/region and can change over time as each country/region evolves their alert
     * systems.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Number signifying the importance or ranking order of the given alert within the
     * country/region it has originated. A lower number signifies a higher priority. For example, 1 is the highest
     * priority. The number varies by country/region and can change over time as each country/region evolves their alert
     * systems.
     *
     * @param priority the priority value to set.
     * @return the SevereWeatherAlert object itself.
     */
    public SevereWeatherAlert withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the classProperty property: Classification of the alert. This field is not available for all countries and
     * therefore not always returned.
     *
     * @return the classProperty value.
     */
    public String classProperty() {
        return this.classProperty;
    }

    /**
     * Set the classProperty property: Classification of the alert. This field is not available for all countries and
     * therefore not always returned.
     *
     * @param classProperty the classProperty value to set.
     * @return the SevereWeatherAlert object itself.
     */
    public SevereWeatherAlert withClassProperty(String classProperty) {
        this.classProperty = classProperty;
        return this;
    }

    /**
     * Get the level property: Severity level of the alert. This field is not available for all countries and therefore
     * not always returned.
     *
     * @return the level value.
     */
    public String level() {
        return this.level;
    }

    /**
     * Set the level property: Severity level of the alert. This field is not available for all countries and therefore
     * not always returned.
     *
     * @param level the level value to set.
     * @return the SevereWeatherAlert object itself.
     */
    public SevereWeatherAlert withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * Get the source property: The provider of the alert information. By default the source is returned in English
     * (en-US). The alerts are from official Government Meteorological Agencies and leading global weather alert
     * providers.
     *
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source property: The provider of the alert information. By default the source is returned in English
     * (en-US). The alerts are from official Government Meteorological Agencies and leading global weather alert
     * providers.
     *
     * @param source the source value to set.
     * @return the SevereWeatherAlert object itself.
     */
    public SevereWeatherAlert withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the sourceId property: A numerical identifier associated with the source provider name of the alert data.
     *
     * @return the sourceId value.
     */
    public Integer sourceId() {
        return this.sourceId;
    }

    /**
     * Set the sourceId property: A numerical identifier associated with the source provider name of the alert data.
     *
     * @param sourceId the sourceId value to set.
     * @return the SevereWeatherAlert object itself.
     */
    public SevereWeatherAlert withSourceId(Integer sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * Get the disclaimer property: A disclaimer regarding the source of the alert information. This field is not always
     * available. For example, disclaimer may include details about the delays or potential issues related to the alarm.
     *
     * @return the disclaimer value.
     */
    public String disclaimer() {
        return this.disclaimer;
    }

    /**
     * Set the disclaimer property: A disclaimer regarding the source of the alert information. This field is not always
     * available. For example, disclaimer may include details about the delays or potential issues related to the alarm.
     *
     * @param disclaimer the disclaimer value to set.
     * @return the SevereWeatherAlert object itself.
     */
    public SevereWeatherAlert withDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
        return this;
    }

    /**
     * Get the alertAreas property: Information about the alert specific to the affected area(s).
     *
     * @return the alertAreas value.
     */
    public List<AlertArea> alertAreas() {
        return this.alertAreas;
    }

    /**
     * Set the alertAreas property: Information about the alert specific to the affected area(s).
     *
     * @param alertAreas the alertAreas value to set.
     * @return the SevereWeatherAlert object itself.
     */
    public SevereWeatherAlert withAlertAreas(List<AlertArea> alertAreas) {
        this.alertAreas = alertAreas;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (description() != null) {
            description().validate();
        }
        if (alertAreas() != null) {
            alertAreas().forEach(e -> e.validate());
        }
    }
}
