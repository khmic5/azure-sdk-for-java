// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.geolocation.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.maps.geolocation.fluent.models.IpAddressToLocationResultInner;
import com.azure.maps.geolocation.models.ResponseFormat;

/** An instance of this class provides access to all the operations defined in GeolocationsClient. */
public interface GeolocationsClient {
    /**
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This service will return the ISO country code for the provided IP address. Developers can use this information
     * to block or alter certain content based on geographical locations where the application is being viewed from.
     *
     * <p>__Note:__ This service returns results from IANA and does not necessarily reflect the views of Microsoft
     * Corporation.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param ip The IP address. Both IPv4 and IPv6 are allowed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful call to IP Address to country/region API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IpAddressToLocationResultInner getIpToLocationPreview(ResponseFormat format, String ip);

    /**
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This service will return the ISO country code for the provided IP address. Developers can use this information
     * to block or alter certain content based on geographical locations where the application is being viewed from.
     *
     * <p>__Note:__ This service returns results from IANA and does not necessarily reflect the views of Microsoft
     * Corporation.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param ip The IP address. Both IPv4 and IPv6 are allowed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful call to IP Address to country/region API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IpAddressToLocationResultInner> getIpToLocationPreviewWithResponse(
        ResponseFormat format, String ip, Context context);
}
