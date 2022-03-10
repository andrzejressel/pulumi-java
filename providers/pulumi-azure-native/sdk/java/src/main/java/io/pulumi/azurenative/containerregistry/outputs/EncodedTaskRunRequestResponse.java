// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.AgentPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.CredentialsResponse;
import io.pulumi.azurenative.containerregistry.outputs.PlatformPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.SetValueResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EncodedTaskRunRequestResponse {
    /**
     * The machine configuration of the run agent.
     * 
     */
    private final @Nullable AgentPropertiesResponse agentConfiguration;
    /**
     * The dedicated agent pool for the run.
     * 
     */
    private final @Nullable String agentPoolName;
    /**
     * The properties that describes a set of credentials that will be used when this run is invoked.
     * 
     */
    private final @Nullable CredentialsResponse credentials;
    /**
     * Base64 encoded value of the template/definition file content.
     * 
     */
    private final String encodedTaskContent;
    /**
     * Base64 encoded value of the parameters/values file content.
     * 
     */
    private final @Nullable String encodedValuesContent;
    /**
     * The value that indicates whether archiving is enabled for the run or not.
     * 
     */
    private final @Nullable Boolean isArchiveEnabled;
    /**
     * The template that describes the repository and tag information for run log artifact.
     * 
     */
    private final @Nullable String logTemplate;
    /**
     * The platform properties against which the run has to happen.
     * 
     */
    private final PlatformPropertiesResponse platform;
    /**
     * The URL(absolute or relative) of the source context. It can be an URL to a tar or git repository.
     * If it is relative URL, the relative path should be obtained from calling listBuildSourceUploadUrl API.
     * 
     */
    private final @Nullable String sourceLocation;
    /**
     * Run timeout in seconds.
     * 
     */
    private final @Nullable Integer timeout;
    /**
     * The type of the run request.
     * Expected value is 'EncodedTaskRunRequest'.
     * 
     */
    private final String type;
    /**
     * The collection of overridable values that can be passed when running a task.
     * 
     */
    private final @Nullable List<SetValueResponse> values;

    @OutputCustomType.Constructor
    private EncodedTaskRunRequestResponse(
        @OutputCustomType.Parameter("agentConfiguration") @Nullable AgentPropertiesResponse agentConfiguration,
        @OutputCustomType.Parameter("agentPoolName") @Nullable String agentPoolName,
        @OutputCustomType.Parameter("credentials") @Nullable CredentialsResponse credentials,
        @OutputCustomType.Parameter("encodedTaskContent") String encodedTaskContent,
        @OutputCustomType.Parameter("encodedValuesContent") @Nullable String encodedValuesContent,
        @OutputCustomType.Parameter("isArchiveEnabled") @Nullable Boolean isArchiveEnabled,
        @OutputCustomType.Parameter("logTemplate") @Nullable String logTemplate,
        @OutputCustomType.Parameter("platform") PlatformPropertiesResponse platform,
        @OutputCustomType.Parameter("sourceLocation") @Nullable String sourceLocation,
        @OutputCustomType.Parameter("timeout") @Nullable Integer timeout,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("values") @Nullable List<SetValueResponse> values) {
        this.agentConfiguration = agentConfiguration;
        this.agentPoolName = agentPoolName;
        this.credentials = credentials;
        this.encodedTaskContent = encodedTaskContent;
        this.encodedValuesContent = encodedValuesContent;
        this.isArchiveEnabled = isArchiveEnabled;
        this.logTemplate = logTemplate;
        this.platform = platform;
        this.sourceLocation = sourceLocation;
        this.timeout = timeout;
        this.type = type;
        this.values = values;
    }

    /**
     * The machine configuration of the run agent.
     * 
    */
    public Optional<AgentPropertiesResponse> getAgentConfiguration() {
        return Optional.ofNullable(this.agentConfiguration);
    }
    /**
     * The dedicated agent pool for the run.
     * 
    */
    public Optional<String> getAgentPoolName() {
        return Optional.ofNullable(this.agentPoolName);
    }
    /**
     * The properties that describes a set of credentials that will be used when this run is invoked.
     * 
    */
    public Optional<CredentialsResponse> getCredentials() {
        return Optional.ofNullable(this.credentials);
    }
    /**
     * Base64 encoded value of the template/definition file content.
     * 
    */
    public String getEncodedTaskContent() {
        return this.encodedTaskContent;
    }
    /**
     * Base64 encoded value of the parameters/values file content.
     * 
    */
    public Optional<String> getEncodedValuesContent() {
        return Optional.ofNullable(this.encodedValuesContent);
    }
    /**
     * The value that indicates whether archiving is enabled for the run or not.
     * 
    */
    public Optional<Boolean> getIsArchiveEnabled() {
        return Optional.ofNullable(this.isArchiveEnabled);
    }
    /**
     * The template that describes the repository and tag information for run log artifact.
     * 
    */
    public Optional<String> getLogTemplate() {
        return Optional.ofNullable(this.logTemplate);
    }
    /**
     * The platform properties against which the run has to happen.
     * 
    */
    public PlatformPropertiesResponse getPlatform() {
        return this.platform;
    }
    /**
     * The URL(absolute or relative) of the source context. It can be an URL to a tar or git repository.
     * If it is relative URL, the relative path should be obtained from calling listBuildSourceUploadUrl API.
     * 
    */
    public Optional<String> getSourceLocation() {
        return Optional.ofNullable(this.sourceLocation);
    }
    /**
     * Run timeout in seconds.
     * 
    */
    public Optional<Integer> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * The type of the run request.
     * Expected value is 'EncodedTaskRunRequest'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The collection of overridable values that can be passed when running a task.
     * 
    */
    public List<SetValueResponse> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncodedTaskRunRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AgentPropertiesResponse agentConfiguration;
        private @Nullable String agentPoolName;
        private @Nullable CredentialsResponse credentials;
        private String encodedTaskContent;
        private @Nullable String encodedValuesContent;
        private @Nullable Boolean isArchiveEnabled;
        private @Nullable String logTemplate;
        private PlatformPropertiesResponse platform;
        private @Nullable String sourceLocation;
        private @Nullable Integer timeout;
        private String type;
        private @Nullable List<SetValueResponse> values;

        public Builder() {
    	      // Empty
        }

        public Builder(EncodedTaskRunRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentConfiguration = defaults.agentConfiguration;
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.credentials = defaults.credentials;
    	      this.encodedTaskContent = defaults.encodedTaskContent;
    	      this.encodedValuesContent = defaults.encodedValuesContent;
    	      this.isArchiveEnabled = defaults.isArchiveEnabled;
    	      this.logTemplate = defaults.logTemplate;
    	      this.platform = defaults.platform;
    	      this.sourceLocation = defaults.sourceLocation;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.values = defaults.values;
        }

        public Builder setAgentConfiguration(@Nullable AgentPropertiesResponse agentConfiguration) {
            this.agentConfiguration = agentConfiguration;
            return this;
        }

        public Builder setAgentPoolName(@Nullable String agentPoolName) {
            this.agentPoolName = agentPoolName;
            return this;
        }

        public Builder setCredentials(@Nullable CredentialsResponse credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setEncodedTaskContent(String encodedTaskContent) {
            this.encodedTaskContent = Objects.requireNonNull(encodedTaskContent);
            return this;
        }

        public Builder setEncodedValuesContent(@Nullable String encodedValuesContent) {
            this.encodedValuesContent = encodedValuesContent;
            return this;
        }

        public Builder setIsArchiveEnabled(@Nullable Boolean isArchiveEnabled) {
            this.isArchiveEnabled = isArchiveEnabled;
            return this;
        }

        public Builder setLogTemplate(@Nullable String logTemplate) {
            this.logTemplate = logTemplate;
            return this;
        }

        public Builder setPlatform(PlatformPropertiesResponse platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }

        public Builder setSourceLocation(@Nullable String sourceLocation) {
            this.sourceLocation = sourceLocation;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValues(@Nullable List<SetValueResponse> values) {
            this.values = values;
            return this;
        }
        public EncodedTaskRunRequestResponse build() {
            return new EncodedTaskRunRequestResponse(agentConfiguration, agentPoolName, credentials, encodedTaskContent, encodedValuesContent, isArchiveEnabled, logTemplate, platform, sourceLocation, timeout, type, values);
        }
    }
}
