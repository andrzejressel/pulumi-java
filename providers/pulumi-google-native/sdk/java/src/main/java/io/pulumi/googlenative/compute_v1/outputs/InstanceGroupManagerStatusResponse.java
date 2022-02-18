// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_v1.outputs.InstanceGroupManagerStatusStatefulResponse;
import io.pulumi.googlenative.compute_v1.outputs.InstanceGroupManagerStatusVersionTargetResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class InstanceGroupManagerStatusResponse {
    /**
     * The URL of the Autoscaler that targets this instance group manager.
     * 
     */
    private final String autoscaler;
    /**
     * A bit indicating whether the managed instance group is in a stable state. A stable state means that: none of the instances in the managed instance group is currently undergoing any type of change (for example, creation, restart, or deletion); no future changes are scheduled for instances in the managed instance group; and the managed instance group itself is not being modified.
     * 
     */
    private final Boolean isStable;
    /**
     * Stateful status of the given Instance Group Manager.
     * 
     */
    private final InstanceGroupManagerStatusStatefulResponse stateful;
    /**
     * A status of consistency of Instances' versions with their target version specified by version field on Instance Group Manager.
     * 
     */
    private final InstanceGroupManagerStatusVersionTargetResponse versionTarget;

    @OutputCustomType.Constructor({"autoscaler","isStable","stateful","versionTarget"})
    private InstanceGroupManagerStatusResponse(
        String autoscaler,
        Boolean isStable,
        InstanceGroupManagerStatusStatefulResponse stateful,
        InstanceGroupManagerStatusVersionTargetResponse versionTarget) {
        this.autoscaler = Objects.requireNonNull(autoscaler);
        this.isStable = Objects.requireNonNull(isStable);
        this.stateful = Objects.requireNonNull(stateful);
        this.versionTarget = Objects.requireNonNull(versionTarget);
    }

    /**
     * The URL of the Autoscaler that targets this instance group manager.
     * 
     */
    public String getAutoscaler() {
        return this.autoscaler;
    }
    /**
     * A bit indicating whether the managed instance group is in a stable state. A stable state means that: none of the instances in the managed instance group is currently undergoing any type of change (for example, creation, restart, or deletion); no future changes are scheduled for instances in the managed instance group; and the managed instance group itself is not being modified.
     * 
     */
    public Boolean getIsStable() {
        return this.isStable;
    }
    /**
     * Stateful status of the given Instance Group Manager.
     * 
     */
    public InstanceGroupManagerStatusStatefulResponse getStateful() {
        return this.stateful;
    }
    /**
     * A status of consistency of Instances' versions with their target version specified by version field on Instance Group Manager.
     * 
     */
    public InstanceGroupManagerStatusVersionTargetResponse getVersionTarget() {
        return this.versionTarget;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoscaler;
        private Boolean isStable;
        private InstanceGroupManagerStatusStatefulResponse stateful;
        private InstanceGroupManagerStatusVersionTargetResponse versionTarget;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaler = defaults.autoscaler;
    	      this.isStable = defaults.isStable;
    	      this.stateful = defaults.stateful;
    	      this.versionTarget = defaults.versionTarget;
        }

        public Builder setAutoscaler(String autoscaler) {
            this.autoscaler = Objects.requireNonNull(autoscaler);
            return this;
        }

        public Builder setIsStable(Boolean isStable) {
            this.isStable = Objects.requireNonNull(isStable);
            return this;
        }

        public Builder setStateful(InstanceGroupManagerStatusStatefulResponse stateful) {
            this.stateful = Objects.requireNonNull(stateful);
            return this;
        }

        public Builder setVersionTarget(InstanceGroupManagerStatusVersionTargetResponse versionTarget) {
            this.versionTarget = Objects.requireNonNull(versionTarget);
            return this;
        }

        public InstanceGroupManagerStatusResponse build() {
            return new InstanceGroupManagerStatusResponse(autoscaler, isStable, stateful, versionTarget);
        }
    }
}
