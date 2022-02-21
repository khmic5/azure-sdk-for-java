package com.azure.maps.route.implementation.helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.azure.core.http.HttpHeaders;

public class Utility {
    private static final Pattern uuidPattern = Pattern.compile("[0-9A-Fa-f\\-]{36}");

    /**
     *
     */
    public static String getBatchId(HttpHeaders headers) {
        // this can happen when deserialization is happening
        // to convert the private model to public model (see BatchResponseSerializer)
        if (headers == null) return null;

        // if not, let's go
        final String location = headers.getValue("Location");

        if (location != null) {
            Matcher matcher = uuidPattern.matcher(location);
            matcher.find();
            return matcher.group();
        }

        return null;
    }
}
