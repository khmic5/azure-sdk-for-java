// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.metricsadvisor.administration;

import com.azure.ai.metricsadvisor.models.EmailNotificationHook;
import com.azure.ai.metricsadvisor.models.NotificationHook;
import com.azure.ai.metricsadvisor.models.MetricsAdvisorKeyCredential;
import com.azure.ai.metricsadvisor.models.WebNotificationHook;
import com.azure.core.http.rest.PagedIterable;

/**
 * Sample demonstrates how to create, get, update, delete and list hook.
 */
public class HookSample {
    public static void main(String[] args) {
        final MetricsAdvisorAdministrationClient advisorAdministrationClient =
            new MetricsAdvisorAdministrationClientBuilder()
                .endpoint("https://{endpoint}.cognitiveservices.azure.com/")
                .credential(new MetricsAdvisorKeyCredential("subscription_key", "api_key"))
                .buildClient();

        // Create email hook.
        System.out.printf("Creating Hook%n");
        NotificationHook emailHookToCreate = new EmailNotificationHook("email hook")
            .setDescription("my email hook")
            .addEmailToAlert("alertme@alertme.com")
            .setExternalLink("https://adwiki.azurewebsites.net/articles/howto/alerts/create-hooks.html");
        NotificationHook hook = advisorAdministrationClient.createHook(emailHookToCreate);
        System.out.printf("Created hook: %s%n", hook.getId());

        // Retrieve the hook that just created.
        System.out.printf("Fetching hook: %s%n", hook.getId());
        hook = advisorAdministrationClient.getHook(hook.getId());
        EmailNotificationHook createdEmailHook = (EmailNotificationHook) hook;
        System.out.printf("Hook Id: %s%n", createdEmailHook.getId());
        System.out.printf("Hook Name: %s%n", createdEmailHook.getName());
        System.out.printf("Hook Description: %s%n", createdEmailHook.getDescription());
        System.out.printf("Hook External Link: %s%n", createdEmailHook.getExternalLink());
        System.out.printf("Hook Emails: %s%n", String.join(",", createdEmailHook.getEmailsToAlert()));

        // Update the hook.
        System.out.printf("Updating hook: %s%n", hook.getId());
        EmailNotificationHook emailHookToUpdate = (EmailNotificationHook) hook;
        emailHookToUpdate
            .removeEmailToAlert("alertme@alertme.com")
            .addEmailToAlert("alertme2@alertme.com")
            .addEmailToAlert("alertme3@alertme.com");
        advisorAdministrationClient.updateHook(emailHookToUpdate);
        System.out.printf("Updated hook: %s%n", hook.getId());

        // Delete the hook.
        System.out.printf("Deleting Hook: %s%n", hook.getId());
        advisorAdministrationClient.deleteHook(hook.getId());
        System.out.printf("Deleted Hook%n");

        // Create a web hook
        System.out.printf("Creating web Hook%n");
        NotificationHook webHookToCreate = new WebNotificationHook("web hook", "https://httpbin.org/post")
            .setDescription("my web hook")
            .setUserCredentials("web-user", "web-user-pwd!")
            .setExternalLink("https://adwiki.azurewebsites.net/articles/howto/alerts/create-hooks.html");
        advisorAdministrationClient.createHook(webHookToCreate);
        System.out.printf("Created web hook: %s%n", hook.getId());

        // List hooks.
        System.out.printf("Listing hooks%n");
        PagedIterable<NotificationHook> hooksIterable
            = advisorAdministrationClient.listHooks();
        for (NotificationHook hookItem : hooksIterable) {
            if (hookItem instanceof EmailNotificationHook) {
                EmailNotificationHook emailHook = (EmailNotificationHook) hookItem;
                System.out.printf("Hook Id: %s%n", emailHook.getId());
                System.out.printf("Hook Name: %s%n", emailHook.getName());
                System.out.printf("Hook Description: %s%n", emailHook.getDescription());
                System.out.printf("Hook External Link: %s%n", emailHook.getExternalLink());
                System.out.printf("Hook Emails: %s%n", String.join(",", emailHook.getEmailsToAlert()));
            } else if (hookItem instanceof WebNotificationHook) {
                WebNotificationHook webHook = (WebNotificationHook) hookItem;
                System.out.printf("Hook Id: %s%n", webHook.getId());
                System.out.printf("Hook Name: %s%n", webHook.getName());
                System.out.printf("Hook Description: %s%n", webHook.getDescription());
                System.out.printf("Hook External Link: %s%n", webHook.getExternalLink());
                System.out.printf("Hook Endpoint: %s%n", webHook.getEndpoint());
                System.out.printf("Hook Headers: %s%n", webHook.getHttpHeaders());
            }
        }
    }
}
