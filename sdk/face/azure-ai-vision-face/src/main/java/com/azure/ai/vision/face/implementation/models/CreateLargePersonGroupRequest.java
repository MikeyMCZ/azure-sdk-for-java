// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.implementation.models;

import com.azure.ai.vision.face.models.FaceRecognitionModel;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CreateLargePersonGroupRequest model.
 */
@Fluent
public final class CreateLargePersonGroupRequest {

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
     * The 'recognitionModel' associated with this face list. Supported 'recognitionModel' values include 'recognition_01', 'recognition_02, 'recognition_03', and 'recognition_04'. The default value is 'recognition_01'. 'recognition_04' is recommended since its accuracy is improved on faces wearing masks compared with 'recognition_03', and its overall accuracy is improved compared with 'recognition_01' and 'recognition_02'.
     */
    @Generated
    @JsonProperty(value = "recognitionModel")
    private FaceRecognitionModel recognitionModel;

    /**
     * Creates an instance of CreateLargePersonGroupRequest class.
     *
     * @param name the name value to set.
     */
    @Generated
    @JsonCreator
    public CreateLargePersonGroupRequest(@JsonProperty(value = "name") String name) {
        this.name = name;
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
     * Set the userData property: Optional user defined data. Length should not exceed 16K.
     *
     * @param userData the userData value to set.
     * @return the CreateLargePersonGroupRequest object itself.
     */
    @Generated
    public CreateLargePersonGroupRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * Get the recognitionModel property: The 'recognitionModel' associated with this face list. Supported
     * 'recognitionModel' values include 'recognition_01', 'recognition_02, 'recognition_03', and 'recognition_04'. The
     * default value is 'recognition_01'. 'recognition_04' is recommended since its accuracy is improved on faces
     * wearing masks compared with 'recognition_03', and its overall accuracy is improved compared with 'recognition_01'
     * and 'recognition_02'.
     *
     * @return the recognitionModel value.
     */
    @Generated
    public FaceRecognitionModel getRecognitionModel() {
        return this.recognitionModel;
    }

    /**
     * Set the recognitionModel property: The 'recognitionModel' associated with this face list. Supported
     * 'recognitionModel' values include 'recognition_01', 'recognition_02, 'recognition_03', and 'recognition_04'. The
     * default value is 'recognition_01'. 'recognition_04' is recommended since its accuracy is improved on faces
     * wearing masks compared with 'recognition_03', and its overall accuracy is improved compared with 'recognition_01'
     * and 'recognition_02'.
     *
     * @param recognitionModel the recognitionModel value to set.
     * @return the CreateLargePersonGroupRequest object itself.
     */
    @Generated
    public CreateLargePersonGroupRequest setRecognitionModel(FaceRecognitionModel recognitionModel) {
        this.recognitionModel = recognitionModel;
        return this;
    }
}
