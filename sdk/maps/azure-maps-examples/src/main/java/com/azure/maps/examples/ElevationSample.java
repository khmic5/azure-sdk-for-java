// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.maps.examples;

import java.util.Arrays;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.maps.elevation.ElevationClient;
import com.azure.maps.elevation.ElevationClientBuilder;
import com.azure.maps.elevation.models.ElevationResult;
import com.azure.maps.elevation.models.JsonFormat;
import com.azure.maps.elevation.models.LatLongPairAbbreviated;
import com.fasterxml.jackson.core.JsonProcessingException;

import reactor.core.publisher.Mono;

public class ElevationSample {
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
        ElevationClientBuilder builder = new ElevationClientBuilder();
        builder.addPolicy(subscriptionKeyPolicy);
        ElevationClient client = builder.buildClient();

        System.out.println("Get Data for bounding box");
        MapsCommon.print(client.getDataForBoundingBox(JsonFormat.JSON,
            Arrays.asList(-121.66853362143818f, 46.84646479863713f, -121.65853362143818f, 46.85646479863713f),
            3, 3));

        System.out.println("Get Data for points");
        MapsCommon.print(client.getDataForPoints(JsonFormat.JSON,
            Arrays.asList("-121.66853362143818,46.84646479863713")));

        // TODO cannot send multiple points for commented paths
        // System.out.println("Get Data for polyline");
        // MapsCommon.print(client.getElevations().getDataForPolyline(ResponseFormat.JSON,
        // Arrays.asList("-121.66853362143818,46.84646479863713",
        // "-121.65853362143818,46.85646479863713")));

        // CoordinatesPairAbbreviated coord1 = new
        // CoordinatesPairAbbreviated().setLat(46.84646479863713).setLon(-121.66853362143818);
        // CoordinatesPairAbbreviated coord2 = new
        // CoordinatesPairAbbreviated().setLat(46.856464798637127).setLon(-121.68853362143818);
        // System.out.println("Get Data for multiple points");
        // MapsCommon.print(client.getElevations().postDataForPoints(ResponseFormat.JSON,
        // Arrays.asList(coord1, coord2)));

        LatLongPairAbbreviated coord1 = new LatLongPairAbbreviated().setLat(46.84646479863713)
            .setLon(-121.66853362143818);
        LatLongPairAbbreviated coord2 = new LatLongPairAbbreviated().setLat(46.856464798637127)
            .setLon(-121.68853362143818);

        ElevationResult result = client.postDataForPolyline(JsonFormat.JSON,
            Arrays.asList(coord1, coord2), 10);
        System.out.println("Get Data for long polyline");
        MapsCommon.print(result);
    }
}
