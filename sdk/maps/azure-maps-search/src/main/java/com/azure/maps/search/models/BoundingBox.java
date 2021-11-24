package com.azure.maps.search.models;

import java.util.Objects;

public class BoundingBox {
    private LatLong topLeft;
    private LatLong bottomRight;

    public BoundingBox(LatLong topLeft, LatLong bottomRight) {
        Objects.requireNonNull(topLeft, "Top left of the bounding box is needed.");
        Objects.requireNonNull(bottomRight, "Bottom right of the bounding box is needed.");
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public BoundingBox(double north, double east, double south, double west) {
        this.topLeft = new LatLong(north, west);
        this.bottomRight = new LatLong(south, east);
    }

    public LatLong getTopLeft() {
        return this.topLeft;
    }

    public LatLong getBottomRight() {
        return this.bottomRight;
    }

    public LatLong getTopRight() {
        return new LatLong(this.topLeft.getLat(), this.bottomRight.getLon());
    }

    public LatLong getBottomLeft() {
        return new LatLong(this.bottomRight.getLat(), this.topLeft.getLon());
    }

    public LatLong getSouthWest() {
        return getBottomLeft();
    }

    public LatLong getNorthEast() {
        return getTopRight();
    }
}
