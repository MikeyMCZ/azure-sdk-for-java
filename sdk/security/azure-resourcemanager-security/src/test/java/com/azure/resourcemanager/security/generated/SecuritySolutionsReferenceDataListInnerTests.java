// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.SecuritySolutionsReferenceDataListInner;
import com.azure.resourcemanager.security.models.SecurityFamily;
import com.azure.resourcemanager.security.models.SecuritySolutionsReferenceData;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SecuritySolutionsReferenceDataListInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecuritySolutionsReferenceDataListInner model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"securityFamily\":\"Ngfw\",\"alertVendorName\":\"jwkrhwzdan\",\"packageInfoUrl\":\"jisgglmvokatuztj\",\"productName\":\"tibpv\",\"publisher\":\"kaehxsmzyg\",\"publisherDisplayName\":\"fwakw\",\"template\":\"eivmak\"},\"location\":\"ysowl\",\"id\":\"ux\",\"name\":\"kb\",\"type\":\"ctvtf\"},{\"properties\":{\"securityFamily\":\"Ngfw\",\"alertVendorName\":\"skdchmaiubavl\",\"packageInfoUrl\":\"wp\",\"productName\":\"gmfalkzazmgoked\",\"publisher\":\"jqafkmkro\",\"publisherDisplayName\":\"zrthqet\",\"template\":\"pqrtvaoznqni\"},\"location\":\"ezeagmceituuge\",\"id\":\"hfpjstlzmbls\",\"name\":\"jdeolctae\",\"type\":\"fsyrledjc\"}]}")
            .toObject(SecuritySolutionsReferenceDataListInner.class);
        Assertions.assertEquals(SecurityFamily.NGFW, model.value().get(0).securityFamily());
        Assertions.assertEquals("jwkrhwzdan", model.value().get(0).alertVendorName());
        Assertions.assertEquals("jisgglmvokatuztj", model.value().get(0).packageInfoUrl());
        Assertions.assertEquals("tibpv", model.value().get(0).productName());
        Assertions.assertEquals("kaehxsmzyg", model.value().get(0).publisher());
        Assertions.assertEquals("fwakw", model.value().get(0).publisherDisplayName());
        Assertions.assertEquals("eivmak", model.value().get(0).template());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecuritySolutionsReferenceDataListInner model
            = new SecuritySolutionsReferenceDataListInner().withValue(Arrays.asList(
                new SecuritySolutionsReferenceData().withSecurityFamily(SecurityFamily.NGFW)
                    .withAlertVendorName("jwkrhwzdan")
                    .withPackageInfoUrl("jisgglmvokatuztj")
                    .withProductName("tibpv")
                    .withPublisher("kaehxsmzyg")
                    .withPublisherDisplayName("fwakw")
                    .withTemplate("eivmak"),
                new SecuritySolutionsReferenceData().withSecurityFamily(SecurityFamily.NGFW)
                    .withAlertVendorName("skdchmaiubavl")
                    .withPackageInfoUrl("wp")
                    .withProductName("gmfalkzazmgoked")
                    .withPublisher("jqafkmkro")
                    .withPublisherDisplayName("zrthqet")
                    .withTemplate("pqrtvaoznqni")));
        model = BinaryData.fromObject(model).toObject(SecuritySolutionsReferenceDataListInner.class);
        Assertions.assertEquals(SecurityFamily.NGFW, model.value().get(0).securityFamily());
        Assertions.assertEquals("jwkrhwzdan", model.value().get(0).alertVendorName());
        Assertions.assertEquals("jisgglmvokatuztj", model.value().get(0).packageInfoUrl());
        Assertions.assertEquals("tibpv", model.value().get(0).productName());
        Assertions.assertEquals("kaehxsmzyg", model.value().get(0).publisher());
        Assertions.assertEquals("fwakw", model.value().get(0).publisherDisplayName());
        Assertions.assertEquals("eivmak", model.value().get(0).template());
    }
}
