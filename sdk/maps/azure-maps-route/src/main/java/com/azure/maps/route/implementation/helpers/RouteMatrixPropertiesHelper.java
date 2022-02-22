package com.azure.maps.route.implementation.helpers;

import com.azure.maps.route.implementation.models.RouteMatrixPrivate;
import com.azure.maps.route.models.RouteMatrix;

/**
 * The helper class to set the non-public properties of an {@link RouteMatrix} instance.
 */
public final class RouteMatrixPropertiesHelper {
    private static RouteMatrixAccessor accessor;

    private RouteMatrixPropertiesHelper() { }

    /**
     * Type defining the methods to set the non-public properties of an {@link RouteMatrix} instance.
     */
    public interface RouteMatrixAccessor {
        void setFromPrivateRouteMatrix(RouteMatrix routeMatrix, RouteMatrixPrivate routeMatrixPrivate);
    }

    /**
     * The method called from {@link RouteMatrix} to set it's accessor.
     *
     * @param routeMatrixAccessor The accessor.
     */
    public static void setAccessor(final RouteMatrixAccessor routeMatrixAccessor) {
        accessor = routeMatrixAccessor;
    }

    /**
     * Sets properties of an {@link RouteMatrix} using a private model.
     *
     * @param routeMatrix
     * @param routeMatrixPrivate
     */
    public static void setFromAddressPrivate(RouteMatrix routeMatrix, RouteMatrixPrivate routeMatrixPrivate) {
        accessor.setFromPrivateRouteMatrix(routeMatrix, routeMatrixPrivate);
    }
}
