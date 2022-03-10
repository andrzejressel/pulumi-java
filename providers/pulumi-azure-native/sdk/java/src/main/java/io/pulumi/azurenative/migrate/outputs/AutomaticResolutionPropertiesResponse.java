// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutomaticResolutionPropertiesResponse {
    /**
     * Gets the MoveResource ARM ID of
     * the dependent resource if the resolution type is Automatic.
     * 
     */
    private final @Nullable String moveResourceId;

    @OutputCustomType.Constructor
    private AutomaticResolutionPropertiesResponse(@OutputCustomType.Parameter("moveResourceId") @Nullable String moveResourceId) {
        this.moveResourceId = moveResourceId;
    }

    /**
     * Gets the MoveResource ARM ID of
     * the dependent resource if the resolution type is Automatic.
     * 
    */
    public Optional<String> getMoveResourceId() {
        return Optional.ofNullable(this.moveResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomaticResolutionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String moveResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomaticResolutionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.moveResourceId = defaults.moveResourceId;
        }

        public Builder setMoveResourceId(@Nullable String moveResourceId) {
            this.moveResourceId = moveResourceId;
            return this;
        }
        public AutomaticResolutionPropertiesResponse build() {
            return new AutomaticResolutionPropertiesResponse(moveResourceId);
        }
    }
}
