// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.AdaptiveApplicationControlGroup;
import com.azure.resourcemanager.security.models.ConfigurationStatus;
import com.azure.resourcemanager.security.models.EnforcementMode;
import com.azure.resourcemanager.security.models.EnforcementSupport;
import com.azure.resourcemanager.security.models.FileType;
import com.azure.resourcemanager.security.models.RecommendationAction;
import com.azure.resourcemanager.security.models.RecommendationType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AdaptiveApplicationControlsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"enforcementMode\":\"Audit\",\"protectionMode\":{\"exe\":\"Enforce\",\"msi\":\"Enforce\",\"script\":\"None\",\"executable\":\"Audit\"},\"configurationStatus\":\"NoStatus\",\"recommendationStatus\":\"NotAvailable\",\"issues\":[{\"issue\":\"RulesViolatedManually\",\"numberOfVms\":73.49999},{\"issue\":\"MsiAndScriptViolationsAudited\",\"numberOfVms\":89.16025},{\"issue\":\"ExecutableViolationsAudited\",\"numberOfVms\":80.52907},{\"issue\":\"MsiAndScriptViolationsBlocked\",\"numberOfVms\":30.746048}],\"sourceSystem\":\"Azure_AuditD\",\"vmRecommendations\":[{\"configurationStatus\":\"NotConfigured\",\"recommendationAction\":\"Add\",\"resourceId\":\"oikuqirhsk\",\"enforcementSupport\":\"Unknown\"},{\"configurationStatus\":\"NotConfigured\",\"recommendationAction\":\"Recommended\",\"resourceId\":\"n\",\"enforcementSupport\":\"NotSupported\"},{\"configurationStatus\":\"Failed\",\"recommendationAction\":\"Remove\",\"resourceId\":\"ibrlrjugcfeb\",\"enforcementSupport\":\"NotSupported\"},{\"configurationStatus\":\"Failed\",\"recommendationAction\":\"Recommended\",\"resourceId\":\"rllld\",\"enforcementSupport\":\"NotSupported\"}],\"pathRecommendations\":[{\"path\":\"wi\",\"action\":\"Remove\",\"type\":\"IoT_EdgeLoggingOptions\",\"publisherInfo\":{\"publisherName\":\"j\",\"productName\":\"wrduxntpfxxgja\",\"binaryName\":\"xfwf\",\"version\":\"qv\"},\"common\":true,\"userSids\":[\"qynlzxemelup\",\"ckiehdmvfoyr\",\"xxffgmcuanszeerv\"],\"usernames\":[{},{}],\"fileType\":\"Executable\",\"configurationStatus\":\"InProgress\"},{\"path\":\"bcqpfusekij\",\"action\":\"Recommended\",\"type\":\"IoT_InconsistentModuleSettings\",\"publisherInfo\":{\"publisherName\":\"bivpyrkvor\",\"productName\":\"qmljewynbfv\",\"binaryName\":\"wv\",\"version\":\"kmjufav\"},\"common\":true,\"userSids\":[\"sotmynklnmrz\",\"mtvrkkfcwxi\",\"kst\",\"neykeipxutcbvriu\"],\"usernames\":[{},{}],\"fileType\":\"Msi\",\"configurationStatus\":\"Configured\"},{\"path\":\"sayyaeiivjqkqtjw\",\"action\":\"Remove\",\"type\":\"IoT_PrivilegedDockerOptions\",\"publisherInfo\":{\"publisherName\":\"qfxqetxt\",\"productName\":\"iusp\",\"binaryName\":\"zljvgjijzqjhljsa\",\"version\":\"jsisfqqhcmec\"},\"common\":false,\"userSids\":[\"eiirpnjygllfkchh\",\"sj\",\"zzcajl\",\"mqcycabaamkkhd\"],\"usernames\":[{},{},{}],\"fileType\":\"Msi\",\"configurationStatus\":\"NotConfigured\"}]},\"location\":\"kxpu\",\"id\":\"zdyoqywsu\",\"name\":\"rpzhr\",\"type\":\"hezxi\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SecurityManager manager = SecurityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        AdaptiveApplicationControlGroup response = manager.adaptiveApplicationControls()
            .getWithResponse("boojuxi", "ozb", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(EnforcementMode.AUDIT, response.enforcementMode());
        Assertions.assertEquals(EnforcementMode.ENFORCE, response.protectionMode().exe());
        Assertions.assertEquals(EnforcementMode.ENFORCE, response.protectionMode().msi());
        Assertions.assertEquals(EnforcementMode.NONE, response.protectionMode().script());
        Assertions.assertEquals(EnforcementMode.AUDIT, response.protectionMode().executable());
        Assertions.assertEquals(ConfigurationStatus.NOT_CONFIGURED,
            response.vmRecommendations().get(0).configurationStatus());
        Assertions.assertEquals(RecommendationAction.ADD, response.vmRecommendations().get(0).recommendationAction());
        Assertions.assertEquals("oikuqirhsk", response.vmRecommendations().get(0).resourceId());
        Assertions.assertEquals(EnforcementSupport.UNKNOWN, response.vmRecommendations().get(0).enforcementSupport());
        Assertions.assertEquals("wi", response.pathRecommendations().get(0).path());
        Assertions.assertEquals(RecommendationAction.REMOVE, response.pathRecommendations().get(0).action());
        Assertions.assertEquals(RecommendationType.IO_T_EDGE_LOGGING_OPTIONS,
            response.pathRecommendations().get(0).type());
        Assertions.assertEquals("j", response.pathRecommendations().get(0).publisherInfo().publisherName());
        Assertions.assertEquals("wrduxntpfxxgja", response.pathRecommendations().get(0).publisherInfo().productName());
        Assertions.assertEquals("xfwf", response.pathRecommendations().get(0).publisherInfo().binaryName());
        Assertions.assertEquals("qv", response.pathRecommendations().get(0).publisherInfo().version());
        Assertions.assertEquals(true, response.pathRecommendations().get(0).common());
        Assertions.assertEquals("qynlzxemelup", response.pathRecommendations().get(0).userSids().get(0));
        Assertions.assertEquals(FileType.EXECUTABLE, response.pathRecommendations().get(0).fileType());
        Assertions.assertEquals(ConfigurationStatus.IN_PROGRESS,
            response.pathRecommendations().get(0).configurationStatus());
    }
}
