// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Deletes an existing remote device adapter. */
@Immutable
public final class RemoteDeviceAdapterDeleteRequest extends MethodRequestEmptyBodyBase {
    /*
     * method name
     */
    @JsonProperty(value = "methodName", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String methodName;

    /**
     * Creates an instance of RemoteDeviceAdapterDeleteRequest class.
     *
     * @param name the name value to set.
     */
    @JsonCreator
    public RemoteDeviceAdapterDeleteRequest(@JsonProperty(value = "name", required = true) String name) {
        super(name);
        methodName = "remoteDeviceAdapterDelete";
    }

    /**
     * Get the methodName property: method name.
     *
     * @return the methodName value.
     */
    public String getMethodName() {
        return this.methodName;
    }
}
