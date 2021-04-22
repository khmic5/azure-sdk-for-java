// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.deploymentmanager {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.deploymentmanager;
    exports com.azure.resourcemanager.deploymentmanager.fluent;
    exports com.azure.resourcemanager.deploymentmanager.fluent.models;
    exports com.azure.resourcemanager.deploymentmanager.models;

    opens com.azure.resourcemanager.deploymentmanager.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.deploymentmanager.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}