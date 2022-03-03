package com.azure.maps.render;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpClient;
import com.azure.maps.render.implementation.helpers.Utility;
import com.azure.maps.render.models.BoundingBox;
import com.azure.maps.render.models.TileIndex;
import com.azure.maps.render.models.TilesetID;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import reactor.test.StepVerifier;

public class RenderAsyncClientTest extends RenderClientTestBase {
    private static final String DISPLAY_NAME_WITH_ARGUMENTS = "{displayName} with [{arguments}]";

    @BeforeAll
    public static void beforeAll() {
        StepVerifier.setDefaultTimeout(Duration.ofSeconds(30));
    }

    @AfterAll
    public static void afterAll() {
        StepVerifier.resetDefaultTimeout();
    }

    private RenderAsyncClient getRenderAsyncClient(HttpClient httpClient, RenderServiceVersion serviceVersion) {
        return getRenderAsyncClientBuilder(httpClient, serviceVersion).buildAsyncClient();
    }

    // Test async get map tile set
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.render.TestUtils#getTestParameters")
    public void testAsyncGetMapTileset(HttpClient httpClient, RenderServiceVersion serviceVersion) {
        RenderAsyncClient client = getRenderAsyncClient(httpClient, serviceVersion);
        new TilesetID();
        StepVerifier.create(client.getMapTileset(TilesetID.MICROSOFT_BASE))
        .assertNext(actualResults -> {
            try {
                validateGetMapTileset(TestUtils.getExpectedMapTileset(), actualResults);
            } catch (IOException e) {
                Assertions.fail("Unable to get map tileset");
            }
        }).verifyComplete();
    }

    // Test async get map tile set with response
    // Case 1: 200
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.render.TestUtils#getTestParameters")
    public void testAsyncGetMapTilesetWithResponse(HttpClient httpClient, RenderServiceVersion serviceVersion) {
        RenderAsyncClient client = getRenderAsyncClient(httpClient, serviceVersion);
        new TilesetID();
        StepVerifier.create(client.getMapTilesetWithResponse(TilesetID.MICROSOFT_BASE))
                .assertNext(response ->
                {
                    try {
                        validateGetMapTilesetWithResponse(TestUtils.getExpectedMapTileset(), 200, response);
                    } catch (IOException e) {
                        Assertions.fail("Unable to get map tile set");
                    }
                })
                .verifyComplete();
    }

