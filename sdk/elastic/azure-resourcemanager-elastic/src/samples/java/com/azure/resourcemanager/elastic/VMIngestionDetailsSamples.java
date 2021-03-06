// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic;

import com.azure.core.util.Context;

/** Samples for VMIngestion Details. */
public final class VMIngestionDetailsSamples {
    /**
     * Sample code: VMIngestion_Details.
     *
     * @param elasticManager Entry point to ElasticManager.
     */
    public static void vMIngestionDetails(com.azure.resourcemanager.elastic.ElasticManager elasticManager) {
        elasticManager.vMIngestions().detailsWithResponse("myResourceGroup", "myMonitor", Context.NONE);
    }
}
