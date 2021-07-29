// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.DatabricksSparkJarActivityTypeProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** DatabricksSparkJar activity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DatabricksSparkJar")
@Fluent
public final class DatabricksSparkJarActivity extends ExecutionActivity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabricksSparkJarActivity.class);

    /*
     * Databricks SparkJar activity properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private DatabricksSparkJarActivityTypeProperties innerTypeProperties =
        new DatabricksSparkJarActivityTypeProperties();

    /**
     * Get the innerTypeProperties property: Databricks SparkJar activity properties.
     *
     * @return the innerTypeProperties value.
     */
    private DatabricksSparkJarActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public DatabricksSparkJarActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatabricksSparkJarActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatabricksSparkJarActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatabricksSparkJarActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatabricksSparkJarActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatabricksSparkJarActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the mainClassName property: The full name of the class containing the main method to be executed. This class
     * must be contained in a JAR provided as a library. Type: string (or Expression with resultType string).
     *
     * @return the mainClassName value.
     */
    public Object mainClassName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().mainClassName();
    }

    /**
     * Set the mainClassName property: The full name of the class containing the main method to be executed. This class
     * must be contained in a JAR provided as a library. Type: string (or Expression with resultType string).
     *
     * @param mainClassName the mainClassName value to set.
     * @return the DatabricksSparkJarActivity object itself.
     */
    public DatabricksSparkJarActivity withMainClassName(Object mainClassName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DatabricksSparkJarActivityTypeProperties();
        }
        this.innerTypeProperties().withMainClassName(mainClassName);
        return this;
    }

    /**
     * Get the parameters property: Parameters that will be passed to the main method.
     *
     * @return the parameters value.
     */
    public List<Object> parameters() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().parameters();
    }

    /**
     * Set the parameters property: Parameters that will be passed to the main method.
     *
     * @param parameters the parameters value to set.
     * @return the DatabricksSparkJarActivity object itself.
     */
    public DatabricksSparkJarActivity withParameters(List<Object> parameters) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DatabricksSparkJarActivityTypeProperties();
        }
        this.innerTypeProperties().withParameters(parameters);
        return this;
    }

    /**
     * Get the libraries property: A list of libraries to be installed on the cluster that will execute the job.
     *
     * @return the libraries value.
     */
    public List<Map<String, Object>> libraries() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().libraries();
    }

    /**
     * Set the libraries property: A list of libraries to be installed on the cluster that will execute the job.
     *
     * @param libraries the libraries value to set.
     * @return the DatabricksSparkJarActivity object itself.
     */
    public DatabricksSparkJarActivity withLibraries(List<Map<String, Object>> libraries) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new DatabricksSparkJarActivityTypeProperties();
        }
        this.innerTypeProperties().withLibraries(libraries);
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
                        "Missing required property innerTypeProperties in model DatabricksSparkJarActivity"));
        } else {
            innerTypeProperties().validate();
        }
    }
}
