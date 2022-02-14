package com.azure.maps.render.models;

public class CopyrightForTitleOptions {
    private ResponseFormat format;
    private TileIndex tileIndex;
    private IncludeText includeText;

    public ResponseFormat getResponseFormat() {
        return format;
    }

    public TileIndex getTileIndex() {
        return tileIndex;
    }

    public IncludeText getIncludeText() {
        return includeText;
    }
}
