package com.azure.maps.examples;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.maps.render.RenderClient;
import com.azure.maps.render.RenderClientBuilder;
import com.azure.maps.render.RenderV2Client;
import com.azure.maps.render.models.MapImageStyle;
import com.azure.maps.render.models.MapImageryStyle;
import com.azure.maps.render.models.MapTileLayer;
import com.azure.maps.render.models.MapTileStyle;
import com.azure.maps.render.models.RasterTileFormat;
import com.azure.maps.render.models.StaticMapLayer;
import com.azure.maps.render.models.TextFormat;
import com.azure.maps.render.models.TileFormat;
import com.azure.maps.render.models.TilesetID;

import reactor.core.publisher.Mono;

public class RenderSamples {
    public static void main(String[] args) throws IOException {
        String statesetId = "";

        if (args.length == 1) {
            statesetId = args[0];
        }
        else {
            System.out.println("Usage RenderSamples.java <statesetId>");
        }

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
        DefaultAzureCredential defaultCreds = new DefaultAzureCredentialBuilder().build();

        // authenticate and create search client
        RenderClientBuilder builder = new RenderClientBuilder();
        builder.addPolicy(subscriptionKeyPolicy);
        RenderClient client = builder.buildRenderClient();
        RenderV2Client v2Client = builder.buildRenderV2Client();

        System.out.println("Get copyright for caption");
        MapsCommon.print(client.getCopyrightCaption(TextFormat.JSON));

        System.out.println("Get copyright for tile");
        MapsCommon.print(client.getCopyrightForTile(TextFormat.JSON, 6, 9, 22, null));

        System.out.println("Get copyright for world");
        MapsCommon.print(client.getCopyrightForWorld(TextFormat.JSON, null));

        System.out.println("Get copyright from bounding box");
        MapsCommon.print(client.getCopyrightFromBoundingBox(TextFormat.JSON, "52.41064,4.84228",
                "52.41072,4.84239", null));

        System.out.println("Get map imagery tile");
        openImageFile(client.getMapImageryTile(RasterTileFormat.PNG, MapImageryStyle.SATELLITE, 6, 10, 22));

        /*
        System.out.println("Get map satelite tile");
        openImageFile(client.getRenders().getMapStateTilePreview(6, 10, 22, statesetId));
        */

        System.out.println("Get map static image");
        openImageFile(client.getMapStaticImage(RasterTileFormat.PNG, StaticMapLayer.BASIC, MapImageStyle.DARK, 2,
            null, "1.355233,42.982261,24.980233,56.526017", null, null, null, null, null, null));

        System.out.println("Get map tile");
        openImageFile(client.getMapTile(TileFormat.PNG, MapTileLayer.BASIC, MapTileStyle.MAIN,
            6, 10, 22, null, null, null));

        System.out.println("Get map tile for V2");
        openImageFile(v2Client.getMapTilePreview(TilesetID.MICROSOFT_BASE_HYBRID_ROAD, 6, 10, 22, null,
                null, null, null));
    }

    public static void openImageFile(InputStream stream) throws IOException {
        File file = File.createTempFile("image", ".png");
        Files.copy(stream, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
        Desktop.getDesktop().open(file);
    }
}
