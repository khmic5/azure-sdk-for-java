package com.azure.maps.search.test.java.com.azure.maps.search;

import com.azure.maps.search.SearchClientBuilder;

public class SearchClientTestBase extends TestBase {
    protected static final TestMode TEST_MODE = initializeTestMode();

    protected static final String CONNECTION_STRING = Configuration.getGlobalConfiguration()
        .get("COMMUNICATION_LIVETEST_STATIC_CONNECTION_STRING", "endpoint=https://REDACTED.communication.azure.com/;accesskey=QWNjZXNzS2V5");

    protected static final String TO_PHONE_NUMBER = Configuration.getGlobalConfiguration()
        .get("AZURE_PHONE_NUMBER", "+15551234567");

    protected static final String FROM_PHONE_NUMBER = Configuration.getGlobalConfiguration()
        .get("AZURE_PHONE_NUMBER", "+15551234567");

    private static final String SKIP_INT_SMS_TEST = Configuration.getGlobalConfiguration()
        .get("COMMUNICATION_SKIP_INT_SMS_TEST", "False");

    protected static final String MESSAGE = "Hello";

    private static final StringJoiner JSON_PROPERTIES_TO_REDACT
        = new StringJoiner("\":\"|\"", "\"", "\":\"")
        .add("to");

    private static TestMode initializeTestMode() {
        ClientLogger logger = new ClientLogger(SearchClientTestBase.class);
        String azureTestMode = Configuration.getGlobalConfiguration().get("AZURE_TEST_MODE");
        if (azureTestMode != null) {
            System.out.println("azureTestMode: " + azureTestMode);
            try {
                return TestMode.valueOf(azureTestMode.toUpperCase(Locale.US));
            } catch (IllegalArgumentException var3) {
                logger.error("Could not parse '{}' into TestEnum. Using 'Playback' mode.", azureTestMode);
                return TestMode.PLAYBACK;
            }
        } else {
            logger.info("Environment variable '{}' has not been set yet. Using 'Playback' mode.", "AZURE_TEST_MODE");
            return TestMode.PLAYBACK;
        }
    }

    protected SmsClientBuilder getSmsClientWithToken(HttpClient httpClient, TokenCredential tokenCredential) {
        if (getTestMode() == TestMode.PLAYBACK) {
            tokenCredential = new FakeCredentials();
        }
        SmsClientBuilder builder = new SmsClientBuilder();
        builder.endpoint(new CommunicationConnectionString(CONNECTION_STRING).getEndpoint())
            .credential(tokenCredential)
            .httpClient(httpClient == null ? interceptorManager.getPlaybackClient() : httpClient);

        if (getTestMode() == TestMode.RECORD) {
            List<Function<String, String>> redactors = new ArrayList<>();
            redactors.add(data -> redact(data, JSON_PROPERTY_VALUE_REDACTION_PATTERN.matcher(data), "REDACTED"));
            builder.addPolicy(interceptorManager.getRecordPolicy(redactors));
        }
        return builder;
    }

    protected SmsClientBuilder getSmsClientUsingConnectionString(HttpClient httpClient) {
        SearchClientBuilder builder = new SearchClientBuilder();
        builder
            .connectionString(CONNECTION_STRING)
            .httpClient(httpClient == null ? interceptorManager.getPlaybackClient() : httpClient);

        if (getTestMode() == TestMode.RECORD) {
            List<Function<String, String>> redactors = new ArrayList<>();
            redactors.add(data -> redact(data, JSON_PROPERTY_VALUE_REDACTION_PATTERN.matcher(data), "REDACTED"));
            builder.addPolicy(interceptorManager.getRecordPolicy(redactors));
        }
        return builder;
    }

    protected SmsClientBuilder addLoggingPolicy(SmsClientBuilder builder, String testName) {
        return builder.addPolicy((context, next) -> logHeaders(testName, next));
    }

    private Mono<HttpResponse> logHeaders(String testName, HttpPipelineNextPolicy next) {
        return next.process()
            .flatMap(httpResponse -> {
                final HttpResponse bufferedResponse = httpResponse.buffer();

                // Should sanitize printed reponse url
                System.out.println("MS-CV header for " + testName + " request "
                    + bufferedResponse.getRequest().getUrl() + ": " + bufferedResponse.getHeaderValue("MS-CV"));
                return Mono.just(bufferedResponse);
            });
    }

    static class FakeCredentials implements TokenCredential {
        @Override
        public Mono<AccessToken> getToken(TokenRequestContext tokenRequestContext) {
            return Mono.just(new AccessToken("someFakeToken", OffsetDateTime.MAX));
        }
    }

    private String redact(String content, Matcher matcher, String replacement) {
        while (matcher.find()) {
            String captureGroup = matcher.group(1);
            if (!CoreUtils.isNullOrEmpty(captureGroup)) {
                content = content.replace(matcher.group(1), replacement);
            }
        }
        return content;
    }

    protected boolean shouldEnableSmsTests() {
        return !Boolean.parseBoolean(SKIP_INT_SMS_TEST);
    }
}