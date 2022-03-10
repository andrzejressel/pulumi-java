// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DefaultRolloutSpecificationResponseLowTraffic {
    private final @Nullable List<String> regions;
    private final @Nullable String waitDuration;

    @OutputCustomType.Constructor
    private DefaultRolloutSpecificationResponseLowTraffic(
        @OutputCustomType.Parameter("regions") @Nullable List<String> regions,
        @OutputCustomType.Parameter("waitDuration") @Nullable String waitDuration) {
        this.regions = regions;
        this.waitDuration = waitDuration;
    }

    public List<String> getRegions() {
        return this.regions == null ? List.of() : this.regions;
    }
    public Optional<String> getWaitDuration() {
        return Optional.ofNullable(this.waitDuration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultRolloutSpecificationResponseLowTraffic defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> regions;
        private @Nullable String waitDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultRolloutSpecificationResponseLowTraffic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regions = defaults.regions;
    	      this.waitDuration = defaults.waitDuration;
        }

        public Builder setRegions(@Nullable List<String> regions) {
            this.regions = regions;
            return this;
        }

        public Builder setWaitDuration(@Nullable String waitDuration) {
            this.waitDuration = waitDuration;
            return this;
        }
        public DefaultRolloutSpecificationResponseLowTraffic build() {
            return new DefaultRolloutSpecificationResponseLowTraffic(regions, waitDuration);
        }
    }
}
