// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.translation.text.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Back Translation.
 */
@Immutable
public final class BackTranslation {

    /*
     * A string giving the normalized form of the source term that is a back-translation of the target.
     * This value should be used as input to lookup examples.
     */
    @Generated
    @JsonProperty(value = "normalizedText")
    private final String normalizedText;

    /*
     * A string giving the source term that is a back-translation of the target in a form best
     * suited for end-user display.
     */
    @Generated
    @JsonProperty(value = "displayText")
    private final String displayText;

    /*
     * An integer representing the frequency of this translation pair in the data. The main purpose of this
     * field is to provide a user interface with a means to sort back-translations so the most frequent terms are first.
     */
    @Generated
    @JsonProperty(value = "frequencyCount")
    private final int frequencyCount;

    /**
     * Creates an instance of BackTranslation class.
     *
     * @param normalizedText the normalizedText value to set.
     * @param displayText the displayText value to set.
     * @param examplesCount the examplesCount value to set.
     * @param frequencyCount the frequencyCount value to set.
     */
    @Generated
    @JsonCreator
    private BackTranslation(@JsonProperty(value = "normalizedText") String normalizedText,
        @JsonProperty(value = "displayText") String displayText, @JsonProperty(value = "numExamples") int examplesCount,
        @JsonProperty(value = "frequencyCount") int frequencyCount) {
        this.normalizedText = normalizedText;
        this.displayText = displayText;
        this.examplesCount = examplesCount;
        this.frequencyCount = frequencyCount;
    }

    /**
     * Get the normalizedText property: A string giving the normalized form of the source term that is a
     * back-translation of the target.
     * This value should be used as input to lookup examples.
     *
     * @return the normalizedText value.
     */
    @Generated
    public String getNormalizedText() {
        return this.normalizedText;
    }

    /**
     * Get the displayText property: A string giving the source term that is a back-translation of the target in a form
     * best
     * suited for end-user display.
     *
     * @return the displayText value.
     */
    @Generated
    public String getDisplayText() {
        return this.displayText;
    }

    /**
     * Get the frequencyCount property: An integer representing the frequency of this translation pair in the data. The
     * main purpose of this
     * field is to provide a user interface with a means to sort back-translations so the most frequent terms are first.
     *
     * @return the frequencyCount value.
     */
    @Generated
    public int getFrequencyCount() {
        return this.frequencyCount;
    }

    /*
     * An integer representing the number of examples that are available for this translation pair.
     * Actual examples must be retrieved with a separate call to lookup examples. The number is mostly
     * intended to facilitate display in a UX. For example, a user interface may add a hyperlink
     * to the back-translation if the number of examples is greater than zero and show the back-translation
     * as plain text if there are no examples. Note that the actual number of examples returned
     * by a call to lookup examples may be less than numExamples, because additional filtering may be
     * applied on the fly to remove "bad" examples.
     */
    @Generated
    @JsonProperty(value = "numExamples")
    private final int examplesCount;

    /**
     * Get the examplesCount property: An integer representing the number of examples that are available for this
     * translation pair.
     * Actual examples must be retrieved with a separate call to lookup examples. The number is mostly
     * intended to facilitate display in a UX. For example, a user interface may add a hyperlink
     * to the back-translation if the number of examples is greater than zero and show the back-translation
     * as plain text if there are no examples. Note that the actual number of examples returned
     * by a call to lookup examples may be less than numExamples, because additional filtering may be
     * applied on the fly to remove "bad" examples.
     *
     * @return the examplesCount value.
     */
    @Generated
    public int getExamplesCount() {
        return this.examplesCount;
    }
}
