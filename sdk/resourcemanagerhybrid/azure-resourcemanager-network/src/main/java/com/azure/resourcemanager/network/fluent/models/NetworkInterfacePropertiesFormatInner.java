// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.NetworkInterfaceDnsSettings;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** NetworkInterface properties. */
@Fluent
public final class NetworkInterfacePropertiesFormatInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkInterfacePropertiesFormatInner.class);

    /*
     * The reference of a virtual machine.
     */
    @JsonProperty(value = "virtualMachine", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource virtualMachine;

    /*
     * The reference of the NetworkSecurityGroup resource.
     */
    @JsonProperty(value = "networkSecurityGroup")
    private NetworkSecurityGroupInner networkSecurityGroup;

    /*
     * A reference to the interface endpoint to which the network interface is
     * linked.
     */
    @JsonProperty(value = "interfaceEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private InterfaceEndpointInner interfaceEndpoint;

    /*
     * A list of IPConfigurations of the network interface.
     */
    @JsonProperty(value = "ipConfigurations")
    private List<NetworkInterfaceIpConfigurationInner> ipConfigurations;

    /*
     * A list of TapConfigurations of the network interface.
     */
    @JsonProperty(value = "tapConfigurations")
    private List<NetworkInterfaceTapConfigurationInner> tapConfigurations;

    /*
     * The DNS settings in network interface.
     */
    @JsonProperty(value = "dnsSettings")
    private NetworkInterfaceDnsSettings dnsSettings;

    /*
     * The MAC address of the network interface.
     */
    @JsonProperty(value = "macAddress")
    private String macAddress;

    /*
     * Gets whether this is a primary network interface on a virtual machine.
     */
    @JsonProperty(value = "primary")
    private Boolean primary;

    /*
     * If the network interface is accelerated networking enabled.
     */
    @JsonProperty(value = "enableAcceleratedNetworking")
    private Boolean enableAcceleratedNetworking;

    /*
     * Indicates whether IP forwarding is enabled on this network interface.
     */
    @JsonProperty(value = "enableIPForwarding")
    private Boolean enableIpForwarding;

    /*
     * A list of references to linked BareMetal resources
     */
    @JsonProperty(value = "hostedWorkloads", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> hostedWorkloads;

    /*
     * The resource GUID property of the network interface resource.
     */
    @JsonProperty(value = "resourceGuid")
    private String resourceGuid;

    /*
     * The provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /**
     * Get the virtualMachine property: The reference of a virtual machine.
     *
     * @return the virtualMachine value.
     */
    public SubResource virtualMachine() {
        return this.virtualMachine;
    }

    /**
     * Get the networkSecurityGroup property: The reference of the NetworkSecurityGroup resource.
     *
     * @return the networkSecurityGroup value.
     */
    public NetworkSecurityGroupInner networkSecurityGroup() {
        return this.networkSecurityGroup;
    }

    /**
     * Set the networkSecurityGroup property: The reference of the NetworkSecurityGroup resource.
     *
     * @param networkSecurityGroup the networkSecurityGroup value to set.
     * @return the NetworkInterfacePropertiesFormatInner object itself.
     */
    public NetworkInterfacePropertiesFormatInner withNetworkSecurityGroup(
        NetworkSecurityGroupInner networkSecurityGroup) {
        this.networkSecurityGroup = networkSecurityGroup;
        return this;
    }

    /**
     * Get the interfaceEndpoint property: A reference to the interface endpoint to which the network interface is
     * linked.
     *
     * @return the interfaceEndpoint value.
     */
    public InterfaceEndpointInner interfaceEndpoint() {
        return this.interfaceEndpoint;
    }

    /**
     * Get the ipConfigurations property: A list of IPConfigurations of the network interface.
     *
     * @return the ipConfigurations value.
     */
    public List<NetworkInterfaceIpConfigurationInner> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: A list of IPConfigurations of the network interface.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the NetworkInterfacePropertiesFormatInner object itself.
     */
    public NetworkInterfacePropertiesFormatInner withIpConfigurations(
        List<NetworkInterfaceIpConfigurationInner> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the tapConfigurations property: A list of TapConfigurations of the network interface.
     *
     * @return the tapConfigurations value.
     */
    public List<NetworkInterfaceTapConfigurationInner> tapConfigurations() {
        return this.tapConfigurations;
    }

    /**
     * Set the tapConfigurations property: A list of TapConfigurations of the network interface.
     *
     * @param tapConfigurations the tapConfigurations value to set.
     * @return the NetworkInterfacePropertiesFormatInner object itself.
     */
    public NetworkInterfacePropertiesFormatInner withTapConfigurations(
        List<NetworkInterfaceTapConfigurationInner> tapConfigurations) {
        this.tapConfigurations = tapConfigurations;
        return this;
    }

    /**
     * Get the dnsSettings property: The DNS settings in network interface.
     *
     * @return the dnsSettings value.
     */
    public NetworkInterfaceDnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings property: The DNS settings in network interface.
     *
     * @param dnsSettings the dnsSettings value to set.
     * @return the NetworkInterfacePropertiesFormatInner object itself.
     */
    public NetworkInterfacePropertiesFormatInner withDnsSettings(NetworkInterfaceDnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the macAddress property: The MAC address of the network interface.
     *
     * @return the macAddress value.
     */
    public String macAddress() {
        return this.macAddress;
    }

    /**
     * Set the macAddress property: The MAC address of the network interface.
     *
     * @param macAddress the macAddress value to set.
     * @return the NetworkInterfacePropertiesFormatInner object itself.
     */
    public NetworkInterfacePropertiesFormatInner withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    /**
     * Get the primary property: Gets whether this is a primary network interface on a virtual machine.
     *
     * @return the primary value.
     */
    public Boolean primary() {
        return this.primary;
    }

    /**
     * Set the primary property: Gets whether this is a primary network interface on a virtual machine.
     *
     * @param primary the primary value to set.
     * @return the NetworkInterfacePropertiesFormatInner object itself.
     */
    public NetworkInterfacePropertiesFormatInner withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the enableAcceleratedNetworking property: If the network interface is accelerated networking enabled.
     *
     * @return the enableAcceleratedNetworking value.
     */
    public Boolean enableAcceleratedNetworking() {
        return this.enableAcceleratedNetworking;
    }

    /**
     * Set the enableAcceleratedNetworking property: If the network interface is accelerated networking enabled.
     *
     * @param enableAcceleratedNetworking the enableAcceleratedNetworking value to set.
     * @return the NetworkInterfacePropertiesFormatInner object itself.
     */
    public NetworkInterfacePropertiesFormatInner withEnableAcceleratedNetworking(Boolean enableAcceleratedNetworking) {
        this.enableAcceleratedNetworking = enableAcceleratedNetworking;
        return this;
    }

    /**
     * Get the enableIpForwarding property: Indicates whether IP forwarding is enabled on this network interface.
     *
     * @return the enableIpForwarding value.
     */
    public Boolean enableIpForwarding() {
        return this.enableIpForwarding;
    }

    /**
     * Set the enableIpForwarding property: Indicates whether IP forwarding is enabled on this network interface.
     *
     * @param enableIpForwarding the enableIpForwarding value to set.
     * @return the NetworkInterfacePropertiesFormatInner object itself.
     */
    public NetworkInterfacePropertiesFormatInner withEnableIpForwarding(Boolean enableIpForwarding) {
        this.enableIpForwarding = enableIpForwarding;
        return this;
    }

    /**
     * Get the hostedWorkloads property: A list of references to linked BareMetal resources.
     *
     * @return the hostedWorkloads value.
     */
    public List<String> hostedWorkloads() {
        return this.hostedWorkloads;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the network interface resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid property: The resource GUID property of the network interface resource.
     *
     * @param resourceGuid the resourceGuid value to set.
     * @return the NetworkInterfacePropertiesFormatInner object itself.
     */
    public NetworkInterfacePropertiesFormatInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the NetworkInterfacePropertiesFormatInner object itself.
     */
    public NetworkInterfacePropertiesFormatInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkSecurityGroup() != null) {
            networkSecurityGroup().validate();
        }
        if (interfaceEndpoint() != null) {
            interfaceEndpoint().validate();
        }
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
        if (tapConfigurations() != null) {
            tapConfigurations().forEach(e -> e.validate());
        }
        if (dnsSettings() != null) {
            dnsSettings().validate();
        }
    }
}
