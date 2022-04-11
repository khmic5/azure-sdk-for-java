package com.azure.maps.elevation;

import static org.junit.jupiter.api.Assertions.assertThrows;

import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;

import org.junit.jupiter.api.Test;

public class ElevationClientBuilderTest {
    // Test for null RenderClientId, the client ID value
    @Test
    public void missingMapsClientId() {
        assertThrows(NullPointerException.class, () -> {
            final ElevationClientBuilder builder = new ElevationClientBuilder();
            builder.elevationClientId(null);
        });
    }

    // Test for missing endpoint
    @Test
    public void missingEndpoint() {
        assertThrows(NullPointerException.class, () -> {
            final ElevationClientBuilder builder = new ElevationClientBuilder();
            builder.endpoint(null);
        });
    }

    // Test for missing pipeline
    @Test
    public void missingPipeline() {
        assertThrows(NullPointerException.class, () -> {
            final ElevationClientBuilder builder = new ElevationClientBuilder();
            builder.pipeline(null);
        });
    }

    // Test for missing http client
    @Test
    public void missingHttpClient() {
        assertThrows(NullPointerException.class, () -> {
            final ElevationClientBuilder builder = new ElevationClientBuilder();
            builder.httpClient(null);
        });
    }

    // Test for missing configuration
    @Test
    public void missingConfiguration() {
        assertThrows(NullPointerException.class, () -> {
            final ElevationClientBuilder builder = new ElevationClientBuilder();
            builder.configuration(null);
        });
    }

    // Test for missing http log options
    @Test
    public void missingHttpLogOptions() {
        assertThrows(NullPointerException.class, () -> {
            final ElevationClientBuilder builder = new ElevationClientBuilder();
            builder.httpLogOptions(null);
        });
    }

    // Test for missing retry policy
    @Test
    public void missingRetryPolicy() {
        assertThrows(NullPointerException.class, () -> {
            final ElevationClientBuilder builder = new ElevationClientBuilder();
            builder.retryPolicy(null);
        });
    }

    // Test for missing client options
    @Test
    public void missingClientOptions() {
        assertThrows(NullPointerException.class, () -> {
            final ElevationClientBuilder builder = new ElevationClientBuilder();
            builder.clientOptions(null);
        });
    }

    // Test for missing add policy
    @Test
    public void missingAddPolicy() {
        assertThrows(NullPointerException.class, () -> {
            final ElevationClientBuilder builder = new ElevationClientBuilder();
            builder.addPolicy(null);
        });
    }

    // Test for null map id, valid token credential
    @Test
    public void missingMapsClientIdValidTokenCredential() {
        assertThrows(IllegalArgumentException.class, () -> {
            final ElevationClientBuilder builder = new ElevationClientBuilder();
            DefaultAzureCredential tokenCredential = new DefaultAzureCredentialBuilder().build();
            builder.credential(tokenCredential);
            builder.buildClient();
        });
    }

    // Test for null key credential and null token credential despite valid mapsClientId
    @Test
    public void missingCredentials() {
        assertThrows(IllegalArgumentException.class, () -> {
            final ElevationClientBuilder builder = new ElevationClientBuilder();
            builder.elevationClientId("elevationClientId");
            builder.buildClient();
        });
    }
}
