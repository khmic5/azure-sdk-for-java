package com.azure.maps.render.models;

import java.util.List;
import java.util.Objects;

public final class BoundingBox {
    private LatLong topLeft;
    private LatLong bottomRight;

    /**
     * Constructor
     */
    public BoundingBox() {
    }

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
    public BoundingBox(double west, double north, double east, double south) {
        Objects.requireNonNull(west, "Left bound is needed");
        Objects.requireNonNull(south, "Bottom bound is needed");
        Objects.requireNonNull(east, "Right bound is needed");
        Objects.requireNonNull(north, "Top bound is needed");
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

    BoundingBox(List<Float> bounds) {
        Objects.requireNonNull(bounds, "Internal bounding box model is needed.");
        
        final float leftBound = bounds.get(0);
        final float bottomBound = bounds.get(1);
        final float rightBound = bounds.get(2);
        final float topBound = bounds.get(3);

        Objects.requireNonNull(leftBound, "Left bound is needed");
        Objects.requireNonNull(bottomBound, "Bottom bound is needed");
        Objects.requireNonNull(rightBound, "Right bound is needed");
        Objects.requireNonNull(topBound, "Top bound is needed");

        final LatLong topRight = new LatLong(rightBound, topBound);
        final LatLong bottomLeft = new LatLong(leftBound, bottomBound);

        // derive top and bottom left
        this.topLeft = new LatLong(topRight.getLatitude(), bottomLeft.getLongitude());
        this.bottomRight = new LatLong(bottomLeft.getLatitude(), topRight.getLongitude());
    }
}