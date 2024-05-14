// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** An attachment of queue selectors to resolve a queue to a job from a classification policy. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = QueueSelectorAttachment.class)
@JsonTypeName("QueueSelectorAttachment")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "conditional", value = ConditionalQueueSelectorAttachment.class),
    @JsonSubTypes.Type(name = "passThrough", value = PassThroughQueueSelectorAttachment.class),
    @JsonSubTypes.Type(name = "ruleEngine", value = RuleEngineQueueSelectorAttachment.class),
    @JsonSubTypes.Type(name = "static", value = StaticQueueSelectorAttachment.class),
    @JsonSubTypes.Type(
            name = "weightedAllocation",
            value = WeightedAllocationQueueSelectorAttachment.class)
})
@Immutable
public abstract class QueueSelectorAttachment {
    /**
     * kind discriminator.
     */
    @JsonProperty(value = "kind")
    private QueueSelectorAttachmentKind kind;

    /** Creates an instance of QueueSelectorAttachment class. */
    public QueueSelectorAttachment() {}

    /**
     * Returns kind discriminator.
     * @return kind.
     */
    public abstract QueueSelectorAttachmentKind getKind();
}
