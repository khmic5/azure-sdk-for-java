// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.maps.route.fluent.models.RouteDirectionsBatchResponseInner;
import java.util.List;

/** An immutable client-side representation of RouteDirectionsBatchResponse. */
public interface RouteDirectionsBatchResponse {
    /**
     * Gets the summary property: Summary for the batch request.
     *
     * @return the summary value.
     */
    BatchResponseSummary summary();

    /**
     * Gets the batchItems property: Array containing the batch results.
     *
     * @return the batchItems value.
     */
    List<RouteDirectionsBatchItem> batchItems();

    /**
     * Gets the inner com.azure.maps.route.fluent.models.RouteDirectionsBatchResponseInner object.
     *
     * @return the inner object.
     */
    RouteDirectionsBatchResponseInner innerModel();
}
