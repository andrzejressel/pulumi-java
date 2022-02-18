// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.osconfig_v1.outputs.FixedOrPercentResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OSPolicyAssignmentRolloutResponse {
    /**
     * The maximum number (or percentage) of VMs per zone to disrupt at any given moment.
     * 
     */
    private final FixedOrPercentResponse disruptionBudget;
    /**
     * This determines the minimum duration of time to wait after the configuration changes are applied through the current rollout. A VM continues to count towards the `disruption_budget` at least until this duration of time has passed after configuration changes are applied.
     * 
     */
    private final String minWaitDuration;

    @OutputCustomType.Constructor({"disruptionBudget","minWaitDuration"})
    private OSPolicyAssignmentRolloutResponse(
        FixedOrPercentResponse disruptionBudget,
        String minWaitDuration) {
        this.disruptionBudget = Objects.requireNonNull(disruptionBudget);
        this.minWaitDuration = Objects.requireNonNull(minWaitDuration);
    }

    /**
     * The maximum number (or percentage) of VMs per zone to disrupt at any given moment.
     * 
     */
    public FixedOrPercentResponse getDisruptionBudget() {
        return this.disruptionBudget;
    }
    /**
     * This determines the minimum duration of time to wait after the configuration changes are applied through the current rollout. A VM continues to count towards the `disruption_budget` at least until this duration of time has passed after configuration changes are applied.
     * 
     */
    public String getMinWaitDuration() {
        return this.minWaitDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyAssignmentRolloutResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FixedOrPercentResponse disruptionBudget;
        private String minWaitDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyAssignmentRolloutResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disruptionBudget = defaults.disruptionBudget;
    	      this.minWaitDuration = defaults.minWaitDuration;
        }

        public Builder setDisruptionBudget(FixedOrPercentResponse disruptionBudget) {
            this.disruptionBudget = Objects.requireNonNull(disruptionBudget);
            return this;
        }

        public Builder setMinWaitDuration(String minWaitDuration) {
            this.minWaitDuration = Objects.requireNonNull(minWaitDuration);
            return this;
        }

        public OSPolicyAssignmentRolloutResponse build() {
            return new OSPolicyAssignmentRolloutResponse(disruptionBudget, minWaitDuration);
        }
    }
}
