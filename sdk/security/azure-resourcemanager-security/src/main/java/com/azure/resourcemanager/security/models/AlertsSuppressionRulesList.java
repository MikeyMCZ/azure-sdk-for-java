// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.models.AlertsSuppressionRuleInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Suppression rules list for subscription.
 */
@Fluent
public final class AlertsSuppressionRulesList {
    /*
     * The value property.
     */
    @JsonProperty(value = "value", required = true)
    private List<AlertsSuppressionRuleInner> value;

    /*
     * URI to fetch the next page.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of AlertsSuppressionRulesList class.
     */
    public AlertsSuppressionRulesList() {
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    public List<AlertsSuppressionRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     * 
     * @param value the value value to set.
     * @return the AlertsSuppressionRulesList object itself.
     */
    public AlertsSuppressionRulesList withValue(List<AlertsSuppressionRuleInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URI to fetch the next page.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property value in model AlertsSuppressionRulesList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AlertsSuppressionRulesList.class);
}
