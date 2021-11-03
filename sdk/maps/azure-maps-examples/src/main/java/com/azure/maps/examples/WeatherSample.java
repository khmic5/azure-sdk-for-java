package com.azure.maps.examples;

import java.io.IOException;
import java.util.Arrays;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.maps.weather.WeatherClient;
import com.azure.maps.weather.WeatherClientBuilder;
import com.azure.maps.weather.models.JsonFormat;

import reactor.core.publisher.Mono;

public class WeatherSample {
    public static void main(String[] args) throws IOException {
        // build Client ID policy for use with Azure AD authentication
        HttpPipelinePolicy clientIdPolicy = new HttpPipelinePolicy(){
            @Override
            public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
                return Mono.defer(() -> {
                    context.getHttpRequest().setHeader("x-ms-client-id", System.getenv("CLIENT_ID"));
                    return next.process();
                });
            }
        };

        // build subscription policy for use with Shared Key Authentication
        HttpPipelinePolicy subscriptionKeyPolicy = new HttpPipelinePolicy(){
            @Override
            public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
                return Mono.defer(() -> {
                    context.getHttpRequest().setUrl(context.getHttpRequest().getUrl().toString() + "&subscription-key=" + System.getenv("SUBSCRIPTION_KEY"));
                    return next.process();
                });
            }
        };

        // use default credentials
        WeatherClientBuilder builder = new WeatherClientBuilder();
        builder.addPolicy(subscriptionKeyPolicy);
        builder.httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));
        WeatherClient client = builder.buildClient();

        System.out.println("Get Current Conditions");
        MapsCommon.print(client.getCurrentConditions(JsonFormat.JSON, Arrays.asList(47.641268,-122.125679), null, null, null, null));

        System.out.println("Get Daily Forecast");
        MapsCommon.print(client.getDailyForecast(JsonFormat.JSON, Arrays.asList(62.6490341,30.0734812), null, 5, null));

        System.out.println("Get Daily Indices");
        MapsCommon.print(client.getDailyIndices(JsonFormat.JSON, Arrays.asList(43.84745,-79.37849), null, null, null, 11));

        System.out.println("Get Hourly Forecast");
        MapsCommon.print(client.getHourlyForecast(JsonFormat.JSON, Arrays.asList(47.632346,-122.138874), null, 12, null));

        System.out.println("Get Minute Forecast");
        MapsCommon.print(client.getMinuteForecast(JsonFormat.JSON, Arrays.asList(47.632346,-122.138874), 15, null));

        System.out.println("Get Quarter Day Forecast");
        MapsCommon.print(client.getQuarterDayForecast(JsonFormat.JSON, Arrays.asList(47.632346,-122.138874), null, 1, null));

        System.out.println("Get Severe Weather Alerts");
        MapsCommon.print(client.getSevereWeatherAlerts(JsonFormat.JSON, Arrays.asList(48.057,-81.091), null, null));

        System.out.println("Get Weather Along Route");
        MapsCommon.print(client.getWeatherAlongRoute(JsonFormat.JSON,
            "38.907,-77.037,0:38.907,-77.009,10:38.926,-76.928,20:39.033,-76.852,30:39.168,-76.732,40:39.269,-76.634,50:39.287,-76.612,60",
            null));
    }
}
