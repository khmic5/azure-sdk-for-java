package com.azure.maps.search;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.azure.core.http.HttpClient;
import com.azure.core.models.GeoLineString;
import com.azure.core.models.GeoObject;
import com.azure.core.test.TestBase;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.core.util.serializer.TypeReference;
import com.azure.maps.search.implementation.helpers.Utility;
import com.azure.maps.search.implementation.models.PolygonPrivate;
import com.azure.maps.search.implementation.models.ReverseSearchAddressResultPrivate;
import com.azure.maps.search.implementation.models.ReverseSearchCrossStreetAddressResultPrivate;
import com.azure.maps.search.implementation.models.SearchAddressResultPrivate;
import com.azure.maps.search.models.BatchReverseSearchResult;
import com.azure.maps.search.models.BatchSearchResult;
import com.azure.maps.search.models.PointOfInterestCategoryTreeResult;
import com.azure.maps.search.models.Polygon;
import com.azure.maps.search.models.ReverseSearchAddressResult;
import com.azure.maps.search.models.ReverseSearchCrossStreetAddressResult;
import com.azure.maps.search.models.SearchAddressResult;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.Arguments;


public class TestUtils {

    static final String FAKE_API_KEY = "1234567890";
    public static final Duration DEFAULT_POLL_INTERVAL = Duration.ofSeconds(30);

    static Polygon getPolygon(File file) {
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<PolygonPrivate> interimType = new TypeReference<PolygonPrivate>(){};
        byte[] data = null;
        try {
            data = Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            Assertions.fail("Unable to find polygon json file");
        }
        PolygonPrivate polygonPrivate = null;
        try {
            polygonPrivate = jacksonAdapter.<PolygonPrivate>deserialize(data, interimType.getJavaType(),
               SerializerEncoding.JSON);
        } catch (IOException e) {
            Assertions.fail("Unable to parse polygon json file");
        }
        Polygon polygon = Utility.toPolygon(polygonPrivate);
        return polygon;
    }

    static List<Polygon> getMultiPolygonsResults() {
        List<Polygon> result = new ArrayList<>();
        File file1 = new File("src/main/resources/polygon1.json");
        Polygon polygon1 = TestUtils.getPolygon(file1);
        File file2 = new File("src/main/resources/polygon2.json");
        Polygon polygon2 = TestUtils.getPolygon(file2);
        result.add(polygon1);
        result.add(polygon2);
        return result;
    }

    static SearchAddressResult getSearchAddressResult(File file) {
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<SearchAddressResultPrivate> interimType = new TypeReference<SearchAddressResultPrivate>(){};
        byte[] data = null;
        try {
            data = Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            Assertions.fail("Unable to find file");
        }
        SearchAddressResultPrivate searchAddressResultPrivate = null;
        try {
            searchAddressResultPrivate = jacksonAdapter.<SearchAddressResultPrivate>deserialize(data, interimType.getJavaType(),
               SerializerEncoding.JSON);
        } catch (IOException e) {
            Assertions.fail("unable to parse file");
        }
        return Utility.toSearchAddressResult(searchAddressResultPrivate);
    }

    static SearchAddressResult getExpectedFuzzySearchResults() {
        File file = new File("src/main/resources/searchaddressresult.json");
        return getSearchAddressResult(file);
    }


    static SearchAddressResult getExpectedSearchPointOfInterestResults() {
        File file = new File("src/main/resources/searchpointofinterestresult.json");
        return getSearchAddressResult(file);
    }

    static SearchAddressResult getExpectedSearchNearbyPointOfInterestResults() {
        File file = new File("src/main/resources/searchnearbypointofinterestresult.json");
        return getSearchAddressResult(file);
    }

    static SearchAddressResult getExpectedSearchPointOfInterestCategoryResults() {
        File file = new File("src/main/resources/searchpointofinterestcategoryresult.json");
        return getSearchAddressResult(file);
    }

