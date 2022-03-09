package com.azure.maps.weather.models;

public class TropicalStormForecastOptions {
    private int year;
    private BasinId basinId;
    private int governmentStormId;
    private WeatherDataUnit unit;
    private Boolean includeDetails;
    private Boolean includeGeometricDetails;
    private Boolean includeWindowGeometry;

    public TropicalStormForecastOptions(int year, BasinId basinId, int governmentStormId) {
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

    public Boolean getIncludeWindowGeometry() {
        return this.includeWindowGeometry;
    }

    public TropicalStormForecastOptions year(int year) {
        this.year = year;
        return this;
    }

    public TropicalStormForecastOptions basinId(BasinId basinId) {
        this.basinId = basinId;
        return this;
    }

    public TropicalStormForecastOptions governmentStormId(int governmentStormId) {
        this.governmentStormId = governmentStormId;
        return this;
    }

    public TropicalStormForecastOptions unit(WeatherDataUnit unit) {
        this.unit = unit;
        return this;
    }

    public TropicalStormForecastOptions includeDetails(Boolean includeDetails) {
        this.includeDetails = includeDetails;
        return this;
    }

    public TropicalStormForecastOptions includeGeometricDetails(Boolean includeGeometricDetails) {
        this.includeGeometricDetails = includeGeometricDetails;
        return this;
    }

    public TropicalStormForecastOptions includeWindowGeometry(Boolean includeWindowGeometry) {
        this.includeWindowGeometry = includeWindowGeometry;
        return this;
    }
}
