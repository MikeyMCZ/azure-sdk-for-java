// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.security.fluent.ExternalSecuritySolutionsClient;
import com.azure.resourcemanager.security.fluent.models.ExternalSecuritySolutionInner;
import com.azure.resourcemanager.security.models.ExternalSecuritySolutionList;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ExternalSecuritySolutionsClient.
 */
public final class ExternalSecuritySolutionsClientImpl implements ExternalSecuritySolutionsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ExternalSecuritySolutionsService service;

    /**
     * The service client containing this operation class.
     */
    private final SecurityCenterImpl client;

    /**
     * Initializes an instance of ExternalSecuritySolutionsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ExternalSecuritySolutionsClientImpl(SecurityCenterImpl client) {
        this.service = RestProxy.create(ExternalSecuritySolutionsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SecurityCenterExternalSecuritySolutions to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SecurityCenterExtern")
    public interface ExternalSecuritySolutionsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Security/externalSecuritySolutions")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ExternalSecuritySolutionList>> list(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Security/locations/{ascLocation}/ExternalSecuritySolutions")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ExternalSecuritySolutionList>> listByHomeRegion(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId, @PathParam("ascLocation") String ascLocation,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/locations/{ascLocation}/ExternalSecuritySolutions/{externalSecuritySolutionsName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ExternalSecuritySolutionInner>> get(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("ascLocation") String ascLocation,
            @PathParam("externalSecuritySolutionsName") String externalSecuritySolutionsName,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ExternalSecuritySolutionList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ExternalSecuritySolutionList>> listByHomeRegionNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Gets a list of external security solutions for the subscription.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of external security solutions for the subscription along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ExternalSecuritySolutionInner>> listSinglePageAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-01-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(),
                accept, context))
            .<PagedResponse<ExternalSecuritySolutionInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a list of external security solutions for the subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of external security solutions for the subscription along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ExternalSecuritySolutionInner>> listSinglePageAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-01-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.list(this.client.getEndpoint(), apiVersion, this.client.getSubscriptionId(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Gets a list of external security solutions for the subscription.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of external security solutions for the subscription as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ExternalSecuritySolutionInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync(), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of external security solutions for the subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of external security solutions for the subscription as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ExternalSecuritySolutionInner> listAsync(Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets a list of external security solutions for the subscription.
     * 
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of external security solutions for the subscription as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExternalSecuritySolutionInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Gets a list of external security solutions for the subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of external security solutions for the subscription as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExternalSecuritySolutionInner> list(Context context) {
        return new PagedIterable<>(listAsync(context));
    }

    /**
     * Gets a list of external Security Solutions for the subscription and location.
     * 
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of external Security Solutions for the subscription and location along with {@link PagedResponse}
     * on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ExternalSecuritySolutionInner>> listByHomeRegionSinglePageAsync(String ascLocation) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (ascLocation == null) {
            return Mono.error(new IllegalArgumentException("Parameter ascLocation is required and cannot be null."));
        }
        final String apiVersion = "2020-01-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByHomeRegion(this.client.getEndpoint(), this.client.getSubscriptionId(),
                ascLocation, apiVersion, accept, context))
            .<PagedResponse<ExternalSecuritySolutionInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a list of external Security Solutions for the subscription and location.
     * 
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of external Security Solutions for the subscription and location along with {@link PagedResponse}
     * on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ExternalSecuritySolutionInner>> listByHomeRegionSinglePageAsync(String ascLocation,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (ascLocation == null) {
            return Mono.error(new IllegalArgumentException("Parameter ascLocation is required and cannot be null."));
        }
        final String apiVersion = "2020-01-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByHomeRegion(this.client.getEndpoint(), this.client.getSubscriptionId(), ascLocation, apiVersion,
                accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Gets a list of external Security Solutions for the subscription and location.
     * 
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of external Security Solutions for the subscription and location as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ExternalSecuritySolutionInner> listByHomeRegionAsync(String ascLocation) {
        return new PagedFlux<>(() -> listByHomeRegionSinglePageAsync(ascLocation),
            nextLink -> listByHomeRegionNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of external Security Solutions for the subscription and location.
     * 
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of external Security Solutions for the subscription and location as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<ExternalSecuritySolutionInner> listByHomeRegionAsync(String ascLocation, Context context) {
        return new PagedFlux<>(() -> listByHomeRegionSinglePageAsync(ascLocation, context),
            nextLink -> listByHomeRegionNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets a list of external Security Solutions for the subscription and location.
     * 
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of external Security Solutions for the subscription and location as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExternalSecuritySolutionInner> listByHomeRegion(String ascLocation) {
        return new PagedIterable<>(listByHomeRegionAsync(ascLocation));
    }

    /**
     * Gets a list of external Security Solutions for the subscription and location.
     * 
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of external Security Solutions for the subscription and location as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExternalSecuritySolutionInner> listByHomeRegion(String ascLocation, Context context) {
        return new PagedIterable<>(listByHomeRegionAsync(ascLocation, context));
    }

    /**
     * Gets a specific external Security Solution.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @param externalSecuritySolutionsName Name of an external security solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific external Security Solution along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ExternalSecuritySolutionInner>> getWithResponseAsync(String resourceGroupName,
        String ascLocation, String externalSecuritySolutionsName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (ascLocation == null) {
            return Mono.error(new IllegalArgumentException("Parameter ascLocation is required and cannot be null."));
        }
        if (externalSecuritySolutionsName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter externalSecuritySolutionsName is required and cannot be null."));
        }
        final String apiVersion = "2020-01-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, ascLocation, externalSecuritySolutionsName, apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a specific external Security Solution.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @param externalSecuritySolutionsName Name of an external security solution.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific external Security Solution along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ExternalSecuritySolutionInner>> getWithResponseAsync(String resourceGroupName,
        String ascLocation, String externalSecuritySolutionsName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (ascLocation == null) {
            return Mono.error(new IllegalArgumentException("Parameter ascLocation is required and cannot be null."));
        }
        if (externalSecuritySolutionsName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter externalSecuritySolutionsName is required and cannot be null."));
        }
        final String apiVersion = "2020-01-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, ascLocation,
            externalSecuritySolutionsName, apiVersion, accept, context);
    }

    /**
     * Gets a specific external Security Solution.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @param externalSecuritySolutionsName Name of an external security solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific external Security Solution on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ExternalSecuritySolutionInner> getAsync(String resourceGroupName, String ascLocation,
        String externalSecuritySolutionsName) {
        return getWithResponseAsync(resourceGroupName, ascLocation, externalSecuritySolutionsName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a specific external Security Solution.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @param externalSecuritySolutionsName Name of an external security solution.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific external Security Solution along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ExternalSecuritySolutionInner> getWithResponse(String resourceGroupName, String ascLocation,
        String externalSecuritySolutionsName, Context context) {
        return getWithResponseAsync(resourceGroupName, ascLocation, externalSecuritySolutionsName, context).block();
    }

    /**
     * Gets a specific external Security Solution.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     * locations.
     * @param externalSecuritySolutionsName Name of an external security solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific external Security Solution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExternalSecuritySolutionInner get(String resourceGroupName, String ascLocation,
        String externalSecuritySolutionsName) {
        return getWithResponse(resourceGroupName, ascLocation, externalSecuritySolutionsName, Context.NONE).getValue();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ExternalSecuritySolutionInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<ExternalSecuritySolutionInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ExternalSecuritySolutionInner>> listNextSinglePageAsync(String nextLink,
        Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ExternalSecuritySolutionInner>> listByHomeRegionNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByHomeRegionNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<ExternalSecuritySolutionInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<ExternalSecuritySolutionInner>> listByHomeRegionNextSinglePageAsync(String nextLink,
        Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listByHomeRegionNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
