// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.implementation;

import com.azure.maps.creator.fluent.models.CollectionInfoInner;
import com.azure.maps.creator.fluent.models.CollectionsResponseInner;
import com.azure.maps.creator.models.CollectionInfo;
import com.azure.maps.creator.models.CollectionsResponse;
import com.azure.maps.creator.models.WfsEndpointLink;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class CollectionsResponseImpl implements CollectionsResponse {
    private CollectionsResponseInner innerObject;

    private final com.azure.maps.creator.CreatorManager serviceManager;

    CollectionsResponseImpl(
        CollectionsResponseInner innerObject, com.azure.maps.creator.CreatorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String ontology() {
        return this.innerModel().ontology();
    }

    public List<WfsEndpointLink> links() {
        List<WfsEndpointLink> inner = this.innerModel().links();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<CollectionInfo> collections() {
        List<CollectionInfoInner> inner = this.innerModel().collections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new CollectionInfoImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public CollectionsResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.maps.creator.CreatorManager manager() {
        return this.serviceManager;
    }
}
