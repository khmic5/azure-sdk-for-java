// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric;

import com.azure.resourcemanager.servicefabric.models.ArmServicePackageActivationMode;
import com.azure.resourcemanager.servicefabric.models.MoveCost;
import com.azure.resourcemanager.servicefabric.models.ServiceCorrelationDescription;
import com.azure.resourcemanager.servicefabric.models.ServiceCorrelationScheme;
import com.azure.resourcemanager.servicefabric.models.ServiceLoadMetricDescription;
import com.azure.resourcemanager.servicefabric.models.ServiceLoadMetricWeight;
import com.azure.resourcemanager.servicefabric.models.SingletonPartitionSchemeDescription;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Services CreateOrUpdate. */
public final class ServicesCreateOrUpdateSamples {
    /*
     * operationId: Services_CreateOrUpdate
     * api-version: 2021-06-01
     * x-ms-examples: Put a service with minimum parameters
     */
    /**
     * Sample code: Put a service with minimum parameters.
     *
     * @param manager Entry point to ServiceFabricManager.
     */
    public static void putAServiceWithMinimumParameters(
        com.azure.resourcemanager.servicefabric.ServiceFabricManager manager) {
        manager
            .services()
            .define("myService")
            .withExistingApplication("resRg", "myCluster", "myApp")
            .withTags(mapOf())
            .withServiceTypeName("myServiceType")
            .withPartitionDescription(new SingletonPartitionSchemeDescription())
            .create();
    }

    /*
     * operationId: Services_CreateOrUpdate
     * api-version: 2021-06-01
     * x-ms-examples: Put a service with maximum parameters
     */
    /**
     * Sample code: Put a service with maximum parameters.
     *
     * @param manager Entry point to ServiceFabricManager.
     */
    public static void putAServiceWithMaximumParameters(
        com.azure.resourcemanager.servicefabric.ServiceFabricManager manager) {
        manager
            .services()
            .define("myService")
            .withExistingApplication("resRg", "myCluster", "myApp")
            .withTags(mapOf())
            .withServiceTypeName("myServiceType")
            .withPartitionDescription(new SingletonPartitionSchemeDescription())
            .withServicePackageActivationMode(ArmServicePackageActivationMode.SHARED_PROCESS)
            .withServiceDnsName("my.service.dns")
            .withPlacementConstraints("NodeType==frontend")
            .withCorrelationScheme(
                Arrays
                    .asList(
                        new ServiceCorrelationDescription()
                            .withScheme(ServiceCorrelationScheme.AFFINITY)
                            .withServiceName("fabric:/app1/app1~svc1")))
            .withServiceLoadMetrics(
                Arrays
                    .asList(
                        new ServiceLoadMetricDescription().withName("metric1").withWeight(ServiceLoadMetricWeight.LOW)))
            .withServicePlacementPolicies(Arrays.asList())
            .withDefaultMoveCost(MoveCost.MEDIUM)
            .create();
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
