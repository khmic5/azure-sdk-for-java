// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DayOrNight model. */
@Fluent
public final class DayOrNight {
    /*
     * Numeric value representing an image that displays the `iconPhrase`.
     * Please refer to [Weather Service
     * Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details.
     */
    @JsonProperty(value = "iconCode")
    private Integer iconCode;

    /*
     * Phrase description of the icon. Displayed in specified language. For
     * example, 'Sunny'.
     */
    @JsonProperty(value = "iconPhrase")
    private String iconPhrase;

    /*
     * Local weather data provider information.
     */
    @JsonProperty(value = "localSource")
    private LocalSource localSource;

    /*
     * Indicates the presence or absence of precipitation. True indicates the
     * presence of precipitation, false indicates the absence of precipitation.
     */
    @JsonProperty(value = "hasPrecipitation")
    private Boolean hasPrecipitation;

    /*
     * Specifies the type of precipitation ("rain" "snow" "ice" or "mix"). If
     * dbz = zero, precipitationType is not present in the response.
     */
    @JsonProperty(value = "precipitationType")
    private String precipitationType;

    /*
     * Description of the intensity.
     */
    @JsonProperty(value = "precipitationIntensity")
    private String precipitationIntensity;

    /*
     * Phrase description of the forecast in specified language. Azure Maps
     * attempts to keep this phrase under 30 characters in length, but some
     * languages/weather events may result in a longer phrase length, exceeding
     * 30 characters.
     */
    @JsonProperty(value = "shortPhrase")
    private String shortPhrase;

    /*
     * Phrase description of the forecast in specified language. Azure Maps
     * attempts to keep this phrase under 100 characters in length, but some
     * languages/weather events may result in a longer phrase length, exceeding
     * 100 characters.
     */
    @JsonProperty(value = "longPhrase")
    private String longPhrase;

    /*
     * Percent representing the probability of precipitation. For example,
     * '20'.
     */
    @JsonProperty(value = "precipitationProbability")
    private Integer precipitationProbability;

    /*
     * Percent representing the probability of a thunderstorm. For example,
     * '80'.
     */
    @JsonProperty(value = "thunderstormProbability")
    private Integer thunderstormProbability;

    /*
     * Percent representing the probability of rain. For example, '40'.
     */
    @JsonProperty(value = "rainProbability")
    private Integer rainProbability;

    /*
     * Percent representing the probability of snow. For example, '30'.
     */
    @JsonProperty(value = "snowProbability")
    private Integer snowProbability;

    /*
     * Percent representing the probability of ice. For example, '30'.
     */
    @JsonProperty(value = "iceProbability")
    private Integer iceProbability;

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
     * Hours of precipitation
     */
    @JsonProperty(value = "hoursOfPrecipitation")
    private Float hoursOfPrecipitation;

    /*
     * Hours of rain.
     */
    @JsonProperty(value = "hoursOfRain")
    private Float hoursOfRain;

    /*
     * Hours of snow.
     */
    @JsonProperty(value = "hoursOfSnow")
    private Float hoursOfSnow;

    /*
     * Hours of ice.
     */
    @JsonProperty(value = "hoursOfIce")
    private Float hoursOfIce;

    /*
     * Percent representing cloud cover.
     */
    @JsonProperty(value = "cloudCover")
    private Integer cloudCover;

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
     * @return the DayOrNight object itself.
     */
    public DayOrNight setIconCode(Integer iconCode) {
        this.iconCode = iconCode;
        return this;
    }

    /**
     * Get the iconPhrase property: Phrase description of the icon. Displayed in specified language. For example,
     * 'Sunny'.
     *
     * @return the iconPhrase value.
     */
    public String getIconPhrase() {
        return this.iconPhrase;
    }

    /**
     * Set the iconPhrase property: Phrase description of the icon. Displayed in specified language. For example,
     * 'Sunny'.
     *
     * @param iconPhrase the iconPhrase value to set.
     * @return the DayOrNight object itself.
     */
    public DayOrNight setIconPhrase(String iconPhrase) {
        this.iconPhrase = iconPhrase;
        return this;
    }

    /**
     * Get the localSource property: Local weather data provider information.
     *
     * @return the localSource value.
     */
    public LocalSource getLocalSource() {
        return this.localSource;
    }

