// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.models.RouteFilterRulePropertiesFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Route Filter Rule Resource. */
@Fluent
public final class PatchRouteFilterRule extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PatchRouteFilterRule.class);

    /*
     * Route Filter Rule Resource
     */
    @JsonProperty(value = "properties")
    private RouteFilterRulePropertiesFormat innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the innerProperties property: Route Filter Rule Resource.
     *
     * @return the innerProperties value.
     */
    private RouteFilterRulePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /** {@inheritDoc} */
    @Override
    public PatchRouteFilterRule withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the access property: The access type of the rule. Valid values are: 'Allow', 'Deny'.
     *
     * @return the access value.
     */
    public Access access() {
        return this.innerProperties() == null ? null : this.innerProperties().access();
    }

    /**
     * Set the access property: The access type of the rule. Valid values are: 'Allow', 'Deny'.
     *
     * @param access the access value to set.
     * @return the PatchRouteFilterRule object itself.
     */
    public PatchRouteFilterRule withAccess(Access access) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteFilterRulePropertiesFormat();
        }
        this.innerProperties().withAccess(access);
        return this;
    }

    /**
     * Get the routeFilterRuleType property: The rule type of the rule. Valid value is: 'Community'.
     *
     * @return the routeFilterRuleType value.
     */
    public RouteFilterRuleType routeFilterRuleType() {
        return this.innerProperties() == null ? null : this.innerProperties().routeFilterRuleType();
    }

    /**
     * Set the routeFilterRuleType property: The rule type of the rule. Valid value is: 'Community'.
     *
     * @param routeFilterRuleType the routeFilterRuleType value to set.
     * @return the PatchRouteFilterRule object itself.
     */
    public PatchRouteFilterRule withRouteFilterRuleType(RouteFilterRuleType routeFilterRuleType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteFilterRulePropertiesFormat();
        }
        this.innerProperties().withRouteFilterRuleType(routeFilterRuleType);
        return this;
    }

    /**
     * Get the communities property: The collection for bgp community values to filter on. e.g.
     * ['12076:5010','12076:5020'].
     *
     * @return the communities value.
     */
    public List<String> communities() {
        return this.innerProperties() == null ? null : this.innerProperties().communities();
    }

    /**
     * Set the communities property: The collection for bgp community values to filter on. e.g.
     * ['12076:5010','12076:5020'].
     *
     * @param communities the communities value to set.
     * @return the PatchRouteFilterRule object itself.
     */
    public PatchRouteFilterRule withCommunities(List<String> communities) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteFilterRulePropertiesFormat();
        }
        this.innerProperties().withCommunities(communities);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource. Possible values are: 'Updating',
     * 'Deleting', 'Succeeded' and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
