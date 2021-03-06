// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.models.MeterDetailsResponse;
import com.azure.resourcemanager.consumption.models.PricingModelType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/** The properties of the legacy usage detail. */
@Immutable
public final class LegacyUsageDetailProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LegacyUsageDetailProperties.class);

    /*
     * Billing Account identifier.
     */
    @JsonProperty(value = "billingAccountId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingAccountId;

    /*
     * Billing Account Name.
     */
    @JsonProperty(value = "billingAccountName", access = JsonProperty.Access.WRITE_ONLY)
    private String billingAccountName;

    /*
     * The billing period start date.
     */
    @JsonProperty(value = "billingPeriodStartDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime billingPeriodStartDate;

    /*
     * The billing period end date.
     */
    @JsonProperty(value = "billingPeriodEndDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime billingPeriodEndDate;

    /*
     * Billing Profile identifier.
     */
    @JsonProperty(value = "billingProfileId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileId;

    /*
     * Billing Profile Name.
     */
    @JsonProperty(value = "billingProfileName", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileName;

    /*
     * Account Owner Id.
     */
    @JsonProperty(value = "accountOwnerId", access = JsonProperty.Access.WRITE_ONLY)
    private String accountOwnerId;

    /*
     * Account Name.
     */
    @JsonProperty(value = "accountName", access = JsonProperty.Access.WRITE_ONLY)
    private String accountName;

    /*
     * Subscription guid.
     */
    @JsonProperty(value = "subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /*
     * Subscription name.
     */
    @JsonProperty(value = "subscriptionName", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionName;

    /*
     * Date for the usage record.
     */
    @JsonProperty(value = "date", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime date;

    /*
     * Product name for the consumed service or purchase. Not available for
     * Marketplace.
     */
    @JsonProperty(value = "product", access = JsonProperty.Access.WRITE_ONLY)
    private String product;

    /*
     * Part Number of the service used. Can be used to join with the price
     * sheet. Not available for marketplace.
     */
    @JsonProperty(value = "partNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String partNumber;

    /*
     * The meter id (GUID). Not available for marketplace. For reserved
     * instance this represents the primary meter for which the reservation was
     * purchased. For the actual VM Size for which the reservation is purchased
     * see productOrderName.
     */
    @JsonProperty(value = "meterId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID meterId;

    /*
     * The details about the meter. By default this is not populated, unless
     * it's specified in $expand.
     */
    @JsonProperty(value = "meterDetails", access = JsonProperty.Access.WRITE_ONLY)
    private MeterDetailsResponse meterDetails;

    /*
     * The usage quantity.
     */
    @JsonProperty(value = "quantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal quantity;

    /*
     * Effective Price that's charged for the usage.
     */
    @JsonProperty(value = "effectivePrice", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal effectivePrice;

    /*
     * The amount of cost before tax.
     */
    @JsonProperty(value = "cost", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal cost;

    /*
     * Unit Price is the price applicable to you. (your EA or other contract
     * price).
     */
    @JsonProperty(value = "unitPrice", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal unitPrice;

    /*
     * Billing Currency.
     */
    @JsonProperty(value = "billingCurrency", access = JsonProperty.Access.WRITE_ONLY)
    private String billingCurrency;

    /*
     * Resource Location.
     */
    @JsonProperty(value = "resourceLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceLocation;

    /*
     * Consumed service name. Name of the azure resource provider that emits
     * the usage or was purchased. This value is not provided for marketplace
     * usage.
     */
    @JsonProperty(value = "consumedService", access = JsonProperty.Access.WRITE_ONLY)
    private String consumedService;

    /*
     * Unique identifier of the Azure Resource Manager usage detail resource.
     */
    @JsonProperty(value = "resourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceId;

    /*
     * Resource Name.
     */
    @JsonProperty(value = "resourceName", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceName;

    /*
     * Service-specific metadata.
     */
    @JsonProperty(value = "serviceInfo1", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceInfo1;

    /*
     * Legacy field with optional service-specific metadata.
     */
    @JsonProperty(value = "serviceInfo2", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceInfo2;

    /*
     * Additional details of this usage item. By default this is not populated,
     * unless it's specified in $expand. Use this field to get usage line item
     * specific details such as the actual VM Size (ServiceType) or the ratio
     * in which the reservation discount is applied.
     */
    @JsonProperty(value = "additionalInfo", access = JsonProperty.Access.WRITE_ONLY)
    private String additionalInfo;

    /*
     * Invoice Section Name.
     */
    @JsonProperty(value = "invoiceSection", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSection;

    /*
     * The cost center of this department if it is a department and a cost
     * center is provided.
     */
    @JsonProperty(value = "costCenter", access = JsonProperty.Access.WRITE_ONLY)
    private String costCenter;

    /*
     * Resource Group Name.
     */
    @JsonProperty(value = "resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /*
     * ARM resource id of the reservation. Only applies to records relevant to
     * reservations.
     */
    @JsonProperty(value = "reservationId", access = JsonProperty.Access.WRITE_ONLY)
    private String reservationId;

    /*
     * User provided display name of the reservation. Last known name for a
     * particular day is populated in the daily data. Only applies to records
     * relevant to reservations.
     */
    @JsonProperty(value = "reservationName", access = JsonProperty.Access.WRITE_ONLY)
    private String reservationName;

    /*
     * Product Order Id. For reservations this is the Reservation Order ID.
     */
    @JsonProperty(value = "productOrderId", access = JsonProperty.Access.WRITE_ONLY)
    private String productOrderId;

    /*
     * Product Order Name. For reservations this is the SKU that was purchased.
     */
    @JsonProperty(value = "productOrderName", access = JsonProperty.Access.WRITE_ONLY)
    private String productOrderName;

    /*
     * Offer Id. Ex: MS-AZR-0017P, MS-AZR-0148P.
     */
    @JsonProperty(value = "offerId", access = JsonProperty.Access.WRITE_ONLY)
    private String offerId;

    /*
     * Is Azure Credit Eligible.
     */
    @JsonProperty(value = "isAzureCreditEligible", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isAzureCreditEligible;

    /*
     * Term (in months). 1 month for monthly recurring purchase. 12 months for
     * a 1 year reservation. 36 months for a 3 year reservation.
     */
    @JsonProperty(value = "term", access = JsonProperty.Access.WRITE_ONLY)
    private String term;

    /*
     * Publisher Name.
     */
    @JsonProperty(value = "publisherName", access = JsonProperty.Access.WRITE_ONLY)
    private String publisherName;

    /*
     * Publisher Type.
     */
    @JsonProperty(value = "publisherType", access = JsonProperty.Access.WRITE_ONLY)
    private String publisherType;

    /*
     * Plan Name.
     */
    @JsonProperty(value = "planName", access = JsonProperty.Access.WRITE_ONLY)
    private String planName;

    /*
     * Indicates a charge represents credits, usage, a Marketplace purchase, a
     * reservation fee, or a refund.
     */
    @JsonProperty(value = "chargeType", access = JsonProperty.Access.WRITE_ONLY)
    private String chargeType;

    /*
     * Indicates how frequently this charge will occur. OneTime for purchases
     * which only happen once, Monthly for fees which recur every month, and
     * UsageBased for charges based on how much a service is used.
     */
    @JsonProperty(value = "frequency", access = JsonProperty.Access.WRITE_ONLY)
    private String frequency;

    /*
     * Retail price for the resource.
     */
    @JsonProperty(value = "payGPrice", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal payGPrice;

    /*
     * Identifier that indicates how the meter is priced.
     */
    @JsonProperty(value = "pricingModel", access = JsonProperty.Access.WRITE_ONLY)
    private PricingModelType pricingModel;

    /**
     * Get the billingAccountId property: Billing Account identifier.
     *
     * @return the billingAccountId value.
     */
    public String billingAccountId() {
        return this.billingAccountId;
    }

    /**
     * Get the billingAccountName property: Billing Account Name.
     *
     * @return the billingAccountName value.
     */
    public String billingAccountName() {
        return this.billingAccountName;
    }

    /**
     * Get the billingPeriodStartDate property: The billing period start date.
     *
     * @return the billingPeriodStartDate value.
     */
    public OffsetDateTime billingPeriodStartDate() {
        return this.billingPeriodStartDate;
    }

    /**
     * Get the billingPeriodEndDate property: The billing period end date.
     *
     * @return the billingPeriodEndDate value.
     */
    public OffsetDateTime billingPeriodEndDate() {
        return this.billingPeriodEndDate;
    }

    /**
     * Get the billingProfileId property: Billing Profile identifier.
     *
     * @return the billingProfileId value.
     */
    public String billingProfileId() {
        return this.billingProfileId;
    }

    /**
     * Get the billingProfileName property: Billing Profile Name.
     *
     * @return the billingProfileName value.
     */
    public String billingProfileName() {
        return this.billingProfileName;
    }

    /**
     * Get the accountOwnerId property: Account Owner Id.
     *
     * @return the accountOwnerId value.
     */
    public String accountOwnerId() {
        return this.accountOwnerId;
    }

    /**
     * Get the accountName property: Account Name.
     *
     * @return the accountName value.
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Get the subscriptionId property: Subscription guid.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the subscriptionName property: Subscription name.
     *
     * @return the subscriptionName value.
     */
    public String subscriptionName() {
        return this.subscriptionName;
    }

    /**
     * Get the date property: Date for the usage record.
     *
     * @return the date value.
     */
    public OffsetDateTime date() {
        return this.date;
    }

    /**
     * Get the product property: Product name for the consumed service or purchase. Not available for Marketplace.
     *
     * @return the product value.
     */
    public String product() {
        return this.product;
    }

    /**
     * Get the partNumber property: Part Number of the service used. Can be used to join with the price sheet. Not
     * available for marketplace.
     *
     * @return the partNumber value.
     */
    public String partNumber() {
        return this.partNumber;
    }

    /**
     * Get the meterId property: The meter id (GUID). Not available for marketplace. For reserved instance this
     * represents the primary meter for which the reservation was purchased. For the actual VM Size for which the
     * reservation is purchased see productOrderName.
     *
     * @return the meterId value.
     */
    public UUID meterId() {
        return this.meterId;
    }

    /**
     * Get the meterDetails property: The details about the meter. By default this is not populated, unless it's
     * specified in $expand.
     *
     * @return the meterDetails value.
     */
    public MeterDetailsResponse meterDetails() {
        return this.meterDetails;
    }

    /**
     * Get the quantity property: The usage quantity.
     *
     * @return the quantity value.
     */
    public BigDecimal quantity() {
        return this.quantity;
    }

    /**
     * Get the effectivePrice property: Effective Price that's charged for the usage.
     *
     * @return the effectivePrice value.
     */
    public BigDecimal effectivePrice() {
        return this.effectivePrice;
    }

    /**
     * Get the cost property: The amount of cost before tax.
     *
     * @return the cost value.
     */
    public BigDecimal cost() {
        return this.cost;
    }

    /**
     * Get the unitPrice property: Unit Price is the price applicable to you. (your EA or other contract price).
     *
     * @return the unitPrice value.
     */
    public BigDecimal unitPrice() {
        return this.unitPrice;
    }

    /**
     * Get the billingCurrency property: Billing Currency.
     *
     * @return the billingCurrency value.
     */
    public String billingCurrency() {
        return this.billingCurrency;
    }

    /**
     * Get the resourceLocation property: Resource Location.
     *
     * @return the resourceLocation value.
     */
    public String resourceLocation() {
        return this.resourceLocation;
    }

    /**
     * Get the consumedService property: Consumed service name. Name of the azure resource provider that emits the usage
     * or was purchased. This value is not provided for marketplace usage.
     *
     * @return the consumedService value.
     */
    public String consumedService() {
        return this.consumedService;
    }

    /**
     * Get the resourceId property: Unique identifier of the Azure Resource Manager usage detail resource.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Get the resourceName property: Resource Name.
     *
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Get the serviceInfo1 property: Service-specific metadata.
     *
     * @return the serviceInfo1 value.
     */
    public String serviceInfo1() {
        return this.serviceInfo1;
    }

    /**
     * Get the serviceInfo2 property: Legacy field with optional service-specific metadata.
     *
     * @return the serviceInfo2 value.
     */
    public String serviceInfo2() {
        return this.serviceInfo2;
    }

    /**
     * Get the additionalInfo property: Additional details of this usage item. By default this is not populated, unless
     * it's specified in $expand. Use this field to get usage line item specific details such as the actual VM Size
     * (ServiceType) or the ratio in which the reservation discount is applied.
     *
     * @return the additionalInfo value.
     */
    public String additionalInfo() {
        return this.additionalInfo;
    }

    /**
     * Get the invoiceSection property: Invoice Section Name.
     *
     * @return the invoiceSection value.
     */
    public String invoiceSection() {
        return this.invoiceSection;
    }

    /**
     * Get the costCenter property: The cost center of this department if it is a department and a cost center is
     * provided.
     *
     * @return the costCenter value.
     */
    public String costCenter() {
        return this.costCenter;
    }

    /**
     * Get the resourceGroup property: Resource Group Name.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get the reservationId property: ARM resource id of the reservation. Only applies to records relevant to
     * reservations.
     *
     * @return the reservationId value.
     */
    public String reservationId() {
        return this.reservationId;
    }

    /**
     * Get the reservationName property: User provided display name of the reservation. Last known name for a particular
     * day is populated in the daily data. Only applies to records relevant to reservations.
     *
     * @return the reservationName value.
     */
    public String reservationName() {
        return this.reservationName;
    }

    /**
     * Get the productOrderId property: Product Order Id. For reservations this is the Reservation Order ID.
     *
     * @return the productOrderId value.
     */
    public String productOrderId() {
        return this.productOrderId;
    }

    /**
     * Get the productOrderName property: Product Order Name. For reservations this is the SKU that was purchased.
     *
     * @return the productOrderName value.
     */
    public String productOrderName() {
        return this.productOrderName;
    }

    /**
     * Get the offerId property: Offer Id. Ex: MS-AZR-0017P, MS-AZR-0148P.
     *
     * @return the offerId value.
     */
    public String offerId() {
        return this.offerId;
    }

    /**
     * Get the isAzureCreditEligible property: Is Azure Credit Eligible.
     *
     * @return the isAzureCreditEligible value.
     */
    public Boolean isAzureCreditEligible() {
        return this.isAzureCreditEligible;
    }

    /**
     * Get the term property: Term (in months). 1 month for monthly recurring purchase. 12 months for a 1 year
     * reservation. 36 months for a 3 year reservation.
     *
     * @return the term value.
     */
    public String term() {
        return this.term;
    }

    /**
     * Get the publisherName property: Publisher Name.
     *
     * @return the publisherName value.
     */
    public String publisherName() {
        return this.publisherName;
    }

    /**
     * Get the publisherType property: Publisher Type.
     *
     * @return the publisherType value.
     */
    public String publisherType() {
        return this.publisherType;
    }

    /**
     * Get the planName property: Plan Name.
     *
     * @return the planName value.
     */
    public String planName() {
        return this.planName;
    }

    /**
     * Get the chargeType property: Indicates a charge represents credits, usage, a Marketplace purchase, a reservation
     * fee, or a refund.
     *
     * @return the chargeType value.
     */
    public String chargeType() {
        return this.chargeType;
    }

    /**
     * Get the frequency property: Indicates how frequently this charge will occur. OneTime for purchases which only
     * happen once, Monthly for fees which recur every month, and UsageBased for charges based on how much a service is
     * used.
     *
     * @return the frequency value.
     */
    public String frequency() {
        return this.frequency;
    }

    /**
     * Get the payGPrice property: Retail price for the resource.
     *
     * @return the payGPrice value.
     */
    public BigDecimal payGPrice() {
        return this.payGPrice;
    }

    /**
     * Get the pricingModel property: Identifier that indicates how the meter is priced.
     *
     * @return the pricingModel value.
     */
    public PricingModelType pricingModel() {
        return this.pricingModel;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (meterDetails() != null) {
            meterDetails().validate();
        }
    }
}
