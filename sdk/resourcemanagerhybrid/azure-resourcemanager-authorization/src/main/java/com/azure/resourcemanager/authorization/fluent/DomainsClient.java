// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.fluent.models.DomainInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DomainsClient. */
public interface DomainsClient {
    /**
     * Gets a list of domains for the current tenant.
     *
     * @param tenantId The tenant ID.
     * @param filter The filter to apply to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of domains for the current tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DomainInner> listAsync(String tenantId, String filter);

    /**
     * Gets a list of domains for the current tenant.
     *
     * @param tenantId The tenant ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of domains for the current tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DomainInner> listAsync(String tenantId);

    /**
     * Gets a list of domains for the current tenant.
     *
     * @param tenantId The tenant ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of domains for the current tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DomainInner> list(String tenantId);

    /**
     * Gets a list of domains for the current tenant.
     *
     * @param tenantId The tenant ID.
     * @param filter The filter to apply to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of domains for the current tenant.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DomainInner> list(String tenantId, String filter, Context context);

    /**
     * Gets a specific domain in the current tenant.
     *
     * @param domainName name of the domain.
     * @param tenantId The tenant ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific domain in the current tenant.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DomainInner>> getWithResponseAsync(String domainName, String tenantId);

    /**
     * Gets a specific domain in the current tenant.
     *
     * @param domainName name of the domain.
     * @param tenantId The tenant ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific domain in the current tenant.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DomainInner> getAsync(String domainName, String tenantId);

    /**
     * Gets a specific domain in the current tenant.
     *
     * @param domainName name of the domain.
     * @param tenantId The tenant ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific domain in the current tenant.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DomainInner get(String domainName, String tenantId);

    /**
     * Gets a specific domain in the current tenant.
     *
     * @param domainName name of the domain.
     * @param tenantId The tenant ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific domain in the current tenant.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DomainInner> getWithResponse(String domainName, String tenantId, Context context);
}
