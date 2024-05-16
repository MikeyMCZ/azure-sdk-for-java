// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.CefSolutionProperties;
import com.azure.resourcemanager.security.models.ConnectedWorkspace;
import org.junit.jupiter.api.Assertions;

public final class CefSolutionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CefSolutionProperties model = BinaryData.fromString(
            "{\"hostname\":\"iwm\",\"agent\":\"mqr\",\"lastEventReceived\":\"zqv\",\"deviceVendor\":\"czyayubtgmbxi\",\"deviceType\":\"hragpxmib\",\"workspace\":{\"id\":\"upoyryefqm\"},\"\":{\"fpbjc\":\"datayztxlno\",\"llukkreh\":\"dataegvyieztkutnj\"}}")
            .toObject(CefSolutionProperties.class);
        Assertions.assertEquals("czyayubtgmbxi", model.deviceVendor());
        Assertions.assertEquals("hragpxmib", model.deviceType());
        Assertions.assertEquals("upoyryefqm", model.workspace().id());
        Assertions.assertEquals("iwm", model.hostname());
        Assertions.assertEquals("mqr", model.agent());
        Assertions.assertEquals("zqv", model.lastEventReceived());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CefSolutionProperties model = new CefSolutionProperties().withDeviceVendor("czyayubtgmbxi")
            .withDeviceType("hragpxmib")
            .withWorkspace(new ConnectedWorkspace().withId("upoyryefqm"))
            .withHostname("iwm")
            .withAgent("mqr")
            .withLastEventReceived("zqv");
        model = BinaryData.fromObject(model).toObject(CefSolutionProperties.class);
        Assertions.assertEquals("czyayubtgmbxi", model.deviceVendor());
        Assertions.assertEquals("hragpxmib", model.deviceType());
        Assertions.assertEquals("upoyryefqm", model.workspace().id());
        Assertions.assertEquals("iwm", model.hostname());
        Assertions.assertEquals("mqr", model.agent());
        Assertions.assertEquals("zqv", model.lastEventReceived());
    }
}
