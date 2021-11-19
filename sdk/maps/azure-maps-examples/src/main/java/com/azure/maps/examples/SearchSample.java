package com.azure.maps.examples;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.rest.Response;
import com.azure.maps.search.SearchClient;
import com.azure.maps.search.SearchClientBuilder;
import com.azure.maps.search.implementation.models.LatLongPairAbbreviated;
import com.azure.maps.search.models.BatchRequest;
import com.azure.maps.search.models.FuzzySearchOptions;
import com.azure.maps.search.models.GeographicEntityType;
import com.azure.maps.search.models.OperatingHoursRange;
import com.azure.maps.search.models.ReverseSearchAddressBatchProcessResult;
import com.azure.maps.search.models.ReverseSearchAddressOptions;
import com.azure.maps.search.models.SearchAddressOptions;
import com.azure.maps.search.models.SearchAddressResult;
import com.azure.maps.search.models.SearchAlongRouteRequest;
import com.azure.maps.search.models.SearchInsideGeometryRequest;
import com.azure.maps.search.models.SearchNearbyPointsOfInterestOptions;
import com.azure.maps.search.models.SearchPointOfInterestCategoryOptions;
import com.azure.maps.search.models.SearchPointOfInterestOptions;

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
        SearchClientBuilder builder = new SearchClientBuilder();
        builder.addPolicy(subscriptionKeyPolicy);
        builder.httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));
        SearchClient client = builder.buildClient();

        /* Stand-alone, one-shot operations */
        // Search address - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-address
        System.out.println("Search Address:");

        // simple
        MapsCommon.print(client.searchAddress("15127 NE 24th Street, Redmond, WA 98052"));

        // options
        MapsCommon.print(client.searchAddress(new SearchAddressOptions("1 Main Street")
                .coordinates(new LatLongPairAbbreviated()
                    .setLat(40.706270)
                    .setLon(-74.011454))
                .radiusInMeters(40000)
                .top(5)));

        // complete
        MapsCommon.print(client.searchAddressWithResponse(new SearchAddressOptions("1 Main Street")
                .coordinates(new LatLongPairAbbreviated()
                    .setLat(40.706270)
                    .setLon(-74.011454))
                .radiusInMeters(40000)
                .top(5), null).getStatusCode());

        // Search address reverse - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-address-reverse
        System.out.println("Search Address Reverse:");

        // simple
        MapsCommon.print(client.reverseSearchAddress(new LatLongPairAbbreviated().setLat(37.337).setLon(-121.89)));

        // options
        MapsCommon.print(client.reverseSearchAddress(new ReverseSearchAddressOptions(
                new LatLongPairAbbreviated().setLat(37.337).setLon(-121.89))
                .includeSpeedLimit(true)
                .entityType(GeographicEntityType.COUNTRY_SECONDARY_SUBDIVISION) // returns only city
                ));

        // complete
        MapsCommon.print(client.reverseSearchAddressWithResponse(new ReverseSearchAddressOptions(
            new LatLongPairAbbreviated().setLat(37.337).setLon(-121.89))
            .includeSpeedLimit(true)
            .entityType(GeographicEntityType.COUNTRY_SECONDARY_SUBDIVISION) // returns only city
            , null).getStatusCode());

        // Search address reverse cross street - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-address-reverse-cross-street
        System.out.println("Revere Search Cross Street Address:");

        // regular
        MapsCommon.print(client.reverseSearchCrossStreetAddress(
                new LatLongPairAbbreviated().setLat(37.337).setLon(-121.89), null, null, null, null, null));

        // complete
        MapsCommon.print(client.reverseSearchCrossStreetAddressWithResponse(
                new LatLongPairAbbreviated().setLat(37.337).setLon(-121.89), null, null, null, null, null, null)
                .getStatusCode());

        System.exit(0);

        //  Search address structured - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-address-structured
        System.out.println("Search Address Structured:");
        MapsCommon.print(client.searchStructuredAddress(null, "US", null, null,
            "15127", "NE 24th Street", null, "Redmond", null, null, null, "WA", "98052", null, null, null));

        // Search fuzzy - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-fuzzy
        System.out.println("Search Fuzzy:");
        MapsCommon.print(client.fuzzySearch("starbucks"));

        // with options
        SearchAddressResult results = client.fuzzySearch(new FuzzySearchOptions("1 Microsoft Way")
                .coordinates(new LatLongPairAbbreviated()
                    .setLat(40.706270)
                    .setLon(-74.011454))
                .top(5));
        MapsCommon.print(results);

        // with response
        Response<SearchAddressResult> response = client.fuzzySearchWithResponse(
                new FuzzySearchOptions("starbucks"), null);
        MapsCommon.print(response.getStatusCode());

        // Get polygon - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-polygon
        List<String> ids = results.getResults().stream()
                .filter(item -> item.getDataSources() != null && item.getDataSources().getGeometry() != null)
                .map(item -> item.getDataSources().getGeometry().getId())
                .collect(Collectors.toList());

        if (ids != null && !ids.isEmpty()) {
            System.out.println("Get Polygon:");
            MapsCommon.print(client.getPolygon(ids));
        }

        // Search POI - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-poi
        System.out.println("Search Points of Interest:");

        // short
        MapsCommon.print(client.searchPointOfInterest("pizza"));

        // options
        MapsCommon.print(client.searchPointOfInterest(new SearchPointOfInterestOptions("pizza")
                .coordinates(new LatLongPairAbbreviated().setLat(36.98844).setLon(-121.97483))
                .operatingHours(OperatingHoursRange.NEXT_SEVEN_DAYS)));

        // with response
        MapsCommon.print(client.searchPointOfInterestWithResponse(new SearchPointOfInterestOptions("pizza")
                .coordinates(new LatLongPairAbbreviated().setLat(36.98844).setLon(-121.97483))
                .operatingHours(OperatingHoursRange.NEXT_SEVEN_DAYS), null).getStatusCode());

        // Search nearby - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-nearby
        System.out.println("Search Nearby:");

        // simple
        MapsCommon.print(client.searchNearbyPointOfInterest(new LatLongPairAbbreviated()
                .setLat(40.706270)
                .setLon(-74.011454)));

        // options
        MapsCommon.print(client.searchNearbyPointOfInterest(new SearchNearbyPointsOfInterestOptions(
                new LatLongPairAbbreviated().setLat(40.706270).setLon(-74.011454))
                .countryFilter(Arrays.asList("US"))
                .top(10)));

        // response
        MapsCommon.print(client.searchNearbyPointOfInterestWithResponse(new SearchNearbyPointsOfInterestOptions(
                new LatLongPairAbbreviated().setLat(40.706270).setLon(-74.011454))
                .countryFilter(Arrays.asList("US"))
                .top(10), null).getStatusCode());

        // Search POI Category - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-poi-category
        System.out.println("Get Point of Interest Category:");

        // simple - search for restaurant
        MapsCommon.print(client.searchPointOfInterestCategory("pasta", Arrays.asList(7315)));

        // complete - search for italian restaurant in NYC
        MapsCommon.print(client.searchPointOfInterestCategory(new SearchPointOfInterestCategoryOptions("pizza")
                .coordinates(new LatLongPairAbbreviated().setLat(40.706270).setLon(-74.011454))
                .categoryFilter(Arrays.asList(7315))
                .top(3)));

        // with response
        MapsCommon.print(client.searchPointOfInterestCategoryWithResponse(new SearchPointOfInterestCategoryOptions("pizza")
                .coordinates(new LatLongPairAbbreviated().setLat(40.706270).setLon(-74.011454))
                .categoryFilter(Arrays.asList(7315))
                .top(3), null).getStatusCode());

        System.exit(0);

        // Get POI Category Tree - https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-poi-category-tree-preview
        // client.getSearchPoiCategoryTreePreviewWithResponse() offers a complete version including more parameters and
        // the underlying HttpResponse object.
        System.out.println("Get Search POI Category Tree:");
        MapsCommon.print(client.getPointOfInterestCategoryTree(null));

        // Post search along route - https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-along-route
        // client.postSearchAlongRouteWithResponse() offers a complete version including more parameters and
        // the underlying HttpResponse object.
        System.out.println("Search Along Route");
        SearchAlongRouteRequest searchAlongRouteRequestBody = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_along_route_request_body.json")),
                SearchAlongRouteRequest.class);

        MapsCommon.print(client.searchAlongRoute(
            "burger", 1000, searchAlongRouteRequestBody, null, null, null, null, null, null));

        // Search insider geometry - https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-along-route
        System.out.println("Search Inside Geometry");
        SearchInsideGeometryRequest searchInsideGeometryRequestBody = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_inside_geometry_request_body.json")),
                SearchInsideGeometryRequest.class);
        MapsCommon.print(client.searchInsideGeometry("Leland Avenue",
                searchInsideGeometryRequestBody, 2, null, null, null, null, null, null));

        /* Batch operations. */

        // Search address batch sync - https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-address-batch
        // This call posts addresses for search using the Synchronous Batch API.
        // All results will be available when the call returns. A maximum of 100 addresses can be searched this way.
        System.out.println("Search Address Batch Sync");
        BatchRequest contentJson = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_address_batch_request_body.json")),
                BatchRequest.class);
        MapsCommon.print(client.searchAddressBatchSync(contentJson));

        // Search address batch async - https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-address-batch
        // This call posts addresses for search using the Asynchronous Batch API.
        // SyncPoller will do the polling automatically and you can retrieve the result with getFinalResult()
        System.out.println("Search Address Batch Async");
        MapsCommon.print(client.beginSearchAddressBatch(contentJson).getFinalResult());

        // Search address reverse batch - https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-address-reverse-batch
        // This is also a batch API like searchAddressBatch(), so the same calling patterns apply.
        System.out.println("Reverse Search Address Batch Sync");
        contentJson = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_address_reverse_batch_request_body.json")),
                BatchRequest.class);
        ReverseSearchAddressBatchProcessResult br = client.reverseSearchAddressBatchSync(contentJson);
        MapsCommon.print(br.getBatchItems());

        System.out.println("Reverse Search Address Batch Async");
        MapsCommon.print(client.beginReverseSearchAddressBatch(contentJson).getFinalResult());

        // Post search address reverse batch - https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-fuzzy-batch
        // This is also a batch API like postSearchAddressBatch(), so the same calling patterns apply.
        System.out.println("Post Search Fuzzy Batch Sync");
        contentJson = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/search_fuzzy_batch_request_body.json")),
                BatchRequest.class);
        MapsCommon.print(client.fuzzySearchBatchSync(contentJson));

        System.out.println("Post Search Fuzzy Batch Async");
        MapsCommon.print(client.beginFuzzySearchBatch(contentJson).getFinalResult());
    }
}
