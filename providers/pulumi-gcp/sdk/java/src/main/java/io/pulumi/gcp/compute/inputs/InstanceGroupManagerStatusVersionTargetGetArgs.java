// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupManagerStatusVersionTargetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerStatusVersionTargetGetArgs Empty = new InstanceGroupManagerStatusVersionTargetGetArgs();

    @InputImport(name="isReached")
    private final @Nullable Input<Boolean> isReached;

    public Input<Boolean> getIsReached() {
        return this.isReached == null ? Input.empty() : this.isReached;
    }

    public InstanceGroupManagerStatusVersionTargetGetArgs(@Nullable Input<Boolean> isReached) {
        this.isReached = isReached;
    }

    private InstanceGroupManagerStatusVersionTargetGetArgs() {
        this.isReached = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStatusVersionTargetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> isReached;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStatusVersionTargetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isReached = defaults.isReached;
        }

        public Builder setIsReached(@Nullable Input<Boolean> isReached) {
            this.isReached = isReached;
            return this;
        }

        public Builder setIsReached(@Nullable Boolean isReached) {
            this.isReached = Input.ofNullable(isReached);
            return this;
        }

        public InstanceGroupManagerStatusVersionTargetGetArgs build() {
            return new InstanceGroupManagerStatusVersionTargetGetArgs(isReached);
        }
    }
}
