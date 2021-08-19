package com.azure.maps.examples;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.rest.StreamResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.maps.render.RenderManager;
import com.azure.maps.render.fluent.RenderClient;
import com.azure.maps.render.models.MapImageStyle;
import com.azure.maps.render.models.MapImageryStyle;
import com.azure.maps.render.models.MapTileLayer;
import com.azure.maps.render.models.MapTileSize;
import com.azure.maps.render.models.MapTileStyle;
import com.azure.maps.render.models.RasterTileFormat;
import com.azure.maps.render.models.StaticMapLayer;
import com.azure.maps.render.models.TextFormat;
import com.azure.maps.render.models.TileFormat;
import com.azure.maps.render.models.TileSize;
import com.azure.maps.render.models.TilesetId;

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
        // TODO see why calling searches() here causes infinite recursion on Jackson
        RenderClient client = RenderManager
            .configure()
            .withPolicy(subscriptionKeyPolicy)
            .authenticate(defaultCreds, new AzureProfile(new AzureEnvironment(new HashMap<String, String>() {{
                put("managementEndpointUrl", "https://atlas.microsoft.com");
            }}))).serviceClient();

            client.getRenders().getCopyrightCaption(TextFormat.JSON);
        System.out.println("Get copyright for caption");
        MapsCommon.print(client.getRenders().getCopyrightCaption(TextFormat.JSON));

        System.out.println("Get copyright for tile");
        MapsCommon.print(client.getRenders().getCopyrightForTile(TextFormat.JSON, 6, 9, 22));

        System.out.println("Get copyright for world");
        // MapsCommon.print(client.getRenders().getCopyrightForWorld(TextFormat.JSON));

        System.out.println("Get copyright from bounding box");
        MapsCommon.print(client.getRenders().getCopyrightFromBoundingBox(TextFormat.JSON, "52.41064,4.84228",
                "52.41072,4.84239"));

        System.out.println("Get map imagery tile");
        openImageFile(
                client.getRenders().getMapImageryTile(RasterTileFormat.PNG, MapImageryStyle.SATELLITE, 6, 10, 22));

        /*
        System.out.println("Get map satelite tile");
        openImageFile(client.getRenders().getMapStateTilePreview(6, 10, 22, statesetId));
        */

        System.out.println("Get map static image");
        // client.getRenders().getMapStaticImage(RasterTileFormat.PNG);
        // throwing exception due to lack of parameters
        // StreamResponse response = client.getRenders().getMapStaticImageWithResponse(RasterTileFormat.PNG, StaticMapLayer.BASIC, MapImageStyle.DARK, 2,
        //                null, "1.355233,42.982261,24.980233,56.526017", null, null, null, null, null, null, null);

        // response.getValue().toStream().map

        /*
        openImageFile(
                );
        */

        System.out.println("Get map tile");
        openImageFile(client.getRenders().getMapTile(TileFormat.PNG, MapTileLayer.BASIC, MapTileStyle.MAIN,
            6, 10, 22));

        /*
        System.out.println("Get map tile for V2");
        openImageFile(client.getRenderV2s().getMapTilePreview(TilesetId.MICROSOFT_BASE, 6, 10, 22)) ; //, null,
                //TileSize.FIVE_ONE_TWO, null, null));
                */
    }

    public static void openImageFile(InputStream stream) throws IOException {
        File file = File.createTempFile("image", ".png");
        Files.copy(stream, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
        Desktop.getDesktop().open(file);
    }
}
