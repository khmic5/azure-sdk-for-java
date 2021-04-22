// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.deploymentmanager.fluent.models.ServiceUnitResourceInner;

/** Contains all response data for the createOrUpdate operation. */
public final class ServiceUnitsCreateOrUpdateResponse
    extends ResponseBase<ServiceUnitsCreateOrUpdateHeaders, ServiceUnitResourceInner> {
    /**
     * Creates an instance of ServiceUnitsCreateOrUpdateResponse.
     *
     * @param request the request which resulted in this ServiceUnitsCreateOrUpdateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ServiceUnitsCreateOrUpdateResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        ServiceUnitResourceInner value,
        ServiceUnitsCreateOrUpdateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public ServiceUnitResourceInner getValue() {
        return super.getValue();
    }
}