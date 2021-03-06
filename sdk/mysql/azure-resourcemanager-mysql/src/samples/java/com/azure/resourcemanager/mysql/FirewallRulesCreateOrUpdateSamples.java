// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql;

/** Samples for FirewallRules CreateOrUpdate. */
public final class FirewallRulesCreateOrUpdateSamples {
    /**
     * Sample code: FirewallRuleCreate.
     *
     * @param mySqlManager Entry point to MySqlManager. The Microsoft Azure management API provides create, read,
     *     update, and delete functionality for Azure MySQL resources including servers, databases, firewall rules, VNET
     *     rules, log files and configurations with new business model.
     */
    public static void firewallRuleCreate(com.azure.resourcemanager.mysql.MySqlManager mySqlManager) {
        mySqlManager
            .firewallRules()
            .define("rule1")
            .withExistingServer("TestGroup", "testserver")
            .withStartIpAddress("0.0.0.0")
            .withEndIpAddress("255.255.255.255")
            .create();
    }
}
