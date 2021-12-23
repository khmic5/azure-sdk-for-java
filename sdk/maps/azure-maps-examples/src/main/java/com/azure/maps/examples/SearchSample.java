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
import com.azure.maps.search.models.GeoJsonObject;
import com.azure.maps.search.models.GeoJsonLineString;
import com.azure.maps.search.SearchClient;
import com.azure.maps.search.SearchClientBuilder;
import com.azure.maps.search.models.BatchRequest;
import com.azure.maps.search.models.FuzzySearchOptions;
import com.azure.maps.search.models.GeographicEntityType;
import com.azure.maps.search.models.LatLong;
import com.azure.maps.search.models.OperatingHoursRange;
import com.azure.maps.search.models.ReverseSearchAddressBatchProcessResult;
import com.azure.maps.search.models.ReverseSearchAddressOptions;
import com.azure.maps.search.models.ReverseSearchAddressResult;
import com.azure.maps.search.models.ReverseSearchCrossStreetAddressOptions;
import com.azure.maps.search.models.SearchAddressOptions;
import com.azure.maps.search.models.SearchAddressResult;
import com.azure.maps.search.models.SearchAddressResultItem;
import com.azure.maps.search.models.SearchAlongRouteOptions;
import com.azure.maps.search.models.SearchInsideGeometryOptions;
import com.azure.maps.search.models.SearchNearbyPointsOfInterestOptions;
import com.azure.maps.search.models.SearchPointOfInterestCategoryOptions;
import com.azure.maps.search.models.SearchPointOfInterestOptions;
import com.azure.maps.search.models.SearchStructuredAddressOptions;
import com.azure.maps.search.models.StructuredAddress;

import reactor.core.publisher.Mono;

public class SearchSample {

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
        SearchClient client = builder.buildClient();

        /* Stand-alone, one-shot operations */
        // Search address -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-address
        System.out.println("Search Address:");

        // simple
        MapsCommon.print(client.searchAddress(
            new SearchAddressOptions("15127 NE 24th Street, Redmond, WA 98052")));

        // options
        MapsCommon.print(client.searchAddress(
            new SearchAddressOptions("1 Main Street")
                .setCoordinates(new LatLong(40.706270, -74.011454))
                .setRadiusInMeters(40000)
                .setTop(5)));

        // complete
        MapsCommon.print(client.searchAddressWithResponse(
            new SearchAddressOptions("1 Main Street")
                .setCoordinates(new LatLong(40.706270, -74.011454))
                .setRadiusInMeters(40000)
                .setTop(5), null).getStatusCode());

        // Search address reverse -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-address-reverse
        System.out.println("Search Address Reverse:");

        // simple
        MapsCommon.print(client.reverseSearchAddress(
            new ReverseSearchAddressOptions(new LatLong(37.337, -121.89))));

        MapsCommon.print(client.reverseSearchAddress(
            new ReverseSearchAddressOptions(new LatLong(37.337, -121.89))));

        // options
        MapsCommon.print(client.reverseSearchAddress(
            new ReverseSearchAddressOptions(new LatLong(37.337, -121.89))
                .setIncludeSpeedLimit(true)
                .setEntityType(GeographicEntityType.COUNTRY_SECONDARY_SUBDIVISION) // returns only city
        ));

        // complete
        MapsCommon.print(client.reverseSearchAddressWithResponse(
            new ReverseSearchAddressOptions(new LatLong(37.337, -121.89))
                .setIncludeSpeedLimit(true)
                .setEntityType(GeographicEntityType.COUNTRY_SECONDARY_SUBDIVISION) // returns only city
            , null).getStatusCode());

        // Search address reverse cross street -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-address-reverse-cross-street
        System.out.println("Revere Search Cross Street Address:");

        // options
        MapsCommon.print(client.reverseSearchCrossStreetAddress(
            new ReverseSearchCrossStreetAddressOptions(new LatLong(37.337, -121.89))));

        // options
        MapsCommon.print(client.reverseSearchCrossStreetAddress(
            new ReverseSearchCrossStreetAddressOptions(new LatLong(37.337, -121.89))
                .setTop(2)
                .setHeading(5)));

        // complete
        MapsCommon.print(client.reverseSearchCrossStreetAddressWithResponse(
            new ReverseSearchCrossStreetAddressOptions(new LatLong(37.337, -121.89))
                .setTop(2)
                .setHeading(5),
            null).getStatusCode());

        // Search address structured -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-address-structured
        System.out.println("Search Address Structured:");

        // simple
        MapsCommon.print(client.searchStructuredAddress(new StructuredAddress("US")
            .setPostalCode("98121")
            .setStreetNumber("15127")
            .setStreetName("NE 24th Street")
            .setMunicipality("Redmond")
            .setCountrySubdivision("WA"), null));

        // complete
        MapsCommon.print(client.searchStructuredAddressWithResponse(new StructuredAddress("US")
            .setPostalCode("98121")
            .setStreetNumber("15127")
            .setStreetName("NE 24th Street")
            .setMunicipality("Redmond")
            .setCountrySubdivision("WA"),
            new SearchStructuredAddressOptions()
                    .setTop(2)
                    .setRadiusInMeters(1000),
            null).getStatusCode());

