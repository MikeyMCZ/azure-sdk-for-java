// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.ActionableRemediation;
import com.azure.resourcemanager.security.models.ActionableRemediationState;
import com.azure.resourcemanager.security.models.AnnotateDefaultBranchState;
import com.azure.resourcemanager.security.models.AzureDevOpsRepositoryProperties;
import com.azure.resourcemanager.security.models.CategoryConfiguration;
import com.azure.resourcemanager.security.models.DevOpsProvisioningState;
import com.azure.resourcemanager.security.models.InheritFromParentState;
import com.azure.resourcemanager.security.models.OnboardingState;
import com.azure.resourcemanager.security.models.RuleCategory;
import com.azure.resourcemanager.security.models.TargetBranchConfiguration;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureDevOpsRepositoryPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureDevOpsRepositoryProperties model = BinaryData.fromString(
            "{\"provisioningStatusMessage\":\"hpdulon\",\"provisioningStatusUpdateTimeUtc\":\"2021-08-23T02:50:08Z\",\"provisioningState\":\"PendingDeletion\",\"parentOrgName\":\"w\",\"parentProjectName\":\"htuevrhrljy\",\"repoId\":\"gwxhnsduugwbsreu\",\"repoUrl\":\"q\",\"visibility\":\"uarenlv\",\"onboardingState\":\"NotOnboarded\",\"actionableRemediation\":{\"state\":\"Enabled\",\"categoryConfigurations\":[{\"minimumSeverityLevel\":\"fvv\",\"category\":\"IaC\"},{\"minimumSeverityLevel\":\"devjb\",\"category\":\"IaC\"},{\"minimumSeverityLevel\":\"qxypokkhminq\",\"category\":\"Dependencies\"}],\"branchConfiguration\":{\"branchNames\":[\"gn\",\"dxxewuninv\",\"db\"],\"annotateDefaultBranch\":\"Enabled\"},\"inheritFromParentState\":\"Disabled\"}}")
            .toObject(AzureDevOpsRepositoryProperties.class);
        Assertions.assertEquals(DevOpsProvisioningState.PENDING_DELETION, model.provisioningState());
        Assertions.assertEquals("w", model.parentOrgName());
        Assertions.assertEquals("htuevrhrljy", model.parentProjectName());
        Assertions.assertEquals(OnboardingState.NOT_ONBOARDED, model.onboardingState());
        Assertions.assertEquals(ActionableRemediationState.ENABLED, model.actionableRemediation().state());
        Assertions.assertEquals("fvv",
            model.actionableRemediation().categoryConfigurations().get(0).minimumSeverityLevel());
        Assertions.assertEquals(RuleCategory.IAC,
            model.actionableRemediation().categoryConfigurations().get(0).category());
        Assertions.assertEquals("gn", model.actionableRemediation().branchConfiguration().branchNames().get(0));
        Assertions.assertEquals(AnnotateDefaultBranchState.ENABLED,
            model.actionableRemediation().branchConfiguration().annotateDefaultBranch());
        Assertions.assertEquals(InheritFromParentState.DISABLED,
            model.actionableRemediation().inheritFromParentState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureDevOpsRepositoryProperties model = new AzureDevOpsRepositoryProperties()
            .withProvisioningState(DevOpsProvisioningState.PENDING_DELETION).withParentOrgName("w")
            .withParentProjectName("htuevrhrljy").withOnboardingState(OnboardingState.NOT_ONBOARDED)
            .withActionableRemediation(new ActionableRemediation().withState(ActionableRemediationState.ENABLED)
                .withCategoryConfigurations(Arrays.asList(
                    new CategoryConfiguration().withMinimumSeverityLevel("fvv").withCategory(RuleCategory.IAC),
                    new CategoryConfiguration().withMinimumSeverityLevel("devjb").withCategory(RuleCategory.IAC),
                    new CategoryConfiguration().withMinimumSeverityLevel("qxypokkhminq")
                        .withCategory(RuleCategory.DEPENDENCIES)))
                .withBranchConfiguration(
                    new TargetBranchConfiguration().withBranchNames(Arrays.asList("gn", "dxxewuninv", "db"))
                        .withAnnotateDefaultBranch(AnnotateDefaultBranchState.ENABLED))
                .withInheritFromParentState(InheritFromParentState.DISABLED));
        model = BinaryData.fromObject(model).toObject(AzureDevOpsRepositoryProperties.class);
        Assertions.assertEquals(DevOpsProvisioningState.PENDING_DELETION, model.provisioningState());
        Assertions.assertEquals("w", model.parentOrgName());
        Assertions.assertEquals("htuevrhrljy", model.parentProjectName());
        Assertions.assertEquals(OnboardingState.NOT_ONBOARDED, model.onboardingState());
        Assertions.assertEquals(ActionableRemediationState.ENABLED, model.actionableRemediation().state());
        Assertions.assertEquals("fvv",
            model.actionableRemediation().categoryConfigurations().get(0).minimumSeverityLevel());
        Assertions.assertEquals(RuleCategory.IAC,
            model.actionableRemediation().categoryConfigurations().get(0).category());
        Assertions.assertEquals("gn", model.actionableRemediation().branchConfiguration().branchNames().get(0));
        Assertions.assertEquals(AnnotateDefaultBranchState.ENABLED,
            model.actionableRemediation().branchConfiguration().annotateDefaultBranch());
        Assertions.assertEquals(InheritFromParentState.DISABLED,
            model.actionableRemediation().inheritFromParentState());
    }
}
