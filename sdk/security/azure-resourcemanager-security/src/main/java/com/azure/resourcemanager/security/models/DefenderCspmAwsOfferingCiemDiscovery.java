// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defender CSPM Permissions Management discovery configuration.
 */
@Fluent
public final class DefenderCspmAwsOfferingCiemDiscovery {
    /*
     * The cloud role ARN in AWS for Permissions Management discovery
     */
    @JsonProperty(value = "cloudRoleArn")
    private String cloudRoleArn;

    /**
     * Creates an instance of DefenderCspmAwsOfferingCiemDiscovery class.
     */
    public DefenderCspmAwsOfferingCiemDiscovery() {
    }

    /**
     * Get the cloudRoleArn property: The cloud role ARN in AWS for Permissions Management discovery.
     * 
     * @return the cloudRoleArn value.
     */
    public String cloudRoleArn() {
        return this.cloudRoleArn;
    }

    /**
     * Set the cloudRoleArn property: The cloud role ARN in AWS for Permissions Management discovery.
     * 
     * @param cloudRoleArn the cloudRoleArn value to set.
     * @return the DefenderCspmAwsOfferingCiemDiscovery object itself.
     */
    public DefenderCspmAwsOfferingCiemDiscovery withCloudRoleArn(String cloudRoleArn) {
        this.cloudRoleArn = cloudRoleArn;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
