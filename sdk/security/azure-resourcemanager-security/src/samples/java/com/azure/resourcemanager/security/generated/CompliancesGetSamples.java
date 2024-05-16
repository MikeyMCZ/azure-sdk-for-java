// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/**
 * Samples for Compliances Get.
 */
public final class CompliancesGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2017-08-01-preview/examples/Compliances/GetCompliance_example.json
     */
    /**
     * Sample code: Get security compliance data for a day.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void getSecurityComplianceDataForADay(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.compliances()
            .getWithResponse("subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23", "2018-01-01Z",
                com.azure.core.util.Context.NONE);
    }
}
