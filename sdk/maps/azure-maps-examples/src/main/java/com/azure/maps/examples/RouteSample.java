package com.azure.maps.examples;

import java.io.IOException;
import java.util.Arrays;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.maps.route.RouteClient;
import com.azure.maps.route.RouteClientBuilder;
import com.azure.maps.route.models.BatchRequest;
import com.azure.maps.route.models.JsonFormat;
import com.azure.maps.route.models.ResponseFormat;
import com.azure.maps.route.models.RouteDirectionParameters;
import com.azure.maps.route.models.RouteMatrixQuery;

import reactor.core.publisher.Mono;

public class RouteSample {

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
        RouteClientBuilder builder = new RouteClientBuilder();
        builder.addPolicy(subscriptionKeyPolicy);
        builder.httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));
        RouteClient client = builder.buildClient();

        /* One-shot operations */

        System.out.println("Get route directions");
        MapsCommon.print(client.getRouteDirections(ResponseFormat.JSON, "52.50931,13.42936:52.50274,13.43872",
            null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null));

        System.out.println("Get route range");
        MapsCommon.print(client.getRouteRange(ResponseFormat.JSON, Arrays.asList(50.97452,5.86605), null,
                null, 6000.0, null, null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null));

        RouteDirectionParameters routeDirectionParameters = MapsCommon.readJson(
            MapsCommon.readContent(MapsCommon.getResource("/route_directions_request_body.json")),
            RouteDirectionParameters.class);

        System.out.println("Get route parameters");
        MapsCommon.print(client.getRouteDirectionsWithAdditionalParameters(ResponseFormat.JSON, "52.50931,13.42936:52.50274,13.43872",
            routeDirectionParameters, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null));

        /* Batch operations */
        BatchRequest batchRequest = MapsCommon.readJson(
            MapsCommon.readContent(MapsCommon.getResource("/route_directions_batch_request_body.json")),
            BatchRequest.class);

        System.out.println("Request route directions batch sync");
        MapsCommon.print(client.requestRouteDirectionsBatchSync(JsonFormat.JSON, batchRequest));

        System.out.println("Request route directions batch async");
        MapsCommon.print(client.beginRequestRouteDirectionsBatch(JsonFormat.JSON, batchRequest).getFinalResult().getBatchSummary());

        RouteMatrixQuery routeMatrixQuery = MapsCommon.readJson(
                MapsCommon.readContent(MapsCommon.getResource("/route_matrix_request_body.json")),
                RouteMatrixQuery.class);

        System.out.println("Request route matrix sync");
        MapsCommon.print(client.requestRouteMatrixSync(JsonFormat.JSON,
            routeMatrixQuery, Boolean.TRUE, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null));

        System.out.println("Post route matrix async");
        MapsCommon.print(client.beginRequestRouteMatrix(JsonFormat.JSON,
            routeMatrixQuery, Boolean.FALSE, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null).getFinalResult().getSummary());
    }
}
