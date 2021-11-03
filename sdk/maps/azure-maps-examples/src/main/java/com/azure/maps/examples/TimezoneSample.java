package com.azure.maps.examples;

import java.util.Arrays;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.maps.timezone.TimezoneClient;
import com.azure.maps.timezone.TimezoneClientBuilder;
import com.azure.maps.timezone.models.JsonFormat;
import com.azure.maps.timezone.models.TimezoneOptions;
import com.fasterxml.jackson.core.JsonProcessingException;

import reactor.core.publisher.Mono;

public class TimezoneSample {
    public static void main(String[] args) throws JsonProcessingException {
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
        TimezoneClientBuilder builder = new TimezoneClientBuilder();
        builder.addPolicy(subscriptionKeyPolicy);
        builder.httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));
        TimezoneClient client = builder.buildClient();

        System.out.println("Get Timezone By Coordinate");
        MapsCommon.print(client.getTimezoneByCoordinates(JsonFormat.JSON,
            Arrays.asList(47.0, -122.0), null, TimezoneOptions.ALL, null, null, null));

        System.out.println("Get Timezone By Id");
        MapsCommon.print(client.getTimezoneByID(JsonFormat.JSON, "Asia/Bahrain", null,
            TimezoneOptions.ALL, null, null, null));

        System.out.println("Get Timezone Enum IANA");
        MapsCommon.print(client.getIanaTimezoneIds(JsonFormat.JSON));

        System.out.println("Get Timezone Enum Windows");
        MapsCommon.print(client.getWindowsTimezoneIds(JsonFormat.JSON));

        System.out.println("Get Timezone IANA Version");
        MapsCommon.print(client.getIanaVersion(JsonFormat.JSON));

        System.out.println("Get Timezone Windows to IANA");
        MapsCommon.print(client.convertWindowsTimezoneToIana(JsonFormat.JSON, "Samoa Standard Time", null));
    }
}
