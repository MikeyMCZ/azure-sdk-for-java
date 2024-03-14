// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.security.fluent.models.CustomAssessmentAutomationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A list of Custom Assessment Automations.
 */
@Fluent
public final class CustomAssessmentAutomationsListResult {
    /*
     * Collection of Custom Assessment Automations
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<CustomAssessmentAutomationInner> value;

    /*
     * The link used to get the next page of operations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of CustomAssessmentAutomationsListResult class.
     */
    public CustomAssessmentAutomationsListResult() {
    }

    /**
     * Get the value property: Collection of Custom Assessment Automations.
     * 
     * @return the value value.
     */
    public List<CustomAssessmentAutomationInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link used to get the next page of operations.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of operations.
     * 
     * @param nextLink the nextLink value to set.
     * @return the CustomAssessmentAutomationsListResult object itself.
     */
    public CustomAssessmentAutomationsListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
