// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The CurrentConditions model. */
@Fluent
public final class CurrentConditions {
    /*
     * Date and time of the current observation displayed in ISO 8601 format,
     * for example, 2019-10-27T19:39:57-08:00.
     */
    @JsonProperty(value = "dateTime")
    private OffsetDateTime dateTime;

    /*
     * Phrase description of the current weather condition.  Displayed in
     * specified language.
     */
    @JsonProperty(value = "phrase")
    private String description;

    /*
     * Numeric value representing an image that displays the `iconPhrase`.
     * Please refer to [Weather Service
     * Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details.
     */
    @JsonProperty(value = "iconCode")
    private IconCode iconCode;

    /*
     * Indicates the presence or absence of precipitation. True indicates the
     * presence of precipitation, false indicates the absence of precipitation.
     */
    @JsonProperty(value = "hasPrecipitation")
    private Boolean hasPrecipitation;

    /*
     * Indicates the time of the day. True indicates 'day',', false indicates
     * 'night.
     */
    @JsonProperty(value = "isDayTime")
    private Boolean isDaytime;

    /*
     * Temperature being returned.
     */
    @JsonProperty(value = "temperature")
    private WeatherValue temperature;

    /*
     * RealFeel™ Temperature being returned.
     */
    @JsonProperty(value = "realFeelTemperature")
    private WeatherValue realFeelTemperature;

    /*
     * RealFeel™ Temperature being returned. Describes what the temperature
     * really feels like in the shade.
     */
    @JsonProperty(value = "realFeelTemperatureShade")
    private WeatherValue realFeelTemperatureShade;

    /*
     * Relative humidity is the amount of water vapor present in air expressed
     * as a percentage of the amount needed for saturation at the same
     * temperature.
     */
    @JsonProperty(value = "relativeHumidity")
    private Integer relativeHumidity;

    /*
     * The dewpoint temperature in specified unit. The dewpoint temperature is
     * the temperature that the air must be cooled to in order to reach
     * saturation.
     */
    @JsonProperty(value = "dewPoint")
    private WeatherValue dewPoint;

    /*
     * Wind details being returned including speed and direction.
     */
    @JsonProperty(value = "wind")
    private WindDetails wind;

    /*
     * Wind gust. Wind gust is a sudden, brief increase in speed of the wind.
     */
    @JsonProperty(value = "windGust")
    private WindDetails windGust;

    /*
     * Measure of the strength of the ultraviolet radiation from the sun.
     * Supported values are:
     * * `0-2` - Low danger from the sun's UV rays or the average person.
     * * `3-5` - Moderate risk of harm from unprotected sun exposure.
     * * `6-7` - High risk of harm from unprotected sun exposure.
     * * `8-10` - Very high risk of harm from unprotected sun exposure.
     * * `11+` - Extreme risk of harm from unprotected sun exposure.
     */
    @JsonProperty(value = "uvIndex")
    private Integer uvIndex;

    /*
     * Phrase associated with the `uvIndex`.
     */
    @JsonProperty(value = "uvIndexPhrase")
    private String uvIndexDescription;

    /*
     * Visibility in specified unit. A measure of the distance at which an
     * object or light can be clearly discerned.
     */
    @JsonProperty(value = "visibility")
    private WeatherValue visibility;

    /*
     * Cause of limited visibility.
     */
    @JsonProperty(value = "obstructionsToVisibility")
    private String obstructionsToVisibility;

    /*
     * Percent representing cloud cover.
     */
    @JsonProperty(value = "cloudCover")
    private Integer cloudCover;

    /*
     * Cloud ceiling in specified unit. The ceiling is a measurement of the
     * height of the base of the lowest clouds.
     */
    @JsonProperty(value = "ceiling")
    private WeatherValue cloudCeiling;

    /*
     * Atmospheric pressure in specified unit.
     */
    @JsonProperty(value = "pressure")
    private WeatherValue pressure;

    /*
     * Atmospheric pressure change.
     */
    @JsonProperty(value = "pressureTendency")
    private PressureTendency pressureTendency;

    /*
     * Departure from the temperature observed 24 hours ago in specified unit.
     */
    @JsonProperty(value = "pastTwentyFourHourTemperatureDeparture")
    private WeatherValue pastTwentyFourHourTemperatureDeparture;

    /*
     * Perceived outdoor temperature caused by the combination of air
     * temperature, relative humidity, and wind speed in specified unit.
     */
    @JsonProperty(value = "apparentTemperature")
    private WeatherValue apparentTemperature;

    /*
     * Perceived air temperature on exposed skin due to wind.
     */
    @JsonProperty(value = "windChillTemperature")
    private WeatherValue windChillTemperature;

    /*
     * The temperature to which air may be cooled by evaporating water into it
     * at constant pressure until it reaches saturation.
     */
    @JsonProperty(value = "wetBulbTemperature")
    private WeatherValue wetBulbTemperature;

