// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/**
 * Samples for IotSecuritySolution Delete.
 */
public final class IotSecuritySolutionDeleteSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2019-08-01/examples/IoTSecuritySolutions/DeleteIoTSecuritySolution.json
     */
    /**
     * Sample code: Delete an IoT security solution.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void deleteAnIoTSecuritySolution(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.iotSecuritySolutions()
            .deleteByResourceGroupWithResponse("MyGroup", "default", com.azure.core.util.Context.NONE);
    }
}
