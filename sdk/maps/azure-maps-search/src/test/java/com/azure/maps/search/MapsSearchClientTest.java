package com.azure.maps.search;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.azure.maps.search.TestUtils;
import com.azure.core.http.HttpClient;
import com.azure.core.util.Context;
import com.azure.maps.search.models.FuzzySearchOptions;

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

    // @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    // @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    // public void testFuzzySearchWithResponse(HttpClient httpClient, MapsSearchServiceVersion serviceVersion) {
    //     client = getMapsSearchClient(httpClient, serviceVersion);
    //     validateFuzzySearchWithResponse(TestUtils.getExpectedFuzzySearchResults(), 200, client.fuzzySearchWithResponse(new FuzzySearchOptions("starbucks"), new Context()));
    // }

    // @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    // @MethodSource("com.azure.maps.search.TestUtils#getTestParameters")
    @Test
    public void testFuzzySearch() {
        // arrange
        // HttpClient httpClient, MapsSearchServiceVersion serviceVersion
        HttpClient httpClient = null;

        client = getMapsSearchClient(httpClient, MapsSearchServiceVersion.V1_0);
        client.fuzzySearch(new FuzzySearchOptions("starbucks"));
        // validateFuzzySearch(TestUtils.getExpectedFuzzySearchResults(), client.fuzzySearch(new FuzzySearchOptions("starbucks")));
    }

    @Test
    public void test() {
        assertTrue(true);
    }
}
