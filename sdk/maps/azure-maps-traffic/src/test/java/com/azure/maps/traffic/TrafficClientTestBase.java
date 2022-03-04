package com.azure.maps.traffic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.http.rest.StreamResponse;
import com.azure.core.test.InterceptorManager;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import com.azure.identity.EnvironmentCredentialBuilder;
import com.azure.maps.traffic.implementation.models.TrafficIncidentDetail;
import com.azure.maps.traffic.models.TrafficFlowSegmentData;
import com.azure.maps.traffic.models.TrafficIncidentViewport;

public class TrafficClientTestBase extends TestBase {
    static final String FAKE_API_KEY = "1234567890";

    private final String endpoint = Configuration.getGlobalConfiguration().get("API-LEARN_ENDPOINT");
    Duration durationTestMode;
    static InterceptorManager interceptorManagerTestBase;

    @Override
    protected void beforeTest() {
        if (interceptorManager.isPlaybackMode()) {
            durationTestMode = Duration.ofMillis(1);
        } else {
            durationTestMode = TestUtils.DEFAULT_POLL_INTERVAL;
        }
        interceptorManagerTestBase = interceptorManager;
    }

    TrafficClientBuilder getTrafficAsyncClientBuilder(HttpClient httpClient, TrafficServiceVersion serviceVersion) {
        TrafficClientBuilder builder = new TrafficClientBuilder()
        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
        .serviceVersion(serviceVersion);
        String endpoint = getEndpoint();
        if (getEndpoint() != null) {
            builder.endpoint(endpoint);
        }
        if (getTestMode() == TestMode.RECORD) {
            builder.addPolicy(interceptorManager.getRecordPolicy());
        }
        if (getTestMode() == TestMode.PLAYBACK) {
            builder.credential(new AzureKeyCredential(FAKE_API_KEY)).httpClient(interceptorManager.getPlaybackClient());
        } else {
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
            ? "https://localhost:8080"
            : endpoint;
    }

    static void validateGetTrafficFlowTile(byte[] actual) {
        assertNotNull(actual);
    }

    static void validateGetTrafficFlowTileWithResponse(int expectedStatusCode, SimpleResponse<InputStream> response) throws IOException {
        assertNotNull(response);
        assertEquals(expectedStatusCode, response.getStatusCode());
    }

    static void validateAsyncGetTrafficFlowTileWithResponse(int expectedStatusCode, StreamResponse response) throws IOException {
        assertNotNull(response);
        assertEquals(expectedStatusCode, response.getStatusCode());
    }

    static void validateGetTrafficFlowSegment(TrafficFlowSegmentData expected, TrafficFlowSegmentData actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.getFlowSegmentData().getCurrentSpeed(), actual.getFlowSegmentData().getCurrentSpeed());
        assertEquals(expected.getFlowSegmentData().getCurrentTravelTime(), actual.getFlowSegmentData().getCurrentTravelTime());
        assertEquals(expected.getFlowSegmentData().getFreeFlowSpeed(), actual.getFlowSegmentData().getFreeFlowSpeed());
        assertEquals(expected.getFlowSegmentData().getFreeFlowTravelTime(), actual.getFlowSegmentData().getFreeFlowTravelTime());
        assertEquals(expected.getFlowSegmentData().getConfidence(), actual.getFlowSegmentData().getConfidence());
    }

    static void validateGetTrafficFlowSegmentWithResponse(TrafficFlowSegmentData expected, int expectedStatusCode, Response<TrafficFlowSegmentData> response) {
        assertNotNull(response);
        assertEquals(expectedStatusCode, response.getStatusCode());
        validateGetTrafficFlowSegment(expected, response.getValue());
    }

    static void validateGetTrafficIncidentTile(ByteBuffer actual) {
        assertNotNull(actual);
    }

    static void validateGetTrafficIncidentTileWithResponse(int expectedStatusCode, SimpleResponse<InputStream> response) throws IOException {
        assertNotNull(response);
        assertEquals(expectedStatusCode, response.getStatusCode());
    }

    static void validateTrafficIncidentDetail(TrafficIncidentDetail expected, TrafficIncidentDetail actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.getTm().getPointsOfInterest().size(), actual.getTm().getPointsOfInterest().size());
    }

    static void validateTrafficIncidentDetailWithResponse(TrafficIncidentDetail expected, int expectedStatusCode, Response<TrafficIncidentDetail> response) {
        assertNotNull(response);
        assertEquals(expectedStatusCode, response.getStatusCode());
        validateTrafficIncidentDetail(expected, response.getValue());
    }

    static void validateTrafficIncidentViewport(TrafficIncidentViewport expected, TrafficIncidentViewport actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.getViewportResponse().getVersion(), actual.getViewportResponse().getVersion());
        assertEquals(expected.getViewportResponse().getCopyrightInformation(), actual.getViewportResponse().getCopyrightInformation());
        assertEquals(expected.getViewportResponse().getMaps(), actual.getViewportResponse().getMaps());
    }

    static void validateTrafficIncidentViewportWithResponse(TrafficIncidentViewport expected, int expectedStatusCode, Response<TrafficIncidentViewport> response) {
        assertNotNull(response);
        assertEquals(expectedStatusCode, response.getStatusCode());
        validateTrafficIncidentViewport(expected, response.getValue());
    }
}
