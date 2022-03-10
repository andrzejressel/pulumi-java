// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VolumeBackupsResponse {
    /**
     * Total count of backups for volume
     * 
     */
    private final @Nullable Integer backupsCount;
    /**
     * Policy enabled
     * 
     */
    private final @Nullable Boolean policyEnabled;
    /**
     * Volume name
     * 
     */
    private final @Nullable String volumeName;

    @OutputCustomType.Constructor
    private VolumeBackupsResponse(
        @OutputCustomType.Parameter("backupsCount") @Nullable Integer backupsCount,
        @OutputCustomType.Parameter("policyEnabled") @Nullable Boolean policyEnabled,
        @OutputCustomType.Parameter("volumeName") @Nullable String volumeName) {
        this.backupsCount = backupsCount;
        this.policyEnabled = policyEnabled;
        this.volumeName = volumeName;
    }

    /**
     * Total count of backups for volume
     * 
    */
    public Optional<Integer> getBackupsCount() {
        return Optional.ofNullable(this.backupsCount);
    }
    /**
     * Policy enabled
     * 
    */
    public Optional<Boolean> getPolicyEnabled() {
        return Optional.ofNullable(this.policyEnabled);
    }
    /**
     * Volume name
     * 
    */
    public Optional<String> getVolumeName() {
        return Optional.ofNullable(this.volumeName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeBackupsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer backupsCount;
        private @Nullable Boolean policyEnabled;
        private @Nullable String volumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeBackupsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupsCount = defaults.backupsCount;
    	      this.policyEnabled = defaults.policyEnabled;
    	      this.volumeName = defaults.volumeName;
        }

        public Builder setBackupsCount(@Nullable Integer backupsCount) {
            this.backupsCount = backupsCount;
            return this;
        }

        public Builder setPolicyEnabled(@Nullable Boolean policyEnabled) {
            this.policyEnabled = policyEnabled;
            return this;
        }

        public Builder setVolumeName(@Nullable String volumeName) {
            this.volumeName = volumeName;
            return this;
        }
        public VolumeBackupsResponse build() {
            return new VolumeBackupsResponse(backupsCount, policyEnabled, volumeName);
        }
    }
}
