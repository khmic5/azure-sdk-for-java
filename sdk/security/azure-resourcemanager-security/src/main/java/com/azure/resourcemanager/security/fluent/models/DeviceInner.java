// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.models.AuthorizationState;
import com.azure.resourcemanager.security.models.DeviceCriticality;
import com.azure.resourcemanager.security.models.DeviceStatus;
import com.azure.resourcemanager.security.models.Firmware;
import com.azure.resourcemanager.security.models.ManagementState;
import com.azure.resourcemanager.security.models.NetworkInterface;
import com.azure.resourcemanager.security.models.ProgrammingState;
import com.azure.resourcemanager.security.models.Protocol;
import com.azure.resourcemanager.security.models.PurdueLevel;
import com.azure.resourcemanager.security.models.ScanningFunctionality;
import com.azure.resourcemanager.security.models.Sensor;
import com.azure.resourcemanager.security.models.Site;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Device model. */
@JsonFlatten
@Fluent
public class DeviceInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeviceInner.class);

    /*
     * Device display name given by the collector
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /*
     * Device type.
     */
    @JsonProperty(value = "properties.deviceType")
    private String deviceType;

    /*
     * The source that created the device
     */
    @JsonProperty(value = "properties.sourceName", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceName;

    /*
     * List of network interfaces.
     */
    @JsonProperty(value = "properties.networkInterfaces", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterface> networkInterfaces;

    /*
     * Device vendor
     */
    @JsonProperty(value = "properties.vendor", access = JsonProperty.Access.WRITE_ONLY)
    private String vendor;

    /*
     * Device operating system name.
     */
    @JsonProperty(value = "properties.osName")
    private String osName;

    /*
     * List of protocols.
     */
    @JsonProperty(value = "properties.protocols", access = JsonProperty.Access.WRITE_ONLY)
    private List<Protocol> protocols;

    /*
     * last time the device was active in the network
     */
    @JsonProperty(value = "properties.lastActiveTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastActiveTime;

    /*
     * last time the device was updated
     */
    @JsonProperty(value = "properties.lastUpdateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdateTime;

    /*
     * Managed state of the device.
     */
    @JsonProperty(value = "properties.managementState", access = JsonProperty.Access.WRITE_ONLY)
    private ManagementState managementState;

    /*
     * Authorized state of the device.
     */
    @JsonProperty(value = "properties.authorizationState")
    private AuthorizationState authorizationState;

    /*
     * Device criticality.
     */
    @JsonProperty(value = "properties.deviceCriticality")
    private DeviceCriticality deviceCriticality;

    /*
     * Purdue level of the device.
     */
    @JsonProperty(value = "properties.purdueLevel")
    private PurdueLevel purdueLevel;

    /*
     * user notes for the device, up to 300 characters.
     */
    @JsonProperty(value = "properties.notes")
    private String notes;

    /*
     * List of device firmwares.
     */
    @JsonProperty(value = "properties.firmwares", access = JsonProperty.Access.WRITE_ONLY)
    private List<Firmware> firmwares;

    /*
     * Discovered time of the device.
     */
    @JsonProperty(value = "properties.discoveryTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime discoveryTime;

    /*
     * Indicates whether this device is programming
     */
    @JsonProperty(value = "properties.programmingState", access = JsonProperty.Access.WRITE_ONLY)
    private ProgrammingState programmingState;

    /*
     * last time the device was programming or programed.
     */
    @JsonProperty(value = "properties.lastProgrammingTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastProgrammingTime;

    /*
     * Indicates whether the device is a scanner
     */
    @JsonProperty(value = "properties.scanningFunctionality", access = JsonProperty.Access.WRITE_ONLY)
    private ScanningFunctionality scanningFunctionality;

    /*
     * last time the device was scanning.
     */
    @JsonProperty(value = "properties.lastScanTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastScanTime;

    /*
     * risk score of the device.
     */
    @JsonProperty(value = "properties.riskScore", access = JsonProperty.Access.WRITE_ONLY)
    private Integer riskScore;

    /*
     * List of sensors that scanned this device.
     */
    @JsonProperty(value = "properties.sensors", access = JsonProperty.Access.WRITE_ONLY)
    private List<Sensor> sensors;

    /*
     * Site data
     */
    @JsonProperty(value = "properties.site", access = JsonProperty.Access.WRITE_ONLY)
    private Site site;

    /*
     * Device status.
     */
    @JsonProperty(value = "properties.deviceStatus", access = JsonProperty.Access.WRITE_ONLY)
    private DeviceStatus deviceStatus;

    /**
     * Get the displayName property: Device display name given by the collector.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Device display name given by the collector.
     *
     * @param displayName the displayName value to set.
     * @return the DeviceInner object itself.
     */
    public DeviceInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the deviceType property: Device type.
     *
     * @return the deviceType value.
     */
    public String deviceType() {
        return this.deviceType;
    }

    /**
     * Set the deviceType property: Device type.
     *
     * @param deviceType the deviceType value to set.
     * @return the DeviceInner object itself.
     */
    public DeviceInner withDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * Get the sourceName property: The source that created the device.
     *
     * @return the sourceName value.
     */
    public String sourceName() {
        return this.sourceName;
    }

    /**
     * Get the networkInterfaces property: List of network interfaces.
     *
     * @return the networkInterfaces value.
     */
    public List<NetworkInterface> networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Get the vendor property: Device vendor.
     *
     * @return the vendor value.
     */
    public String vendor() {
        return this.vendor;
    }

    /**
     * Get the osName property: Device operating system name.
     *
     * @return the osName value.
     */
    public String osName() {
        return this.osName;
    }

    /**
     * Set the osName property: Device operating system name.
     *
     * @param osName the osName value to set.
     * @return the DeviceInner object itself.
     */
    public DeviceInner withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * Get the protocols property: List of protocols.
     *
     * @return the protocols value.
     */
    public List<Protocol> protocols() {
        return this.protocols;
    }

    /**
     * Get the lastActiveTime property: last time the device was active in the network.
     *
     * @return the lastActiveTime value.
     */
    public OffsetDateTime lastActiveTime() {
        return this.lastActiveTime;
    }

    /**
     * Get the lastUpdateTime property: last time the device was updated.
     *
     * @return the lastUpdateTime value.
     */
    public OffsetDateTime lastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * Get the managementState property: Managed state of the device.
     *
     * @return the managementState value.
     */
    public ManagementState managementState() {
        return this.managementState;
    }

    /**
     * Get the authorizationState property: Authorized state of the device.
     *
     * @return the authorizationState value.
     */
    public AuthorizationState authorizationState() {
        return this.authorizationState;
    }

    /**
     * Set the authorizationState property: Authorized state of the device.
     *
     * @param authorizationState the authorizationState value to set.
     * @return the DeviceInner object itself.
     */
    public DeviceInner withAuthorizationState(AuthorizationState authorizationState) {
        this.authorizationState = authorizationState;
        return this;
    }

    /**
     * Get the deviceCriticality property: Device criticality.
     *
     * @return the deviceCriticality value.
     */
    public DeviceCriticality deviceCriticality() {
        return this.deviceCriticality;
    }

    /**
     * Set the deviceCriticality property: Device criticality.
     *
     * @param deviceCriticality the deviceCriticality value to set.
     * @return the DeviceInner object itself.
     */
    public DeviceInner withDeviceCriticality(DeviceCriticality deviceCriticality) {
        this.deviceCriticality = deviceCriticality;
        return this;
    }

    /**
     * Get the purdueLevel property: Purdue level of the device.
     *
     * @return the purdueLevel value.
     */
    public PurdueLevel purdueLevel() {
        return this.purdueLevel;
    }

    /**
     * Set the purdueLevel property: Purdue level of the device.
     *
     * @param purdueLevel the purdueLevel value to set.
     * @return the DeviceInner object itself.
     */
    public DeviceInner withPurdueLevel(PurdueLevel purdueLevel) {
        this.purdueLevel = purdueLevel;
        return this;
    }

    /**
     * Get the notes property: user notes for the device, up to 300 characters.
     *
     * @return the notes value.
     */
    public String notes() {
        return this.notes;
    }

    /**
     * Set the notes property: user notes for the device, up to 300 characters.
     *
     * @param notes the notes value to set.
     * @return the DeviceInner object itself.
     */
    public DeviceInner withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Get the firmwares property: List of device firmwares.
     *
     * @return the firmwares value.
     */
    public List<Firmware> firmwares() {
        return this.firmwares;
    }

    /**
     * Get the discoveryTime property: Discovered time of the device.
     *
     * @return the discoveryTime value.
     */
    public OffsetDateTime discoveryTime() {
        return this.discoveryTime;
    }

    /**
     * Get the programmingState property: Indicates whether this device is programming.
     *
     * @return the programmingState value.
     */
    public ProgrammingState programmingState() {
        return this.programmingState;
    }

    /**
     * Get the lastProgrammingTime property: last time the device was programming or programed.
     *
     * @return the lastProgrammingTime value.
     */
    public OffsetDateTime lastProgrammingTime() {
        return this.lastProgrammingTime;
    }

    /**
     * Get the scanningFunctionality property: Indicates whether the device is a scanner.
     *
     * @return the scanningFunctionality value.
     */
    public ScanningFunctionality scanningFunctionality() {
        return this.scanningFunctionality;
    }

    /**
     * Get the lastScanTime property: last time the device was scanning.
     *
     * @return the lastScanTime value.
     */
    public OffsetDateTime lastScanTime() {
        return this.lastScanTime;
    }

    /**
     * Get the riskScore property: risk score of the device.
     *
     * @return the riskScore value.
     */
    public Integer riskScore() {
        return this.riskScore;
    }

    /**
     * Get the sensors property: List of sensors that scanned this device.
     *
     * @return the sensors value.
     */
    public List<Sensor> sensors() {
        return this.sensors;
    }

    /**
     * Get the site property: Site data.
     *
     * @return the site value.
     */
    public Site site() {
        return this.site;
    }

    /**
     * Get the deviceStatus property: Device status.
     *
     * @return the deviceStatus value.
     */
    public DeviceStatus deviceStatus() {
        return this.deviceStatus;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkInterfaces() != null) {
            networkInterfaces().forEach(e -> e.validate());
        }
        if (protocols() != null) {
            protocols().forEach(e -> e.validate());
        }
        if (firmwares() != null) {
            firmwares().forEach(e -> e.validate());
        }
        if (sensors() != null) {
            sensors().forEach(e -> e.validate());
        }
        if (site() != null) {
            site().validate();
        }
    }
}
