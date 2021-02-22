package com.azure.core.amqp.models;

import com.azure.core.amqp.exception.AmqpError;
import com.azure.core.annotation.Fluent;

/**
 * The rejected delivery outcome.
 * <p>
 * At the target, the rejected outcome is used to indicate that an incoming message is invalid and therefore
 * unprocessable. The rejected outcome when applied to a message will cause the delivery-count to be incremented in the
 * header of the rejected message.
 * </p>
 * <p>
 * At the source, the rejected outcome means that the target has informed the source that the message was rejected, and
 * the source has taken the necessary action. The delivery SHOULD NOT ever spontaneously attain the rejected state at
 * the source.
 * </p>
 * @see <a href="http://docs.oasis-open.org/amqp/core/v1.0/os/amqp-core-messaging-v1.0-os.html#type-rejected">Rejected
 * outcome</a>
 */
@Fluent
public final class RejectedDeliveryOutcome extends DeliveryOutcome {
    private AmqpError error;

    public RejectedDeliveryOutcome() {
        super(DeliveryState.REJECTED);
    }

    /**
     * Diagnostic information about the cause of the message rejection.
     * @return Diagnostic information about the cause of the message rejection.
     */
    public AmqpError getError() {
        return error;
    }

    public RejectedDeliveryOutcome setError(AmqpError error) {
        this.error = error;
        return this;
    }
}
