package com.azure.maps.weather;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
import com.azure.core.test.InterceptorManager;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import com.azure.identity.EnvironmentCredentialBuilder;
import com.azure.maps.weather.models.ActiveStormResult;
import com.azure.maps.weather.models.AirQualityResult;
import com.azure.maps.weather.models.CurrentConditionsResult;
import com.azure.maps.weather.models.DailyAirQualityForecastResult;
import com.azure.maps.weather.models.DailyForecastResult;
import com.azure.maps.weather.models.DailyHistoricalActualsResult;
import com.azure.maps.weather.models.DailyHistoricalNormalsResult;
import com.azure.maps.weather.models.DailyHistoricalRecordsResult;
import com.azure.maps.weather.models.DailyIndicesResult;
import com.azure.maps.weather.models.HourlyForecastResult;
import com.azure.maps.weather.models.MinuteForecastResult;
import com.azure.maps.weather.models.QuarterDayForecastResult;
import com.azure.maps.weather.models.SevereWeatherAlertsResult;
import com.azure.maps.weather.models.StormForecastResult;
import com.azure.maps.weather.models.StormLocationsResult;
import com.azure.maps.weather.models.StormSearchResult;
import com.azure.maps.weather.models.WeatherAlongRouteResult;

public class WeatherTestBase extends TestBase {
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
    
    WeatherClientBuilder getWeatherAsyncClientBuilder(HttpClient httpClient, WeatherServiceVersion serviceVersion) {
        WeatherClientBuilder builder = new WeatherClientBuilder()
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

    static void validateGetHourlyForecast(HourlyForecastResult expected, HourlyForecastResult actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.getForecasts().size(), actual.getForecasts().size());
        assertEquals(expected.getClass().getName(), actual.getClass().getName());
        assertEquals(expected.getClass().getSimpleName(), actual.getClass().getSimpleName());
    }

    static void validateGetHourlyForecastWithResponse(HourlyForecastResult expected, int expectedStatusCode, Response<HourlyForecastResult> response) {
        assertNotNull(response);
        assertEquals(expectedStatusCode, response.getStatusCode());
        validateGetHourlyForecast(expected, response.getValue());
    }

