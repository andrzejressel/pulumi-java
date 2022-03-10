// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CognitiveServicesAccountApiPropertiesResponse {
    /**
     * (Metrics Advisor Only) The Azure AD Client Id (Application Id).
     * 
     */
    private final @Nullable String aadClientId;
    /**
     * (Metrics Advisor Only) The Azure AD Tenant Id.
     * 
     */
    private final @Nullable String aadTenantId;
    /**
     * (Personalization Only) The flag to enable statistics of Bing Search.
     * 
     */
    private final @Nullable String eventHubConnectionString;
    /**
     * (QnAMaker Only) The Azure Search endpoint id of QnAMaker.
     * 
     */
    private final @Nullable String qnaAzureSearchEndpointId;
    /**
     * (QnAMaker Only) The Azure Search endpoint key of QnAMaker.
     * 
     */
    private final @Nullable String qnaAzureSearchEndpointKey;
    /**
     * (QnAMaker Only) The runtime endpoint of QnAMaker.
     * 
     */
    private final @Nullable String qnaRuntimeEndpoint;
    /**
     * (Bing Search Only) The flag to enable statistics of Bing Search.
     * 
     */
    private final @Nullable Boolean statisticsEnabled;
    /**
     * (Personalization Only) The storage account connection string.
     * 
     */
    private final @Nullable String storageAccountConnectionString;
    /**
     * (Metrics Advisor Only) The super user of Metrics Advisor.
     * 
     */
    private final @Nullable String superUser;
    /**
     * (Metrics Advisor Only) The website name of Metrics Advisor.
     * 
     */
    private final @Nullable String websiteName;

    @OutputCustomType.Constructor
    private CognitiveServicesAccountApiPropertiesResponse(
        @OutputCustomType.Parameter("aadClientId") @Nullable String aadClientId,
        @OutputCustomType.Parameter("aadTenantId") @Nullable String aadTenantId,
        @OutputCustomType.Parameter("eventHubConnectionString") @Nullable String eventHubConnectionString,
        @OutputCustomType.Parameter("qnaAzureSearchEndpointId") @Nullable String qnaAzureSearchEndpointId,
        @OutputCustomType.Parameter("qnaAzureSearchEndpointKey") @Nullable String qnaAzureSearchEndpointKey,
        @OutputCustomType.Parameter("qnaRuntimeEndpoint") @Nullable String qnaRuntimeEndpoint,
        @OutputCustomType.Parameter("statisticsEnabled") @Nullable Boolean statisticsEnabled,
        @OutputCustomType.Parameter("storageAccountConnectionString") @Nullable String storageAccountConnectionString,
        @OutputCustomType.Parameter("superUser") @Nullable String superUser,
        @OutputCustomType.Parameter("websiteName") @Nullable String websiteName) {
        this.aadClientId = aadClientId;
        this.aadTenantId = aadTenantId;
        this.eventHubConnectionString = eventHubConnectionString;
        this.qnaAzureSearchEndpointId = qnaAzureSearchEndpointId;
        this.qnaAzureSearchEndpointKey = qnaAzureSearchEndpointKey;
        this.qnaRuntimeEndpoint = qnaRuntimeEndpoint;
        this.statisticsEnabled = statisticsEnabled;
        this.storageAccountConnectionString = storageAccountConnectionString;
        this.superUser = superUser;
        this.websiteName = websiteName;
    }

    /**
     * (Metrics Advisor Only) The Azure AD Client Id (Application Id).
     * 
    */
    public Optional<String> getAadClientId() {
        return Optional.ofNullable(this.aadClientId);
    }
    /**
     * (Metrics Advisor Only) The Azure AD Tenant Id.
     * 
    */
    public Optional<String> getAadTenantId() {
        return Optional.ofNullable(this.aadTenantId);
    }
    /**
     * (Personalization Only) The flag to enable statistics of Bing Search.
     * 
    */
    public Optional<String> getEventHubConnectionString() {
        return Optional.ofNullable(this.eventHubConnectionString);
    }
    /**
     * (QnAMaker Only) The Azure Search endpoint id of QnAMaker.
     * 
    */
    public Optional<String> getQnaAzureSearchEndpointId() {
        return Optional.ofNullable(this.qnaAzureSearchEndpointId);
    }
    /**
     * (QnAMaker Only) The Azure Search endpoint key of QnAMaker.
     * 
    */
    public Optional<String> getQnaAzureSearchEndpointKey() {
        return Optional.ofNullable(this.qnaAzureSearchEndpointKey);
    }
    /**
     * (QnAMaker Only) The runtime endpoint of QnAMaker.
     * 
    */
    public Optional<String> getQnaRuntimeEndpoint() {
        return Optional.ofNullable(this.qnaRuntimeEndpoint);
    }
    /**
     * (Bing Search Only) The flag to enable statistics of Bing Search.
     * 
    */
    public Optional<Boolean> getStatisticsEnabled() {
        return Optional.ofNullable(this.statisticsEnabled);
    }
    /**
     * (Personalization Only) The storage account connection string.
     * 
    */
    public Optional<String> getStorageAccountConnectionString() {
        return Optional.ofNullable(this.storageAccountConnectionString);
    }
    /**
     * (Metrics Advisor Only) The super user of Metrics Advisor.
     * 
    */
    public Optional<String> getSuperUser() {
        return Optional.ofNullable(this.superUser);
    }
    /**
     * (Metrics Advisor Only) The website name of Metrics Advisor.
     * 
    */
    public Optional<String> getWebsiteName() {
        return Optional.ofNullable(this.websiteName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CognitiveServicesAccountApiPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aadClientId;
        private @Nullable String aadTenantId;
        private @Nullable String eventHubConnectionString;
        private @Nullable String qnaAzureSearchEndpointId;
        private @Nullable String qnaAzureSearchEndpointKey;
        private @Nullable String qnaRuntimeEndpoint;
        private @Nullable Boolean statisticsEnabled;
        private @Nullable String storageAccountConnectionString;
        private @Nullable String superUser;
        private @Nullable String websiteName;

        public Builder() {
    	      // Empty
        }

        public Builder(CognitiveServicesAccountApiPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadClientId = defaults.aadClientId;
    	      this.aadTenantId = defaults.aadTenantId;
    	      this.eventHubConnectionString = defaults.eventHubConnectionString;
    	      this.qnaAzureSearchEndpointId = defaults.qnaAzureSearchEndpointId;
    	      this.qnaAzureSearchEndpointKey = defaults.qnaAzureSearchEndpointKey;
    	      this.qnaRuntimeEndpoint = defaults.qnaRuntimeEndpoint;
    	      this.statisticsEnabled = defaults.statisticsEnabled;
    	      this.storageAccountConnectionString = defaults.storageAccountConnectionString;
    	      this.superUser = defaults.superUser;
    	      this.websiteName = defaults.websiteName;
        }

        public Builder setAadClientId(@Nullable String aadClientId) {
            this.aadClientId = aadClientId;
            return this;
        }

        public Builder setAadTenantId(@Nullable String aadTenantId) {
            this.aadTenantId = aadTenantId;
            return this;
        }

        public Builder setEventHubConnectionString(@Nullable String eventHubConnectionString) {
            this.eventHubConnectionString = eventHubConnectionString;
            return this;
        }

        public Builder setQnaAzureSearchEndpointId(@Nullable String qnaAzureSearchEndpointId) {
            this.qnaAzureSearchEndpointId = qnaAzureSearchEndpointId;
            return this;
        }

        public Builder setQnaAzureSearchEndpointKey(@Nullable String qnaAzureSearchEndpointKey) {
            this.qnaAzureSearchEndpointKey = qnaAzureSearchEndpointKey;
            return this;
        }

        public Builder setQnaRuntimeEndpoint(@Nullable String qnaRuntimeEndpoint) {
            this.qnaRuntimeEndpoint = qnaRuntimeEndpoint;
            return this;
        }

        public Builder setStatisticsEnabled(@Nullable Boolean statisticsEnabled) {
            this.statisticsEnabled = statisticsEnabled;
            return this;
        }

        public Builder setStorageAccountConnectionString(@Nullable String storageAccountConnectionString) {
            this.storageAccountConnectionString = storageAccountConnectionString;
            return this;
        }

        public Builder setSuperUser(@Nullable String superUser) {
            this.superUser = superUser;
            return this;
        }

        public Builder setWebsiteName(@Nullable String websiteName) {
            this.websiteName = websiteName;
            return this;
        }
        public CognitiveServicesAccountApiPropertiesResponse build() {
            return new CognitiveServicesAccountApiPropertiesResponse(aadClientId, aadTenantId, eventHubConnectionString, qnaAzureSearchEndpointId, qnaAzureSearchEndpointKey, qnaRuntimeEndpoint, statisticsEnabled, storageAccountConnectionString, superUser, websiteName);
        }
    }
}