        // Search fuzzy -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-fuzzy
        System.out.println("Search Fuzzy:");

        // simple
        MapsCommon.print(client.fuzzySearch(new FuzzySearchOptions("starbucks")));

        // with options
        SearchAddressResult results = client.fuzzySearch(
            new FuzzySearchOptions("1 Microsoft Way", new LatLong(40.706270, -74.011454))
                .setTop(5));
        MapsCommon.print(results);

        // with response
        Response<SearchAddressResult> response = client.fuzzySearchWithResponse(
            new FuzzySearchOptions("California")
                .setTop(5), null);
        MapsCommon.print(response.getStatusCode());

        // Get polygon -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-polygon
        List<String> ids = results.getResults().stream()
            .filter(item -> item.getDataSource() != null && item.getDataSource().getGeometry() != null)
            .map(item -> item.getDataSource().getGeometry().getId())
            .collect(Collectors.toList());

        if (ids != null && !ids.isEmpty()) {
            System.out.println("Get Polygon:");
            MapsCommon.print(client.getPolygons(ids).get(0));
            MapsCommon.print(client.getPolygonsWithResponse(ids, null).getValue().getClass());
        }

        // Search POI -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-poi
        System.out.println("Search Points of Interest:");

        // coordinates
        MapsCommon.print(client.searchPointOfInterest(
            new SearchPointOfInterestOptions("pizza", new LatLong(36.98844, -121.97483))));

        // options
        MapsCommon.print(client.searchPointOfInterest(
            new SearchPointOfInterestOptions("pizza", new LatLong(36.98844, -121.97483))
                .setTop(10)
                .setOperatingHours(OperatingHoursRange.NEXT_SEVEN_DAYS)));

        // with response
        MapsCommon.print(client.searchPointOfInterestWithResponse(
            new SearchPointOfInterestOptions("pizza", new LatLong(36.98844, -121.97483))
                .setTop(10)
                .setOperatingHours(OperatingHoursRange.NEXT_SEVEN_DAYS),
            null).getStatusCode());

        // Search nearby -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-nearby
        System.out.println("Search Nearby:");

        // options
        MapsCommon.print(client.searchNearbyPointOfInterest(
            new SearchNearbyPointsOfInterestOptions(new LatLong(40.706270, -74.011454))
                .setCountryFilter(Arrays.asList("US"))
                .setTop(10)));

        // response
        MapsCommon.print(client.searchNearbyPointOfInterestWithResponse(
            new SearchNearbyPointsOfInterestOptions(new LatLong(40.706270, -74.011454))
                .setCountryFilter(Arrays.asList("US"))
                .setTop(10),
            null).getStatusCode());

        // Search POI Category -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-poi-category
        System.out.println("Get Point of Interest Category:");

        // complete - search for italian restaurant in NYC
        MapsCommon.print(client.searchPointOfInterestCategory(
            new SearchPointOfInterestCategoryOptions("pasta", new LatLong(40.706270, -74.011454))
                .setCategoryFilter(Arrays.asList(7315))
                .setTop(3)));

        // with response
        MapsCommon.print(client.searchPointOfInterestCategoryWithResponse(
            new SearchPointOfInterestCategoryOptions("pasta", new LatLong(40.706270, -74.011454))
                .setCategoryFilter(Arrays.asList(7315))
                .setTop(3),
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
        System.out.println("Search Along Route");
        GeoJsonLineString route = MapsCommon.readJson(
            MapsCommon.readContent(MapsCommon.getResource("/search_along_route_request_body.json")),
            GeoJsonLineString.class);

        // simple
        MapsCommon.print(client.searchAlongRoute(new SearchAlongRouteOptions("burger", 1000, route)));

        // options
        MapsCommon.print(client.searchAlongRoute(
            new SearchAlongRouteOptions("burger", 1000, route)
                .setCategoryFilter(Arrays.asList(7315))
                .setTop(5)));

        // complete
        MapsCommon.print(client.searchAlongRouteWithResponse(
            new SearchAlongRouteOptions("burger", 1000, route)
                .setCategoryFilter(Arrays.asList(7315))
                .setTop(5),
            null).getStatusCode());

        // Search insider geometry -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/post-search-along-route
        System.out.println("Search Inside Geometry");
        GeoJsonObject geometry = MapsCommon.readJson(
            MapsCommon.readContent(MapsCommon.getResource("/search_inside_geometry_request_body.json")),
            GeoJsonObject.class);

        // simple
        MapsCommon.print(client.searchInsideGeometry(
            new SearchInsideGeometryOptions("Leland Avenue", geometry)));

        // options
        MapsCommon.print(client.searchInsideGeometry(
            new SearchInsideGeometryOptions("Leland Avenue", geometry)
                .setTop(5)));

        // complete
        MapsCommon.print(client.searchInsideGeometryWithResponse(
            new SearchInsideGeometryOptions("Leland Avenue", geometry)
                .setTop(5),
            null).getStatusCode());

        /* Batch operations. */

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
    }
}
