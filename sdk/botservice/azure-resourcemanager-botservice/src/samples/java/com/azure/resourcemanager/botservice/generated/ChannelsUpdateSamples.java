// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.botservice.models.AlexaChannel;
import com.azure.resourcemanager.botservice.models.AlexaChannelProperties;
import com.azure.resourcemanager.botservice.models.BotChannel;
import com.azure.resourcemanager.botservice.models.DirectLineSpeechChannel;
import com.azure.resourcemanager.botservice.models.DirectLineSpeechChannelProperties;
import com.azure.resourcemanager.botservice.models.EmailChannel;
import com.azure.resourcemanager.botservice.models.EmailChannelProperties;
import com.azure.resourcemanager.botservice.models.LineChannel;
import com.azure.resourcemanager.botservice.models.LineChannelProperties;
import com.azure.resourcemanager.botservice.models.LineRegistration;
import java.util.Arrays;

/** Samples for Channels Update. */
public final class ChannelsUpdateSamples {
    /*
     * x-ms-original-file: specification/botservice/resource-manager/Microsoft.BotService/preview/2021-05-01-preview/examples/UpdateDirectLineSpeechChannel.json
     */
    /**
     * Sample code: Update DirectLine Speech.
     *
     * @param manager Entry point to BotServiceManager.
     */
    public static void updateDirectLineSpeech(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        BotChannel resource =
            manager
                .channels()
                .getWithResponse("OneResourceGroupName", "samplebotname", "DirectLineSpeechChannel", Context.NONE)
                .getValue();
        resource
            .update()
            .withProperties(
                new DirectLineSpeechChannel()
                    .withProperties(
                        new DirectLineSpeechChannelProperties()
                            .withCognitiveServiceRegion("XcognitiveServiceRegionX")
                            .withCognitiveServiceSubscriptionKey("XcognitiveServiceSubscriptionKeyX")
                            .withIsEnabled(true)))
            .apply();
    }

    /*
     * x-ms-original-file: specification/botservice/resource-manager/Microsoft.BotService/preview/2021-05-01-preview/examples/UpdateChannel.json
     */
    /**
     * Sample code: Update Bot.
     *
     * @param manager Entry point to BotServiceManager.
     */
    public static void updateBot(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        BotChannel resource =
            manager
                .channels()
                .getWithResponse("OneResourceGroupName", "samplebotname", "EmailChannel", Context.NONE)
                .getValue();
        resource
            .update()
            .withProperties(
                new EmailChannel()
                    .withProperties(
                        new EmailChannelProperties()
                            .withEmailAddress("a@b.com")
                            .withPassword("pwd")
                            .withIsEnabled(true)))
            .apply();
    }

    /*
     * x-ms-original-file: specification/botservice/resource-manager/Microsoft.BotService/preview/2021-05-01-preview/examples/UpdateLineChannel.json
     */
    /**
     * Sample code: Update Line.
     *
     * @param manager Entry point to BotServiceManager.
     */
    public static void updateLine(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        BotChannel resource =
            manager
                .channels()
                .getWithResponse("OneResourceGroupName", "samplebotname", "LineChannel", Context.NONE)
                .getValue();
        resource
            .update()
            .withProperties(
                new LineChannel()
                    .withProperties(
                        new LineChannelProperties()
                            .withLineRegistrations(
                                Arrays
                                    .asList(
                                        new LineRegistration()
                                            .withChannelSecret("channelSecret")
                                            .withChannelAccessToken("channelAccessToken")))))
            .apply();
    }

    /*
     * x-ms-original-file: specification/botservice/resource-manager/Microsoft.BotService/preview/2021-05-01-preview/examples/UpdateAlexaChannel.json
     */
    /**
     * Sample code: Update Alexa.
     *
     * @param manager Entry point to BotServiceManager.
     */
    public static void updateAlexa(com.azure.resourcemanager.botservice.BotServiceManager manager) {
        BotChannel resource =
            manager
                .channels()
                .getWithResponse("OneResourceGroupName", "samplebotname", "AlexaChannel", Context.NONE)
                .getValue();
        resource
            .update()
            .withProperties(
                new AlexaChannel()
                    .withProperties(
                        new AlexaChannelProperties().withAlexaSkillId("XAlexaSkillIdX").withIsEnabled(true)))
            .apply();
    }
}
