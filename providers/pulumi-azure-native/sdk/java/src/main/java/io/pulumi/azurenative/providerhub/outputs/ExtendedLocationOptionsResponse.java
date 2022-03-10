// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExtendedLocationOptionsResponse {
    private final @Nullable String supportedPolicy;
    private final @Nullable String type;

    @OutputCustomType.Constructor
    private ExtendedLocationOptionsResponse(
        @OutputCustomType.Parameter("supportedPolicy") @Nullable String supportedPolicy,
        @OutputCustomType.Parameter("type") @Nullable String type) {
        this.supportedPolicy = supportedPolicy;
        this.type = type;
    }

    public Optional<String> getSupportedPolicy() {
        return Optional.ofNullable(this.supportedPolicy);
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtendedLocationOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String supportedPolicy;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtendedLocationOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.supportedPolicy = defaults.supportedPolicy;
    	      this.type = defaults.type;
        }

        public Builder setSupportedPolicy(@Nullable String supportedPolicy) {
            this.supportedPolicy = supportedPolicy;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ExtendedLocationOptionsResponse build() {
            return new ExtendedLocationOptionsResponse(supportedPolicy, type);
        }
    }
}
