// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.LoadBalancerOutboundRuleProtocol;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Outbound rule of the load balancer. */
@Fluent
public final class OutboundRulePropertiesFormat {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OutboundRulePropertiesFormat.class);

    /*
     * The number of outbound ports to be used for NAT.
     */
    @JsonProperty(value = "allocatedOutboundPorts")
    private Integer allocatedOutboundPorts;

    /*
     * The Frontend IP addresses of the load balancer.
     */
    @JsonProperty(value = "frontendIPConfigurations", required = true)
    private List<SubResource> frontendIpConfigurations;

    /*
     * A reference to a pool of DIPs. Outbound traffic is randomly load
     * balanced across IPs in the backend IPs.
     */
    @JsonProperty(value = "backendAddressPool", required = true)
    private SubResource backendAddressPool;

    /*
     * Gets the provisioning state of the PublicIP resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /*
     * Protocol - TCP, UDP or All
     */
    @JsonProperty(value = "protocol", required = true)
    private LoadBalancerOutboundRuleProtocol protocol;

    /*
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is
     * set to TCP.
     */
    @JsonProperty(value = "enableTcpReset")
    private Boolean enableTcpReset;

    /*
     * The timeout for the TCP idle connection
     */
    @JsonProperty(value = "idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /**
     * Get the allocatedOutboundPorts property: The number of outbound ports to be used for NAT.
     *
     * @return the allocatedOutboundPorts value.
     */
    public Integer allocatedOutboundPorts() {
        return this.allocatedOutboundPorts;
    }

    /**
     * Set the allocatedOutboundPorts property: The number of outbound ports to be used for NAT.
     *
     * @param allocatedOutboundPorts the allocatedOutboundPorts value to set.
     * @return the OutboundRulePropertiesFormat object itself.
     */
    public OutboundRulePropertiesFormat withAllocatedOutboundPorts(Integer allocatedOutboundPorts) {
        this.allocatedOutboundPorts = allocatedOutboundPorts;
        return this;
    }

    /**
     * Get the frontendIpConfigurations property: The Frontend IP addresses of the load balancer.
     *
     * @return the frontendIpConfigurations value.
     */
    public List<SubResource> frontendIpConfigurations() {
        return this.frontendIpConfigurations;
    }

    /**
     * Set the frontendIpConfigurations property: The Frontend IP addresses of the load balancer.
     *
     * @param frontendIpConfigurations the frontendIpConfigurations value to set.
     * @return the OutboundRulePropertiesFormat object itself.
     */
    public OutboundRulePropertiesFormat withFrontendIpConfigurations(List<SubResource> frontendIpConfigurations) {
        this.frontendIpConfigurations = frontendIpConfigurations;
        return this;
    }

    /**
     * Get the backendAddressPool property: A reference to a pool of DIPs. Outbound traffic is randomly load balanced
     * across IPs in the backend IPs.
     *
     * @return the backendAddressPool value.
     */
    public SubResource backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set the backendAddressPool property: A reference to a pool of DIPs. Outbound traffic is randomly load balanced
     * across IPs in the backend IPs.
     *
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the OutboundRulePropertiesFormat object itself.
     */
    public OutboundRulePropertiesFormat withBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the PublicIP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Gets the provisioning state of the PublicIP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the OutboundRulePropertiesFormat object itself.
     */
    public OutboundRulePropertiesFormat withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the protocol property: Protocol - TCP, UDP or All.
     *
     * @return the protocol value.
     */
    public LoadBalancerOutboundRuleProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Protocol - TCP, UDP or All.
     *
     * @param protocol the protocol value to set.
     * @return the OutboundRulePropertiesFormat object itself.
     */
    public OutboundRulePropertiesFormat withProtocol(LoadBalancerOutboundRuleProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is set to TCP.
     *
     * @return the enableTcpReset value.
     */
    public Boolean enableTcpReset() {
        return this.enableTcpReset;
    }

    /**
     * Set the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is set to TCP.
     *
     * @param enableTcpReset the enableTcpReset value to set.
     * @return the OutboundRulePropertiesFormat object itself.
     */
    public OutboundRulePropertiesFormat withEnableTcpReset(Boolean enableTcpReset) {
        this.enableTcpReset = enableTcpReset;
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes property: The timeout for the TCP idle connection.
     *
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes property: The timeout for the TCP idle connection.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the OutboundRulePropertiesFormat object itself.
     */
    public OutboundRulePropertiesFormat withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (frontendIpConfigurations() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property frontendIpConfigurations in model OutboundRulePropertiesFormat"));
        }
        if (backendAddressPool() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property backendAddressPool in model OutboundRulePropertiesFormat"));
        }
        if (protocol() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property protocol in model OutboundRulePropertiesFormat"));
        }
    }
}
