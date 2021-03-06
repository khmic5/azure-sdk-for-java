// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.integration.eventhub;

import com.azure.messaging.eventhubs.*;
import com.azure.spring.integration.core.api.BatchConsumerConfig;
import com.azure.spring.integration.eventhub.factory.EventHubConnectionStringProvider;
import com.azure.spring.integration.eventhub.impl.EventHubProcessor;
import com.azure.storage.blob.BlobContainerAsyncClient;
import com.azure.storage.blob.BlobContainerClientBuilder;
import com.azure.spring.integration.eventhub.api.EventHubClientFactory;
import com.azure.spring.integration.eventhub.factory.DefaultEventHubClientFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.stubbing.Answer;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import reactor.core.publisher.Mono;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.*;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({ "com.sun.org.apache.xerces.*", "javax.xml.*", "org.xml.*" })
@PrepareForTest({ DefaultEventHubClientFactory.class })
public class DefaultEventHubClientFactoryTest {
    //TODO (Xiaobing Zhu): Due to Powermock, it is currently impossible to upgrade JUnit 4 to JUnit 5.

    @Mock
    EventHubConsumerAsyncClient eventHubConsumerClient;

    @Mock
    EventHubProducerAsyncClient eventHubProducerClient;

    @Mock
    BlobContainerAsyncClient blobContainerClient;

    @Mock
    EventProcessorClient eventProcessorClient;


    @Mock
    EventHubProcessor eventHubProcessor;

    @Mock
    EventHubConnectionStringProvider connectionStringProvider;

    BatchConsumerConfig batchConsumerConfig = BatchConsumerConfig.builder().batchSize(10).build();

    private EventHubClientFactory clientFactory;
    private String eventHubName = "eventHub";
    private String eventHubNameWithBatch = "eventHubBatch";
    private String consumerGroup = "group";
    private String connectionString = "conStr";
    private String container = "container";

    @Before
    public void setUp() {
        EventHubClientBuilder eventHubClientBuilder = mock(EventHubClientBuilder.class, BuilderReturn.self);
        BlobContainerClientBuilder blobContainerClientBuilder = mock(BlobContainerClientBuilder.class,
            BuilderReturn.self);
        EventProcessorClientBuilder eventProcessorClientBuilder = mock(EventProcessorClientBuilder.class,
            BuilderReturn.self);
        try {
            whenNew(EventHubClientBuilder.class).withNoArguments().thenReturn(eventHubClientBuilder);
            whenNew(BlobContainerClientBuilder.class).withNoArguments().thenReturn(blobContainerClientBuilder);
            whenNew(EventProcessorClientBuilder.class).withNoArguments().thenReturn(eventProcessorClientBuilder);
        } catch (Exception e) {
            e.printStackTrace();
        }

        when(eventHubClientBuilder.buildAsyncConsumerClient()).thenReturn(this.eventHubConsumerClient);
        when(eventHubClientBuilder.buildAsyncProducerClient()).thenReturn(this.eventHubProducerClient);
        when(blobContainerClientBuilder.buildAsyncClient()).thenReturn(this.blobContainerClient);
        when(this.blobContainerClient.exists()).thenReturn(Mono.just(true));
        when(eventProcessorClientBuilder.buildEventProcessorClient()).thenReturn(this.eventProcessorClient);

        this.clientFactory = spy(new DefaultEventHubClientFactory(connectionString, connectionString,
            container));
    }

    @Test
    public void testGetEventHubConsumerClient() {
        EventHubConsumerAsyncClient client = clientFactory.getOrCreateConsumerClient(eventHubName, consumerGroup);
        assertNotNull(client);
        EventHubConsumerAsyncClient another = clientFactory.getOrCreateConsumerClient(eventHubName, consumerGroup);
        assertEquals(client, another);
    }

    @Test
    public void testGetEventHubProducerClient() {
        EventHubProducerAsyncClient sender = clientFactory.getOrCreateProducerClient(eventHubName);
        assertNotNull(sender);
        EventHubProducerAsyncClient another = clientFactory.getOrCreateProducerClient(eventHubName);
        assertEquals(sender, another);
    }

