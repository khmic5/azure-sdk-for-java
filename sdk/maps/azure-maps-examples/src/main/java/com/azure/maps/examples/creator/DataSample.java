package com.azure.maps.examples.creator;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;

import com.azure.core.http.HttpPipelineCallContext;
import com.azure.core.http.HttpPipelineNextPolicy;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.util.polling.SyncPoller;
import com.azure.maps.creator.CreatorClientBuilder;
import com.azure.maps.creator.DataClient;
import com.azure.maps.creator.models.DataFormat;
import com.azure.maps.creator.models.DatasGetOperationResponse;
import com.azure.maps.creator.models.LongRunningOperationResult;
import com.azure.maps.examples.MapsCommon;

import reactor.core.publisher.Mono;

public class DataSample {
    public static void main(String[] args) throws InterruptedException, IOException {
        // build Client ID policy for use with Azure AD authentication
        HttpPipelinePolicy clientIdPolicy = new HttpPipelinePolicy(){
            @Override
            public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
                return Mono.defer(() -> {
                    context.getHttpRequest().setHeader("x-ms-client-id", System.getenv("CLIENT_ID"));
                    return next.process();
                });
            }
        };

        // build subscription policy for use with Shared Key Authentication
        HttpPipelinePolicy subscriptionKeyPolicy = new HttpPipelinePolicy(){
            @Override
            public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
                return Mono.defer(() -> {
                    context.getHttpRequest().setUrl(context.getHttpRequest().getUrl().toString() + "&subscription-key=" + System.getenv("SUBSCRIPTION_KEY"));
                    return next.process();
                });
            }
        };

        // use default credentials
        CreatorClientBuilder builder = new CreatorClientBuilder();
        builder.addPolicy(subscriptionKeyPolicy);
        builder.httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));
        DataClient client = builder.buildDataClient();
        Object contentJson = MapsCommon
            .readJson(MapsCommon.readContent(MapsCommon.getResource("/data_sample_upload.json")), Object.class);
        SyncPoller<LongRunningOperationResult, LongRunningOperationResult> poller =
            client.beginUpload(DataFormat.GEOJSON,
                contentJson, "Test data set " + Math.random());

        // poll and finish
        // this is a bug that should be addressed in Creator
        String operationId = poller.poll().getValue().getOperationId());
        // poller.setPollInterval(Duration.ofSeconds(1));
        // poller.waitForCompletion(Duration.ofSeconds(10));
        LongRunningOperationResult result = poller.getFinalResult();
        MapsCommon.print("Operation created with id " + result.getOperationId());
        MapsCommon.print(result);

        // get resource from the header
        DatasGetOperationResponse uuid = client.getOperationWithResponse(result.getOperationId(), null);
        MapsCommon.print(uuid);
        String resourceLocation = uuid.getDeserializedHeaders().getResourceLocation();
        String udid = MapsCommon.getUid(resourceLocation);

        if (udid == null) {
            System.out.println("Data upload for zip Failed");
            return;
        }
        else {
            System.out.println("upload successful with " + udid);
            return;
        }
        // client.getDatas().deletePreview(udid);
        // System.out.println(String.format("Deleted file with udid %s", udid));

        /*
        Object contentJson = MapsCommon
                .readJson(MapsCommon.readContent(MapsCommon.getResource("/data_sample_upload.json")), Object.class);

        DatasUploadPreviewResponse datasUploadPreviewResponse = client.getDatas()
                .uploadPreviewWithResponseAsync(UploadDataFormat.GEOJSON, contentJson, null).block();
        String operationLocation = datasUploadPreviewResponse.getDeserializedHeaders().getOperationLocation();
        System.out.println(String.format("Created upload with operation_id %s", operationLocation));
        MapsCommon.print(datasUploadPreviewResponse.getValue());
        String operationId = MapsCommon.getUid(operationLocation);
        String udid = MapsCommon.waitForStatusComplete(operationId, id -> getOperation(client.getDatas(), id));
        if (udid == null) {
            System.out.println("Data upload Failed");
            return;
        }

        try {
            MapDataListResponse list = client.getDatas().listPreview();
            System.out.println("View all previously created files:");
            MapsCommon.print(list);

            InputStream downloadData = client.getDatas().downloadPreview(udid);
            System.out.println(String.format("Downloaded file with udid %s", udid));
            Scanner downloadScanner = new Scanner(downloadData).useDelimiter("\\A");
            System.out.println(downloadScanner.hasNext() ? downloadScanner.next() : "");

            contentJson = MapsCommon
                    .readJson(MapsCommon.readContent(MapsCommon.getResource("/data_sample_update.json")), Object.class);

            DatasUpdatePreviewResponse updateOperation = client.getDatas()
                    .updatePreviewWithResponseAsync(udid, contentJson, null).block();
            operationLocation = updateOperation.getDeserializedHeaders().getOperationLocation();
            System.out.println(String.format("Updated file with operation_id %s", operationLocation));
            MapsCommon.print(updateOperation.getValue());
            operationId = MapsCommon.getUid(operationLocation);
            udid = MapsCommon.waitForStatusComplete(operationId, id -> getOperation(client.getDatas(), id));
            if (udid == null) {
                System.out.println("Data update Failed");
                return;
            }
        } catch (HttpResponseException err) {
            System.out.println(err);
        } finally {
            client.getDatas().deletePreview(udid);
            System.out.println(String.format("Deleted file with udid %s", udid));
        }*/

    }

    /*
    public static MapsCommon.OperationWithHeaders getOperation(Datas data, String operationId) {
        DatasGetOperationPreviewResponse result = data.getOperationPreviewWithResponseAsync(operationId).block();
        System.out.println(String.format("Get data operation with operation_id %s status %s", operationId,
                result.getValue().getStatus()));
        return new MapsCommon.OperationWithHeaders(result.getValue(),
                result.getDeserializedHeaders().getResourceLocation());
    }
    */
}
