package com.azure.maps.examples;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.maps.search.SearchClient;
import com.azure.maps.search.SearchClientBuilder;
import com.azure.maps.search.implementation.SearchClientImpl;
import com.azure.maps.search.models.BatchRequestBody;
import com.azure.maps.search.models.ResponseFormat;
import com.azure.maps.search.models.SearchAddressBatchResponse;
import com.azure.maps.search.models.SearchAddressReverseBatchResponse;
import com.azure.maps.search.models.SearchAlongRouteRequestBody;
import com.azure.maps.search.models.SearchCommonResponse;
import com.azure.maps.search.models.SearchInsideGeometryRequestBody;
import com.azure.maps.search.models.TextFormat;

import reactor.core.publisher.Mono;

public class SearchSample {

    public static void main(String[] args) throws IOException {
        // build Client ID policy for use with Azure AD authentication
        HttpPipelinePolicy clientIdPolicy = new HttpPipelinePolicy(){
            @Override
            public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
                return Mono.defer(() -> {
                    context.getHttpRequest().setHeader("x-ms-client-id", System.getenv("CLIENT_ID"));
                    return next.process();
                });
            }
        };

        // build subscription policy for use with Shared Key Authentication
        HttpPipelinePolicy subscriptionKeyPolicy = new HttpPipelinePolicy(){
            @Override
            public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
                return Mono.defer(() -> {
                    context.getHttpRequest().setUrl(context.getHttpRequest().getUrl().toString() + "&subscription-key=" + System.getenv("SUBSCRIPTION_KEY"));
                    return next.process();
                });
            }
        };

        // use default credentials
        DefaultAzureCredential defaultCreds = new DefaultAzureCredentialBuilder().build();
        SearchClientBuilder builder = new SearchClientBuilder();
        builder.addPolicy(subscriptionKeyPolicy);
        SearchClient client = builder.buildClient();

        /* Stand-alone, one-shot operations */

        // Get search address - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-address
        // This is the only version of this call. No "WithResponse" version.
        System.out.println("Get Search Address:");
        MapsCommon.print(client.getSearchAddress(TextFormat.JSON, "15127 NE 24th Street, Redmond, WA 98052",
            null, null, null, null, null, null, null, null, null, null, null, null));

        // Get search address reverse - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-address-reverse
        System.out.println("Get Search Address Reverse:");
        MapsCommon.print(client.getSearchAddressReverse(TextFormat.JSON, "37.337,-121.89",
            null, null, null, null, null, null, null, null, null, null, null));

        // Get search address reverse cross street - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-address-reverse-cross-street
        System.out.println("Get Search Address Reverse Cross Street:");
        MapsCommon.print(client.getSearchAddressReverseCrossStreet(TextFormat.JSON, "37.337,-121.89", null, null, null, null, null));

        // Get search address structured - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-address-structured
        System.out.println("Get Search Address Structured:");
        MapsCommon.print(client.getSearchAddressStructured(TextFormat.JSON, null, "US", null, null,
            "15127", "NE 24th Street", null, "Redmond", null, null, null, "WA", "98052", null, null));

        // Get search fuzzy - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-fuzzy
        System.out.println("Get Search Fuzzy:");
        SearchCommonResponse results = client.getSearchFuzzy(TextFormat.JSON, "seattle", null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        MapsCommon.print(results);

        // Get search polygon - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-polygon
        List<String> ids = results.getResults().stream().map(item -> item.getDataSources().getGeometry().getId())
                .collect(Collectors.toList());

        System.out.println("Get Search Polygon:");
        MapsCommon.print(client.getSearchPolygon(ResponseFormat.JSON, ids));

        // Get search nearby - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-nearby
        System.out.println("Get Search Nearby:");
        MapsCommon.print(client.getSearchNearby(TextFormat.JSON, 40.706270f, -74.011454f, null, null, null, null,
            null, null, null, null, null, null));

        // Get search POI - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-poi
        System.out.println("Get Search POI:");
        MapsCommon.print(client.getSearchPOI(TextFormat.JSON, "juice bars", null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null));

        // Get search POI Category - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-poi-category
        System.out.println("Get Search POI Category:");
        MapsCommon.print(client.getSearchPOICategory(TextFormat.JSON, "atm", null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null));

        // Get search POI Category Tree - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-poi-category-tree-preview
        // client.getSearchPoiCategoryTreePreviewWithResponse() offers a complete version including more parameters and
        // the underlying HttpResponse object.
        System.out.println("Get Search POI Category Tree:");
        MapsCommon.print(client.getSearchPOICategoryTreePreview(ResponseFormat.JSON, null));

        // Post search along route - https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-along-route
        // client.postSearchAlongRouteWithResponse() offers a complete version including more parameters and
        // the underlying HttpResponse object.
        System.out.println("Post Search Along Route");
        SearchAlongRouteRequestBody searchAlongRouteRequestBody = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_along_route_request_body.json")),
                SearchAlongRouteRequestBody.class);

        MapsCommon.print(client.postSearchAlongRoute(TextFormat.JSON, "burger", 1000,
                searchAlongRouteRequestBody, null, 2, null, null, null, null));

        // Post search along route - https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-along-route
        // client.postSearchInsideGeometryWithResponse() offers a complete version including more parameters and
        // the underlying HttpResponse object.
        System.out.println("Post Search Inside Geometry");
        SearchInsideGeometryRequestBody searchInsideGeometryRequestBody = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_inside_geometry_request_body.json")),
                SearchInsideGeometryRequestBody.class);
        MapsCommon.print(client.postSearchInsideGeometry(TextFormat.JSON, "burger",
                searchInsideGeometryRequestBody, 2, null, null, null, null, null, null));

        /* Batch operations. */

        // Post search address batch sync - https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-address-batch
        // This call posts addresses for search using the Synchronous Batch API.
        // All results will be available when the call returns. A maximum of 100 addresses can be searched this way.
        System.out.println("Post Search Address Batch Sync");
        BatchRequestBody contentJson = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_address_batch_request_body.json")),
                BatchRequestBody.class);
        MapsCommon.print(client.postSearchAddressBatchSync(ResponseFormat.JSON, contentJson));

        // Post search address batch async - https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-address-batch
        // This call posts addresses for search using the Asynchronous Batch API.
        // There are two ways to call the Batch Asynchronous API:
        // - client.postSearchAddressBatch() will call the async API and block waiting for the result. All addresses
        //      will be available when the call returns. This allows simplifying the call and search more than 100 addresses.
        // Use async API + blocking call
        System.out.println("Post Search Address Batch Async - Blocking call");
        MapsCommon.print(client.beginPostSearchAddressBatch(ResponseFormat.JSON, contentJson).getFinalResult());

        // Post search address reverse batch - https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-address-reverse-batch
        // This is also a batch API like postSearchAddressBatch(), so the same calling patterns apply.
        System.out.println("Post Search Address Reverse Batch Sync");
        contentJson = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_address_reverse_batch_request_body.json")),
                BatchRequestBody.class);
        SearchAddressReverseBatchResponse br = client.postSearchAddressReverseBatchSync(ResponseFormat.JSON, contentJson);
        MapsCommon.print(br.getBatchItems());

        // Post search address reverse batch - https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-fuzzy-batch
        // This is also a batch API like postSearchAddressBatch(), so the same calling patterns apply.
        System.out.println("Post Search Fuzzy Batch Sync");
        contentJson = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_fuzzy_batch_request_body.json")),
                BatchRequestBody.class);
        MapsCommon.print(client.postSearchFuzzyBatchSync(ResponseFormat.JSON, contentJson));

        System.out.println("Post Search Fuzzy Batch Async");
        MapsCommon.print(client.beginPostSearchFuzzyBatch(ResponseFormat.JSON, contentJson).getFinalResult());
    }
}
