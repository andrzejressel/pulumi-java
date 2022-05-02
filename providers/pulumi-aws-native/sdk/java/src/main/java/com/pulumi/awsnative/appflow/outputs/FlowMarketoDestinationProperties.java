// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.outputs;

import com.pulumi.awsnative.appflow.outputs.FlowErrorHandlingConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowMarketoDestinationProperties {
    private final @Nullable FlowErrorHandlingConfig errorHandlingConfig;
    private final String object;

    @CustomType.Constructor
    private FlowMarketoDestinationProperties(
        @CustomType.Parameter("errorHandlingConfig") @Nullable FlowErrorHandlingConfig errorHandlingConfig,
        @CustomType.Parameter("object") String object) {
        this.errorHandlingConfig = errorHandlingConfig;
        this.object = object;
    }

    public Optional<FlowErrorHandlingConfig> errorHandlingConfig() {
        return Optional.ofNullable(this.errorHandlingConfig);
    }
    public String object() {
        return this.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowMarketoDestinationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowErrorHandlingConfig errorHandlingConfig;
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowMarketoDestinationProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorHandlingConfig = defaults.errorHandlingConfig;
    	      this.object = defaults.object;
        }

        public Builder errorHandlingConfig(@Nullable FlowErrorHandlingConfig errorHandlingConfig) {
            this.errorHandlingConfig = errorHandlingConfig;
            return this;
        }
        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }        public FlowMarketoDestinationProperties build() {
            return new FlowMarketoDestinationProperties(errorHandlingConfig, object);
        }
    }
}
