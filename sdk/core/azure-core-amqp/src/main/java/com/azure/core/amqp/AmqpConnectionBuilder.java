package com.azure.core.amqp;

import com.azure.core.amqp.implementation.CbsAuthorizationType;
import com.azure.core.amqp.models.SslVerifyMode;
import com.azure.core.credential.TokenCredential;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import reactor.core.scheduler.Scheduler;

public class AmqpConnectionBuilder {
    public AmqpConnectionBuilder authorizationType(CbsAuthorizationType authorizationType) {
        return this;
    }

    public AmqpConnectionBuilder clientOptions(ClientOptions clientOptions) {
        return this;
    }

    public AmqpConnectionBuilder configuration(Configuration configuration) {
        return this;
    }

    public AmqpConnectionBuilder customEndpointAddress(String customEndpointAddress) {
        return this;
    }

    public AmqpConnectionBuilder fullyQualifiedNamespace(String fullyQualifiedNamespace) {
        return this;
    }

    public AmqpConnectionBuilder proxyOptions(ProxyOptions proxyOptions) {
        return this;
    }

    public AmqpConnectionBuilder retryOptions(AmqpRetryOptions retryOptions) {
        return this;
    }

    public AmqpConnectionBuilder scheduler(Scheduler scheduler) {
        return this;
    }

    public AmqpConnectionBuilder tokenCredential(TokenCredential tokenCredential) {
        return this;
    }

    public AmqpConnectionBuilder transport(AmqpTransportType transport) {
        return this;
    }

    public AmqpConnectionBuilder verifyMode(SslVerifyMode verifyMode) {
        return this;
    }

    public AmqpConnection buildConnection() {
        return null;
    }
}
