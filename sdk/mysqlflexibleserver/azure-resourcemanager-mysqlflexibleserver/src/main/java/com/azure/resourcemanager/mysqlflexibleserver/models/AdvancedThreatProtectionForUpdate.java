// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.AdvancedThreatProtectionUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters allowed to update advanced threat protection for a server.
 */
@Fluent
public final class AdvancedThreatProtectionForUpdate {
    /*
     * Resource update properties.
     */
    @JsonProperty(value = "properties")
    private AdvancedThreatProtectionUpdateProperties innerProperties;

    /**
     * Creates an instance of AdvancedThreatProtectionForUpdate class.
     */
    public AdvancedThreatProtectionForUpdate() {
    }

    /**
     * Get the innerProperties property: Resource update properties.
     * 
     * @return the innerProperties value.
     */
    private AdvancedThreatProtectionUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the state property: Specifies the state of the Advanced Threat Protection, whether it is enabled or disabled
     * or a state has not been applied yet on the specific database or server.
     * 
     * @return the state value.
     */
    public AdvancedThreatProtectionState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: Specifies the state of the Advanced Threat Protection, whether it is enabled or disabled
     * or a state has not been applied yet on the specific database or server.
     * 
     * @param state the state value to set.
     * @return the AdvancedThreatProtectionForUpdate object itself.
     */
    public AdvancedThreatProtectionForUpdate withState(AdvancedThreatProtectionState state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdvancedThreatProtectionUpdateProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
