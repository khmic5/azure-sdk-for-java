// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch;

import com.azure.core.util.Context;

/** Samples for Location GetQuotas. */
public final class LocationGetQuotasSamples {
    /**
     * Sample code: LocationGetQuotas.
     *
     * @param batchManager Entry point to BatchManager.
     */
    public static void locationGetQuotas(com.azure.resourcemanager.batch.BatchManager batchManager) {
        batchManager.locations().getQuotasWithResponse("japaneast", Context.NONE);
    }
}
