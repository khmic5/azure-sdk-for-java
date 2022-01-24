package com.azure.maps.search;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.azure.core.http.HttpClient;
import com.azure.core.models.GeoLineString;
import com.azure.core.models.GeoObject;
import com.azure.core.util.Context;
import com.azure.maps.search.models.BatchReverseSearchResult;
import com.azure.maps.search.models.BatchSearchResult;
import com.azure.maps.search.models.FuzzySearchOptions;
import com.azure.maps.search.models.LatLong;
import com.azure.maps.search.models.PointOfInterestCategoryTreeResult;
import com.azure.maps.search.models.Polygon;
import com.azure.maps.search.models.ReverseSearchAddressOptions;
import com.azure.maps.search.models.ReverseSearchAddressResult;
import com.azure.maps.search.models.ReverseSearchCrossStreetAddressOptions;
import com.azure.maps.search.models.ReverseSearchCrossStreetAddressResult;
import com.azure.maps.search.models.SearchAddressOptions;
import com.azure.maps.search.models.SearchAddressResult;
import com.azure.maps.search.models.SearchAlongRouteOptions;
import com.azure.maps.search.models.SearchInsideGeometryOptions;
import com.azure.maps.search.models.SearchNearbyPointsOfInterestOptions;
import com.azure.maps.search.models.SearchPointOfInterestCategoryOptions;
import com.azure.maps.search.models.SearchPointOfInterestOptions;
import com.azure.maps.search.models.SearchStructuredAddressOptions;
import com.azure.maps.search.models.StructuredAddress;
import com.nimbusds.jose.shaded.json.parser.ParseException;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MapsSearchClientTest extends MapsSearchClientTestBase {

    private MapsSearchClient client;
    private static final String DISPLAY_NAME_WITH_ARGUMENTS = "{displayName} with [{arguments}]";

    private MapsSearchClient getMapsSearchClient(HttpClient httpClient,
        MapsSearchServiceVersion serviceVersion) {
        return getMapsSearchAsyncClientBuilder(httpClient, serviceVersion).buildClient();
    }

    // Test get polygons
    
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testGetMultiPolygons(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException, ParseException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        List<String> geometryIds = Arrays.asList("8bceafe8-3d98-4445-b29b-fd81d3e9adf5", "00005858-5800-1200-0000-0000773694ca");
        List<Polygon> actualResult = client.getPolygons(geometryIds);
        List<Polygon> expectedResult = TestUtils.getMultiPolygonsResults();
        validateGetPolygons(expectedResult, actualResult);
    }

    // Test get polygons with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testGetPolygonsWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, serviceVersion);
        List<String> geometryIds = Arrays.asList("8bceafe8-3d98-4445-b29b-fd81d3e9adf5", "00005858-5800-1200-0000-0000773694ca");
        validateGetPolygonsWithResponse(TestUtils.getMultiPolygonsResults(), 200, client.getPolygonsWithResponse(geometryIds, Context.NONE));
    }
    
    // Test fuzzy search

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testFuzzySearch(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, serviceVersion);
        SearchAddressResult actualResult = client.fuzzySearch(new FuzzySearchOptions("starbucks"));
        SearchAddressResult expectedResult = TestUtils.getExpectedFuzzySearchResults();
        validateFuzzySearch(expectedResult, actualResult);
    }

    // Test fuzzy search with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testFuzzySearchWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, serviceVersion);
        validateFuzzySearchWithResponse(TestUtils.getExpectedFuzzySearchResults(), 200, client.fuzzySearchWithResponse(new FuzzySearchOptions("starbucks"), Context.NONE));
    }

    // Test search point of interest

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testSearchPointOfInterest(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        SearchAddressResult actualResult = client.searchPointOfInterest(new SearchPointOfInterestOptions("caviar lobster pasta", new LatLong(36.98844, -121.97483)));
        SearchAddressResult expectedResult = TestUtils.getExpectedSearchPointOfInterestResults();
        validateSearchPointOfInterest(expectedResult, actualResult);
    }

    // Test search point of interest with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testSearchPointOfInterestWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, serviceVersion);
        validateSearchPointOfInterestWithResponse(TestUtils.getExpectedSearchPointOfInterestResults(), 200, client.searchPointOfInterestWithResponse(new SearchPointOfInterestOptions("caviar lobster pasta", new LatLong(36.98844, -121.97483)), Context.NONE));
    }

    // Test search nearby point of interest

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testSearchNearbyPointOfInterest(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        SearchAddressResult actualResult = client.searchNearbyPointOfInterest(
            new SearchNearbyPointsOfInterestOptions(new LatLong(40.706270, -74.011454)));
        SearchAddressResult expectedResult = TestUtils.getExpectedSearchNearbyPointOfInterestResults();
        validateSearchNearbyPointOfInterest(expectedResult, actualResult);
    }

    // Test search nearby point of interest with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testSearchNearbyPointOfInterestWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, serviceVersion);
        validateSearchNearbyPointOfInterestWithResponse(TestUtils.getExpectedSearchNearbyPointOfInterestResults(), 200, client.searchNearbyPointOfInterestWithResponse(new SearchNearbyPointsOfInterestOptions(new LatLong(40.706270, -74.011454)), Context.NONE));
    }

    // Test search point of interest category

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testSearchPointOfInterestCategory(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        SearchAddressResult actualResult = client.searchPointOfInterestCategory(
            new SearchPointOfInterestCategoryOptions("atm", new LatLong(40.706270, -74.011454)));
        SearchAddressResult expectedResult = TestUtils.getExpectedSearchPointOfInterestCategoryResults();
        validateSearchPointOfInterestCategory(expectedResult, actualResult);
    }

    // Test search point of interest category with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testSearchPointOfInterestCategoryWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        System.out.println("1");
        client = getMapsSearchClient(httpClient, serviceVersion);
        System.out.println("2");
        validateSearchPointOfInterestCategoryWithResponse(TestUtils.getExpectedSearchPointOfInterestCategoryResults(), 200, client.searchPointOfInterestCategoryWithResponse(
            new SearchPointOfInterestCategoryOptions("atm", new LatLong(40.706270, -74.011454)), Context.NONE));
    }


    // Test get point of interest category tree

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testSearchPointOfInterestCategoryTree(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        PointOfInterestCategoryTreeResult actualResult = client.getPointOfInterestCategoryTree(null);
        PointOfInterestCategoryTreeResult expectedResult = TestUtils.getExpectedSearchPointOfInterestCategoryTreeResults();
        validateSearchPointOfInterestCategoryTree(expectedResult, actualResult);
    }

    // Test get point of interest category tree with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testSearchPointOfInterestCategoryTreeWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, serviceVersion);
        validateSearchPointOfInterestCategoryTreeWithResponse(TestUtils.getExpectedSearchPointOfInterestCategoryTreeResults(), 200, client.getPointOfInterestCategoryTreeWithResponse(null, Context.NONE));
    }

    // Test search address

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testSearchAddress(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        SearchAddressResult actualResult = client.searchAddress(new SearchAddressOptions("NE 24th Street, Redmond, WA 98052"));
        SearchAddressResult expectedResult = TestUtils.getExpectedSearchAddressResults();
        validateSearchAddress(expectedResult, actualResult);
    }

    // Test search address with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testSearchAddressWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, serviceVersion);
        validateSearchAddressWithResponse(TestUtils.getExpectedSearchAddressResults(), 200, client.searchAddressWithResponse(new SearchAddressOptions("NE 24th Street, Redmond, WA 98052"), Context.NONE));
    }

    // Test reverse search address

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testReverseSearchAddress(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        ReverseSearchAddressResult actualResult = client.reverseSearchAddress(
            new ReverseSearchAddressOptions(new LatLong(37.337, -121.89)));
        ReverseSearchAddressResult expectedResult = TestUtils.getExpectedReverseSearchAddressResults();
        validateReverseSearchAddress(expectedResult, actualResult);
    }

    // Test reverse search address with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testReverseSearchAddressWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, serviceVersion);
        validateReverseSearchAddressWithResponse(TestUtils.getExpectedReverseSearchAddressResults(), 200, client.reverseSearchAddressWithResponse(
            new ReverseSearchAddressOptions(new LatLong(37.337, -121.89)), Context.NONE));
    }

    // Test reverse search cross street address

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testReverseSearchCrossStreetAddress(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        ReverseSearchCrossStreetAddressResult actualResult = client.reverseSearchCrossStreetAddress(
            new ReverseSearchCrossStreetAddressOptions(new LatLong(37.337, -121.89)));
        ReverseSearchCrossStreetAddressResult expectedResult = TestUtils.getExpectedReverseSearchCrossStreetAddressResults();
        validateReverseSearchCrossStreetAddress(expectedResult, actualResult);
    }

    // Test reverse search cross street address with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testReverseSearchCrossStreetAddressWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, serviceVersion);
        validateReverseSearchCrossStreetAddressWithResponse(TestUtils.getExpectedReverseSearchCrossStreetAddressResults(), 200, client.reverseSearchCrossStreetAddressWithResponse(
            new ReverseSearchCrossStreetAddressOptions(new LatLong(37.337, -121.89)), Context.NONE));
    }

    // Test search structured address

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testSearchStructuredAddress(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        SearchAddressResult actualResult = client.searchStructuredAddress(new StructuredAddress("US"), null);
        SearchAddressResult expectedResult = TestUtils.getExpectedSearchStructuredAddress();
        validateSearchStructuredAddress(expectedResult, actualResult);
    }

    // Test search structured address with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testSearchStructuredAddressWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, serviceVersion);
        validateSearchStructuredAddressWithResponse(
            TestUtils.getExpectedSearchStructuredAddress(), 
            200, 
        client.searchStructuredAddressWithResponse(
            new StructuredAddress("US"),
            new SearchStructuredAddressOptions(), null));
    }

    // Test search inside geometry

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testSearchInsideGeometry(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        File file = new File("src/main/resources/geoobjectone.json");
        GeoObject obj = TestUtils.getGeoObject(file);
        SearchAddressResult actualResult = client.searchInsideGeometry(
            new SearchInsideGeometryOptions("pizza", obj));
        SearchAddressResult expectedResult = TestUtils.getExpectedSearchInsideGeometry();
        validateSearchInsideGeometry(expectedResult, actualResult);
    }

    // Test search inside geometry with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testSearchInsideGeometryWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, serviceVersion);
        File file = new File("src/main/resources/geoobjectone.json");
        GeoObject obj = TestUtils.getGeoObject(file);
        validateSearchInsideGeometryWithResponse(TestUtils.getExpectedSearchInsideGeometry(), 200, client.searchInsideGeometryWithResponse(
            new SearchInsideGeometryOptions("pizza", obj), null));
    }

    // Test search along route

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testSearchAlongRoute(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        File file = new File("src/main/resources/geolinestringone.json");
        GeoLineString obj = TestUtils.getGeoLineString(file);
        SearchAddressResult actualResult = client.searchAlongRoute(new SearchAlongRouteOptions("burger", 1000, obj));
        SearchAddressResult expectedResult = TestUtils.getExpectedSearchAlongRoute();
        validateSearchInsideGeometry(expectedResult, actualResult);
    }

    // Test search along route with response

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testSearchAlongRouteWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, serviceVersion);
        File file = new File("src/main/resources/geolinestringone.json");
        GeoLineString obj = TestUtils.getGeoLineString(file);
        validateSearchInsideGeometryWithResponse(TestUtils.getExpectedSearchAddressResults(), 200, client.searchAlongRouteWithResponse(
            new SearchAlongRouteOptions("burger", 1000, obj), null));
    }

    // Test begin fuzzy search batch

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testBeginFuzzySearchBatch(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        List<FuzzySearchOptions> fuzzyOptionsList = new ArrayList<>();
        fuzzyOptionsList.add(new FuzzySearchOptions("atm", new LatLong(47.639769, -122.128362))
            .setRadiusInMeters(5000).setTop(5));
        fuzzyOptionsList.add(new FuzzySearchOptions("Statue of Liberty").setTop(2));
        fuzzyOptionsList.add(new FuzzySearchOptions("Starbucks", new LatLong(47.639769, -122.128362))
            .setRadiusInMeters(5000));
        BatchSearchResult actualResult = client.beginFuzzySearchBatch(fuzzyOptionsList).getFinalResult();
        BatchSearchResult expectedResult = TestUtils.getExpectedBeginFuzzySearchBatch();
        validateBeginFuzzySearchBatch(expectedResult, actualResult);
    }

    // Test begin search address batch

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testBeginSearchAddressBatch(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        List<SearchAddressOptions> searchAddressOptionsList = new ArrayList<>();
        searchAddressOptionsList.add(new SearchAddressOptions("400 Broad St, Seattle, WA 98109").setTop(3));
        searchAddressOptionsList.add(new SearchAddressOptions("One, Microsoft Way, Redmond, WA 98052").setTop(3));
        searchAddressOptionsList.add(new SearchAddressOptions("350 5th Ave, New York, NY 10118").setTop(3));
        searchAddressOptionsList.add(new SearchAddressOptions("1 Main Street"));
        BatchSearchResult actualResult = client.beginSearchAddressBatch(searchAddressOptionsList).getFinalResult();
        BatchSearchResult expectedResult = TestUtils.getExpectedBeginSearchAddressBatch();
        validateBeginSearchAddressBatch(expectedResult, actualResult);
    }

    // Test begin reverse search address batch
    
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testBeginReverSearchAddressBatch(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        List<ReverseSearchAddressOptions> reverseOptionsList = new ArrayList<>();
        reverseOptionsList.add(new ReverseSearchAddressOptions(new LatLong(48.858561, 2.294911)));
        reverseOptionsList.add(new ReverseSearchAddressOptions(new LatLong(47.639765, -122.127896)).setRadiusInMeters(5000));
        reverseOptionsList.add(new ReverseSearchAddressOptions(new LatLong(47.621028, -122.348170)));
        BatchReverseSearchResult actualResult = client.beginReverseSearchAddressBatch(reverseOptionsList).getFinalResult();
        BatchReverseSearchResult expectedResult = TestUtils.getExpectedReverseSearchAddressBatch();
        validateBeginReverseSearchAddressBatch(expectedResult, actualResult);
    }
}