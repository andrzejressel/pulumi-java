// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MoveResourceDependencyOverrideResponse {
    /**
     * Gets or sets the ARM ID of the dependent resource.
     * 
     */
    private final @Nullable String id;
    /**
     * Gets or sets the resource ARM id of either the MoveResource or the resource ARM ID of
     * the dependent resource.
     * 
     */
    private final @Nullable String targetId;

    @OutputCustomType.Constructor
    private MoveResourceDependencyOverrideResponse(
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("targetId") @Nullable String targetId) {
        this.id = id;
        this.targetId = targetId;
    }

    /**
     * Gets or sets the ARM ID of the dependent resource.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Gets or sets the resource ARM id of either the MoveResource or the resource ARM ID of
     * the dependent resource.
     * 
    */
    public Optional<String> getTargetId() {
        return Optional.ofNullable(this.targetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MoveResourceDependencyOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String targetId;

        public Builder() {
    	      // Empty
        }

        public Builder(MoveResourceDependencyOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.targetId = defaults.targetId;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setTargetId(@Nullable String targetId) {
            this.targetId = targetId;
            return this;
        }
        public MoveResourceDependencyOverrideResponse build() {
            return new MoveResourceDependencyOverrideResponse(id, targetId);
        }
    }
}
