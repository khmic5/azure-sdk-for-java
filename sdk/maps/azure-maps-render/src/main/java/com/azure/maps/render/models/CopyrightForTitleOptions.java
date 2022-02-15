package com.azure.maps.render.models;

import com.azure.maps.render.implementation.models.IncludeText;
import com.azure.maps.render.implementation.models.ResponseFormat;
import com.azure.maps.render.implementation.models.TileIndex;

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
