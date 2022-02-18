// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.InstanceGroupManagerStatusStatefulArgs;
import io.pulumi.gcp.compute.inputs.InstanceGroupManagerStatusVersionTargetArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupManagerStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerStatusArgs Empty = new InstanceGroupManagerStatusArgs();

    /**
     * A bit indicating whether the managed instance group is in a stable state. A stable state means that: none of the instances in the managed instance group is currently undergoing any type of change (for example, creation, restart, or deletion); no future changes are scheduled for instances in the managed instance group; and the managed instance group itself is not being modified.
     * 
     */
    @InputImport(name="isStable")
    private final @Nullable Input<Boolean> isStable;

    public Input<Boolean> getIsStable() {
        return this.isStable == null ? Input.empty() : this.isStable;
    }

    /**
     * Stateful status of the given Instance Group Manager.
     * 
     */
    @InputImport(name="statefuls")
    private final @Nullable Input<List<InstanceGroupManagerStatusStatefulArgs>> statefuls;

    public Input<List<InstanceGroupManagerStatusStatefulArgs>> getStatefuls() {
        return this.statefuls == null ? Input.empty() : this.statefuls;
    }

    /**
     * A bit indicating whether version target has been reached in this managed instance group, i.e. all instances are in their target version. Instances' target version are specified by version field on Instance Group Manager.
     * 
     */
    @InputImport(name="versionTargets")
    private final @Nullable Input<List<InstanceGroupManagerStatusVersionTargetArgs>> versionTargets;

    public Input<List<InstanceGroupManagerStatusVersionTargetArgs>> getVersionTargets() {
        return this.versionTargets == null ? Input.empty() : this.versionTargets;
    }

    public InstanceGroupManagerStatusArgs(
        @Nullable Input<Boolean> isStable,
        @Nullable Input<List<InstanceGroupManagerStatusStatefulArgs>> statefuls,
        @Nullable Input<List<InstanceGroupManagerStatusVersionTargetArgs>> versionTargets) {
        this.isStable = isStable;
        this.statefuls = statefuls;
        this.versionTargets = versionTargets;
    }

    private InstanceGroupManagerStatusArgs() {
        this.isStable = Input.empty();
        this.statefuls = Input.empty();
        this.versionTargets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> isStable;
        private @Nullable Input<List<InstanceGroupManagerStatusStatefulArgs>> statefuls;
        private @Nullable Input<List<InstanceGroupManagerStatusVersionTargetArgs>> versionTargets;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isStable = defaults.isStable;
    	      this.statefuls = defaults.statefuls;
    	      this.versionTargets = defaults.versionTargets;
        }

        public Builder setIsStable(@Nullable Input<Boolean> isStable) {
            this.isStable = isStable;
            return this;
        }

        public Builder setIsStable(@Nullable Boolean isStable) {
            this.isStable = Input.ofNullable(isStable);
            return this;
        }

        public Builder setStatefuls(@Nullable Input<List<InstanceGroupManagerStatusStatefulArgs>> statefuls) {
            this.statefuls = statefuls;
            return this;
        }

        public Builder setStatefuls(@Nullable List<InstanceGroupManagerStatusStatefulArgs> statefuls) {
            this.statefuls = Input.ofNullable(statefuls);
            return this;
        }

        public Builder setVersionTargets(@Nullable Input<List<InstanceGroupManagerStatusVersionTargetArgs>> versionTargets) {
            this.versionTargets = versionTargets;
            return this;
        }

        public Builder setVersionTargets(@Nullable List<InstanceGroupManagerStatusVersionTargetArgs> versionTargets) {
            this.versionTargets = Input.ofNullable(versionTargets);
            return this;
        }

        public InstanceGroupManagerStatusArgs build() {
            return new InstanceGroupManagerStatusArgs(isStable, statefuls, versionTargets);
        }
    }
}
