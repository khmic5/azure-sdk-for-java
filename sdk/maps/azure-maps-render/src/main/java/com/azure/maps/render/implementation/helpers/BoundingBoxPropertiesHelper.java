package com.azure.maps.render.implementation.helpers;

import com.azure.maps.render.implementation.models.BoundingBoxPrivate;
import com.azure.maps.render.models.BoundingBox;

public final class BoundingBoxPropertiesHelper {
    private static BoundingBoxAccessor accessor;

    private BoundingBoxPropertiesHelper() { }

    public interface BoundingBoxAccessor {
        void setToBoundingBoxPrivate(BoundingBox boundingBox, BoundingBoxPrivate boundingBoxPrivate);
    }

    public static void setAccessor(final BoundingBoxAccessor boundingBoxAccessor) {
        accessor = boundingBoxAccessor;
    }

    public static void setToBoundingBoxPrivate(BoundingBox boundingBox, BoundingBoxPrivate boundingBoxPrivate) {
        accessor.setToBoundingBoxPrivate(boundingBox, boundingBoxPrivate);
    }
}