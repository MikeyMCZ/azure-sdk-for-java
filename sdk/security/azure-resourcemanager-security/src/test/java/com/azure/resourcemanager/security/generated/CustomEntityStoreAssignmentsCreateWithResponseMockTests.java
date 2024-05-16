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
import com.azure.resourcemanager.security.models.CustomEntityStoreAssignment;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class CustomEntityStoreAssignmentsCreateWithResponseMockTests {
    @Test
    public void testCreateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"principal\":\"tsjk\",\"entityStoreDatabaseLink\":\"rexw\"},\"id\":\"onbexft\",\"name\":\"daubheeggzgr\",\"type\":\"qtlfoz\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        CustomEntityStoreAssignment response = manager.customEntityStoreAssignments()
            .define("bdjzghximkg")
            .withExistingResourceGroup("zwwy")
            .withPrincipal("pqkjnpyriwntotcx")
            .create();

        Assertions.assertEquals("tsjk", response.principal());
        Assertions.assertEquals("rexw", response.entityStoreDatabaseLink());
    }
}
