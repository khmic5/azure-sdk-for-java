package com.azure.maps.search;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.rest.Response;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import com.azure.identity.EnvironmentCredentialBuilder;
import com.azure.maps.search.models.SearchAddressResult;
import com.azure.core.credential.AzureKeyCredential;

public class MapsSearchClientTestBase extends TestBase {
    static final String FAKE_API_KEY = "1234567890";

    private final String endpoint = Configuration.getGlobalConfiguration().get("API-LEARN_ENDPOINT");

    MapsSearchClientBuilder getMapsSearchAsyncClientBuilder(HttpClient httpClient,
        MapsSearchServiceVersion serviceVersion) {
            System.out.println("beginning httpclient " + httpClient);
            MapsSearchClientBuilder builder = new MapsSearchClientBuilder()
            .httpClient(httpClient == null ? interceptorManager.getPlaybackClient() : httpClient)
            // .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
            .serviceVersion(serviceVersion);
            String endpoint = getEndpoint();
            if (getEndpoint() != null) {
                builder.endpoint(endpoint); 
            }
            System.out.println("after httpclient " + httpClient);
        if (getTestMode() == TestMode.RECORD) {
            builder.addPolicy(interceptorManager.getRecordPolicy());
        }
        if (getTestMode() == TestMode.PLAYBACK) {
            builder.credential(new AzureKeyCredential(FAKE_API_KEY));
        } else {
            System.out.println("snoopy " + Configuration.getGlobalConfiguration().get("SUBSCRIPTION_KEY"));
            builder.credential((new AzureKeyCredential(
                Configuration.getGlobalConfiguration().get("SUBSCRIPTION_KEY"))));
        }
        return builder;
    }

    HttpPipeline getHttpPipeline(HttpClient httpClient) {
        TokenCredential credential = null;

        if (!interceptorManager.isPlaybackMode()) {
            credential = new EnvironmentCredentialBuilder().httpClient(httpClient).build();
        }

        final List<HttpPipelinePolicy> policies = new ArrayList<>();
        if (credential != null) {
            policies.add(new BearerTokenAuthenticationPolicy(credential, endpoint.replaceFirst("/$", "") + "/.default"));
        }

        if (getTestMode() == TestMode.RECORD) {
            policies.add(interceptorManager.getRecordPolicy());
        }

        HttpPipeline pipeline = new HttpPipelineBuilder()
            .policies(policies.toArray(new HttpPipelinePolicy[0]))
            .httpClient(httpClient == null ? interceptorManager.getPlaybackClient() : httpClient)
            .build();

        return pipeline;
    }

    String getEndpoint() {
        return interceptorManager.isPlaybackMode()
            ? "http://localhost:8080"
            : endpoint;
    }

    static void validateFuzzySearchWithResponse(SearchAddressResult expected, int expectedStatusCode,Response<SearchAddressResult> response) {
        assertNotNull(response);
        assertEquals(expectedStatusCode, response.getStatusCode());
        validateFuzzySearch(expected, response.getValue());
    }

    static void validateFuzzySearch(SearchAddressResult expected, SearchAddressResult actual) {
        validateFuzzySearchContent(expected, actual);
    }

    /**
     * Helper method to validate a single detected language.
     *
     * @param expectedLanguage detectedLanguage returned by the service.
     * @param actualLanguage detectedLanguage returned by the API.
     */
    static void validateFuzzySearchContent(SearchAddressResult expectedResult, SearchAddressResult actualResult) {
        // TODO: issue https://github.com/Azure/azure-sdk-for-java/issues/13841
        assertNotNull(actualResult.getSummary());
        assertNotNull(actualResult.getResults());
        assertEquals(expectedResult.getResults().size(), actualResult.getResults().size());
    }
}