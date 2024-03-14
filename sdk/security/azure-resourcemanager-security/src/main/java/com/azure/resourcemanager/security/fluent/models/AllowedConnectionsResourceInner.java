// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.security.models.ConnectableResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The resource whose properties describes the allowed traffic between Azure resources.
 */
@Immutable
public final class AllowedConnectionsResourceInner extends ProxyResource {
    /*
     * Describes the allowed traffic between Azure resources
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private AllowedConnectionsResourceProperties innerProperties;

    /*
     * Location where the resource is stored
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Creates an instance of AllowedConnectionsResourceInner class.
     */
    public AllowedConnectionsResourceInner() {
    }

    /**
     * Get the innerProperties property: Describes the allowed traffic between Azure resources.
     * 
     * @return the innerProperties value.
     */
    private AllowedConnectionsResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the location property: Location where the resource is stored.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the calculatedDateTime property: The UTC time on which the allowed connections resource was calculated.
     * 
     * @return the calculatedDateTime value.
     */
    public OffsetDateTime calculatedDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().calculatedDateTime();
    }

    /**
     * Get the connectableResources property: List of connectable resources.
     * 
     * @return the connectableResources value.
     */
    public List<ConnectableResource> connectableResources() {
        return this.innerProperties() == null ? null : this.innerProperties().connectableResources();
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
