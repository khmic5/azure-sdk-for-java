package com.azure.maps.route.implementation.helpers;

import com.azure.maps.route.implementation.models.RouteMatrixResultPrivate;
import com.azure.maps.route.models.RouteMatrixResult;

/**
 * The helper class to set the non-public properties of an {@link RouteMatrixResult} instance.
 */
public final class RouteMatrixResultPropertiesHelper {
    private static RouteMatrixResultAccessor accessor;

    private RouteMatrixResultPropertiesHelper() { }

    /**
     * Type defining the methods to set the non-public properties of an {@link Address} instance.
     */
    public interface RouteMatrixResultAccessor {
        void setFromPrivateRouteMatrixResult(RouteMatrixResult routeMatrixResult,
            RouteMatrixResultPrivate routeMatrixResultPrivate);
    }

    /**
     * The method called from {@link RouteMatrixResultResult} to set it's accessor.
     *
     * @param RouteMatrixResultAccessor The accessor.
     */
    public static void setAccessor(final RouteMatrixResultAccessor routeMatrixResultAccessor) {
        accessor = routeMatrixResultAccessor;
    }

    /**
     * Sets properties of an {@link RouteMatrixResultResult} using a private model.
     *
     * @param RouteMatrixResult
     * @param RouteMatrixResultPrivate
     */
    public static void setFromAddressPrivate(RouteMatrixResult routeMatrixResult,
            RouteMatrixResultPrivate routeMatrixResultPrivate) {
        accessor.setFromPrivateRouteMatrixResult(routeMatrixResult, routeMatrixResultPrivate);
    }
}
