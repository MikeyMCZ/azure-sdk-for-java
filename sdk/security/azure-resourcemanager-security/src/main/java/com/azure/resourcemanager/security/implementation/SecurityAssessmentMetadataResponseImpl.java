// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.SecurityAssessmentMetadataResponseInner;
import com.azure.resourcemanager.security.models.AssessmentType;
import com.azure.resourcemanager.security.models.Categories;
import com.azure.resourcemanager.security.models.ImplementationEffort;
import com.azure.resourcemanager.security.models.SecurityAssessmentMetadataPartnerData;
import com.azure.resourcemanager.security.models.SecurityAssessmentMetadataPropertiesResponsePublishDates;
import com.azure.resourcemanager.security.models.SecurityAssessmentMetadataResponse;
import com.azure.resourcemanager.security.models.Severity;
import com.azure.resourcemanager.security.models.Tactics;
import com.azure.resourcemanager.security.models.Techniques;
import com.azure.resourcemanager.security.models.Threats;
import com.azure.resourcemanager.security.models.UserImpact;
import java.util.Collections;
import java.util.List;

public final class SecurityAssessmentMetadataResponseImpl
    implements SecurityAssessmentMetadataResponse, SecurityAssessmentMetadataResponse.Definition {
    private SecurityAssessmentMetadataResponseInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    SecurityAssessmentMetadataResponseImpl(SecurityAssessmentMetadataResponseInner innerObject,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SecurityAssessmentMetadataPropertiesResponsePublishDates publishDates() {
        return this.innerModel().publishDates();
    }

    public String plannedDeprecationDate() {
        return this.innerModel().plannedDeprecationDate();
    }

    public List<Tactics> tactics() {
        List<Tactics> inner = this.innerModel().tactics();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<Techniques> techniques() {
        List<Techniques> inner = this.innerModel().techniques();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String policyDefinitionId() {
        return this.innerModel().policyDefinitionId();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String remediationDescription() {
        return this.innerModel().remediationDescription();
    }

    public List<Categories> categories() {
        List<Categories> inner = this.innerModel().categories();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Severity severity() {
        return this.innerModel().severity();
    }

    public UserImpact userImpact() {
        return this.innerModel().userImpact();
    }

    public ImplementationEffort implementationEffort() {
        return this.innerModel().implementationEffort();
    }

    public List<Threats> threats() {
        List<Threats> inner = this.innerModel().threats();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean preview() {
        return this.innerModel().preview();
    }

    public AssessmentType assessmentType() {
        return this.innerModel().assessmentType();
    }

    public SecurityAssessmentMetadataPartnerData partnerData() {
        return this.innerModel().partnerData();
    }

    public SecurityAssessmentMetadataResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }

    private String assessmentMetadataName;

    public SecurityAssessmentMetadataResponse create() {
        this.innerObject = serviceManager.serviceClient()
            .getAssessmentsMetadatas()
            .createInSubscriptionWithResponse(assessmentMetadataName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public SecurityAssessmentMetadataResponse create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAssessmentsMetadatas()
            .createInSubscriptionWithResponse(assessmentMetadataName, this.innerModel(), context)
            .getValue();
        return this;
    }

    SecurityAssessmentMetadataResponseImpl(String name,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = new SecurityAssessmentMetadataResponseInner();
        this.serviceManager = serviceManager;
        this.assessmentMetadataName = name;
    }

    public SecurityAssessmentMetadataResponse refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getAssessmentsMetadatas()
            .getInSubscriptionWithResponse(assessmentMetadataName, Context.NONE)
            .getValue();
        return this;
    }

    public SecurityAssessmentMetadataResponse refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAssessmentsMetadatas()
            .getInSubscriptionWithResponse(assessmentMetadataName, context)
            .getValue();
        return this;
    }

    public SecurityAssessmentMetadataResponseImpl
        withPublishDates(SecurityAssessmentMetadataPropertiesResponsePublishDates publishDates) {
        this.innerModel().withPublishDates(publishDates);
        return this;
    }

    public SecurityAssessmentMetadataResponseImpl withPlannedDeprecationDate(String plannedDeprecationDate) {
        this.innerModel().withPlannedDeprecationDate(plannedDeprecationDate);
        return this;
    }

    public SecurityAssessmentMetadataResponseImpl withTactics(List<Tactics> tactics) {
        this.innerModel().withTactics(tactics);
        return this;
    }

    public SecurityAssessmentMetadataResponseImpl withTechniques(List<Techniques> techniques) {
        this.innerModel().withTechniques(techniques);
        return this;
    }

    public SecurityAssessmentMetadataResponseImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public SecurityAssessmentMetadataResponseImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public SecurityAssessmentMetadataResponseImpl withRemediationDescription(String remediationDescription) {
        this.innerModel().withRemediationDescription(remediationDescription);
        return this;
    }

    public SecurityAssessmentMetadataResponseImpl withCategories(List<Categories> categories) {
        this.innerModel().withCategories(categories);
        return this;
    }

    public SecurityAssessmentMetadataResponseImpl withSeverity(Severity severity) {
        this.innerModel().withSeverity(severity);
        return this;
    }

    public SecurityAssessmentMetadataResponseImpl withUserImpact(UserImpact userImpact) {
        this.innerModel().withUserImpact(userImpact);
        return this;
    }

    public SecurityAssessmentMetadataResponseImpl withImplementationEffort(ImplementationEffort implementationEffort) {
        this.innerModel().withImplementationEffort(implementationEffort);
        return this;
    }

    public SecurityAssessmentMetadataResponseImpl withThreats(List<Threats> threats) {
        this.innerModel().withThreats(threats);
        return this;
    }

    public SecurityAssessmentMetadataResponseImpl withPreview(Boolean preview) {
        this.innerModel().withPreview(preview);
        return this;
    }

    public SecurityAssessmentMetadataResponseImpl withAssessmentType(AssessmentType assessmentType) {
        this.innerModel().withAssessmentType(assessmentType);
        return this;
    }

    public SecurityAssessmentMetadataResponseImpl withPartnerData(SecurityAssessmentMetadataPartnerData partnerData) {
        this.innerModel().withPartnerData(partnerData);
        return this;
    }
}
