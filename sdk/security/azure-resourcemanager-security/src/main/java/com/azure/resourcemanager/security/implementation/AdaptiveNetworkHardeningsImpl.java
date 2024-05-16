// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.AdaptiveNetworkHardeningsClient;
import com.azure.resourcemanager.security.fluent.models.AdaptiveNetworkHardeningInner;
import com.azure.resourcemanager.security.models.AdaptiveNetworkHardening;
import com.azure.resourcemanager.security.models.AdaptiveNetworkHardeningEnforceRequest;
import com.azure.resourcemanager.security.models.AdaptiveNetworkHardenings;

public final class AdaptiveNetworkHardeningsImpl implements AdaptiveNetworkHardenings {
    private static final ClientLogger LOGGER = new ClientLogger(AdaptiveNetworkHardeningsImpl.class);

    private final AdaptiveNetworkHardeningsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public AdaptiveNetworkHardeningsImpl(AdaptiveNetworkHardeningsClient innerClient,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AdaptiveNetworkHardening> listByExtendedResource(String resourceGroupName,
        String resourceNamespace, String resourceType, String resourceName) {
        PagedIterable<AdaptiveNetworkHardeningInner> inner = this.serviceClient()
            .listByExtendedResource(resourceGroupName, resourceNamespace, resourceType, resourceName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AdaptiveNetworkHardeningImpl(inner1, this.manager()));
    }

    public PagedIterable<AdaptiveNetworkHardening> listByExtendedResource(String resourceGroupName,
        String resourceNamespace, String resourceType, String resourceName, Context context) {
        PagedIterable<AdaptiveNetworkHardeningInner> inner = this.serviceClient()
            .listByExtendedResource(resourceGroupName, resourceNamespace, resourceType, resourceName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AdaptiveNetworkHardeningImpl(inner1, this.manager()));
    }

    public Response<AdaptiveNetworkHardening> getWithResponse(String resourceGroupName, String resourceNamespace,
        String resourceType, String resourceName, String adaptiveNetworkHardeningResourceName, Context context) {
        Response<AdaptiveNetworkHardeningInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, resourceNamespace, resourceType, resourceName,
                adaptiveNetworkHardeningResourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AdaptiveNetworkHardeningImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AdaptiveNetworkHardening get(String resourceGroupName, String resourceNamespace, String resourceType,
        String resourceName, String adaptiveNetworkHardeningResourceName) {
        AdaptiveNetworkHardeningInner inner = this.serviceClient()
            .get(resourceGroupName, resourceNamespace, resourceType, resourceName,
                adaptiveNetworkHardeningResourceName);
        if (inner != null) {
            return new AdaptiveNetworkHardeningImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void enforce(String resourceGroupName, String resourceNamespace, String resourceType, String resourceName,
        String adaptiveNetworkHardeningResourceName, AdaptiveNetworkHardeningEnforceRequest body) {
        this.serviceClient()
            .enforce(resourceGroupName, resourceNamespace, resourceType, resourceName,
                adaptiveNetworkHardeningResourceName, body);
    }

    public void enforce(String resourceGroupName, String resourceNamespace, String resourceType, String resourceName,
        String adaptiveNetworkHardeningResourceName, AdaptiveNetworkHardeningEnforceRequest body, Context context) {
        this.serviceClient()
            .enforce(resourceGroupName, resourceNamespace, resourceType, resourceName,
                adaptiveNetworkHardeningResourceName, body, context);
    }

    private AdaptiveNetworkHardeningsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
