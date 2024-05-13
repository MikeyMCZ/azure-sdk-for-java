// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.tables.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The properties for the table query response.
 */
@Fluent
public final class TableQueryResponse implements JsonSerializable<TableQueryResponse> {
    /*
     * The metadata response of the table.
     */
    private String odataMetadata;

    /*
     * List of tables.
     */
    private List<TableResponseProperties> value;

    /**
     * Creates an instance of TableQueryResponse class.
     */
    public TableQueryResponse() {
    }

    /**
     * Get the odataMetadata property: The metadata response of the table.
     * 
     * @return the odataMetadata value.
     */
    public String getOdataMetadata() {
        return this.odataMetadata;
    }

    /**
     * Set the odataMetadata property: The metadata response of the table.
     * 
     * @param odataMetadata the odataMetadata value to set.
     * @return the TableQueryResponse object itself.
     */
    public TableQueryResponse setOdataMetadata(String odataMetadata) {
        this.odataMetadata = odataMetadata;
        return this;
    }

    /**
     * Get the value property: List of tables.
     * 
     * @return the value value.
     */
    public List<TableResponseProperties> getValue() {
        return this.value;
    }

    /**
     * Set the value property: List of tables.
     * 
     * @param value the value value to set.
     * @return the TableQueryResponse object itself.
     */
    public TableQueryResponse setValue(List<TableResponseProperties> value) {
        this.value = value;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("odata.metadata", this.odataMetadata);
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TableQueryResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TableQueryResponse if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TableQueryResponse.
     */
    public static TableQueryResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TableQueryResponse deserializedTableQueryResponse = new TableQueryResponse();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("odata.metadata".equals(fieldName)) {
                    deserializedTableQueryResponse.odataMetadata = reader.getString();
                } else if ("value".equals(fieldName)) {
                    List<TableResponseProperties> value
                        = reader.readArray(reader1 -> TableResponseProperties.fromJson(reader1));
                    deserializedTableQueryResponse.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTableQueryResponse;
        });
    }
}
