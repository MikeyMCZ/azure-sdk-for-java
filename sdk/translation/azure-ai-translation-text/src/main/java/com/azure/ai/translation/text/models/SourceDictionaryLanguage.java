// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.translation.text.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties ot the source dictionary language.
 */
@Immutable
public final class SourceDictionaryLanguage {

    /*
     * Display name of the language in the locale requested via Accept-Language header.
     */
    @Generated
    @JsonProperty(value = "name")
    private final String name;

    /*
     * Display name of the language in the locale native for this language.
     */
    @Generated
    @JsonProperty(value = "nativeName")
    private final String nativeName;

    /*
     * List of languages with alterative translations and examples for the query expressed in the source language.
     */
    @Generated
    @JsonProperty(value = "translations")
    private final List<TargetDictionaryLanguage> translations;

    /**
     * Get the name property: Display name of the language in the locale requested via Accept-Language header.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the nativeName property: Display name of the language in the locale native for this language.
     *
     * @return the nativeName value.
     */
    @Generated
    public String getNativeName() {
        return this.nativeName;
    }

    /**
     * Get the translations property: List of languages with alterative translations and examples for the query
     * expressed in the source language.
     *
     * @return the translations value.
     */
    @Generated
    public List<TargetDictionaryLanguage> getTranslations() {
        return this.translations;
    }

    /*
     * Directionality, which is rtl for right-to-left languages or ltr for left-to-right languages.
     */
    @Generated
    @JsonProperty(value = "dir")
    private final LanguageDirectionality directionality;

    /**
     * Creates an instance of SourceDictionaryLanguage class.
     *
     * @param name the name value to set.
     * @param nativeName the nativeName value to set.
     * @param directionality the directionality value to set.
     * @param translations the translations value to set.
     */
    @Generated
    @JsonCreator
    private SourceDictionaryLanguage(@JsonProperty(value = "name") String name,
        @JsonProperty(value = "nativeName") String nativeName,
        @JsonProperty(value = "dir") LanguageDirectionality directionality,
        @JsonProperty(value = "translations") List<TargetDictionaryLanguage> translations) {
        this.name = name;
        this.nativeName = nativeName;
        this.directionality = directionality;
        this.translations = translations;
    }

    /**
     * Get the directionality property: Directionality, which is rtl for right-to-left languages or ltr for
     * left-to-right languages.
     *
     * @return the directionality value.
     */
    @Generated
    public LanguageDirectionality getDirectionality() {
        return this.directionality;
    }
}
