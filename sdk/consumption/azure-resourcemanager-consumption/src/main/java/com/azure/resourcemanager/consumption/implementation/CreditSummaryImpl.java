// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

import com.azure.resourcemanager.consumption.fluent.models.CreditSummaryInner;
import com.azure.resourcemanager.consumption.models.Amount;
import com.azure.resourcemanager.consumption.models.CreditBalanceSummary;
import com.azure.resourcemanager.consumption.models.CreditSummary;
import com.azure.resourcemanager.consumption.models.Reseller;
import java.util.Collections;
import java.util.Map;

public final class CreditSummaryImpl implements CreditSummary {
    private CreditSummaryInner innerObject;

    private final com.azure.resourcemanager.consumption.ConsumptionManager serviceManager;

    CreditSummaryImpl(
        CreditSummaryInner innerObject, com.azure.resourcemanager.consumption.ConsumptionManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String creditCurrency() {
        return this.innerModel().creditCurrency();
    }

    public String billingCurrency() {
        return this.innerModel().billingCurrency();
    }

    public CreditBalanceSummary balanceSummary() {
        return this.innerModel().balanceSummary();
    }

    public Amount pendingCreditAdjustments() {
        return this.innerModel().pendingCreditAdjustments();
    }

    public Amount expiredCredit() {
        return this.innerModel().expiredCredit();
    }

    public Amount pendingEligibleCharges() {
        return this.innerModel().pendingEligibleCharges();
    }

    public Reseller reseller() {
        return this.innerModel().reseller();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public CreditSummaryInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.consumption.ConsumptionManager manager() {
        return this.serviceManager;
    }
}