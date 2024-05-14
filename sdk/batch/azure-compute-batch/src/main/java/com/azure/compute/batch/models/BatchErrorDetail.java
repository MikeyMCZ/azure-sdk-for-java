// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An item of additional information included in an Azure Batch error response.
 */
@Immutable
public final class BatchErrorDetail implements JsonSerializable<BatchErrorDetail> {

    /*
     * An identifier specifying the meaning of the Value property.
     */
    @Generated
    private String key;

    /*
     * The additional information included with the error response.
     */
    @Generated
    private String value;

    /**
     * Creates an instance of BatchErrorDetail class.
     */
    @Generated
    private BatchErrorDetail() {
    }

    /**
     * Get the key property: An identifier specifying the meaning of the Value property.
     *
     * @return the key value.
     */
    @Generated
    public String getKey() {
        return this.key;
    }

    /**
     * Get the value property: The additional information included with the error response.
     *
     * @return the value value.
     */
    @Generated
    public String getValue() {
        return this.value;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("key", this.key);
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchErrorDetail from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchErrorDetail if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the BatchErrorDetail.
     */
    @Generated
    public static BatchErrorDetail fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BatchErrorDetail deserializedBatchErrorDetail = new BatchErrorDetail();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("key".equals(fieldName)) {
                    deserializedBatchErrorDetail.key = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedBatchErrorDetail.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedBatchErrorDetail;
        });
    }
}
