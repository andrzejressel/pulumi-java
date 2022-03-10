// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BotPropertiesResponse {
    /**
     * Contains resource all settings defined as key/value pairs.
     * 
     */
    private final @Nullable Map<String,String> allSettings;
    /**
     * The hint (e.g. keyVault secret resourceId) on how to fetch the app secret
     * 
     */
    private final @Nullable String appPasswordHint;
    /**
     * The CMK encryption status
     * 
     */
    private final String cmekEncryptionStatus;
    /**
     * The CMK Url
     * 
     */
    private final @Nullable String cmekKeyVaultUrl;
    /**
     * Collection of channels for which the bot is configured
     * 
     */
    private final List<String> configuredChannels;
    /**
     * The description of the bot
     * 
     */
    private final @Nullable String description;
    /**
     * The Application Insights key
     * 
     */
    private final @Nullable String developerAppInsightKey;
    /**
     * The Application Insights Api Key
     * 
     */
    private final @Nullable String developerAppInsightsApiKey;
    /**
     * The Application Insights App Id
     * 
     */
    private final @Nullable String developerAppInsightsApplicationId;
    /**
     * Opt-out of local authentication and ensure only MSI and AAD can be used exclusively for authentication.
     * 
     */
    private final @Nullable Boolean disableLocalAuth;
    /**
     * The Name of the bot
     * 
     */
    private final String displayName;
    /**
     * Collection of channels for which the bot is enabled
     * 
     */
    private final List<String> enabledChannels;
    /**
     * The bot's endpoint
     * 
     */
    private final String endpoint;
    /**
     * The bot's endpoint version
     * 
     */
    private final String endpointVersion;
    /**
     * The Icon Url of the bot
     * 
     */
    private final @Nullable String iconUrl;
    /**
     * Whether Cmek is enabled
     * 
     */
    private final @Nullable Boolean isCmekEnabled;
    /**
     * Whether the bot is developerAppInsightsApiKey set
     * 
     */
    private final Boolean isDeveloperAppInsightsApiKeySet;
    /**
     * Whether the bot is streaming supported
     * 
     */
    private final @Nullable Boolean isStreamingSupported;
    /**
     * Collection of LUIS App Ids
     * 
     */
    private final @Nullable List<String> luisAppIds;
    /**
     * The LUIS Key
     * 
     */
    private final @Nullable String luisKey;
    /**
     * The bot's manifest url
     * 
     */
    private final @Nullable String manifestUrl;
    /**
     * Token used to migrate non Azure bot to azure subscription
     * 
     */
    private final String migrationToken;
    /**
     * Microsoft App Id for the bot
     * 
     */
    private final String msaAppId;
    /**
     * Microsoft App Managed Identity Resource Id for the bot
     * 
     */
    private final @Nullable String msaAppMSIResourceId;
    /**
     * Microsoft App Tenant Id for the bot
     * 
     */
    private final @Nullable String msaAppTenantId;
    /**
     * Microsoft App Type for the bot
     * 
     */
    private final @Nullable String msaAppType;
    /**
     * The hint to browser (e.g. protocol handler) on how to open the bot for authoring
     * 
     */
    private final @Nullable String openWithHint;
    /**
     * Contains resource parameters defined as key/value pairs.
     * 
     */
    private final @Nullable Map<String,String> parameters;
    /**
     * Provisioning state of the resource
     * 
     */
    private final String provisioningState;
    /**
     * Whether the bot is in an isolated network
     * 
     */
    private final @Nullable String publicNetworkAccess;
    /**
     * Publishing credentials of the resource
     * 
     */
    private final @Nullable String publishingCredentials;
    /**
     * The channel schema transformation version for the bot
     * 
     */
    private final @Nullable String schemaTransformationVersion;
    /**
     * The storage resourceId for the bot
     * 
     */
    private final @Nullable String storageResourceId;

    @OutputCustomType.Constructor
    private BotPropertiesResponse(
        @OutputCustomType.Parameter("allSettings") @Nullable Map<String,String> allSettings,
        @OutputCustomType.Parameter("appPasswordHint") @Nullable String appPasswordHint,
        @OutputCustomType.Parameter("cmekEncryptionStatus") String cmekEncryptionStatus,
        @OutputCustomType.Parameter("cmekKeyVaultUrl") @Nullable String cmekKeyVaultUrl,
        @OutputCustomType.Parameter("configuredChannels") List<String> configuredChannels,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("developerAppInsightKey") @Nullable String developerAppInsightKey,
        @OutputCustomType.Parameter("developerAppInsightsApiKey") @Nullable String developerAppInsightsApiKey,
        @OutputCustomType.Parameter("developerAppInsightsApplicationId") @Nullable String developerAppInsightsApplicationId,
        @OutputCustomType.Parameter("disableLocalAuth") @Nullable Boolean disableLocalAuth,
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("enabledChannels") List<String> enabledChannels,
        @OutputCustomType.Parameter("endpoint") String endpoint,
        @OutputCustomType.Parameter("endpointVersion") String endpointVersion,
        @OutputCustomType.Parameter("iconUrl") @Nullable String iconUrl,
        @OutputCustomType.Parameter("isCmekEnabled") @Nullable Boolean isCmekEnabled,
        @OutputCustomType.Parameter("isDeveloperAppInsightsApiKeySet") Boolean isDeveloperAppInsightsApiKeySet,
        @OutputCustomType.Parameter("isStreamingSupported") @Nullable Boolean isStreamingSupported,
        @OutputCustomType.Parameter("luisAppIds") @Nullable List<String> luisAppIds,
        @OutputCustomType.Parameter("luisKey") @Nullable String luisKey,
        @OutputCustomType.Parameter("manifestUrl") @Nullable String manifestUrl,
        @OutputCustomType.Parameter("migrationToken") String migrationToken,
        @OutputCustomType.Parameter("msaAppId") String msaAppId,
        @OutputCustomType.Parameter("msaAppMSIResourceId") @Nullable String msaAppMSIResourceId,
        @OutputCustomType.Parameter("msaAppTenantId") @Nullable String msaAppTenantId,
        @OutputCustomType.Parameter("msaAppType") @Nullable String msaAppType,
        @OutputCustomType.Parameter("openWithHint") @Nullable String openWithHint,
        @OutputCustomType.Parameter("parameters") @Nullable Map<String,String> parameters,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("publicNetworkAccess") @Nullable String publicNetworkAccess,
        @OutputCustomType.Parameter("publishingCredentials") @Nullable String publishingCredentials,
        @OutputCustomType.Parameter("schemaTransformationVersion") @Nullable String schemaTransformationVersion,
        @OutputCustomType.Parameter("storageResourceId") @Nullable String storageResourceId) {
        this.allSettings = allSettings;
        this.appPasswordHint = appPasswordHint;
        this.cmekEncryptionStatus = cmekEncryptionStatus;
        this.cmekKeyVaultUrl = cmekKeyVaultUrl;
        this.configuredChannels = configuredChannels;
        this.description = description;
        this.developerAppInsightKey = developerAppInsightKey;
        this.developerAppInsightsApiKey = developerAppInsightsApiKey;
        this.developerAppInsightsApplicationId = developerAppInsightsApplicationId;
        this.disableLocalAuth = disableLocalAuth;
        this.displayName = displayName;
        this.enabledChannels = enabledChannels;
        this.endpoint = endpoint;
        this.endpointVersion = endpointVersion;
        this.iconUrl = iconUrl;
        this.isCmekEnabled = isCmekEnabled;
        this.isDeveloperAppInsightsApiKeySet = isDeveloperAppInsightsApiKeySet;
        this.isStreamingSupported = isStreamingSupported;
        this.luisAppIds = luisAppIds;
        this.luisKey = luisKey;
        this.manifestUrl = manifestUrl;
        this.migrationToken = migrationToken;
        this.msaAppId = msaAppId;
        this.msaAppMSIResourceId = msaAppMSIResourceId;
        this.msaAppTenantId = msaAppTenantId;
        this.msaAppType = msaAppType;
        this.openWithHint = openWithHint;
        this.parameters = parameters;
        this.provisioningState = provisioningState;
        this.publicNetworkAccess = publicNetworkAccess;
        this.publishingCredentials = publishingCredentials;
        this.schemaTransformationVersion = schemaTransformationVersion;
        this.storageResourceId = storageResourceId;
    }

    /**
     * Contains resource all settings defined as key/value pairs.
     * 
    */
    public Map<String,String> getAllSettings() {
        return this.allSettings == null ? Map.of() : this.allSettings;
    }
    /**
     * The hint (e.g. keyVault secret resourceId) on how to fetch the app secret
     * 
    */
    public Optional<String> getAppPasswordHint() {
        return Optional.ofNullable(this.appPasswordHint);
    }
    /**
     * The CMK encryption status
     * 
    */
    public String getCmekEncryptionStatus() {
        return this.cmekEncryptionStatus;
    }
    /**
     * The CMK Url
     * 
    */
    public Optional<String> getCmekKeyVaultUrl() {
        return Optional.ofNullable(this.cmekKeyVaultUrl);
    }
    /**
     * Collection of channels for which the bot is configured
     * 
    */
    public List<String> getConfiguredChannels() {
        return this.configuredChannels;
    }
    /**
     * The description of the bot
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The Application Insights key
     * 
    */
    public Optional<String> getDeveloperAppInsightKey() {
        return Optional.ofNullable(this.developerAppInsightKey);
    }
    /**
     * The Application Insights Api Key
     * 
    */
    public Optional<String> getDeveloperAppInsightsApiKey() {
        return Optional.ofNullable(this.developerAppInsightsApiKey);
    }
    /**
     * The Application Insights App Id
     * 
    */
    public Optional<String> getDeveloperAppInsightsApplicationId() {
        return Optional.ofNullable(this.developerAppInsightsApplicationId);
    }
    /**
     * Opt-out of local authentication and ensure only MSI and AAD can be used exclusively for authentication.
     * 
    */
    public Optional<Boolean> getDisableLocalAuth() {
        return Optional.ofNullable(this.disableLocalAuth);
    }
    /**
     * The Name of the bot
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Collection of channels for which the bot is enabled
     * 
    */
    public List<String> getEnabledChannels() {
        return this.enabledChannels;
    }
    /**
     * The bot's endpoint
     * 
    */
    public String getEndpoint() {
        return this.endpoint;
    }
    /**
     * The bot's endpoint version
     * 
    */
    public String getEndpointVersion() {
        return this.endpointVersion;
    }
    /**
     * The Icon Url of the bot
     * 
    */
    public Optional<String> getIconUrl() {
        return Optional.ofNullable(this.iconUrl);
    }
    /**
     * Whether Cmek is enabled
     * 
    */
    public Optional<Boolean> getIsCmekEnabled() {
        return Optional.ofNullable(this.isCmekEnabled);
    }
    /**
     * Whether the bot is developerAppInsightsApiKey set
     * 
    */
    public Boolean getIsDeveloperAppInsightsApiKeySet() {
        return this.isDeveloperAppInsightsApiKeySet;
    }
    /**
     * Whether the bot is streaming supported
     * 
    */
    public Optional<Boolean> getIsStreamingSupported() {
        return Optional.ofNullable(this.isStreamingSupported);
    }
    /**
     * Collection of LUIS App Ids
     * 
    */
    public List<String> getLuisAppIds() {
        return this.luisAppIds == null ? List.of() : this.luisAppIds;
    }
    /**
     * The LUIS Key
     * 
    */
    public Optional<String> getLuisKey() {
        return Optional.ofNullable(this.luisKey);
    }
    /**
     * The bot's manifest url
     * 
    */
    public Optional<String> getManifestUrl() {
        return Optional.ofNullable(this.manifestUrl);
    }
    /**
     * Token used to migrate non Azure bot to azure subscription
     * 
    */
    public String getMigrationToken() {
        return this.migrationToken;
    }
    /**
     * Microsoft App Id for the bot
     * 
    */
    public String getMsaAppId() {
        return this.msaAppId;
    }
    /**
     * Microsoft App Managed Identity Resource Id for the bot
     * 
    */
    public Optional<String> getMsaAppMSIResourceId() {
        return Optional.ofNullable(this.msaAppMSIResourceId);
    }
    /**
     * Microsoft App Tenant Id for the bot
     * 
    */
    public Optional<String> getMsaAppTenantId() {
        return Optional.ofNullable(this.msaAppTenantId);
    }
    /**
     * Microsoft App Type for the bot
     * 
    */
    public Optional<String> getMsaAppType() {
        return Optional.ofNullable(this.msaAppType);
    }
    /**
     * The hint to browser (e.g. protocol handler) on how to open the bot for authoring
     * 
    */
    public Optional<String> getOpenWithHint() {
        return Optional.ofNullable(this.openWithHint);
    }
    /**
     * Contains resource parameters defined as key/value pairs.
     * 
    */
    public Map<String,String> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Provisioning state of the resource
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Whether the bot is in an isolated network
     * 
    */
    public Optional<String> getPublicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    /**
     * Publishing credentials of the resource
     * 
    */
    public Optional<String> getPublishingCredentials() {
        return Optional.ofNullable(this.publishingCredentials);
    }
    /**
     * The channel schema transformation version for the bot
     * 
    */
    public Optional<String> getSchemaTransformationVersion() {
        return Optional.ofNullable(this.schemaTransformationVersion);
    }
    /**
     * The storage resourceId for the bot
     * 
    */
    public Optional<String> getStorageResourceId() {
        return Optional.ofNullable(this.storageResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> allSettings;
        private @Nullable String appPasswordHint;
        private String cmekEncryptionStatus;
        private @Nullable String cmekKeyVaultUrl;
        private List<String> configuredChannels;
        private @Nullable String description;
        private @Nullable String developerAppInsightKey;
        private @Nullable String developerAppInsightsApiKey;
        private @Nullable String developerAppInsightsApplicationId;
        private @Nullable Boolean disableLocalAuth;
        private String displayName;
        private List<String> enabledChannels;
        private String endpoint;
        private String endpointVersion;
        private @Nullable String iconUrl;
        private @Nullable Boolean isCmekEnabled;
        private Boolean isDeveloperAppInsightsApiKeySet;
        private @Nullable Boolean isStreamingSupported;
        private @Nullable List<String> luisAppIds;
        private @Nullable String luisKey;
        private @Nullable String manifestUrl;
        private String migrationToken;
        private String msaAppId;
        private @Nullable String msaAppMSIResourceId;
        private @Nullable String msaAppTenantId;
        private @Nullable String msaAppType;
        private @Nullable String openWithHint;
        private @Nullable Map<String,String> parameters;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;
        private @Nullable String publishingCredentials;
        private @Nullable String schemaTransformationVersion;
        private @Nullable String storageResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(BotPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allSettings = defaults.allSettings;
    	      this.appPasswordHint = defaults.appPasswordHint;
    	      this.cmekEncryptionStatus = defaults.cmekEncryptionStatus;
    	      this.cmekKeyVaultUrl = defaults.cmekKeyVaultUrl;
    	      this.configuredChannels = defaults.configuredChannels;
    	      this.description = defaults.description;
    	      this.developerAppInsightKey = defaults.developerAppInsightKey;
    	      this.developerAppInsightsApiKey = defaults.developerAppInsightsApiKey;
    	      this.developerAppInsightsApplicationId = defaults.developerAppInsightsApplicationId;
    	      this.disableLocalAuth = defaults.disableLocalAuth;
    	      this.displayName = defaults.displayName;
    	      this.enabledChannels = defaults.enabledChannels;
    	      this.endpoint = defaults.endpoint;
    	      this.endpointVersion = defaults.endpointVersion;
    	      this.iconUrl = defaults.iconUrl;
    	      this.isCmekEnabled = defaults.isCmekEnabled;
    	      this.isDeveloperAppInsightsApiKeySet = defaults.isDeveloperAppInsightsApiKeySet;
    	      this.isStreamingSupported = defaults.isStreamingSupported;
    	      this.luisAppIds = defaults.luisAppIds;
    	      this.luisKey = defaults.luisKey;
    	      this.manifestUrl = defaults.manifestUrl;
    	      this.migrationToken = defaults.migrationToken;
    	      this.msaAppId = defaults.msaAppId;
    	      this.msaAppMSIResourceId = defaults.msaAppMSIResourceId;
    	      this.msaAppTenantId = defaults.msaAppTenantId;
    	      this.msaAppType = defaults.msaAppType;
    	      this.openWithHint = defaults.openWithHint;
    	      this.parameters = defaults.parameters;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.publishingCredentials = defaults.publishingCredentials;
    	      this.schemaTransformationVersion = defaults.schemaTransformationVersion;
    	      this.storageResourceId = defaults.storageResourceId;
        }

        public Builder setAllSettings(@Nullable Map<String,String> allSettings) {
            this.allSettings = allSettings;
            return this;
        }

        public Builder setAppPasswordHint(@Nullable String appPasswordHint) {
            this.appPasswordHint = appPasswordHint;
            return this;
        }

        public Builder setCmekEncryptionStatus(String cmekEncryptionStatus) {
            this.cmekEncryptionStatus = Objects.requireNonNull(cmekEncryptionStatus);
            return this;
        }

        public Builder setCmekKeyVaultUrl(@Nullable String cmekKeyVaultUrl) {
            this.cmekKeyVaultUrl = cmekKeyVaultUrl;
            return this;
        }

        public Builder setConfiguredChannels(List<String> configuredChannels) {
            this.configuredChannels = Objects.requireNonNull(configuredChannels);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDeveloperAppInsightKey(@Nullable String developerAppInsightKey) {
            this.developerAppInsightKey = developerAppInsightKey;
            return this;
        }

        public Builder setDeveloperAppInsightsApiKey(@Nullable String developerAppInsightsApiKey) {
            this.developerAppInsightsApiKey = developerAppInsightsApiKey;
            return this;
        }

        public Builder setDeveloperAppInsightsApplicationId(@Nullable String developerAppInsightsApplicationId) {
            this.developerAppInsightsApplicationId = developerAppInsightsApplicationId;
            return this;
        }

        public Builder setDisableLocalAuth(@Nullable Boolean disableLocalAuth) {
            this.disableLocalAuth = disableLocalAuth;
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setEnabledChannels(List<String> enabledChannels) {
            this.enabledChannels = Objects.requireNonNull(enabledChannels);
            return this;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setEndpointVersion(String endpointVersion) {
            this.endpointVersion = Objects.requireNonNull(endpointVersion);
            return this;
        }

        public Builder setIconUrl(@Nullable String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }

        public Builder setIsCmekEnabled(@Nullable Boolean isCmekEnabled) {
            this.isCmekEnabled = isCmekEnabled;
            return this;
        }

        public Builder setIsDeveloperAppInsightsApiKeySet(Boolean isDeveloperAppInsightsApiKeySet) {
            this.isDeveloperAppInsightsApiKeySet = Objects.requireNonNull(isDeveloperAppInsightsApiKeySet);
            return this;
        }

        public Builder setIsStreamingSupported(@Nullable Boolean isStreamingSupported) {
            this.isStreamingSupported = isStreamingSupported;
            return this;
        }

        public Builder setLuisAppIds(@Nullable List<String> luisAppIds) {
            this.luisAppIds = luisAppIds;
            return this;
        }

        public Builder setLuisKey(@Nullable String luisKey) {
            this.luisKey = luisKey;
            return this;
        }

        public Builder setManifestUrl(@Nullable String manifestUrl) {
            this.manifestUrl = manifestUrl;
            return this;
        }

        public Builder setMigrationToken(String migrationToken) {
            this.migrationToken = Objects.requireNonNull(migrationToken);
            return this;
        }

        public Builder setMsaAppId(String msaAppId) {
            this.msaAppId = Objects.requireNonNull(msaAppId);
            return this;
        }

        public Builder setMsaAppMSIResourceId(@Nullable String msaAppMSIResourceId) {
            this.msaAppMSIResourceId = msaAppMSIResourceId;
            return this;
        }

        public Builder setMsaAppTenantId(@Nullable String msaAppTenantId) {
            this.msaAppTenantId = msaAppTenantId;
            return this;
        }

        public Builder setMsaAppType(@Nullable String msaAppType) {
            this.msaAppType = msaAppType;
            return this;
        }

        public Builder setOpenWithHint(@Nullable String openWithHint) {
            this.openWithHint = openWithHint;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,String> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setPublishingCredentials(@Nullable String publishingCredentials) {
            this.publishingCredentials = publishingCredentials;
            return this;
        }

        public Builder setSchemaTransformationVersion(@Nullable String schemaTransformationVersion) {
            this.schemaTransformationVersion = schemaTransformationVersion;
            return this;
        }

        public Builder setStorageResourceId(@Nullable String storageResourceId) {
            this.storageResourceId = storageResourceId;
            return this;
        }
        public BotPropertiesResponse build() {
            return new BotPropertiesResponse(allSettings, appPasswordHint, cmekEncryptionStatus, cmekKeyVaultUrl, configuredChannels, description, developerAppInsightKey, developerAppInsightsApiKey, developerAppInsightsApplicationId, disableLocalAuth, displayName, enabledChannels, endpoint, endpointVersion, iconUrl, isCmekEnabled, isDeveloperAppInsightsApiKeySet, isStreamingSupported, luisAppIds, luisKey, manifestUrl, migrationToken, msaAppId, msaAppMSIResourceId, msaAppTenantId, msaAppType, openWithHint, parameters, provisioningState, publicNetworkAccess, publishingCredentials, schemaTransformationVersion, storageResourceId);
        }
    }
}