    @Test
    public void testGetEventProcessorClient() {
        clientFactory.createEventProcessorClient(eventHubNameWithBatch, consumerGroup, eventHubProcessor,
            batchConsumerConfig);
        Optional<EventProcessorClient> optionalEph = clientFactory.getEventProcessorClient(eventHubNameWithBatch, consumerGroup);

        assertTrue(optionalEph.isPresent());

        clientFactory.createEventProcessorClient(eventHubName, consumerGroup, eventHubProcessor, null);
        optionalEph = clientFactory.getEventProcessorClient(eventHubName, consumerGroup);

        assertTrue(optionalEph.isPresent());
    }

    @Test
    public void testGetNullEventProcessorClient() {
        Optional<EventProcessorClient> optionalEph = clientFactory.getEventProcessorClient(eventHubName, consumerGroup);
        assertFalse(optionalEph.isPresent());
    }

    @Test
    public void testRemoveEventProcessorClient() {
        EventProcessorClient client = clientFactory.createEventProcessorClient(eventHubName, consumerGroup,
            eventHubProcessor, batchConsumerConfig);
        EventProcessorClient another = clientFactory.removeEventProcessorClient(eventHubName, consumerGroup);

        assertSame(client, another);

        client = clientFactory.createEventProcessorClient(eventHubNameWithBatch, consumerGroup,
            eventHubProcessor, batchConsumerConfig);
        another = clientFactory.removeEventProcessorClient(eventHubNameWithBatch, consumerGroup);

        assertSame(client, another);
    }

    @Test
    public void testRemoveAbsentEventProcessorClient() {
        EventProcessorClient client = clientFactory.removeEventProcessorClient(eventHubName, consumerGroup);
        assertNull(client);
    }

    @Test
    public void testGetOrCreateEventProcessorClient() throws Exception {
        EventProcessorClient client = clientFactory.createEventProcessorClient(eventHubNameWithBatch, consumerGroup,
            eventHubProcessor, batchConsumerConfig);
        assertNotNull(client);
        clientFactory.createEventProcessorClient(eventHubNameWithBatch, consumerGroup, eventHubProcessor, batchConsumerConfig);

        verifyPrivate(clientFactory, times(1))
            .invoke("createEventProcessorClientInternal", eventHubNameWithBatch, consumerGroup, eventHubProcessor,
                batchConsumerConfig);

        client = clientFactory.createEventProcessorClient(eventHubName, consumerGroup,
            eventHubProcessor, batchConsumerConfig);
        assertNotNull(client);
        clientFactory.createEventProcessorClient(eventHubName, consumerGroup, eventHubProcessor, batchConsumerConfig);

        verifyPrivate(clientFactory, times(1))
            .invoke("createEventProcessorClientInternal", eventHubName, consumerGroup, eventHubProcessor, batchConsumerConfig);
    }

    @Test
    public void testRecreateEventProcessorClient() throws Exception {
        EventProcessorClient client = clientFactory.createEventProcessorClient(eventHubNameWithBatch, consumerGroup,
            eventHubProcessor, batchConsumerConfig);
        assertNotNull(client);
        clientFactory.removeEventProcessorClient(eventHubNameWithBatch, consumerGroup);
        clientFactory.createEventProcessorClient(eventHubNameWithBatch, consumerGroup, eventHubProcessor, batchConsumerConfig);
        verifyPrivate(clientFactory, times(2))
            .invoke("createEventProcessorClientInternal", eventHubNameWithBatch, consumerGroup, eventHubProcessor, batchConsumerConfig);

        client = clientFactory.createEventProcessorClient(eventHubName, consumerGroup,
            eventHubProcessor, batchConsumerConfig);
        assertNotNull(client);
        clientFactory.removeEventProcessorClient(eventHubName, consumerGroup);
        clientFactory.createEventProcessorClient(eventHubName, consumerGroup, eventHubProcessor, batchConsumerConfig);
        verifyPrivate(clientFactory, times(2))
            .invoke("createEventProcessorClientInternal", eventHubName, consumerGroup, eventHubProcessor, batchConsumerConfig);

    }

    public static class BuilderReturn {
        private static Answer<?> self = (Answer<Object>) invocation -> {
            if (invocation.getMethod().getReturnType().isAssignableFrom(invocation.getMock().getClass())) {
                return invocation.getMock();
            }

            return null;
        };
    }

}
