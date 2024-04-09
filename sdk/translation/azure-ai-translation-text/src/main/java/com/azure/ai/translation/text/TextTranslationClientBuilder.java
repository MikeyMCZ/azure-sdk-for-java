// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.translation.text;

import com.azure.ai.translation.text.implementation.TextTranslationClientImpl;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.client.traits.ConfigurationTrait;
import com.azure.core.client.traits.EndpointTrait;
import com.azure.core.client.traits.HttpTrait;
import com.azure.core.client.traits.KeyCredentialTrait;
import com.azure.core.client.traits.TokenCredentialTrait;
import com.azure.core.credential.KeyCredential;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.AddHeadersPolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.KeyCredentialPolicy;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.builder.ClientBuilderUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.JacksonAdapter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * A builder for creating a new instance of the TextTranslationClient type.
 */
@ServiceClientBuilder(serviceClients = { TextTranslationClient.class, TextTranslationAsyncClient.class })
public final class TextTranslationClientBuilder implements HttpTrait<TextTranslationClientBuilder>,
    ConfigurationTrait<TextTranslationClientBuilder>, EndpointTrait<TextTranslationClientBuilder>,
    KeyCredentialTrait<TextTranslationClientBuilder>, TokenCredentialTrait<TextTranslationClientBuilder> {

    @Generated
    private static final String SDK_NAME = "name";

    @Generated
    private static final String SDK_VERSION = "version";

    private static final String DEFAULT_SCOPE = "https://cognitiveservices.azure.com/.default";

    private static final String OCP_APIM_SUBSCRIPTION_KEY = "Ocp-Apim-Subscription-Key";

    private static final String OCP_APIM_SUBSCRIPTION_REGION = "Ocp-Apim-Subscription-Region";

    private static final String OCP_APIM_RESOURCE_ID_KEY = "Ocp-Apim-ResourceId";

    private String region;

    private String resourceId;

    private KeyCredential credential;

    private TokenCredential tokenCredential;

    @Generated
    private static final Map<String, String> PROPERTIES
        = CoreUtils.getProperties("azure-ai-translation-text.properties");

    @Generated
    private final List<HttpPipelinePolicy> pipelinePolicies;

    /**
     * Create an instance of the TextTranslationClientBuilder.
     */
    @Generated
    public TextTranslationClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The HTTP pipeline to send requests through.
     */
    @Generated
    private HttpPipeline pipeline;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public TextTranslationClientBuilder pipeline(HttpPipeline pipeline) {
        if (this.pipeline != null && pipeline == null) {
            LOGGER.info("HttpPipeline is being set to 'null' when it was previously configured.");
        }
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The HTTP client used to send the request.
     */
    @Generated
    private HttpClient httpClient;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public TextTranslationClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The logging configuration for HTTP requests and responses.
     */
    @Generated
    private HttpLogOptions httpLogOptions;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public TextTranslationClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = httpLogOptions;
        return this;
    }

    /*
     * The client options such as application ID and custom headers to set on a request.
     */
    @Generated
    private ClientOptions clientOptions;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public TextTranslationClientBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    /*
     * The retry options to configure retry policy for failed requests.
     */
    @Generated
    private RetryOptions retryOptions;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public TextTranslationClientBuilder retryOptions(RetryOptions retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public TextTranslationClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        Objects.requireNonNull(customPolicy, "'customPolicy' cannot be null.");
        pipelinePolicies.add(customPolicy);
        return this;
    }

    /*
     * The configuration store that is used during construction of the service client.
     */
    @Generated
    private Configuration configuration;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public TextTranslationClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The service endpoint
     */
    @Generated
    private String endpoint;

    private Boolean isCustomEndpoint = false;

    /**
     * {@inheritDoc}.
     */
    @Override
    public TextTranslationClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        this.isCustomEndpoint = CustomEndpointUtils.isPlatformHost(endpoint);
        return this;
    }

    /*
     * Service version
     */
    @Generated
    private TextTranslationServiceVersion serviceVersion;

    /**
     * Sets Service version.
     *
     * @param serviceVersion the serviceVersion value.
     * @return the TextTranslationClientBuilder.
     */
    @Generated
    public TextTranslationClientBuilder serviceVersion(TextTranslationServiceVersion serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }

    /*
     * The retry policy that will attempt to retry failed requests, if applicable.
     */
    @Generated
    private RetryPolicy retryPolicy;

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the TextTranslationClientBuilder.
     */
    @Generated
    public TextTranslationClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Sets the {@link KeyCredential} used to authorize requests sent to the service.
     *
     * @param credential {@link KeyCredential} used to authorize requests sent to the service.
     * @return The updated {@link TextTranslationClientBuilder} object.
     * @throws NullPointerException If {@code credential} is null.
     */
    public TextTranslationClientBuilder credential(KeyCredential credential) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        this.credential = credential;
        return this;
    }

    /**
     * Sets the region used to authorize requests sent to the service.
     *
     * @param region where the Translator resource is created.
     * @return The updated {@link TextTranslationClientBuilder} object.
     * @throws NullPointerException If {@code region} is null.
     */
    public TextTranslationClientBuilder region(String region) {
        Objects.requireNonNull(region, "'region' cannot be null.");
        this.region = region;
        return this;
    }

    /**
     * Sets the Azure Resource Id used to authorize requests sent to the service.
     *
     * @param resourceId Id of the Translator Resource.
     * @return The updated {@link TextTranslationClientBuilder} object.
     * @throws NullPointerException If {@code resourceId} is null.
     */
    public TextTranslationClientBuilder resourceId(String resourceId) {
        Objects.requireNonNull(resourceId, "'resourceId' cannot be null.");
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Sets the {@link TokenCredential} used to authorize requests sent to the service. Refer to the Azure SDK for Java
     * <a href="https://aka.ms/azsdk/java/docs/identity">identity and authentication</a>
     * documentation for more details on proper usage of the {@link TokenCredential} type.
     *
     * @param tokenCredential {@link TokenCredential} used to authorize requests sent to the service.
     * @return The updated {@link TextTranslationClientBuilder} object.
     * @throws NullPointerException If {@code tokenCredential} is null.
     */
    public TextTranslationClientBuilder credential(TokenCredential tokenCredential) {
        Objects.requireNonNull(tokenCredential, "'tokenCredential' cannot be null.");
        this.tokenCredential = tokenCredential;
        return this;
    }

    /**
     * Builds an instance of TextTranslationClientImpl with the provided parameters.
     *
     * @return an instance of TextTranslationClientImpl.
     */
    private TextTranslationClientImpl buildInnerClient() {
        HttpPipeline localPipeline = (pipeline != null) ? pipeline : createHttpPipeline();
        TextTranslationServiceVersion localServiceVersion
            = (serviceVersion != null) ? serviceVersion : TextTranslationServiceVersion.getLatest();
        String serviceEndpoint;
        if (this.endpoint == null) {
            serviceEndpoint = "https://api.cognitive.microsofttranslator.com";
        } else if (this.isCustomEndpoint) {
            try {
                URL hostUri = new URL(endpoint);
                URL fullUri = new URL(hostUri, "/translator/text/v" + localServiceVersion.getVersion());
                serviceEndpoint = fullUri.toString();
            } catch (MalformedURLException ex) {
                serviceEndpoint = endpoint;
            }
        } else {
            serviceEndpoint = endpoint;
        }
        if (tokenCredential != null && (this.region != null || this.resourceId != null)) {
            Objects.requireNonNull(this.region, "'region' cannot be null.");
            Objects.requireNonNull(this.resourceId, "'resourceId' cannot be null.");
        }
        if (this.credential != null && !CoreUtils.isNullOrEmpty(this.resourceId)) {
            throw LOGGER.logExceptionAsError(
                new IllegalStateException("Resource Id cannot be used with key credential. Set resourceId to null."));
        }
        if (tokenCredential != null && this.credential != null) {
            throw LOGGER.logExceptionAsError(
                new IllegalStateException("Both token credential and key credential cannot be set."));
        }
        TextTranslationClientImpl client = new TextTranslationClientImpl(localPipeline,
            JacksonAdapter.createDefaultSerializerAdapter(), serviceEndpoint, localServiceVersion);
        return client;
    }

    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration
            = (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        HttpLogOptions localHttpLogOptions = this.httpLogOptions == null ? new HttpLogOptions() : this.httpLogOptions;
        ClientOptions localClientOptions = this.clientOptions == null ? new ClientOptions() : this.clientOptions;
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        String clientName = PROPERTIES.getOrDefault(SDK_NAME, "UnknownName");
        String clientVersion = PROPERTIES.getOrDefault(SDK_VERSION, "UnknownVersion");
        String applicationId = CoreUtils.getApplicationId(localClientOptions, localHttpLogOptions);
        policies.add(new UserAgentPolicy(applicationId, clientName, clientVersion, buildConfiguration));
        policies.add(new RequestIdPolicy());
        policies.add(new AddHeadersFromContextPolicy());
        HttpHeaders headers = new HttpHeaders();
        localClientOptions.getHeaders()
            .forEach(header -> headers.set(HttpHeaderName.fromString(header.getName()), header.getValue()));
        if (headers.getSize() > 0) {
            policies.add(new AddHeadersPolicy(headers));
        }
        this.pipelinePolicies.stream().filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
            .forEach(p -> policies.add(p));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(ClientBuilderUtil.validateAndGetRetryPolicy(retryPolicy, retryOptions, new RetryPolicy()));
        policies.add(new AddDatePolicy());
        if (tokenCredential != null) {
            policies.add(new BearerTokenAuthenticationPolicy(tokenCredential, DEFAULT_SCOPE));
            if (this.region != null || this.resourceId != null) {
                Objects.requireNonNull(this.region, "'region' cannot be null.");
                Objects.requireNonNull(this.resourceId, "'resourceId' cannot be null.");
                HttpHeaders aadHeaders = new HttpHeaders();
                aadHeaders.put(OCP_APIM_RESOURCE_ID_KEY, this.resourceId);
                aadHeaders.put(OCP_APIM_SUBSCRIPTION_REGION, this.region);
                policies.add(new AddHeadersPolicy(aadHeaders));
            }
        }
        if (this.credential != null) {
            policies.add(new KeyCredentialPolicy(OCP_APIM_SUBSCRIPTION_KEY, credential));
            if (this.region != null) {
                HttpHeaders regionHeaders = new HttpHeaders();
                regionHeaders.put(OCP_APIM_SUBSCRIPTION_REGION, this.region);
                policies.add(new AddHeadersPolicy(regionHeaders));
            }
        }
        this.pipelinePolicies.stream().filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
            .forEach(p -> policies.add(p));
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(localHttpLogOptions));
        HttpPipeline httpPipeline = new HttpPipelineBuilder().policies(policies.toArray(new HttpPipelinePolicy[0]))
            .httpClient(httpClient).clientOptions(localClientOptions).build();
        return httpPipeline;
    }

    /**
     * Builds an instance of TextTranslationAsyncClient class.
     *
     * @return an instance of TextTranslationAsyncClient.
     */
    @Generated
    public TextTranslationAsyncClient buildAsyncClient() {
        return new TextTranslationAsyncClient(buildInnerClient());
    }

    /**
     * Builds an instance of TextTranslationClient class.
     *
     * @return an instance of TextTranslationClient.
     */
    @Generated
    public TextTranslationClient buildClient() {
        return new TextTranslationClient(buildInnerClient());
    }

    private static final ClientLogger LOGGER = new ClientLogger(TextTranslationClientBuilder.class);
}
