// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridnetwork.fluent.models.VendorNetworkFunctionInner;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionVendorConfiguration;
import com.azure.resourcemanager.hybridnetwork.models.ProvisioningState;
import com.azure.resourcemanager.hybridnetwork.models.SkuType;
import com.azure.resourcemanager.hybridnetwork.models.VendorNetworkFunction;
import com.azure.resourcemanager.hybridnetwork.models.VendorProvisioningState;
import java.util.Collections;
import java.util.List;

public final class VendorNetworkFunctionImpl
    implements VendorNetworkFunction, VendorNetworkFunction.Definition, VendorNetworkFunction.Update {
    private VendorNetworkFunctionInner innerObject;

    private final com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public VendorProvisioningState vendorProvisioningState() {
        return this.innerModel().vendorProvisioningState();
    }

    public String skuName() {
        return this.innerModel().skuName();
    }

    public SkuType skuType() {
        return this.innerModel().skuType();
    }

    public List<NetworkFunctionVendorConfiguration> networkFunctionVendorConfigurations() {
        List<NetworkFunctionVendorConfiguration> inner = this.innerModel().networkFunctionVendorConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public VendorNetworkFunctionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager() {
        return this.serviceManager;
    }

    private String locationName;

    private String vendorName;

    private String serviceKey;

    public VendorNetworkFunctionImpl withExistingVendor(String locationName, String vendorName) {
        this.locationName = locationName;
        this.vendorName = vendorName;
        return this;
    }

    public VendorNetworkFunction create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVendorNetworkFunctions()
                .createOrUpdate(locationName, vendorName, serviceKey, this.innerModel(), Context.NONE);
        return this;
    }

    public VendorNetworkFunction create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVendorNetworkFunctions()
                .createOrUpdate(locationName, vendorName, serviceKey, this.innerModel(), context);
        return this;
    }

    VendorNetworkFunctionImpl(
        String name, com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager) {
        this.innerObject = new VendorNetworkFunctionInner();
        this.serviceManager = serviceManager;
        this.serviceKey = name;
    }

    public VendorNetworkFunctionImpl update() {
        return this;
    }

    public VendorNetworkFunction apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVendorNetworkFunctions()
                .createOrUpdate(locationName, vendorName, serviceKey, this.innerModel(), Context.NONE);
        return this;
    }

    public VendorNetworkFunction apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVendorNetworkFunctions()
                .createOrUpdate(locationName, vendorName, serviceKey, this.innerModel(), context);
        return this;
    }

    VendorNetworkFunctionImpl(
        VendorNetworkFunctionInner innerObject,
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.locationName = Utils.getValueFromIdByName(innerObject.id(), "locations");
        this.vendorName = Utils.getValueFromIdByName(innerObject.id(), "vendors");
        this.serviceKey = Utils.getValueFromIdByName(innerObject.id(), "networkFunctions");
    }

    public VendorNetworkFunction refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVendorNetworkFunctions()
                .getWithResponse(locationName, vendorName, serviceKey, Context.NONE)
                .getValue();
        return this;
    }

    public VendorNetworkFunction refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVendorNetworkFunctions()
                .getWithResponse(locationName, vendorName, serviceKey, context)
                .getValue();
        return this;
    }

    public VendorNetworkFunctionImpl withVendorProvisioningState(VendorProvisioningState vendorProvisioningState) {
        this.innerModel().withVendorProvisioningState(vendorProvisioningState);
        return this;
    }

    public VendorNetworkFunctionImpl withNetworkFunctionVendorConfigurations(
        List<NetworkFunctionVendorConfiguration> networkFunctionVendorConfigurations) {
        this.innerModel().withNetworkFunctionVendorConfigurations(networkFunctionVendorConfigurations);
        return this;
    }
}
