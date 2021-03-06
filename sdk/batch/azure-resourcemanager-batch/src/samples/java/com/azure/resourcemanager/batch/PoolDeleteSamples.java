// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch;

import com.azure.core.util.Context;

/** Samples for Pool Delete. */
public final class PoolDeleteSamples {
    /**
     * Sample code: DeletePool.
     *
     * @param batchManager Entry point to BatchManager.
     */
    public static void deletePool(com.azure.resourcemanager.batch.BatchManager batchManager) {
        batchManager.pools().delete("default-azurebatch-japaneast", "sampleacct", "testpool", Context.NONE);
    }
}
