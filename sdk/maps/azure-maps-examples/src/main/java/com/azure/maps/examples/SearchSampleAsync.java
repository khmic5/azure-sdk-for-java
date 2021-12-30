package com.azure.maps.examples;

import java.io.IOException;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.maps.search.SearchAsyncClient;
import com.azure.maps.search.SearchClientBuilder;

import reactor.core.publisher.Mono;

public class SearchSampleAsync {

    public static void main(String[] args) throws IOException {
        // build Client ID policy for use with Azure AD authentication
        HttpPipelinePolicy clientIdPolicy = new HttpPipelinePolicy() {
            @Override
            public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
                return Mono.defer(() -> {
                    context.getHttpRequest().setHeader("x-ms-client-id", System.getenv("CLIENT_ID"));
                    return next.process();
                });
            }
        };

        // build subscription policy for use with Shared Key Authentication
        HttpPipelinePolicy subscriptionKeyPolicy = new HttpPipelinePolicy() {
            @Override
            public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
                return Mono.defer(() -> {
                    context.getHttpRequest().setUrl(context.getHttpRequest().getUrl().toString() + "&subscription-key="
                            + System.getenv("SUBSCRIPTION_KEY"));
                    return next.process();
                });
            }
        };

        // use default credentials
        SearchClientBuilder builder = new SearchClientBuilder();
        builder.addPolicy(subscriptionKeyPolicy);
        builder.httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));
        SearchAsyncClient client = builder.buildAsyncClient();

        /* Stand-alone, one-shot operations
        // Search address -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-address
        System.out.println("Search Address:");

        // simple
        MapsCommon.print(client.searchAddress("15127 NE 24th Street, Redmond, WA 98052", null));

        // options
        MapsCommon.print(client.searchAddress("1 Main Street", new SearchAddressOptions()
                .coordinates(new LatLong(40.706270, -74.011454))
                .radiusInMeters(40000)
                .top(5)));

        // complete
        MapsCommon.print(client.searchAddressWithResponse("1 Main Street", new SearchAddressOptions()
                .coordinates(new LatLong(40.706270, -74.011454))
                .radiusInMeters(40000)
                .top(5), null).getStatusCode());

        // Search address reverse -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-address-reverse
        System.out.println("Search Address Reverse:");

        // options
        MapsCommon.print(client.reverseSearchAddress(new LatLong(37.337, -121.89),
                new ReverseSearchAddressOptions()
                        .includeSpeedLimit(true)
                        .entityType(GeographicEntityType.COUNTRY_SECONDARY_SUBDIVISION) // returns only city
        ));

        // complete
        MapsCommon.print(client.reverseSearchAddressWithResponse(new LatLong(37.337, -121.89),
                new ReverseSearchAddressOptions()
                        .includeSpeedLimit(true)
                        .entityType(GeographicEntityType.COUNTRY_SECONDARY_SUBDIVISION) // returns only city
                , null).getStatusCode());

        // Search address reverse cross street -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-address-reverse-cross-street
        System.out.println("Revere Search Cross Street Address:");

        // overload - only top 2 results
        MapsCommon.print(client.reverseSearchCrossStreetAddress(new LatLong(37.337, -121.89),
                new ReverseSearchCrossStreetAddressOptions()
                        .top(2)
                        .heading(5)));

        // complete
        MapsCommon.print(client.reverseSearchCrossStreetAddressWithResponse(new LatLong(37.337, -121.89),
                new ReverseSearchCrossStreetAddressOptions()
                        .top(2)
                        .heading(5),
                null).getStatusCode());

        // Search address structured -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-address-structured
        System.out.println("Search Address Structured:");

        // simple
        MapsCommon.print(client.searchStructuredAddress(new StructuredAddress()
                .countryCode("US")
                .postalCode("98121")
                .streetNumber("15127")
                .streetName("NE 24th Street")
                .municipality("Redmond")
                .countrySubdivision("WA"), null));

        // complete
        MapsCommon.print(client.searchStructuredAddressWithResponse(new StructuredAddress()
                .countryCode("US")
                .postalCode("98121")
                .streetNumber("15127")
                .streetName("NE 24th Street")
                .municipality("Redmond")
                .countrySubdivision("WA"),
                new SearchStructuredAddressOptions()
                        .top(2)
                        .radiusInMeters(1000),
                null).getStatusCode());

        // Search fuzzy -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-fuzzy
        System.out.println("Search Fuzzy:");
        Mono<SearchAddressResult> result = client.fuzzySearch("starbucks", new LatLong(40.706270, -74.011454), null);
        SearchAddressResult searchResult = result.block();
        MapsCommon.print(searchResult.getResults().get(0).getBoundingBox());
        */

        /*
        // with options
        SearchAddressResult results = client.fuzzySearch("1 Microsoft Way", new LatLong(40.706270, -74.011454),
                new FuzzySearchOptions().top(5));
        MapsCommon.print(results);

        // with response
        Response<SearchAddressResult> response = client.fuzzySearchWithResponse("California",
                null, null, new FuzzySearchOptions().top(5), null);
        MapsCommon.print(response.getStatusCode());

        // Get polygon -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-polygon
        List<String> ids = results.getResults().stream()
                .filter(item -> item.getDataSources() != null && item.getDataSources().getGeometry() != null)
                .map(item -> item.getDataSources().getGeometry().getId())
                .collect(Collectors.toList());

        if (ids != null && !ids.isEmpty()) {
            System.out.println("Get Polygon:");
            MapsCommon.print(client.listPolygons(ids).get(0));
            MapsCommon.print(client.listPolygonsWithResponse(ids, null).getValue().getClass());
        }

        // Search POI -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-poi
        System.out.println("Search Points of Interest:");

        // coordinates
        MapsCommon.print(client.searchPointOfInterest("pizza", new LatLong(36.98844, -121.97483), null));

        // options
        MapsCommon.print(client.searchPointOfInterest("pizza", new LatLong(36.98844, -121.97483),
                new SearchPointOfInterestOptions()
                        .top(10)
                        .operatingHours(OperatingHoursRange.NEXT_SEVEN_DAYS)));

        // with response
        MapsCommon.print(client.searchPointOfInterestWithResponse("pizza",
                new LatLong(36.98844, -121.97483), null,
                new SearchPointOfInterestOptions()
                        .top(10)
                        .operatingHours(OperatingHoursRange.NEXT_SEVEN_DAYS),
                null).getStatusCode());

        // Search nearby -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-nearby
        System.out.println("Search Nearby:");

        // options
        MapsCommon.print(client.searchNearbyPointOfInterest(new LatLong(40.706270, -74.011454),
                new SearchNearbyPointsOfInterestOptions()
                        .countryFilter(Arrays.asList("US"))
                        .top(10)));

        // response
        MapsCommon.print(client.searchNearbyPointOfInterestWithResponse(new LatLong(40.706270, -74.011454),
                new SearchNearbyPointsOfInterestOptions()
                        .countryFilter(Arrays.asList("US"))
                        .top(10),
                null).getStatusCode());

        // Search POI Category -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-poi-category
        System.out.println("Get Point of Interest Category:");

        // complete - search for italian restaurant in NYC
        MapsCommon.print(client.searchPointOfInterestCategory("pasta", new LatLong(40.706270, -74.011454),
                new SearchPointOfInterestCategoryOptions()
                        .categoryFilter(Arrays.asList(7315))
                        .top(3)));

        // with response
        MapsCommon.print(client.searchPointOfInterestCategoryWithResponse("pasta", new LatLong(40.706270, -74.011454),
                null, new SearchPointOfInterestCategoryOptions()
                        .categoryFilter(Arrays.asList(7315))
                        .top(3),
                null).getStatusCode());

        // Get POI Category Tree -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-poi-category-tree-preview
        // client.getSearchPoiCategoryTreePreviewWithResponse() offers a complete
        // version including more parameters and
        // the underlying HttpResponse object.
        System.out.println("Get Search POI Category Tree:");
        MapsCommon.print(client.getPointOfInterestCategoryTree(null));

        // Post search along route -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-along-route
        // client.postSearchAlongRouteWithResponse() offers a complete version including
        // more parameters and
        // the underlying HttpResponse object.
        System.out.println("Search Along Route");
        GeoJsonLineString route = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_along_route_request_body.json")),
                GeoJsonLineString.class);

        // simple
        MapsCommon.print(client.searchAlongRoute("burger", 1000, route, null));

        // options
        MapsCommon.print(client.searchAlongRoute("burger", 1000, route,
                new SearchAlongRouteOptions()
                        .categoryFilter(Arrays.asList(7315))
                        .top(5)));

        // complete
        MapsCommon.print(client.searchAlongRouteWithResponse("burger", 1000, route,
                new SearchAlongRouteOptions()
                        .categoryFilter(Arrays.asList(7315))
                        .top(5),
                null).getStatusCode());

        // Search insider geometry -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-along-route
        System.out.println("Search Inside Geometry");
        GeoJsonObject geometry = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_inside_geometry_request_body.json")),
                GeoJsonObject.class);

        // simple
        MapsCommon.print(client.searchInsideGeometry("Leland Avenue", geometry, null));

        // options
        MapsCommon.print(client.searchInsideGeometry("Leland Avenue", geometry,
                new SearchInsideGeometryOptions()
                        .top(5)));

        // complete
        MapsCommon.print(client.searchInsideGeometryWithResponse("Leland Avenue", geometry,
                new SearchInsideGeometryOptions()
                        .top(5),
                null).getStatusCode());

        /* Batch operations.

        // Search address batch sync -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-address-batch
        // This call posts addresses for search using the Synchronous Batch API.
        // All results will be available when the call returns. A maximum of 100
        // addresses can be searched this way.
        System.out.println("Search Address Batch Sync");
        BatchRequest contentJson = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_address_batch_request_body.json")),
                BatchRequest.class);
        MapsCommon.print(client.searchAddressBatchSync(contentJson));

        // Search address batch async -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-address-batch
        // This call posts addresses for search using the Asynchronous Batch API.
        // SyncPoller will do the polling automatically and you can retrieve the result
        // with getFinalResult()
        System.out.println("Search Address Batch Async");
        MapsCommon.print(client.beginSearchAddressBatch(contentJson).getFinalResult());

        // Search address reverse batch -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-address-reverse-batch
        // This is also a batch API like searchAddressBatch(), so the same calling
        // patterns apply.
        System.out.println("Reverse Search Address Batch Sync");
        contentJson = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_address_reverse_batch_request_body.json")),
                BatchRequest.class);
        ReverseSearchAddressBatchProcessResult br = client.reverseSearchAddressBatchSync(contentJson);
        MapsCommon.print(br.getBatchItems());

        System.out.println("Reverse Search Address Batch Async");
        MapsCommon.print(client.beginReverseSearchAddressBatch(contentJson).getFinalResult());

        // Post search address reverse batch -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-fuzzy-batch
        // This is also a batch API like postSearchAddressBatch(), so the same calling
        // patterns apply.
        System.out.println("Post Search Fuzzy Batch Sync");
        contentJson = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_fuzzy_batch_request_body.json")),
                BatchRequest.class);
        MapsCommon.print(client.fuzzySearchBatchSync(contentJson));

        System.out.println("Post Search Fuzzy Batch Async");
        MapsCommon.print(client.beginFuzzySearchBatch(contentJson).getFinalResult());
        */
    }
}