    static void validateGetMinuteForecast(MinuteForecastResult expected, MinuteForecastResult actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.getIntervals().size(), actual.getIntervals().size());
    }

    static void validateGetMinuteForecastWithResponse(MinuteForecastResult expected, int expectedStatusCode, Response<MinuteForecastResult> response) {
        assertNotNull(response);
        assertEquals(expectedStatusCode, response.getStatusCode());
        validateGetMinuteForecast(expected, response.getValue());
    }

    static void validateGetQuarterDayForecast(QuarterDayForecastResult expected, QuarterDayForecastResult actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.getForecasts().size(), actual.getForecasts().size());
        assertEquals(expected.getClass().getName(), actual.getClass().getName());
        assertEquals(expected.getClass().getSimpleName(), actual.getClass().getSimpleName());
    }

    static void validateGetCurrentConditions(CurrentConditionsResult expected, CurrentConditionsResult actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.getResults().size(), actual.getResults().size());
        assertEquals(expected.getClass().getName(), actual.getClass().getName());
        assertEquals(expected.getClass().getSimpleName(), actual.getClass().getSimpleName());
    }

    static void validateGetDailyForecast(DailyForecastResult expected, DailyForecastResult actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.getForecasts().size(), actual.getForecasts().size());
        assertEquals(expected.getSummary().getSeverity(), actual.getSummary().getSeverity());
        assertEquals(expected.getSummary().getCategory(), actual.getSummary().getCategory());
    }

    static void validateGetExpectedWeatherAlongRoute(WeatherAlongRouteResult expected, WeatherAlongRouteResult actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.getWaypoints().size(), actual.getWaypoints().size());
        assertEquals(expected.getSummary().getHazards().getDetails().size(), actual.getSummary().getHazards().getDetails().size());
        assertEquals(expected.getSummary().getIconCode(), actual.getSummary().getIconCode());
        assertEquals(expected.getClass().getName(), actual.getClass().getName());
    }

    static void validateGetSevereWeatherAlerts(SevereWeatherAlertsResult expected, SevereWeatherAlertsResult actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.getResults().size(), actual.getResults().size());
        assertEquals(expected.getClass().getName(), actual.getClass().getName());
        assertEquals(expected.getClass().getSimpleName(), actual.getClass().getSimpleName());
    }

    static void validateGetDailyIndices(DailyIndicesResult expected, DailyIndicesResult actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.getResults().size(), actual.getResults().size());
        assertEquals(expected.getClass().getName(), actual.getClass().getName());
        assertEquals(expected.getClass().getSimpleName(), actual.getClass().getSimpleName());
    }

    static void validateGetExpectedTropicalStormActive(ActiveStormResult expected, ActiveStormResult actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.getActiveStorms().size(), actual.getActiveStorms().size());
        assertEquals(expected.getClass().getName(), actual.getClass().getName());
        assertEquals(expected.getClass().getSimpleName(), actual.getClass().getSimpleName());
    }

    static void validateGetSearchTropicalStorm(StormSearchResult expected, StormSearchResult actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.getClass().getName(), actual.getClass().getName());
        assertEquals(expected.getClass().getSimpleName(), actual.getClass().getSimpleName());
        assertEquals(expected.getNextLink(), actual.getNextLink());
    }

    static void validateGetTropicalStormForecast(StormForecastResult expected, StormForecastResult actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.getNextLink(), actual.getNextLink());
        assertEquals(expected.getClass().getName(), actual.getClass().getName());
        assertEquals(expected.getClass().getSimpleName(), actual.getClass().getSimpleName());
    }

    static void validateGetTropicalStormLocations(StormLocationsResult expected, StormLocationsResult actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.getNextLink(), actual.getNextLink());
        assertEquals(expected.getClass().getName(), actual.getClass().getName());
        assertEquals(expected.getClass().getSimpleName(), actual.getClass().getSimpleName());
    }

    static void validateGetCurrentAirQuality(AirQualityResult expected, AirQualityResult actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.getAirQualityResults().size(), actual.getAirQualityResults().size());
        assertEquals(expected.getNextLink(), actual.getNextLink());
        assertEquals(expected.getClass().getName(), actual.getClass().getName());
        assertEquals(expected.getClass().getSimpleName(), actual.getClass().getSimpleName());
    }

    static void validateGetAirQualityDailyForecasts(DailyAirQualityForecastResult expected, DailyAirQualityForecastResult actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.getNextLink(), actual.getNextLink());
        assertEquals(expected.getClass().getName(), actual.getClass().getName());
        assertEquals(expected.getClass().getSimpleName(), actual.getClass().getSimpleName());
    }

    static void validateGetAirQualityHourlyForecasts(AirQualityResult expected, AirQualityResult actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.getNextLink(), actual.getNextLink());
        assertEquals(expected.getClass().getName(), actual.getClass().getName());
        assertEquals(expected.getClass().getSimpleName(), actual.getClass().getSimpleName());
    }

    static void validateGetDailyHistoricalRecords(DailyHistoricalRecordsResult expected, DailyHistoricalRecordsResult actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.getNextLink(), actual.getNextLink());
        assertEquals(expected.getClass().getName(), actual.getClass().getName());
        assertEquals(expected.getClass().getSimpleName(), actual.getClass().getSimpleName());
    }

    static void validateGetDailyHistoricalActuals(DailyHistoricalActualsResult expected, DailyHistoricalActualsResult actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.getNextLink(), actual.getNextLink());
        assertEquals(expected.getClass().getName(), actual.getClass().getName());
        assertEquals(expected.getClass().getSimpleName(), actual.getClass().getSimpleName());
    }

    static void validateGetDailyHistoricalNormalsResult(DailyHistoricalNormalsResult expected, DailyHistoricalNormalsResult actual) {
        assertNotNull(actual);
        assertNotNull(expected);
        assertEquals(expected.getNextLink(), actual.getNextLink());
        assertEquals(expected.getClass().getName(), actual.getClass().getName());
        assertEquals(expected.getClass().getSimpleName(), actual.getClass().getSimpleName());
    }
}