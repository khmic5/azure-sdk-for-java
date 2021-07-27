// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The HourlyForecast model. */
@Fluent
public final class HourlyForecast {
    /*
     * Date and time of the forecast in ISO 8601 format, for example,
     * 2019-10-27T19:39:57-08:00.
     */
    @JsonProperty(value = "date")
    private String date;

    /*
     * Numeric value representing an image that displays the `iconPhrase`.
     * Please refer to [Weather Service
     * Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details.
     */
    @JsonProperty(value = "iconCode")
    private Integer iconCode;

    /*
     * Phrase description of the weather icon.
     */
    @JsonProperty(value = "iconPhrase")
    private String iconPhrase;

    /*
     * Indicates the presence or absence of precipitation. True indicates the
     * presence of precipitation, false indicates the absence of precipitation.
     */
    @JsonProperty(value = "hasPrecipitation")
    private Boolean hasPrecipitation;

    /*
     * Specifies whether or not it is daylight. True indicates day light.
     */
    @JsonProperty(value = "isDaylight")
    private Boolean isDaylight;

    /*
     * Temperature being returned.
     */
    @JsonProperty(value = "temperature")
    private WeatherUnit temperature;

    /*
     * RealFeel™ Temperature being returned. Describes what the temperature
     * really feels like in the shade.
     */
    @JsonProperty(value = "realFeelTemperature")
    private WeatherUnit realFeelTemperature;

    /*
     * The temperature to which air may be cooled by evaporating water into it
     * at constant pressure until it reaches saturation.
     */
    @JsonProperty(value = "wetBulbTemperature")
    private WeatherUnit wetBulbTemperature;

    /*
     * The dewpoint temperature in specified unit. The dewpoint temperature is
     * the temperature that the air must be cooled to in order to reach
     * saturation.
     */
    @JsonProperty(value = "dewPoint")
    private WeatherUnit dewPoint;

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
     * Relative humidity is the amount of water vapor present in air expressed
     * as a percentage of the amount needed for saturation at the same
     * temperature.
     */
    @JsonProperty(value = "relativeHumidity")
    private Integer relativeHumidity;

    /*
     * Visibility in specified unit. A measure of the distance at which an
     * object or light can be clearly discerned.
     */
    @JsonProperty(value = "visibility")
    private WeatherUnit visibility;

    /*
     * Cloud ceiling in specified unit. The ceiling is a measurement of the
     * height of the base of the lowest clouds.
     */
    @JsonProperty(value = "ceiling")
    private WeatherUnit ceiling;

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
    private String uvIndexPhrase;

    /*
     * Percent representing the probability of precipitation. For example,
     * '20'.
     */
    @JsonProperty(value = "precipitationProbability")
    private Integer precipitationProbability;

    /*
     * Percent representing the probability of rain. For example, '50'.
     */
    @JsonProperty(value = "rainProbability")
    private Integer rainProbability;

    /*
     * Percent representing the probability of snow. For example, '50'.
     */
    @JsonProperty(value = "snowProbability")
    private Integer snowProbability;

    /*
     * Percent representing the probability of snow. For example, '5'.
     */
    @JsonProperty(value = "iceProbability")
    private Integer iceProbability;

    /*
     * Total liquid equivalent of precipitation during the forecast period.
     */
    @JsonProperty(value = "totalLiquid")
    private WeatherUnit totalLiquid;

    /*
     * Rain
     */
    @JsonProperty(value = "rain")
    private WeatherUnit rain;

    /*
     * Snow
     */
    @JsonProperty(value = "snow")
    private WeatherUnit snow;

    /*
     * Ice
     */
    @JsonProperty(value = "ice")
    private WeatherUnit ice;

    /*
     * Percent representing cloud cover.
     */
    @JsonProperty(value = "cloudCover")
    private Integer cloudCover;

    /**
     * Get the date property: Date and time of the forecast in ISO 8601 format, for example, 2019-10-27T19:39:57-08:00.
     *
     * @return the date value.
     */
    public String getDate() {
        return this.date;
    }

    /**
     * Set the date property: Date and time of the forecast in ISO 8601 format, for example, 2019-10-27T19:39:57-08:00.
     *
     * @param date the date value to set.
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Get the iconCode property: Numeric value representing an image that displays the `iconPhrase`. Please refer to
     * [Weather Service Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details.
     *
     * @return the iconCode value.
     */
    public Integer getIconCode() {
        return this.iconCode;
    }

