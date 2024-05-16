// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.RulesResultsInput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class RulesResultsInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RulesResultsInput model = BinaryData.fromString(
            "{\"latestScan\":true,\"results\":{\"zhjjklffhmouwq\":[[\"sjabibs\"],[\"tawfsdjpvkvp\",\"jxbkzbzkdvn\",\"jabudurgkakmo\"]],\"bjbsybb\":[[\"rfzeey\",\"bizikayuhq\"]],\"slthaq\":[[\"vtldgmfpgvmpip\"]],\"hneuyowqkd\":[[\"smwutwbdsrezpd\"]]}}")
            .toObject(RulesResultsInput.class);
        Assertions.assertEquals(true, model.latestScan());
        Assertions.assertEquals("sjabibs", model.results().get("zhjjklffhmouwq").get(0).get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RulesResultsInput model = new RulesResultsInput().withLatestScan(true)
            .withResults(mapOf("zhjjklffhmouwq",
                Arrays.asList(Arrays.asList("sjabibs"), Arrays.asList("tawfsdjpvkvp", "jxbkzbzkdvn", "jabudurgkakmo")),
                "bjbsybb", Arrays.asList(Arrays.asList("rfzeey", "bizikayuhq")), "slthaq",
                Arrays.asList(Arrays.asList("vtldgmfpgvmpip")), "hneuyowqkd",
                Arrays.asList(Arrays.asList("smwutwbdsrezpd"))));
        model = BinaryData.fromObject(model).toObject(RulesResultsInput.class);
        Assertions.assertEquals(true, model.latestScan());
        Assertions.assertEquals("sjabibs", model.results().get("zhjjklffhmouwq").get(0).get(0));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
