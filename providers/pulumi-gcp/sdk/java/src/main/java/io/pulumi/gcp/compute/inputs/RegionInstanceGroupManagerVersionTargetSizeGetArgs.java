// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionInstanceGroupManagerVersionTargetSizeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerVersionTargetSizeGetArgs Empty = new RegionInstanceGroupManagerVersionTargetSizeGetArgs();

    /**
     * , The number of instances which are managed for this version. Conflicts with `percent`.
     * 
     */
    @InputImport(name="fixed")
    private final @Nullable Input<Integer> fixed;

    public Input<Integer> getFixed() {
        return this.fixed == null ? Input.empty() : this.fixed;
    }

    /**
     * , The number of instances (calculated as percentage) which are managed for this version. Conflicts with `fixed`.
     * Note that when using `percent`, rounding will be in favor of explicitly set `target_size` values; a managed instance group with 2 instances and 2 `version`s,
     * one of which has a `target_size.percent` of `60` will create 2 instances of that `version`.
     * 
     */
    @InputImport(name="percent")
    private final @Nullable Input<Integer> percent;

    public Input<Integer> getPercent() {
        return this.percent == null ? Input.empty() : this.percent;
    }

    public RegionInstanceGroupManagerVersionTargetSizeGetArgs(
        @Nullable Input<Integer> fixed,
        @Nullable Input<Integer> percent) {
        this.fixed = fixed;
        this.percent = percent;
    }

    private RegionInstanceGroupManagerVersionTargetSizeGetArgs() {
        this.fixed = Input.empty();
        this.percent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerVersionTargetSizeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> fixed;
        private @Nullable Input<Integer> percent;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerVersionTargetSizeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixed = defaults.fixed;
    	      this.percent = defaults.percent;
        }

        public Builder setFixed(@Nullable Input<Integer> fixed) {
            this.fixed = fixed;
            return this;
        }

        public Builder setFixed(@Nullable Integer fixed) {
            this.fixed = Input.ofNullable(fixed);
            return this;
        }

        public Builder setPercent(@Nullable Input<Integer> percent) {
            this.percent = percent;
            return this;
        }

        public Builder setPercent(@Nullable Integer percent) {
            this.percent = Input.ofNullable(percent);
            return this;
        }

        public RegionInstanceGroupManagerVersionTargetSizeGetArgs build() {
            return new RegionInstanceGroupManagerVersionTargetSizeGetArgs(fixed, percent);
        }
    }
}
