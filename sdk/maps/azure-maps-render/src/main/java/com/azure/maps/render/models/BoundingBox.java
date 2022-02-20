package com.azure.maps.render.models;

import java.util.List;
import java.util.Objects;

public final class BoundingBox {
    private LatLong topLeft;
    private LatLong bottomRight;

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

    BoundingBox(List<Float> bounds) {
        Objects.requireNonNull(bounds, "Internal bounding box model is needed.");
        Objects.requireNonNull(bounds.get(0), "Left bound is needed");
        Objects.requireNonNull(bounds.get(1), "Bottom bound is needed");
        Objects.requireNonNull(bounds.get(2), "Right bound is needed");
        Objects.requireNonNull(bounds.get(3), "Top bound is needed");

        final float leftBound = bounds.get(0);
        final float bottomBound = bounds.get(1);
        final float rightBound = bounds.get(2);
        final float topBound = bounds.get(3);

        final String northEastString = String.valueOf(rightBound) + "," + String.valueOf(topBound);
        final String southWestString = String.valueOf(leftBound) + "," + String.valueOf(bottomBound);
        final LatLong topRight = stringToCoordinate(northEastString);
        final LatLong bottomLeft = stringToCoordinate(southWestString);

        // derive top and bottom left
        this.topLeft = new LatLong(topRight.getLatitude(), bottomLeft.getLongitude());
        this.bottomRight = new LatLong(bottomLeft.getLatitude(), topRight.getLongitude());
    }

    // converts a comma-separated string into a latlong pair
    private LatLong stringToCoordinate(String s) {
        final String[] coordinateString = s.split(",");

        if (coordinateString != null && coordinateString.length == 2) {
            return new LatLong(Double.parseDouble(coordinateString[0]),
                Double.parseDouble(coordinateString[1]));
        }

        return null;
    }
}
