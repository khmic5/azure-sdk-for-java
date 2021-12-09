package com.azure.maps.search.models;

import com.azure.maps.search.implementation.models.LatLongPairAbbreviated;

public class LatLong {
    private double latitude;
    private double longitude;

    public LatLong(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    LatLong(LatLongPairAbbreviated pair) {
        this.latitude = pair.getLat();
        this.longitude = pair.getLon();
    }

    public double getLat() {
        return latitude;
    }

    public double getLon() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return latitude + "," + longitude;
    }
}
