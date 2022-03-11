package com.azure.maps.examples;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.models.GeoPosition;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.maps.weather.WeatherClient;
import com.azure.maps.weather.WeatherClientBuilder;
import com.azure.maps.weather.models.ActiveStorm;
import com.azure.maps.weather.models.ActiveStormResult;
import com.azure.maps.weather.models.BasinId;
import com.azure.maps.weather.models.DailyDuration;
import com.azure.maps.weather.models.HourlyDuration;
import com.azure.maps.weather.models.StormForecastResult;
import com.azure.maps.weather.models.StormLocationsResult;
import com.azure.maps.weather.models.TropicalStormForecastOptions;
import com.azure.maps.weather.models.TropicalStormLocationOptions;
import com.azure.maps.weather.models.Waypoint;

public class WeatherSample {
    public static void main(String[] args) throws IOException {
        // authenticates using subscription key
        // AzureKeyCredential keyCredential = new AzureKeyCredential(System.getenv("SUBSCRIPTION_KEY"));

        // authenticates using Azure AD building a default credential
        // This will look for AZURE_CLIENT_ID, AZURE_TENANT_ID, and AZURE_CLIENT_SECRET env variables
        DefaultAzureCredential tokenCredential = new DefaultAzureCredentialBuilder().build();

        // build client
        WeatherClientBuilder builder = new WeatherClientBuilder();

        // use this for key authentication
        // builder.credential(keyCredential);

        // use the next 2 lines for Azure AD authentication
        builder.credential(tokenCredential);
        builder.mapsClientId(System.getenv("MAPS_CLIENT_ID"));
        builder.httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));
        WeatherClient client = builder.buildClient();

        System.out.println("Get Current Conditions");
        MapsCommon.print(client.getCurrentConditions(
            new GeoPosition(-122.125679, 47.641268), null, null, null, null)
            .getResults()
            .get(0)
            .getRealFeelTemperature());

        System.out.println("Get Daily Forecast");
        MapsCommon.print(client.getDailyForecast(new GeoPosition(30.0734812, 62.6490341), null, 5, null).getSummary());

        System.out.println("Get Daily Historical Actuals");
        LocalDate before = LocalDate.now().minusDays(30);
        LocalDate today = LocalDate.now();
        MapsCommon.print(client.getDailyHistoricalActuals(new GeoPosition(30.0734812, 62.6490341), before, today, null));

        System.out.println("Get Daily Historical Normals");
        MapsCommon.print(client.getDailyHistoricalNormals(new GeoPosition(30.0734812, 62.6490341), before, today, null));

        System.out.println("Get Daily Historical Records");
        LocalDate beforeYears = LocalDate.now().minusYears(10);
        LocalDate afterYears = beforeYears.plusDays(30);
        MapsCommon.print(client.getDailyHistoricalRecords(new GeoPosition(-75.165222, 39.952583), beforeYears, afterYears, null));

        System.out.println("Get Daily Indices");
        MapsCommon.print(client.getDailyIndices(new GeoPosition(-79.37849, 43.84745), null, null, null, 11)
            .getResults().get(0).getCategoryDescription());
        System.out.println("Get Hourly Forecast");

        MapsCommon.print(client.getHourlyForecast(new GeoPosition(-122.138874, 47.632346), null, 12, null));

        System.out.println("Get Minute Forecast");
        MapsCommon.print(client.getMinuteForecast(new GeoPosition(-122.138874, 47.632346), 15, null));

        System.out.println("Get Quarter Day Forecast");
        MapsCommon.print(client.getQuarterDayForecast(new GeoPosition(-122.138874, 47.632346), null, 1, null));

        System.out.println("Get Severe Weather Alerts");
        MapsCommon.print(client.getSevereWeatherAlerts(new GeoPosition(-81.091, 48.057), null, true));

        System.out.println("Get Weather Along Route");
        List<Waypoint> waypoints = Arrays.asList(
            new Waypoint(new GeoPosition(-77.037, 38.907), 0.0),
            new Waypoint(new GeoPosition(-77.009, 38.907), 10.0),
            new Waypoint(new GeoPosition(-76.928, 38.926), 20.0),
            new Waypoint(new GeoPosition(-76.852, 39.033), 30.0),
            new Waypoint(new GeoPosition(-76.732, 39.168), 40.0),
            new Waypoint(new GeoPosition(-76.634, 39.269), 50.0),
            new Waypoint(new GeoPosition(-76.612, 39.287), 60.0)
        );

        MapsCommon.print(client.getWeatherAlongRoute(waypoints, "en"));

        System.out.println("Get current air quality");
        MapsCommon.print(client.getCurrentAirQuality(
            new GeoPosition(-122.138874, 47.632346), "es", false));

        System.out.println("Get air quality daily forecasts");
        MapsCommon.print(client.getAirQualityDailyForecasts(
            new GeoPosition(-122.138874, 47.632346), "en", DailyDuration.TWO_DAYS));

        System.out.println("Get air quality hourly forecasts");
        MapsCommon.print(client.getAirQualityHourlyForecasts(
            new GeoPosition(-122.138874, 47.632346), "fr", HourlyDuration.ONE_HOUR, false));

        System.out.println("Get active tropical storms");
        ActiveStormResult result = client.getTropicalStormActive();

        if (result.getActiveStorms().size() > 0) {
            ActiveStorm storm = result.getActiveStorms().get(0);
            System.out.println("Active storm: " + storm.getName());

            TropicalStormForecastOptions forecastOptions = new TropicalStormForecastOptions(storm.getYear(),
                storm.getBasinId(), storm.getGovId())
                .setIncludeWindowGeometry(true);

            StormForecastResult stormResult = client.getTropicalStormForecast(forecastOptions);
            MapsCommon.print(stormResult.getStormForecasts().get(0).getWeatherWindow().getPolygon().getType());

            TropicalStormLocationOptions locationOptions = new TropicalStormLocationOptions(storm.getYear(),
                storm.getBasinId(), storm.getGovId());
            StormLocationsResult locationsResult = client.getTropicalStormLocations(locationOptions);
            MapsCommon.print(locationsResult.getStormLocations().get(0).getCoordinates());

            MapsCommon.print(client.searchTropicalStorm(storm.getYear(), storm.getBasinId(), storm.getGovId()));
        }
    }
}
