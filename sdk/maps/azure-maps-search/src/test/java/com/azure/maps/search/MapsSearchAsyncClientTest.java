package com.azure.maps.search;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.azure.core.http.HttpClient;
import com.azure.core.models.GeoLineString;
import com.azure.core.models.GeoObject;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.maps.search.models.BatchReverseSearchResult;
import com.azure.maps.search.models.BatchSearchResult;
import com.azure.maps.search.models.FuzzySearchOptions;
import com.azure.maps.search.models.LatLong;
import com.azure.maps.search.models.ReverseSearchAddressOptions;
import com.azure.maps.search.models.ReverseSearchCrossStreetAddressOptions;
import com.azure.maps.search.models.SearchAddressOptions;
import com.azure.maps.search.models.SearchAlongRouteOptions;
import com.azure.maps.search.models.SearchInsideGeometryOptions;
import com.azure.maps.search.models.SearchNearbyPointsOfInterestOptions;
import com.azure.maps.search.models.SearchPointOfInterestCategoryOptions;
import com.azure.maps.search.models.SearchPointOfInterestOptions;
import com.azure.maps.search.models.SearchStructuredAddressOptions;
import com.azure.maps.search.models.StructuredAddress;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import reactor.test.StepVerifier;

public class MapsSearchAsyncClientTest extends MapsSearchClientTestBase {
    private MapsSearchAsyncClient client;
    private static final String DISPLAY_NAME_WITH_ARGUMENTS = "{displayName} with [{arguments}]";

    @BeforeAll
    static void beforeAll() {
        StepVerifier.setDefaultTimeout(Duration.ofSeconds(30));
    }

    @AfterAll
    static void afterAll() {
        StepVerifier.resetDefaultTimeout();
    }

    private MapsSearchAsyncClient getMapsSearchAsyncClient(HttpClient httpClient,
        MapsSearchServiceVersion serviceVersion) {
        return getMapsSearchAsyncClientBuilder(httpClient, serviceVersion).buildAsyncClient();
    }

