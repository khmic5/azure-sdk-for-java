// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.

package com.azure.maps.route.models;

import java.util.List;
import java.util.stream.Collectors;

import com.azure.core.annotation.Immutable;
import com.azure.maps.route.implementation.helpers.RouteMatrixResultPropertiesHelper;
import com.azure.maps.route.implementation.helpers.Utility;
import com.azure.maps.route.implementation.models.RouteMatrixResultPrivate;

/**
 * This object is returned from a successful Route Matrix call. For ex, if 2 origins and 3 destinations are provided,
 * there are going to 2 arrays with 3 elements in each. Each element's content depends on the options provided in the
 * query.
 */
@Immutable
public final class RouteMatrixResult {
    /*
     * Format Version property
     */
    private String formatVersion;

    /*
     * Results as a 2 dimensional array of route summaries.
     */
    private List<List<RouteMatrix>> matrix;

    /*
     * Summary object
     */
    private RouteMatrixSummary summary;

    /**
     * Get the formatVersion property: Format Version property.
     *
     * @return the formatVersion value.
     */
    public String getFormatVersion() {
        return this.formatVersion;
    }

    static {
        RouteMatrixResultPropertiesHelper.setAccessor(new RouteMatrixResultPropertiesHelper
            .RouteMatrixResultAccessor() {
                @Override
                public void setFromPrivateRouteMatrixResult(RouteMatrixResult routeMatrixResult,
                        RouteMatrixResultPrivate routeMatrixResultPrivate) {
                    routeMatrixResult.setFromPrivateRouteMatrixResult(routeMatrixResultPrivate);
                }
        });
    }

    /**
     * Get the matrix property: Results as a 2 dimensional array of route summaries.
     *
     * @return the matrix value.
     */
    public List<List<RouteMatrix>> getMatrix() {
        return this.matrix;
    }

    /**
     * Get the summary property: Summary object.
     *
     * @return the summary value.
     */
    public RouteMatrixSummary getSummary() {
        return this.summary;
    }

    // private setter
    private void setFromPrivateRouteMatrixResult(RouteMatrixResultPrivate routeMatrixResultPrivate) {
        this.summary = routeMatrixResultPrivate.getSummary();
        List<List<RouteMatrix>> routeMatrix = routeMatrixResultPrivate.getMatrix()
            .stream()
            .map(listItem -> {
                return listItem.stream()
                    .map(item -> Utility.toRouteMatrix(item))
                    .collect(Collectors.toList());
            })
            .collect(Collectors.toList());
        this.matrix = routeMatrix;
    }
}
