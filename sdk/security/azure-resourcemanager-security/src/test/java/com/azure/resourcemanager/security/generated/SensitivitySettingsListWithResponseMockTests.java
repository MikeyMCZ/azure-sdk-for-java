// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.GetSensitivitySettingsListResponse;
import com.azure.resourcemanager.security.models.MipIntegrationStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SensitivitySettingsListWithResponseMockTests {
    @Test
    public void testListWithResponse() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"sensitiveInfoTypesIds\":[\"dbcfe9f7-467f-45e8-88a4-00e8c3289d5c\",\"935112e0-fffd-455c-b694-e636991aa33a\",\"b8f78a4e-6210-4501-b0a9-f669f0b88bf9\",\"e4930b1a-04d4-44e6-afeb-365c07c357f2\"],\"sensitivityThresholdLabelOrder\":52.83411,\"sensitivityThresholdLabelId\":\"23d8970d-90d6-469b-9b28-05e0393a42ef\",\"mipInformation\":{\"mipIntegrationStatus\":\"noAutoLabelingRules\",\"labels\":[{}],\"customInfoTypes\":[{},{},{}],\"builtInInfoTypes\":[{},{},{},{}]}},\"id\":\"aiildcpud\",\"name\":\"hquxsyjofpgv\",\"type\":\"drobujnjgy\"},{\"properties\":{\"sensitiveInfoTypesIds\":[\"fb347268-a1ae-47cb-9949-e314ab5ba98d\"],\"sensitivityThresholdLabelOrder\":21.384699,\"sensitivityThresholdLabelId\":\"4dbf24e7-9281-4bee-991f-b7f2f7e574b7\",\"mipInformation\":{\"mipIntegrationStatus\":\"Ok\",\"labels\":[{},{}],\"customInfoTypes\":[{},{}],\"builtInInfoTypes\":[{}]}},\"id\":\"cpskgrhnyts\",\"name\":\"gsazuq\",\"type\":\"n\"},{\"properties\":{\"sensitiveInfoTypesIds\":[\"379f8be5-a3eb-41c4-9b0e-7d25f717eb10\",\"fbd48b22-7a5d-4b8a-a2c6-eeb525fec07b\",\"3938b338-b0f7-47a0-97ef-bf05fa57ab57\"],\"sensitivityThresholdLabelOrder\":18.370468,\"sensitivityThresholdLabelId\":\"a54fe935-9e34-461c-92f4-79d8bea8f61a\",\"mipInformation\":{\"mipIntegrationStatus\":\"noAutoLabelingRules\",\"labels\":[{}],\"customInfoTypes\":[{},{},{}],\"builtInInfoTypes\":[{}]}},\"id\":\"vzwpffxsfyb\",\"name\":\"tmveho\",\"type\":\"flyuvbgtz\"},{\"properties\":{\"sensitiveInfoTypesIds\":[\"93d1d378-1c03-44dd-b400-ad01720f154b\",\"4ed00604-5a80-40cb-8187-1df6dcf53908\"],\"sensitivityThresholdLabelOrder\":48.46628,\"sensitivityThresholdLabelId\":\"1f8726ac-b838-4351-b35d-8f6158484e7d\",\"mipInformation\":{\"mipIntegrationStatus\":\"noAutoLabelingRules\",\"labels\":[{},{},{}],\"customInfoTypes\":[{},{}],\"builtInInfoTypes\":[{}]}},\"id\":\"pqsvb\",\"name\":\"eoge\",\"type\":\"trcnqnvnc\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        GetSensitivitySettingsListResponse response
            = manager.sensitivitySettings().listWithResponse(com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals(UUID.fromString("dbcfe9f7-467f-45e8-88a4-00e8c3289d5c"),
            response.value().get(0).properties().sensitiveInfoTypesIds().get(0));
        Assertions.assertEquals(52.83411F, response.value().get(0).properties().sensitivityThresholdLabelOrder());
        Assertions.assertEquals(UUID.fromString("23d8970d-90d6-469b-9b28-05e0393a42ef"),
            response.value().get(0).properties().sensitivityThresholdLabelId());
        Assertions.assertEquals(MipIntegrationStatus.NO_AUTO_LABELING_RULES,
            response.value().get(0).properties().mipInformation().mipIntegrationStatus());
    }
}
