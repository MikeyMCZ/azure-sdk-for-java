// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * BatchPoolState enums.
 */
public final class BatchPoolState extends ExpandableStringEnum<BatchPoolState> {

    /**
     * The Pool is available to run Tasks subject to the availability of Compute Nodes.
     */
    @Generated
    public static final BatchPoolState ACTIVE = fromString("active");

    /**
     * The user has requested that the Pool be deleted, but the delete operation has not yet completed.
     */
    @Generated
    public static final BatchPoolState DELETING = fromString("deleting");

    /**
     * Creates a new instance of BatchPoolState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public BatchPoolState() {
    }

    /**
     * Creates or finds a BatchPoolState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BatchPoolState.
     */
    @Generated
    public static BatchPoolState fromString(String name) {
        return fromString(name, BatchPoolState.class);
    }

    /**
     * Gets known BatchPoolState values.
     *
     * @return known BatchPoolState values.
     */
    @Generated
    public static Collection<BatchPoolState> values() {
        return values(BatchPoolState.class);
    }
}
