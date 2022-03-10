// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MobilityServiceUpdateResponse {
    /**
     * The OS type.
     * 
     */
    private final @Nullable String osType;
    /**
     * The reboot status of the update - whether it is required or not.
     * 
     */
    private final @Nullable String rebootStatus;
    /**
     * The version of the latest update.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor
    private MobilityServiceUpdateResponse(
        @OutputCustomType.Parameter("osType") @Nullable String osType,
        @OutputCustomType.Parameter("rebootStatus") @Nullable String rebootStatus,
        @OutputCustomType.Parameter("version") @Nullable String version) {
        this.osType = osType;
        this.rebootStatus = rebootStatus;
        this.version = version;
    }

    /**
     * The OS type.
     * 
    */
    public Optional<String> getOsType() {
        return Optional.ofNullable(this.osType);
    }
    /**
     * The reboot status of the update - whether it is required or not.
     * 
    */
    public Optional<String> getRebootStatus() {
        return Optional.ofNullable(this.rebootStatus);
    }
    /**
     * The version of the latest update.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MobilityServiceUpdateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String osType;
        private @Nullable String rebootStatus;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(MobilityServiceUpdateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osType = defaults.osType;
    	      this.rebootStatus = defaults.rebootStatus;
    	      this.version = defaults.version;
        }

        public Builder setOsType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public Builder setRebootStatus(@Nullable String rebootStatus) {
            this.rebootStatus = rebootStatus;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public MobilityServiceUpdateResponse build() {
            return new MobilityServiceUpdateResponse(osType, rebootStatus, version);
        }
    }
}
