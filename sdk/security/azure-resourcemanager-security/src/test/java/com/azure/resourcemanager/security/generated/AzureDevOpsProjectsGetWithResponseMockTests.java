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
import com.azure.resourcemanager.security.models.ActionableRemediationState;
import com.azure.resourcemanager.security.models.AnnotateDefaultBranchState;
import com.azure.resourcemanager.security.models.AzureDevOpsProject;
import com.azure.resourcemanager.security.models.DevOpsProvisioningState;
import com.azure.resourcemanager.security.models.InheritFromParentState;
import com.azure.resourcemanager.security.models.OnboardingState;
import com.azure.resourcemanager.security.models.RuleCategory;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AzureDevOpsProjectsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"provisioningStatusMessage\":\"emdfkh\",\"provisioningStatusUpdateTimeUtc\":\"2021-02-04T20:38:31Z\",\"provisioningState\":\"PendingDeletion\",\"parentOrgName\":\"xzmhyte\",\"projectId\":\"kjgeecwtfma\",\"onboardingState\":\"Onboarded\",\"actionableRemediation\":{\"state\":\"Disabled\",\"categoryConfigurations\":[{\"minimumSeverityLevel\":\"fxfmhlvy\",\"category\":\"Containers\"},{\"minimumSeverityLevel\":\"bq\",\"category\":\"IaC\"},{\"minimumSeverityLevel\":\"kiekhjgqqrugwes\",\"category\":\"Dependencies\"}],\"branchConfiguration\":{\"branchNames\":[\"spt\",\"uwozfvz\",\"supcvqgxcvw\",\"oq\"],\"annotateDefaultBranch\":\"Disabled\"},\"inheritFromParentState\":\"Enabled\"}},\"id\":\"mlmpnvqxuyi\",\"name\":\"rzn\",\"type\":\"dqseypdlmajpuy\"}";

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

        AzureDevOpsProject response = manager.azureDevOpsProjects()
            .getWithResponse("bfpxxavlozukg", "nu", "wyxjsfmaxcebnbeo", "kemqqerwqx", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(DevOpsProvisioningState.PENDING_DELETION, response.properties().provisioningState());
        Assertions.assertEquals("xzmhyte", response.properties().parentOrgName());
        Assertions.assertEquals(OnboardingState.ONBOARDED, response.properties().onboardingState());
        Assertions.assertEquals(ActionableRemediationState.DISABLED,
            response.properties().actionableRemediation().state());
        Assertions.assertEquals("fxfmhlvy",
            response.properties().actionableRemediation().categoryConfigurations().get(0).minimumSeverityLevel());
        Assertions.assertEquals(RuleCategory.CONTAINERS,
            response.properties().actionableRemediation().categoryConfigurations().get(0).category());
        Assertions.assertEquals("spt",
            response.properties().actionableRemediation().branchConfiguration().branchNames().get(0));
        Assertions.assertEquals(AnnotateDefaultBranchState.DISABLED,
            response.properties().actionableRemediation().branchConfiguration().annotateDefaultBranch());
        Assertions.assertEquals(InheritFromParentState.ENABLED,
            response.properties().actionableRemediation().inheritFromParentState());
    }
}
