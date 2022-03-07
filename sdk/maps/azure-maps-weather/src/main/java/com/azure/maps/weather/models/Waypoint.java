package com.azure.maps.weather.models;

import com.azure.core.models.GeoPosition;

public class Waypoint {
    private GeoPosition position;
    private Double estimatedTimeInMinutes = 0.0;
    private Double heading = null;

    public Waypoint() {
    }

    public Waypoint(GeoPosition position, Double estimatedTimeInMinutes) {
        this.position = position;
        this.estimatedTimeInMinutes = estimatedTimeInMinutes;
    }

    public GeoPosition getPosition() {
        return this.position;
    }

    public Double getEstimatedTimeInMinutes() {
        return this.estimatedTimeInMinutes;
    }

    public Double getHeading() {
        return this.heading;
    }

    public Waypoint position(GeoPosition position) {
        this.position = position;
        return this;
    }

    public Waypoint estimatedTimeInMinutes(Double estimatedTimeInMinutes) {
        this.estimatedTimeInMinutes = estimatedTimeInMinutes;
        return this;
    }

    public Waypoint heading(Double heading) {
        this.heading = heading;
        return this;
    }

    @Override
    public String toString() {
        String parameters = String.format("%f,%f,%f", this.position.getLatitude(),
            this.position.getLongitude(), this.estimatedTimeInMinutes);

        // heading is optional so we have to check if it's present to not break the string
        if (heading != null) {
            parameters += String.format(",%f", this.heading);
        }

        return parameters;
    }

}
