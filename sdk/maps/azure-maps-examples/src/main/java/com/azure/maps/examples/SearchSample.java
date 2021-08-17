package com.azure.maps.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.polling.SyncPoller;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.maps.search.SearchManager;
import com.azure.maps.search.fluent.SearchesClient;
import com.azure.maps.search.fluent.models.SearchAddressBatchResponseInner;
import com.azure.maps.search.fluent.models.SearchAddressReverseBatchResponseInner;
import com.azure.maps.search.fluent.models.SearchCommonResponseInner;
import com.azure.maps.search.models.BatchRequestBody;
import com.azure.maps.search.models.ResponseFormat;
import com.azure.maps.search.models.SearchAlongRouteRequestBody;
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

        // authenticate and create search client
        // TODO see why calling searches() here causes infinite recursion on Jackson
        SearchesClient client = SearchManager
            .configure()
            .withPolicy(subscriptionKeyPolicy)
            .authenticate(defaultCreds, new AzureProfile(new AzureEnvironment(new HashMap<String, String>() {{
                put("managementEndpointUrl", "https://atlas.microsoft.com");
            }}))).serviceClient().getSearches();

        /* Stand-alone, one-shot operations */

        // Get search address - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-address
        // This is the only version of this call. No "WithResponse" version.
        System.out.println("Get Search Address:");
        MapsCommon.print(client.getSearchAddress(TextFormat.JSON, "15127 NE 24th Street, Redmond, WA 98052"));

        // Get search address reverse - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-address-reverse
        // client.getSearchAddressReverseWithResponse() offers a complete version including more parameters and
        // the underlying HttpResponse object.
        System.out.println("Get Search Address Reverse:");
        MapsCommon.print(client.getSearchAddressReverse(TextFormat.JSON, "37.337,-121.89"));

        // Get search address reverse cross street - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-address-reverse-cross-street
        // client.getSearchAddressReverseCrossStreetWithResponse()
        System.out.println("Get Search Address Reverse Cross Street:");
        MapsCommon.print(client.getSearchAddressReverseCrossStreet(TextFormat.JSON, "37.337,-121.89"));

        // Get search address structured - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-address-structured
        // TODO The simple version is throwing an exception. Only the complete one is working.
        // MapsCommon.print(client.getSearchAddressStructured(TextFormat.JSON)); //TextFormat.JSON, null, "US", null, null,
        //"15127", "NE 24th Street", null, "Redmond", null, null, null, "WA", "98052", null, null));

        System.out.println("Get Search Address Structured:");
        Response<SearchCommonResponseInner> response = client.getSearchAddressStructuredWithResponse(TextFormat.JSON, null, "US", null, null,
            "15127", "NE 24th Street", null, "Redmond", null, null, null, "WA", "98052", null, null, null);
        MapsCommon.print(response.getValue());

        // Get search fuzzy - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-fuzzy
        // client.getSearchFuzzyWithResponse() offers a complete version including more parameters and
        // the underlying HttpResponse object.
        System.out.println("Get Search Fuzzy:");
        SearchCommonResponseInner results = client.getSearchFuzzy(TextFormat.JSON, "seattle");
        MapsCommon.print(results);

        // Get search polygon - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-polygon
        // client.getSearchPolygonWithResponse() offers a complete version including more parameters and
        // the underlying HttpResponse object.
        List<String> ids = results.results().stream().map(item -> item.dataSources().geometry().id())
                .collect(Collectors.toList());

        System.out.println("Get Search Polygon:");
        MapsCommon.print(client.getSearchPolygon(ResponseFormat.JSON, ids));

        // Get search nearby - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-nearby
        // client.getSearchNearbyWithResponse() offers a complete version including more parameters and
        // the underlying HttpResponse object.
        System.out.println("Get Search Nearby:");
        MapsCommon.print(client.getSearchNearby(TextFormat.JSON, 40.706270f, -74.011454f));

        // Get search POI - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-poi
        // client.getSearchPoiWithResponse() offers a complete version including more parameters and
        // the underlying HttpResponse object.
        System.out.println("Get Search POI:");
        MapsCommon.print(client.getSearchPoi(TextFormat.JSON, "juice bars"));

        // Example of a WithResponse() call.
        Response<SearchCommonResponseInner> poiResponse = client.getSearchPoiWithResponse(TextFormat.JSON, "juice bars", null, 5, null, null, null,
                47.606038f, -122.333345f, 8046f, null, null, null, null, null, null, null, null, null);
        System.out.println("Status code: " + poiResponse.getStatusCode());
        System.out.println("Headers:" + poiResponse.getHeaders().toString());
        MapsCommon.print(poiResponse.getValue());

        // Get search POI Category - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-poi-category
        // client.getSearchPoiCategoryWithResponse() offers a complete version including more parameters and
        // the underlying HttpResponse object.
        System.out.println("Get Search POI Category:");
        MapsCommon.print(client.getSearchPoiCategory(TextFormat.JSON, "atm"));

        // Get search POI Category Tree - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-poi-category-tree-preview
        // client.getSearchPoiCategoryTreePreviewWithResponse() offers a complete version including more parameters and
        // the underlying HttpResponse object.
        System.out.println("Get Search POI Category Tree:");
        MapsCommon.print(client.getSearchPoiCategoryTreePreview(ResponseFormat.JSON));

        // Post search along route - https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-along-route
        // client.postSearchAlongRouteWithResponse() offers a complete version including more parameters and
        // the underlying HttpResponse object.
        System.out.println("Post Search Along Route");
        SearchAlongRouteRequestBody searchAlongRouteRequestBody = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_along_route_request_body.json")),
                SearchAlongRouteRequestBody.class);

        MapsCommon.print(client.postSearchAlongRoute(TextFormat.JSON, "burger", 1000,
                searchAlongRouteRequestBody)); //, null, 2, null, null, null, null));

        // Post search along route - https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-along-route
        // client.postSearchInsideGeometryWithResponse() offers a complete version including more parameters and
        // the underlying HttpResponse object.
        System.out.println("Post Search Inside Geometry");
        SearchInsideGeometryRequestBody searchInsideGeometryRequestBody = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_inside_geometry_request_body.json")),
                SearchInsideGeometryRequestBody.class);
        MapsCommon.print(client.postSearchInsideGeometry(TextFormat.JSON, "burger",
                searchInsideGeometryRequestBody)); // , 2, null, null, null, null, null, null));

        /* Batch operations. */

        // Post search address batch sync - https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-address-batch
        // This call posts addresses for search using the Synchronous Batch API.
        // All results will be available when the call returns. A maximum of 100 addresses can be searched this way.
        // client.postSearchAddressBatchSyncWithResponse() offers a complete version including more parameters and
        // the underlying HttpResponse object.
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
        // - client.beginPostSearchAddressBatch() will call the async API and return a SyncPoller<T>. It can be used
        //      to poll for results and query the long running async operation.

        // Use async API + blocking call
        System.out.println("Post Search Address Batch Async - Blocking call");
        SearchAddressBatchResponseInner resp = client.postSearchAddressBatch(ResponseFormat.JSON, contentJson);
        MapsCommon.print(resp.batchItems());

        // Use async API + non-blocking call
        System.out.println("Post Search Address Batch Async - Non-blocking call");
        SyncPoller<PollResult<SearchAddressBatchResponseInner>, SearchAddressBatchResponseInner> poller =
            client.beginPostSearchAddressBatch(ResponseFormat.JSON, contentJson);
        System.out.println("Poller obtained");
        System.out.println("Poller status so far: " + poller.poll().getStatus());
        System.out.println("Final value: ");
        poller.waitForCompletion();
        MapsCommon.print(poller.getFinalResult());

        // Post search address reverse batch - https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-address-reverse-batch
        // This is also a batch API like postSearchAddressBatch(), so the same calling patterns apply.
        System.out.println("Post Search Address Reverse Batch Sync");
        contentJson = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_address_reverse_batch_request_body.json")),
                BatchRequestBody.class);
        SearchAddressReverseBatchResponseInner r = client.postSearchAddressReverseBatchSync(ResponseFormat.JSON, contentJson);
        MapsCommon.print(r.batchItems());

        // Post search address reverse batch - https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-fuzzy-batch
        // This is also a batch API like postSearchAddressBatch(), so the same calling patterns apply.
        System.out.println("Post Search Fuzzy Batch Sync");
        contentJson = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_fuzzy_batch_request_body.json")),
                BatchRequestBody.class);
        MapsCommon.print(client.postSearchFuzzyBatchSync(ResponseFormat.JSON, contentJson));
    }
}
