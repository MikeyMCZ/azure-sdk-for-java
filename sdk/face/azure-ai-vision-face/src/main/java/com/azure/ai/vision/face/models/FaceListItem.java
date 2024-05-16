// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Face list item for list face list.
 */
@Immutable
public final class FaceListItem {

    /*
     * User defined name, maximum length is 128.
     */
    @Generated
    @JsonProperty(value = "name")
    private final String name;

    /*
     * Optional user defined data. Length should not exceed 16K.
     */
    @Generated
    @JsonProperty(value = "userData")
    private String userData;

    /*
     * Name of recognition model. Recognition model is used when the face features are extracted and associated with detected faceIds.
     */
    @Generated
    @JsonProperty(value = "recognitionModel")
    private FaceRecognitionModel recognitionModel;

    /*
     * Valid character is letter in lower case or digit or '-' or '_', maximum length is 64.
     */
    @Generated
    @JsonProperty(value = "faceListId")
    private final String faceListId;

    /**
     * Creates an instance of FaceListItem class.
     *
     * @param name the name value to set.
     * @param faceListId the faceListId value to set.
     */
    @Generated
    @JsonCreator
    private FaceListItem(@JsonProperty(value = "name") String name,
        @JsonProperty(value = "faceListId") String faceListId) {
        this.name = name;
        this.faceListId = faceListId;
    }

    /**
     * Get the name property: User defined name, maximum length is 128.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the userData property: Optional user defined data. Length should not exceed 16K.
     *
     * @return the userData value.
     */
    @Generated
    public String getUserData() {
        return this.userData;
    }

    /**
     * Get the recognitionModel property: Name of recognition model. Recognition model is used when the face features
     * are extracted and associated with detected faceIds.
     *
     * @return the recognitionModel value.
     */
    @Generated
    public FaceRecognitionModel getRecognitionModel() {
        return this.recognitionModel;
    }

    /**
     * Get the faceListId property: Valid character is letter in lower case or digit or '-' or '_', maximum length is
     * 64.
     *
     * @return the faceListId value.
     */
    @Generated
    public String getFaceListId() {
        return this.faceListId;
    }
}
