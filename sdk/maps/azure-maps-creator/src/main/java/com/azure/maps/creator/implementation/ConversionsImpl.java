// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.implementation;

import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.maps.creator.models.ConversionListDetailInfo;
import com.azure.maps.creator.models.ConversionListResponse;
import com.azure.maps.creator.models.ConversionsConvertResponse;
import com.azure.maps.creator.models.ConversionsGetOperationResponse;
import com.azure.maps.creator.models.ErrorResponseException;
import com.azure.maps.creator.models.Geography;
import com.azure.maps.creator.models.LongRunningOperationResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Conversions. */
public final class ConversionsImpl {
    /** The proxy service used to perform REST calls. */
    private final ConversionsService service;

    /** The service client containing this operation class. */
    private final CreatorClientImpl client;

    /**
     * Initializes an instance of ConversionsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ConversionsImpl(CreatorClientImpl client) {
        this.service =
                RestProxy.create(ConversionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for CreatorClientConversions to be used by the proxy service to perform
     * REST calls.
     */
    @Host("https://{geography}.atlas.microsoft.com")
    @ServiceInterface(name = "CreatorClientConvers")
    private interface ConversionsService {
        @Post("/conversions")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<ConversionsConvertResponse> convert(
                @HostParam("geography") Geography geography,
                @HeaderParam("x-ms-client-id") String xMsClientId,
                @QueryParam("api-version") String apiVersion,
                @QueryParam("udid") String udid,
                @QueryParam("outputOntology") String outputOntology,
                @QueryParam("description") String description,
                @HeaderParam("Accept") String accept);

        @Get("/conversions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<ConversionListResponse>> list(
                @HostParam("geography") Geography geography,
                @HeaderParam("x-ms-client-id") String xMsClientId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept);

        @Get("/conversions/{conversionId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<ConversionListDetailInfo>> get(
                @HostParam("geography") Geography geography,
                @HeaderParam("x-ms-client-id") String xMsClientId,
                @QueryParam("api-version") String apiVersion,
                @PathParam("conversionId") String conversionId,
                @HeaderParam("Accept") String accept);

        @Delete("/conversions/{conversionId}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Void>> delete(
                @HostParam("geography") Geography geography,
                @HeaderParam("x-ms-client-id") String xMsClientId,
                @QueryParam("api-version") String apiVersion,
                @PathParam("conversionId") String conversionId,
                @HeaderParam("Accept") String accept);

