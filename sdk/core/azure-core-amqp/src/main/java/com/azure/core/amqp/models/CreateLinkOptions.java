package com.azure.core.amqp.models;

import com.azure.core.annotation.Fluent;

import java.util.Map;

/**
 * Options when creating a link.
 */
@Fluent
public class CreateLinkOptions {
    private AmqpLinkSource linkSource;
    private AmqpLinkTarget linkTarget;
    private Map<String, Object> linkProperties;
    private Iterable<String> desiredCapabilities;
    private SenderSettleMode senderSettleMode;
    private ReceiverSettleMode receiverSettleMode;

    /**
     * Gets the source for the link.
     *
     * @return the source for the link.
     */
    public AmqpLinkSource getLinkSource() {
        return linkSource;
    }

    /**
     * Sets the source for the link.
     *
     * @param linkSource The source for the link.
     *
     * @return The updated {@link CreateLinkOptions} object.
     */
    public CreateLinkOptions setLinkSource(AmqpLinkSource linkSource) {
        this.linkSource = linkSource;
        return this;
    }

    /**
     * Gets the target for the link.
     *
     * @return the target for the link.
     */
    public AmqpLinkTarget getLinkTarget() {
        return linkTarget;
    }

    /**
     * Sets the target for the link.
     *
     * @param linkTarget The target for the link.
     *
     * @return The updated {@link CreateLinkOptions} object.
     */
    public CreateLinkOptions setLinkTarget(AmqpLinkTarget linkTarget) {
        this.linkTarget = linkTarget;
        return this;
    }

    /**
     * Gets the properties associated with the link.
     *
     * @return The properties associated with the link.
     */
    public Map<String, Object> getLinkProperties() {
        return linkProperties;
    }

    /**
     * Sets the properties associated with the link.
     *
     * @param linkProperties The properties associated with the link.
     *
     * @return The updated {@link CreateLinkOptions} object.
     */
    public CreateLinkOptions setLinkProperties(Map<String, Object> linkProperties) {
        this.linkProperties = linkProperties;
        return this;
    }

    /**
     * Gets the capabilities desired for the link.
     *
     * @return the capabilities desired for the link.
     */
    public Iterable<String> getDesiredCapabilities() {
        return desiredCapabilities;
    }

    /**
     * Sets the capabilities desired for the link.
     *
     * @param desiredCapabilities the capabilities desired for the link.
     *
     * @return The updated {@link CreateLinkOptions} object.
     */
    public CreateLinkOptions setDesiredCapabilities(Iterable<String> desiredCapabilities) {
        this.desiredCapabilities = desiredCapabilities;
        return this;
    }

    /**
     * Gets the sender settle mode.
     *
     * @return The sender settle mode.
     */
    public SenderSettleMode getSenderSettleMode() {
        return senderSettleMode;
    }

    /**
     * Sets the sender settle mode.
     *
     * @param senderSettleMode the sender settle mode.
     *
     * @return The updated {@link CreateLinkOptions} object.
     */
    public CreateLinkOptions setSenderSettleMode(SenderSettleMode senderSettleMode) {
        this.senderSettleMode = senderSettleMode;
        return this;
    }

    /**
     * Gets the receiver settle mode.
     *
     * @return the receiver settle mode.
     */
    public ReceiverSettleMode getReceiverSettleMode() {
        return receiverSettleMode;
    }

    /**
     * Sets the receiver settle mode.
     *
     * @param receiverSettleMode the receiver settle mode.
     *
     * @return The updated {@link CreateLinkOptions} object.
     */
    public CreateLinkOptions setReceiverSettleMode(ReceiverSettleMode receiverSettleMode) {
        this.receiverSettleMode = receiverSettleMode;
        return this;
    }
}
