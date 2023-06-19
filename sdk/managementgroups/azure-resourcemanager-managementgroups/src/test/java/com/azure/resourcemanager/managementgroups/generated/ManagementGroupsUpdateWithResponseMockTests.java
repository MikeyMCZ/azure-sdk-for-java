// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.managementgroups.ManagementGroupsManager;
import com.azure.resourcemanager.managementgroups.models.ManagementGroup;
import com.azure.resourcemanager.managementgroups.models.PatchManagementGroupRequest;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ManagementGroupsUpdateWithResponseMockTests {
    @Test
    public void testUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"tenantId\":\"lve\",\"displayName\":\"lupj\",\"details\":{\"version\":46275154,\"updatedTime\":\"2021-08-19T13:39:55Z\",\"updatedBy\":\"bcswsrt\",\"path\":[],\"managementGroupAncestors\":[],\"managementGroupAncestorsChain\":[]},\"children\":[]},\"id\":\"pbewtghfgblcgwx\",\"name\":\"vlvqhjkbegi\",\"type\":\"t\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        ManagementGroupsManager manager =
            ManagementGroupsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ManagementGroup response =
            manager
                .managementGroups()
                .updateWithResponse(
                    "bkpyc",
                    new PatchManagementGroupRequest().withDisplayName("lwn").withParentGroupId("hjdauwhvylwz"),
                    "tdhxujznbmpowuwp",
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("lve", response.tenantId());
        Assertions.assertEquals("lupj", response.displayName());
        Assertions.assertEquals(46275154, response.details().version());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-19T13:39:55Z"), response.details().updatedTime());
        Assertions.assertEquals("bcswsrt", response.details().updatedBy());
    }
}
