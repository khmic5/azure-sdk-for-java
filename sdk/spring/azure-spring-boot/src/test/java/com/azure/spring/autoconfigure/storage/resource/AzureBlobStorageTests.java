// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.autoconfigure.storage.resource;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.blob.models.BlobProperties;
import com.azure.storage.blob.options.BlockBlobOutputStreamOptions;
import com.azure.storage.blob.specialized.BlobInputStream;
import com.azure.storage.blob.specialized.BlobOutputStream;
import com.azure.storage.blob.specialized.BlockBlobClient;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.Resource;
import org.springframework.core.io.WritableResource;

import java.io.FileNotFoundException;
import java.io.OutputStream;

import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Warren Zhu
 */
@SpringBootTest(properties = "spring.main.banner-mode=off")
public class AzureBlobStorageTests {

    private static final String CONTAINER_NAME = "container";
    private static final String NON_EXISTING = "non-existing";
    private static final String BLOB_NAME = "blob";
    private static final long CONTENT_LENGTH = 4096L;

    @Value("azure-blob://container/blob")
    private Resource remoteResource;

    @Autowired
    private BlobServiceClient blobServiceClient;

    @Test
    public void testEmptyPath() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new BlobStorageResource(this.blobServiceClient,
            "azure-blob://"));
    }

    @Test
    public void testSlashPath() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new BlobStorageResource(this.blobServiceClient,
            "azure-blob:///"));
    }

    @Test
    public void testValidObject() throws Exception {
        Assertions.assertTrue(this.remoteResource.exists());
        Assertions.assertEquals(CONTENT_LENGTH, this.remoteResource.contentLength());
    }

    @Test
    public void testWritable() throws Exception {
        Assertions.assertTrue(this.remoteResource instanceof WritableResource);
        WritableResource writableResource = (WritableResource) this.remoteResource;
        Assertions.assertTrue(writableResource.isWritable());
        writableResource.getOutputStream();
    }

    @Test
    public void testWritableOutputStream() throws Exception {
        String location = "azure-blob://container/blob";

        BlobStorageResource resource = new BlobStorageResource(blobServiceClient, location);
        OutputStream os = resource.getOutputStream();
        Assertions.assertNotNull(os);
    }

    @Test
    public void testWritableOutputStreamNoAutoCreateOnNullBlob() {
        String location = "azure-blob://container/non-existing";

        BlobStorageResource resource = new BlobStorageResource(this.blobServiceClient, location);
        Assertions.assertThrows(FileNotFoundException.class, () -> resource.getOutputStream());
    }

    @Test
    public void testGetInputStreamOnNullBlob() {
        String location = "azure-blob://container/non-existing";

        BlobStorageResource resource = new BlobStorageResource(blobServiceClient, location);
        Assertions.assertThrows(FileNotFoundException.class, () -> resource.getInputStream());
    }

    @Test
    public void testGetFilenameOnNonExistingBlob() {
        String location = "azure-blob://container/non-existing";
        BlobStorageResource resource = new BlobStorageResource(blobServiceClient, location);
        Assertions.assertEquals(NON_EXISTING, resource.getFilename());
    }

    @Test
    public void testContainerDoesNotExist() {
        BlobStorageResource resource = new BlobStorageResource(this.blobServiceClient,
            "azure-blob://non-existing/blob");
        Assertions.assertFalse(resource.exists());
    }

    @Test
    public void testContainerExistsButResourceDoesNot() {
        BlobStorageResource resource = new BlobStorageResource(this.blobServiceClient,
            "azure-blob://container/non-existing");
        Assertions.assertFalse(resource.exists());
    }

    @ParameterizedTest
    @MethodSource("contentTypeProvider")
    public void testGetContentType(ArgumentsAccessor arguments) {
        String contentType = arguments.getString(1);
        String location = arguments.getString(0);
        AzureStorageResource storageResource = new BlobStorageResource(this.blobServiceClient, location);
        Assertions.assertEquals(contentType, storageResource.getContentType(location));
    }

    /**
     * Provides a list of valid locations as parameters in the format of:
     *
     * location -- container name -- blob name
     */
    static Stream<Arguments> contentTypeProvider() {
        return Stream.of(
            arguments("azure-blob://" + CONTAINER_NAME + "/b/a.pdf", "application/pdf"),
            arguments("azure-BLOB://" + CONTAINER_NAME + "/b/a.txt", "text/plain"),
            arguments("AZURE-BLOB://" + CONTAINER_NAME + "/b/a.jpg", "image/jpeg"),
            arguments("azure-blob://" + CONTAINER_NAME + "/b.unknown", null)
        );
    }

    @Configuration
    @Import(AzureStorageProtocolResolver.class)
    static class StorageApplication {

        @Bean
        public static BlobServiceClient mockBlobServiceClient() {
            return mockBlobServiceClientBuilder().buildClient();
        }

        @Bean
        public static BlobServiceClientBuilder mockBlobServiceClientBuilder() {
            BlobServiceClientBuilder serviceClientBuilder = mock(BlobServiceClientBuilder.class);

            BlobServiceClient blobServiceClient = mock(BlobServiceClient.class);
            BlobContainerClient blobContainer = mock(BlobContainerClient.class);
            BlobContainerClient nonExistingBlobContainer = mock(BlobContainerClient.class);
            BlobClient blob = mock(BlobClient.class);
            BlobClient nonExistingBlob = mock(BlobClient.class);
            BlockBlobClient blockBlob = mock(BlockBlobClient.class);
            BlockBlobClient nonExistingBlockBlob = mock(BlockBlobClient.class);
            BlobProperties blobProperties = mock(BlobProperties.class);

            when(serviceClientBuilder.buildClient()).thenReturn(blobServiceClient);
            when(blobServiceClient.getBlobContainerClient(eq(CONTAINER_NAME))).thenReturn(blobContainer);
            when(blobServiceClient.getBlobContainerClient(eq(NON_EXISTING))).thenReturn(nonExistingBlobContainer);
            when(blobContainer.getBlobClient(eq(BLOB_NAME))).thenReturn(blob);
            when(blobContainer.getBlobClient(eq(NON_EXISTING))).thenReturn(nonExistingBlob);
            when(nonExistingBlobContainer.getBlobClient(anyString())).thenReturn(nonExistingBlob);
            when(blob.getBlockBlobClient()).thenReturn(blockBlob);
            when(nonExistingBlob.getBlockBlobClient()).thenReturn(nonExistingBlockBlob);

            when(blobContainer.exists()).thenReturn(true);
            when(nonExistingBlobContainer.exists()).thenReturn(false);
            when(blockBlob.exists()).thenReturn(true);
            when(nonExistingBlockBlob.exists()).thenReturn(false);

            when(blobContainer.getBlobContainerName()).thenReturn(CONTAINER_NAME);
            when(blockBlob.getContainerName()).thenReturn(CONTAINER_NAME);
            when(blockBlob.getBlobName()).thenReturn(BLOB_NAME);
            when(nonExistingBlockBlob.getBlobName()).thenReturn(NON_EXISTING);

            when(blockBlob.openInputStream()).thenReturn(mock(BlobInputStream.class));
            when(blockBlob.getBlobOutputStream(true)).thenReturn(mock(BlobOutputStream.class));

            when(blockBlob.getProperties()).thenReturn(blobProperties);
            when(blobProperties.getBlobSize()).thenReturn(CONTENT_LENGTH);

            // mock data for method testGetContentType()
            when(blobContainer.getBlobClient("b/a.pdf")).thenReturn(blob);
            when(blobContainer.getBlobClient("b/a.txt")).thenReturn(blob);
            when(blobContainer.getBlobClient("b/a.jpg")).thenReturn(blob);
            when(blobContainer.getBlobClient("b.unknown")).thenReturn(blob);

            when(blockBlob.getBlobOutputStream(any(BlockBlobOutputStreamOptions.class)))
                          .thenReturn(mock(BlobOutputStream.class));

            return serviceClientBuilder;
        }

    }

}
