package com.azure.maps.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.azure.core.test.TestBase;
import com.azure.maps.search.MapsSearchClientTestBase;
import com.azure.maps.search.implementation.helpers.Utility;
import com.azure.maps.search.implementation.models.SearchAddressResultPrivate;
import com.azure.maps.search.models.SearchAddressResult;

import org.junit.jupiter.params.provider.Arguments;

public class TestUtils {

    static final String FAKE_API_KEY = "1234567890";

    /**
     * Helper method to get the expected Fuzzy Search Results
     *
     * @return A {@link SearchAddressResult}.
     */
    static SearchAddressResult getExpectedFuzzySearchResults() {
        // SearchAddressResultPrivate privateResult = new SearchAddressResultPrivate("searchaddressresult.json"); // read from json new SearchAddressResultPrivate();
        // Utility.toSearchAddressResult(privateResult);
        
        return null;
        // final TextDocumentBatchStatistics textDocumentBatchStatistics = new TextDocumentBatchStatistics(3, 3, 0, 3);
        // final List<DetectLanguageResult> detectLanguageResultList = asList(
        //     new DetectLanguageResult("0", new TextDocumentStatistics(26, 1), null, getDetectedLanguageEnglish()),
        //     new DetectLanguageResult("1", new TextDocumentStatistics(40, 1), null, getDetectedLanguageSpanish()),
        //     new DetectLanguageResult("2", new TextDocumentStatistics(6, 1), null, getUnknownDetectedLanguage()));
        // return new DetectLanguageResultCollection(detectLanguageResultList, DEFAULT_MODEL_VERSION, textDocumentBatchStatistics);
    }

    /**
     * Returns a stream of arguments that includes all combinations of eligible {@link HttpClient HttpClients} and
     * service versions that should be tested.
     *
     * @return A stream of HttpClient and service version combinations to test.
     */
    public static Stream<Arguments> getTestParameters() {
        // when this issues is closed, the newer version of junit will have better support for
        // cartesian product of arguments - https://github.com/junit-team/junit5/issues/1427
        List<Arguments> argumentsList = new ArrayList<>();
        TestBase.getHttpClients()
            .forEach(httpClient -> {
                Arrays.stream(MapsSearchServiceVersion.values())
                // .filter(TestUtils::shouldServiceVersionBeTested)
                    .forEach(serviceVersion -> argumentsList.add(Arguments.of(httpClient, serviceVersion)));
            });
        return argumentsList.stream();
    }
}
