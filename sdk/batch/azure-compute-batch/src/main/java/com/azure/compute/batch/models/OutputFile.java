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
 * On every file uploads, Batch service writes two log files to the compute node, 'fileuploadout.txt' and
 * 'fileuploaderr.txt'. These log files are used to learn more about a specific failure.
 */
@Immutable
public final class OutputFile implements JsonSerializable<OutputFile> {

    /*
     * A pattern indicating which file(s) to upload. Both relative and absolute paths are supported. Relative paths are relative to the Task working directory. The following wildcards are supported: * matches 0 or more characters (for example pattern abc* would match abc or abcdef), ** matches any directory, ? matches any single character, [abc] matches one character in the brackets, and [a-c] matches one character in the range. Brackets can include a negation to match any character not specified (for example [!abc] matches any character but a, b, or c). If a file name starts with "." it is ignored by default but may be matched by specifying it explicitly (for example *.gif will not match .a.gif, but .*.gif will). A simple example: **\*.txt matches any file that does not start in '.' and ends with .txt in the Task working directory or any subdirectory. If the filename contains a wildcard character it can be escaped using brackets (for example abc[*] would match a file named abc*). Note that both \ and / are treated as directory separators on Windows, but only / is on Linux. Environment variables (%var% on Windows or $var on Linux) are expanded prior to the pattern being applied.
     */
    @Generated
    private final String filePattern;

    /*
     * The destination for the output file(s).
     */
    @Generated
    private final OutputFileDestination destination;

    /*
     * Additional options for the upload operation, including under what conditions to perform the upload.
     */
    @Generated
    private final OutputFileUploadConfig uploadOptions;

    /**
     * Get the filePattern property: A pattern indicating which file(s) to upload. Both relative and absolute paths are
     * supported. Relative paths are relative to the Task working directory. The following wildcards are supported: *
     * matches 0 or more characters (for example pattern abc* would match abc or abcdef), ** matches any directory, ?
     * matches any single character, [abc] matches one character in the brackets, and [a-c] matches one character in the
     * range. Brackets can include a negation to match any character not specified (for example [!abc] matches any
     * character but a, b, or c). If a file name starts with "." it is ignored by default but may be matched by
     * specifying it explicitly (for example *.gif will not match .a.gif, but .*.gif will). A simple example: **\*.txt
     * matches any file that does not start in '.' and ends with .txt in the Task working directory or any subdirectory.
     * If the filename contains a wildcard character it can be escaped using brackets (for example abc[*] would match a
     * file named abc*). Note that both \ and / are treated as directory separators on Windows, but only / is on Linux.
     * Environment variables (%var% on Windows or $var on Linux) are expanded prior to the pattern being applied.
     *
     * @return the filePattern value.
     */
    @Generated
    public String getFilePattern() {
        return this.filePattern;
    }

    /**
     * Get the destination property: The destination for the output file(s).
     *
     * @return the destination value.
     */
    @Generated
    public OutputFileDestination getDestination() {
        return this.destination;
    }

    /**
     * Get the uploadOptions property: Additional options for the upload operation, including under what conditions to
     * perform the upload.
     *
     * @return the uploadOptions value.
     */
    @Generated
    public OutputFileUploadConfig getUploadOptions() {
        return this.uploadOptions;
    }

    /**
     * Creates an instance of OutputFile class.
     *
     * @param filePattern the filePattern value to set.
     * @param destination the destination value to set.
     * @param uploadOptions the uploadOptions value to set.
     */
    @Generated
    public OutputFile(String filePattern, OutputFileDestination destination, OutputFileUploadConfig uploadOptions) {
        this.filePattern = filePattern;
        this.destination = destination;
        this.uploadOptions = uploadOptions;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("filePattern", this.filePattern);
        jsonWriter.writeJsonField("destination", this.destination);
        jsonWriter.writeJsonField("uploadOptions", this.uploadOptions);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OutputFile from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of OutputFile if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OutputFile.
     */
    @Generated
    public static OutputFile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String filePattern = null;
            OutputFileDestination destination = null;
            OutputFileUploadConfig uploadOptions = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("filePattern".equals(fieldName)) {
                    filePattern = reader.getString();
                } else if ("destination".equals(fieldName)) {
                    destination = OutputFileDestination.fromJson(reader);
                } else if ("uploadOptions".equals(fieldName)) {
                    uploadOptions = OutputFileUploadConfig.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new OutputFile(filePattern, destination, uploadOptions);
        });
    }
}
