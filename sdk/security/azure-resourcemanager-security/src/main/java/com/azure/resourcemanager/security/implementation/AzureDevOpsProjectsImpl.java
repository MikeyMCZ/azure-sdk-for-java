// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.AzureDevOpsProjectsClient;
import com.azure.resourcemanager.security.fluent.models.AzureDevOpsProjectInner;
import com.azure.resourcemanager.security.models.AzureDevOpsProject;
import com.azure.resourcemanager.security.models.AzureDevOpsProjects;

public final class AzureDevOpsProjectsImpl implements AzureDevOpsProjects {
    private static final ClientLogger LOGGER = new ClientLogger(AzureDevOpsProjectsImpl.class);

    private final AzureDevOpsProjectsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public AzureDevOpsProjectsImpl(AzureDevOpsProjectsClient innerClient,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AzureDevOpsProject> list(String resourceGroupName, String securityConnectorName,
        String orgName) {
        PagedIterable<AzureDevOpsProjectInner> inner
            = this.serviceClient().list(resourceGroupName, securityConnectorName, orgName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AzureDevOpsProjectImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureDevOpsProject> list(String resourceGroupName, String securityConnectorName,
        String orgName, Context context) {
        PagedIterable<AzureDevOpsProjectInner> inner
            = this.serviceClient().list(resourceGroupName, securityConnectorName, orgName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AzureDevOpsProjectImpl(inner1, this.manager()));
    }

    public Response<AzureDevOpsProject> getWithResponse(String resourceGroupName, String securityConnectorName,
        String orgName, String projectName, Context context) {
        Response<AzureDevOpsProjectInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, securityConnectorName, orgName, projectName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AzureDevOpsProjectImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AzureDevOpsProject get(String resourceGroupName, String securityConnectorName, String orgName,
        String projectName) {
        AzureDevOpsProjectInner inner
            = this.serviceClient().get(resourceGroupName, securityConnectorName, orgName, projectName);
        if (inner != null) {
            return new AzureDevOpsProjectImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AzureDevOpsProject getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String securityConnectorName = ResourceManagerUtils.getValueFromIdByName(id, "securityConnectors");
        if (securityConnectorName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'securityConnectors'.", id)));
        }
        String orgName = ResourceManagerUtils.getValueFromIdByName(id, "azureDevOpsOrgs");
        if (orgName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'azureDevOpsOrgs'.", id)));
        }
        String projectName = ResourceManagerUtils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        return this.getWithResponse(resourceGroupName, securityConnectorName, orgName, projectName, Context.NONE)
            .getValue();
    }

    public Response<AzureDevOpsProject> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String securityConnectorName = ResourceManagerUtils.getValueFromIdByName(id, "securityConnectors");
        if (securityConnectorName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'securityConnectors'.", id)));
        }
        String orgName = ResourceManagerUtils.getValueFromIdByName(id, "azureDevOpsOrgs");
        if (orgName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'azureDevOpsOrgs'.", id)));
        }
        String projectName = ResourceManagerUtils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        return this.getWithResponse(resourceGroupName, securityConnectorName, orgName, projectName, context);
    }

    private AzureDevOpsProjectsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }

    public AzureDevOpsProjectImpl define(String name) {
        return new AzureDevOpsProjectImpl(name, this.manager());
    }
}
