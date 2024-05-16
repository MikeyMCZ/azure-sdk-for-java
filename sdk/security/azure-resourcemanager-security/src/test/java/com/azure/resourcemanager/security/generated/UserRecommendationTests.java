// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.RecommendationAction;
import com.azure.resourcemanager.security.models.UserRecommendation;
import org.junit.jupiter.api.Assertions;

public final class UserRecommendationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserRecommendation model = BinaryData.fromString("{\"username\":\"n\",\"recommendationAction\":\"Remove\"}")
            .toObject(UserRecommendation.class);
        Assertions.assertEquals("n", model.username());
        Assertions.assertEquals(RecommendationAction.REMOVE, model.recommendationAction());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserRecommendation model
            = new UserRecommendation().withUsername("n").withRecommendationAction(RecommendationAction.REMOVE);
        model = BinaryData.fromObject(model).toObject(UserRecommendation.class);
        Assertions.assertEquals("n", model.username());
        Assertions.assertEquals(RecommendationAction.REMOVE, model.recommendationAction());
    }
}
