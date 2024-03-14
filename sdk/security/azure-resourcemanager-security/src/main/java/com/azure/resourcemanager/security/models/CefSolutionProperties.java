// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The external security solution properties for CEF solutions.
 */
@Fluent
public final class CefSolutionProperties extends ExternalSecuritySolutionProperties {
    /*
     * The hostname property.
     */
    @JsonProperty(value = "hostname")
    private String hostname;

    /*
     * The agent property.
     */
    @JsonProperty(value = "agent")
    private String agent;

    /*
     * The lastEventReceived property.
     */
    @JsonProperty(value = "lastEventReceived")
    private String lastEventReceived;

    /**
     * Creates an instance of CefSolutionProperties class.
     */
    public CefSolutionProperties() {
    }

    /**
     * Get the hostname property: The hostname property.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The hostname property.
     * 
     * @param hostname the hostname value to set.
     * @return the CefSolutionProperties object itself.
     */
    public CefSolutionProperties withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the agent property: The agent property.
     * 
     * @return the agent value.
     */
    public String agent() {
        return this.agent;
    }

    /**
     * Set the agent property: The agent property.
     * 
     * @param agent the agent value to set.
     * @return the CefSolutionProperties object itself.
     */
    public CefSolutionProperties withAgent(String agent) {
        this.agent = agent;
        return this;
    }

    /**
     * Get the lastEventReceived property: The lastEventReceived property.
     * 
     * @return the lastEventReceived value.
     */
    public String lastEventReceived() {
        return this.lastEventReceived;
    }

    /**
     * Set the lastEventReceived property: The lastEventReceived property.
     * 
     * @param lastEventReceived the lastEventReceived value to set.
     * @return the CefSolutionProperties object itself.
     */
    public CefSolutionProperties withLastEventReceived(String lastEventReceived) {
        this.lastEventReceived = lastEventReceived;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CefSolutionProperties withDeviceVendor(String deviceVendor) {
        super.withDeviceVendor(deviceVendor);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CefSolutionProperties withDeviceType(String deviceType) {
        super.withDeviceType(deviceType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CefSolutionProperties withWorkspace(ConnectedWorkspace workspace) {
        super.withWorkspace(workspace);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
