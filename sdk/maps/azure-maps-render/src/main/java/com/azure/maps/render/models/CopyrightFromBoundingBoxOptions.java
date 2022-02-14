package com.azure.maps.render.models;

public class CopyrightFromBoundingBoxOptions {
    private ResponseFormat format;
    private BoundingBox boundingBox;
    private IncludeText includeText;

    public ResponseFormat getResponseFormat() {
        return format;
    }

    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    public IncludeText getIncludeText() {
        return includeText;
    }
}
