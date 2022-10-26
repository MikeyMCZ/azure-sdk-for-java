// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.ClientDiscoveryForLogSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ClientDiscoveryForLogSpecificationTests {
    @Test
    public void testDeserialize() {
        ClientDiscoveryForLogSpecification model =
            BinaryData
                .fromString("{\"name\":\"dtqajzyulpkudj\",\"displayName\":\"lkhbz\",\"blobDuration\":\"epgzgqexz\"}")
                .toObject(ClientDiscoveryForLogSpecification.class);
        Assertions.assertEquals("dtqajzyulpkudj", model.name());
        Assertions.assertEquals("lkhbz", model.displayName());
        Assertions.assertEquals("epgzgqexz", model.blobDuration());
    }

    @Test
    public void testSerialize() {
        ClientDiscoveryForLogSpecification model =
            new ClientDiscoveryForLogSpecification()
                .withName("dtqajzyulpkudj")
                .withDisplayName("lkhbz")
                .withBlobDuration("epgzgqexz");
        model = BinaryData.fromObject(model).toObject(ClientDiscoveryForLogSpecification.class);
        Assertions.assertEquals("dtqajzyulpkudj", model.name());
        Assertions.assertEquals("lkhbz", model.displayName());
        Assertions.assertEquals("epgzgqexz", model.blobDuration());
    }
}