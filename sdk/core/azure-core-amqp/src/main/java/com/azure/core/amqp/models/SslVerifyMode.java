package com.azure.core.amqp.models;

public enum SslVerifyMode {
    // There is no verification.
    NONE,
    // Require verification of SSL certificate used.
    VERIFY_PEER,
    // Require verification of peer name.
    VERIFY_PEER_NAME,
}
