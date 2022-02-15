package com.azure.maps.render.models;

import com.azure.maps.render.implementation.models.BoundingBox;
import com.azure.maps.render.implementation.models.IncludeText;
import com.azure.maps.render.implementation.models.ResponseFormat;

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
