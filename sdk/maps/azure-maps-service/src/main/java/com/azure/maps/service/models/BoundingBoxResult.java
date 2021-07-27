// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response from a successful Get Data for Bounding Box API. */
@Immutable
public final class BoundingBoxResult {
    /*
     * The response from the Get Data for Bounding Box API. The results are
     * ordered starting with the southwest corner, and then proceed west to
     * east and south to north.
     */
    @JsonProperty(value = "data", access = JsonProperty.Access.WRITE_ONLY)
    private List<PointElevationResult> data;

    /**
     * Get the data property: The response from the Get Data for Bounding Box API. The results are ordered starting with
     * the southwest corner, and then proceed west to east and south to north.
     *
     * @return the data value.
     */
    public List<PointElevationResult> getData() {
        return this.data;
    }
}
