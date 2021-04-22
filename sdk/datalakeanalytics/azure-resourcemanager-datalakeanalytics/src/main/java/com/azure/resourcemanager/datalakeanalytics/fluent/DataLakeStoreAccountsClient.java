// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.DataLakeStoreAccountInformationInner;
import com.azure.resourcemanager.datalakeanalytics.models.AddDataLakeStoreParameters;

/** An instance of this class provides access to all the operations defined in DataLakeStoreAccountsClient. */
public interface DataLakeStoreAccountsClient {
    /**
     * Gets the first page of Data Lake Store accounts linked to the specified Data Lake Analytics account. The response
     * includes a link to the next page, if any.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the first page of Data Lake Store accounts linked to the specified Data Lake Analytics account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataLakeStoreAccountInformationInner> listByAccount(String resourceGroupName, String accountName);

    /**
     * Gets the first page of Data Lake Store accounts linked to the specified Data Lake Analytics account. The response
     * includes a link to the next page, if any.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param filter OData filter. Optional.
     * @param top The number of items to return. Optional.
     * @param skip The number of items to skip over before returning elements. Optional.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g.
     *     Categories?$select=CategoryName,Description. Optional.
     * @param orderby OrderBy clause. One or more comma-separated expressions with an optional "asc" (the default) or
     *     "desc" depending on the order you'd like the values sorted, e.g. Categories?$orderby=CategoryName desc.
     *     Optional.
     * @param count The Boolean value of true or false to request a count of the matching resources included with the
     *     resources in the response, e.g. Categories?$count=true. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the first page of Data Lake Store accounts linked to the specified Data Lake Analytics account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataLakeStoreAccountInformationInner> listByAccount(
        String resourceGroupName,
        String accountName,
        String filter,
        Integer top,
        Integer skip,
        String select,
        String orderby,
        Boolean count,
        Context context);

    /**
     * Updates the specified Data Lake Analytics account to include the additional Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to add.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void add(String resourceGroupName, String accountName, String dataLakeStoreAccountName);

    /**
     * Updates the specified Data Lake Analytics account to include the additional Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to add.
     * @param parameters The details of the Data Lake Store account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> addWithResponse(
        String resourceGroupName,
        String accountName,
        String dataLakeStoreAccountName,
        AddDataLakeStoreParameters parameters,
        Context context);

    /**
     * Gets the specified Data Lake Store account details in the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Data Lake Store account details in the specified Data Lake Analytics account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataLakeStoreAccountInformationInner get(
        String resourceGroupName, String accountName, String dataLakeStoreAccountName);

    /**
     * Gets the specified Data Lake Store account details in the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Data Lake Store account details in the specified Data Lake Analytics account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataLakeStoreAccountInformationInner> getWithResponse(
        String resourceGroupName, String accountName, String dataLakeStoreAccountName, Context context);

    /**
     * Updates the Data Lake Analytics account specified to remove the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to remove.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String dataLakeStoreAccountName);

    /**
     * Updates the Data Lake Analytics account specified to remove the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param dataLakeStoreAccountName The name of the Data Lake Store account to remove.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String dataLakeStoreAccountName, Context context);
}