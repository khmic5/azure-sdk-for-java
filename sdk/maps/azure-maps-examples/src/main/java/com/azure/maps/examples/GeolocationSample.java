package com.azure.maps.examples;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.maps.geolocation.GeolocationClient;
import com.azure.maps.geolocation.GeolocationClientBuilder;
import com.azure.maps.geolocation.models.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;

import reactor.core.publisher.Mono;

public class GeolocationSample {
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

        // authenticate and create search client
        GeolocationClientBuilder builder = new GeolocationClientBuilder();
        builder.addPolicy(subscriptionKeyPolicy);
        GeolocationClient client = builder.buildClient();

        // one-off operations
        System.out.println("Get location by ip");
        MapsCommon.print(client.getLocation(JsonFormat.JSON, "131.107.0.89"));
    }
}
