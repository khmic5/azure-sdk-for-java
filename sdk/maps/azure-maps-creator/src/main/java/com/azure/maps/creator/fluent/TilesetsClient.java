// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.maps.creator.fluent.models.LongRunningOperationResultInner;
import com.azure.maps.creator.fluent.models.TilesetDetailInfoInner;
import com.azure.maps.creator.models.TilesetsGetOperationResponse;

/** An instance of this class provides access to all the operations defined in TilesetsClient. */
public interface TilesetsClient {
    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>[This](https://docs.microsoft.com/en-us/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>The Tileset Create API allows the caller to create a tileset from a dataset. A tileset contains a set of tiles
     * that can be consumed from the [Get Map Tile](/rest/api/maps/render/getmaptile) to retrieve custom tiles. To make
     * a dataset, use the [DataSet Create API](/rest/api/maps/dataset/createpreview).
     *
     * <p>## Submit Create Request
     *
     * <p>To create your tileset you will make a `POST` request with an empty body. The `datasetId` query parameter will
     * be used as the source of the tileset data.
     *
     * <p>The Create Tileset API is a [long-running request](https://aka.ms/am-creator-lrt-v2).
     *
     * @param datasetId The unique `datasetId` that the tileset create API uses to retrieve features to generate tiles.
     *     The `datasetId` must have been obtained from a successful [Dataset Create
     *     API](/en-us/rest/api/maps/dataset/createpreview) call.
     * @param description User provided description of the tileset.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for a Long-Running Operations API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<LongRunningOperationResultInner>, LongRunningOperationResultInner> beginCreate(
        String datasetId, String description);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>[This](https://docs.microsoft.com/en-us/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>The Tileset Create API allows the caller to create a tileset from a dataset. A tileset contains a set of tiles
     * that can be consumed from the [Get Map Tile](/rest/api/maps/render/getmaptile) to retrieve custom tiles. To make
     * a dataset, use the [DataSet Create API](/rest/api/maps/dataset/createpreview).
     *
     * <p>## Submit Create Request
     *
     * <p>To create your tileset you will make a `POST` request with an empty body. The `datasetId` query parameter will
     * be used as the source of the tileset data.
     *
     * <p>The Create Tileset API is a [long-running request](https://aka.ms/am-creator-lrt-v2).
     *
     * @param datasetId The unique `datasetId` that the tileset create API uses to retrieve features to generate tiles.
     *     The `datasetId` must have been obtained from a successful [Dataset Create
     *     API](/en-us/rest/api/maps/dataset/createpreview) call.
     * @param description User provided description of the tileset.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for a Long-Running Operations API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<LongRunningOperationResultInner>, LongRunningOperationResultInner> beginCreate(
        String datasetId, String description, Context context);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>[This](https://docs.microsoft.com/en-us/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>The Tileset Create API allows the caller to create a tileset from a dataset. A tileset contains a set of tiles
     * that can be consumed from the [Get Map Tile](/rest/api/maps/render/getmaptile) to retrieve custom tiles. To make
     * a dataset, use the [DataSet Create API](/rest/api/maps/dataset/createpreview).
     *
     * <p>## Submit Create Request
     *
     * <p>To create your tileset you will make a `POST` request with an empty body. The `datasetId` query parameter will
     * be used as the source of the tileset data.
     *
     * <p>The Create Tileset API is a [long-running request](https://aka.ms/am-creator-lrt-v2).
     *
     * @param datasetId The unique `datasetId` that the tileset create API uses to retrieve features to generate tiles.
     *     The `datasetId` must have been obtained from a successful [Dataset Create
     *     API](/en-us/rest/api/maps/dataset/createpreview) call.
     * @param description User provided description of the tileset.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for a Long-Running Operations API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LongRunningOperationResultInner create(String datasetId, String description);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>[This](https://docs.microsoft.com/en-us/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>The Tileset Create API allows the caller to create a tileset from a dataset. A tileset contains a set of tiles
     * that can be consumed from the [Get Map Tile](/rest/api/maps/render/getmaptile) to retrieve custom tiles. To make
     * a dataset, use the [DataSet Create API](/rest/api/maps/dataset/createpreview).
     *
     * <p>## Submit Create Request
     *
     * <p>To create your tileset you will make a `POST` request with an empty body. The `datasetId` query parameter will
     * be used as the source of the tileset data.
     *
     * <p>The Create Tileset API is a [long-running request](https://aka.ms/am-creator-lrt-v2).
     *
     * @param datasetId The unique `datasetId` that the tileset create API uses to retrieve features to generate tiles.
     *     The `datasetId` must have been obtained from a successful [Dataset Create
     *     API](/en-us/rest/api/maps/dataset/createpreview) call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for a Long-Running Operations API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LongRunningOperationResultInner create(String datasetId);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>[This](https://docs.microsoft.com/en-us/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>The Tileset Create API allows the caller to create a tileset from a dataset. A tileset contains a set of tiles
     * that can be consumed from the [Get Map Tile](/rest/api/maps/render/getmaptile) to retrieve custom tiles. To make
     * a dataset, use the [DataSet Create API](/rest/api/maps/dataset/createpreview).
     *
     * <p>## Submit Create Request
     *
     * <p>To create your tileset you will make a `POST` request with an empty body. The `datasetId` query parameter will
     * be used as the source of the tileset data.
     *
     * <p>The Create Tileset API is a [long-running request](https://aka.ms/am-creator-lrt-v2).
     *
     * @param datasetId The unique `datasetId` that the tileset create API uses to retrieve features to generate tiles.
     *     The `datasetId` must have been obtained from a successful [Dataset Create
     *     API](/en-us/rest/api/maps/dataset/createpreview) call.
     * @param description User provided description of the tileset.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for a Long-Running Operations API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LongRunningOperationResultInner create(String datasetId, String description, Context context);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This API allows the caller to fetch a list of all tilesets created. &lt;br&gt;.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the Tileset List API.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TilesetDetailInfoInner> list();

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This API allows the caller to fetch a list of all tilesets created. &lt;br&gt;.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the Tileset List API.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TilesetDetailInfoInner> list(Context context);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This API allows the caller to fetch a tileset.
     *
     * @param tilesetId The Tileset Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detail information for the data.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TilesetDetailInfoInner get(String tilesetId);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This API allows the caller to fetch a tileset.
     *
     * @param tilesetId The Tileset Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detail information for the data.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TilesetDetailInfoInner> getWithResponse(String tilesetId, Context context);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This API allows the caller to delete a created tileset.&lt;br&gt; You can use this API if a tileset is no
     * longer needed.
     *
     * <p>### Submit Delete Request
     *
     * <p>To delete your content you will issue a `DELETE` request where the path will contain the `tilesetId` of the
     * tileset to delete.&lt;br&gt;
     *
     * <p>#### Delete request "Successful"
     *
     * <p>The Tileset Delete API returns a HTTP `204 No Content` response with an empty body, if the tileset was deleted
     * successfully.&lt;br&gt;
     *
     * <p>#### Delete request "Failed"
     *
     * <p>A HTTP `400 Bad Request` error response will be returned if the tileset with the passed-in `tilesetId` is not
     * found.
     *
     * <p>Here is a sample error response:
     *
     * <p>&lt;br&gt;
     *
     * <p>```json { "error": { "code": "400 BadRequest", "message": "Bad request - Tileset Id:
     * d85b5b27-5fc4-4599-8b50-47160e90f8ce does not exist." } } ```.
     *
     * @param tilesetId The Tileset Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String tilesetId);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This API allows the caller to delete a created tileset.&lt;br&gt; You can use this API if a tileset is no
     * longer needed.
     *
     * <p>### Submit Delete Request
     *
     * <p>To delete your content you will issue a `DELETE` request where the path will contain the `tilesetId` of the
     * tileset to delete.&lt;br&gt;
     *
     * <p>#### Delete request "Successful"
     *
     * <p>The Tileset Delete API returns a HTTP `204 No Content` response with an empty body, if the tileset was deleted
     * successfully.&lt;br&gt;
     *
     * <p>#### Delete request "Failed"
     *
     * <p>A HTTP `400 Bad Request` error response will be returned if the tileset with the passed-in `tilesetId` is not
     * found.
     *
     * <p>Here is a sample error response:
     *
     * <p>&lt;br&gt;
     *
     * <p>```json { "error": { "code": "400 BadRequest", "message": "Bad request - Tileset Id:
     * d85b5b27-5fc4-4599-8b50-47160e90f8ce does not exist." } } ```.
     *
     * @param tilesetId The Tileset Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String tilesetId, Context context);

    /**
     * This path will be obtained from a call to /tilesets/create. While in progress, an http200 will be returned with
     * no extra headers - followed by an http200 with Resource-Location header once successfully completed.
     *
     * @param operationId The ID to query the status for the dataset create/import request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for a Long-Running Operations API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LongRunningOperationResultInner getOperation(String operationId);

    /**
     * This path will be obtained from a call to /tilesets/create. While in progress, an http200 will be returned with
     * no extra headers - followed by an http200 with Resource-Location header once successfully completed.
     *
     * @param operationId The ID to query the status for the dataset create/import request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for a Long-Running Operations API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TilesetsGetOperationResponse getOperationWithResponse(String operationId, Context context);
}
