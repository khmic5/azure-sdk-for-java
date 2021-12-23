// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.maps.search.models.DataSource;
import com.azure.maps.search.models.GeographicEntityType;
import com.azure.maps.search.models.MatchType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Result object for a Search API response. */
@Fluent
public final class SearchAddressResultItemPrivate {
    /*
     * One of:
     * * POI
     * * Street
     * * Geography
     * * Point Address
     * * Address Range
     * * Cross Street
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private SearchAddressResultType type;

    /*
     * Id property
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The value within a result set to indicate the relative matching score
     * between results.  You can use this to  determine that result x is twice
     * as likely to be as relevant as result y if the value of x is 2x the
     * value of y.   The values vary between queries and is only meant as a
     * relative value for one result set.
     */
    @JsonProperty(value = "score", access = JsonProperty.Access.WRITE_ONLY)
    private Double score;

    /*
     * Straight line distance between the result and geobias location in
     * meters.
     */
    @JsonProperty(value = "dist", access = JsonProperty.Access.WRITE_ONLY)
    private Double distanceInMeters;

    /*
     * Information about the original data source of the Result. Used for
     * support requests.
     */
    @JsonProperty(value = "info", access = JsonProperty.Access.WRITE_ONLY)
    private String info;

    /*
     * The entityType property.
     */
    @JsonProperty(value = "entityType")
    private GeographicEntityType entityType;

    /*
     * Details of the returned POI including information such as the name,
     * phone, url address, and classifications.
     */
    @JsonProperty(value = "poi", access = JsonProperty.Access.WRITE_ONLY)
    private PointOfInterest pointOfInterest;

    /*
     * The address of the result
     */
    @JsonProperty(value = "address", access = JsonProperty.Access.WRITE_ONLY)
    private AddressPrivate address;

    /*
     * A location represented as a latitude and longitude using short names
     * 'lat' & 'lon'.
     */
    @JsonProperty(value = "position")
    private LatLongPairAbbreviated position;

    /*
     * The viewport that covers the result represented by the top-left and
     * bottom-right coordinates of the viewport.
     */
    @JsonProperty(value = "viewport", access = JsonProperty.Access.WRITE_ONLY)
    private BoundingBox viewport;

    /*
     * Array of EntryPoints. Those describe the types of entrances available at
     * the location. The type can be "main" for main entrances such as a front
     * door, or a lobby, and "minor", for side and back doors.
     */
    @JsonProperty(value = "entryPoints", access = JsonProperty.Access.WRITE_ONLY)
    private List<EntryPointPrivate> entryPoints;

    /*
     * Describes the address range on both sides of the street for a search
     * result. Coordinates for the start and end locations of the address range
     * are included.
     */
    @JsonProperty(value = "addressRanges", access = JsonProperty.Access.WRITE_ONLY)
    private AddressRangesPrivate addressRanges;

    /*
     * Optional section. Reference geometry id for use with the [Get Search
     * Polygon](https://docs.microsoft.com/rest/api/maps/search/getsearchpolygon)
     * API.
     */
    @JsonProperty(value = "dataSources", access = JsonProperty.Access.WRITE_ONLY)
    private DataSource dataSources;

    /*
     * Information on the type of match.
     *
     * One of:
     * * AddressPoint
     * * HouseNumberRange
     * * Street
     */
    @JsonProperty(value = "matchType", access = JsonProperty.Access.WRITE_ONLY)
    private MatchType matchType;

    /*
     * Detour time in seconds. Only returned for calls to the Search Along
     * Route API.
     */
    @JsonProperty(value = "detourTime", access = JsonProperty.Access.WRITE_ONLY)
    private Integer detourTime;

    /**
     * Get the type property: One of: * POI * Street * Geography * Point Address * Address Range * Cross Street.
     *
     * @return the type value.
     */
    public SearchAddressResultType getType() {
        return this.type;
    }

    /**
     * Get the id property: Id property.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the score property: The value within a result set to indicate the relative matching score between results.
     * You can use this to determine that result x is twice as likely to be as relevant as result y if the value of x is
     * 2x the value of y. The values vary between queries and is only meant as a relative value for one result set.
     *
     * @return the score value.
     */
    public Double getScore() {
        return this.score;
    }

    /**
     * Get the distanceInMeters property: Straight line distance between the result and geobias location in meters.
     *
     * @return the distanceInMeters value.
     */
    public Double getDistanceInMeters() {
        return this.distanceInMeters;
    }

    /**
     * Get the info property: Information about the original data source of the Result. Used for support requests.
     *
     * @return the info value.
     */
    public String getInfo() {
        return this.info;
    }

    /**
     * Get the entityType property: The entityType property.
     *
     * @return the entityType value.
     */
    public GeographicEntityType getEntityType() {
        return this.entityType;
    }

    /**
     * Set the entityType property: The entityType property.
     *
     * @param entityType the entityType value to set.
     * @return the SearchAddressResultItemPrivate object itself.
     */
    public SearchAddressResultItemPrivate setEntityType(GeographicEntityType entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Get the pointOfInterest property: Details of the returned POI including information such as the name, phone, url
     * address, and classifications.
     *
     * @return the pointOfInterest value.
     */
    public PointOfInterest getPointOfInterest() {
        return this.pointOfInterest;
    }

    /**
     * Get the address property: The address of the result.
     *
     * @return the address value.
     */
    public AddressPrivate getAddress() {
        return this.address;
    }

    /**
     * Get the position property: A location represented as a latitude and longitude using short names 'lat' &amp;
     * 'lon'.
     *
     * @return the position value.
     */
    public LatLongPairAbbreviated getPosition() {
        return this.position;
    }

    /**
     * Set the position property: A location represented as a latitude and longitude using short names 'lat' &amp;
     * 'lon'.
     *
     * @param position the position value to set.
     * @return the SearchAddressResultItemPrivate object itself.
     */
    public SearchAddressResultItemPrivate setPosition(LatLongPairAbbreviated position) {
        this.position = position;
        return this;
    }

    /**
     * Get the viewport property: The viewport that covers the result represented by the top-left and bottom-right
     * coordinates of the viewport.
     *
     * @return the viewport value.
     */
    public BoundingBox getViewport() {
        return this.viewport;
    }

    /**
     * Get the entryPoints property: Array of EntryPoints. Those describe the types of entrances available at the
     * location. The type can be "main" for main entrances such as a front door, or a lobby, and "minor", for side and
     * back doors.
     *
     * @return the entryPoints value.
     */
    public List<EntryPointPrivate> getEntryPoints() {
        return this.entryPoints;
    }

    /**
     * Get the addressRanges property: Describes the address range on both sides of the street for a search result.
     * Coordinates for the start and end locations of the address range are included.
     *
     * @return the addressRanges value.
     */
    public AddressRangesPrivate getAddressRanges() {
        return this.addressRanges;
    }

    /**
     * Get the dataSources property: Optional section. Reference geometry id for use with the [Get Search
     * Polygon](https://docs.microsoft.com/rest/api/maps/search/getsearchpolygon) API.
     *
     * @return the dataSources value.
     */
    public DataSource getDataSources() {
        return this.dataSources;
    }

    /**
     * Get the matchType property: Information on the type of match.
     *
     * <p>One of: * AddressPoint * HouseNumberRange * Street.
     *
     * @return the matchType value.
     */
    public MatchType getMatchType() {
        return this.matchType;
    }

    /**
     * Get the detourTime property: Detour time in seconds. Only returned for calls to the Search Along Route API.
     *
     * @return the detourTime value.
     */
    public Integer getDetourTime() {
        return this.detourTime;
    }
}
