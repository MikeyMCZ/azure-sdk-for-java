// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.SecuritySolutionProperties;
import com.azure.resourcemanager.security.models.ProvisioningState;
import com.azure.resourcemanager.security.models.SecurityFamily;
import org.junit.jupiter.api.Assertions;

public final class SecuritySolutionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecuritySolutionProperties model = BinaryData.fromString(
            "{\"securityFamily\":\"SaasWaf\",\"provisioningState\":\"Updating\",\"template\":\"u\",\"protectionStatus\":\"doc\"}")
            .toObject(SecuritySolutionProperties.class);
        Assertions.assertEquals(SecurityFamily.SAAS_WAF, model.securityFamily());
        Assertions.assertEquals(ProvisioningState.UPDATING, model.provisioningState());
        Assertions.assertEquals("u", model.template());
        Assertions.assertEquals("doc", model.protectionStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecuritySolutionProperties model = new SecuritySolutionProperties().withSecurityFamily(SecurityFamily.SAAS_WAF)
            .withProvisioningState(ProvisioningState.UPDATING).withTemplate("u").withProtectionStatus("doc");
        model = BinaryData.fromObject(model).toObject(SecuritySolutionProperties.class);
        Assertions.assertEquals(SecurityFamily.SAAS_WAF, model.securityFamily());
        Assertions.assertEquals(ProvisioningState.UPDATING, model.provisioningState());
        Assertions.assertEquals("u", model.template());
        Assertions.assertEquals("doc", model.protectionStatus());
    }
}
