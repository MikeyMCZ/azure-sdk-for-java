// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.OnPremiseResourceDetails;
import org.junit.jupiter.api.Assertions;

public final class OnPremiseResourceDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OnPremiseResourceDetails model = BinaryData.fromString(
            "{\"source\":\"OnPremise\",\"workspaceId\":\"vfwjlo\",\"vmuuid\":\"zekfsrmauklajv\",\"sourceComputerId\":\"foc\",\"machineName\":\"hapejov\"}")
            .toObject(OnPremiseResourceDetails.class);
        Assertions.assertEquals("vfwjlo", model.workspaceId());
        Assertions.assertEquals("zekfsrmauklajv", model.vmuuid());
        Assertions.assertEquals("foc", model.sourceComputerId());
        Assertions.assertEquals("hapejov", model.machineName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OnPremiseResourceDetails model = new OnPremiseResourceDetails().withWorkspaceId("vfwjlo")
            .withVmuuid("zekfsrmauklajv")
            .withSourceComputerId("foc")
            .withMachineName("hapejov");
        model = BinaryData.fromObject(model).toObject(OnPremiseResourceDetails.class);
        Assertions.assertEquals("vfwjlo", model.workspaceId());
        Assertions.assertEquals("zekfsrmauklajv", model.vmuuid());
        Assertions.assertEquals("foc", model.sourceComputerId());
        Assertions.assertEquals("hapejov", model.machineName());
    }
}