    /**
     * Set the localSource property: Local weather data provider information.
     *
     * @param localSource the localSource value to set.
     * @return the DayOrNight object itself.
     */
    public DayOrNight setLocalSource(LocalSource localSource) {
        this.localSource = localSource;
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
     * @return the DayOrNight object itself.
     */
    public DayOrNight setHasPrecipitation(Boolean hasPrecipitation) {
        this.hasPrecipitation = hasPrecipitation;
        return this;
    }

    /**
     * Get the precipitationType property: Specifies the type of precipitation ("rain" "snow" "ice" or "mix"). If dbz =
     * zero, precipitationType is not present in the response.
     *
     * @return the precipitationType value.
     */
    public String getPrecipitationType() {
        return this.precipitationType;
    }

    /**
     * Set the precipitationType property: Specifies the type of precipitation ("rain" "snow" "ice" or "mix"). If dbz =
     * zero, precipitationType is not present in the response.
     *
     * @param precipitationType the precipitationType value to set.
     * @return the DayOrNight object itself.
     */
    public DayOrNight setPrecipitationType(String precipitationType) {
        this.precipitationType = precipitationType;
        return this;
    }

    /**
     * Get the precipitationIntensity property: Description of the intensity.
     *
     * @return the precipitationIntensity value.
     */
    public String getPrecipitationIntensity() {
        return this.precipitationIntensity;
    }

    /**
     * Set the precipitationIntensity property: Description of the intensity.
     *
     * @param precipitationIntensity the precipitationIntensity value to set.
     * @return the DayOrNight object itself.
     */
    public DayOrNight setPrecipitationIntensity(String precipitationIntensity) {
        this.precipitationIntensity = precipitationIntensity;
        return this;
    }

    /**
     * Get the shortPhrase property: Phrase description of the forecast in specified language. Azure Maps attempts to
     * keep this phrase under 30 characters in length, but some languages/weather events may result in a longer phrase
     * length, exceeding 30 characters.
     *
     * @return the shortPhrase value.
     */
    public String getShortPhrase() {
        return this.shortPhrase;
    }

    /**
     * Set the shortPhrase property: Phrase description of the forecast in specified language. Azure Maps attempts to
     * keep this phrase under 30 characters in length, but some languages/weather events may result in a longer phrase
     * length, exceeding 30 characters.
     *
     * @param shortPhrase the shortPhrase value to set.
     * @return the DayOrNight object itself.
     */
    public DayOrNight setShortPhrase(String shortPhrase) {
        this.shortPhrase = shortPhrase;
        return this;
    }

    /**
     * Get the longPhrase property: Phrase description of the forecast in specified language. Azure Maps attempts to
     * keep this phrase under 100 characters in length, but some languages/weather events may result in a longer phrase
     * length, exceeding 100 characters.
     *
     * @return the longPhrase value.
     */
    public String getLongPhrase() {
        return this.longPhrase;
    }

    /**
     * Set the longPhrase property: Phrase description of the forecast in specified language. Azure Maps attempts to
     * keep this phrase under 100 characters in length, but some languages/weather events may result in a longer phrase
     * length, exceeding 100 characters.
     *
     * @param longPhrase the longPhrase value to set.
     * @return the DayOrNight object itself.
     */
    public DayOrNight setLongPhrase(String longPhrase) {
        this.longPhrase = longPhrase;
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
     * @return the DayOrNight object itself.
     */
    public DayOrNight setPrecipitationProbability(Integer precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
        return this;
    }

    /**
     * Get the thunderstormProbability property: Percent representing the probability of a thunderstorm. For example,
     * '80'.
     *
     * @return the thunderstormProbability value.
     */
    public Integer getThunderstormProbability() {
        return this.thunderstormProbability;
    }

    /**
     * Set the thunderstormProbability property: Percent representing the probability of a thunderstorm. For example,
     * '80'.
     *
     * @param thunderstormProbability the thunderstormProbability value to set.
     * @return the DayOrNight object itself.
     */
    public DayOrNight setThunderstormProbability(Integer thunderstormProbability) {
        this.thunderstormProbability = thunderstormProbability;
        return this;
    }

    /**
     * Get the rainProbability property: Percent representing the probability of rain. For example, '40'.
     *
     * @return the rainProbability value.
     */
    public Integer getRainProbability() {
        return this.rainProbability;
    }

    /**
     * Set the rainProbability property: Percent representing the probability of rain. For example, '40'.
     *
     * @param rainProbability the rainProbability value to set.
     * @return the DayOrNight object itself.
     */
    public DayOrNight setRainProbability(Integer rainProbability) {
        this.rainProbability = rainProbability;
        return this;
    }

    /**
     * Get the snowProbability property: Percent representing the probability of snow. For example, '30'.
     *
     * @return the snowProbability value.
     */
    public Integer getSnowProbability() {
        return this.snowProbability;
    }

    /**
     * Set the snowProbability property: Percent representing the probability of snow. For example, '30'.
     *
     * @param snowProbability the snowProbability value to set.
     * @return the DayOrNight object itself.
     */
    public DayOrNight setSnowProbability(Integer snowProbability) {
        this.snowProbability = snowProbability;
        return this;
    }

    /**
     * Get the iceProbability property: Percent representing the probability of ice. For example, '30'.
     *
     * @return the iceProbability value.
     */
    public Integer getIceProbability() {
        return this.iceProbability;
    }

    /**
     * Set the iceProbability property: Percent representing the probability of ice. For example, '30'.
     *
     * @param iceProbability the iceProbability value to set.
     * @return the DayOrNight object itself.
     */
    public DayOrNight setIceProbability(Integer iceProbability) {
        this.iceProbability = iceProbability;
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
     * @return the DayOrNight object itself.
     */
    public DayOrNight setWind(WindDetails wind) {
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
     * @return the DayOrNight object itself.
     */
    public DayOrNight setWindGust(WindDetails windGust) {
        this.windGust = windGust;
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
     * @return the DayOrNight object itself.
     */
    public DayOrNight setTotalLiquid(WeatherUnit totalLiquid) {
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
     * @return the DayOrNight object itself.
     */
    public DayOrNight setRain(WeatherUnit rain) {
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
     * @return the DayOrNight object itself.
     */
    public DayOrNight setSnow(WeatherUnit snow) {
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
     * @return the DayOrNight object itself.
     */
    public DayOrNight setIce(WeatherUnit ice) {
        this.ice = ice;
        return this;
    }

    /**
     * Get the hoursOfPrecipitation property: Hours of precipitation.
     *
     * @return the hoursOfPrecipitation value.
     */
    public Float getHoursOfPrecipitation() {
        return this.hoursOfPrecipitation;
    }

    /**
     * Set the hoursOfPrecipitation property: Hours of precipitation.
     *
     * @param hoursOfPrecipitation the hoursOfPrecipitation value to set.
     * @return the DayOrNight object itself.
     */
    public DayOrNight setHoursOfPrecipitation(Float hoursOfPrecipitation) {
        this.hoursOfPrecipitation = hoursOfPrecipitation;
        return this;
    }

    /**
     * Get the hoursOfRain property: Hours of rain.
     *
     * @return the hoursOfRain value.
     */
    public Float getHoursOfRain() {
        return this.hoursOfRain;
    }

    /**
     * Set the hoursOfRain property: Hours of rain.
     *
     * @param hoursOfRain the hoursOfRain value to set.
     * @return the DayOrNight object itself.
     */
    public DayOrNight setHoursOfRain(Float hoursOfRain) {
        this.hoursOfRain = hoursOfRain;
        return this;
    }

    /**
     * Get the hoursOfSnow property: Hours of snow.
     *
     * @return the hoursOfSnow value.
     */
    public Float getHoursOfSnow() {
        return this.hoursOfSnow;
    }

    /**
     * Set the hoursOfSnow property: Hours of snow.
     *
     * @param hoursOfSnow the hoursOfSnow value to set.
     * @return the DayOrNight object itself.
     */
    public DayOrNight setHoursOfSnow(Float hoursOfSnow) {
        this.hoursOfSnow = hoursOfSnow;
        return this;
    }

    /**
     * Get the hoursOfIce property: Hours of ice.
     *
     * @return the hoursOfIce value.
     */
    public Float getHoursOfIce() {
        return this.hoursOfIce;
    }

    /**
     * Set the hoursOfIce property: Hours of ice.
     *
     * @param hoursOfIce the hoursOfIce value to set.
     * @return the DayOrNight object itself.
     */
    public DayOrNight setHoursOfIce(Float hoursOfIce) {
        this.hoursOfIce = hoursOfIce;
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
     * @return the DayOrNight object itself.
     */
    public DayOrNight setCloudCover(Integer cloudCover) {
        this.cloudCover = cloudCover;
        return this;
    }
}
