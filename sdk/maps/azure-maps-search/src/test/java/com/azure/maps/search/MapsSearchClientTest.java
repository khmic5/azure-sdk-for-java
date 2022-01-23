package com.azure.maps.search;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.azure.core.http.HttpClient;
import com.azure.maps.search.models.FuzzySearchOptions;
import com.azure.maps.search.models.LatLong;
import com.azure.maps.search.models.Polygon;
import com.azure.maps.search.models.ReverseSearchAddressOptions;
import com.azure.maps.search.models.ReverseSearchAddressResult;
import com.azure.maps.search.models.ReverseSearchCrossStreetAddressOptions;
import com.azure.maps.search.models.ReverseSearchCrossStreetAddressResult;
import com.azure.maps.search.models.SearchAddressOptions;
import com.azure.maps.search.models.SearchAddressResult;
import com.azure.maps.search.models.SearchNearbyPointsOfInterestOptions;
import com.azure.maps.search.models.SearchPointOfInterestCategoryOptions;
import com.azure.maps.search.models.SearchPointOfInterestOptions;
import com.azure.maps.search.models.StructuredAddress;
import com.nimbusds.jose.shaded.json.parser.ParseException;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
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
    public void testGetMultiPolygons(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException, ParseException, JSONException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        List<String> geometryIds = Arrays.asList("8bceafe8-3d98-4445-b29b-fd81d3e9adf5", "00005858-5800-1200-0000-0000773694ca");
        List<Polygon> actualResult = client.getPolygons(geometryIds);
        List<Polygon> expectedResult = TestUtils.getMultiPolygonsResults();
        validateGetPolygons(expectedResult, actualResult);
    }
    
    // Test fuzzy search

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testFuzzySearch(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        SearchAddressResult actualResult = client.fuzzySearch(new FuzzySearchOptions("starbucks"));
        SearchAddressResult expectedResult = TestUtils.getExpectedFuzzySearchResults();
        validateFuzzySearch(expectedResult, actualResult);
    }

    // Test search point of interest

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testSearchPointOfInterest(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        SearchAddressResult actualResult = client.searchPointOfInterest(new SearchPointOfInterestOptions("caviar lobster pasta", new LatLong(36.98844, -121.97483)));
        SearchAddressResult expectedResult = TestUtils.getExpectedSearchPointOfInterestResults();
        System.out.println("hi " + expectedResult.getResults().size());
        System.out.println("hello " + actualResult.getResults().size());
        validateSearchPointOfInterest(expectedResult, actualResult);
    }

    // Test search nearby point of interest
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testSearchNearbyPointOfInterest(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        SearchAddressResult actualResult = client.searchNearbyPointOfInterest(
            new SearchNearbyPointsOfInterestOptions(new LatLong(40.706270, -74.011454)));
        SearchAddressResult expectedResult = TestUtils.getExpectedSearchNearbyPointOfInterestResults();
        System.out.println("hi " + expectedResult.getResults().size());
        System.out.println("hello " + actualResult.getResults().size());
        validateSearchNearbyPointOfInterest(expectedResult, actualResult);
    }

    // Test search point of interest category
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testSearchPointOfInterestCategory(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        SearchAddressResult actualResult = client.searchPointOfInterestCategory(
            new SearchPointOfInterestCategoryOptions("atm", new LatLong(40.706270, -74.011454)));
        SearchAddressResult expectedResult = TestUtils.getExpectedSearchPointOfInterestCategoryResults();
        System.out.println("hi " + expectedResult.getResults().size());
        System.out.println("hello " + actualResult.getResults().size());
        validateSearchPointOfInterestCategory(expectedResult, actualResult);
    }

    // Test get point of interest category tree
    // @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    // @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    // public void testSearchPointOfInterestCategoryTree(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
    //     client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
    //     PointOfInterestCategoryTreeResult actualResult = client.getPointOfInterestCategoryTree(null);
    //     SearchAddressResult expectedResult = TestUtils.getExpectedSearchPointOfInterestCategoryTreeResults();
    //     System.out.println("hi " + expectedResult.getResults().size());
    //     System.out.println("hello " + actualResult.getResults().size());
    //     validateSearchPointOfInterestCategoryTree(expectedResult, actualResult);
    // }

    // Test search address
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testSearchAddress(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        SearchAddressResult actualResult = client.searchAddress(new SearchAddressOptions("NE 24th Street, Redmond, WA 98052"));
        SearchAddressResult expectedResult = TestUtils.getExpectedSearchAddressResults();
        System.out.println("hi " + expectedResult.getResults().size());
        System.out.println("hello " + actualResult.getResults().size());
        validateSearchAddress(expectedResult, actualResult);
    }

    // Test reverse search address
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testReverseSearchAddress(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        ReverseSearchAddressResult actualResult = client.reverseSearchAddress(
            new ReverseSearchAddressOptions(new LatLong(37.337, -121.89)));
        ReverseSearchAddressResult expectedResult = TestUtils.getExpectedReverseSearchAddressResults();
        System.out.println("hi " + expectedResult.getAddresses().size());
        System.out.println("hello " + actualResult.getAddresses().size());
        validateReverseSearchAddress(expectedResult, actualResult);
    }

    // Test reverse search cross street address
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testReverseSearchCrossStreetAddress(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        ReverseSearchCrossStreetAddressResult actualResult = client.reverseSearchCrossStreetAddress(
            new ReverseSearchCrossStreetAddressOptions(new LatLong(37.337, -121.89)));
        ReverseSearchCrossStreetAddressResult expectedResult = TestUtils.getExpectedReverseSearchCrossStreetAddressResults();
        System.out.println("hi " + expectedResult.getAddresses().size());
        System.out.println("hello " + actualResult.getAddresses().size());
        validateReverseSearchCrossStreetAddress(expectedResult, actualResult);
    }

    // Test search structured address
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    public void testSearchStructuredAddress(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        SearchAddressResult actualResult = client.searchStructuredAddress(new StructuredAddress("US"), null);
        SearchAddressResult expectedResult = TestUtils.getExpectedSearchStructuredAddress();
        System.out.println("hi " + expectedResult.getResults().size());
        System.out.println("hello " + actualResult.getResults().size());
        validateSearchStructuredAddress(expectedResult, actualResult);
    }

    // Test search inside geometry
    // @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    // @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    // public void testSearchInsideGeometry(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) throws IOException {
    //     client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
    //     SearchAddressResult actualResult = client.searchInsideGeometry(
    //         new SearchInsideGeometryOptions("Leland Avenue", polygon));
    //     SearchAddressResult expectedResult = TestUtils.getExpectedSearchStructuredAddress();
    //     System.out.println("hi " + expectedResult.getResults().size());
    //     System.out.println("hello " + actualResult.getResults().size());
    //     validateSearchStructuredAddress(expectedResult, actualResult);
    // }

    // Test search along route

    // Test begin fuzzy search batch

    // Test begin get fuzzy search batch

    // Test begin search address batch

    // Test begin get search address batch

    // Test begin reverse search address batch

    // Test begin get reverse search address batch



    @Test
    public void test() {
        String s = "hi";
        assertTrue(true);
    }
}

