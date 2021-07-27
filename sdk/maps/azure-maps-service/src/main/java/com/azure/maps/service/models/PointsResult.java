// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response from a successful Elevation Points request. */
@Immutable
public final class PointsResult {
    /*
     * The response for point/points elevation API. The result will be in same
     * sequence of points listed in request.
     */
    @JsonProperty(value = "data", access = JsonProperty.Access.WRITE_ONLY)
    private List<PointElevationResult> data;

    /**
     * Get the data property: The response for point/points elevation API. The result will be in same sequence of points
     * listed in request.
     *
     * @return the data value.
     */
    public List<PointElevationResult> getData() {
        return this.data;
    }
}
