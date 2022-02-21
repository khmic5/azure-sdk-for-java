// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.dnsresolver.models.DnsResolver;
import java.util.HashMap;
import java.util.Map;

/** Samples for DnsResolvers Update. */
public final class DnsResolversUpdateSamples {
    /*
     * x-ms-original-file: specification/dnsresolver/resource-manager/Microsoft.Network/preview/2020-04-01-preview/examples/DnsResolver_Patch.json
     */
    /**
     * Sample code: Update DNS resolver.
     *
     * @param manager Entry point to DnsResolverManager.
     */
    public static void updateDNSResolver(com.azure.resourcemanager.dnsresolver.DnsResolverManager manager) {
        DnsResolver resource =
            manager
                .dnsResolvers()
                .getByResourceGroupWithResponse("sampleResourceGroup", "sampleDnsResolver", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("key1", "value1")).apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
