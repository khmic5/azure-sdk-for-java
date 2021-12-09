// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.

package com.azure.maps.search.models;

import java.util.List;

import com.azure.core.annotation.Immutable;
import com.azure.maps.search.implementation.models.Address;
import com.azure.maps.search.implementation.models.DataSources;
import com.azure.maps.search.implementation.models.EntryPoint;
import com.azure.maps.search.implementation.models.MatchType;
import com.azure.maps.search.implementation.models.PointOfInterest;
import com.azure.maps.search.implementation.models.SearchAddressResultType;
import com.azure.maps.search.implementation.models.Viewport;

/** Result object for a Search API response. */
@Immutable
public final class SearchAddressResultItem {

    /*
     * Internal model
     */
    private com.azure.maps.search.implementation.models.SearchAddressResultItem internalModel = null;

    /**
     * Constructor
     */
    SearchAddressResultItem(com.azure.maps.search.implementation.models.SearchAddressResultItem internalModel) {
        this.internalModel = internalModel;
    }

    /**
     * Get the type property: One of: * POI * Street * Geography * Point Address * Address Range * Cross Street.
     *
     * @return the type value.
     */
    public SearchAddressResultType getType() {
        return this.internalModel.getType();
    }

    /**
     * Get the id property: Id property.
     *
     * @return the id value.
     */
    public String getId() {
        return this.internalModel.getId();
    }

    /**
     * Get the score property: The value within a result set to indicate the relative matching score between results.
     * You can use this to determine that result x is twice as likely to be as relevant as result y if the value of x is
     * 2x the value of y. The values vary between queries and is only meant as a relative value for one result set.
     *
     * @return the score value.
     */
    public Double getScore() {
        return this.internalModel.getScore();
    }

    /**
     * Get the distanceInMeters property: Straight line distance between the result and geobias location in meters.
     *
     * @return the distanceInMeters value.
     */
    public Double getDistanceInMeters() {
        return this.internalModel.getDistanceInMeters();
    }

    /**
     * Get the info property: Information about the original data source of the Result. Used for support requests.
     *
     * @return the info value.
     */
    public String getInfo() {
        return this.internalModel.getInfo();
    }

    /**
     * Get the entityType property: The entityType property.
     *
     * @return the entityType value.
     */
    public GeographicEntityType getEntityType() {
        return this.internalModel.getEntityType();
    }

    /**
     * Get the pointOfInterest property: Details of the returned POI including information such as the name, phone, url
     * address, and classifications.
     *
     * @return the pointOfInterest value.
     */
    public PointOfInterest getPointOfInterest() {
        return this.internalModel.getPointOfInterest();
    }

    /**
     * Get the address property: The address of the result.
     *
     * @return the address value.
     */
    public Address getAddress() {
        return this.internalModel.getAddress();
    }

    /**
     * Get the position property: A location represented as a latitude and longitude using short names 'lat' &amp;
     * 'lon'.
     *
     * @return the position value.
     */
    public LatLong getPosition() {
        return new LatLong(this.internalModel.getPosition());
    }

    /**
     * Get the bounding box property: The bounding box that covers the result represented by the top-left and bottom-right
     * coordinates of the bounding box.
     *
     * @return the viewport value.
     */
    public BoundingBox getBoundingBox() {
        Viewport v = this.internalModel.getViewport();
        return new BoundingBox(new LatLong(v.getTopLeftPoint()), new LatLong(v.getBtmRightPoint()));
    }

    /**
     * Get the entryPoints property: Array of EntryPoints. Those describe the types of entrances available at the
     * location. The type can be "main" for main entrances such as a front door, or a lobby, and "minor", for side and
     * back doors.
     *
     * @return the entryPoints value.
     */
    public List<EntryPoint> getEntryPoints() {
        return this.internalModel.getEntryPoints();
    }

    /**
     * Get the addressRanges property: Describes the address range on both sides of the street for a search result.
     * Coordinates for the start and end locations of the address range are included.
     *
     * @return the addressRanges value.
     */
    public AddressRanges getAddressRanges() {
        if (this.internalModel.getAddressRanges() != null) {
            return new AddressRanges(this.internalModel.getAddressRanges());
        }

        return null;
    }

    /**
     * Get the dataSources property: Optional section. Reference geometry id for use with the [Get Search
     * Polygon](https://docs.microsoft.com/rest/api/maps/search/getsearchpolygon) API.
     *
     * @return the dataSources value.
     */
    public DataSources getDataSources() {
        return this.internalModel.getDataSources();
    }

    /**
     * Get the matchType property: Information on the type of match.
     *
     * <p>One of: * AddressPoint * HouseNumberRange * Street.
     *
     * @return the matchType value.
     */
    public MatchType getMatchType() {
        return this.internalModel.getMatchType();
    }

    /**
     * Get the detourTime property: Detour time in seconds. Only returned for calls to the Search Along Route API.
     *
     * @return the detourTime value.
     */
    public Integer getDetourTime() {
        return this.internalModel.getDetourTime();
    }
}
