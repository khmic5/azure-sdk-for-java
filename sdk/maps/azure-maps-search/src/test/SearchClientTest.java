package com.azure.maps.search.test.java.com.azure.maps.search;

import com.azure.maps.search.SearchClientBuilder;
import com.azure.maps.search.implementation.helpers.PolygonPropertiesHelper;

import static org.mockito.Mockito;
import com.azure.maps.search.SearchClient;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class SearchClientTest extends SearchClientTestBase {

    @Override
    protected void beforeTest() {
        
    }


    // ***** Testing List<Polygon> getPolygons(List<String> geometryIds) *****
    
    // 1. Was the function called? Mockito.verify
    @Test
    public void testFunctionCallGetPolygons() {
        SearchAsyncClient mockSearchAsyncClient = mock(SearchAsyncClient.class);
        SearchClient searchClient = new SearchClient(mockSearchAsyncClient);
    }
    // 2. Does it catch exceptions when input is invalid?
    // 3. Are the outputs correct?
        //A. Test empty list case
        //B. Output list size 1
        //C. Multiple outputs (test size)
        //D. Test output content ie create 1 polygon, check if list contains it ; create many polygons check if list contains it

    // ***** Testing Response<List<Polygon>> getPolygonsWithResponse(List<String> geometryIds, Context context) *****


















    //private SearchClient searchClient;

    // @Override
    // protected void beforeTest() {
    //     super.beforeTest();
    //     assumeTrue(shouldEnableSmsTests());
    // }

    @Test
    public void testGetPolygons() {
        //SearchClientBuilder builder = new SearchClientBuilder();
        SearchAsyncClient mockSearchAsyncClient = mock(SearchAsyncClient.class);
        SearchClient searchClient = new SearchClient(mockSearchAsyncClient);
        List<String> geometryIds = Arrays.asList("1111-2222-32-4444444444444","8bceafe8-3d98-4445-b29b-fd81d3e9adf5");
        List<Polygon> l = searchClient.getPolygons(geometryIds);
        Polygon p1 = new Polygon("8bceafe8-3d98-4445-b29b-fd81d3e9adf5");
        GeoJsonObject gs = new GeoJsonObject();
        gs.setType("FeatureCollection");
        //PolygonPropertiesHelper.setGeometry(p1, geometry);
        Polygon p2 = new Polygon("1111-2222-32-4444444444444");
        List<Polygon> expectedResult = Arrays.asList(p1, p2);
        Response resp = new Response(expectedResult);
        Mono<Response<List<Polygon>>> list = new Mono<Response<List<Polygon>>>(resp);
        when(mockSearchAsyncClient).getPolygons(geometryIds).thenReturn(list);
        verify(mockSearchAsyncClient).getPolygons(geometryIds);
        assertEquals(l.size(), 2);
    }

    



    /*
    protected SearchClientBuilder getSmsClient(HttpClient httpClient) {
        CommunicationConnectionString communicationConnectionString = new CommunicationConnectionString(CONNECTION_STRING);
        String communicationEndpoint = communicationConnectionString.getEndpoint();
        String communicationAccessKey = communicationConnectionString.getAccessKey(); 
        
        SmsClientBuilder builder = new SmsClientBuilder();
        builder.endpoint(communicationEndpoint)
            .credential(new AzureKeyCredential(communicationAccessKey))
            .httpClient(httpClient == null ? interceptorManager.getPlaybackClient() : httpClient);
        if (getTestMode() == TestMode.RECORD) {
            List<Function<String, String>> redactors = new ArrayList<>();
            redactors.add(data -> redact(data, JSON_PROPERTY_VALUE_REDACTION_PATTERN.matcher(data), "REDACTED"));
            builder.addPolicy(interceptorManager.getRecordPolicy(redactors));
        }
        return builder;
    }

    */
    

}
