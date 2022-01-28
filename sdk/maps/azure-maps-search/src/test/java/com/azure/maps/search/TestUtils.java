package com.azure.maps.search;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
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
<<<<<<< HEAD
<<<<<<< HEAD
import com.azure.maps.search.models.BatchReverseSearchResult;
import com.azure.maps.search.models.BatchSearchResult;
=======
import com.azure.maps.search.models.FuzzySearchOptions;
>>>>>>> 65e0863502 (updated testing)
=======
import com.azure.maps.search.models.BatchReverseSearchResult;
import com.azure.maps.search.models.BatchSearchResult;
>>>>>>> a272f1c91a (completed basic client test cases)
import com.azure.maps.search.models.PointOfInterestCategoryTreeResult;
import com.azure.maps.search.models.Polygon;
import com.azure.maps.search.models.ReverseSearchAddressResult;
import com.azure.maps.search.models.ReverseSearchCrossStreetAddressResult;
import com.azure.maps.search.models.SearchAddressResult;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

import org.junit.jupiter.params.provider.Arguments;


public class TestUtils {

    static final String FAKE_API_KEY = "1234567890";
    public static final Duration DEFAULT_POLL_INTERVAL = Duration.ofSeconds(30);

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    static Polygon getPolygon(InputStream is) throws IOException {
=======
    static Polygon getPolygon(File file) throws IOException {
>>>>>>> 42452b0a73 (finished functional test cases)
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<PolygonPrivate> interimType = new TypeReference<PolygonPrivate>(){};
        byte[] data = null;
        data = is.readAllBytes();
        PolygonPrivate polygonPrivate = null;
        polygonPrivate = jacksonAdapter.<PolygonPrivate>deserialize(data, interimType.getJavaType(),
               SerializerEncoding.JSON);
=======
    static Polygon getPolygon(File file) {
=======
    static Polygon getPolygon(InputStream is) {
>>>>>>> 048666b00e (fixed filepath)
=======
    static Polygon getPolygon(InputStream is) throws IOException {
>>>>>>> f8c325f5c1 (fixed pr changes)
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<PolygonPrivate> interimType = new TypeReference<PolygonPrivate>(){};
        byte[] data = null;
        data = is.readAllBytes();
        PolygonPrivate polygonPrivate = null;
        polygonPrivate = jacksonAdapter.<PolygonPrivate>deserialize(data, interimType.getJavaType(),
               SerializerEncoding.JSON);
<<<<<<< HEAD
        } catch (IOException e) {
            Assertions.fail("Unable to parse polygon json file");
        }
>>>>>>> 3fe6158c8c (removed try catch in tests)
=======
>>>>>>> f8c325f5c1 (fixed pr changes)
        Polygon polygon = Utility.toPolygon(polygonPrivate);
        return polygon;
    }

<<<<<<< HEAD
<<<<<<< HEAD
    static List<Polygon> getMultiPolygonsResults() throws IOException {
=======
    static List<Polygon> getMultiPolygonsResults() {
>>>>>>> 3fe6158c8c (removed try catch in tests)
=======
    static List<Polygon> getMultiPolygonsResults() throws IOException {
>>>>>>> f8c325f5c1 (fixed pr changes)
        List<Polygon> result = new ArrayList<>();
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 048666b00e (fixed filepath)
        InputStream is = ClassLoader.getSystemResourceAsStream("polygon1.json");
        Polygon polygon1 = TestUtils.getPolygon(is);
        InputStream is2 = ClassLoader.getSystemResourceAsStream("polygon2.json");
        Polygon polygon2 = TestUtils.getPolygon(is2);
<<<<<<< HEAD
=======
        File file1 = new File("src/main/resources/polygon1.json");
        Polygon polygon1 = TestUtils.getPolygon(file1);
        File file2 = new File("src/main/resources/polygon2.json");
        Polygon polygon2 = TestUtils.getPolygon(file2);
>>>>>>> 42452b0a73 (finished functional test cases)
=======
>>>>>>> 048666b00e (fixed filepath)
        result.add(polygon1);
        result.add(polygon2);
        return result;
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    static SearchAddressResult getSearchAddressResult(byte[] data) throws IOException {
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<SearchAddressResultPrivate> interimType = new TypeReference<SearchAddressResultPrivate>(){};
        SearchAddressResultPrivate searchAddressResultPrivate = null;
        searchAddressResultPrivate = jacksonAdapter.<SearchAddressResultPrivate>deserialize(data, interimType.getJavaType(),
               SerializerEncoding.JSON);
        return Utility.toSearchAddressResult(searchAddressResultPrivate);
    }

    static SearchAddressResult getExpectedFuzzySearchResults() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("searchaddressresult.json");
        byte[] data = null;
        data = is.readAllBytes();
        return getSearchAddressResult(data);
    }

    static SearchAddressResult getExpectedSearchPointOfInterestResults() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("searchpointofinterestresult.json");
        byte[] data = null;
        data = is.readAllBytes();
        return getSearchAddressResult(data);
=======
    static SearchAddressResult getSearchAddressResult(File file) throws IOException {
=======
    static SearchAddressResult getSearchAddressResult(File file) {
>>>>>>> 3fe6158c8c (removed try catch in tests)
=======
    static SearchAddressResult getSearchAddressResult(byte[] data) {
>>>>>>> 26420554db (fixed all pr changes)
=======
    static SearchAddressResult getSearchAddressResult(byte[] data) throws IOException {
>>>>>>> f8c325f5c1 (fixed pr changes)
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<SearchAddressResultPrivate> interimType = new TypeReference<SearchAddressResultPrivate>(){};
        SearchAddressResultPrivate searchAddressResultPrivate = null;
        searchAddressResultPrivate = jacksonAdapter.<SearchAddressResultPrivate>deserialize(data, interimType.getJavaType(),
               SerializerEncoding.JSON);
        return Utility.toSearchAddressResult(searchAddressResultPrivate);
    }

    static SearchAddressResult getExpectedFuzzySearchResults() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("searchaddressresult.json");
        byte[] data = null;
        data = is.readAllBytes();
        return getSearchAddressResult(data);
    }

    static SearchAddressResult getExpectedSearchPointOfInterestResults() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("searchpointofinterestresult.json");
        byte[] data = null;
        data = is.readAllBytes();
        return getSearchAddressResult(data);
    }

    static SearchAddressResult getExpectedSearchNearbyPointOfInterestResults() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("searchnearbypointofinterestresult.json");
        byte[] data = null;
        data = is.readAllBytes();
        return getSearchAddressResult(data);
    }

<<<<<<< HEAD
    static SearchAddressResult getExpectedSearchPointOfInterestCategoryResults() {
<<<<<<< HEAD
        File file = new File("src/main/resources/searchpointofinterestcategoryresult.json");
        return getSearchAddressResult(file);
>>>>>>> 42452b0a73 (finished functional test cases)
=======
=======
    static SearchAddressResult getExpectedSearchPointOfInterestCategoryResults() throws IOException {
>>>>>>> f8c325f5c1 (fixed pr changes)
        InputStream is = ClassLoader.getSystemResourceAsStream("searchpointofinterestcategoryresult.json");
        byte[] data = null;
        data = is.readAllBytes();
        return getSearchAddressResult(data);
>>>>>>> 26420554db (fixed all pr changes)
    }

<<<<<<< HEAD
<<<<<<< HEAD
    static SearchAddressResult getExpectedSearchNearbyPointOfInterestResults() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("searchnearbypointofinterestresult.json");
        byte[] data = null;
        data = is.readAllBytes();
        return getSearchAddressResult(data);
    }

    static SearchAddressResult getExpectedSearchPointOfInterestCategoryResults() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("searchpointofinterestcategoryresult.json");
        byte[] data = null;
        data = is.readAllBytes();
        return getSearchAddressResult(data);
    }

    static PointOfInterestCategoryTreeResult getExpectedSearchPointOfInterestCategoryTreeResults() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("getpointofinterestcategorytreeresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<PointOfInterestCategoryTreeResult> interimType = new TypeReference<PointOfInterestCategoryTreeResult>(){};
        byte[] data = null;
        data = is.readAllBytes();
        PointOfInterestCategoryTreeResult pointOfInterestCategoryTreeResult = null;
        pointOfInterestCategoryTreeResult = jacksonAdapter.<PointOfInterestCategoryTreeResult>deserialize(data, interimType.getJavaType(),
               SerializerEncoding.JSON);
        return pointOfInterestCategoryTreeResult;
    }

<<<<<<< HEAD
    static SearchAddressResult getExpectedSearchAddressResults() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("searchaddressresult.json");
        byte[] data = null;
        data = is.readAllBytes();
        return getSearchAddressResult(data);
=======
    static SearchAddressResult getExpectedSearchAddressResults() throws StreamReadException, DatabindException, IOException {
=======
    static PointOfInterestCategoryTreeResult getExpectedSearchPointOfInterestCategoryTreeResults() {
=======
    static PointOfInterestCategoryTreeResult getExpectedSearchPointOfInterestCategoryTreeResults() throws IOException {
>>>>>>> f8c325f5c1 (fixed pr changes)
        InputStream is = ClassLoader.getSystemResourceAsStream("getpointofinterestcategorytreeresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<PointOfInterestCategoryTreeResult> interimType = new TypeReference<PointOfInterestCategoryTreeResult>(){};
        byte[] data = null;
        data = is.readAllBytes();
        PointOfInterestCategoryTreeResult pointOfInterestCategoryTreeResult = null;
        pointOfInterestCategoryTreeResult = jacksonAdapter.<PointOfInterestCategoryTreeResult>deserialize(data, interimType.getJavaType(),
               SerializerEncoding.JSON);
        return pointOfInterestCategoryTreeResult;
    }

<<<<<<< HEAD
    static SearchAddressResult getExpectedSearchAddressResults() {
<<<<<<< HEAD
>>>>>>> 3fe6158c8c (removed try catch in tests)
        File file = new File("src/main/resources/searchaddressresult.json");
        return getSearchAddressResult(file);
>>>>>>> 42452b0a73 (finished functional test cases)
=======
=======
    static SearchAddressResult getExpectedSearchAddressResults() throws IOException {
>>>>>>> f8c325f5c1 (fixed pr changes)
        InputStream is = ClassLoader.getSystemResourceAsStream("searchaddressresult.json");
        byte[] data = null;
        data = is.readAllBytes();
        return getSearchAddressResult(data);
>>>>>>> 26420554db (fixed all pr changes)
    }

<<<<<<< HEAD
<<<<<<< HEAD
    static ReverseSearchAddressResult getExpectedReverseSearchAddressResults() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("reversesearchaddressresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<ReverseSearchAddressResultPrivate> interimType = new TypeReference<ReverseSearchAddressResultPrivate>(){};
        byte[] data = null;
        data = is.readAllBytes();
        ReverseSearchAddressResultPrivate searchReverseAddressResultPrivate = null;
        searchReverseAddressResultPrivate = jacksonAdapter.<ReverseSearchAddressResultPrivate>deserialize(data, interimType.getJavaType(),
               SerializerEncoding.JSON);
=======
    static ReverseSearchAddressResult getExpectedReverseSearchAddressResults() {
=======
    static ReverseSearchAddressResult getExpectedReverseSearchAddressResults() throws IOException {
>>>>>>> f8c325f5c1 (fixed pr changes)
        InputStream is = ClassLoader.getSystemResourceAsStream("reversesearchaddressresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<ReverseSearchAddressResultPrivate> interimType = new TypeReference<ReverseSearchAddressResultPrivate>(){};
        byte[] data = null;
        data = is.readAllBytes();
        ReverseSearchAddressResultPrivate searchReverseAddressResultPrivate = null;
        searchReverseAddressResultPrivate = jacksonAdapter.<ReverseSearchAddressResultPrivate>deserialize(data, interimType.getJavaType(),
               SerializerEncoding.JSON);
<<<<<<< HEAD
        } catch (IOException e) {
            Assertions.fail("Unable to parse reversesearchaddressresult.json");
        }
>>>>>>> 3fe6158c8c (removed try catch in tests)
=======
>>>>>>> f8c325f5c1 (fixed pr changes)
        ReverseSearchAddressResult reverseSearchAddressResult = Utility.toReverseSearchAddressResult(searchReverseAddressResultPrivate);
        return reverseSearchAddressResult;
    }

<<<<<<< HEAD
<<<<<<< HEAD
    static ReverseSearchCrossStreetAddressResult getExpectedReverseSearchCrossStreetAddressResults() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("reversesearchcrossstreetaddressresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<ReverseSearchCrossStreetAddressResultPrivate> interimType = new TypeReference<ReverseSearchCrossStreetAddressResultPrivate>(){};
        byte[] data = null;
        data = is.readAllBytes();
        ReverseSearchCrossStreetAddressResultPrivate reverseSearchCrossStreetAddressResultPrivate = null;
        reverseSearchCrossStreetAddressResultPrivate = jacksonAdapter.<ReverseSearchCrossStreetAddressResultPrivate>deserialize(data, interimType.getJavaType(),
               SerializerEncoding.JSON);
=======
    static ReverseSearchCrossStreetAddressResult getExpectedReverseSearchCrossStreetAddressResults() {
=======
    static ReverseSearchCrossStreetAddressResult getExpectedReverseSearchCrossStreetAddressResults() throws IOException {
>>>>>>> f8c325f5c1 (fixed pr changes)
        InputStream is = ClassLoader.getSystemResourceAsStream("reversesearchcrossstreetaddressresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<ReverseSearchCrossStreetAddressResultPrivate> interimType = new TypeReference<ReverseSearchCrossStreetAddressResultPrivate>(){};
        byte[] data = null;
        data = is.readAllBytes();
        ReverseSearchCrossStreetAddressResultPrivate reverseSearchCrossStreetAddressResultPrivate = null;
        reverseSearchCrossStreetAddressResultPrivate = jacksonAdapter.<ReverseSearchCrossStreetAddressResultPrivate>deserialize(data, interimType.getJavaType(),
               SerializerEncoding.JSON);
<<<<<<< HEAD
        } catch (IOException e) {
            Assertions.fail("Unable to parse reversesearchcrossstreetaddressresult.json");
        }
>>>>>>> 3fe6158c8c (removed try catch in tests)
=======
>>>>>>> f8c325f5c1 (fixed pr changes)
        ReverseSearchCrossStreetAddressResult reverseSearchCrossStreetAddressResult = Utility.toReverseSearchCrossStreetAddressResult(reverseSearchCrossStreetAddressResultPrivate);
        return reverseSearchCrossStreetAddressResult;
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    static SearchAddressResult getExpectedSearchStructuredAddress() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("searchstructuredaddressresult.json");
        byte[] data = null;
        data = is.readAllBytes();
        return getSearchAddressResult(data);
    }

    static SearchAddressResult getExpectedSearchInsideGeometry() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("searchinsidegeometryresult.json");
        byte[] data = null;
        data = is.readAllBytes();
        return getSearchAddressResult(data);
=======
    static SearchAddressResult getExpectedSearchStructuredAddress() throws StreamReadException, DatabindException, IOException {
=======
    static SearchAddressResult getExpectedSearchStructuredAddress() {
<<<<<<< HEAD
>>>>>>> 3fe6158c8c (removed try catch in tests)
        File file = new File("src/main/resources/searchstructuredaddressresult.json");
        return getSearchAddressResult(file);
=======
=======
    static SearchAddressResult getExpectedSearchStructuredAddress() throws IOException {
>>>>>>> f8c325f5c1 (fixed pr changes)
        InputStream is = ClassLoader.getSystemResourceAsStream("searchstructuredaddressresult.json");
        byte[] data = null;
        data = is.readAllBytes();
        return getSearchAddressResult(data);
>>>>>>> 26420554db (fixed all pr changes)
    }

    static GeoObject getGeoObject(File file) throws IOException {
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<GeoObject> interimType = new TypeReference<GeoObject>(){};
        byte[] data = Files.readAllBytes(file.toPath());
        GeoObject obj = jacksonAdapter.<GeoObject>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        return obj;
    }

<<<<<<< HEAD
    static SearchAddressResult getExpectedSearchInsideGeometry() {
<<<<<<< HEAD
        File file = new File("src/main/resources/searchinsidegeometryresult.json");
        return getSearchAddressResult(file);
>>>>>>> 42452b0a73 (finished functional test cases)
=======
=======
    static SearchAddressResult getExpectedSearchInsideGeometry() throws IOException {
>>>>>>> f8c325f5c1 (fixed pr changes)
        InputStream is = ClassLoader.getSystemResourceAsStream("searchinsidegeometryresult.json");
        byte[] data = null;
        data = is.readAllBytes();
        return getSearchAddressResult(data);
>>>>>>> 26420554db (fixed all pr changes)
    }

    static GeoLineString getGeoLineString(File file) throws IOException {
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<GeoLineString> interimType = new TypeReference<GeoLineString>(){};
        byte[] data = Files.readAllBytes(file.toPath());
        GeoLineString obj = jacksonAdapter.<GeoLineString>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        return obj;
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> f8c325f5c1 (fixed pr changes)
    static SearchAddressResult getExpectedSearchAlongRoute() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("searchalongrouteresult.json");
        byte[] data = null;
        data = is.readAllBytes();
        return getSearchAddressResult(data);
    }

    static BatchSearchResult getExpectedBeginFuzzySearchBatch() throws StreamReadException, DatabindException, IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("beginfuzzysearchbatchresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<BatchSearchResult> interimType = new TypeReference<BatchSearchResult>(){};
        byte[] data = is.readAllBytes();
        BatchSearchResult expectedFuzzySearchBatch = jacksonAdapter.<BatchSearchResult>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        return expectedFuzzySearchBatch;
    }

    static BatchSearchResult getExpectedBeginSearchAddressBatch() throws StreamReadException, DatabindException, IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("beginsearchaddressbatchresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<BatchSearchResult> interimType = new TypeReference<BatchSearchResult>(){};
        byte[] data = is.readAllBytes();
        BatchSearchResult expectedSearchAddressBatch = jacksonAdapter.<BatchSearchResult>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        return expectedSearchAddressBatch;
    }

    static BatchReverseSearchResult getExpectedReverseSearchAddressBatch() throws StreamReadException, DatabindException, IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("beginreversesearchaddressbatchresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<BatchReverseSearchResult> interimType = new TypeReference<BatchReverseSearchResult>(){};
        byte[] data = is.readAllBytes();
        BatchReverseSearchResult expectedReverseSearchAddressBatch = jacksonAdapter.<BatchReverseSearchResult>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        return expectedReverseSearchAddressBatch;
    }

    static GeoObject getGeoObject(File file) throws IOException {
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<GeoObject> interimType = new TypeReference<GeoObject>(){};
        byte[] data = Files.readAllBytes(file.toPath());
        GeoObject obj = jacksonAdapter.<GeoObject>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        return obj;
    }
=======
    static SearchAddressResult getExpectedSearchAlongRoute() throws StreamReadException, DatabindException, IOException {
=======
    static SearchAddressResult getExpectedSearchAlongRoute() {
<<<<<<< HEAD
>>>>>>> 3fe6158c8c (removed try catch in tests)
        File file = new File("src/main/resources/searchalongrouteresult.json");
        return getSearchAddressResult(file);
=======
        InputStream is = ClassLoader.getSystemResourceAsStream("searchalongrouteresult.json");
        byte[] data = null;
        try {
            data = is.readAllBytes();
        } catch (IOException e) {
            Assertions.fail("Unable to read searchalongrouteresult.json");
        }
        return getSearchAddressResult(data);
>>>>>>> 26420554db (fixed all pr changes)
    }

    static BatchSearchResult getExpectedBeginFuzzySearchBatch() throws StreamReadException, DatabindException, IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("beginfuzzysearchbatchresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<BatchSearchResult> interimType = new TypeReference<BatchSearchResult>(){};
        byte[] data = is.readAllBytes();
        BatchSearchResult expectedFuzzySearchBatch = jacksonAdapter.<BatchSearchResult>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        return expectedFuzzySearchBatch;
    }

    static BatchSearchResult getExpectedBeginSearchAddressBatch() throws StreamReadException, DatabindException, IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("beginsearchaddressbatchresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<BatchSearchResult> interimType = new TypeReference<BatchSearchResult>(){};
        byte[] data = is.readAllBytes();
        BatchSearchResult expectedSearchAddressBatch = jacksonAdapter.<BatchSearchResult>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        return expectedSearchAddressBatch;
    }

    static BatchReverseSearchResult getExpectedReverseSearchAddressBatch() throws StreamReadException, DatabindException, IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("beginreversesearchaddressbatchresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<BatchReverseSearchResult> interimType = new TypeReference<BatchReverseSearchResult>(){};
        byte[] data = is.readAllBytes();
        BatchReverseSearchResult expectedReverseSearchAddressBatch = jacksonAdapter.<BatchReverseSearchResult>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        return expectedReverseSearchAddressBatch;
    }

<<<<<<< HEAD
>>>>>>> 65e0863502 (updated testing)

=======
>>>>>>> 26420554db (fixed all pr changes)
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