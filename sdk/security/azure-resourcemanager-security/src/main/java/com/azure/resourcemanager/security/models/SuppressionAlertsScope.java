// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The SuppressionAlertsScope model.
 */
@Fluent
public final class SuppressionAlertsScope {
    /*
     * All the conditions inside need to be true in order to suppress the alert
     */
    @JsonProperty(value = "allOf", required = true)
    private List<ScopeElement> allOf;

    /**
     * Creates an instance of SuppressionAlertsScope class.
     */
    public SuppressionAlertsScope() {
    }

    /**
     * Get the allOf property: All the conditions inside need to be true in order to suppress the alert.
     * 
     * @return the allOf value.
     */
    public List<ScopeElement> allOf() {
        return this.allOf;
    }

    /**
     * Set the allOf property: All the conditions inside need to be true in order to suppress the alert.
     * 
     * @param allOf the allOf value to set.
     * @return the SuppressionAlertsScope object itself.
     */
    public SuppressionAlertsScope withAllOf(List<ScopeElement> allOf) {
        this.allOf = allOf;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (allOf() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property allOf in model SuppressionAlertsScope"));
        } else {
            allOf().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SuppressionAlertsScope.class);
}
