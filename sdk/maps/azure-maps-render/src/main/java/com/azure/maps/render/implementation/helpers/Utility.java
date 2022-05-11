package com.azure.maps.render.implementation.helpers;

import java.util.Locale;

import com.azure.maps.render.implementation.models.IncludeText;

public class Utility {
    private static final String ARGUMENT_NULL_OR_EMPTY =
        "The argument must not be null or an empty string. Argument name: %s.";
        
    public static IncludeText toIncludeTextPrivate(boolean includeText) {
        return IncludeText.fromString(String.valueOf(includeText));
    }

    /**
     * Asserts that a value is not {@code null}.
     *
     * @param param Name of the parameter
     * @param value Value of the parameter
     * @throws NullPointerException If {@code value} is {@code null}
     */
    public static void assertNotNull(final String param, final Object value) {
        if (value == null) {
            throw new NullPointerException(String.format(Locale.ROOT, ARGUMENT_NULL_OR_EMPTY, param));
        }
    }
}