        @Get("/conversions/operations/{operationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<ConversionsGetOperationResponse> getOperation(
                @HostParam("geography") Geography geography,
                @QueryParam("api-version") String apiVersion,
                @PathParam("operationId") String operationId,
                @HeaderParam("Accept") String accept);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<ConversionListResponse>> listNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("geography") Geography geography,
                @HeaderParam("x-ms-client-id") String xMsClientId,
                @HeaderParam("Accept") String accept);
    }

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>The Conversion API lets the caller import a set of DWG design files as a zipped [Drawing
     * Package](https://aka.ms/am-drawing-package) into Azure Maps. The [Drawing
     * Package](https://aka.ms/am-drawing-package) should first be uploaded using the [Azure Maps Data
     * Service](https://docs.microsoft.com/rest/api/maps/data). Once uploaded, use the `udid` returned by the [Data
     * Upload API](https://docs.microsoft.com/rest/api/maps/data-v2/upload-preview) to call this Conversion API.
     *
     * <p>## Convert DWG package
     *
     * <p>The Conversion API performs a [long-running request](https://aka.ms/am-creator-lrt-v2).
     *
     * <p>## Debug DWG package issues
     *
     * <p>During the Conversion process, if there are any issues with the DWG package [errors and
     * warnings](https://aka.ms/am-conversion-errors) are provided in the response along with a *diagnostic package* to
     * visualize and diagnose these issues. In case any issues are encountered with your DWG package, the Conversion
     * operation status process as detailed [here](https://aka.ms/am-creator-lrt-v2) returns the location of the
     * *diagnostic package* that can be downloaded by the caller to help them visualize and diagnose these issues. The
     * *diagnostic package* location can be found in the properties section of the conversion operation status response
     * and looks like the following:
     *
     * <p>```json { "properties": { "diagnosticPackageLocation":
     * "https://us.atlas.microsoft.com/mapdata/{DiagnosticPackageId}?api-version=1.0" } } ```
     *
     * <p>The *diagnostic package* can be downloaded by executing a `HTTP GET` request on the
     * `diagnosticPackageLocation`. For more details on how to use the tool to visualize and diagnose all the errors and
     * warnings see [Drawing Error Visualizer](https://aka.ms/am-drawing-errors-visualizer). &lt;br&gt;
     *
     * <p>A conversion operation will be marked as *success* if there are zero or more warnings but will be marked as
     * *failed* if any errors are encountered.
     *
     * @param udid The unique data id for the content. The `udid` must have been obtained from a successful [Data Upload
     *     API](https://docs.microsoft.com/en-us/rest/api/maps/data-v2/upload-preview) call.
     * @param outputOntology Output ontology version. "facility-2.0" is the only supported value at this time. Please
     *     refer to this [article](https://docs.microsoft.com/en-us/azure/azure-maps/creator-facility-ontology) for more
     *     information about Azure Maps Creator ontologies.
     * @param description User provided description of the content being converted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for a Long-Running Operations API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ConversionsConvertResponse> convertWithResponseAsync(
            String udid, String outputOntology, String description) {
        final String apiVersion = "2.0";
        final String accept = "application/json";
        return service.convert(
                this.client.getGeography(),
                this.client.getXMsClientId(),
                apiVersion,
                udid,
                outputOntology,
                description,
                accept);
    }

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>The Conversion API lets the caller import a set of DWG design files as a zipped [Drawing
     * Package](https://aka.ms/am-drawing-package) into Azure Maps. The [Drawing
     * Package](https://aka.ms/am-drawing-package) should first be uploaded using the [Azure Maps Data
     * Service](https://docs.microsoft.com/rest/api/maps/data). Once uploaded, use the `udid` returned by the [Data
     * Upload API](https://docs.microsoft.com/rest/api/maps/data-v2/upload-preview) to call this Conversion API.
     *
     * <p>## Convert DWG package
     *
     * <p>The Conversion API performs a [long-running request](https://aka.ms/am-creator-lrt-v2).
     *
     * <p>## Debug DWG package issues
     *
     * <p>During the Conversion process, if there are any issues with the DWG package [errors and
     * warnings](https://aka.ms/am-conversion-errors) are provided in the response along with a *diagnostic package* to
     * visualize and diagnose these issues. In case any issues are encountered with your DWG package, the Conversion
     * operation status process as detailed [here](https://aka.ms/am-creator-lrt-v2) returns the location of the
     * *diagnostic package* that can be downloaded by the caller to help them visualize and diagnose these issues. The
     * *diagnostic package* location can be found in the properties section of the conversion operation status response
     * and looks like the following:
     *
     * <p>```json { "properties": { "diagnosticPackageLocation":
     * "https://us.atlas.microsoft.com/mapdata/{DiagnosticPackageId}?api-version=1.0" } } ```
     *
     * <p>The *diagnostic package* can be downloaded by executing a `HTTP GET` request on the
     * `diagnosticPackageLocation`. For more details on how to use the tool to visualize and diagnose all the errors and
     * warnings see [Drawing Error Visualizer](https://aka.ms/am-drawing-errors-visualizer). &lt;br&gt;
     *
     * <p>A conversion operation will be marked as *success* if there are zero or more warnings but will be marked as
     * *failed* if any errors are encountered.
     *
     * @param udid The unique data id for the content. The `udid` must have been obtained from a successful [Data Upload
     *     API](https://docs.microsoft.com/en-us/rest/api/maps/data-v2/upload-preview) call.
     * @param outputOntology Output ontology version. "facility-2.0" is the only supported value at this time. Please
     *     refer to this [article](https://docs.microsoft.com/en-us/azure/azure-maps/creator-facility-ontology) for more
     *     information about Azure Maps Creator ontologies.
     * @param description User provided description of the content being converted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for a Long-Running Operations API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LongRunningOperationResult> convertAsync(String udid, String outputOntology, String description) {
        return convertWithResponseAsync(udid, outputOntology, description)
                .flatMap(
                        (ConversionsConvertResponse res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>The Conversion API lets the caller import a set of DWG design files as a zipped [Drawing
     * Package](https://aka.ms/am-drawing-package) into Azure Maps. The [Drawing
     * Package](https://aka.ms/am-drawing-package) should first be uploaded using the [Azure Maps Data
     * Service](https://docs.microsoft.com/rest/api/maps/data). Once uploaded, use the `udid` returned by the [Data
     * Upload API](https://docs.microsoft.com/rest/api/maps/data-v2/upload-preview) to call this Conversion API.
     *
     * <p>## Convert DWG package
     *
     * <p>The Conversion API performs a [long-running request](https://aka.ms/am-creator-lrt-v2).
     *
     * <p>## Debug DWG package issues
     *
     * <p>During the Conversion process, if there are any issues with the DWG package [errors and
     * warnings](https://aka.ms/am-conversion-errors) are provided in the response along with a *diagnostic package* to
     * visualize and diagnose these issues. In case any issues are encountered with your DWG package, the Conversion
     * operation status process as detailed [here](https://aka.ms/am-creator-lrt-v2) returns the location of the
     * *diagnostic package* that can be downloaded by the caller to help them visualize and diagnose these issues. The
     * *diagnostic package* location can be found in the properties section of the conversion operation status response
     * and looks like the following:
     *
     * <p>```json { "properties": { "diagnosticPackageLocation":
     * "https://us.atlas.microsoft.com/mapdata/{DiagnosticPackageId}?api-version=1.0" } } ```
     *
     * <p>The *diagnostic package* can be downloaded by executing a `HTTP GET` request on the
     * `diagnosticPackageLocation`. For more details on how to use the tool to visualize and diagnose all the errors and
     * warnings see [Drawing Error Visualizer](https://aka.ms/am-drawing-errors-visualizer). &lt;br&gt;
     *
     * <p>A conversion operation will be marked as *success* if there are zero or more warnings but will be marked as
     * *failed* if any errors are encountered.
     *
     * @param udid The unique data id for the content. The `udid` must have been obtained from a successful [Data Upload
     *     API](https://docs.microsoft.com/en-us/rest/api/maps/data-v2/upload-preview) call.
     * @param outputOntology Output ontology version. "facility-2.0" is the only supported value at this time. Please
     *     refer to this [article](https://docs.microsoft.com/en-us/azure/azure-maps/creator-facility-ontology) for more
     *     information about Azure Maps Creator ontologies.
     * @param description User provided description of the content being converted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for a Long-Running Operations API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LongRunningOperationResult convert(String udid, String outputOntology, String description) {
        return convertAsync(udid, outputOntology, description).block();
    }

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This API allows the caller to fetch a list of all successful data conversions submitted previously using the
     * [Conversion API](https://docs.microsoft.com/en-us/rest/api/maps/v2/conversion/convert).
     *
     * <p>### Submit List Request
     *
     * <p>To list all successful conversions you will issue a `GET` request with no additional parameters.
     *
     * <p>### List Data Response
     *
     * <p>The Conversion List API returns the complete list of all conversion details in `json` format.&lt;br&gt;
     *
     * <p>Here is a sample response returning the details of two successful conversion requests:
     *
     * <p>&lt;br&gt;
     *
     * <p>```json { "conversions": [ { "conversionId": "54398242-ea6c-1f31-4fa6-79b1ae0fc24d", "udid":
     * "31838736-8b84-11ea-bc55-0242ac130003", "created": "5/19/2020 9:00:00 AM +00:00", "description": "User provided
     * description.", "featureCounts": { "DIR": 1, "LVL": 3, "FCL": 1, "UNIT": 150, "CTG": 8, "AEL": 0, "OPN": 10 } }, {
     * "conversionId": "2acf7d32-8b84-11ea-bc55-0242ac130003", "udid": "1214bc58-8b84-11ea-bc55-0242ac1300039",
     * "created": "5/19/2020 9:00:00 AM +00:00", "description": "User provided description.", "featureCounts": { "DIR":
     * 1, "LVL": 3, "FCL": 1, "UNIT": 150, "CTG": 8, "AEL": 0, "OPN": 10 } } ] } ```
     *
     * <p>&lt;br&gt;.
     *
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the Conversion List API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ConversionListDetailInfo>> listSinglePageAsync() {
        final String apiVersion = "2.0";
        final String accept = "application/json";
        return service.list(this.client.getGeography(), this.client.getXMsClientId(), apiVersion, accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getConversions(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This API allows the caller to fetch a list of all successful data conversions submitted previously using the
     * [Conversion API](https://docs.microsoft.com/en-us/rest/api/maps/v2/conversion/convert).
     *
     * <p>### Submit List Request
     *
     * <p>To list all successful conversions you will issue a `GET` request with no additional parameters.
     *
     * <p>### List Data Response
     *
     * <p>The Conversion List API returns the complete list of all conversion details in `json` format.&lt;br&gt;
     *
     * <p>Here is a sample response returning the details of two successful conversion requests:
     *
     * <p>&lt;br&gt;
     *
     * <p>```json { "conversions": [ { "conversionId": "54398242-ea6c-1f31-4fa6-79b1ae0fc24d", "udid":
     * "31838736-8b84-11ea-bc55-0242ac130003", "created": "5/19/2020 9:00:00 AM +00:00", "description": "User provided
     * description.", "featureCounts": { "DIR": 1, "LVL": 3, "FCL": 1, "UNIT": 150, "CTG": 8, "AEL": 0, "OPN": 10 } }, {
     * "conversionId": "2acf7d32-8b84-11ea-bc55-0242ac130003", "udid": "1214bc58-8b84-11ea-bc55-0242ac1300039",
     * "created": "5/19/2020 9:00:00 AM +00:00", "description": "User provided description.", "featureCounts": { "DIR":
     * 1, "LVL": 3, "FCL": 1, "UNIT": 150, "CTG": 8, "AEL": 0, "OPN": 10 } } ] } ```
     *
     * <p>&lt;br&gt;.
     *
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the Conversion List API.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ConversionListDetailInfo> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync(), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This API allows the caller to fetch a list of all successful data conversions submitted previously using the
     * [Conversion API](https://docs.microsoft.com/en-us/rest/api/maps/v2/conversion/convert).
     *
     * <p>### Submit List Request
     *
     * <p>To list all successful conversions you will issue a `GET` request with no additional parameters.
     *
     * <p>### List Data Response
     *
     * <p>The Conversion List API returns the complete list of all conversion details in `json` format.&lt;br&gt;
     *
     * <p>Here is a sample response returning the details of two successful conversion requests:
     *
     * <p>&lt;br&gt;
     *
     * <p>```json { "conversions": [ { "conversionId": "54398242-ea6c-1f31-4fa6-79b1ae0fc24d", "udid":
     * "31838736-8b84-11ea-bc55-0242ac130003", "created": "5/19/2020 9:00:00 AM +00:00", "description": "User provided
     * description.", "featureCounts": { "DIR": 1, "LVL": 3, "FCL": 1, "UNIT": 150, "CTG": 8, "AEL": 0, "OPN": 10 } }, {
     * "conversionId": "2acf7d32-8b84-11ea-bc55-0242ac130003", "udid": "1214bc58-8b84-11ea-bc55-0242ac1300039",
     * "created": "5/19/2020 9:00:00 AM +00:00", "description": "User provided description.", "featureCounts": { "DIR":
     * 1, "LVL": 3, "FCL": 1, "UNIT": 150, "CTG": 8, "AEL": 0, "OPN": 10 } } ] } ```
     *
     * <p>&lt;br&gt;.
     *
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the Conversion List API.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ConversionListDetailInfo> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This API allows the caller to fetch a successful data conversion submitted previously using the [Conversion
     * API](https://docs.microsoft.com/en-us/rest/api/maps/v2/conversion/convert).
     *
     * @param conversionId The conversion id for the content. The `conversionId` must have been obtained from a
     *     successful [Conversion API](https://docs.microsoft.com/en-us/rest/api/maps/v2/conversion/convert) call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detail information for the conversion requests.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ConversionListDetailInfo>> getWithResponseAsync(String conversionId) {
        final String apiVersion = "2.0";
        final String accept = "application/json";
        return service.get(this.client.getGeography(), this.client.getXMsClientId(), apiVersion, conversionId, accept);
    }

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This API allows the caller to fetch a successful data conversion submitted previously using the [Conversion
     * API](https://docs.microsoft.com/en-us/rest/api/maps/v2/conversion/convert).
     *
     * @param conversionId The conversion id for the content. The `conversionId` must have been obtained from a
     *     successful [Conversion API](https://docs.microsoft.com/en-us/rest/api/maps/v2/conversion/convert) call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detail information for the conversion requests.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ConversionListDetailInfo> getAsync(String conversionId) {
        return getWithResponseAsync(conversionId)
                .flatMap(
                        (Response<ConversionListDetailInfo> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This API allows the caller to fetch a successful data conversion submitted previously using the [Conversion
     * API](https://docs.microsoft.com/en-us/rest/api/maps/v2/conversion/convert).
     *
     * @param conversionId The conversion id for the content. The `conversionId` must have been obtained from a
     *     successful [Conversion API](https://docs.microsoft.com/en-us/rest/api/maps/v2/conversion/convert) call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detail information for the conversion requests.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConversionListDetailInfo get(String conversionId) {
        return getAsync(conversionId).block();
    }

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This API allows the caller to delete any data conversions created previously using the [Conversion
     * API](https://docs.microsoft.com/en-us/rest/api/maps/v2/conversion/convert).
     *
     * <p>### Submit Delete Request
     *
     * <p>To delete your conversion data you will issue a `DELETE` request where the path will contain the
     * `conversionId` of the data to delete.
     *
     * <p>### Conversion Delete Response
     *
     * <p>The Conversion Delete API returns a HTTP `204 No Content` response with an empty body, if the converted data
     * resources were deleted successfully.&lt;br&gt; A HTTP `400 Bad Request` error response will be returned if no
     * resource associated with the passed-in `conversionId` is found.
     *
     * @param conversionId The conversion id for the content. The `conversionId` must have been obtained from a
     *     successful [Conversion API](https://docs.microsoft.com/en-us/rest/api/maps/v2/conversion/convert) call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String conversionId) {
        final String apiVersion = "2.0";
        final String accept = "application/json";
        return service.delete(
                this.client.getGeography(), this.client.getXMsClientId(), apiVersion, conversionId, accept);
    }

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This API allows the caller to delete any data conversions created previously using the [Conversion
     * API](https://docs.microsoft.com/en-us/rest/api/maps/v2/conversion/convert).
     *
     * <p>### Submit Delete Request
     *
     * <p>To delete your conversion data you will issue a `DELETE` request where the path will contain the
     * `conversionId` of the data to delete.
     *
     * <p>### Conversion Delete Response
     *
     * <p>The Conversion Delete API returns a HTTP `204 No Content` response with an empty body, if the converted data
     * resources were deleted successfully.&lt;br&gt; A HTTP `400 Bad Request` error response will be returned if no
     * resource associated with the passed-in `conversionId` is found.
     *
     * @param conversionId The conversion id for the content. The `conversionId` must have been obtained from a
     *     successful [Conversion API](https://docs.microsoft.com/en-us/rest/api/maps/v2/conversion/convert) call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String conversionId) {
        return deleteWithResponseAsync(conversionId).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This API allows the caller to delete any data conversions created previously using the [Conversion
     * API](https://docs.microsoft.com/en-us/rest/api/maps/v2/conversion/convert).
     *
     * <p>### Submit Delete Request
     *
     * <p>To delete your conversion data you will issue a `DELETE` request where the path will contain the
     * `conversionId` of the data to delete.
     *
     * <p>### Conversion Delete Response
     *
     * <p>The Conversion Delete API returns a HTTP `204 No Content` response with an empty body, if the converted data
     * resources were deleted successfully.&lt;br&gt; A HTTP `400 Bad Request` error response will be returned if no
     * resource associated with the passed-in `conversionId` is found.
     *
     * @param conversionId The conversion id for the content. The `conversionId` must have been obtained from a
     *     successful [Conversion API](https://docs.microsoft.com/en-us/rest/api/maps/v2/conversion/convert) call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String conversionId) {
        deleteAsync(conversionId).block();
    }

    /**
     * This path will be obtained from a call to POST /conversions. While in progress, an http200 will be returned with
     * no extra headers - followed by an http200 with Resource-Location header once successfully completed.
     *
     * @param operationId The ID to query the status for the Conversion create/import request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for a Long-Running Operations API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ConversionsGetOperationResponse> getOperationWithResponseAsync(String operationId) {
        final String apiVersion = "2.0";
        final String accept = "application/json";
        return service.getOperation(this.client.getGeography(), apiVersion, operationId, accept);
    }

    /**
     * This path will be obtained from a call to POST /conversions. While in progress, an http200 will be returned with
     * no extra headers - followed by an http200 with Resource-Location header once successfully completed.
     *
     * @param operationId The ID to query the status for the Conversion create/import request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for a Long-Running Operations API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LongRunningOperationResult> getOperationAsync(String operationId) {
        return getOperationWithResponseAsync(operationId)
                .flatMap(
                        (ConversionsGetOperationResponse res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * This path will be obtained from a call to POST /conversions. While in progress, an http200 will be returned with
     * no extra headers - followed by an http200 with Resource-Location header once successfully completed.
     *
     * @param operationId The ID to query the status for the Conversion create/import request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for a Long-Running Operations API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LongRunningOperationResult getOperation(String operationId) {
        return getOperationAsync(operationId).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the Conversion List API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ConversionListDetailInfo>> listNextSinglePageAsync(String nextLink) {
        final String accept = "application/json";
        return service.listNext(nextLink, this.client.getGeography(), this.client.getXMsClientId(), accept)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getConversions(),
                                        res.getValue().getNextLink(),
                                        null));
    }
}
