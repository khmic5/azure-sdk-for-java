// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.geolocation;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.maps.geolocation.implementation.GeolocationClientImpl;
import com.azure.maps.geolocation.models.ErrorResponseException;
import com.azure.maps.geolocation.models.IpAddressToLocationResult;
import com.azure.maps.geolocation.models.JsonFormat;

/** Initializes a new instance of the synchronous GeolocationClient type. */
@ServiceClient(builder = GeolocationClientBuilder.class)
public final class GeolocationClient {
    private final GeolocationClientImpl serviceClient;

    /**
     * Initializes an instance of GeolocationClient client.
     *
     * @param serviceClient the service client implementation.
     */
    GeolocationClient(GeolocationClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This service will return the ISO country code for the provided IP address. Developers can use this information
     * to block or alter certain content based on geographical locations where the application is being viewed from.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param ipAddress The IP address. Both IPv4 and IPv6 are allowed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful call to IP Address to country/region API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IpAddressToLocationResult getLocation(JsonFormat format, String ipAddress) {
        return this.serviceClient.getLocation(format, ipAddress);
    }
}
