package com.azure.maps.render.models;

import java.util.List;
import java.util.Objects;

public class Center {
    private LatLong coordinates;
    private int zoom;
    //List<float>
    // The default location of the tileset in the form [longitude, latitude,
     //* zoom]. The zoom level MUST be between minzoom and maxzoom.
     //* Implementations can use this value to set the default location.
    
    Center(List<Float> inputs) {
        Objects.requireNonNull(inputs, "Internal bounding box model is needed.");
        Objects.requireNonNull(inputs.get(0), "Latitude is needed");
        Objects.requireNonNull(inputs.get(1), "Longitude is needed");
        Objects.requireNonNull(inputs.get(2), "Zoom is needed"); // check btw minzoom and maxzoom

        final float latitude = inputs.get(0);
        final float longitude = inputs.get(1);
        this.zoom = Math.round(inputs.get(2));

        this.coordinates = new LatLong(latitude, longitude);
    }

    public LatLong getCoordinates() {
        return this.coordinates;
    }

    public int getZoom() {
        return this.zoom;
    }
}