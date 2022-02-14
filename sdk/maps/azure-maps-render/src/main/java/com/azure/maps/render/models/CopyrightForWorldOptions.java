package com.azure.maps.render.models;

import com.azure.core.http.rest.Response;

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
