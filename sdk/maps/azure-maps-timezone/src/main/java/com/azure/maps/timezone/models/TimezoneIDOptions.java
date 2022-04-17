package com.azure.maps.timezone.models;

import java.time.OffsetDateTime;

import com.azure.maps.timezone.implementation.models.TimezoneOptions;

/**
 * Organizes inputs for get timezone by ID
 */
public final class TimezoneIDOptions {
    private String timezoneId;
    private String acceptLanguage;
    private TimezoneOptions options;
    private OffsetDateTime timeStamp;
    private OffsetDateTime daylightSavingsTimeFrom;
    private Integer daylightSavingsTimeLastingYears;

    /**
     * 
     * @return
     */
    public String getTimezoneId() {
        return timezoneId;
    }
    public TimezoneIDOptions setTimezoneId(String timezoneId) {
        this.timezoneId = timezoneId;
        return this;
    }

    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public TimezoneIDOptions setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    public TimezoneOptions getOptions() {
        return options;
    }

    public TimezoneIDOptions setOptions(TimezoneOptions options) {
        this.options = options;
        return this;
    }

    public OffsetDateTime getTimeStamp() {
        return timeStamp;
    }

    public TimezoneIDOptions setTimeStamp(OffsetDateTime timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    public OffsetDateTime getDaylightSavingsTimeFrom() {
        return daylightSavingsTimeFrom;
    }

    public TimezoneIDOptions setDaylightSavingsTimeFrom(OffsetDateTime daylightSavingsTimeFrom) {
        this.daylightSavingsTimeFrom = daylightSavingsTimeFrom;
        return this;
    }

    public Integer getDaylightSavingsTimeLastingYears() {
        return daylightSavingsTimeLastingYears;
    }

    public TimezoneIDOptions setDaylightSavingsTimeLastingYears(Integer daylightSavingsTimeLastingYears) {
        this.daylightSavingsTimeLastingYears = daylightSavingsTimeLastingYears;
        return this;
    }
}
