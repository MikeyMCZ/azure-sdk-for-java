// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The AWS organization data.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "organizationMembershipType",
    defaultImpl = AwsOrganizationalData.class,
    visible = true)
@JsonTypeName("AwsOrganizationalData")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Organization", value = AwsOrganizationalDataMaster.class),
    @JsonSubTypes.Type(name = "Member", value = AwsOrganizationalDataMember.class) })
@Immutable
public class AwsOrganizationalData {
    /*
     * The multi cloud account's membership type in the organization
     */
    @JsonTypeId
    @JsonProperty(value = "organizationMembershipType", required = true)
    private OrganizationMembershipType organizationMembershipType;

    /**
     * Creates an instance of AwsOrganizationalData class.
     */
    public AwsOrganizationalData() {
        this.organizationMembershipType = OrganizationMembershipType.fromString("AwsOrganizationalData");
    }

    /**
     * Get the organizationMembershipType property: The multi cloud account's membership type in the organization.
     * 
     * @return the organizationMembershipType value.
     */
    public OrganizationMembershipType organizationMembershipType() {
        return this.organizationMembershipType;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
