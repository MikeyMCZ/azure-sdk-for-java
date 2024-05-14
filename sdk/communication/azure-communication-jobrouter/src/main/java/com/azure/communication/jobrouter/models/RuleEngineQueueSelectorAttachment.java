// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Attaches queue selectors to a job when the RouterRule is resolved. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("ruleEngine")
@Immutable
public final class RuleEngineQueueSelectorAttachment extends QueueSelectorAttachment {

    /*
     * A rule of one of the following types:
     *
     * StaticRule:  A rule
     * providing static rules that always return the same result, regardless of
     * input.
     * DirectMapRule:  A rule that return the same labels as the input
     * labels.
     * ExpressionRule: A rule providing inline expression
     * rules.
     * FunctionRule: A rule providing a binding to an HTTP Triggered Azure
     * Function.
     * WebhookRule: A rule providing a binding to a webserver following
     * OAuth2.0 authentication protocol.
     */
    @JsonProperty(value = "rule")
    private RouterRule rule;

    /**
     * Creates an instance of RuleEngineQueueSelectorAttachment class.
     *
     * @param rule the rule value to set.
     */
    @JsonCreator
    public RuleEngineQueueSelectorAttachment(@JsonProperty(value = "rule") RouterRule rule) {
        this.rule = rule;
    }

    /**
     * Returns kind discriminator.
     * @return kind.
     */
    public QueueSelectorAttachmentKind getKind() {
        return QueueSelectorAttachmentKind.RULE_ENGINE;
    }

    /**
     * Get the rule property: A rule of one of the following types:
     *
     * <p>StaticRule: A rule providing static rules that always return the same result, regardless of input.
     * DirectMapRule: A rule that return the same labels as the input labels. ExpressionRule: A rule providing inline
     * expression rules. FunctionRule: A rule providing a binding to an HTTP Triggered Azure Function. WebhookRule: A
     * rule providing a binding to a webserver following OAuth2.0 authentication protocol.
     *
     * @return the rule value.
     */
    public RouterRule getRule() {
        return this.rule;
    }
}
