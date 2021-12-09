package com.azure.maps.search.models;

import com.azure.maps.search.implementation.models.LatLongPairAbbreviated;

/**
 * Class representing a latitude/longitude pair.
 */
public final class LatLong {
    private double latitude;
    private double longitude;

    /**
     * Constructs a LatLong with a latitude and a longitude.
     * @param latitude
     * @param longitude
     */
    public LatLong(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Constructs a LatLong with an internal model representation.
     * @param pair
     */
    LatLong(LatLongPairAbbreviated pair) {
        this.latitude = pair.getLat();
        this.longitude = pair.getLon();
    }

    /**
     * Returns the latitude.
     * @return
     */
    public double getLat() {
        return latitude;
    }

    /**
     * Returns the longitude.
     * @return
     */
    public double getLon() {
        return longitude;
    }

    /**
     * Returns the latitude.
     * @return
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Returns the longitude.
     * @return
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Returns a string representation.
     */
    @Override
    public String toString() {
        return latitude + "," + longitude;
    }
}
