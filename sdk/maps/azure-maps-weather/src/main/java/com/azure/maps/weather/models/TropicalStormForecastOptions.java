package com.azure.maps.weather.models;

public class TropicalStormForecastOptions {
    private Integer year;
    private BasinId basinId;
    private Integer governmentStormId;
    private WeatherDataUnit unit;
    private Boolean includeDetails;
    private Boolean includeGeometricDetails;
    private Boolean includeWindowGeometry;

    public TropicalStormForecastOptions(Integer year, BasinId basinId, Integer governmentStormId) {
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

    public Boolean getIncludeWindowGeometry() {
        return this.includeWindowGeometry;
    }

    public TropicalStormForecastOptions setYear(Integer year) {
        this.year = year;
        return this;
    }

    public TropicalStormForecastOptions setBasinId(BasinId basinId) {
        this.basinId = basinId;
        return this;
    }

    public TropicalStormForecastOptions setGovernmentStormId(Integer governmentStormId) {
        this.governmentStormId = governmentStormId;
        return this;
    }

    public TropicalStormForecastOptions setUnit(WeatherDataUnit unit) {
        this.unit = unit;
        return this;
    }

    public TropicalStormForecastOptions setIncludeDetails(Boolean includeDetails) {
        this.includeDetails = includeDetails;
        return this;
    }

    public TropicalStormForecastOptions setIncludeGeometricDetails(Boolean includeGeometricDetails) {
        this.includeGeometricDetails = includeGeometricDetails;
        return this;
    }

    public TropicalStormForecastOptions setIncludeWindowGeometry(Boolean includeWindowGeometry) {
        this.includeWindowGeometry = includeWindowGeometry;
        return this;
    }
}
