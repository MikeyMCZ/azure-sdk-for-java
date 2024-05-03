// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.translation.text.options;

import com.azure.ai.translation.text.models.ProfanityAction;
import com.azure.ai.translation.text.models.ProfanityMarker;
import com.azure.ai.translation.text.models.TextType;
import com.azure.core.annotation.Fluent;
import java.util.ArrayList;
import java.util.List;

/**
 * Options that may be passed when translating a text.
 */
@Fluent
public final class TranslateOptions {
    private String sourceLanguage = null;
    private List<String> targetLanguages = new ArrayList<String>();
    private String clientTraceId = null;
    private TextType textType = TextType.PLAIN;
    private String category = null;
    private ProfanityAction profanityAction = ProfanityAction.NO_ACTION;
    private ProfanityMarker profanityMarker = ProfanityMarker.ASTERISK;
    private Boolean includeAlignment = false;
    private Boolean includeSentenceLength = false;
    private String suggestedSourceLanguage = null;
    private String sourceLanguageScript = null;
    private String targetLanguageScript = null;
    private Boolean allowFallback = false;

    /**
     * @return Specifies the language of the output text.
     */
    public List<String> getTargetLanguages() {
        return targetLanguages;
    }

    /**
     * @param targetLanguages Specifies the language of the output text.
     * @return The updated options.
     */
    public TranslateOptions setTargetLanguages(List<String> targetLanguages) {
        this.targetLanguages = targetLanguages;
        return this;
    }

    /**
     * @param targetLanguage Specifies the language of the output text.
     * @return The updated options.
     */
    public TranslateOptions addTargetLanguage(String targetLanguage) {
        if (targetLanguages == null) {
            targetLanguages = new ArrayList<String>();
        }
        targetLanguages.add(targetLanguage);
        return this;
    }

    /**
     * @return Specifies the language of the input text.
     */
    public String getSourceLanguage() {
        return sourceLanguage;
    }

    /**
     * @param sourceLanguage Specifies the language of the input text.
     * @return The updated options.
     */
    public TranslateOptions setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }

    /**
     * @return client-generated GUID to uniquely identify the request.
     */
    public String getClientTraceId() {
        return clientTraceId;
    }

    /**
     * @param clientTraceId client-generated GUID to uniquely identify the request.
     * @return The updated options.
     */
    public TranslateOptions setClientTraceId(String clientTraceId) {
        this.clientTraceId = clientTraceId;
        return this;
    }

    /**
     * @return specifies whether the text being translated is plain text or HTML text.
     */
    public TextType getTextType() {
        return textType;
    }

    /**
     * @param textType specifies whether the text being translated is plain text or HTML text.
     * @return The updated options.
     */
    public TranslateOptions setTextType(TextType textType) {
        this.textType = textType;
        return this;
    }

    /**
     * @return specifying the category (domain) of the translation.
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category specifying the category (domain) of the translation.
     * @return The updated options.
     */
    public TranslateOptions setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * @return specifies how profanities should be treated in translations.
     */
    public ProfanityAction getProfanityAction() {
        return profanityAction;
    }

    /**
     * @param profanityAction specifies how profanities should be treated in translations.
     * @return The updated options.
     */
    public TranslateOptions setProfanityAction(ProfanityAction profanityAction) {
        this.profanityAction = profanityAction;
        return this;
    }

    /**
     * @return specifies how profanities should be marked in translations.
     */
    public ProfanityMarker getProfanityMarker() {
        return profanityMarker;
    }

    /**
     * @param profanityMarker specifies how profanities should be marked in translations.
     * @return The updated options.
     */
    public TranslateOptions setProfanityMarker(ProfanityMarker profanityMarker) {
        this.profanityMarker = profanityMarker;
        return this;
    }

    /**
     * @return Whether or not to include alignment projection from source text to translated text.
     */
    public Boolean isIncludeAlignment() {
        return includeAlignment;
    }

    /**
     * @param includeAlignment Whether or not to include alignment projection from source text to translated text.
     * @return The updated options.
     */
    public TranslateOptions setIncludeAlignment(Boolean includeAlignment) {
        this.includeAlignment = includeAlignment;
        return this;
    }

    /**
     * @return Whether or not to include sentence boundaries for the input text and the translated text.
     */
    public Boolean isIncludeSentenceLength() {
        return includeSentenceLength;
    }

    /**
     * @param includeSentenceLength Whether or not to include sentence boundaries for the input text and the translated text.
     * @return The updated options.
     */
    public TranslateOptions setIncludeSentenceLength(Boolean includeSentenceLength) {
        this.includeSentenceLength = includeSentenceLength;
        return this;
    }

    /**
     * @return fallback language if the language of the input text can't be identified.
     */
    public String getSuggestedSourceLanguage() {
        return suggestedSourceLanguage;
    }

    /**
     * @param suggestedSourceLanguage fallback language if the language of the input text can't be identified.
     * @return The updated options.
     */
    public TranslateOptions setSuggestedSourceLanguage(String suggestedSourceLanguage) {
        this.suggestedSourceLanguage = suggestedSourceLanguage;
        return this;
    }

    /**
     * @return the script of the input text.
     */
    public String getSourceLanguageScript() {
        return sourceLanguageScript;
    }

    /**
     * @param sourceLanguageScript the script of the input text.
     * @return The updated options.
     */
    public TranslateOptions setSourceLanguageScript(String sourceLanguageScript) {
        this.sourceLanguageScript = sourceLanguageScript;
        return this;
    }

    /**
     * @return the script of the translated text.
     */
    public String getTargetLanguageScript() {
        return targetLanguageScript;
    }

    /**
     * @param targetLanguageScript the script of the translated text.
     * @return The updated options.
     */
    public TranslateOptions setTargetLanguageScript(String targetLanguageScript) {
        this.targetLanguageScript = targetLanguageScript;
        return this;
    }

    /**
     * @return Whether or not the service allows fallbeck for Custom Translator requests.
     */
    public Boolean isAllowFallback() {
        return allowFallback;
    }

    /**
     * @param allowFallback Whether or not the service allows fallbeck for Custom Translator requests.
     * @return The updated options.
     */
    public TranslateOptions setAllowFallback(Boolean allowFallback) {
        this.allowFallback = allowFallback;
        return this;
    }
}
