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

    //private SearchClient searchClient;

    // @Override
    // protected void beforeTest() {
    //     super.beforeTest();
    //     assumeTrue(shouldEnableSmsTests());
    // }



    @Test
    public void testGetPolygons() {
        //SearchClientBuilder builder = new SearchClientBuilder();
        SearchClient searchClient = mock(SearchClient.class);
        // when(searchClient.getPolygons())
        assertTrue(true);
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
