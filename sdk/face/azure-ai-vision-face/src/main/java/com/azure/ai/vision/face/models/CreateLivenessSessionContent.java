// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request for creating liveness session.
 */
@Fluent
public final class CreateLivenessSessionContent {

    /*
     * Type of liveness mode the client should follow.
     */
    @Generated
    @JsonProperty(value = "livenessOperationMode")
    private final LivenessOperationMode livenessOperationMode;

    /*
     * Whether or not to allow a '200 - Success' response body to be sent to the client, which may be undesirable for security reasons. Default is false, clients will receive a '204 - NoContent' empty body response. Regardless of selection, calling Session GetResult will always contain a response body enabling business logic to be implemented.
     */
    @Generated
    @JsonProperty(value = "sendResultsToClient")
    private Boolean sendResultsToClient;

    /*
     * Whether or not to allow client to set their own 'deviceCorrelationId' via the Vision SDK. Default is false, and 'deviceCorrelationId' must be set in this request body.
     */
    @Generated
    @JsonProperty(value = "deviceCorrelationIdSetInClient")
    private Boolean deviceCorrelationIdSetInClient;

    /*
     * Unique Guid per each end-user device. This is to provide rate limiting and anti-hammering. If 'deviceCorrelationIdSetInClient' is true in this request, this 'deviceCorrelationId' must be null.
     */
    @Generated
    @JsonProperty(value = "deviceCorrelationId")
    private String deviceCorrelationId;

    /*
     * Seconds the session should last for. Range is 60 to 86400 seconds. Default value is 600.
     */
    @Generated
    @JsonProperty(value = "authTokenTimeToLiveInSeconds")
    private Integer authTokenTimeToLiveInSeconds;

    /**
     * Creates an instance of CreateLivenessSessionContent class.
     *
     * @param livenessOperationMode the livenessOperationMode value to set.
     */
    @Generated
    @JsonCreator
    public CreateLivenessSessionContent(
        @JsonProperty(value = "livenessOperationMode") LivenessOperationMode livenessOperationMode) {
        this.livenessOperationMode = livenessOperationMode;
    }

    /**
     * Get the livenessOperationMode property: Type of liveness mode the client should follow.
     *
     * @return the livenessOperationMode value.
     */
    @Generated
    public LivenessOperationMode getLivenessOperationMode() {
        return this.livenessOperationMode;
    }

    /**
     * Get the sendResultsToClient property: Whether or not to allow a '200 - Success' response body to be sent to the
     * client, which may be undesirable for security reasons. Default is false, clients will receive a '204 - NoContent'
     * empty body response. Regardless of selection, calling Session GetResult will always contain a response body
     * enabling business logic to be implemented.
     *
     * @return the sendResultsToClient value.
     */
    @Generated
    public Boolean isSendResultsToClient() {
        return this.sendResultsToClient;
    }

    /**
     * Set the sendResultsToClient property: Whether or not to allow a '200 - Success' response body to be sent to the
     * client, which may be undesirable for security reasons. Default is false, clients will receive a '204 - NoContent'
     * empty body response. Regardless of selection, calling Session GetResult will always contain a response body
     * enabling business logic to be implemented.
     *
     * @param sendResultsToClient the sendResultsToClient value to set.
     * @return the CreateLivenessSessionContent object itself.
     */
    @Generated
    public CreateLivenessSessionContent setSendResultsToClient(Boolean sendResultsToClient) {
        this.sendResultsToClient = sendResultsToClient;
        return this;
    }

    /**
     * Get the deviceCorrelationIdSetInClient property: Whether or not to allow client to set their own
     * 'deviceCorrelationId' via the Vision SDK. Default is false, and 'deviceCorrelationId' must be set in this request
     * body.
     *
     * @return the deviceCorrelationIdSetInClient value.
     */
    @Generated
    public Boolean isDeviceCorrelationIdSetInClient() {
        return this.deviceCorrelationIdSetInClient;
    }

    /**
     * Set the deviceCorrelationIdSetInClient property: Whether or not to allow client to set their own
     * 'deviceCorrelationId' via the Vision SDK. Default is false, and 'deviceCorrelationId' must be set in this request
     * body.
     *
     * @param deviceCorrelationIdSetInClient the deviceCorrelationIdSetInClient value to set.
     * @return the CreateLivenessSessionContent object itself.
     */
    @Generated
    public CreateLivenessSessionContent setDeviceCorrelationIdSetInClient(Boolean deviceCorrelationIdSetInClient) {
        this.deviceCorrelationIdSetInClient = deviceCorrelationIdSetInClient;
        return this;
    }

    /**
     * Get the deviceCorrelationId property: Unique Guid per each end-user device. This is to provide rate limiting and
     * anti-hammering. If 'deviceCorrelationIdSetInClient' is true in this request, this 'deviceCorrelationId' must be
     * null.
     *
     * @return the deviceCorrelationId value.
     */
    @Generated
    public String getDeviceCorrelationId() {
        return this.deviceCorrelationId;
    }

    /**
     * Set the deviceCorrelationId property: Unique Guid per each end-user device. This is to provide rate limiting and
     * anti-hammering. If 'deviceCorrelationIdSetInClient' is true in this request, this 'deviceCorrelationId' must be
     * null.
     *
     * @param deviceCorrelationId the deviceCorrelationId value to set.
     * @return the CreateLivenessSessionContent object itself.
     */
    @Generated
    public CreateLivenessSessionContent setDeviceCorrelationId(String deviceCorrelationId) {
        this.deviceCorrelationId = deviceCorrelationId;
        return this;
    }

    /**
     * Get the authTokenTimeToLiveInSeconds property: Seconds the session should last for. Range is 60 to 86400 seconds.
     * Default value is 600.
     *
     * @return the authTokenTimeToLiveInSeconds value.
     */
    @Generated
    public Integer getAuthTokenTimeToLiveInSeconds() {
        return this.authTokenTimeToLiveInSeconds;
    }

    /**
     * Set the authTokenTimeToLiveInSeconds property: Seconds the session should last for. Range is 60 to 86400 seconds.
     * Default value is 600.
     *
     * @param authTokenTimeToLiveInSeconds the authTokenTimeToLiveInSeconds value to set.
     * @return the CreateLivenessSessionContent object itself.
     */
    @Generated
    public CreateLivenessSessionContent setAuthTokenTimeToLiveInSeconds(Integer authTokenTimeToLiveInSeconds) {
        this.authTokenTimeToLiveInSeconds = authTokenTimeToLiveInSeconds;
        return this;
    }
}
