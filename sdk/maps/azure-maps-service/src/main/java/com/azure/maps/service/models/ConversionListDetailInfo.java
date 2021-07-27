// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Detail information for the conversion requests. */
@Immutable
public final class ConversionListDetailInfo {
    /*
     * A unique id that represents the artifact of a _successfully_ completed
     * conversion process.
     */
    @JsonProperty(value = "conversionId", access = JsonProperty.Access.WRITE_ONLY)
    private String conversionId;

    /*
     * The ontology version of this dataset.
     */
    @JsonProperty(value = "ontology", access = JsonProperty.Access.WRITE_ONLY)
    private String ontology;

    /*
     * The unique id of the content provided to create this conversion.
     */
    @JsonProperty(value = "udid", access = JsonProperty.Access.WRITE_ONLY)
    private String udid;

    /*
     * The date and time of this conversion.
     */
    @JsonProperty(value = "created", access = JsonProperty.Access.WRITE_ONLY)
    private String created;

    /*
     * User provided description of the content being converted.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * A summary of feature counts in this conversion.
     */
    @JsonProperty(value = "featureCounts", access = JsonProperty.Access.WRITE_ONLY)
    private Object featureCounts;

    /**
     * Get the conversionId property: A unique id that represents the artifact of a _successfully_ completed conversion
     * process.
     *
     * @return the conversionId value.
     */
    public String getConversionId() {
        return this.conversionId;
    }

    /**
     * Get the ontology property: The ontology version of this dataset.
     *
     * @return the ontology value.
     */
    public String getOntology() {
        return this.ontology;
    }

    /**
     * Get the udid property: The unique id of the content provided to create this conversion.
     *
     * @return the udid value.
     */
    public String getUdid() {
        return this.udid;
    }

    /**
     * Get the created property: The date and time of this conversion.
     *
     * @return the created value.
     */
    public String getCreated() {
        return this.created;
    }

    /**
     * Get the description property: User provided description of the content being converted.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Get the featureCounts property: A summary of feature counts in this conversion.
     *
     * @return the featureCounts value.
     */
    public Object getFeatureCounts() {
        return this.featureCounts;
    }
}
