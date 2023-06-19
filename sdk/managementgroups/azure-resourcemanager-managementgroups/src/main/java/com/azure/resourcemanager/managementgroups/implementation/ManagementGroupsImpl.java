// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managementgroups.fluent.ManagementGroupsClient;
import com.azure.resourcemanager.managementgroups.fluent.models.AzureAsyncOperationResultsInner;
import com.azure.resourcemanager.managementgroups.fluent.models.DescendantInfoInner;
import com.azure.resourcemanager.managementgroups.fluent.models.ManagementGroupInfoInner;
import com.azure.resourcemanager.managementgroups.fluent.models.ManagementGroupInner;
import com.azure.resourcemanager.managementgroups.models.AzureAsyncOperationResults;
import com.azure.resourcemanager.managementgroups.models.CreateManagementGroupRequest;
import com.azure.resourcemanager.managementgroups.models.DescendantInfo;
import com.azure.resourcemanager.managementgroups.models.ManagementGroup;
import com.azure.resourcemanager.managementgroups.models.ManagementGroupExpandType;
import com.azure.resourcemanager.managementgroups.models.ManagementGroupInfo;
import com.azure.resourcemanager.managementgroups.models.ManagementGroups;
import com.azure.resourcemanager.managementgroups.models.PatchManagementGroupRequest;

public final class ManagementGroupsImpl implements ManagementGroups {
    private static final ClientLogger LOGGER = new ClientLogger(ManagementGroupsImpl.class);

    private final ManagementGroupsClient innerClient;

    private final com.azure.resourcemanager.managementgroups.ManagementGroupsManager serviceManager;

    public ManagementGroupsImpl(
        ManagementGroupsClient innerClient,
        com.azure.resourcemanager.managementgroups.ManagementGroupsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ManagementGroupInfo> list() {
        PagedIterable<ManagementGroupInfoInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ManagementGroupInfoImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagementGroupInfo> list(String cacheControl, String skiptoken, Context context) {
        PagedIterable<ManagementGroupInfoInner> inner = this.serviceClient().list(cacheControl, skiptoken, context);
        return Utils.mapPage(inner, inner1 -> new ManagementGroupInfoImpl(inner1, this.manager()));
    }

    public Response<ManagementGroup> getWithResponse(
        String groupId,
        ManagementGroupExpandType expand,
        Boolean recurse,
        String filter,
        String cacheControl,
        Context context) {
        Response<ManagementGroupInner> inner =
            this.serviceClient().getWithResponse(groupId, expand, recurse, filter, cacheControl, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagementGroupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ManagementGroup get(String groupId) {
        ManagementGroupInner inner = this.serviceClient().get(groupId);
        if (inner != null) {
            return new ManagementGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ManagementGroup createOrUpdate(String groupId, CreateManagementGroupRequest createManagementGroupRequest) {
        ManagementGroupInner inner = this.serviceClient().createOrUpdate(groupId, createManagementGroupRequest);
        if (inner != null) {
            return new ManagementGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ManagementGroup createOrUpdate(
        String groupId,
        CreateManagementGroupRequest createManagementGroupRequest,
        String cacheControl,
        Context context) {
        ManagementGroupInner inner =
            this.serviceClient().createOrUpdate(groupId, createManagementGroupRequest, cacheControl, context);
        if (inner != null) {
            return new ManagementGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ManagementGroup> updateWithResponse(
        String groupId, PatchManagementGroupRequest patchGroupRequest, String cacheControl, Context context) {
        Response<ManagementGroupInner> inner =
            this.serviceClient().updateWithResponse(groupId, patchGroupRequest, cacheControl, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagementGroupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ManagementGroup update(String groupId, PatchManagementGroupRequest patchGroupRequest) {
        ManagementGroupInner inner = this.serviceClient().update(groupId, patchGroupRequest);
        if (inner != null) {
            return new ManagementGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AzureAsyncOperationResults deleteByResourceGroup(String groupId) {
        AzureAsyncOperationResultsInner inner = this.serviceClient().delete(groupId);
        if (inner != null) {
            return new AzureAsyncOperationResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AzureAsyncOperationResults delete(String groupId, String cacheControl, Context context) {
        AzureAsyncOperationResultsInner inner = this.serviceClient().delete(groupId, cacheControl, context);
        if (inner != null) {
            return new AzureAsyncOperationResultsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<DescendantInfo> getDescendants(String groupId) {
        PagedIterable<DescendantInfoInner> inner = this.serviceClient().getDescendants(groupId);
        return Utils.mapPage(inner, inner1 -> new DescendantInfoImpl(inner1, this.manager()));
    }

    public PagedIterable<DescendantInfo> getDescendants(
        String groupId, String skiptoken, Integer top, Context context) {
        PagedIterable<DescendantInfoInner> inner =
            this.serviceClient().getDescendants(groupId, skiptoken, top, context);
        return Utils.mapPage(inner, inner1 -> new DescendantInfoImpl(inner1, this.manager()));
    }

    private ManagementGroupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager() {
        return this.serviceManager;
    }
}
