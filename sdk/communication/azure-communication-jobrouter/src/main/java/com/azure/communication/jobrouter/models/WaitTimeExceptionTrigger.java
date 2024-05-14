// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.Duration;

/** Trigger for an exception action on exceeding wait time. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("waitTime")
@Immutable
public final class WaitTimeExceptionTrigger extends ExceptionTrigger {

    /*
     * Threshold for wait time for this trigger.
     */
    @JsonProperty(value = "thresholdSeconds")
    @JsonDeserialize(using = DurationDeserializer.class)
    @JsonSerialize(using = DurationSerializer.class)
    private Duration threshold;

    /**
     * Creates an instance of WaitTimeExceptionTrigger class.
     *
     * @param threshold the thresholdSeconds value to set.
     */
    @JsonCreator
    public WaitTimeExceptionTrigger(@JsonProperty(value = "thresholdSeconds") Duration threshold) {
        this.threshold = threshold;
    }

    /**
     * Returns kind discriminator.
     * @return kind.
     */
    public ExceptionTriggerKind getKind() {
        return ExceptionTriggerKind.WAIT_TIME;
    }

    /**
     * Get the thresholdSeconds property: Threshold for wait time for this trigger.
     *
     * @return the thresholdSeconds value.
     */
    public Duration getThreshold() {
        return this.threshold;
    }
}
