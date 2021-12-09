package com.azure.maps.search.models;

import java.util.Objects;

/**
 * Class representing a bounding box.
 */
public class BoundingBox {
    private LatLong topLeft;
    private LatLong bottomRight;

    /**
     * Constructs a bounding box with top left and bottom right parameters.
     * @param topLeft
     * @param bottomRight
     */
    public BoundingBox(LatLong topLeft, LatLong bottomRight) {
        Objects.requireNonNull(topLeft, "Top left of the bounding box is needed.");
        Objects.requireNonNull(bottomRight, "Bottom right of the bounding box is needed.");
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    /**
     * Constructs a bounding box with four coordinates.
     * @param north
     * @param east
     * @param south
     * @param west
     */
    public BoundingBox(double north, double east, double south, double west) {
        this.topLeft = new LatLong(north, west);
        this.bottomRight = new LatLong(south, east);
    }

    /**
     * Returns the top left corner.
     * @return
     */
    public LatLong getTopLeft() {
        return this.topLeft;
    }

    /**
     * Returns the bottom right corner.
     * @return
     */
    public LatLong getBottomRight() {
        return this.bottomRight;
    }

    /**
     * Returns the top right corner.
     * @return
     */
    public LatLong getTopRight() {
        return new LatLong(this.topLeft.getLat(), this.bottomRight.getLon());
    }

    /**
     * Returns the bottom left corner.
     * @return
     */
    public LatLong getBottomLeft() {
        return new LatLong(this.bottomRight.getLat(), this.topLeft.getLon());
    }

    /**
     * Returns the southwest corner
     * @return
     */
    public LatLong getSouthWest() {
        return getBottomLeft();
    }

    /**
     * Returns the northeast corner.
     * @return
     */
    public LatLong getNorthEast() {
        return getTopRight();
    }
}
