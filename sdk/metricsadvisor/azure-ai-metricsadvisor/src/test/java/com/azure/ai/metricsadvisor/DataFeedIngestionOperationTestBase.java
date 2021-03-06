// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.metricsadvisor;

import com.azure.ai.metricsadvisor.administration.models.DataFeedIngestionProgress;
import com.azure.ai.metricsadvisor.administration.models.DataFeedIngestionStatus;
import com.azure.ai.metricsadvisor.administration.models.ListDataFeedIngestionOptions;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.Response;
import org.junit.jupiter.api.Assertions;

import java.time.OffsetDateTime;

import static com.azure.ai.metricsadvisor.MetricsSeriesTestBase.TIME_SERIES_END_TIME;

public abstract class DataFeedIngestionOperationTestBase extends MetricsAdvisorAdministrationClientTestBase {
    public abstract void listIngestionStatus(HttpClient httpClient, MetricsAdvisorServiceVersion serviceVersion);
    static final String DATA_FEED_ID = "151e5444-449f-441e-8b64-988f21c5d054";
    static final OffsetDateTime TIME_SERIES_START_TIME = OffsetDateTime.parse("2021-09-09T00:00:00Z");

    // Pre-configured test resource.
    protected static class ListIngestionStatusInput {
        static final ListIngestionStatusInput INSTANCE = new ListIngestionStatusInput();
        final String dataFeedId = DATA_FEED_ID;
        final OffsetDateTime startTime = TIME_SERIES_START_TIME;
        final OffsetDateTime endTime = TIME_SERIES_END_TIME;
        final ListDataFeedIngestionOptions options = new ListDataFeedIngestionOptions(startTime, endTime);
    }

    protected void assertListIngestionStatusOutput(DataFeedIngestionStatus ingestionStatus) {
        Assertions.assertNotNull(ingestionStatus);
        Assertions.assertNotNull(ingestionStatus.getStatus());
        Assertions.assertNotNull(ingestionStatus.getTimestamp());
    }

    public abstract void getIngestionProgress(HttpClient httpClient, MetricsAdvisorServiceVersion serviceVersion);

    // Pre-configured test resource.
    protected static class GetIngestionProgressInput {
        static final GetIngestionProgressInput INSTANCE = new GetIngestionProgressInput();
        final String dataFeedId = DATA_FEED_ID;
    }

    protected void assertListIngestionProgressOutput(DataFeedIngestionProgress ingestionProgress) {
        Assertions.assertNotNull(ingestionProgress);
        Assertions.assertNotNull(ingestionProgress.getLatestActiveTimestamp());
        Assertions.assertNotNull(ingestionProgress.getLatestSuccessTimestamp());
    }

    public abstract void refreshIngestion(HttpClient httpClient, MetricsAdvisorServiceVersion serviceVersion);

    // Pre-configured test resource.
    protected static class RefreshIngestionInput {
        static final RefreshIngestionInput INSTANCE = new RefreshIngestionInput();
        final String dataFeedId = DATA_FEED_ID;
        final OffsetDateTime startTime = TIME_SERIES_START_TIME;
        final OffsetDateTime endTime = TIME_SERIES_END_TIME;
    }

    protected void assertRefreshIngestionInputOutput(Response<Void> response) {
        Assertions.assertNotNull(response);
        Assertions.assertEquals(204, response.getStatusCode());
    }
}
