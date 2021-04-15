// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.WebhookInner;
import com.azure.resourcemanager.automation.models.RunbookAssociationProperty;
import com.azure.resourcemanager.automation.models.Webhook;
import com.azure.resourcemanager.automation.models.WebhookCreateOrUpdateParameters;
import com.azure.resourcemanager.automation.models.WebhookUpdateParameters;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class WebhookImpl implements Webhook, Webhook.Definition, Webhook.Update {
    private WebhookInner innerObject;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Boolean isEnabled() {
        return this.innerModel().isEnabled();
    }

    public String uri() {
        return this.innerModel().uri();
    }

    public OffsetDateTime expiryTime() {
        return this.innerModel().expiryTime();
    }

    public OffsetDateTime lastInvokedTime() {
        return this.innerModel().lastInvokedTime();
    }

    public Map<String, String> parameters() {
        Map<String, String> inner = this.innerModel().parameters();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public RunbookAssociationProperty runbook() {
        return this.innerModel().runbook();
    }

    public String runOn() {
        return this.innerModel().runOn();
    }

    public OffsetDateTime creationTime() {
        return this.innerModel().creationTime();
    }

    public OffsetDateTime lastModifiedTime() {
        return this.innerModel().lastModifiedTime();
    }

    public String lastModifiedBy() {
        return this.innerModel().lastModifiedBy();
    }

    public String description() {
        return this.innerModel().description();
    }

    public WebhookInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String automationAccountName;

    private String webhookName;

    private WebhookCreateOrUpdateParameters createParameters;

    private WebhookUpdateParameters updateParameters;

    public WebhookImpl withExistingAutomationAccount(String resourceGroupName, String automationAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.automationAccountName = automationAccountName;
        return this;
    }

    public Webhook create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebhooks()
                .createOrUpdateWithResponse(
                    resourceGroupName, automationAccountName, webhookName, createParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Webhook create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebhooks()
                .createOrUpdateWithResponse(
                    resourceGroupName, automationAccountName, webhookName, createParameters, context)
                .getValue();
        return this;
    }

    WebhookImpl(String name, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = new WebhookInner();
        this.serviceManager = serviceManager;
        this.webhookName = name;
        this.createParameters = new WebhookCreateOrUpdateParameters();
    }

    public WebhookImpl update() {
        this.updateParameters = new WebhookUpdateParameters();
        return this;
    }

    public Webhook apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebhooks()
                .updateWithResponse(
                    resourceGroupName, automationAccountName, webhookName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Webhook apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebhooks()
                .updateWithResponse(resourceGroupName, automationAccountName, webhookName, updateParameters, context)
                .getValue();
        return this;
    }

    WebhookImpl(WebhookInner innerObject, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.automationAccountName = Utils.getValueFromIdByName(innerObject.id(), "automationAccounts");
        this.webhookName = Utils.getValueFromIdByName(innerObject.id(), "webhooks");
    }

    public Webhook refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebhooks()
                .getWithResponse(resourceGroupName, automationAccountName, webhookName, Context.NONE)
                .getValue();
        return this;
    }

    public Webhook refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebhooks()
                .getWithResponse(resourceGroupName, automationAccountName, webhookName, context)
                .getValue();
        return this;
    }

    public WebhookImpl withName(String name) {
        if (isInCreateMode()) {
            this.createParameters.withName(name);
            return this;
        } else {
            this.updateParameters.withName(name);
            return this;
        }
    }

    public WebhookImpl withIsEnabled(Boolean isEnabled) {
        if (isInCreateMode()) {
            this.createParameters.withIsEnabled(isEnabled);
            return this;
        } else {
            this.updateParameters.withIsEnabled(isEnabled);
            return this;
        }
    }

    public WebhookImpl withUri(String uri) {
        this.createParameters.withUri(uri);
        return this;
    }

    public WebhookImpl withExpiryTime(OffsetDateTime expiryTime) {
        this.createParameters.withExpiryTime(expiryTime);
        return this;
    }

    public WebhookImpl withParameters(Map<String, String> parameters) {
        if (isInCreateMode()) {
            this.createParameters.withParameters(parameters);
            return this;
        } else {
            this.updateParameters.withParameters(parameters);
            return this;
        }
    }

    public WebhookImpl withRunbook(RunbookAssociationProperty runbook) {
        this.createParameters.withRunbook(runbook);
        return this;
    }

    public WebhookImpl withRunOn(String runOn) {
        if (isInCreateMode()) {
            this.createParameters.withRunOn(runOn);
            return this;
        } else {
            this.updateParameters.withRunOn(runOn);
            return this;
        }
    }

    public WebhookImpl withDescription(String description) {
        this.updateParameters.withDescription(description);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}