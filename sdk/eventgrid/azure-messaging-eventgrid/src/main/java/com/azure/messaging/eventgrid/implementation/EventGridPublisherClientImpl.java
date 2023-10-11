// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.eventgrid.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.models.CloudEvent;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.messaging.eventgrid.implementation.models.EventGridEvent;
import reactor.core.publisher.Mono;

import java.util.List;

/** Initializes a new instance of the EventGridPublisherClient type. */
public final class EventGridPublisherClientImpl {

    /** The proxy service used to perform REST calls. */
    private final EventGridPublisherClientService service;

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * Initializes an instance of EventGridPublisherClient client.
     *
     * @param apiVersion Api Version.
     */
    EventGridPublisherClientImpl(String apiVersion) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                apiVersion);
    }

    /**
     * Initializes an instance of EventGridPublisherClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param apiVersion Api Version.
     */
    EventGridPublisherClientImpl(HttpPipeline httpPipeline, String apiVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), apiVersion);
    }

    /**
     * Initializes an instance of EventGridPublisherClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param apiVersion Api Version.
     */
    EventGridPublisherClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String apiVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.apiVersion = apiVersion;
        this.service =
                RestProxy.create(EventGridPublisherClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for EventGridPublisherClient to be used by the proxy service to perform
     * REST calls.
     */
    @Host("https://{topicHostname}")
    @ServiceInterface(name = "EventGridPublisherCl")
    public interface EventGridPublisherClientService {

        @Post("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> publishEventGridEvents(
                @HostParam("topicHostname") String topicHostname,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") List<EventGridEvent> events,
                Context context);

        @Post("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> publishEventGridEventsSync(
                @HostParam("topicHostname") String topicHostname,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") List<EventGridEvent> events,
                Context context);

        @Post("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> publishCloudEventEvents(
                @HostParam("topicHostname") String topicHostname,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("aeg-channel-name") String aegChannelName,
                @BodyParam("application/cloudevents-batch+json; charset=utf-8") List<CloudEvent> events,
                Context context);

        @Post("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> publishCloudEventEventsSync(
                @HostParam("topicHostname") String topicHostname,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("aeg-channel-name") String aegChannelName,
                @BodyParam("application/cloudevents-batch+json; charset=utf-8") List<CloudEvent> events,
                Context context);

        @Post("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> publishCustomEventEvents(
                @HostParam("topicHostname") String topicHostname,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") List<Object> events,
                Context context);

        @Post("")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> publishCustomEventEventsSync(
                @HostParam("topicHostname") String topicHostname,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") List<Object> events,
                Context context);
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     *
     * @param topicHostname The host name of the topic, e.g. topic1.westus2-1.eventgrid.azure.net.
     * @param events An array of events to be published to Event Grid.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> publishEventGridEventsWithResponseAsync(
            String topicHostname, List<EventGridEvent> events) {
        return FluxUtil.withContext(
                context -> service.publishEventGridEvents(topicHostname, this.getApiVersion(), events, context));
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     *
     * @param topicHostname The host name of the topic, e.g. topic1.westus2-1.eventgrid.azure.net.
     * @param events An array of events to be published to Event Grid.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> publishEventGridEventsWithResponseAsync(
            String topicHostname, List<EventGridEvent> events, Context context) {
        return service.publishEventGridEvents(topicHostname, this.getApiVersion(), events, context);
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     *
     * @param topicHostname The host name of the topic, e.g. topic1.westus2-1.eventgrid.azure.net.
     * @param events An array of events to be published to Event Grid.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> publishEventGridEventsAsync(String topicHostname, List<EventGridEvent> events) {
        return publishEventGridEventsWithResponseAsync(topicHostname, events).flatMap(ignored -> Mono.empty());
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     *
     * @param topicHostname The host name of the topic, e.g. topic1.westus2-1.eventgrid.azure.net.
     * @param events An array of events to be published to Event Grid.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> publishEventGridEventsAsync(String topicHostname, List<EventGridEvent> events, Context context) {
        return publishEventGridEventsWithResponseAsync(topicHostname, events, context).flatMap(ignored -> Mono.empty());
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     *
     * @param topicHostname The host name of the topic, e.g. topic1.westus2-1.eventgrid.azure.net.
     * @param events An array of events to be published to Event Grid.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> publishEventGridEventsWithResponse(
            String topicHostname, List<EventGridEvent> events, Context context) {
        return service.publishEventGridEventsSync(topicHostname, this.getApiVersion(), events, context);
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     *
     * @param topicHostname The host name of the topic, e.g. topic1.westus2-1.eventgrid.azure.net.
     * @param events An array of events to be published to Event Grid.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void publishEventGridEvents(String topicHostname, List<EventGridEvent> events) {
        publishEventGridEventsWithResponse(topicHostname, events, Context.NONE);
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     *
     * @param topicHostname The host name of the topic, e.g. topic1.westus2-1.eventgrid.azure.net.
     * @param events An array of events to be published to Event Grid.
     * @param aegChannelName Required only when publishing to partner namespaces with partner topic routing mode
     *     ChannelNameHeader.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> publishCloudEventEventsWithResponseAsync(
            String topicHostname, List<CloudEvent> events, String aegChannelName) {
        return FluxUtil.withContext(
                context ->
                        service.publishCloudEventEvents(
                                topicHostname, this.getApiVersion(), aegChannelName, events, context));
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     *
     * @param topicHostname The host name of the topic, e.g. topic1.westus2-1.eventgrid.azure.net.
     * @param events An array of events to be published to Event Grid.
     * @param aegChannelName Required only when publishing to partner namespaces with partner topic routing mode
     *     ChannelNameHeader.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> publishCloudEventEventsWithResponseAsync(
            String topicHostname, List<CloudEvent> events, String aegChannelName, Context context) {
        return service.publishCloudEventEvents(topicHostname, this.getApiVersion(), aegChannelName, events, context);
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     *
     * @param topicHostname The host name of the topic, e.g. topic1.westus2-1.eventgrid.azure.net.
     * @param events An array of events to be published to Event Grid.
     * @param aegChannelName Required only when publishing to partner namespaces with partner topic routing mode
     *     ChannelNameHeader.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> publishCloudEventEventsAsync(
            String topicHostname, List<CloudEvent> events, String aegChannelName) {
        return publishCloudEventEventsWithResponseAsync(topicHostname, events, aegChannelName)
                .flatMap(ignored -> Mono.empty());
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     *
     * @param topicHostname The host name of the topic, e.g. topic1.westus2-1.eventgrid.azure.net.
     * @param events An array of events to be published to Event Grid.
     * @param aegChannelName Required only when publishing to partner namespaces with partner topic routing mode
     *     ChannelNameHeader.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> publishCloudEventEventsAsync(
            String topicHostname, List<CloudEvent> events, String aegChannelName, Context context) {
        return publishCloudEventEventsWithResponseAsync(topicHostname, events, aegChannelName, context)
                .flatMap(ignored -> Mono.empty());
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     *
     * @param topicHostname The host name of the topic, e.g. topic1.westus2-1.eventgrid.azure.net.
     * @param events An array of events to be published to Event Grid.
     * @param aegChannelName Required only when publishing to partner namespaces with partner topic routing mode
     *     ChannelNameHeader.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> publishCloudEventEventsWithResponse(
            String topicHostname, List<CloudEvent> events, String aegChannelName, Context context) {
        return service.publishCloudEventEventsSync(
                topicHostname, this.getApiVersion(), aegChannelName, events, context);
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     *
     * @param topicHostname The host name of the topic, e.g. topic1.westus2-1.eventgrid.azure.net.
     * @param events An array of events to be published to Event Grid.
     * @param aegChannelName Required only when publishing to partner namespaces with partner topic routing mode
     *     ChannelNameHeader.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void publishCloudEventEvents(String topicHostname, List<CloudEvent> events, String aegChannelName) {
        publishCloudEventEventsWithResponse(topicHostname, events, aegChannelName, Context.NONE);
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     *
     * @param topicHostname The host name of the topic, e.g. topic1.westus2-1.eventgrid.azure.net.
     * @param events An array of events to be published to Event Grid.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> publishCustomEventEventsWithResponseAsync(String topicHostname, List<Object> events) {
        return FluxUtil.withContext(
                context -> service.publishCustomEventEvents(topicHostname, this.getApiVersion(), events, context));
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     *
     * @param topicHostname The host name of the topic, e.g. topic1.westus2-1.eventgrid.azure.net.
     * @param events An array of events to be published to Event Grid.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> publishCustomEventEventsWithResponseAsync(
            String topicHostname, List<Object> events, Context context) {
        return service.publishCustomEventEvents(topicHostname, this.getApiVersion(), events, context);
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     *
     * @param topicHostname The host name of the topic, e.g. topic1.westus2-1.eventgrid.azure.net.
     * @param events An array of events to be published to Event Grid.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> publishCustomEventEventsAsync(String topicHostname, List<Object> events) {
        return publishCustomEventEventsWithResponseAsync(topicHostname, events).flatMap(ignored -> Mono.empty());
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     *
     * @param topicHostname The host name of the topic, e.g. topic1.westus2-1.eventgrid.azure.net.
     * @param events An array of events to be published to Event Grid.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> publishCustomEventEventsAsync(String topicHostname, List<Object> events, Context context) {
        return publishCustomEventEventsWithResponseAsync(topicHostname, events, context)
                .flatMap(ignored -> Mono.empty());
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     *
     * @param topicHostname The host name of the topic, e.g. topic1.westus2-1.eventgrid.azure.net.
     * @param events An array of events to be published to Event Grid.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> publishCustomEventEventsWithResponse(
            String topicHostname, List<Object> events, Context context) {
        return service.publishCustomEventEventsSync(topicHostname, this.getApiVersion(), events, context);
    }

    /**
     * Publishes a batch of events to an Azure Event Grid topic.
     *
     * @param topicHostname The host name of the topic, e.g. topic1.westus2-1.eventgrid.azure.net.
     * @param events An array of events to be published to Event Grid.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void publishCustomEventEvents(String topicHostname, List<Object> events) {
        publishCustomEventEventsWithResponse(topicHostname, events, Context.NONE);
    }
}
