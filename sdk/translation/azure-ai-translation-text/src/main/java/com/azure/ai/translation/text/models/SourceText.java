// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.translation.text.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input text in the default script of the source language.
 */
@Immutable
public final class SourceText {
    /*
     * Input text in the default script of the source language.
     */
    @Generated
    @JsonProperty(value = "text")
    private String text;

    /**
     * Creates an instance of SourceText class.
     * 
     * @param text the text value to set.
     */
    @Generated
    @JsonCreator
    private SourceText(@JsonProperty(value = "text") String text) {
        this.text = text;
    }

    /**
     * Get the text property: Input text in the default script of the source language.
     * 
     * @return the text value.
     */
    @Generated
    public String getText() {
        return this.text;
    }
}
