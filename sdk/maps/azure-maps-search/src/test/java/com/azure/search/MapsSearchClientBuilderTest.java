package com.azure.search;

import org.junit.jupiter.api.Test;

import io.netty.handler.codec.http2.Http2HeadersEncoder.Configuration;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.credential.BasicAuthenticationCredential;

import java.beans.Transient;

import com.azure.core.credential.TokenCredential;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.maps.search.MapsSearchAsyncClient;
import com.azure.maps.search.MapsSearchClientBuilder;

public class MapsSearchClientBuilderTest {

    // Test for null mapsClientId, the client ID value
    @Test
    public void missingMapsClientId() {
        assertThrows(NullPointerException.class, () -> {
            final MapsSearchClientBuilder builder = new MapsSearchClientBuilder();
            builder.mapsClientId(null);
        });
    }

    // Test for missing endpoint
    @Test
    public void missingEndpoint() {
        assertThrows(NullPointerException.class, () -> {
            final MapsSearchClientBuilder builder = new MapsSearchClientBuilder();
            builder.endpoint(null);
        });
    }

    // Test for missing pipeline 
    @Test
    public void missingPipeline() {
        assertThrows(NullPointerException.class, () -> {
            final MapsSearchClientBuilder builder = new MapsSearchClientBuilder();
            builder.pipeline(null); 
        });
    }

    // Test for missing http client 
    @Test
    public void missingHttpClient() {
        assertThrows(NullPointerException.class, () -> {
            final MapsSearchClientBuilder builder = new MapsSearchClientBuilder();
            builder.httpClient(null); 
        });
    }

    // Test for missing configuration
    @Test
    public void missingConfiguration() {
        assertThrows(NullPointerException.class, () -> {
            final MapsSearchClientBuilder builder = new MapsSearchClientBuilder();
            builder.configuration(null); 
        });
    }

    // Test for missing http log options
    @Test
    public void missingHttpLogOptions() {
        assertThrows(NullPointerException.class, () -> {
            final MapsSearchClientBuilder builder = new MapsSearchClientBuilder();
            builder.httpLogOptions(null);
        });
    }

    // Test for missing retry policy
    @Test
    public void missingRetryPolicy() {
        assertThrows(NullPointerException.class, () -> {
            final MapsSearchClientBuilder builder = new MapsSearchClientBuilder();
            builder.retryPolicy(null);
        });
    }

    // Test for missing client options
    @Test
    public void missingClientOptions() {
        assertThrows(NullPointerException.class, () -> {
            final MapsSearchClientBuilder builder = new MapsSearchClientBuilder();
            builder.clientOptions(null);
        });
    }

    // Test for missing add policy
    @Test
    public void missingAddPolicy() {
        assertThrows(NullPointerException.class, () -> {
            final MapsSearchClientBuilder builder = new MapsSearchClientBuilder();
            builder.addPolicy(null);
        });
    }

    // Test for null map id, valid token credential
    @Test
    public void missingMapsClientIdValidTokenCredential() {
        assertThrows(IllegalArgumentException.class, () -> {
            final MapsSearchClientBuilder builder = new MapsSearchClientBuilder();
            DefaultAzureCredential tokenCredential = new DefaultAzureCredentialBuilder().build();
            builder.credential(tokenCredential);
            builder.buildClient();
        });
    }

    // Test for null key credential and null token credential despite valid mapsClientId
    @Test
    public void missingCredentials() {
        assertThrows(IllegalArgumentException.class, () -> {
            final MapsSearchClientBuilder builder = new MapsSearchClientBuilder();
            builder.mapsClientId("mapsClientId");
            builder.buildClient();
        });
    }
    
}