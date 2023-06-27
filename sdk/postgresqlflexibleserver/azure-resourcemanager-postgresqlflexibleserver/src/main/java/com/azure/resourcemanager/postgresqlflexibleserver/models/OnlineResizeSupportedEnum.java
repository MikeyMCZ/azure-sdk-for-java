// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * A value indicating whether online resize is supported in this region for the given subscription. "Enabled" means
 * storage online resize is supported. "Disabled" means storage online resize is not supported.
 */
public final class OnlineResizeSupportedEnum extends ExpandableStringEnum<OnlineResizeSupportedEnum> {
    /** Static value Enabled for OnlineResizeSupportedEnum. */
    public static final OnlineResizeSupportedEnum ENABLED = fromString("Enabled");

    /** Static value Disabled for OnlineResizeSupportedEnum. */
    public static final OnlineResizeSupportedEnum DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of OnlineResizeSupportedEnum value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OnlineResizeSupportedEnum() {
    }

    /**
     * Creates or finds a OnlineResizeSupportedEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OnlineResizeSupportedEnum.
     */
    @JsonCreator
    public static OnlineResizeSupportedEnum fromString(String name) {
        return fromString(name, OnlineResizeSupportedEnum.class);
    }

    /**
     * Gets known OnlineResizeSupportedEnum values.
     *
     * @return known OnlineResizeSupportedEnum values.
     */
    public static Collection<OnlineResizeSupportedEnum> values() {
        return values(OnlineResizeSupportedEnum.class);
    }
}
