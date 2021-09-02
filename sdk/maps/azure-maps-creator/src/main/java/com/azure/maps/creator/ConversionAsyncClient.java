// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.util.polling.PollerFlux;
import com.azure.maps.creator.implementation.ConversionsImpl;
import com.azure.maps.creator.models.ConversionListDetailInfo;
import com.azure.maps.creator.models.ConversionsConvertResponse;
import com.azure.maps.creator.models.ConversionsGetOperationResponse;
import com.azure.maps.creator.models.ErrorResponseException;
import com.azure.maps.creator.models.LongRunningOperationResult;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous CreatorClient type. */
@ServiceClient(builder = CreatorClientBuilder.class, isAsync = true)
public final class ConversionAsyncClient {
    private final ConversionsImpl serviceClient;

    /**
     * Initializes an instance of Conversions client.
     *
     * @param serviceClient the service client implementation.
     */
    ConversionAsyncClient(ConversionsImpl serviceClient) {
        this.serviceClient = serviceClient;
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
    public Mono<ConversionsConvertResponse> convertWithResponse(
            String udid, String outputOntology, String description) {
        return this.serviceClient.convertWithResponseAsync(udid, outputOntology, description);
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
    public PollerFlux<LongRunningOperationResult, LongRunningOperationResult> beginConvert(
            String udid, String outputOntology, String description) {
        return this.serviceClient.beginConvertAsync(udid, outputOntology, description);
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
    public Mono<PagedResponse<ConversionListDetailInfo>> listSinglePage() {
        return this.serviceClient.listSinglePageAsync();
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
    public PagedFlux<ConversionListDetailInfo> list() {
        return this.serviceClient.listAsync();
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
    public Mono<Response<ConversionListDetailInfo>> getWithResponse(String conversionId) {
        return this.serviceClient.getWithResponseAsync(conversionId);
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
    public Mono<ConversionListDetailInfo> get(String conversionId) {
        return this.serviceClient.getAsync(conversionId);
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
    public Mono<Response<Void>> deleteWithResponse(String conversionId) {
        return this.serviceClient.deleteWithResponseAsync(conversionId);
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
    public Mono<Void> delete(String conversionId) {
        return this.serviceClient.deleteAsync(conversionId);
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
    public Mono<ConversionsGetOperationResponse> getOperationWithResponse(String operationId) {
        return this.serviceClient.getOperationWithResponseAsync(operationId);
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
    public Mono<LongRunningOperationResult> getOperation(String operationId) {
        return this.serviceClient.getOperationAsync(operationId);
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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Mono<PagedResponse<ConversionListDetailInfo>> listNextSinglePage(String nextLink) {
        return this.serviceClient.listNextSinglePageAsync(nextLink);
    }
}
