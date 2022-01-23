package com.azure.maps.search;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.azure.core.http.HttpClient;
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

    /**
     * Helper method to get the expected Fuzzy Search Results
     *
     * @return A {@link SearchAddressResult}.
     */
    static SearchAddressResult getExpectedFuzzySearchResults() throws IOException {
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<SearchAddressResultPrivate> interimType = new TypeReference<SearchAddressResultPrivate>(){};
        File file = new File("src/main/resources/searchaddressresult.json");
        byte[] data = Files.readAllBytes(file.toPath());
        SearchAddressResultPrivate searchAddressResultPrivate = jacksonAdapter.<SearchAddressResultPrivate>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        return Utility.toSearchAddressResult(searchAddressResultPrivate);
    }

    static Polygon getPolygon(File file) throws IOException {
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<PolygonPrivate> interimType = new TypeReference<PolygonPrivate>(){};
        byte[] data = Files.readAllBytes(file.toPath());
        PolygonPrivate polygonPrivate = jacksonAdapter.<PolygonPrivate>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        Polygon polygon = Utility.toPolygon(polygonPrivate);
        return polygon;
    }

    static List<Polygon> getMultiPolygonsResults() throws StreamReadException, DatabindException, IOException {
        List<Polygon> result = new ArrayList<>();
        File file1 = new File("src/main/resources/polygon1.json");
        Polygon polygon1 = TestUtils.getPolygon(file1);
        File file2 = new File("src/main/resources/polygon1.json");
        Polygon polygon2 = TestUtils.getPolygon(file2);
        result.add(polygon1);
        result.add(polygon2);
        return result;
    }

    static SearchAddressResult getExpectedSearchPointOfInterestResults() throws StreamReadException, DatabindException, IOException {
        File file = new File("src/main/resources/searchpointofinterestresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<SearchAddressResultPrivate> interimType = new TypeReference<SearchAddressResultPrivate>(){};
        byte[] data = Files.readAllBytes(file.toPath());
        SearchAddressResultPrivate searchAddressResultPrivate = jacksonAdapter.<SearchAddressResultPrivate>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        SearchAddressResult searchAddressResult = Utility.toSearchAddressResult(searchAddressResultPrivate);
        return searchAddressResult;
    }

    static SearchAddressResult getExpectedSearchNearbyPointOfInterestResults() throws StreamReadException, DatabindException, IOException {
        File file = new File("src/main/resources/searchnearbypointofinterestresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<SearchAddressResultPrivate> interimType = new TypeReference<SearchAddressResultPrivate>(){};
        byte[] data = Files.readAllBytes(file.toPath());
        SearchAddressResultPrivate searchAddressResultPrivate = jacksonAdapter.<SearchAddressResultPrivate>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        SearchAddressResult searchAddressResult = Utility.toSearchAddressResult(searchAddressResultPrivate);
        return searchAddressResult;
    }

    static SearchAddressResult getExpectedSearchPointOfInterestCategoryResults() throws StreamReadException, DatabindException, IOException {
        File file = new File("src/main/resources/searchpointofinterestcategoryresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<SearchAddressResultPrivate> interimType = new TypeReference<SearchAddressResultPrivate>(){};
        byte[] data = Files.readAllBytes(file.toPath());
        SearchAddressResultPrivate searchAddressResultPrivate = jacksonAdapter.<SearchAddressResultPrivate>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        SearchAddressResult searchAddressResult = Utility.toSearchAddressResult(searchAddressResultPrivate);
        return searchAddressResult;
    }

    static PointOfInterestCategoryTreeResult getExpectedSearchPointOfInterestCategoryTreeResults() throws StreamReadException, DatabindException, IOException {
        File file = new File("src/main/resources/getpointofinterestcategorytreeresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<PointOfInterestCategoryTreeResult> interimType = new TypeReference<PointOfInterestCategoryTreeResult>(){};
        byte[] data = Files.readAllBytes(file.toPath());
        PointOfInterestCategoryTreeResult pointOfInterestCategoryTreeResult = jacksonAdapter.<PointOfInterestCategoryTreeResult>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        
        // // URL url = SearchAddressResultPrivate.class.getClassLoader().getResource("searchpointofinterestcategoryresult.json");
        // // SearchAddressResultPrivate searchAddressResultPrivate = new ObjectMapper().readValue(url, SearchAddressResultPrivate.class);
        // SearchAddressResult searchAddressResult = Utility.toPointOf(pointOfInterestCategoryTreeResultPrivate);
        return pointOfInterestCategoryTreeResult;
    }

    static SearchAddressResult getExpectedSearchAddressResults() throws StreamReadException, DatabindException, IOException {
        File file = new File("src/main/resources/searchaddressresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<SearchAddressResultPrivate> interimType = new TypeReference<SearchAddressResultPrivate>(){};
        byte[] data = Files.readAllBytes(file.toPath());
        SearchAddressResultPrivate searchAddressResultPrivate = jacksonAdapter.<SearchAddressResultPrivate>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        SearchAddressResult searchAddressResult = Utility.toSearchAddressResult(searchAddressResultPrivate);
        return searchAddressResult;
    }

    static ReverseSearchAddressResult getExpectedReverseSearchAddressResults() throws StreamReadException, DatabindException, IOException {
        File file = new File("src/main/resources/reversesearchaddressresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<ReverseSearchAddressResultPrivate> interimType = new TypeReference<ReverseSearchAddressResultPrivate>(){};
        byte[] data = Files.readAllBytes(file.toPath());
        ReverseSearchAddressResultPrivate searchReverseAddressResultPrivate = jacksonAdapter.<ReverseSearchAddressResultPrivate>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        ReverseSearchAddressResult reverseSearchAddressResult = Utility.toReverseSearchAddressResult(searchReverseAddressResultPrivate);
        return reverseSearchAddressResult;
    }

    static ReverseSearchCrossStreetAddressResult getExpectedReverseSearchCrossStreetAddressResults() throws StreamReadException, DatabindException, IOException {
        File file = new File("src/main/resources/reversesearchcrossstreetaddressresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<ReverseSearchCrossStreetAddressResultPrivate> interimType = new TypeReference<ReverseSearchCrossStreetAddressResultPrivate>(){};
        byte[] data = Files.readAllBytes(file.toPath());
        ReverseSearchCrossStreetAddressResultPrivate reverseSearchCrossStreetAddressResultPrivate = jacksonAdapter.<ReverseSearchCrossStreetAddressResultPrivate>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        ReverseSearchCrossStreetAddressResult reverseSearchCrossStreetAddressResult = Utility.toReverseSearchCrossStreetAddressResult(reverseSearchCrossStreetAddressResultPrivate);
        return reverseSearchCrossStreetAddressResult;
    }

    static SearchAddressResult getExpectedSearchStructuredAddress() throws StreamReadException, DatabindException, IOException {
        File file = new File("src/main/resources/searchstructuredaddressresult.json");
        SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
        TypeReference<SearchAddressResultPrivate> interimType = new TypeReference<SearchAddressResultPrivate>(){};
        byte[] data = Files.readAllBytes(file.toPath());
        SearchAddressResultPrivate searchAddressResultPrivate = jacksonAdapter.<SearchAddressResultPrivate>deserialize(data, interimType.getJavaType(),
           SerializerEncoding.JSON);
        SearchAddressResult searchAddressResult = Utility.toSearchAddressResult(searchAddressResultPrivate);
        return searchAddressResult;
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
                //  .filter(TestUtils::shouldServiceVersionBeTested)
                    .forEach(serviceVersion -> argumentsList.add(Arguments.of(httpClient, serviceVersion)));
            });
        return argumentsList.stream();
    }
}
