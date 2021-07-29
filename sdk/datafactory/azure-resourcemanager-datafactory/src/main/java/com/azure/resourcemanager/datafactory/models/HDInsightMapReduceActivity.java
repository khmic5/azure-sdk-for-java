// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.HDInsightMapReduceActivityTypeProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** HDInsight MapReduce activity type. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HDInsightMapReduce")
@Fluent
public final class HDInsightMapReduceActivity extends ExecutionActivity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HDInsightMapReduceActivity.class);

    /*
     * HDInsight MapReduce activity properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private HDInsightMapReduceActivityTypeProperties innerTypeProperties =
        new HDInsightMapReduceActivityTypeProperties();

    /**
     * Get the innerTypeProperties property: HDInsight MapReduce activity properties.
     *
     * @return the innerTypeProperties value.
     */
    private HDInsightMapReduceActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightMapReduceActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightMapReduceActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightMapReduceActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightMapReduceActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightMapReduceActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HDInsightMapReduceActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the storageLinkedServices property: Storage linked service references.
     *
     * @return the storageLinkedServices value.
     */
    public List<LinkedServiceReference> storageLinkedServices() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().storageLinkedServices();
    }

    /**
     * Set the storageLinkedServices property: Storage linked service references.
     *
     * @param storageLinkedServices the storageLinkedServices value to set.
     * @return the HDInsightMapReduceActivity object itself.
     */
    public HDInsightMapReduceActivity withStorageLinkedServices(List<LinkedServiceReference> storageLinkedServices) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightMapReduceActivityTypeProperties();
        }
        this.innerTypeProperties().withStorageLinkedServices(storageLinkedServices);
        return this;
    }

    /**
     * Get the arguments property: User specified arguments to HDInsightActivity.
     *
     * @return the arguments value.
     */
    public List<Object> arguments() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().arguments();
    }

    /**
     * Set the arguments property: User specified arguments to HDInsightActivity.
     *
     * @param arguments the arguments value to set.
     * @return the HDInsightMapReduceActivity object itself.
     */
    public HDInsightMapReduceActivity withArguments(List<Object> arguments) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightMapReduceActivityTypeProperties();
        }
        this.innerTypeProperties().withArguments(arguments);
        return this;
    }

    /**
     * Get the getDebugInfo property: Debug info option.
     *
     * @return the getDebugInfo value.
     */
    public HDInsightActivityDebugInfoOption getDebugInfo() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().getDebugInfo();
    }

    /**
     * Set the getDebugInfo property: Debug info option.
     *
     * @param getDebugInfo the getDebugInfo value to set.
     * @return the HDInsightMapReduceActivity object itself.
     */
    public HDInsightMapReduceActivity withGetDebugInfo(HDInsightActivityDebugInfoOption getDebugInfo) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightMapReduceActivityTypeProperties();
        }
        this.innerTypeProperties().withGetDebugInfo(getDebugInfo);
        return this;
    }

    /**
     * Get the className property: Class name. Type: string (or Expression with resultType string).
     *
     * @return the className value.
     */
    public Object className() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().className();
    }

    /**
     * Set the className property: Class name. Type: string (or Expression with resultType string).
     *
     * @param className the className value to set.
     * @return the HDInsightMapReduceActivity object itself.
     */
    public HDInsightMapReduceActivity withClassName(Object className) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightMapReduceActivityTypeProperties();
        }
        this.innerTypeProperties().withClassName(className);
        return this;
    }

    /**
     * Get the jarFilePath property: Jar path. Type: string (or Expression with resultType string).
     *
     * @return the jarFilePath value.
     */
    public Object jarFilePath() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().jarFilePath();
    }

    /**
     * Set the jarFilePath property: Jar path. Type: string (or Expression with resultType string).
     *
     * @param jarFilePath the jarFilePath value to set.
     * @return the HDInsightMapReduceActivity object itself.
     */
    public HDInsightMapReduceActivity withJarFilePath(Object jarFilePath) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightMapReduceActivityTypeProperties();
        }
        this.innerTypeProperties().withJarFilePath(jarFilePath);
        return this;
    }

    /**
     * Get the jarLinkedService property: Jar linked service reference.
     *
     * @return the jarLinkedService value.
     */
    public LinkedServiceReference jarLinkedService() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().jarLinkedService();
    }

    /**
     * Set the jarLinkedService property: Jar linked service reference.
     *
     * @param jarLinkedService the jarLinkedService value to set.
     * @return the HDInsightMapReduceActivity object itself.
     */
    public HDInsightMapReduceActivity withJarLinkedService(LinkedServiceReference jarLinkedService) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightMapReduceActivityTypeProperties();
        }
        this.innerTypeProperties().withJarLinkedService(jarLinkedService);
        return this;
    }

    /**
     * Get the jarLibs property: Jar libs.
     *
     * @return the jarLibs value.
     */
    public List<Object> jarLibs() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().jarLibs();
    }

    /**
     * Set the jarLibs property: Jar libs.
     *
     * @param jarLibs the jarLibs value to set.
     * @return the HDInsightMapReduceActivity object itself.
     */
    public HDInsightMapReduceActivity withJarLibs(List<Object> jarLibs) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightMapReduceActivityTypeProperties();
        }
        this.innerTypeProperties().withJarLibs(jarLibs);
        return this;
    }

    /**
     * Get the defines property: Allows user to specify defines for the MapReduce job request.
     *
     * @return the defines value.
     */
    public Map<String, Object> defines() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().defines();
    }

    /**
     * Set the defines property: Allows user to specify defines for the MapReduce job request.
     *
     * @param defines the defines value to set.
     * @return the HDInsightMapReduceActivity object itself.
     */
    public HDInsightMapReduceActivity withDefines(Map<String, Object> defines) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new HDInsightMapReduceActivityTypeProperties();
        }
        this.innerTypeProperties().withDefines(defines);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model HDInsightMapReduceActivity"));
        } else {
            innerTypeProperties().validate();
        }
    }
}
