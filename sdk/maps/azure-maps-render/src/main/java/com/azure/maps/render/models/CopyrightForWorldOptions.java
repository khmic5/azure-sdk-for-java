package com.azure.maps.render.models;

import com.azure.core.http.rest.Response;
import com.azure.maps.render.implementation.models.IncludeText;
import com.azure.maps.render.implementation.models.ResponseFormat;

public class CopyrightForWorldOptions {
    private ResponseFormat format;
    private IncludeText includeText;

    public ResponseFormat getResponseFormat() {
        return format;
    }

    public IncludeText getIncludeText() {
        return includeText;
    }
}
