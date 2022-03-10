// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datadog.outputs;

import io.pulumi.azurenative.datadog.outputs.DatadogInstallMethodResponse;
import io.pulumi.azurenative.datadog.outputs.DatadogLogsAgentResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatadogHostMetadataResponse {
    /**
     * The agent version.
     * 
     */
    private final @Nullable String agentVersion;
    private final @Nullable DatadogInstallMethodResponse installMethod;
    private final @Nullable DatadogLogsAgentResponse logsAgent;

    @OutputCustomType.Constructor
    private DatadogHostMetadataResponse(
        @OutputCustomType.Parameter("agentVersion") @Nullable String agentVersion,
        @OutputCustomType.Parameter("installMethod") @Nullable DatadogInstallMethodResponse installMethod,
        @OutputCustomType.Parameter("logsAgent") @Nullable DatadogLogsAgentResponse logsAgent) {
        this.agentVersion = agentVersion;
        this.installMethod = installMethod;
        this.logsAgent = logsAgent;
    }

    /**
     * The agent version.
     * 
    */
    public Optional<String> getAgentVersion() {
        return Optional.ofNullable(this.agentVersion);
    }
    public Optional<DatadogInstallMethodResponse> getInstallMethod() {
        return Optional.ofNullable(this.installMethod);
    }
    public Optional<DatadogLogsAgentResponse> getLogsAgent() {
        return Optional.ofNullable(this.logsAgent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatadogHostMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agentVersion;
        private @Nullable DatadogInstallMethodResponse installMethod;
        private @Nullable DatadogLogsAgentResponse logsAgent;

        public Builder() {
    	      // Empty
        }

        public Builder(DatadogHostMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentVersion = defaults.agentVersion;
    	      this.installMethod = defaults.installMethod;
    	      this.logsAgent = defaults.logsAgent;
        }

        public Builder setAgentVersion(@Nullable String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }

        public Builder setInstallMethod(@Nullable DatadogInstallMethodResponse installMethod) {
            this.installMethod = installMethod;
            return this;
        }

        public Builder setLogsAgent(@Nullable DatadogLogsAgentResponse logsAgent) {
            this.logsAgent = logsAgent;
            return this;
        }
        public DatadogHostMetadataResponse build() {
            return new DatadogHostMetadataResponse(agentVersion, installMethod, logsAgent);
        }
    }
}
