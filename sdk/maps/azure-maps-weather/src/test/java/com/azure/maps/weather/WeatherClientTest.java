package com.azure.maps.weather;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.azure.core.http.HttpClient;
import com.azure.core.models.GeoPosition;
import com.azure.maps.weather.models.ActiveStorm;
import com.azure.maps.weather.models.ActiveStormResult;
import com.azure.maps.weather.models.AirQualityResult;
import com.azure.maps.weather.models.CurrentConditionsResult;
import com.azure.maps.weather.models.DailyAirQualityForecastResult;
import com.azure.maps.weather.models.DailyDuration;
import com.azure.maps.weather.models.DailyForecastResult;
import com.azure.maps.weather.models.DailyHistoricalActualsResult;
import com.azure.maps.weather.models.DailyHistoricalNormalsResult;
import com.azure.maps.weather.models.DailyHistoricalRecordsResult;
import com.azure.maps.weather.models.DailyIndicesResult;
import com.azure.maps.weather.models.HourlyDuration;
import com.azure.maps.weather.models.HourlyForecastResult;
import com.azure.maps.weather.models.MinuteForecastResult;
import com.azure.maps.weather.models.QuarterDayForecastResult;
import com.azure.maps.weather.models.SevereWeatherAlertsResult;
import com.azure.maps.weather.models.StormForecastResult;
import com.azure.maps.weather.models.StormLocationsResult;
import com.azure.maps.weather.models.StormSearchResult;
import com.azure.maps.weather.models.TropicalStormForecastOptions;
import com.azure.maps.weather.models.TropicalStormLocationOptions;
import com.azure.maps.weather.models.Waypoint;
import com.azure.maps.weather.models.WeatherAlongRouteResult;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class WeatherClientTest extends WeatherTestBase {
    private WeatherClient client;
    private static final String DISPLAY_NAME_WITH_ARGUMENTS = "{displayName} with [{arguments}]";

    private WeatherClient getWeatherClient(HttpClient httpClient, WeatherServiceVersion serviceVersion) {
        return getWeatherAsyncClientBuilder(httpClient, serviceVersion).buildClient();
    }

    // Test get hourly forecast
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.weather.TestUtils#getTestParameters")
    public void testGetHourlyForecast(HttpClient httpClient, WeatherServiceVersion serviceVersion) throws IOException {
        client = getWeatherClient(httpClient, serviceVersion);
        HourlyForecastResult actualResult = client.getHourlyForecast(new GeoPosition(-122.138874, 47.632346), null, 12, null);
        HourlyForecastResult expectedResult = TestUtils.getExpectedHourlyForecast();
        validateGetHourlyForecast(expectedResult, actualResult);
    }

    // Test get hourly forecast with response
    // Case 1: 200
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.weather.TestUtils#getTestParameters")
    public void testGetHourlyForecastWithResponse(HttpClient httpClient, WeatherServiceVersion serviceVersion) throws IOException {
        client = getWeatherClient(httpClient, serviceVersion);
        validateGetHourlyForecastWithResponse(TestUtils.getExpectedHourlyForecast(), 200, client.getHourlyForecastWithResponse(new GeoPosition(-122.138874, 47.632346), null, 12, null, null));
    }

    // Test get minute forecast
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.weather.TestUtils#getTestParameters")
    public void testGetMinuteForecast(HttpClient httpClient, WeatherServiceVersion serviceVersion) throws IOException {
        client = getWeatherClient(httpClient, serviceVersion);
        MinuteForecastResult actualResult = client.getMinuteForecast(new GeoPosition(-122.138874, 47.632346), 15, null);
        MinuteForecastResult expectedResult = TestUtils.getExpectedMinuteForecast();
        validateGetMinuteForecast(expectedResult, actualResult);
    }

    // Test get minute forecast with response
    // Case 1: 200
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.weather.TestUtils#getTestParameters")
    public void testGetMinuteForecastWithResponse(HttpClient httpClient, WeatherServiceVersion serviceVersion) throws IOException {
        client = getWeatherClient(httpClient, serviceVersion);
        validateGetMinuteForecastWithResponse(TestUtils.getExpectedMinuteForecast(), 200, client.getMinuteForecastWithResponse(new GeoPosition(-122.138874, 47.632346), 15, null, null));
    }

    // Test get quarter day forecast
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.weather.TestUtils#getTestParameters")
    public void testGetQuarterDayForecast(HttpClient httpClient, WeatherServiceVersion serviceVersion) throws IOException {
        client = getWeatherClient(httpClient, serviceVersion);
        QuarterDayForecastResult actualResult = client.getQuarterDayForecast(new GeoPosition(-122.138874, 47.632346), null, 1, null);
        QuarterDayForecastResult expectedResult = TestUtils.getExpectedQuarterDayForecast();
        validateGetQuarterDayForecast(expectedResult, actualResult);
    }

    // Test get current conditions
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.weather.TestUtils#getTestParameters")
    public void testGetCurrentConditions(HttpClient httpClient, WeatherServiceVersion serviceVersion) throws IOException {
        client = getWeatherClient(httpClient, serviceVersion);
        CurrentConditionsResult actualResult = client.getCurrentConditions(new GeoPosition(-122.125679, 47.641268), 
            null, null, null, null);
            CurrentConditionsResult expectedResult = TestUtils.getExpectedCurrentConditions();
        validateGetCurrentConditions(expectedResult, actualResult);
    }

    // Test get daily forecast
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.weather.TestUtils#getTestParameters")
    public void testGetDailyForecast(HttpClient httpClient, WeatherServiceVersion serviceVersion) throws IOException {
        client = getWeatherClient(httpClient, serviceVersion);
        DailyForecastResult actualResult = client.getDailyForecast(new GeoPosition(30.0734812, 62.6490341), null, 5, null);
        DailyForecastResult expectedResult = TestUtils.getExpectedDailyForecast();
        validateGetDailyForecast(expectedResult, actualResult);
    }

    // Test get weather along route
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.weather.TestUtils#getTestParameters")
    public void testGetWeatherAlongRoute(HttpClient httpClient, WeatherServiceVersion serviceVersion) throws IOException {
        client = getWeatherClient(httpClient, serviceVersion);
        List<Waypoint> waypoints = Arrays.asList(
            new Waypoint(new GeoPosition(-77.037, 38.907), 0.0),
            new Waypoint(new GeoPosition(-77.009, 38.907), 10.0),
            new Waypoint(new GeoPosition(-76.928, 38.926), 20.0),
            new Waypoint(new GeoPosition(-76.852, 39.033), 30.0),
            new Waypoint(new GeoPosition(-76.732, 39.168), 40.0),
            new Waypoint(new GeoPosition(-76.634, 39.269), 50.0),
            new Waypoint(new GeoPosition(-76.612, 39.287), 60.0)
        );
        WeatherAlongRouteResult actualResult = client.getWeatherAlongRoute(waypoints, "en");
        WeatherAlongRouteResult expectedResult = TestUtils.getExpectedWeatherAlongRoute();
        validateGetExpectedWeatherAlongRoute(expectedResult, actualResult);
    }

    // Test get severe weather alerts
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.weather.TestUtils#getTestParameters")
    public void testGetSevereWeatherAlerts(HttpClient httpClient, WeatherServiceVersion serviceVersion) throws IOException {
        client = getWeatherClient(httpClient, serviceVersion);
        SevereWeatherAlertsResult actualResult = client.getSevereWeatherAlerts(new GeoPosition(-85.06431274043842, 30.324604968788467), null, true);
        SevereWeatherAlertsResult expectedResult = TestUtils.getExpectedSevereWeatherAlerts();
        validateGetSevereWeatherAlerts(expectedResult, actualResult);
    }

    // Test get daily indices
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.weather.TestUtils#getTestParameters")
    public void testGetDailyIndices(HttpClient httpClient, WeatherServiceVersion serviceVersion) throws IOException {
        client = getWeatherClient(httpClient, serviceVersion);
        DailyIndicesResult actualResult = client.getDailyIndices(new GeoPosition(-79.37849, 43.84745), null, null, null, 11);
        DailyIndicesResult expectedResult = TestUtils.getExpectedDailyIndices();
        validateGetDailyIndices(expectedResult, actualResult);
    }

    // Test get tropical storm active
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.weather.TestUtils#getTestParameters")
    public void testGetTropicalStormActive(HttpClient httpClient, WeatherServiceVersion serviceVersion) throws IOException {
        client = getWeatherClient(httpClient, serviceVersion);
        ActiveStormResult actualResult = client.getTropicalStormActive();
        ActiveStormResult expectedResult = TestUtils.getExpectedTropicalStormActive();
        validateGetExpectedTropicalStormActive(expectedResult, actualResult);
    }

    // Test search tropical storm
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.weather.TestUtils#getTestParameters")
    public void testSearchTropicalStorm(HttpClient httpClient, WeatherServiceVersion serviceVersion) throws IOException {
        client = getWeatherClient(httpClient, serviceVersion);
        ActiveStormResult result = client.getTropicalStormActive();
        if (result.getActiveStorms().size() > 0) {
            ActiveStorm storm = result.getActiveStorms().get(0);
            StormSearchResult actualResult = client.searchTropicalStorm(storm.getYear(), storm.getBasinId(), storm.getGovId());
            StormSearchResult expectedResult = TestUtils.getExpectedSearchTropicalStorm();
            validateGetSearchTropicalStorm(expectedResult, actualResult);
        }
    }

    // Test get tropical storm forecast
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.weather.TestUtils#getTestParameters")
    public void testGetTropicalStormForecast(HttpClient httpClient, WeatherServiceVersion serviceVersion) throws IOException {
        client = getWeatherClient(httpClient, serviceVersion);
        ActiveStormResult result = client.getTropicalStormActive();
        if (result.getActiveStorms().size() > 0) {
            ActiveStorm storm = result.getActiveStorms().get(0);
            TropicalStormForecastOptions forecastOptions = new TropicalStormForecastOptions(storm.getYear(),
                storm.getBasinId(), storm.getGovId())
                .setIncludeWindowGeometry(true);
            StormForecastResult actualResult = client.getTropicalStormForecast(forecastOptions);
            StormForecastResult expectedResult = TestUtils.getExpectedTropicalStormForecast();
            validateGetTropicalStormForecast(expectedResult, actualResult);
        }
    }

    // Test get tropical storm locations
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.weather.TestUtils#getTestParameters")
    public void testGetTropicalStormLocations(HttpClient httpClient, WeatherServiceVersion serviceVersion) throws IOException {
        client = getWeatherClient(httpClient, serviceVersion);
        ActiveStormResult result = client.getTropicalStormActive();
        if (result.getActiveStorms().size() > 0) {
            ActiveStorm storm = result.getActiveStorms().get(0);
            TropicalStormLocationOptions locationOptions = new TropicalStormLocationOptions(storm.getYear(),
                storm.getBasinId(), storm.getGovId());
            StormLocationsResult actualResult = client.getTropicalStormLocations(locationOptions);
            StormLocationsResult expectedResult = TestUtils.getExpectedTropicalStormLocations();
            validateGetTropicalStormLocations(expectedResult, actualResult);
        }
    }

    // Test get current air quality
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.weather.TestUtils#getTestParameters")
    public void testGetCurrentAirQuality(HttpClient httpClient, WeatherServiceVersion serviceVersion) throws IOException {
        client = getWeatherClient(httpClient, serviceVersion);
        AirQualityResult actualResult = client.getCurrentAirQuality(
            new GeoPosition(-122.138874, 47.632346), "es", false);
        AirQualityResult expectedResult = TestUtils.getExpectedCurrentAirQuality();
        validateGetCurrentAirQuality(expectedResult, actualResult);
    }

    // Test get air quality daily forecasts
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.weather.TestUtils#getTestParameters")
    public void testGetAirQualityDailyForecasts(HttpClient httpClient, WeatherServiceVersion serviceVersion) throws IOException {
        client = getWeatherClient(httpClient, serviceVersion);
        DailyAirQualityForecastResult actualResult = client.getAirQualityDailyForecasts(
            new GeoPosition(-122.138874, 47.632346), "en", DailyDuration.TWO_DAYS);
        DailyAirQualityForecastResult expectedResult = TestUtils.getExpectedAirQualityDailyForecasts();
        validateGetAirQualityDailyForecasts(expectedResult, actualResult);
    }

    // Test get air quality hourly forecasts
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.weather.TestUtils#getTestParameters")
    public void testGetAirQualityHourlyForecasts(HttpClient httpClient, WeatherServiceVersion serviceVersion) throws IOException {
        client = getWeatherClient(httpClient, serviceVersion);
        AirQualityResult actualResult = client.getAirQualityHourlyForecasts(
            new GeoPosition(-122.138874, 47.632346), "fr", HourlyDuration.ONE_HOUR, false);
        AirQualityResult expectedResult = TestUtils.getExpectedAirQualityHourlyForecasts();
        validateGetAirQualityHourlyForecasts(expectedResult, actualResult);
    }

    // Test get daily historical actuals
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.weather.TestUtils#getTestParameters")
    public void testGetDailyHistoricalActuals(HttpClient httpClient, WeatherServiceVersion serviceVersion) throws IOException {
        client = getWeatherClient(httpClient, serviceVersion);
        LocalDate before = LocalDate.now().minusDays(30);
        LocalDate today = LocalDate.now();
        DailyHistoricalActualsResult actualResult = client.getDailyHistoricalActuals(new GeoPosition(30.0734812, 62.6490341), before, today, null);
        DailyHistoricalActualsResult expectedResult = TestUtils.getExpectedDailyHistoricalActuals();
        validateGetDailyHistoricalActuals(expectedResult, actualResult);
    }

    // Test get daily historical records
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.weather.TestUtils#getTestParameters")
    public void testGetDailyHistoricalRecords(HttpClient httpClient, WeatherServiceVersion serviceVersion) throws IOException {
        client = getWeatherClient(httpClient, serviceVersion);
        LocalDate beforeYears = LocalDate.now().minusYears(10);
        LocalDate afterYears = beforeYears.plusDays(30);
        DailyHistoricalRecordsResult actualResult = client.getDailyHistoricalRecords(new GeoPosition(-75.165222, 39.952583), beforeYears, afterYears, null);
        DailyHistoricalRecordsResult expectedResult = TestUtils.getExpectedDailyHistoricalRecords();
        validateGetDailyHistoricalRecords(expectedResult, actualResult);
    }

    // Test get daily historical normals
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.weather.TestUtils#getTestParameters")
    public void testGetDailyHistoricalNormals(HttpClient httpClient, WeatherServiceVersion serviceVersion) throws IOException {
        client = getWeatherClient(httpClient, serviceVersion);
        LocalDate before = LocalDate.now().minusDays(30);
        LocalDate today = LocalDate.now();
        DailyHistoricalNormalsResult actualResult = client.getDailyHistoricalNormals(new GeoPosition(30.0734812, 62.6490341), before, today, null);
        DailyHistoricalNormalsResult expectedResult = TestUtils.getExpectedDailyHistoricalNormalsResult();
        validateGetDailyHistoricalNormalsResult(expectedResult, actualResult);
    }
}