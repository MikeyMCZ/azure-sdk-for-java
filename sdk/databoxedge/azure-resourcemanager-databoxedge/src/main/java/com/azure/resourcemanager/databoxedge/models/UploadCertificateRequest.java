// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.fluent.models.RawCertificateData;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The upload certificate request. */
@Fluent
public final class UploadCertificateRequest {
    /*
     * The Base 64 encoded certificate raw data.
     */
    @JsonProperty(value = "properties", required = true)
    private RawCertificateData innerProperties = new RawCertificateData();

    /** Creates an instance of UploadCertificateRequest class. */
    public UploadCertificateRequest() {
    }

    /**
     * Get the innerProperties property: The Base 64 encoded certificate raw data.
     *
     * @return the innerProperties value.
     */
    private RawCertificateData innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the authenticationType property: The authentication type.
     *
     * @return the authenticationType value.
     */
    public AuthenticationType authenticationType() {
        return this.innerProperties() == null ? null : this.innerProperties().authenticationType();
    }

    /**
     * Set the authenticationType property: The authentication type.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the UploadCertificateRequest object itself.
     */
    public UploadCertificateRequest withAuthenticationType(AuthenticationType authenticationType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RawCertificateData();
        }
        this.innerProperties().withAuthenticationType(authenticationType);
        return this;
    }

    /**
     * Get the certificate property: The base64 encoded certificate raw data.
     *
     * @return the certificate value.
     */
    public String certificate() {
        return this.innerProperties() == null ? null : this.innerProperties().certificate();
    }

    /**
     * Set the certificate property: The base64 encoded certificate raw data.
     *
     * @param certificate the certificate value to set.
     * @return the UploadCertificateRequest object itself.
     */
    public UploadCertificateRequest withCertificate(String certificate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RawCertificateData();
        }
        this.innerProperties().withCertificate(certificate);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model UploadCertificateRequest"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UploadCertificateRequest.class);
}