    /*
     * Summary of precipitation amounts over the past 24 hours.
     */
    @JsonProperty(value = "precipitationSummary")
    private PrecipitationSummary precipitationSummary;

    /*
     * Summary of temperature fluctuations over the past 6, 12, and 24 hours.
     */
    @JsonProperty(value = "temperatureSummary")
    private TemperatureSummary temperatureSummary;

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
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setDateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    /**
     * Get the description property: Phrase description of the current weather condition. Displayed in specified
     * language.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Phrase description of the current weather condition. Displayed in specified
     * language.
     *
     * @param description the description value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the iconCode property: Numeric value representing an image that displays the `iconPhrase`. Please refer to
     * [Weather Service Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details.
     *
     * @return the iconCode value.
     */
    public IconCode getIconCode() {
        return this.iconCode;
    }

    /**
     * Set the iconCode property: Numeric value representing an image that displays the `iconPhrase`. Please refer to
     * [Weather Service Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details.
     *
     * @param iconCode the iconCode value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setIconCode(IconCode iconCode) {
        this.iconCode = iconCode;
        return this;
    }

    /**
     * Get the hasPrecipitation property: Indicates the presence or absence of precipitation. True indicates the
     * presence of precipitation, false indicates the absence of precipitation.
     *
     * @return the hasPrecipitation value.
     */
    public Boolean isHasPrecipitation() {
        return this.hasPrecipitation;
    }

    /**
     * Set the hasPrecipitation property: Indicates the presence or absence of precipitation. True indicates the
     * presence of precipitation, false indicates the absence of precipitation.
     *
     * @param hasPrecipitation the hasPrecipitation value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setHasPrecipitation(Boolean hasPrecipitation) {
        this.hasPrecipitation = hasPrecipitation;
        return this;
    }

    /**
     * Get the isDaytime property: Indicates the time of the day. True indicates 'day',', false indicates 'night.
     *
     * @return the isDaytime value.
     */
    public Boolean isDaytime() {
        return this.isDaytime;
    }

    /**
     * Set the isDaytime property: Indicates the time of the day. True indicates 'day',', false indicates 'night.
     *
     * @param isDaytime the isDaytime value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setIsDaytime(Boolean isDaytime) {
        this.isDaytime = isDaytime;
        return this;
    }

    /**
     * Get the temperature property: Temperature being returned.
     *
     * @return the temperature value.
     */
    public WeatherValue getTemperature() {
        return this.temperature;
    }

    /**
     * Set the temperature property: Temperature being returned.
     *
     * @param temperature the temperature value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setTemperature(WeatherValue temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * Get the realFeelTemperature property: RealFeel™ Temperature being returned.
     *
     * @return the realFeelTemperature value.
     */
    public WeatherValue getRealFeelTemperature() {
        return this.realFeelTemperature;
    }

    /**
     * Set the realFeelTemperature property: RealFeel™ Temperature being returned.
     *
     * @param realFeelTemperature the realFeelTemperature value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setRealFeelTemperature(WeatherValue realFeelTemperature) {
        this.realFeelTemperature = realFeelTemperature;
        return this;
    }

    /**
     * Get the realFeelTemperatureShade property: RealFeel™ Temperature being returned. Describes what the temperature
     * really feels like in the shade.
     *
     * @return the realFeelTemperatureShade value.
     */
    public WeatherValue getRealFeelTemperatureShade() {
        return this.realFeelTemperatureShade;
    }

    /**
     * Set the realFeelTemperatureShade property: RealFeel™ Temperature being returned. Describes what the temperature
     * really feels like in the shade.
     *
     * @param realFeelTemperatureShade the realFeelTemperatureShade value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setRealFeelTemperatureShade(WeatherValue realFeelTemperatureShade) {
        this.realFeelTemperatureShade = realFeelTemperatureShade;
        return this;
    }

    /**
     * Get the relativeHumidity property: Relative humidity is the amount of water vapor present in air expressed as a
     * percentage of the amount needed for saturation at the same temperature.
     *
     * @return the relativeHumidity value.
     */
    public Integer getRelativeHumidity() {
        return this.relativeHumidity;
    }

    /**
     * Set the relativeHumidity property: Relative humidity is the amount of water vapor present in air expressed as a
     * percentage of the amount needed for saturation at the same temperature.
     *
     * @param relativeHumidity the relativeHumidity value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setRelativeHumidity(Integer relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
        return this;
    }

    /**
     * Get the dewPoint property: The dewpoint temperature in specified unit. The dewpoint temperature is the
     * temperature that the air must be cooled to in order to reach saturation.
     *
     * @return the dewPoint value.
     */
    public WeatherValue getDewPoint() {
        return this.dewPoint;
    }