    // Test async get polygons

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncGetMultiPolygons(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        List<String> geometryIds = Arrays.asList("8bceafe8-3d98-4445-b29b-fd81d3e9adf5", "00005858-5800-1200-0000-0000773694ca");
        StepVerifier.create(client.getPolygons(geometryIds)).assertNext(actualResults -> 
        {
            try {
                validateGetPolygons(TestUtils.getMultiPolygonsResults(), actualResults);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).verifyComplete();
    }

    // Test async get polygons with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncGetPolygonsWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        List<String> geometryIds = Arrays.asList("8bceafe8-3d98-4445-b29b-fd81d3e9adf5", "00005858-5800-1200-0000-0000773694ca");
        StepVerifier.create(client.getPolygonsWithResponse(geometryIds, Context.NONE))
                .assertNext(response ->
                {
                    try {
                        validateGetPolygonsWithResponse(TestUtils.getMultiPolygonsResults(), 200, response);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                })
                .verifyComplete();
    }

    // Test async fuzzy search

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncFuzzySearch(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.fuzzySearch(new FuzzySearchOptions("starbucks"))).assertNext(actualResults -> 
        {
            try {
                validateFuzzySearch(TestUtils.getExpectedFuzzySearchResults(), actualResults);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).verifyComplete();
    }

    // Test fuzzy search with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncFuzzySearchWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.fuzzySearchWithResponse(new FuzzySearchOptions("starbucks"), Context.NONE))
                .assertNext(response ->
                {
                    try {
                        validateFuzzySearchWithResponse(TestUtils.getExpectedFuzzySearchResults(), 200, response);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                })
                .verifyComplete();
    }

    // Test async search point of interest

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncSearchPointOfInterest(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.searchPointOfInterest(new SearchPointOfInterestOptions("caviar lobster pasta", new LatLong(36.98844, -121.97483)))).assertNext(actualResults -> 
        {
            try {
                validateSearchPointOfInterest(TestUtils.getExpectedSearchPointOfInterestResults(), actualResults);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).verifyComplete();
    }

    // Test async search point of interest with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncSearchPointOfInterestWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.searchPointOfInterestWithResponse(new SearchPointOfInterestOptions("caviar lobster pasta", new LatLong(36.98844, -121.97483)), Context.NONE))
                .assertNext(response ->
                {
                    try {
                        validateSearchPointOfInterestWithResponse(TestUtils.getExpectedSearchPointOfInterestResults(), 200, response);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                })
                .verifyComplete();
    }

    // Test async search nearby point of interest

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncSearchNearbyPointOfInterest(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.searchNearbyPointOfInterest(
            new SearchNearbyPointsOfInterestOptions(new LatLong(40.706270, -74.011454)))).assertNext(actualResults -> 
        {
            try {
                validateSearchNearbyPointOfInterest(TestUtils.getExpectedSearchNearbyPointOfInterestResults(), actualResults);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).verifyComplete();
    }

    // Test async search nearby point of interest with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncSearchNearbyPointOfInterestWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.searchNearbyPointOfInterestWithResponse(new SearchNearbyPointsOfInterestOptions(new LatLong(40.706270, -74.011454)), Context.NONE))
                .assertNext(response ->
                {
                    try {
                        validateSearchNearbyPointOfInterestWithResponse(TestUtils.getExpectedSearchNearbyPointOfInterestResults(), 200, response);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                })
                .verifyComplete();
    }

    // Test async search point of interest category

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncSearchPointOfInterestCategory(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.searchPointOfInterestCategory(
            new SearchPointOfInterestCategoryOptions("atm", new LatLong(40.706270, -74.011454)))).assertNext(actualResults -> 
        {
            try {
                validateSearchPointOfInterestCategory(TestUtils.getExpectedSearchPointOfInterestCategoryResults(), actualResults);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).verifyComplete();
    }

    // Test async search point of interest category with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncSearchPointOfInterestCategoryWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.searchPointOfInterestCategoryWithResponse(
            new SearchPointOfInterestCategoryOptions("atm", new LatLong(40.706270, -74.011454)), Context.NONE))
                .assertNext(response ->
                {
                    try {
                        validateSearchPointOfInterestCategoryWithResponse(TestUtils.getExpectedSearchPointOfInterestCategoryResults(), 200, response);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                })
                .verifyComplete();
    }

    // Test async get point of interest category tree

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncSearchPointOfInterestCategoryTree(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.getPointOfInterestCategoryTree(null)).assertNext(actualResults -> 
        {
            try {
                validateSearchPointOfInterestCategoryTree(TestUtils.getExpectedSearchPointOfInterestCategoryTreeResults(), actualResults);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).verifyComplete();
    }

    // Test async get point of interest category tree with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncSearchPointOfInterestCategoryTreeWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.getPointOfInterestCategoryTreeWithResponse("pizza", Context.NONE))
                .assertNext(response ->
                {
                    try {
                        validateSearchPointOfInterestCategoryTreeWithResponse(TestUtils.getExpectedSearchPointOfInterestCategoryTreeResults(), 200, response);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                })
                .verifyComplete();
    }

    // Test async search address

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncSearchAddress(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.searchAddress(new SearchAddressOptions("NE 24th Street, Redmond, WA 98052"))).assertNext(actualResults -> 
        {
            try {
                validateSearchAddress(TestUtils.getExpectedSearchAddressResults(), actualResults);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).verifyComplete();
    }

    // Test async search address with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncSearchAddressWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.searchAddressWithResponse(new SearchAddressOptions("NE 24th Street, Redmond, WA 98052"), Context.NONE))
                .assertNext(response ->
                {
                    try {
                        validateSearchAddressWithResponse(TestUtils.getExpectedSearchAddressResults(), 200, response);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                })
                .verifyComplete();
    }

    // Test async reverse search address

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncReverseSearchAddress(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.reverseSearchAddress(
            new ReverseSearchAddressOptions(new LatLong(37.337, -121.89)))).assertNext(actualResults -> 
        {
            try {
                validateReverseSearchAddress(TestUtils.getExpectedReverseSearchAddressResults(), actualResults);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).verifyComplete();
    }

    // Test async reverse search address with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncReverseSearchAddressWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.reverseSearchAddressWithResponse(
            new ReverseSearchAddressOptions(new LatLong(37.337, -121.89)), Context.NONE))
                .assertNext(response ->
                {
                    try {
                        validateReverseSearchAddressWithResponse(TestUtils.getExpectedReverseSearchAddressResults(), 200, response);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                })
                .verifyComplete();
    }

    // Test async reverse search cross street address

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncReverseSearchCrossStreetAddress(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.reverseSearchCrossStreetAddress(
            new ReverseSearchCrossStreetAddressOptions(new LatLong(37.337, -121.89)))).assertNext(actualResults -> 
        {
            try {
                validateReverseSearchCrossStreetAddress(TestUtils.getExpectedReverseSearchCrossStreetAddressResults(), actualResults);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).verifyComplete();
    }

    // Test async reverse search cross street address with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncReverseSearchCrossStreetAddressWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.reverseSearchCrossStreetAddressWithResponse(
            new ReverseSearchCrossStreetAddressOptions(new LatLong(37.337, -121.89)), Context.NONE))
                .assertNext(response ->
                {
                    try {
                        validateReverseSearchCrossStreetAddressWithResponse(TestUtils.getExpectedReverseSearchCrossStreetAddressResults(), 200, response);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                })
                .verifyComplete();
    }

    // Test async search structured address

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncSearchStructuredAddress(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.searchStructuredAddress(new StructuredAddress("US"), null)).assertNext(actualResults -> 
        {
            try {
                validateSearchStructuredAddress(TestUtils.getExpectedSearchStructuredAddress(), actualResults);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).verifyComplete();
    }

    // Test async search structured address with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncSearchStructuredAddressWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.searchStructuredAddressWithResponse(
            new StructuredAddress("US"),
            new SearchStructuredAddressOptions(), null))
                .assertNext(response ->
                {
                    try {
                        validateSearchStructuredAddressWithResponse(TestUtils.getExpectedSearchStructuredAddress(), 200, response);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                })
                .verifyComplete();
    }

    // Test async search inside geometry

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncSearchInsideGeometry(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        File file = new File("src/main/resources/geoobjectone.json");
        GeoObject obj = TestUtils.getGeoObject(file);
        StepVerifier.create(client.searchInsideGeometry(
            new SearchInsideGeometryOptions("pizza", obj))).assertNext(actualResults -> 
        {
            try {
                validateSearchInsideGeometry(TestUtils.getExpectedSearchInsideGeometry(), actualResults);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).verifyComplete();
    }

    // Test async search inside geometry with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncSearchInsideGeometryWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        File file = new File("src/main/resources/geoobjectone.json");
        GeoObject obj = TestUtils.getGeoObject(file);
        StepVerifier.create(client.searchInsideGeometryWithResponse(
            new SearchInsideGeometryOptions("pizza", obj), null))
                .assertNext(response ->
                {
                    try {
                        validateSearchInsideGeometryWithResponse(TestUtils.getExpectedSearchInsideGeometry(), 200, response);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                })
                .verifyComplete();
    }

    // Test async search along route

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncSearchAlongRoute(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        File file = new File("src/main/resources/geolinestringone.json");
        GeoLineString obj = TestUtils.getGeoLineString(file);
        StepVerifier.create(client.searchAlongRoute(new SearchAlongRouteOptions("burger", 1000, obj))).assertNext(actualResults -> 
        {
            try {
                validateSearchInsideGeometry(TestUtils.getExpectedSearchInsideGeometry(), actualResults);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).verifyComplete();
    } 

    // Test async search along route with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncSearchAlongRouteWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        File file = new File("src/main/resources/geolinestringone.json");
        GeoLineString obj = TestUtils.getGeoLineString(file);
        StepVerifier.create(client.searchAlongRouteWithResponse(
            new SearchAlongRouteOptions("burger", 1000, obj), null))
                .assertNext(response ->
                {
                    try {
                        validateSearchInsideGeometryWithResponse(TestUtils.getExpectedSearchAddressResults(), 200, response);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                })
                .verifyComplete();
    }

    // Test async begin fuzzy search batch

     @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
     @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
     public void testAsyncBeginFuzzySearchBatch(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        List<FuzzySearchOptions> fuzzyOptionsList = new ArrayList<>();
        fuzzyOptionsList.add(new FuzzySearchOptions("atm", new LatLong(47.639769, -122.128362))
             .setRadiusInMeters(5000).setTop(5));
        fuzzyOptionsList.add(new FuzzySearchOptions("Statue of Liberty").setTop(2));
        fuzzyOptionsList.add(new FuzzySearchOptions("Starbucks", new LatLong(47.639769, -122.128362))
             .setRadiusInMeters(5000));
        PollerFlux<BatchSearchResult, BatchSearchResult> pollerFlux = client.beginFuzzySearchBatch(fuzzyOptionsList);
        SyncPoller syncPoller = setPollInterval(pollerFlux.getSyncPoller());
        syncPoller.waitForCompletion();
        BatchSearchResult actualResult =  (BatchSearchResult) syncPoller.getFinalResult();
        BatchSearchResult expectedResult = TestUtils.getExpectedBeginFuzzySearchBatch();
        validateBeginFuzzySearchBatch(expectedResult, actualResult);
     }

    // Test async begin search address batch

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncBeginSearchAddressBatch(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        List<SearchAddressOptions> searchAddressOptionsList = new ArrayList<>();
        searchAddressOptionsList.add(new SearchAddressOptions("400 Broad St, Seattle, WA 98109").setTop(3));
        searchAddressOptionsList.add(new SearchAddressOptions("One, Microsoft Way, Redmond, WA 98052").setTop(3));
        searchAddressOptionsList.add(new SearchAddressOptions("350 5th Ave, New York, NY 10118").setTop(3));
        searchAddressOptionsList.add(new SearchAddressOptions("1 Main Street"));
        PollerFlux<BatchSearchResult, BatchSearchResult> pollerFlux = client.beginSearchAddressBatch(searchAddressOptionsList);
        SyncPoller syncPoller = setPollInterval(pollerFlux.getSyncPoller());
        syncPoller.waitForCompletion();
        BatchSearchResult actualResult = (BatchSearchResult) syncPoller.getFinalResult();
        BatchSearchResult expectedResult = TestUtils.getExpectedBeginSearchAddressBatch();
        validateBeginSearchAddressBatch(expectedResult, actualResult);
    }

    // Test async begin reverse search address batch
    
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testAsyncBeginReverSearchAddressBatch(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchAsyncClient(httpClient, serviceVersion);
        List<ReverseSearchAddressOptions> reverseOptionsList = new ArrayList<>();
        reverseOptionsList.add(new ReverseSearchAddressOptions(new LatLong(48.858561, 2.294911)));
        reverseOptionsList.add(new ReverseSearchAddressOptions(new LatLong(47.639765, -122.127896)).setRadiusInMeters(5000));
        reverseOptionsList.add(new ReverseSearchAddressOptions(new LatLong(47.621028, -122.348170)));
        PollerFlux<BatchReverseSearchResult, BatchReverseSearchResult> pollerFlux = client.beginReverseSearchAddressBatch(reverseOptionsList);
        SyncPoller syncPoller = setPollInterval(pollerFlux.getSyncPoller());
        syncPoller.waitForCompletion();
        BatchReverseSearchResult actualResult = (BatchReverseSearchResult) syncPoller.getFinalResult();
        BatchReverseSearchResult expectedResult = TestUtils.getExpectedReverseSearchAddressBatch();
        validateBeginReverseSearchAddressBatch(expectedResult, actualResult);
    }
}