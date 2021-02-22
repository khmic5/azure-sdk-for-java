// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp.models;

/**
 * SSL Verification mode when creating connection
 */
public enum SslVerifyMode {
    /**
     * There is no verification.
     */
    NONE,
    /**
     * Require verification of SSL certificate used.
     */
    VERIFY_PEER,
    /**
     * Require verification of peer name.
     */
    VERIFY_PEER_NAME,
}
