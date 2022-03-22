// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mediaservices.models.EdgeUsageDataCollectionPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The EdgePolicies model. */
@Fluent
public final class EdgePoliciesInner {
    /*
     * The usageDataCollectionPolicy property.
     */
    @JsonProperty(value = "usageDataCollectionPolicy")
    private EdgeUsageDataCollectionPolicy usageDataCollectionPolicy;

    /**
     * Get the usageDataCollectionPolicy property: The usageDataCollectionPolicy property.
     *
     * @return the usageDataCollectionPolicy value.
     */
    public EdgeUsageDataCollectionPolicy usageDataCollectionPolicy() {
        return this.usageDataCollectionPolicy;
    }

    /**
     * Set the usageDataCollectionPolicy property: The usageDataCollectionPolicy property.
     *
     * @param usageDataCollectionPolicy the usageDataCollectionPolicy value to set.
     * @return the EdgePoliciesInner object itself.
     */
    public EdgePoliciesInner withUsageDataCollectionPolicy(EdgeUsageDataCollectionPolicy usageDataCollectionPolicy) {
        this.usageDataCollectionPolicy = usageDataCollectionPolicy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (usageDataCollectionPolicy() != null) {
            usageDataCollectionPolicy().validate();
        }
    }
}
