// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.translation.text;

import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestMode;
import com.azure.core.test.TestProxyTestBase;
import com.azure.core.test.utils.MockTokenCredential;
import com.azure.core.test.models.CustomMatcher;
import com.azure.core.util.Configuration;
import com.azure.identity.ClientSecretCredentialBuilder;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;

public class TextTranslationClientBase extends TestProxyTestBase {

    @Override
    public void beforeTest() {
        if (getTestMode() != TestMode.LIVE) {
            interceptorManager.addMatchers(Collections.singletonList(new CustomMatcher()
                .setHeadersKeyOnlyMatch(Arrays.asList("Ocp-Apim-Subscription-Region", "Ocp-Apim-ResourceId"))));
        }
    }

    TextTranslationClient getTranslationClient() {
        return getClient(getEndpoint());
    }

    TextTranslationClient getTranslationClientWithCustomEndpoint() {
        return getClient(getCustomEndpoint());
    }

    TextTranslationClient getClient(String endpoint) {
        TextTranslationClientBuilder textTranslationClientbuilder = new TextTranslationClientBuilder()
            .credential(new AzureKeyCredential(getKey()))
            .region(getRegion())
            .endpoint(endpoint)
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));

        if (interceptorManager.isPlaybackMode()) {
            textTranslationClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (interceptorManager.isRecordMode()) {
            textTranslationClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        return textTranslationClientbuilder.buildClient();
    }

    protected String getEndpoint() {
        return interceptorManager.isPlaybackMode()
            ? "https://fakeEndpoint.cognitive.microsofttranslator.com"
            : Configuration.getGlobalConfiguration().get("TEXT_TRANSLATION_ENDPOINT");
    }

    protected String getCustomEndpoint() {
        return interceptorManager.isPlaybackMode()
            ? "https://fakeCustomEndpoint.cognitiveservices.azure.com"
            : Configuration.getGlobalConfiguration().get("TEXT_TRANSLATION_CUSTOM_ENDPOINT");
    }

    private String getKey() {
        return interceptorManager.isPlaybackMode()
            ? "fakeApiKey"
            : Configuration.getGlobalConfiguration().get("TEXT_TRANSLATION_API_KEY");
    }

    private String getRegion() {
        return interceptorManager.isPlaybackMode()
            ? "fakeRegion"
            : Configuration.getGlobalConfiguration().get("TEXT_TRANSLATION_REGION");
    }

    private String getAadRegion() {
        return interceptorManager.isPlaybackMode()
            ? "fakeRegion"
            : Configuration.getGlobalConfiguration().get("TEXT_TRANSLATION_AAD_REGION");
    }

    private String getAzureResourceId() {
        return interceptorManager.isPlaybackMode()
            ? "fakeResourceId"
            : Configuration.getGlobalConfiguration().get("TEXT_TRANSLATION_AAD_RESOURCE_ID");
    }

    private String getTokenURL() {
        return interceptorManager.isPlaybackMode()
            ? "https://fakeTokenEndpoint.api.cognitive.microsoft.com"
            : Configuration.getGlobalConfiguration().get("TEXT_TRANSLATION_TOKEN_URL");
    }

    TextTranslationClient getTranslationClientWithToken() throws IOException {
        TextTranslationClientBuilder textTranslationClientbuilder = new TextTranslationClientBuilder()
            .credential(getTokenCredential())
            .region(getRegion())
            .endpoint(getEndpoint())
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));

        if (getTestMode() == TestMode.PLAYBACK) {
            textTranslationClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            textTranslationClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        return textTranslationClientbuilder.buildClient();
    }

    TextTranslationClient getTranslationClientWithAadAuth() {
        TextTranslationClientBuilder textTranslationClientbuilder = new TextTranslationClientBuilder()
            .credential(getAadUserToken())
            .region(getAadRegion())
            .azureResourceId(getAzureResourceId())
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));

        if (getTestMode() == TestMode.PLAYBACK) {
            textTranslationClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            textTranslationClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        return textTranslationClientbuilder.buildClient();
    }

    private TokenCredential getTokenCredential() throws IOException {
        String tokenResponse;

        if (getTestMode() == TestMode.PLAYBACK) {
            tokenResponse = "FAKE_TOKEN";
        } else {
            URL tokenService = new URL(getTokenURL() + "/sts/v1.0/issueToken?Subscription-Key=" + getKey());
            HttpURLConnection connection = (HttpURLConnection) tokenService.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            OutputStreamWriter writers = new OutputStreamWriter(connection.getOutputStream());
            writers.write("{}"); //body
            writers.flush();

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            tokenResponse = in.readLine();
            in.close();
        }
        return new StaticTokenForTest(tokenResponse);
    }

    private TokenCredential getAadUserToken() {
        TokenCredential credential;

        if (getTestMode() != TestMode.PLAYBACK) {
            Configuration global = Configuration.getGlobalConfiguration().clone();
            credential = new ClientSecretCredentialBuilder()
                .clientSecret(global.get("AZURE_CLIENT_SECRET"))
                .clientId(global.get("AZURE_CLIENT_ID"))
                .tenantId(global.get("AZURE_TENANT_ID"))
                .build();
        } else {
            credential = new MockTokenCredential();
        }

        return credential;
    }
}
