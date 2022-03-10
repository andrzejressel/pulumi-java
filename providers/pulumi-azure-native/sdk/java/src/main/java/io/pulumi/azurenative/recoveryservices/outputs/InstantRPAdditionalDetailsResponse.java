// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstantRPAdditionalDetailsResponse {
    private final @Nullable String azureBackupRGNamePrefix;
    private final @Nullable String azureBackupRGNameSuffix;

    @OutputCustomType.Constructor
    private InstantRPAdditionalDetailsResponse(
        @OutputCustomType.Parameter("azureBackupRGNamePrefix") @Nullable String azureBackupRGNamePrefix,
        @OutputCustomType.Parameter("azureBackupRGNameSuffix") @Nullable String azureBackupRGNameSuffix) {
        this.azureBackupRGNamePrefix = azureBackupRGNamePrefix;
        this.azureBackupRGNameSuffix = azureBackupRGNameSuffix;
    }

    public Optional<String> getAzureBackupRGNamePrefix() {
        return Optional.ofNullable(this.azureBackupRGNamePrefix);
    }
    public Optional<String> getAzureBackupRGNameSuffix() {
        return Optional.ofNullable(this.azureBackupRGNameSuffix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstantRPAdditionalDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String azureBackupRGNamePrefix;
        private @Nullable String azureBackupRGNameSuffix;

        public Builder() {
    	      // Empty
        }

        public Builder(InstantRPAdditionalDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBackupRGNamePrefix = defaults.azureBackupRGNamePrefix;
    	      this.azureBackupRGNameSuffix = defaults.azureBackupRGNameSuffix;
        }

        public Builder setAzureBackupRGNamePrefix(@Nullable String azureBackupRGNamePrefix) {
            this.azureBackupRGNamePrefix = azureBackupRGNamePrefix;
            return this;
        }

        public Builder setAzureBackupRGNameSuffix(@Nullable String azureBackupRGNameSuffix) {
            this.azureBackupRGNameSuffix = azureBackupRGNameSuffix;
            return this;
        }
        public InstantRPAdditionalDetailsResponse build() {
            return new InstantRPAdditionalDetailsResponse(azureBackupRGNamePrefix, azureBackupRGNameSuffix);
        }
    }
}