    // Case 2: 400 invalid input
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.render.TestUtils#getTestParameters")
    public void testAsyncInvalidGetMapTilesetWithResponse(HttpClient httpClient, RenderServiceVersion serviceVersion) {
        RenderAsyncClient client = getRenderAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.getMapTilesetWithResponse(new TilesetID()))
                .verifyErrorSatisfies(ex -> {
                    final HttpResponseException httpResponseException = (HttpResponseException) ex;
                    assertEquals(400, httpResponseException.getResponse().getStatusCode());
                });
    }

    // Test async get map attribution 
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.render.TestUtils#getTestParameters")
    public void testAsyncGetMapAttribution(HttpClient httpClient, RenderServiceVersion serviceVersion) {
        RenderAsyncClient client = getRenderAsyncClient(httpClient, serviceVersion);
        List<Double> bounds = Arrays.asList(47.579490,-122.414162,47.668372,-122.247157);
        new TilesetID();
        StepVerifier.create(client.getMapAttribution(TilesetID.MICROSOFT_BASE, 6, Utility.toBoundingBox(bounds)))
        .assertNext(actualResults -> {
            try {
                validateGetMapAttribution(TestUtils.getExpectedMapAttribution(), actualResults);
            } catch (IOException e) {
                Assertions.fail("Unable to get map attribution");
            }
        }).verifyComplete();
    }

    // Test async get map attribution with response
    // Case 1: 200
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.render.TestUtils#getTestParameters")
    public void testAsyncGetMapAttributionWithResponse(HttpClient httpClient, RenderServiceVersion serviceVersion) {
        RenderAsyncClient client = getRenderAsyncClient(httpClient, serviceVersion);
        List<Double> bounds = Arrays.asList(47.579490,-122.414162,47.668372,-122.247157);
        new TilesetID();
        StepVerifier.create(client.getMapAttributionWithResponse(TilesetID.MICROSOFT_BASE, 6, Utility.toBoundingBox(bounds)))
                .assertNext(response ->
                {
                    try {
                        validateGetMapAttributionWithResponse(TestUtils.getExpectedMapAttribution(), 200, response);
                    } catch (IOException e) {
                        Assertions.fail("Unable to get map attribution");
                    }
                })
                .verifyComplete();
    }

    // Case 2: 400 invalid input
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.render.TestUtils#getTestParameters")
    public void testAsyncInvalidGetMapAttributionWithResponse(HttpClient httpClient, RenderServiceVersion serviceVersion) {
        RenderAsyncClient client = getRenderAsyncClient(httpClient, serviceVersion);
        List<Double> bounds = new ArrayList<>();
        StepVerifier.create(client.getMapAttributionWithResponse(new TilesetID(), 6, Utility.toBoundingBox(bounds)))
                .verifyErrorSatisfies(ex -> {
                    final HttpResponseException httpResponseException = (HttpResponseException) ex;
                    assertEquals(400, httpResponseException.getResponse().getStatusCode());
                });
    }

    // Test async get copyright caption
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.render.TestUtils#getTestParameters")
    public void testAsyncGetCopyrightCaption(HttpClient httpClient, RenderServiceVersion serviceVersion) {
        RenderAsyncClient client = getRenderAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.getCopyrightCaption())
        .assertNext(actualResults -> {
            try {
                validateGetCopyrightCaption(TestUtils.getExpectedCopyrightCaption(), actualResults);
            } catch (IOException e) {
                Assertions.fail("Unable to get copyright caption");
            }
        }).verifyComplete();
    }

    // Test async get map copyright caption with response
    // Case 1: 200
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.render.TestUtils#getTestParameters")
    public void testAsyncGetCopyrightCaptionWithResponse(HttpClient httpClient, RenderServiceVersion serviceVersion) {
        RenderAsyncClient client = getRenderAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.getCopyrightCaptionWithResponse())
                .assertNext(response ->
                {
                    try {
                        validateGetCopyrightCaptionWithResponse(TestUtils.getExpectedCopyrightCaption(), 200, response);
                    } catch (IOException e) {
                        Assertions.fail("Unable to get copyright caption");
                    }
                })
                .verifyComplete();
    }

    // Test async get copyright from bounding box
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.render.TestUtils#getTestParameters")
    public void testAsyncGetCopyrightFromBoundingBox(HttpClient httpClient, RenderServiceVersion serviceVersion) {
        RenderAsyncClient client = getRenderAsyncClient(httpClient, serviceVersion);
        BoundingBox boundingBox = new BoundingBox(52.41064, 4.84228, 52.41072, 4.84239);
        StepVerifier.create(client.getCopyrightFromBoundingBox(boundingBox, true))
        .assertNext(actualResults -> {
            try {
                validateGetCopyrightCaptionFromBoundingBox(TestUtils.getExpectedCopyrightFromBoundingBox(), actualResults);
            } catch (IOException e) {
                Assertions.fail("Unable to get copyright from bounding box");
            }
        }).verifyComplete();
    }

    // Test async get copyright from bounding box with response
    // Case 1: 200
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.render.TestUtils#getTestParameters")
    public void testAsyncGetCopyrightFromBoundingBoxWithResponse(HttpClient httpClient, RenderServiceVersion serviceVersion) {
        RenderAsyncClient client = getRenderAsyncClient(httpClient, serviceVersion);
        BoundingBox boundingBox = new BoundingBox(52.41064, 4.84228, 52.41072, 4.84239);
        StepVerifier.create(client.getCopyrightFromBoundingBoxWithResponse(boundingBox, true))
                .assertNext(response ->
                {
                    try {
                        validateGetCopyrightCaptionFromBoundingBoxWithResponse(TestUtils.getExpectedCopyrightFromBoundingBox(), 200, response);
                    } catch (IOException e) {
                        Assertions.fail("Unable to get copyright caption");
                    }
                })
                .verifyComplete();
    }

    // Case 2: 400 invalid input
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.render.TestUtils#getTestParameters")
    public void testAsyncInvalidGetCopyrightFromBoundingBoxWithResponse(HttpClient httpClient, RenderServiceVersion serviceVersion) {
        RenderAsyncClient client = getRenderAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.getCopyrightFromBoundingBoxWithResponse(new BoundingBox(-100, -100, -100, -100), true))
                .verifyErrorSatisfies(ex -> {
                    final HttpResponseException httpResponseException = (HttpResponseException) ex;
                    assertEquals(400, httpResponseException.getResponse().getStatusCode());
                });
    }

    // Test async get copyright for title
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.render.TestUtils#getTestParameters")
    public void testAsyncGetCopyrightForTitle(HttpClient httpClient, RenderServiceVersion serviceVersion) {
        RenderAsyncClient client = getRenderAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.getCopyrightForTile(new TileIndex().setX(9).setY(22).setZ(6), true))
        .assertNext(actualResults -> {
            try {
                validateGetCopyrightForTile(TestUtils.getExpectedCopyrightForTile(), actualResults);
            } catch (IOException e) {
                Assertions.fail("Unable to get copyright for title");
            }
        }).verifyComplete();
    }

    // Test async get copyright for title with response
    // Case 1: 200
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.render.TestUtils#getTestParameters")
    public void testAsyncGetCopyrightForTitleWithResponse(HttpClient httpClient, RenderServiceVersion serviceVersion) {
        RenderAsyncClient client = getRenderAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.getCopyrightForTileWithResponse(new TileIndex().setX(9).setY(22).setZ(6), true))
                .assertNext(response ->
                {
                    try {
                        validateGetCopyrightForTileWithResponse(TestUtils.getExpectedCopyrightForTile(), 200, response);
                    } catch (IOException e) {
                        Assertions.fail("Unable to get copyright for title");
                    }
                })
                .verifyComplete();
    }

    // Case 2: 400 invalid input
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.render.TestUtils#getTestParameters")
    public void testAsyncInvalidGetCopyrightForTitleWithResponse(HttpClient httpClient, RenderServiceVersion serviceVersion) {
        RenderAsyncClient client = getRenderAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.getCopyrightForTileWithResponse(new TileIndex().setX(9).setY(22).setZ(-100), true))
                .verifyErrorSatisfies(ex -> {
                    final HttpResponseException httpResponseException = (HttpResponseException) ex;
                    assertEquals(400, httpResponseException.getResponse().getStatusCode());
                });
    }

    // Test async get copyright for world
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.render.TestUtils#getTestParameters")
    public void testAsyncGetCopyrightForWorld(HttpClient httpClient, RenderServiceVersion serviceVersion) {
        RenderAsyncClient client = getRenderAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.getCopyrightForWorld(true))
        .assertNext(actualResults -> {
            try {
                validateGetCopyrightForWorld(TestUtils.getExpectedCopyrightForWorld(), actualResults);
            } catch (IOException e) {
                Assertions.fail("Unable to get copyright for world");
            }
        }).verifyComplete();
    }

    // Test async get copyright for world with response
    // Case 1: 200
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.render.TestUtils#getTestParameters")
    public void testAsyncGetCopyrightForWorldWithResponse(HttpClient httpClient, RenderServiceVersion serviceVersion) {
        RenderAsyncClient client = getRenderAsyncClient(httpClient, serviceVersion);
        StepVerifier.create(client.getCopyrightForWorldWithResponse(true))
                .assertNext(response ->
                {
                    try {
                        validateGetCopyrightForWorldWithResponse(TestUtils.getExpectedCopyrightForWorld(), 200, response);
                    } catch (IOException e) {
                        Assertions.fail("Unable to get copyright for world");
                    }
                })
                .verifyComplete();
    }
}