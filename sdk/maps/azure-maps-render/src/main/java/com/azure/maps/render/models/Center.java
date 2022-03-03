package com.azure.maps.render.models;

import java.util.List;
import java.util.Objects;

/**
 * Represents Center
 */
public final class Center {
    private LatLong coordinates;
    private int zoom;

    /**
     * 
     * @param longitude
     * @param latitude
     * @param zoom
     */
    public Center(double longitude, double latitude, double zoom) {
        this.coordinates = new LatLong(longitude, latitude);
        this.zoom = (int) zoom;
    }

    /**
     * 
     * @param longitude
     * @param latitude
     */
    public Center(double longitude, double latitude) {
        this.coordinates = new LatLong(longitude, latitude);
    }
    
    Center(List<Float> inputs) {
        Objects.requireNonNull(inputs, "Internal bounding box model is needed.");
        Objects.requireNonNull(inputs.get(0), "Latitude is needed");
        Objects.requireNonNull(inputs.get(1), "Longitude is needed");
        Objects.requireNonNull(inputs.get(2), "Zoom is needed"); // check btw minzoom and maxzoom

        final float latitude = inputs.get(0);
        final float longitude = inputs.get(1);
        this.zoom = inputs.get(2).intValue();

        this.coordinates = new LatLong(latitude, longitude);
    }

    /**
     * Returns the coordinates
     * @return 
     */
    public LatLong getCoordinates() {
        return this.coordinates;
    }

    /**
     * Sets the coordinates
     * @param coordinates
     */
    public void setCoordinates(LatLong coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * Returns the zoom
     * @return
     */
    public int getZoom() {
        return this.zoom;
    }

    /**
     * Sets the zoom
     * @param zoom
     */
    public void setZoom(int zoom) {
        this.zoom = zoom;
    }
}