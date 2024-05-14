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
 * Parameters for disabling an Azure Batch Job.
 */
@Immutable
public final class BatchJobDisableContent implements JsonSerializable<BatchJobDisableContent> {

    /*
     * What to do with active Tasks associated with the Job.
     */
    @Generated
    private final DisableBatchJobOption disableTasks;

    /**
     * Creates an instance of BatchJobDisableContent class.
     *
     * @param disableTasks the disableTasks value to set.
     */
    @Generated
    public BatchJobDisableContent(DisableBatchJobOption disableTasks) {
        this.disableTasks = disableTasks;
    }

    /**
     * Get the disableTasks property: What to do with active Tasks associated with the Job.
     *
     * @return the disableTasks value.
     */
    @Generated
    public DisableBatchJobOption getDisableTasks() {
        return this.disableTasks;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("disableTasks", this.disableTasks == null ? null : this.disableTasks.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchJobDisableContent from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchJobDisableContent if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BatchJobDisableContent.
     */
    @Generated
    public static BatchJobDisableContent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DisableBatchJobOption disableTasks = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("disableTasks".equals(fieldName)) {
                    disableTasks = DisableBatchJobOption.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return new BatchJobDisableContent(disableTasks);
        });
    }
}
