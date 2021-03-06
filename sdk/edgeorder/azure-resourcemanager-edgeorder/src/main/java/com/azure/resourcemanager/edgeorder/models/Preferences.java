// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Preferences related to the order. */
@Fluent
public final class Preferences {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Preferences.class);

    /*
     * Notification preferences.
     */
    @JsonProperty(value = "notificationPreferences")
    private List<NotificationPreference> notificationPreferences;

    /*
     * Preferences related to the shipment logistics of the order.
     */
    @JsonProperty(value = "transportPreferences")
    private TransportPreferences transportPreferences;

    /*
     * Preferences related to the Encryption.
     */
    @JsonProperty(value = "encryptionPreferences")
    private EncryptionPreferences encryptionPreferences;

    /*
     * Preferences related to the Management resource.
     */
    @JsonProperty(value = "managementResourcePreferences")
    private ManagementResourcePreferences managementResourcePreferences;

    /**
     * Get the notificationPreferences property: Notification preferences.
     *
     * @return the notificationPreferences value.
     */
    public List<NotificationPreference> notificationPreferences() {
        return this.notificationPreferences;
    }

    /**
     * Set the notificationPreferences property: Notification preferences.
     *
     * @param notificationPreferences the notificationPreferences value to set.
     * @return the Preferences object itself.
     */
    public Preferences withNotificationPreferences(List<NotificationPreference> notificationPreferences) {
        this.notificationPreferences = notificationPreferences;
        return this;
    }

    /**
     * Get the transportPreferences property: Preferences related to the shipment logistics of the order.
     *
     * @return the transportPreferences value.
     */
    public TransportPreferences transportPreferences() {
        return this.transportPreferences;
    }

    /**
     * Set the transportPreferences property: Preferences related to the shipment logistics of the order.
     *
     * @param transportPreferences the transportPreferences value to set.
     * @return the Preferences object itself.
     */
    public Preferences withTransportPreferences(TransportPreferences transportPreferences) {
        this.transportPreferences = transportPreferences;
        return this;
    }

    /**
     * Get the encryptionPreferences property: Preferences related to the Encryption.
     *
     * @return the encryptionPreferences value.
     */
    public EncryptionPreferences encryptionPreferences() {
        return this.encryptionPreferences;
    }

    /**
     * Set the encryptionPreferences property: Preferences related to the Encryption.
     *
     * @param encryptionPreferences the encryptionPreferences value to set.
     * @return the Preferences object itself.
     */
    public Preferences withEncryptionPreferences(EncryptionPreferences encryptionPreferences) {
        this.encryptionPreferences = encryptionPreferences;
        return this;
    }

    /**
     * Get the managementResourcePreferences property: Preferences related to the Management resource.
     *
     * @return the managementResourcePreferences value.
     */
    public ManagementResourcePreferences managementResourcePreferences() {
        return this.managementResourcePreferences;
    }

    /**
     * Set the managementResourcePreferences property: Preferences related to the Management resource.
     *
     * @param managementResourcePreferences the managementResourcePreferences value to set.
     * @return the Preferences object itself.
     */
    public Preferences withManagementResourcePreferences(ManagementResourcePreferences managementResourcePreferences) {
        this.managementResourcePreferences = managementResourcePreferences;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (notificationPreferences() != null) {
            notificationPreferences().forEach(e -> e.validate());
        }
        if (transportPreferences() != null) {
            transportPreferences().validate();
        }
        if (encryptionPreferences() != null) {
            encryptionPreferences().validate();
        }
        if (managementResourcePreferences() != null) {
            managementResourcePreferences().validate();
        }
    }
}
