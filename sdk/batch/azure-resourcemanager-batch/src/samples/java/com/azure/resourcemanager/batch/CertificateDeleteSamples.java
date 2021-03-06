// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch;

import com.azure.core.util.Context;

/** Samples for Certificate Delete. */
public final class CertificateDeleteSamples {
    /**
     * Sample code: CertificateDelete.
     *
     * @param batchManager Entry point to BatchManager.
     */
    public static void certificateDelete(com.azure.resourcemanager.batch.BatchManager batchManager) {
        batchManager
            .certificates()
            .delete(
                "default-azurebatch-japaneast",
                "sampleacct",
                "sha1-0a0e4f50d51beadeac1d35afc5116098e7902e6e",
                Context.NONE);
    }
}
