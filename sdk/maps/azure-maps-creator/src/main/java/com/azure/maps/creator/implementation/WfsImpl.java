// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.maps.creator.fluent.WfsClient;
import com.azure.maps.creator.fluent.models.CollectionDefinitionResponseInner;
import com.azure.maps.creator.fluent.models.CollectionInfoInner;
import com.azure.maps.creator.fluent.models.CollectionsResponseInner;
import com.azure.maps.creator.fluent.models.ConformanceResponseInner;
import com.azure.maps.creator.fluent.models.ExtendedGeoJsonFeatureCollectionInner;
import com.azure.maps.creator.fluent.models.FeatureResponseInner;
import com.azure.maps.creator.fluent.models.LandingPageResponseInner;
import com.azure.maps.creator.models.CollectionDefinitionResponse;
import com.azure.maps.creator.models.CollectionInfo;
import com.azure.maps.creator.models.CollectionsResponse;
import com.azure.maps.creator.models.ConformanceResponse;
import com.azure.maps.creator.models.ExtendedGeoJsonFeatureCollection;
import com.azure.maps.creator.models.FeatureResponse;
import com.azure.maps.creator.models.LandingPageResponse;
import com.azure.maps.creator.models.Wfs;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class WfsImpl implements Wfs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WfsImpl.class);

    private final WfsClient innerClient;

    private final com.azure.maps.creator.CreatorManager serviceManager;

    public WfsImpl(WfsClient innerClient, com.azure.maps.creator.CreatorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public LandingPageResponse getLandingPage(String datasetId) {
        LandingPageResponseInner inner = this.serviceClient().getLandingPage(datasetId);
        if (inner != null) {
            return new LandingPageResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LandingPageResponse> getLandingPageWithResponse(String datasetId, Context context) {
        Response<LandingPageResponseInner> inner = this.serviceClient().getLandingPageWithResponse(datasetId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LandingPageResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ConformanceResponse getConformance(String datasetId) {
        ConformanceResponseInner inner = this.serviceClient().getConformance(datasetId);
        if (inner != null) {
            return new ConformanceResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ConformanceResponse> getConformanceWithResponse(String datasetId, Context context) {
        Response<ConformanceResponseInner> inner = this.serviceClient().getConformanceWithResponse(datasetId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ConformanceResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CollectionsResponse getCollections(String datasetId) {
        CollectionsResponseInner inner = this.serviceClient().getCollections(datasetId);
        if (inner != null) {
            return new CollectionsResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CollectionsResponse> getCollectionsWithResponse(String datasetId, Context context) {
        Response<CollectionsResponseInner> inner = this.serviceClient().getCollectionsWithResponse(datasetId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CollectionsResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CollectionInfo getCollection(String datasetId, String collectionId) {
        CollectionInfoInner inner = this.serviceClient().getCollection(datasetId, collectionId);
        if (inner != null) {
            return new CollectionInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CollectionInfo> getCollectionWithResponse(String datasetId, String collectionId, Context context) {
        Response<CollectionInfoInner> inner =
            this.serviceClient().getCollectionWithResponse(datasetId, collectionId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CollectionInfoImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CollectionDefinitionResponse getCollectionDefinition(String datasetId, String collectionId) {
        CollectionDefinitionResponseInner inner = this.serviceClient().getCollectionDefinition(datasetId, collectionId);
        if (inner != null) {
            return new CollectionDefinitionResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CollectionDefinitionResponse> getCollectionDefinitionWithResponse(
        String datasetId, String collectionId, Context context) {
        Response<CollectionDefinitionResponseInner> inner =
            this.serviceClient().getCollectionDefinitionWithResponse(datasetId, collectionId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CollectionDefinitionResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExtendedGeoJsonFeatureCollection getFeatures(String datasetId, String collectionId) {
        ExtendedGeoJsonFeatureCollectionInner inner = this.serviceClient().getFeatures(datasetId, collectionId);
        if (inner != null) {
            return new ExtendedGeoJsonFeatureCollectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExtendedGeoJsonFeatureCollection> getFeaturesWithResponse(
        String datasetId, String collectionId, Integer limit, String bbox, String filter, Context context) {
        Response<ExtendedGeoJsonFeatureCollectionInner> inner =
            this.serviceClient().getFeaturesWithResponse(datasetId, collectionId, limit, bbox, filter, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExtendedGeoJsonFeatureCollectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public FeatureResponse getFeature(String datasetId, String collectionId, String featureId) {
        FeatureResponseInner inner = this.serviceClient().getFeature(datasetId, collectionId, featureId);
        if (inner != null) {
            return new FeatureResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<FeatureResponse> getFeatureWithResponse(
        String datasetId, String collectionId, String featureId, Context context) {
        Response<FeatureResponseInner> inner =
            this.serviceClient().getFeatureWithResponse(datasetId, collectionId, featureId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new FeatureResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteFeature(String datasetId, String collectionId, String featureId) {
        this.serviceClient().deleteFeature(datasetId, collectionId, featureId);
    }

    public Response<Void> deleteFeatureWithResponse(
        String datasetId, String collectionId, String featureId, Context context) {
        return this.serviceClient().deleteFeatureWithResponse(datasetId, collectionId, featureId, context);
    }

    private WfsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.maps.creator.CreatorManager manager() {
        return this.serviceManager;
    }
}
