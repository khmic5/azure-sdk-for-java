package com.azure.maps.search.models;

import java.util.List;
import java.util.stream.Collectors;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.rest.Response;
import com.azure.maps.search.MapsSearchClient;
import com.azure.maps.search.MapsSearchClientBuilder;

import reactor.core.publisher.Mono;

public class Testing {
    public static void main(String[] args) {
        // build Client ID policy for use with Azure AD authentication
        HttpPipelinePolicy clientIdPolicy = new HttpPipelinePolicy() {
            @Override
            public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
                return Mono.defer(() -> {
                    context.getHttpRequest().setHeader("x-ms-client-id", System.getenv("CLIENT_ID"));
                    return next.process();
                });
            }
        };

        // build subscription policy for use with Shared Key Authentication
        HttpPipelinePolicy subscriptionKeyPolicy = new HttpPipelinePolicy() {
            @Override
            public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
                return Mono.defer(() -> {
                    // context.getHttpRequest().setUrl(context.getHttpRequest().getUrl().toString() + "&subscription-key="
                    //         + System.getenv("SUBSCRIPTION_KEY"));
                    context.getHttpRequest().setUrl(context.getHttpRequest().getUrl().toString() + "&subscription-key="
                            + "6f6kEhMW-khrzSkmqop49S6F3ZhP9wlmvliUJxi1AAo");
                    return next.process();
                });
            }
        };

        // use default credentials
        MapsSearchClientBuilder builder = new MapsSearchClientBuilder();
        builder.addPolicy(subscriptionKeyPolicy);
        builder.httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));
        MapsSearchClient client = builder.buildClient();
        
        //DefaultAzureCredential tokenCredential = new DefaultAzureCredentialBuilder().build();
        
/*
        System.out.println("Search Address:");

        // with options
        SearchAddressResult results = client.fuzzySearch(
            new FuzzySearchOptions("1 Microsoft Way", new LatLong(40.706270, -74.011454))
                .setTop(5));
    //    MapsCommon.print(results);

        // with response
        Response<SearchAddressResult> response = client.fuzzySearchWithResponse(
            new FuzzySearchOptions("Monaco").setEntityType(GeographicEntityType.COUNTRY)
                .setTop(5), null);
    //    MapsCommon.print(response.getStatusCode());
        String id = response.getValue().getResults().get(0).getDataSource().getGeometry().getId();

        // Get polygon -
        // https://docs.microsoft.com/en-us/rest/api/maps/search/get-search-polygon
        List<String> ids = results.getResults().stream()
            .filter(item -> item.getDataSource() != null && item.getDataSource().getGeometry() != null)
            .map(item -> item.getDataSource().getGeometry().getId())
            .collect(Collectors.toList());
        ids.add(id);

        if (ids != null && !ids.isEmpty()) {
            List<Polygon> l = client.getPolygons(ids);
            for (Polygon p : l) System.out.println(p.getGeometry());
        //    System.out.println("Get Polygon: " + ids);
            // MapsCommon.print(client.getPolygons(ids).get(1));
    //        MapsCommon.print(client.getPolygons(ids));  
    //        MapsCommon.print(client.getPolygonsWithResponse(ids, null).getValue().getClass());

       */     
 //       } 
    }
}
