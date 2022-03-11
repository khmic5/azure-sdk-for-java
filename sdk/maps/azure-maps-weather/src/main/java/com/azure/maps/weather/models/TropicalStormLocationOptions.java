package com.azure.maps.weather.models;

public class TropicalStormLocationOptions {
    private Integer year;
    private BasinId basinId;
    private Integer governmentStormId;
    private WeatherDataUnit unit;
    private Boolean includeDetails;
    private Boolean includeGeometricDetails;
    private Boolean includeCurrentStorm;

    public TropicalStormLocationOptions(Integer year, BasinId basinId, Integer governmentStormId) {
        this.year = year;
        this.basinId = basinId;
        this.governmentStormId = governmentStormId;
    }

    public Integer getYear() {
        return this.year;
    }

    public BasinId getBasinId() {
        return this.basinId;
    }

    public Integer getGovernmentStormId() {
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

    public TropicalStormLocationOptions setYear(Integer year) {
        this.year = year;
        return this;
    }

    public TropicalStormLocationOptions setBasinId(BasinId basinId) {
        this.basinId = basinId;
        return this;
    }

    public TropicalStormLocationOptions setGovernmentStormId(Integer governmentStormId) {
        this.governmentStormId = governmentStormId;
        return this;
    }

    public TropicalStormLocationOptions setUnit(WeatherDataUnit unit) {
        this.unit = unit;
        return this;
    }

    public TropicalStormLocationOptions setIncludeDetails(Boolean includeDetails) {
        this.includeDetails = includeDetails;
        return this;
    }

    public TropicalStormLocationOptions setIncludeGeometricDetails(Boolean includeGeometricDetails) {
        this.includeGeometricDetails = includeGeometricDetails;
        return this;
    }

    public TropicalStormLocationOptions setIncludeCurrentStorm(Boolean includeCurrentStorm) {
        this.includeCurrentStorm = includeCurrentStorm;
        return this;
    }
}
