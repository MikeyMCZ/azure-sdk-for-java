// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/**
 * Samples for GitHubRepos Get.
 */
public final class GitHubReposGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2024-04-01/examples/SecurityConnectorsDevOps/GetGitHubRepos_example.json
     */
    /**
     * Sample code: Get_GitHubRepos.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void getGitHubRepos(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.gitHubRepos()
            .getWithResponse("myRg", "mySecurityConnectorName", "myGitHubOwner", "myGitHubRepo",
                com.azure.core.util.Context.NONE);
    }
}
