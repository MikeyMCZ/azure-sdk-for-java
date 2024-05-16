// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.resourcemanager.security.fluent.models.PricingInner;
import com.azure.resourcemanager.security.models.Enforce;
import com.azure.resourcemanager.security.models.PricingTier;

/**
 * Samples for Pricings Update.
 */
public final class PricingsUpdateSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2024-01-01/examples/Pricings/PutPricingByName_example.json
     */
    /**
     * Sample code: Update pricing on subscription (example for CloudPosture plan).
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void updatePricingOnSubscriptionExampleForCloudPosturePlan(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.pricings()
            .updateWithResponse("subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23", "CloudPosture",
                new PricingInner().withPricingTier(PricingTier.STANDARD), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2024-01-01/examples/Pricings/PutPricingByNamePartialSuccess_example.json
     */
    /**
     * Sample code: Update pricing on subscription (example for CloudPosture plan) - partial success.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void updatePricingOnSubscriptionExampleForCloudPosturePlanPartialSuccess(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.pricings()
            .updateWithResponse("subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23", "CloudPosture",
                new PricingInner().withPricingTier(PricingTier.STANDARD), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2024-01-01/examples/Pricings/PutPricingVMsByName_example.json
     */
    /**
     * Sample code: Update pricing on subscription (example for VirtualMachines plan).
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void updatePricingOnSubscriptionExampleForVirtualMachinesPlan(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.pricings()
            .updateWithResponse("subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23", "VirtualMachines",
                new PricingInner().withPricingTier(PricingTier.STANDARD).withSubPlan("P2").withEnforce(Enforce.TRUE),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2024-01-01/examples/Pricings/PutResourcePricingByNameVirtualMachines_example.json
     */
    /**
     * Sample code: Update pricing on resource (example for VirtualMachines plan).
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void updatePricingOnResourceExampleForVirtualMachinesPlan(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.pricings()
            .updateWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/DEMO/providers/Microsoft.Compute/virtualMachines/VM-1",
                "virtualMachines", new PricingInner().withPricingTier(PricingTier.STANDARD).withSubPlan("P1"),
                com.azure.core.util.Context.NONE);
    }
}
