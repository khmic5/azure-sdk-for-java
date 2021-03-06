// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.models.LegacySharedScopeReservationRecommendationProperties;
import com.azure.resourcemanager.consumption.models.LegacySingleScopeReservationRecommendationProperties;
import com.azure.resourcemanager.consumption.models.SkuProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** The properties of the reservation recommendation. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "scope",
    defaultImpl = LegacyReservationRecommendationProperties.class)
@JsonTypeName("LegacyReservationRecommendationProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Single", value = LegacySingleScopeReservationRecommendationProperties.class),
    @JsonSubTypes.Type(name = "Shared", value = LegacySharedScopeReservationRecommendationProperties.class)
})
@Immutable
public class LegacyReservationRecommendationProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LegacyReservationRecommendationProperties.class);

    /*
     * The number of days of usage to look back for recommendation.
     */
    @JsonProperty(value = "lookBackPeriod", access = JsonProperty.Access.WRITE_ONLY)
    private String lookBackPeriod;

    /*
     * The instance Flexibility Ratio.
     */
    @JsonProperty(value = "instanceFlexibilityRatio", access = JsonProperty.Access.WRITE_ONLY)
    private Float instanceFlexibilityRatio;

    /*
     * The instance Flexibility Group.
     */
    @JsonProperty(value = "instanceFlexibilityGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceFlexibilityGroup;

    /*
     * The normalized Size.
     */
    @JsonProperty(value = "normalizedSize", access = JsonProperty.Access.WRITE_ONLY)
    private String normalizedSize;

    /*
     * The recommended Quantity Normalized.
     */
    @JsonProperty(value = "recommendedQuantityNormalized", access = JsonProperty.Access.WRITE_ONLY)
    private Float recommendedQuantityNormalized;

    /*
     * The meter id (GUID)
     */
    @JsonProperty(value = "meterId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID meterId;

    /*
     * The azure resource type.
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /*
     * RI recommendations in one or three year terms.
     */
    @JsonProperty(value = "term", access = JsonProperty.Access.WRITE_ONLY)
    private String term;

    /*
     * The total amount of cost without reserved instances.
     */
    @JsonProperty(value = "costWithNoReservedInstances", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal costWithNoReservedInstances;

    /*
     * Recommended quality for reserved instances.
     */
    @JsonProperty(value = "recommendedQuantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal recommendedQuantity;

    /*
     * The total amount of cost with reserved instances.
     */
    @JsonProperty(value = "totalCostWithReservedInstances", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal totalCostWithReservedInstances;

    /*
     * Total estimated savings with reserved instances.
     */
    @JsonProperty(value = "netSavings", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal netSavings;

    /*
     * The usage date for looking back.
     */
    @JsonProperty(value = "firstUsageDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime firstUsageDate;

    /*
     * List of sku properties
     */
    @JsonProperty(value = "skuProperties", access = JsonProperty.Access.WRITE_ONLY)
    private List<SkuProperty> skuProperties;

    /**
     * Get the lookBackPeriod property: The number of days of usage to look back for recommendation.
     *
     * @return the lookBackPeriod value.
     */
    public String lookBackPeriod() {
        return this.lookBackPeriod;
    }

    /**
     * Get the instanceFlexibilityRatio property: The instance Flexibility Ratio.
     *
     * @return the instanceFlexibilityRatio value.
     */
    public Float instanceFlexibilityRatio() {
        return this.instanceFlexibilityRatio;
    }

    /**
     * Get the instanceFlexibilityGroup property: The instance Flexibility Group.
     *
     * @return the instanceFlexibilityGroup value.
     */
    public String instanceFlexibilityGroup() {
        return this.instanceFlexibilityGroup;
    }

    /**
     * Get the normalizedSize property: The normalized Size.
     *
     * @return the normalizedSize value.
     */
    public String normalizedSize() {
        return this.normalizedSize;
    }

    /**
     * Get the recommendedQuantityNormalized property: The recommended Quantity Normalized.
     *
     * @return the recommendedQuantityNormalized value.
     */
    public Float recommendedQuantityNormalized() {
        return this.recommendedQuantityNormalized;
    }

    /**
     * Get the meterId property: The meter id (GUID).
     *
     * @return the meterId value.
     */
    public UUID meterId() {
        return this.meterId;
    }

    /**
     * Get the resourceType property: The azure resource type.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the term property: RI recommendations in one or three year terms.
     *
     * @return the term value.
     */
    public String term() {
        return this.term;
    }

    /**
     * Get the costWithNoReservedInstances property: The total amount of cost without reserved instances.
     *
     * @return the costWithNoReservedInstances value.
     */
    public BigDecimal costWithNoReservedInstances() {
        return this.costWithNoReservedInstances;
    }

    /**
     * Get the recommendedQuantity property: Recommended quality for reserved instances.
     *
     * @return the recommendedQuantity value.
     */
    public BigDecimal recommendedQuantity() {
        return this.recommendedQuantity;
    }

    /**
     * Get the totalCostWithReservedInstances property: The total amount of cost with reserved instances.
     *
     * @return the totalCostWithReservedInstances value.
     */
    public BigDecimal totalCostWithReservedInstances() {
        return this.totalCostWithReservedInstances;
    }

    /**
     * Get the netSavings property: Total estimated savings with reserved instances.
     *
     * @return the netSavings value.
     */
    public BigDecimal netSavings() {
        return this.netSavings;
    }

    /**
     * Get the firstUsageDate property: The usage date for looking back.
     *
     * @return the firstUsageDate value.
     */
    public OffsetDateTime firstUsageDate() {
        return this.firstUsageDate;
    }

    /**
     * Get the skuProperties property: List of sku properties.
     *
     * @return the skuProperties value.
     */
    public List<SkuProperty> skuProperties() {
        return this.skuProperties;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (skuProperties() != null) {
            skuProperties().forEach(e -> e.validate());
        }
    }
}
