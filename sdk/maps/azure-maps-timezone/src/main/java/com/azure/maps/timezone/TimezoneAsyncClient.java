// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.timezone;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.maps.timezone.implementation.TimezonesImpl;
import com.azure.maps.timezone.implementation.helper.Utility;
import com.azure.maps.timezone.models.ErrorResponseException;
import com.azure.maps.timezone.models.IanaId;
import com.azure.maps.timezone.models.TimezoneCoordinateOptions;
import com.azure.maps.timezone.models.TimezoneIDOptions;
import com.azure.maps.timezone.implementation.models.JsonFormat;
import com.azure.maps.timezone.models.TimezoneIanaVersionResult;
import com.azure.maps.timezone.models.TimezoneResult;
import com.azure.maps.timezone.models.TimezoneWindows;
import java.util.List;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous TimezoneClient type. */
@ServiceClient(builder = TimezoneClientBuilder.class, isAsync = true)
public final class TimezoneAsyncClient {
    private final TimezonesImpl serviceClient;

    /**
     * Initializes an instance of TimezoneClient client.
     *
     * @param serviceClient the service client implementation.
     */
    TimezoneAsyncClient(TimezonesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * __Time Zone by Id__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns current, historical, and future time zone information for the specified IANA time zone ID.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param timezoneId The IANA time zone ID.
     * @param acceptLanguage Specifies the language code in which the timezone names should be returned. If no language
     *     code is provided, the response will be in "EN". Please refer to [Supported
     *     Languages](https://docs.microsoft.com/en-us/azure/azure-maps/supported-languages) for details.
     * @param options Alternatively, use alias "o". Options available for types of information returned in the result.
     * @param timeStamp Alternatively, use alias "stamp", or "s". Reference time, if omitted, the API will use the
     *     machine time serving the request.
     * @param daylightSavingsTimeFrom Alternatively, use alias "tf". The start date from which daylight savings time
     *     (DST) transitions are requested, only applies when "options" = all or "options" = transitions.
     * @param daylightSavingsTimeLastingYears Alternatively, use alias "ty". The number of years from "transitionsFrom"
     *     for which DST transitions are requested, only applies when "options" = all or "options" = transitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone By ID call or By Coordinates call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TimezoneResult> getTimezoneByID(TimezoneIDOptions options) {
            Mono<Response<TimezoneResult>> result = this.getTimezoneByIDWithResponse(options);
            return result.flatMap(response -> {
                return Mono.just(response.getValue());
            });
    }

    /**
     * __Time Zone by Id__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns current, historical, and future time zone information for the specified IANA time zone ID.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param timezoneId The IANA time zone ID.
     * @param acceptLanguage Specifies the language code in which the timezone names should be returned. If no language
     *     code is provided, the response will be in "EN". Please refer to [Supported
     *     Languages](https://docs.microsoft.com/en-us/azure/azure-maps/supported-languages) for details.
     * @param options Alternatively, use alias "o". Options available for types of information returned in the result.
     * @param timeStamp Alternatively, use alias "stamp", or "s". Reference time, if omitted, the API will use the
     *     machine time serving the request.
     * @param daylightSavingsTimeFrom Alternatively, use alias "tf". The start date from which daylight savings time
     *     (DST) transitions are requested, only applies when "options" = all or "options" = transitions.
     * @param daylightSavingsTimeLastingYears Alternatively, use alias "ty". The number of years from "transitionsFrom"
     *     for which DST transitions are requested, only applies when "options" = all or "options" = transitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone By ID call or By Coordinates call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TimezoneResult>> getTimezoneByIDWithResponse(TimezoneIDOptions options) {
            return this.getTimezoneByIDWithResponse(options, null);
    }

    /**
     * __Time Zone by Id__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns current, historical, and future time zone information for the specified IANA time zone ID.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param timezoneId The IANA time zone ID.
     * @param acceptLanguage Specifies the language code in which the timezone names should be returned. If no language
     *     code is provided, the response will be in "EN". Please refer to [Supported
     *     Languages](https://docs.microsoft.com/en-us/azure/azure-maps/supported-languages) for details.
     * @param options Alternatively, use alias "o". Options available for types of information returned in the result.
     * @param timeStamp Alternatively, use alias "stamp", or "s". Reference time, if omitted, the API will use the
     *     machine time serving the request.
     * @param daylightSavingsTimeFrom Alternatively, use alias "tf". The start date from which daylight savings time
     *     (DST) transitions are requested, only applies when "options" = all or "options" = transitions.
     * @param daylightSavingsTimeLastingYears Alternatively, use alias "ty". The number of years from "transitionsFrom"
     *     for which DST transitions are requested, only applies when "options" = all or "options" = transitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone By ID call or By Coordinates call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TimezoneResult>> getTimezoneByIDWithResponse(TimezoneIDOptions options, Context context) {
        return this.serviceClient.getTimezoneByIDWithResponseAsync(
                JsonFormat.JSON,
                options.getTimezoneId(),
                options.getAcceptLanguage(),
                options.getOptions(),
                options.getTimeStamp(),
                options.getDaylightSavingsTimeFrom(),
                options.getDaylightSavingsTimeLastingYears(), 
                context);
    }

    /**
     * __Time Zone by Coordinates__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns current, historical, and future time zone information for a specified latitude-longitude
     * pair. In addition, the API provides sunset and sunrise times for a given location.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param coordinates Coordinates of the point for which time zone information is requested. This parameter is a
     *     list of coordinates, containing a pair of coordinate(lat, long). When this endpoint is called directly,
     *     coordinates are passed in as a single string containing coordinates, separated by commas.
     * @param acceptLanguage Specifies the language code in which the timezone names should be returned. If no language
     *     code is provided, the response will be in "EN". Please refer to [Supported
     *     Languages](https://docs.microsoft.com/en-us/azure/azure-maps/supported-languages) for details.
     * @param options Alternatively, use alias "o". Options available for types of information returned in the result.
     * @param timeStamp Alternatively, use alias "stamp", or "s". Reference time, if omitted, the API will use the
     *     machine time serving the request.
     * @param daylightSavingsTimeFrom Alternatively, use alias "tf". The start date from which daylight savings time
     *     (DST) transitions are requested, only applies when "options" = all or "options" = transitions.
     * @param daylightSavingsTimeLastingYears Alternatively, use alias "ty". The number of years from "transitionsFrom"
     *     for which DST transitions are requested, only applies when "options" = all or "options" = transitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone By ID call or By Coordinates call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TimezoneResult> getTimezoneByCoordinates(TimezoneCoordinateOptions options) {
                Mono<Response<TimezoneResult>> result = this.getTimezoneByCoordinatesWithResponse(options);
                return result.flatMap(response -> {
                    return Mono.just(response.getValue());
                });
    }

    /**
     * __Time Zone by Coordinates__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns current, historical, and future time zone information for a specified latitude-longitude
     * pair. In addition, the API provides sunset and sunrise times for a given location.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param coordinates Coordinates of the point for which time zone information is requested. This parameter is a
     *     list of coordinates, containing a pair of coordinate(lat, long). When this endpoint is called directly,
     *     coordinates are passed in as a single string containing coordinates, separated by commas.
     * @param acceptLanguage Specifies the language code in which the timezone names should be returned. If no language
     *     code is provided, the response will be in "EN". Please refer to [Supported
     *     Languages](https://docs.microsoft.com/en-us/azure/azure-maps/supported-languages) for details.
     * @param options Alternatively, use alias "o". Options available for types of information returned in the result.
     * @param timeStamp Alternatively, use alias "stamp", or "s". Reference time, if omitted, the API will use the
     *     machine time serving the request.
     * @param daylightSavingsTimeFrom Alternatively, use alias "tf". The start date from which daylight savings time
     *     (DST) transitions are requested, only applies when "options" = all or "options" = transitions.
     * @param daylightSavingsTimeLastingYears Alternatively, use alias "ty". The number of years from "transitionsFrom"
     *     for which DST transitions are requested, only applies when "options" = all or "options" = transitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone By ID call or By Coordinates call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TimezoneResult>> getTimezoneByCoordinatesWithResponse(TimezoneCoordinateOptions options) {
        return this.getTimezoneByCoordinatesWithResponse(options, null);
    }

    /**
     * __Time Zone by Coordinates__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns current, historical, and future time zone information for a specified latitude-longitude
     * pair. In addition, the API provides sunset and sunrise times for a given location.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param coordinates Coordinates of the point for which time zone information is requested. This parameter is a
     *     list of coordinates, containing a pair of coordinate(lat, long). When this endpoint is called directly,
     *     coordinates are passed in as a single string containing coordinates, separated by commas.
     * @param acceptLanguage Specifies the language code in which the timezone names should be returned. If no language
     *     code is provided, the response will be in "EN". Please refer to [Supported
     *     Languages](https://docs.microsoft.com/en-us/azure/azure-maps/supported-languages) for details.
     * @param options Alternatively, use alias "o". Options available for types of information returned in the result.
     * @param timeStamp Alternatively, use alias "stamp", or "s". Reference time, if omitted, the API will use the
     *     machine time serving the request.
     * @param daylightSavingsTimeFrom Alternatively, use alias "tf". The start date from which daylight savings time
     *     (DST) transitions are requested, only applies when "options" = all or "options" = transitions.
     * @param daylightSavingsTimeLastingYears Alternatively, use alias "ty". The number of years from "transitionsFrom"
     *     for which DST transitions are requested, only applies when "options" = all or "options" = transitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone By ID call or By Coordinates call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TimezoneResult>> getTimezoneByCoordinatesWithResponse(TimezoneCoordinateOptions options, Context context) {
        return this.serviceClient.getTimezoneByCoordinatesWithResponseAsync(
                JsonFormat.JSON,
                Utility.toCoordinateList(options.getCoordinates()),
                options.getAcceptLanguage(),
                options.getOptions(),
                options.getTimeStamp(),
                options.getDaylightSavingsTimeFrom(),
                options.getDaylightSavingsTimeLastingYears(), 
                context);
    }

    /**
     * __Windows Time Zones__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns a full list of Windows Time Zone IDs.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone Enum Windows call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<TimezoneWindows>> getWindowsTimezoneIds() {
        Mono<Response<List<TimezoneWindows>>> result = this.getWindowsTimezoneIdsWithResponse();
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
    }

    /**
     * __Windows Time Zones__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns a full list of Windows Time Zone IDs.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone Enum Windows call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<TimezoneWindows>>> getWindowsTimezoneIdsWithResponse() {
        return this.getWindowsTimezoneIdsWithResponse(null);
    }

    /**
     * __Windows Time Zones__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns a full list of Windows Time Zone IDs.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone Enum Windows call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<TimezoneWindows>>> getWindowsTimezoneIdsWithResponse(Context context) {
        return this.serviceClient.getWindowsTimezoneIdsWithResponseAsync(JsonFormat.JSON, context);
    }

    /**
     * __IANA Time Zones__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns a full list of IANA time zone IDs. Updates to the IANA service will be reflected in the
     * system within one day.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone Enum IANA call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<IanaId>> getIanaTimezoneIds() {
        Mono<Response<List<IanaId>>> result = this.getIanaTimezoneIdsWithResponse();
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
    }

    /**
     * __IANA Time Zones__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns a full list of IANA time zone IDs. Updates to the IANA service will be reflected in the
     * system within one day.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone Enum IANA call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<IanaId>>> getIanaTimezoneIdsWithResponse() {
        return this.getIanaTimezoneIdsWithResponse(null);
    }

    /**
     * __IANA Time Zones__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns a full list of IANA time zone IDs. Updates to the IANA service will be reflected in the
     * system within one day.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone Enum IANA call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<IanaId>>> getIanaTimezoneIdsWithResponse(Context context) {
        return this.serviceClient.getIanaTimezoneIdsWithResponseAsync(JsonFormat.JSON, context);
    }

    /**
     * __Time Zone IANA Version__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns the current IANA version number as Metadata.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone IANA Version call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TimezoneIanaVersionResult> getIanaVersion() {
        Mono<Response<TimezoneIanaVersionResult>> result = this.getIanaVersionWithResponse();
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
    }

    /**
     * __Time Zone IANA Version__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns the current IANA version number as Metadata.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone IANA Version call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TimezoneIanaVersionResult>> getIanaVersionWithResponse() {
        return this.getIanaVersionWithResponse(null);
    }

    /**
     * __Time Zone IANA Version__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns the current IANA version number as Metadata.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone IANA Version call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<TimezoneIanaVersionResult>> getIanaVersionWithResponse(Context context) {
        return this.serviceClient.getIanaVersionWithResponseAsync(JsonFormat.JSON, context);
    }

    /**
     * __Windows to IANA Time Zone__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns a corresponding IANA ID, given a valid Windows Time Zone ID. Multiple IANA IDs may be
     * returned for a single Windows ID. It is possible to narrow these results by adding an optional territory
     * parameter.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param windowsTimezoneId The Windows time zone ID.
     * @param windowsTerritoryCode Windows Time Zone territory code.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone Windows To IANA call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<IanaId>> convertWindowsTimezoneToIana(String windowsTimezoneId, String windowsTerritoryCode) {
        Mono<Response<List<IanaId>>> result = this.convertWindowsTimezoneToIanaWithResponse(windowsTimezoneId, windowsTerritoryCode);
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
    }

    /**
     * __Windows to IANA Time Zone__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns a corresponding IANA ID, given a valid Windows Time Zone ID. Multiple IANA IDs may be
     * returned for a single Windows ID. It is possible to narrow these results by adding an optional territory
     * parameter.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param windowsTimezoneId The Windows time zone ID.
     * @param windowsTerritoryCode Windows Time Zone territory code.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone Windows To IANA call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<IanaId>>> convertWindowsTimezoneToIanaWithResponse(String windowsTimezoneId, String windowsTerritoryCode) {
        return this.convertWindowsTimezoneToIanaWithResponse(windowsTimezoneId, windowsTerritoryCode, null);
    }

    /**
     * __Windows to IANA Time Zone__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns a corresponding IANA ID, given a valid Windows Time Zone ID. Multiple IANA IDs may be
     * returned for a single Windows ID. It is possible to narrow these results by adding an optional territory
     * parameter.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param windowsTimezoneId The Windows time zone ID.
     * @param windowsTerritoryCode Windows Time Zone territory code.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Timezone Windows To IANA call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<IanaId>>> convertWindowsTimezoneToIanaWithResponse(String windowsTimezoneId, String windowsTerritoryCode, Context context) {
        return this.serviceClient.convertWindowsTimezoneToIanaWithResponseAsync(
            JsonFormat.JSON, windowsTimezoneId, windowsTerritoryCode, context);
    }
}
