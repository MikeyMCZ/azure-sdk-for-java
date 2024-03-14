// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.ApiCollection;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ApiCollectionsOnboardAzureApiManagementApiMockTests {
    @Test
    public void testOnboardAzureApiManagementApi() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"displayName\":\"bcetr\",\"discoveredVia\":\"rdfsdswpvnl\",\"baseUrl\":\"pzyzegchtabh\",\"numberOfApiEndpoints\":3613161563453256302,\"numberOfInactiveApiEndpoints\":1878918136951909912,\"numberOfUnauthenticatedApiEndpoints\":8639556601571418897,\"numberOfExternalApiEndpoints\":2189550025473685498,\"numberOfApiEndpointsWithSensitiveDataExposed\":5409176297859506343,\"sensitivityLabel\":\"tpvzhmlnfvy\"},\"id\":\"dhf\",\"name\":\"nsd\",\"type\":\"hawbxnlkmazhle\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        SecurityManager manager = SecurityManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        ApiCollection response = manager.apiCollections().onboardAzureApiManagementApi("wpvqrexlu", "palqwbrfiovpdl",
            "jdrf", com.azure.core.util.Context.NONE);

    }
}
