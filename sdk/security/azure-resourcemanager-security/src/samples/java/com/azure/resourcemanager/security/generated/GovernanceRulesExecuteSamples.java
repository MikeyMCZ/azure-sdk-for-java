// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/**
 * Samples for GovernanceRules Execute.
 */
public final class GovernanceRulesExecuteSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2022-01-01-preview/examples/GovernanceRules/PostSecurityConnectorGovernanceRule_example.json
     */
    /**
     * Sample code: Execute governance rule over security connector scope.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void
        executeGovernanceRuleOverSecurityConnectorScope(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.governanceRules()
            .execute(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/gcpResourceGroup/providers/Microsoft.Security/securityConnectors/gcpconnector",
                "ad9a8e26-29d9-4829-bb30-e597a58cdbb8", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2022-01-01-preview/examples/GovernanceRules/PostGovernanceRule_example.json
     */
    /**
     * Sample code: Execute Governance rule over subscription scope.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void
        executeGovernanceRuleOverSubscriptionScope(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.governanceRules()
            .execute("subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23", "ad9a8e26-29d9-4829-bb30-e597a58cdbb8", null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2022-01-01-preview/examples/GovernanceRules/PostManagementGroupGovernanceRule_example.json
     */
    /**
     * Sample code: Execute governance rule over management group scope.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void
        executeGovernanceRuleOverManagementGroupScope(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.governanceRules()
            .execute("providers/Microsoft.Management/managementGroups/contoso", "ad9a8e26-29d9-4829-bb30-e597a58cdbb8",
                null, com.azure.core.util.Context.NONE);
    }
}
