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
import com.azure.core.management.profile.AzureProfile;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.maps.search.SearchManager;
import com.azure.maps.search.fluent.SearchesClient;
import com.azure.maps.search.fluent.models.SearchCommonResponseInner;
import com.azure.maps.search.models.BatchRequestBody;
import com.azure.maps.search.models.ResponseFormat;
import com.azure.maps.search.models.SearchAlongRouteRequestBody;
import com.azure.maps.search.models.SearchInsideGeometryRequestBody;
import com.azure.maps.search.models.TextFormat;

import reactor.core.publisher.Mono;

public class SearchSample {

    public static void main(String[] args) throws IOException {
        /*
        HttpPipelinePolicy clientIdPolicy = new HttpPipelinePolicy(){
            @Override
            public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
                return Mono.defer(() -> {
                    context.getHttpRequest().setHeader("x-ms-client-id", System.getenv("CLIENT_ID"));
                    return next.process();
                });
            }
        };*/

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

        // call several search methods and display results
        // all calls in this section are synchronous
        System.out.println("Get Search Address:");
        MapsCommon.print(
                client.getSearchAddress(TextFormat.JSON, "15127 NE 24th Street, Redmond, WA 98052"));



        System.out.println("Get Search Address Reverse:");
        MapsCommon.print(client.getSearchAddressReverse(TextFormat.JSON, "37.337,-121.89"));

        System.out.println("Get Search Address Reverse Cross Street:");
        MapsCommon.print(client.getSearchAddressReverseCrossStreet(TextFormat.JSON, "37.337,-121.89"));

        // TODO this is throwing an exception. Verify generated code.
        System.out.println("Get Search Address Structured:");
        /*
        //MapsCommon.print(client.getSearches().getSearchAddressStructured(TextFormat.JSON)); //TextFormat.JSON, null, "US", null, null,
                //"15127", "NE 24th Street", null, "Redmond", null, null, null, "WA", "98052", null, null));

        */
        // get HttpResponse object as well as the payload
        Response<SearchCommonResponseInner> response = client.getSearchAddressStructuredWithResponse(TextFormat.JSON, null, "US", null, null,
            "15127", "NE 24th Street", null, "Redmond", null, null, null, "WA", "98052", null, null, null);
        MapsCommon.print(response.getValue());

        System.out.println("Get Search Fuzzy:");
        SearchCommonResponseInner results = client.getSearchFuzzy(TextFormat.JSON, "seattle");
        MapsCommon.print(results);
        List<String> ids = results.results().stream().map(item -> item.dataSources().geometry().id())
                .collect(Collectors.toList());

        System.out.println("Get Search Polygon:");
        MapsCommon.print(client.getSearchPolygon(ResponseFormat.JSON, ids));

        // TODO There is a version with replies with the SearchCommonReponse that is throwing errors
        // this complete version is also throwing errors with the serializer
        // also it just has a couple parameters
        // pattern of empty methods that return the direct payload and complete methods that return
        // HTtpResponse. mising: methods that are complete and return the direct payload
        System.out.println("Get Search Nearby:");
        MapsCommon.print(client.getSearchNearby(TextFormat.JSON, 40.706270f, -74.011454f));

        MapsCommon.print(client.getSearchNearbyWithResponse(TextFormat.JSON, 40.706270f, -74.011454f, 10, null, null, null,
                8046f, null, null, null, null, null, null).getValue());

        System.out.println("Get Search POI:");
        MapsCommon.print(client.getSearchPoi(TextFormat.JSON, "juice bars"));
                //, null, 5, null, null, null,
                //47.606038f, -122.333345f, 8046f, null, null, null, null, null, null, null, null));

        System.out.println("Get Search POI Category:");
        MapsCommon.print(client.getSearchPoiCategory(TextFormat.JSON, "atm"));
                // , null, 5, null, null, null,
                // 47.606038f, -122.333345f, 8046f, null, null, null, null, null, null, null, null));

        System.out.println("Get Search POI Category Tree:");
        MapsCommon.print(client.getSearchPoiCategoryTreePreview(ResponseFormat.JSON));

        System.out.println("Post Search Address Batch Sync");
        BatchRequestBody contentJson = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_address_batch_request_body.json")),
                BatchRequestBody.class);
        MapsCommon.print(client.postSearchAddressBatchSync(ResponseFormat.JSON, contentJson));

        System.out.println("Post Search Address Reverse Batch Sync");
        contentJson = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_address_reverse_batch_request_body.json")),
                BatchRequestBody.class);
        MapsCommon.print(client.postSearchAddressReverseBatchSync(ResponseFormat.JSON, contentJson));

        System.out.println("Post Search Fuzzy Batch Sync");
        contentJson = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_fuzzy_batch_request_body.json")),
                BatchRequestBody.class);
        MapsCommon.print(client.postSearchFuzzyBatchSync(ResponseFormat.JSON, contentJson));

        System.out.println("Post Search Along Route");
        SearchAlongRouteRequestBody searchAlongRouteRequestBody = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_along_route_request_body.json")),
                SearchAlongRouteRequestBody.class);

        MapsCommon.print(client.postSearchAlongRoute(TextFormat.JSON, "burger", 1000,
                searchAlongRouteRequestBody)); //, null, 2, null, null, null, null));

        System.out.println("Post Search Inside Geometry");
        SearchInsideGeometryRequestBody searchInsideGeometryRequestBody = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_inside_geometry_request_body.json")),
                SearchInsideGeometryRequestBody.class);
        MapsCommon.print(client.postSearchInsideGeometry(TextFormat.JSON, "burger",
                searchInsideGeometryRequestBody)); // , 2, null, null, null, null, null, null));
    }
}
