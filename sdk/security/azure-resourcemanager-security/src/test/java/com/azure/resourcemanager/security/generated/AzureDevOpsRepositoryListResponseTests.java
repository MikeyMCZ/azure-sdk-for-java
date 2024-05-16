// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.AzureDevOpsRepositoryInner;
import com.azure.resourcemanager.security.models.ActionableRemediation;
import com.azure.resourcemanager.security.models.ActionableRemediationState;
import com.azure.resourcemanager.security.models.AnnotateDefaultBranchState;
import com.azure.resourcemanager.security.models.AzureDevOpsRepositoryListResponse;
import com.azure.resourcemanager.security.models.AzureDevOpsRepositoryProperties;
import com.azure.resourcemanager.security.models.CategoryConfiguration;
import com.azure.resourcemanager.security.models.DevOpsProvisioningState;
import com.azure.resourcemanager.security.models.InheritFromParentState;
import com.azure.resourcemanager.security.models.OnboardingState;
import com.azure.resourcemanager.security.models.TargetBranchConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureDevOpsRepositoryListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureDevOpsRepositoryListResponse model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningStatusMessage\":\"lnfyzav\",\"provisioningStatusUpdateTimeUtc\":\"2021-04-19T06:29:11Z\",\"provisioningState\":\"Succeeded\",\"parentOrgName\":\"cdbkpdjtaq\",\"parentProjectName\":\"mqazpdgonjh\",\"repoId\":\"h\",\"repoUrl\":\"mgpczqulptkbvc\",\"visibility\":\"tzhigqqbtim\",\"onboardingState\":\"NotApplicable\",\"actionableRemediation\":{\"state\":\"None\",\"categoryConfigurations\":[{},{},{}],\"branchConfiguration\":{\"branchNames\":[\"qhudsmusuaawj\",\"kxwj\"],\"annotateDefaultBranch\":\"Enabled\"},\"inheritFromParentState\":\"Disabled\"}},\"id\":\"nniixyxvqba\",\"name\":\"os\",\"type\":\"tgirnb\"}],\"nextLink\":\"gm\"}")
            .toObject(AzureDevOpsRepositoryListResponse.class);
        Assertions.assertEquals(DevOpsProvisioningState.SUCCEEDED,
            model.value().get(0).properties().provisioningState());
        Assertions.assertEquals("cdbkpdjtaq", model.value().get(0).properties().parentOrgName());
        Assertions.assertEquals("mqazpdgonjh", model.value().get(0).properties().parentProjectName());
        Assertions.assertEquals(OnboardingState.NOT_APPLICABLE, model.value().get(0).properties().onboardingState());
        Assertions.assertEquals(ActionableRemediationState.NONE,
            model.value().get(0).properties().actionableRemediation().state());
        Assertions.assertEquals("qhudsmusuaawj",
            model.value().get(0).properties().actionableRemediation().branchConfiguration().branchNames().get(0));
        Assertions.assertEquals(AnnotateDefaultBranchState.ENABLED,
            model.value().get(0).properties().actionableRemediation().branchConfiguration().annotateDefaultBranch());
        Assertions.assertEquals(InheritFromParentState.DISABLED,
            model.value().get(0).properties().actionableRemediation().inheritFromParentState());
        Assertions.assertEquals("gm", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureDevOpsRepositoryListResponse model = new AzureDevOpsRepositoryListResponse()
            .withValue(Arrays.asList(new AzureDevOpsRepositoryInner().withProperties(
                new AzureDevOpsRepositoryProperties().withProvisioningState(DevOpsProvisioningState.SUCCEEDED)
                    .withParentOrgName("cdbkpdjtaq")
                    .withParentProjectName("mqazpdgonjh")
                    .withOnboardingState(OnboardingState.NOT_APPLICABLE)
                    .withActionableRemediation(new ActionableRemediation().withState(ActionableRemediationState.NONE)
                        .withCategoryConfigurations(Arrays.asList(new CategoryConfiguration(),
                            new CategoryConfiguration(), new CategoryConfiguration()))
                        .withBranchConfiguration(
                            new TargetBranchConfiguration().withBranchNames(Arrays.asList("qhudsmusuaawj", "kxwj"))
                                .withAnnotateDefaultBranch(AnnotateDefaultBranchState.ENABLED))
                        .withInheritFromParentState(InheritFromParentState.DISABLED)))))
            .withNextLink("gm");
        model = BinaryData.fromObject(model).toObject(AzureDevOpsRepositoryListResponse.class);
        Assertions.assertEquals(DevOpsProvisioningState.SUCCEEDED,
            model.value().get(0).properties().provisioningState());
        Assertions.assertEquals("cdbkpdjtaq", model.value().get(0).properties().parentOrgName());
        Assertions.assertEquals("mqazpdgonjh", model.value().get(0).properties().parentProjectName());
        Assertions.assertEquals(OnboardingState.NOT_APPLICABLE, model.value().get(0).properties().onboardingState());
        Assertions.assertEquals(ActionableRemediationState.NONE,
            model.value().get(0).properties().actionableRemediation().state());
        Assertions.assertEquals("qhudsmusuaawj",
            model.value().get(0).properties().actionableRemediation().branchConfiguration().branchNames().get(0));
        Assertions.assertEquals(AnnotateDefaultBranchState.ENABLED,
            model.value().get(0).properties().actionableRemediation().branchConfiguration().annotateDefaultBranch());
        Assertions.assertEquals(InheritFromParentState.DISABLED,
            model.value().get(0).properties().actionableRemediation().inheritFromParentState());
        Assertions.assertEquals("gm", model.nextLink());
    }
}
