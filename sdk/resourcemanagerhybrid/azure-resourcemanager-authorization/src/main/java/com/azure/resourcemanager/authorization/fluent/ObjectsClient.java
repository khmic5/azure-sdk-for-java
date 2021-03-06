// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.fluent.models.DirectoryObjectInner;
import com.azure.resourcemanager.authorization.models.GetObjectsParameters;

/** An instance of this class provides access to all the operations defined in ObjectsClient. */
public interface ObjectsClient {
    /**
     * Gets the directory objects specified in a list of object IDs. You can also specify which resource collections
     * (users, groups, etc.) should be searched by specifying the optional types parameter.
     *
     * @param tenantId The tenant ID.
     * @param parameters Objects filtering parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the directory objects specified in a list of object IDs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DirectoryObjectInner> getObjectsByObjectIdsAsync(String tenantId, GetObjectsParameters parameters);

    /**
     * Gets the directory objects specified in a list of object IDs. You can also specify which resource collections
     * (users, groups, etc.) should be searched by specifying the optional types parameter.
     *
     * @param tenantId The tenant ID.
     * @param parameters Objects filtering parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the directory objects specified in a list of object IDs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DirectoryObjectInner> getObjectsByObjectIds(String tenantId, GetObjectsParameters parameters);

    /**
     * Gets the directory objects specified in a list of object IDs. You can also specify which resource collections
     * (users, groups, etc.) should be searched by specifying the optional types parameter.
     *
     * @param tenantId The tenant ID.
     * @param parameters Objects filtering parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the directory objects specified in a list of object IDs.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DirectoryObjectInner> getObjectsByObjectIds(
        String tenantId, GetObjectsParameters parameters, Context context);
}
