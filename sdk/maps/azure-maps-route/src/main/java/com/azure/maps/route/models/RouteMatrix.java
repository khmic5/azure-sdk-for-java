// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.

package com.azure.maps.route.models;

import com.azure.core.annotation.Immutable;
import com.azure.maps.route.implementation.helpers.RouteMatrixPropertiesHelper;
import com.azure.maps.route.implementation.models.RouteMatrixPrivate;

/** Matrix result object. */
@Immutable
public final class RouteMatrix {
    /*
     * StatusCode property for the current cell in the input matrix.
     */
    private Integer statusCode;

    /*
     * Summary object for route section.
     */
    private RouteLegSummary summary;

    static {
        RouteMatrixPropertiesHelper.setAccessor(new RouteMatrixPropertiesHelper
            .RouteMatrixAccessor() {
                @Override
                public void setFromPrivateRouteMatrix(RouteMatrix routeMatrix, RouteMatrixPrivate routeMatrixPrivate) {
                    routeMatrix.setFromPrivateRouteMatrix(routeMatrixPrivate);
                }
        });
    }

    /**
     * Get the statusCode property: StatusCode property for the current cell in the input matrix.
     *
     * @return the statusCode value.
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * Get the summary property: Summary object for route section.
     *
     * @return the summary value.
     */
    public RouteLegSummary getSummary() {
        return this.summary;
    }

    // private setter
    private void setFromPrivateRouteMatrix(RouteMatrixPrivate routeMatrixPrivate) {
        this.statusCode = routeMatrixPrivate.getStatusCode();
        this.summary = routeMatrixPrivate.getResponse().getSummary();
    }
}
