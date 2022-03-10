// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IntegrationServiceEnvironmentAccessEndpointResponse {
    /**
     * The access endpoint type.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor
    private IntegrationServiceEnvironmentAccessEndpointResponse(@OutputCustomType.Parameter("type") @Nullable String type) {
        this.type = type;
    }

    /**
     * The access endpoint type.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationServiceEnvironmentAccessEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationServiceEnvironmentAccessEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public IntegrationServiceEnvironmentAccessEndpointResponse build() {
            return new IntegrationServiceEnvironmentAccessEndpointResponse(type);
        }
    }
}
