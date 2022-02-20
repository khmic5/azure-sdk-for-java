package com.azure.maps.render.implementation.helpers;

import java.util.Arrays;
import java.util.List;

import com.azure.maps.render.implementation.models.BoundingBoxPrivate;
import com.azure.maps.render.implementation.models.IncludeText;
import com.azure.maps.render.models.BoundingBox;
import com.azure.maps.render.models.Center;

public class Utility {
    public static BoundingBoxPrivate toBoundingBoxPrivate(BoundingBox boundingBox) {
        BoundingBoxPrivate boundingBoxPrivate = new BoundingBoxPrivate();
        BoundingBoxPropertiesHelper.setToBoundingBoxPrivate(boundingBox, boundingBoxPrivate);
        return boundingBoxPrivate;
    }

    public static IncludeText toIncludeTextPrivate(boolean includeText) {
        return IncludeText.fromString(String.valueOf(includeText));
    }

    public static List<Double> toCenter(Center center) {
        return Arrays.asList(center.getCoordinates().getLatitude(), 
        center.getCoordinates().getLongitude(), Double.valueOf(center.getZoom()));
    }
}