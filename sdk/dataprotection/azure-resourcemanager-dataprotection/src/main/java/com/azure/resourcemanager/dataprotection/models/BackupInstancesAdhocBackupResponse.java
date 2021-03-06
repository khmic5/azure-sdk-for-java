// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.resourcemanager.dataprotection.fluent.models.OperationJobExtendedInfoInner;

/** Contains all response data for the adhocBackup operation. */
public final class BackupInstancesAdhocBackupResponse
    extends ResponseBase<BackupInstancesAdhocBackupHeaders, OperationJobExtendedInfoInner> {
    /**
     * Creates an instance of BackupInstancesAdhocBackupResponse.
     *
     * @param request the request which resulted in this BackupInstancesAdhocBackupResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public BackupInstancesAdhocBackupResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        OperationJobExtendedInfoInner value,
        BackupInstancesAdhocBackupHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public OperationJobExtendedInfoInner getValue() {
        return super.getValue();
    }
}