    /**
     * Set the dewPoint property: The dewpoint temperature in specified unit. The dewpoint temperature is the
     * temperature that the air must be cooled to in order to reach saturation.
     *
     * @param dewPoint the dewPoint value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setDewPoint(WeatherValue dewPoint) {
        this.dewPoint = dewPoint;
        return this;
    }

    /**
     * Get the wind property: Wind details being returned including speed and direction.
     *
     * @return the wind value.
     */
    public WindDetails getWind() {
        return this.wind;
    }

    /**
     * Set the wind property: Wind details being returned including speed and direction.
     *
     * @param wind the wind value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setWind(WindDetails wind) {
        this.wind = wind;
        return this;
    }

    /**
     * Get the windGust property: Wind gust. Wind gust is a sudden, brief increase in speed of the wind.
     *
     * @return the windGust value.
     */
    public WindDetails getWindGust() {
        return this.windGust;
    }

    /**
     * Set the windGust property: Wind gust. Wind gust is a sudden, brief increase in speed of the wind.
     *
     * @param windGust the windGust value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setWindGust(WindDetails windGust) {
        this.windGust = windGust;
        return this;
    }

    /**
     * Get the uvIndex property: Measure of the strength of the ultraviolet radiation from the sun. Supported values
     * are: * `0-2` - Low danger from the sun's UV rays or the average person. * `3-5` - Moderate risk of harm from
     * unprotected sun exposure. * `6-7` - High risk of harm from unprotected sun exposure. * `8-10` - Very high risk of
     * harm from unprotected sun exposure. * `11+` - Extreme risk of harm from unprotected sun exposure.
     *
     * @return the uvIndex value.
     */
    public Integer getUvIndex() {
        return this.uvIndex;
    }

    /**
     * Set the uvIndex property: Measure of the strength of the ultraviolet radiation from the sun. Supported values
     * are: * `0-2` - Low danger from the sun's UV rays or the average person. * `3-5` - Moderate risk of harm from
     * unprotected sun exposure. * `6-7` - High risk of harm from unprotected sun exposure. * `8-10` - Very high risk of
     * harm from unprotected sun exposure. * `11+` - Extreme risk of harm from unprotected sun exposure.
     *
     * @param uvIndex the uvIndex value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setUvIndex(Integer uvIndex) {
        this.uvIndex = uvIndex;
        return this;
    }

    /**
     * Get the uvIndexDescription property: Phrase associated with the `uvIndex`.
     *
     * @return the uvIndexDescription value.
     */
    public String getUvIndexDescription() {
        return this.uvIndexDescription;
    }

    /**
     * Set the uvIndexDescription property: Phrase associated with the `uvIndex`.
     *
     * @param uvIndexDescription the uvIndexDescription value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setUvIndexDescription(String uvIndexDescription) {
        this.uvIndexDescription = uvIndexDescription;
        return this;
    }

    /**
     * Get the visibility property: Visibility in specified unit. A measure of the distance at which an object or light
     * can be clearly discerned.
     *
     * @return the visibility value.
     */
    public WeatherValue getVisibility() {
        return this.visibility;
    }

    /**
     * Set the visibility property: Visibility in specified unit. A measure of the distance at which an object or light
     * can be clearly discerned.
     *
     * @param visibility the visibility value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setVisibility(WeatherValue visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Get the obstructionsToVisibility property: Cause of limited visibility.
     *
     * @return the obstructionsToVisibility value.
     */
    public String getObstructionsToVisibility() {
        return this.obstructionsToVisibility;
    }

    /**
     * Set the obstructionsToVisibility property: Cause of limited visibility.
     *
     * @param obstructionsToVisibility the obstructionsToVisibility value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setObstructionsToVisibility(String obstructionsToVisibility) {
        this.obstructionsToVisibility = obstructionsToVisibility;
        return this;
    }

    /**
     * Get the cloudCover property: Percent representing cloud cover.
     *
     * @return the cloudCover value.
     */
    public Integer getCloudCover() {
        return this.cloudCover;
    }

    /**
     * Set the cloudCover property: Percent representing cloud cover.
     *
     * @param cloudCover the cloudCover value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setCloudCover(Integer cloudCover) {
        this.cloudCover = cloudCover;
        return this;
    }

    /**
     * Get the cloudCeiling property: Cloud ceiling in specified unit. The ceiling is a measurement of the height of the
     * base of the lowest clouds.
     *
     * @return the cloudCeiling value.
     */
    public WeatherValue getCloudCeiling() {
        return this.cloudCeiling;
    }

    /**
     * Set the cloudCeiling property: Cloud ceiling in specified unit. The ceiling is a measurement of the height of the
     * base of the lowest clouds.
     *
     * @param cloudCeiling the cloudCeiling value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setCloudCeiling(WeatherValue cloudCeiling) {
        this.cloudCeiling = cloudCeiling;
        return this;
    }

    /**
     * Get the pressure property: Atmospheric pressure in specified unit.
     *
     * @return the pressure value.
     */
    public WeatherValue getPressure() {
        return this.pressure;
    }

