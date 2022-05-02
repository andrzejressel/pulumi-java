// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.msk.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterCloudWatchLogs {
    private final Boolean enabled;
    private final @Nullable String logGroup;

    @CustomType.Constructor
    private ClusterCloudWatchLogs(
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("logGroup") @Nullable String logGroup) {
        this.enabled = enabled;
        this.logGroup = logGroup;
    }

    public Boolean enabled() {
        return this.enabled;
    }
    public Optional<String> logGroup() {
        return Optional.ofNullable(this.logGroup);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCloudWatchLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private @Nullable String logGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCloudWatchLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logGroup = defaults.logGroup;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder logGroup(@Nullable String logGroup) {
            this.logGroup = logGroup;
            return this;
        }        public ClusterCloudWatchLogs build() {
            return new ClusterCloudWatchLogs(enabled, logGroup);
        }
    }
}