    /**
     * Set the iconCode property: Numeric value representing an image that displays the `iconPhrase`. Please refer to
     * [Weather Service Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details.
     *
     * @param iconCode the iconCode value to set.
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setIconCode(Integer iconCode) {
        this.iconCode = iconCode;
        return this;
    }

    /**
     * Get the iconPhrase property: Phrase description of the weather icon.
     *
     * @return the iconPhrase value.
     */
    public String getIconPhrase() {
        return this.iconPhrase;
    }

    /**
     * Set the iconPhrase property: Phrase description of the weather icon.
     *
     * @param iconPhrase the iconPhrase value to set.
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setIconPhrase(String iconPhrase) {
        this.iconPhrase = iconPhrase;
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
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setHasPrecipitation(Boolean hasPrecipitation) {
        this.hasPrecipitation = hasPrecipitation;
        return this;
    }

    /**
     * Get the isDaylight property: Specifies whether or not it is daylight. True indicates day light.
     *
     * @return the isDaylight value.
     */
    public Boolean isDaylight() {
        return this.isDaylight;
    }

    /**
     * Set the isDaylight property: Specifies whether or not it is daylight. True indicates day light.
     *
     * @param isDaylight the isDaylight value to set.
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setIsDaylight(Boolean isDaylight) {
        this.isDaylight = isDaylight;
        return this;
    }

    /**
     * Get the temperature property: Temperature being returned.
     *
     * @return the temperature value.
     */
    public WeatherUnit getTemperature() {
        return this.temperature;
    }

    /**
     * Set the temperature property: Temperature being returned.
     *
     * @param temperature the temperature value to set.
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setTemperature(WeatherUnit temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * Get the realFeelTemperature property: RealFeel™ Temperature being returned. Describes what the temperature really
     * feels like in the shade.
     *
     * @return the realFeelTemperature value.
     */
    public WeatherUnit getRealFeelTemperature() {
        return this.realFeelTemperature;
    }

    /**
     * Set the realFeelTemperature property: RealFeel™ Temperature being returned. Describes what the temperature really
     * feels like in the shade.
     *
     * @param realFeelTemperature the realFeelTemperature value to set.
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setRealFeelTemperature(WeatherUnit realFeelTemperature) {
        this.realFeelTemperature = realFeelTemperature;
        return this;
    }

    /**
     * Get the wetBulbTemperature property: The temperature to which air may be cooled by evaporating water into it at
     * constant pressure until it reaches saturation.
     *
     * @return the wetBulbTemperature value.
     */
    public WeatherUnit getWetBulbTemperature() {
        return this.wetBulbTemperature;
    }

    /**
     * Set the wetBulbTemperature property: The temperature to which air may be cooled by evaporating water into it at
     * constant pressure until it reaches saturation.
     *
     * @param wetBulbTemperature the wetBulbTemperature value to set.
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setWetBulbTemperature(WeatherUnit wetBulbTemperature) {
        this.wetBulbTemperature = wetBulbTemperature;
        return this;
    }

    /**
     * Get the dewPoint property: The dewpoint temperature in specified unit. The dewpoint temperature is the
     * temperature that the air must be cooled to in order to reach saturation.
     *
     * @return the dewPoint value.
     */
    public WeatherUnit getDewPoint() {
        return this.dewPoint;
    }

    /**
     * Set the dewPoint property: The dewpoint temperature in specified unit. The dewpoint temperature is the
     * temperature that the air must be cooled to in order to reach saturation.
     *
     * @param dewPoint the dewPoint value to set.
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setDewPoint(WeatherUnit dewPoint) {
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
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setWind(WindDetails wind) {
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
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setWindGust(WindDetails windGust) {
        this.windGust = windGust;
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
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setRelativeHumidity(Integer relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
        return this;
    }

    /**
     * Get the visibility property: Visibility in specified unit. A measure of the distance at which an object or light
     * can be clearly discerned.
     *
     * @return the visibility value.
     */
    public WeatherUnit getVisibility() {
        return this.visibility;
    }

    /**
     * Set the visibility property: Visibility in specified unit. A measure of the distance at which an object or light
     * can be clearly discerned.
     *
     * @param visibility the visibility value to set.
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setVisibility(WeatherUnit visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Get the ceiling property: Cloud ceiling in specified unit. The ceiling is a measurement of the height of the base
     * of the lowest clouds.
     *
     * @return the ceiling value.
     */
    public WeatherUnit getCeiling() {
        return this.ceiling;
    }

