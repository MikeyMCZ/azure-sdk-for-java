// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defenders CSPM Permissions Management offering configurations.
 */
@Fluent
public final class DefenderCspmAwsOfferingCiem {
    /*
     * Defender CSPM Permissions Management discovery configuration
     */
    @JsonProperty(value = "ciemDiscovery")
    private DefenderCspmAwsOfferingCiemDiscovery ciemDiscovery;

    /*
     * AWS Defender CSPM Permissions Management OIDC (open id connect) connection configurations
     */
    @JsonProperty(value = "ciemOidc")
    private DefenderCspmAwsOfferingCiemOidc ciemOidc;

    /**
     * Creates an instance of DefenderCspmAwsOfferingCiem class.
     */
    public DefenderCspmAwsOfferingCiem() {
    }

    /**
     * Get the ciemDiscovery property: Defender CSPM Permissions Management discovery configuration.
     * 
     * @return the ciemDiscovery value.
     */
    public DefenderCspmAwsOfferingCiemDiscovery ciemDiscovery() {
        return this.ciemDiscovery;
    }

    /**
     * Set the ciemDiscovery property: Defender CSPM Permissions Management discovery configuration.
     * 
     * @param ciemDiscovery the ciemDiscovery value to set.
     * @return the DefenderCspmAwsOfferingCiem object itself.
     */
    public DefenderCspmAwsOfferingCiem withCiemDiscovery(DefenderCspmAwsOfferingCiemDiscovery ciemDiscovery) {
        this.ciemDiscovery = ciemDiscovery;
        return this;
    }

    /**
     * Get the ciemOidc property: AWS Defender CSPM Permissions Management OIDC (open id connect) connection
     * configurations.
     * 
     * @return the ciemOidc value.
     */
    public DefenderCspmAwsOfferingCiemOidc ciemOidc() {
        return this.ciemOidc;
    }

    /**
     * Set the ciemOidc property: AWS Defender CSPM Permissions Management OIDC (open id connect) connection
     * configurations.
     * 
     * @param ciemOidc the ciemOidc value to set.
     * @return the DefenderCspmAwsOfferingCiem object itself.
     */
    public DefenderCspmAwsOfferingCiem withCiemOidc(DefenderCspmAwsOfferingCiemOidc ciemOidc) {
        this.ciemOidc = ciemOidc;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ciemDiscovery() != null) {
            ciemDiscovery().validate();
        }
        if (ciemOidc() != null) {
            ciemOidc().validate();
        }
    }
}
