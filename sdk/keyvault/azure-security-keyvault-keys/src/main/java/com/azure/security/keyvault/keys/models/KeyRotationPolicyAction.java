// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.keys.models;

/** The type of the action. The value should be compared case-insensitively. */
public enum KeyRotationPolicyAction {
    /** Rotate the key based on the key policy. */
    ROTATE("Rotate"),

    /** Trigger Event Grid events. Defaults to 30 days before expiry. Key Vault only. */
    NOTIFY("Notify");

    /** The actual serialized value for a KeyRotationPolicyAction instance. */
    private final String value;

    KeyRotationPolicyAction(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a KeyRotationPolicyAction instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed KeyRotationPolicyAction object, or null if unable to parse.
     */
    public static KeyRotationPolicyAction fromString(String value) {
        if (value == null) {
            return null;
        }
        KeyRotationPolicyAction[] items = KeyRotationPolicyAction.values();
        for (KeyRotationPolicyAction item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return this.value;
    }
}
