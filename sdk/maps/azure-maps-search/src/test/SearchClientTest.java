package com.azure.maps.search.test.java.com.azure.maps.search;

import com.azure.maps.search.SearchClientBuilder;
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

    // ***** Testing List<Polygon> getPolygons(List<String> geometryIds) *****
    
    // 1. Was the function called? Mockito.verify
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
        Mono<Response<List<Polygon>>> l 
        when(mockSearchAsyncClient).getPolygons(geometryIds).then(Mono<List<Polygon>> l);
        // Polygon p1 = new Polygon("8bceafe8-3d98-4445-b29b-fd81d3e9adf5", );
        verify(mockSearchAsyncClient).getPolygons(geometryIds);
        // List<Polygon> compareResult = new ArrayList<>();
        assertEquals(l.size(), 4);
        
        
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
