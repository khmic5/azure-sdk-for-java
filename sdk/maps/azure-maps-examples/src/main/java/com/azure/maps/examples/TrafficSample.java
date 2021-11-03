package com.azure.maps.examples;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.maps.traffic.TrafficClient;
import com.azure.maps.traffic.TrafficClientBuilder;
import com.azure.maps.traffic.models.IncidentDetailStyle;
import com.azure.maps.traffic.models.ResponseFormat;
import com.azure.maps.traffic.models.TileFormat;
import com.azure.maps.traffic.models.TileIndex;
import com.azure.maps.traffic.models.TrafficFlowSegmentStyle;
import com.azure.maps.traffic.models.TrafficFlowTileStyle;
import com.azure.maps.traffic.models.TrafficIncidentDetail;
import com.azure.maps.traffic.models.TrafficIncidentTileStyle;

import reactor.core.publisher.Mono;

public class TrafficSample {
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
        TrafficClientBuilder builder = new TrafficClientBuilder();
        builder.addPolicy(subscriptionKeyPolicy);
        builder.httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));
        TrafficClient client = builder.buildClient();

        System.out.println("Get Traffic Flow Segment");
        MapsCommon.print(client.getTrafficFlowSegment(ResponseFormat.JSON, TrafficFlowSegmentStyle.ABSOLUTE,
            10, Arrays.asList(52.41072,4.84239), null, null, null));

        InputStream stream = client.getTrafficFlowTile(TileFormat.PNG, TrafficFlowTileStyle.ABSOLUTE, 12,
            new TileIndex().setX(2044).setY(1360), 2);
        System.out.println("Get Traffic Flow Tile");
        openImageFile(stream);

        TrafficIncidentDetail trafficIncidentDetailResult = client.getTrafficIncidentDetail(
            ResponseFormat.JSON, IncidentDetailStyle.S3,
            Arrays.asList(6841263.950712,511972.674418,6886056.049288,582676.925582), 11, "1335294634919",
            null, null, null, null, null);
        System.out.println("Get Traffic Incident Detail");
        MapsCommon.print(trafficIncidentDetailResult);

        stream = client.getTrafficIncidentTile(TileFormat.PNG, TrafficIncidentTileStyle.NIGHT, 10,
            new TileIndex().setX(175).setY(408), null);
        System.out.println("Get Traffic Incident Tile");
        openImageFile(stream);

        System.out.println("Get Traffic Incident Viewport");
        MapsCommon.print(client.getTrafficIncidentViewport(ResponseFormat.JSON,
                Arrays.asList(-939584.4813015489,-23954526.723651607,14675583.153020501,25043442.895825107), 2,
                Arrays.asList(-939584.4813018347,-23954526.723651607,14675583.153020501,25043442.8958229083), 2,
                false));
    }

    public static void openImageFile(InputStream stream) throws IOException {
        File file = File.createTempFile("image", ".png");
        Files.copy(stream, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
        Desktop.getDesktop().open(file);
    }
}
