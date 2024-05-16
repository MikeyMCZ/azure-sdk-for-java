// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.GetSensitivitySettingsListResponseInner;
import com.azure.resourcemanager.security.fluent.models.GetSensitivitySettingsResponseInner;
import com.azure.resourcemanager.security.models.BuiltInInfoType;
import com.azure.resourcemanager.security.models.GetSensitivitySettingsResponseProperties;
import com.azure.resourcemanager.security.models.GetSensitivitySettingsResponsePropertiesMipInformation;
import com.azure.resourcemanager.security.models.InfoType;
import com.azure.resourcemanager.security.models.Label;
import com.azure.resourcemanager.security.models.MipIntegrationStatus;
import java.util.Arrays;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class GetSensitivitySettingsListResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GetSensitivitySettingsListResponseInner model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"sensitiveInfoTypesIds\":[\"6282c493-3fe4-46c8-99f1-1181fc446ace\",\"c378292d-c509-4e3d-b895-29cc39469223\",\"a3875a4c-0713-4424-ac9b-d3c9197f6f6c\"],\"sensitivityThresholdLabelOrder\":3.528148,\"sensitivityThresholdLabelId\":\"695a76a5-70c3-4404-8250-d9f505bfa270\",\"mipInformation\":{\"mipIntegrationStatus\":\"noAutoLabelingRules\",\"labels\":[{},{},{}],\"customInfoTypes\":[{},{}],\"builtInInfoTypes\":[{},{},{},{}]}},\"id\":\"ncstt\",\"name\":\"jfybvpoekrsgsgb\",\"type\":\"huzqgn\"},{\"properties\":{\"sensitiveInfoTypesIds\":[\"7e4d8628-f727-49f9-929b-b9c25700e80b\",\"bd5358aa-ba09-4ee5-96a9-fde597aa999c\",\"de94c061-83b4-4eef-b2d5-c0da58fb7e52\"],\"sensitivityThresholdLabelOrder\":77.69165,\"sensitivityThresholdLabelId\":\"b0185285-3d24-4c8a-9acf-8b413d759ad9\",\"mipInformation\":{\"mipIntegrationStatus\":\"Ok\",\"labels\":[{},{},{},{}],\"customInfoTypes\":[{},{}],\"builtInInfoTypes\":[{},{},{}]}},\"id\":\"nk\",\"name\":\"mtk\",\"type\":\"bo\"}]}")
            .toObject(GetSensitivitySettingsListResponseInner.class);
        Assertions.assertEquals(UUID.fromString("6282c493-3fe4-46c8-99f1-1181fc446ace"),
            model.value().get(0).properties().sensitiveInfoTypesIds().get(0));
        Assertions.assertEquals(3.528148F, model.value().get(0).properties().sensitivityThresholdLabelOrder());
        Assertions.assertEquals(UUID.fromString("695a76a5-70c3-4404-8250-d9f505bfa270"),
            model.value().get(0).properties().sensitivityThresholdLabelId());
        Assertions.assertEquals(MipIntegrationStatus.NO_AUTO_LABELING_RULES,
            model.value().get(0).properties().mipInformation().mipIntegrationStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GetSensitivitySettingsListResponseInner model
            = new GetSensitivitySettingsListResponseInner().withValue(Arrays.asList(
                new GetSensitivitySettingsResponseInner().withProperties(new GetSensitivitySettingsResponseProperties()
                    .withSensitiveInfoTypesIds(Arrays.asList(UUID.fromString("6282c493-3fe4-46c8-99f1-1181fc446ace"),
                        UUID.fromString("c378292d-c509-4e3d-b895-29cc39469223"),
                        UUID.fromString("a3875a4c-0713-4424-ac9b-d3c9197f6f6c")))
                    .withSensitivityThresholdLabelOrder(3.528148F)
                    .withSensitivityThresholdLabelId(UUID.fromString("695a76a5-70c3-4404-8250-d9f505bfa270"))
                    .withMipInformation(new GetSensitivitySettingsResponsePropertiesMipInformation()
                        .withMipIntegrationStatus(MipIntegrationStatus.NO_AUTO_LABELING_RULES)
                        .withLabels(Arrays.asList(new Label(), new Label(), new Label()))
                        .withCustomInfoTypes(Arrays.asList(new InfoType(), new InfoType()))
                        .withBuiltInInfoTypes(Arrays.asList(new BuiltInInfoType(), new BuiltInInfoType(),
                            new BuiltInInfoType(), new BuiltInInfoType())))),
                new GetSensitivitySettingsResponseInner().withProperties(new GetSensitivitySettingsResponseProperties()
                    .withSensitiveInfoTypesIds(Arrays.asList(UUID.fromString("7e4d8628-f727-49f9-929b-b9c25700e80b"),
                        UUID.fromString("bd5358aa-ba09-4ee5-96a9-fde597aa999c"),
                        UUID.fromString("de94c061-83b4-4eef-b2d5-c0da58fb7e52")))
                    .withSensitivityThresholdLabelOrder(77.69165F)
                    .withSensitivityThresholdLabelId(UUID.fromString("b0185285-3d24-4c8a-9acf-8b413d759ad9"))
                    .withMipInformation(new GetSensitivitySettingsResponsePropertiesMipInformation()
                        .withMipIntegrationStatus(MipIntegrationStatus.OK)
                        .withLabels(Arrays.asList(new Label(), new Label(), new Label(), new Label()))
                        .withCustomInfoTypes(Arrays.asList(new InfoType(), new InfoType()))
                        .withBuiltInInfoTypes(
                            Arrays.asList(new BuiltInInfoType(), new BuiltInInfoType(), new BuiltInInfoType()))))));
        model = BinaryData.fromObject(model).toObject(GetSensitivitySettingsListResponseInner.class);
        Assertions.assertEquals(UUID.fromString("6282c493-3fe4-46c8-99f1-1181fc446ace"),
            model.value().get(0).properties().sensitiveInfoTypesIds().get(0));
        Assertions.assertEquals(3.528148F, model.value().get(0).properties().sensitivityThresholdLabelOrder());
        Assertions.assertEquals(UUID.fromString("695a76a5-70c3-4404-8250-d9f505bfa270"),
            model.value().get(0).properties().sensitivityThresholdLabelId());
        Assertions.assertEquals(MipIntegrationStatus.NO_AUTO_LABELING_RULES,
            model.value().get(0).properties().mipInformation().mipIntegrationStatus());
    }
}
