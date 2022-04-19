// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.timezone.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.models.GeoPosition;
import com.azure.maps.timezone.implementation.models.RepresentativePoint;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The TimezoneId model. */
@Fluent
public final class TimezoneId {
    /*
     * Id property
     */
    @JsonProperty(value = "Id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * An array of time zone ID aliases.  Only returned when
     * [options]=*zoneinfo* or *all*.
     *
     * Note: may be null.
     */
    @JsonProperty(value = "Aliases", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> aliases;

    /*
     * An array of country records. Only returned when [options]=*zoneinfo* or
     * *all*.
     */
    @JsonProperty(value = "Countries", access = JsonProperty.Access.WRITE_ONLY)
    private List<CountryRecord> countries;

    /*
     * Timezone names object.
     */
    @JsonProperty(value = "Names")
    private TimezoneNames names;

    /*
     * Details in effect at the local time.
     */
    @JsonProperty(value = "ReferenceTime", access = JsonProperty.Access.WRITE_ONLY)
    private ReferenceTime referenceTime;

    /*
     * Representative point property
     */
    @JsonProperty(value = "RepresentativePoint", access = JsonProperty.Access.WRITE_ONLY)
    private RepresentativePoint representativePoint;

    /*
     * Time zone DST transitions from [transitionsFrom] until timestamp + 1
     * year.
     */
    @JsonProperty(value = "TimeTransitions", access = JsonProperty.Access.WRITE_ONLY)
    private List<TimeTransition> timeTransitions;

    /**
     * Get the id property: Id property.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the aliases property: An array of time zone ID aliases.  Only returned when [options]=*zoneinfo* or *all*.
     *
     * <p>Note: may be null.
     *
     * @return the aliases value.
     */
    public List<String> getAliases() {
        return this.aliases;
    }

    /**
     * Get the countries property: An array of country records. Only returned when [options]=*zoneinfo* or *all*.
     *
     * @return the countries value.
     */
    public List<CountryRecord> getCountries() {
        return this.countries;
    }

    /**
     * Get the names property: Timezone names object.
     *
     * @return the names value.
     */
    public TimezoneNames getNames() {
        return this.names;
    }

    /**
     * Set the names property: Timezone names object.
     *
     * @param names the names value to set.
     * @return the TimezoneId object itself.
     */
    public TimezoneId setNames(TimezoneNames names) {
        this.names = names;
        return this;
    }

    /**
     * Get the referenceTime property: Details in effect at the local time.
     *
     * @return the referenceTime value.
     */
    public ReferenceTime getReferenceTime() {
        return this.referenceTime;
    }

    /**
     * Get the timeTransitions property: Time zone DST transitions from [transitionsFrom] until timestamp + 1 year.
     *
     * @return the timeTransitions value.
     */
    public List<TimeTransition> getTimeTransitions() {
        return this.timeTransitions;
    }

    /** * Returns a {@link GeoPosition} coordinate.** return the coordinate */
    public GeoPosition getRepresentativePoint() {
        return new GeoPosition(this.representativePoint.getLongitude(), this.representativePoint.getLatitude());
    }
}
