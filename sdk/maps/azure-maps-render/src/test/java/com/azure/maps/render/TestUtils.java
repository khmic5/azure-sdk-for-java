package com.azure.maps.render;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.azure.core.test.TestBase;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.core.util.serializer.TypeReference;
import com.azure.maps.render.implementation.helpers.Utility;
import com.azure.maps.render.implementation.models.MapTilesetPrivate;
import com.azure.maps.render.models.Copyright;
import com.azure.maps.render.models.CopyrightCaption;
import com.azure.maps.render.models.MapAttribution;
import com.azure.maps.render.models.MapTileset;

import org.junit.jupiter.params.provider.Arguments;

public class TestUtils {
    static final String FAKE_API_KEY = "1234567890";
    public static final Duration DEFAULT_POLL_INTERVAL = Duration.ofSeconds(30);

    static MapTileset getExpectedMapTileset() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("maptileset.json");
        byte[] data = null;
        data = is.readAllBytes();
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<MapTilesetPrivate> interimType = new TypeReference<MapTilesetPrivate>(){};
        MapTilesetPrivate mapTilesetPrivate = null;
        mapTilesetPrivate = jacksonAdapter.<MapTilesetPrivate>deserialize(data, interimType.getJavaType(),
        SerializerEncoding.JSON);
        return Utility.toMapTileset(mapTilesetPrivate);
    }

    static MapAttribution getExpectedMapAttribution() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("mapattribution.json");
        byte[] data = null;
        data = is.readAllBytes();
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<MapAttribution> interimType = new TypeReference<MapAttribution>(){};
        return jacksonAdapter.<MapAttribution>deserialize(data, interimType.getJavaType(),
        SerializerEncoding.JSON);
    }

    static CopyrightCaption getExpectedCopyrightCaption() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("copyrightcaption.json");
        byte[] data = null;
        data = is.readAllBytes();
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<CopyrightCaption> interimType = new TypeReference<CopyrightCaption>(){};
        return jacksonAdapter.<CopyrightCaption>deserialize(data, interimType.getJavaType(),
        SerializerEncoding.JSON);
    }

    static Copyright getExpectedCopyrightFromBoundingBox() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("getcopyrightfromboundingbox.json");
        byte[] data = null;
        data = is.readAllBytes();
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<Copyright> interimType = new TypeReference<Copyright>(){};
        return jacksonAdapter.<Copyright>deserialize(data, interimType.getJavaType(),
        SerializerEncoding.JSON);
    }

    static Copyright getExpectedCopyrightForTile() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("getcopyrightfortile.json");
        byte[] data = null;
        data = is.readAllBytes();
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<Copyright> interimType = new TypeReference<Copyright>(){};
        return jacksonAdapter.<Copyright>deserialize(data, interimType.getJavaType(),
        SerializerEncoding.JSON);
    }

    static Copyright getExpectedCopyrightForWorld() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("getcopyrightforworld.json");
        byte[] data = null;
        data = is.readAllBytes();
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<Copyright> interimType = new TypeReference<Copyright>(){};
        return jacksonAdapter.<Copyright>deserialize(data, interimType.getJavaType(),
        SerializerEncoding.JSON);
    }

    static byte[] getExpectedMapTile() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("maptile.png");
        return is.readAllBytes();
    }

    static byte[] getExpectedMapStaticImage() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("mapstaticimage.png");
        return is.readAllBytes();
    }

    /**
     * Returns a stream of arguments that includes all combinations of eligible {@link HttpClient HttpClients} and
     * service versions that should be tested.
     *
     * @return A stream of HttpClient and service version combinations to test.
     */
    public static Stream<Arguments> getTestParameters() {
        // when this issues is closed, the newer version of junit will have better support for
        // cartesian product of arguments - https://github.com/junit-team/junit5/issues/1427
        List<Arguments> argumentsList = new ArrayList<>();
        TestBase.getHttpClients()
            .forEach(httpClient -> {
                Arrays.stream(RenderServiceVersion.values())
                    .forEach(serviceVersion -> argumentsList.add(Arguments.of(httpClient, serviceVersion)));
            });
        return argumentsList.stream();
    }
}