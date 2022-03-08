package com.azure.maps.weather.models;

import com.azure.maps.weather.implementation.models.BasinId;
import com.azure.maps.weather.implementation.models.WeatherDataUnit;

public class TropicalStormLocationOptions {
    private int year;
    private BasinId basinId;
    private int governmentStormId;
    private WeatherDataUnit unit;
    private Boolean includeDetails;
    private Boolean includeGeometricDetails;
    private Boolean includeCurrentStorm;

    public TropicalStormLocationOptions(int year, BasinId basinId, int governmentStormId) {
        this.year = year;
        this.basinId = basinId;
        this.governmentStormId = governmentStormId;
    }

    public int getYear() {
        return this.year;
    }

    public BasinId getBasinId() {
        return this.basinId;
    }

    public int getGovernmentStormId() {
        return this.governmentStormId;
    }

    public WeatherDataUnit getUnit() {
        return this.unit;
    }

    public Boolean getIncludeDetails() {
        return this.includeDetails;
    }

    public Boolean getIncludeGeometricDetails() {
        return this.includeGeometricDetails;
    }

    public Boolean getIncludeCurrentStorm() {
        return this.includeCurrentStorm;
    }

    public TropicalStormLocationOptions year(int year) {
        this.year = year;
        return this;
    }

    public TropicalStormLocationOptions basinId(BasinId basinId) {
        this.basinId = basinId;
        return this;
    }

    public TropicalStormLocationOptions governmentStormId(int governmentStormId) {
        this.governmentStormId = governmentStormId;
        return this;
    }

    public TropicalStormLocationOptions unit(WeatherDataUnit unit) {
        this.unit = unit;
        return this;
    }

    public TropicalStormLocationOptions includeDetails(Boolean includeDetails) {
        this.includeDetails = includeDetails;
        return this;
    }

    public TropicalStormLocationOptions includeGeometricDetails(Boolean includeGeometricDetails) {
        this.includeGeometricDetails = includeGeometricDetails;
        return this;
    }

    public TropicalStormLocationOptions includeCurrentStorm(Boolean includeCurrentStorm) {
        this.includeCurrentStorm = includeCurrentStorm;
        return this;
    }
}
