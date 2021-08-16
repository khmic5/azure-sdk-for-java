// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.maps.creator.fluent.models.FeatureStatesStructureInner;
import com.azure.maps.creator.fluent.models.StatesetCreatedResponseInner;
import com.azure.maps.creator.fluent.models.StatesetGetResponseInner;
import com.azure.maps.creator.models.StatesetInfoObject;
import com.azure.maps.creator.models.StylesObject;

/** An instance of this class provides access to all the operations defined in FeatureStatesClient. */
public interface FeatureStatesClient {
    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This POST API allows the user to create a new Stateset and define stateset style using request body.
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. The Feature State API is part of Creator.
     *
     * <p>The Feature State service allows the user to update the states of a feature and query them to be used in other
     * services. The dynamic properties of a feature that don't belong to the dataset are referred to as *states* here.
     *
     * <p>This Feature State service pivot on the Stateset. Like Tileset, Stateset encapsulates the storage mechanism
     * for feature states for a dataset.
     *
     * <p>Once the stateset is created, users can use that statesetId to post feature state updates and retrieve the
     * current feature states. A feature can have only one state at a given point in time.
     *
     * <p>Feature state is defined by the key name, value and the timestamp. When a feature state update is posted to
     * Azure Maps, the state value gets updated only if the provided state’s timestamp is later than the stored
     * timestamp.
     *
     * <p>Azure Maps MapControl provides a way to use these feature states to style the features. Please refer to the
     * [State Tile documentation](https://docs.microsoft.com/en-us/rest/api/maps/render/get-map-state-tile-preview) for
     * more information.
     *
     * @param datasetId The datasetId must have been obtained from a successful [Dataset Create
     *     API](https://docs.microsoft.com/en-us/rest/api/maps/v2/dataset/create) call.
     * @param statesetCreateRequestBody The stateset style JSON data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the successful Stateset Create API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StatesetCreatedResponseInner createStateset(String datasetId, StylesObject statesetCreateRequestBody);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This POST API allows the user to create a new Stateset and define stateset style using request body.
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. The Feature State API is part of Creator.
     *
     * <p>The Feature State service allows the user to update the states of a feature and query them to be used in other
     * services. The dynamic properties of a feature that don't belong to the dataset are referred to as *states* here.
     *
     * <p>This Feature State service pivot on the Stateset. Like Tileset, Stateset encapsulates the storage mechanism
     * for feature states for a dataset.
     *
     * <p>Once the stateset is created, users can use that statesetId to post feature state updates and retrieve the
     * current feature states. A feature can have only one state at a given point in time.
     *
     * <p>Feature state is defined by the key name, value and the timestamp. When a feature state update is posted to
     * Azure Maps, the state value gets updated only if the provided state’s timestamp is later than the stored
     * timestamp.
     *
     * <p>Azure Maps MapControl provides a way to use these feature states to style the features. Please refer to the
     * [State Tile documentation](https://docs.microsoft.com/en-us/rest/api/maps/render/get-map-state-tile-preview) for
     * more information.
     *
     * @param datasetId The datasetId must have been obtained from a successful [Dataset Create
     *     API](https://docs.microsoft.com/en-us/rest/api/maps/v2/dataset/create) call.
     * @param statesetCreateRequestBody The stateset style JSON data.
     * @param description Description for the stateset. Max length allowed is 1000.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the successful Stateset Create API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<StatesetCreatedResponseInner> createStatesetWithResponse(
        String datasetId, StylesObject statesetCreateRequestBody, String description, Context context);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This API allows the caller to fetch a list of all previously successfully created statesets.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the successful Stateset List API.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StatesetInfoObject> listStateset();

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This API allows the caller to fetch a list of all previously successfully created statesets.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the successful Stateset List API.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StatesetInfoObject> listStateset(Context context);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This PUT API allows the user to update the stateset style rules.
     *
     * @param statesetId The stateset id that was created.
     * @param statesetStyleUpdateRequestBody The stateset style JSON data. Only style rules are allowed to be updated,
     *     update on keyname and type is not allowed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putStateset(String statesetId, StylesObject statesetStyleUpdateRequestBody);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This PUT API allows the user to update the stateset style rules.
     *
     * @param statesetId The stateset id that was created.
     * @param statesetStyleUpdateRequestBody The stateset style JSON data. Only style rules are allowed to be updated,
     *     update on keyname and type is not allowed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> putStatesetWithResponse(
        String statesetId, StylesObject statesetStyleUpdateRequestBody, Context context);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This DELETE API allows the user to delete the stateset and the associated data.
     *
     * @param statesetId The stateset id that was created.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteStateset(String statesetId);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This DELETE API allows the user to delete the stateset and the associated data.
     *
     * @param statesetId The stateset id that was created.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteStatesetWithResponse(String statesetId, Context context);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This GET API allows the user to get the stateset Information.
     *
     * <p>The stateset Information includes the datasetId associated to the stateset, and the styles of that stateset.
     *
     * @param statesetId The stateset id that was created.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the successful Stateset Get API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StatesetGetResponseInner getStateset(String statesetId);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This GET API allows the user to get the stateset Information.
     *
     * <p>The stateset Information includes the datasetId associated to the stateset, and the styles of that stateset.
     *
     * @param statesetId The stateset id that was created.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the successful Stateset Get API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<StatesetGetResponseInner> getStatesetWithResponse(String statesetId, Context context);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This PUT API allows the user to update the state of the given feature in the given stateset.
     *
     * @param statesetId The stateset id that was created.
     * @param featureId The id of a feature in the given dataset. If the featureId is not present in the dataset, Bad
     *     Request response will be returned.
     * @param featureStateUpdateRequestBody The feature state JSON data. A feature can have only one state at a given
     *     point in time. The specified state keyname must have been defined during the stateset creation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void updateStates(String statesetId, String featureId, FeatureStatesStructureInner featureStateUpdateRequestBody);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This PUT API allows the user to update the state of the given feature in the given stateset.
     *
     * @param statesetId The stateset id that was created.
     * @param featureId The id of a feature in the given dataset. If the featureId is not present in the dataset, Bad
     *     Request response will be returned.
     * @param featureStateUpdateRequestBody The feature state JSON data. A feature can have only one state at a given
     *     point in time. The specified state keyname must have been defined during the stateset creation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> updateStatesWithResponse(
        String statesetId,
        String featureId,
        FeatureStatesStructureInner featureStateUpdateRequestBody,
        Context context);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This API deletes the state information identified by the StateKeyName parameter for the feature identified by
     * the FeatureId parameter in the the stateset.
     *
     * @param statesetId The stateset id that was created.
     * @param featureId The id of a feature in the given stateset. If no state was set for the featureId in the stateset
     *     earlier, Bad Request response will be returned.
     * @param stateKeyName The Name of the state to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteState(String statesetId, String featureId, String stateKeyName);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This API deletes the state information identified by the StateKeyName parameter for the feature identified by
     * the FeatureId parameter in the the stateset.
     *
     * @param statesetId The stateset id that was created.
     * @param featureId The id of a feature in the given stateset. If no state was set for the featureId in the stateset
     *     earlier, Bad Request response will be returned.
     * @param stateKeyName The Name of the state to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteStateWithResponse(String statesetId, String featureId, String stateKeyName, Context context);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This API returns the current state information associated with the given feature in the given stateset.
     *
     * @param statesetId The stateset id that was created.
     * @param featureId The id of a feature in the given stateset. If no state was set for the featureId in the stateset
     *     earlier, Bad Request response will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the feature states model for a feature.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FeatureStatesStructureInner getStates(String statesetId, String featureId);

    /**
     * **Applies to:** see pricing [tiers](https://aka.ms/AzureMapsPricingTier).
     *
     * <p>Creator makes it possible to develop applications based on your private indoor map data using Azure Maps API
     * and SDK. [This](https://docs.microsoft.com/azure/azure-maps/creator-indoor-maps) article introduces concepts and
     * tools that apply to Azure Maps Creator.
     *
     * <p>This API returns the current state information associated with the given feature in the given stateset.
     *
     * @param statesetId The stateset id that was created.
     * @param featureId The id of a feature in the given stateset. If no state was set for the featureId in the stateset
     *     earlier, Bad Request response will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the feature states model for a feature.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FeatureStatesStructureInner> getStatesWithResponse(String statesetId, String featureId, Context context);
}