    /**
     * Set the pressure property: Atmospheric pressure in specified unit.
     *
     * @param pressure the pressure value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setPressure(WeatherValue pressure) {
        this.pressure = pressure;
        return this;
    }

    /**
     * Get the pressureTendency property: Atmospheric pressure change.
     *
     * @return the pressureTendency value.
     */
    public PressureTendency getPressureTendency() {
        return this.pressureTendency;
    }

    /**
     * Set the pressureTendency property: Atmospheric pressure change.
     *
     * @param pressureTendency the pressureTendency value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setPressureTendency(PressureTendency pressureTendency) {
        this.pressureTendency = pressureTendency;
        return this;
    }

    /**
     * Get the pastTwentyFourHourTemperatureDeparture property: Departure from the temperature observed 24 hours ago in
     * specified unit.
     *
     * @return the pastTwentyFourHourTemperatureDeparture value.
     */
    public WeatherValue getPastTwentyFourHourTemperatureDeparture() {
        return this.pastTwentyFourHourTemperatureDeparture;
    }

    /**
     * Set the pastTwentyFourHourTemperatureDeparture property: Departure from the temperature observed 24 hours ago in
     * specified unit.
     *
     * @param pastTwentyFourHourTemperatureDeparture the pastTwentyFourHourTemperatureDeparture value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setPastTwentyFourHourTemperatureDeparture(
            WeatherValue pastTwentyFourHourTemperatureDeparture) {
        this.pastTwentyFourHourTemperatureDeparture = pastTwentyFourHourTemperatureDeparture;
        return this;
    }

    /**
     * Get the apparentTemperature property: Perceived outdoor temperature caused by the combination of air temperature,
     * relative humidity, and wind speed in specified unit.
     *
     * @return the apparentTemperature value.
     */
    public WeatherValue getApparentTemperature() {
        return this.apparentTemperature;
    }

    /**
     * Set the apparentTemperature property: Perceived outdoor temperature caused by the combination of air temperature,
     * relative humidity, and wind speed in specified unit.
     *
     * @param apparentTemperature the apparentTemperature value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setApparentTemperature(WeatherValue apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
        return this;
    }

    /**
     * Get the windChillTemperature property: Perceived air temperature on exposed skin due to wind.
     *
     * @return the windChillTemperature value.
     */
    public WeatherValue getWindChillTemperature() {
        return this.windChillTemperature;
    }

    /**
     * Set the windChillTemperature property: Perceived air temperature on exposed skin due to wind.
     *
     * @param windChillTemperature the windChillTemperature value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setWindChillTemperature(WeatherValue windChillTemperature) {
        this.windChillTemperature = windChillTemperature;
        return this;
    }

    /**
     * Get the wetBulbTemperature property: The temperature to which air may be cooled by evaporating water into it at
     * constant pressure until it reaches saturation.
     *
     * @return the wetBulbTemperature value.
     */
    public WeatherValue getWetBulbTemperature() {
        return this.wetBulbTemperature;
    }

    /**
     * Set the wetBulbTemperature property: The temperature to which air may be cooled by evaporating water into it at
     * constant pressure until it reaches saturation.
     *
     * @param wetBulbTemperature the wetBulbTemperature value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setWetBulbTemperature(WeatherValue wetBulbTemperature) {
        this.wetBulbTemperature = wetBulbTemperature;
        return this;
    }

    /**
     * Get the precipitationSummary property: Summary of precipitation amounts over the past 24 hours.
     *
     * @return the precipitationSummary value.
     */
    public PrecipitationSummary getPrecipitationSummary() {
        return this.precipitationSummary;
    }

    /**
     * Set the precipitationSummary property: Summary of precipitation amounts over the past 24 hours.
     *
     * @param precipitationSummary the precipitationSummary value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setPrecipitationSummary(PrecipitationSummary precipitationSummary) {
        this.precipitationSummary = precipitationSummary;
        return this;
    }

    /**
     * Get the temperatureSummary property: Summary of temperature fluctuations over the past 6, 12, and 24 hours.
     *
     * @return the temperatureSummary value.
     */
    public TemperatureSummary getTemperatureSummary() {
        return this.temperatureSummary;
    }

    /**
     * Set the temperatureSummary property: Summary of temperature fluctuations over the past 6, 12, and 24 hours.
     *
     * @param temperatureSummary the temperatureSummary value to set.
     * @return the CurrentConditions object itself.
     */
    public CurrentConditions setTemperatureSummary(TemperatureSummary temperatureSummary) {
        this.temperatureSummary = temperatureSummary;
        return this;
    }
}
