package com.azure.maps.weather;

import java.time.Duration;

import com.azure.core.http.HttpClient;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import reactor.test.StepVerifier;

public class WeatherAsyncClientTest extends WeatherTestBase {
    private static final String DISPLAY_NAME_WITH_ARGUMENTS = "{displayName} with [{arguments}]";

    @BeforeAll
    public static void beforeAll() {
        StepVerifier.setDefaultTimeout(Duration.ofSeconds(30));
    }

    @AfterAll
    public static void afterAll() {
        StepVerifier.resetDefaultTimeout();
    }

    private WeatherAsyncClient getWeatherAsyncClient(HttpClient httpClient, WeatherServiceVersion serviceVersion) {
        return getWeatherAsyncClientBuilder(httpClient, serviceVersion).buildAsyncClient();
    }

    // Test get hourly forecast
    

    /**
     * // Test async get route range
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.route.TestUtils#getTestParameters")
    public void testAsyncGetRouteRange(HttpClient httpClient, RouteServiceVersion serviceVersion) throws IOException {
        RouteAsyncClient client = getRouteAsyncClient(httpClient, serviceVersion);
        RouteRangeOptions rangeOptions = new RouteRangeOptions(new GeoPosition(50.97452,5.86605), 6000.0);
        StepVerifier.create(client.getRouteRange(rangeOptions))
        .assertNext(actualResults -> {
            try {
                validateGetRouteRange(TestUtils.getExpectedRouteRange(), actualResults);
            } catch (IOException e) {
                Assertions.fail("Unable to get route range");
            }
        }).verifyComplete();
    }

     */
}