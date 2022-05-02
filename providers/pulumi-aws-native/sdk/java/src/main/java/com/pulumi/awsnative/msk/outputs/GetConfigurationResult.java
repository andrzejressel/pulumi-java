// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.msk.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConfigurationResult {
    private final @Nullable String arn;
    private final @Nullable String description;

    @CustomType.Constructor
    private GetConfigurationResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("description") @Nullable String description) {
        this.arn = arn;
        this.description = description;
    }

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }        public GetConfigurationResult build() {
            return new GetConfigurationResult(arn, description);
        }
    }
}
