// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AmqpC2DMessagesNotInAllowedRange;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class AmqpC2DMessagesNotInAllowedRangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmqpC2DMessagesNotInAllowedRange model = BinaryData.fromString(
            "{\"ruleType\":\"AmqpC2DMessagesNotInAllowedRange\",\"timeWindowSize\":\"PT31M44S\",\"minThreshold\":889205926,\"maxThreshold\":1633283959,\"displayName\":\"znpaxwfqtyyqiprc\",\"description\":\"ungbsoljc\",\"isEnabled\":false}")
            .toObject(AmqpC2DMessagesNotInAllowedRange.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals(889205926, model.minThreshold());
        Assertions.assertEquals(1633283959, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT31M44S"), model.timeWindowSize());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmqpC2DMessagesNotInAllowedRange model = new AmqpC2DMessagesNotInAllowedRange().withIsEnabled(false)
            .withMinThreshold(889205926)
            .withMaxThreshold(1633283959)
            .withTimeWindowSize(Duration.parse("PT31M44S"));
        model = BinaryData.fromObject(model).toObject(AmqpC2DMessagesNotInAllowedRange.class);
        Assertions.assertEquals(false, model.isEnabled());
        Assertions.assertEquals(889205926, model.minThreshold());
        Assertions.assertEquals(1633283959, model.maxThreshold());
        Assertions.assertEquals(Duration.parse("PT31M44S"), model.timeWindowSize());
    }
}
