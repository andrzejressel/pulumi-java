// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FeatureResourceState {
    private final @Nullable Boolean hasResources;
    private final @Nullable String state;

    @OutputCustomType.Constructor({"hasResources","state"})
    private FeatureResourceState(
        @Nullable Boolean hasResources,
        @Nullable String state) {
        this.hasResources = hasResources;
        this.state = state;
    }

    public Optional<Boolean> getHasResources() {
        return Optional.ofNullable(this.hasResources);
    }
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureResourceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean hasResources;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureResourceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hasResources = defaults.hasResources;
    	      this.state = defaults.state;
        }

        public Builder setHasResources(@Nullable Boolean hasResources) {
            this.hasResources = hasResources;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public FeatureResourceState build() {
            return new FeatureResourceState(hasResources, state);
        }
    }
}
