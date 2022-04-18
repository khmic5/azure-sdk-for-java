package com.azure.maps.timezone.models;

import java.time.OffsetDateTime;

import com.azure.core.models.GeoPosition;

public final class TimezoneCoordinateOptions {
    private GeoPosition coordinates;
    private String acceptLanguage;
    private TimezoneOptions options;
    private OffsetDateTime timeStamp;
    private OffsetDateTime daylightSavingsTimeFrom;
    private Integer daylightSavingsTimeLastingYears;

    public GeoPosition getCoordinates() {
        return coordinates;
    }

    public TimezoneCoordinateOptions setCoordinates(GeoPosition coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public TimezoneCoordinateOptions setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    public TimezoneOptions getOptions() {
        return options;
    }

    public TimezoneCoordinateOptions setOptions(TimezoneOptions options) {
        this.options = options;
        return this;
    }

    public OffsetDateTime getTimeStamp() {
        return timeStamp;
    }

    public TimezoneCoordinateOptions setTimeStamp(OffsetDateTime timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    public OffsetDateTime getDaylightSavingsTimeFrom() {
        return daylightSavingsTimeFrom;
    }

    public TimezoneCoordinateOptions setDaylightSavingsTimeFrom(OffsetDateTime daylightSavingsTimeFrom) {
        this.daylightSavingsTimeFrom = daylightSavingsTimeFrom;
        return this;
    }

    public Integer getDaylightSavingsTimeLastingYears() {
        return daylightSavingsTimeLastingYears;
    }

    public TimezoneCoordinateOptions setDaylightSavingsTimeLastingYears(Integer daylightSavingsTimeLastingYears) {
        this.daylightSavingsTimeLastingYears = daylightSavingsTimeLastingYears;
        return this;
    }
}