    static PointOfInterestCategoryTreeResult getExpectedSearchPointOfInterestCategoryTreeResults() {
        File file = new File("src/main/resources/getpointofinterestcategorytreeresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<PointOfInterestCategoryTreeResult> interimType = new TypeReference<PointOfInterestCategoryTreeResult>(){};
        byte[] data = null;
        try {
            data = Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            Assertions.fail("Unable to find getpointofinterestcategorytreeresult.json");
        }
        PointOfInterestCategoryTreeResult pointOfInterestCategoryTreeResult = null;
        try {
            pointOfInterestCategoryTreeResult = jacksonAdapter.<PointOfInterestCategoryTreeResult>deserialize(data, interimType.getJavaType(),
               SerializerEncoding.JSON);
        } catch (IOException e) {
            Assertions.fail("Unable to parse getpointofinterestcategorytreeresult.json");
        }
        return pointOfInterestCategoryTreeResult;
    }

    static SearchAddressResult getExpectedSearchAddressResults() {
        File file = new File("src/main/resources/searchaddressresult.json");
        return getSearchAddressResult(file);
    }

    static ReverseSearchAddressResult getExpectedReverseSearchAddressResults() {
        File file = new File("src/main/resources/reversesearchaddressresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<ReverseSearchAddressResultPrivate> interimType = new TypeReference<ReverseSearchAddressResultPrivate>(){};
        byte[] data = null;
        try {
            data = Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            Assertions.fail("Unable to find reversesearchaddressresult.json");
        }
        ReverseSearchAddressResultPrivate searchReverseAddressResultPrivate = null;
        try {
            searchReverseAddressResultPrivate = jacksonAdapter.<ReverseSearchAddressResultPrivate>deserialize(data, interimType.getJavaType(),
               SerializerEncoding.JSON);
        } catch (IOException e) {
            Assertions.fail("Unable to parse reversesearchaddressresult.json");
        }
        ReverseSearchAddressResult reverseSearchAddressResult = Utility.toReverseSearchAddressResult(searchReverseAddressResultPrivate);
        return reverseSearchAddressResult;
    }

    static ReverseSearchCrossStreetAddressResult getExpectedReverseSearchCrossStreetAddressResults() {
        File file = new File("src/main/resources/reversesearchcrossstreetaddressresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<ReverseSearchCrossStreetAddressResultPrivate> interimType = new TypeReference<ReverseSearchCrossStreetAddressResultPrivate>(){};
        byte[] data = null;
        try {
            data = Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            Assertions.fail("Unable to find reversesearchcrossstreetaddressresult.json");
        }
        ReverseSearchCrossStreetAddressResultPrivate reverseSearchCrossStreetAddressResultPrivate = null;
        try {
            reverseSearchCrossStreetAddressResultPrivate = jacksonAdapter.<ReverseSearchCrossStreetAddressResultPrivate>deserialize(data, interimType.getJavaType(),
               SerializerEncoding.JSON);
        } catch (IOException e) {
            Assertions.fail("Unable to parse reversesearchcrossstreetaddressresult.json");
        }
        ReverseSearchCrossStreetAddressResult reverseSearchCrossStreetAddressResult = Utility.toReverseSearchCrossStreetAddressResult(reverseSearchCrossStreetAddressResultPrivate);
        return reverseSearchCrossStreetAddressResult;
    }

    static SearchAddressResult getExpectedSearchStructuredAddress() {
        File file = new File("src/main/resources/searchstructuredaddressresult.json");
        return getSearchAddressResult(file);
    }

    static GeoObject getGeoObject(File file) throws IOException {
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<GeoObject> interimType = new TypeReference<GeoObject>(){};
        byte[] data = Files.readAllBytes(file.toPath());
        GeoObject obj = jacksonAdapter.<GeoObject>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        return obj;
    }

    static SearchAddressResult getExpectedSearchInsideGeometry() {
        File file = new File("src/main/resources/searchinsidegeometryresult.json");
        return getSearchAddressResult(file);
    }

    static GeoLineString getGeoLineString(File file) throws IOException {
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<GeoLineString> interimType = new TypeReference<GeoLineString>(){};
        byte[] data = Files.readAllBytes(file.toPath());
        GeoLineString obj = jacksonAdapter.<GeoLineString>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        return obj;
    }

    static SearchAddressResult getExpectedSearchAlongRoute() {
        File file = new File("src/main/resources/searchalongrouteresult.json");
        return getSearchAddressResult(file);
    }

    static BatchSearchResult getExpectedBeginFuzzySearchBatch() throws StreamReadException, DatabindException, IOException {
        File file = new File("src/main/resources/beginfuzzysearchbatchresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<BatchSearchResult> interimType = new TypeReference<BatchSearchResult>(){};
        byte[] data = Files.readAllBytes(file.toPath());
        BatchSearchResult expectedFuzzySearchBatch = jacksonAdapter.<BatchSearchResult>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        return expectedFuzzySearchBatch;
    }

    static BatchSearchResult getExpectedBeginSearchAddressBatch() throws StreamReadException, DatabindException, IOException {
        File file = new File("src/main/resources/beginsearchaddressbatchresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<BatchSearchResult> interimType = new TypeReference<BatchSearchResult>(){};
        byte[] data = Files.readAllBytes(file.toPath());
        BatchSearchResult expectedSearchAddressBatch = jacksonAdapter.<BatchSearchResult>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        return expectedSearchAddressBatch;
    }

    static BatchReverseSearchResult getExpectedReverseSearchAddressBatch() throws StreamReadException, DatabindException, IOException {
        File file = new File("src/main/resources/beginreversesearchaddressbatchresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<BatchReverseSearchResult> interimType = new TypeReference<BatchReverseSearchResult>(){};
        byte[] data = Files.readAllBytes(file.toPath());
        BatchReverseSearchResult expectedReverseSearchAddressBatch = jacksonAdapter.<BatchReverseSearchResult>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        return expectedReverseSearchAddressBatch;
    }


    // file inside helpers --> implementation --> com/azure/maps/search/java --> resources

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
                Arrays.stream(MapsSearchServiceVersion.values())
                    .forEach(serviceVersion -> argumentsList.add(Arguments.of(httpClient, serviceVersion)));
            });
        return argumentsList.stream();
    }
}