    /**
     * Set the ceiling property: Cloud ceiling in specified unit. The ceiling is a measurement of the height of the base
     * of the lowest clouds.
     *
     * @param ceiling the ceiling value to set.
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setCeiling(WeatherUnit ceiling) {
        this.ceiling = ceiling;
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
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setUvIndex(Integer uvIndex) {
        this.uvIndex = uvIndex;
        return this;
    }

    /**
     * Get the uvIndexPhrase property: Phrase associated with the `uvIndex`.
     *
     * @return the uvIndexPhrase value.
     */
    public String getUvIndexPhrase() {
        return this.uvIndexPhrase;
    }

    /**
     * Set the uvIndexPhrase property: Phrase associated with the `uvIndex`.
     *
     * @param uvIndexPhrase the uvIndexPhrase value to set.
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setUvIndexPhrase(String uvIndexPhrase) {
        this.uvIndexPhrase = uvIndexPhrase;
        return this;
    }

    /**
     * Get the precipitationProbability property: Percent representing the probability of precipitation. For example,
     * '20'.
     *
     * @return the precipitationProbability value.
     */
    public Integer getPrecipitationProbability() {
        return this.precipitationProbability;
    }

    /**
     * Set the precipitationProbability property: Percent representing the probability of precipitation. For example,
     * '20'.
     *
     * @param precipitationProbability the precipitationProbability value to set.
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setPrecipitationProbability(Integer precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
        return this;
    }

    /**
     * Get the rainProbability property: Percent representing the probability of rain. For example, '50'.
     *
     * @return the rainProbability value.
     */
    public Integer getRainProbability() {
        return this.rainProbability;
    }

    /**
     * Set the rainProbability property: Percent representing the probability of rain. For example, '50'.
     *
     * @param rainProbability the rainProbability value to set.
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setRainProbability(Integer rainProbability) {
        this.rainProbability = rainProbability;
        return this;
    }

    /**
     * Get the snowProbability property: Percent representing the probability of snow. For example, '50'.
     *
     * @return the snowProbability value.
     */
    public Integer getSnowProbability() {
        return this.snowProbability;
    }

    /**
     * Set the snowProbability property: Percent representing the probability of snow. For example, '50'.
     *
     * @param snowProbability the snowProbability value to set.
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setSnowProbability(Integer snowProbability) {
        this.snowProbability = snowProbability;
        return this;
    }

    /**
     * Get the iceProbability property: Percent representing the probability of snow. For example, '5'.
     *
     * @return the iceProbability value.
     */
    public Integer getIceProbability() {
        return this.iceProbability;
    }

    /**
     * Set the iceProbability property: Percent representing the probability of snow. For example, '5'.
     *
     * @param iceProbability the iceProbability value to set.
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setIceProbability(Integer iceProbability) {
        this.iceProbability = iceProbability;
        return this;
    }

    /**
     * Get the totalLiquid property: Total liquid equivalent of precipitation during the forecast period.
     *
     * @return the totalLiquid value.
     */
    public WeatherUnit getTotalLiquid() {
        return this.totalLiquid;
    }

    /**
     * Set the totalLiquid property: Total liquid equivalent of precipitation during the forecast period.
     *
     * @param totalLiquid the totalLiquid value to set.
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setTotalLiquid(WeatherUnit totalLiquid) {
        this.totalLiquid = totalLiquid;
        return this;
    }

    /**
     * Get the rain property: Rain.
     *
     * @return the rain value.
     */
    public WeatherUnit getRain() {
        return this.rain;
    }

    /**
     * Set the rain property: Rain.
     *
     * @param rain the rain value to set.
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setRain(WeatherUnit rain) {
        this.rain = rain;
        return this;
    }

    /**
     * Get the snow property: Snow.
     *
     * @return the snow value.
     */
    public WeatherUnit getSnow() {
        return this.snow;
    }

    /**
     * Set the snow property: Snow.
     *
     * @param snow the snow value to set.
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setSnow(WeatherUnit snow) {
        this.snow = snow;
        return this;
    }

    /**
     * Get the ice property: Ice.
     *
     * @return the ice value.
     */
    public WeatherUnit getIce() {
        return this.ice;
    }

    /**
     * Set the ice property: Ice.
     *
     * @param ice the ice value to set.
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setIce(WeatherUnit ice) {
        this.ice = ice;
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
     * @return the HourlyForecast object itself.
     */
    public HourlyForecast setCloudCover(Integer cloudCover) {
        this.cloudCover = cloudCover;
        return this;
    }
}
