// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.implementation;

import com.azure.maps.route.fluent.models.RouteDirectionsResponseInner;
import com.azure.maps.route.models.RouteDirectionsResponse;
import com.azure.maps.route.models.RouteDirectionsResult;
import com.azure.maps.route.models.RouteOptimizedWaypoint;
import com.azure.maps.route.models.RouteResponseReport;
import java.util.Collections;
import java.util.List;

public final class RouteDirectionsResponseImpl implements RouteDirectionsResponse {
    private RouteDirectionsResponseInner innerObject;

    private final com.azure.maps.route.RouteManager serviceManager;

    RouteDirectionsResponseImpl(
        RouteDirectionsResponseInner innerObject, com.azure.maps.route.RouteManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String formatVersion() {
        return this.innerModel().formatVersion();
    }

    public List<RouteDirectionsResult> routes() {
        List<RouteDirectionsResult> inner = this.innerModel().routes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<RouteOptimizedWaypoint> optimizedWaypoints() {
        List<RouteOptimizedWaypoint> inner = this.innerModel().optimizedWaypoints();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public RouteResponseReport report() {
        return this.innerModel().report();
    }

    public RouteDirectionsResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.maps.route.RouteManager manager() {
        return this.serviceManager;
    }
}
