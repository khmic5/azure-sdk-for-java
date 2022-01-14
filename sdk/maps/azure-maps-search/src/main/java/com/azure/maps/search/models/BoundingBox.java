package com.azure.maps.search.models;

import java.util.Objects;

import com.azure.maps.search.implementation.models.BoundingBoxCompassNotation;

/**
 * Class representing a bounding box.
 */
public final class BoundingBox {
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
     * Package-private constructor for internal bounding box representation.
     * @param internalBoundingBox
     */
    BoundingBox(BoundingBoxCompassNotation internalBoundingBox) {
        Objects.requireNonNull(internalBoundingBox, "Internal bounding box model is needed.");
        Objects.requireNonNull(internalBoundingBox.getNorthEast(), "Top right of the bounding box is needed.");
        Objects.requireNonNull(internalBoundingBox.getSouthWest(), "Bottom left of the bounding box is needed.");

        final String northEastString = internalBoundingBox.getNorthEast();
        final String southWestString = internalBoundingBox.getSouthWest();
        final LatLong topRight = stringToCoordinate(northEastString);
        final LatLong bottomLeft = stringToCoordinate(southWestString);

        // derive top and bottom left
        this.topLeft = new LatLong(topRight.getLatitude(), bottomLeft.getLongitude());
        this.bottomRight = new LatLong(bottomLeft.getLatitude(), topRight.getLongitude());
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
