// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.security.fluent.models.DevOpsConfigurationInner;
import com.azure.resourcemanager.security.models.DevOpsConfiguration;
import com.azure.resourcemanager.security.models.DevOpsConfigurationProperties;

public final class DevOpsConfigurationImpl implements DevOpsConfiguration {
    private DevOpsConfigurationInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    DevOpsConfigurationImpl(DevOpsConfigurationInner innerObject,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public DevOpsConfigurationProperties properties() {
        return this.innerModel().properties();
    }

    public DevOpsConfigurationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
