// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.osconfig_v1beta.outputs.FixedOrPercentResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PatchRolloutResponse {
    /**
     * The maximum number (or percentage) of VMs per zone to disrupt at any given moment. The number of VMs calculated from multiplying the percentage by the total number of VMs in a zone is rounded up. During patching, a VM is considered disrupted from the time the agent is notified to begin until patching has completed. This disruption time includes the time to complete reboot and any post-patch steps. A VM contributes to the disruption budget if its patching operation fails either when applying the patches, running pre or post patch steps, or if it fails to respond with a success notification before timing out. VMs that are not running or do not have an active agent do not count toward this disruption budget. For zone-by-zone rollouts, if the disruption budget in a zone is exceeded, the patch job stops, because continuing to the next zone requires completion of the patch process in the previous zone. For example, if the disruption budget has a fixed value of `10`, and 8 VMs fail to patch in the current zone, the patch job continues to patch 2 VMs at a time until the zone is completed. When that zone is completed successfully, patching begins with 10 VMs at a time in the next zone. If 10 VMs in the next zone fail to patch, the patch job stops.
     * 
     */
    private final FixedOrPercentResponse disruptionBudget;
    /**
     * Mode of the patch rollout.
     * 
     */
    private final String mode;

    @OutputCustomType.Constructor({"disruptionBudget","mode"})
    private PatchRolloutResponse(
        FixedOrPercentResponse disruptionBudget,
        String mode) {
        this.disruptionBudget = Objects.requireNonNull(disruptionBudget);
        this.mode = Objects.requireNonNull(mode);
    }

    /**
     * The maximum number (or percentage) of VMs per zone to disrupt at any given moment. The number of VMs calculated from multiplying the percentage by the total number of VMs in a zone is rounded up. During patching, a VM is considered disrupted from the time the agent is notified to begin until patching has completed. This disruption time includes the time to complete reboot and any post-patch steps. A VM contributes to the disruption budget if its patching operation fails either when applying the patches, running pre or post patch steps, or if it fails to respond with a success notification before timing out. VMs that are not running or do not have an active agent do not count toward this disruption budget. For zone-by-zone rollouts, if the disruption budget in a zone is exceeded, the patch job stops, because continuing to the next zone requires completion of the patch process in the previous zone. For example, if the disruption budget has a fixed value of `10`, and 8 VMs fail to patch in the current zone, the patch job continues to patch 2 VMs at a time until the zone is completed. When that zone is completed successfully, patching begins with 10 VMs at a time in the next zone. If 10 VMs in the next zone fail to patch, the patch job stops.
     * 
     */
    public FixedOrPercentResponse getDisruptionBudget() {
        return this.disruptionBudget;
    }
    /**
     * Mode of the patch rollout.
     * 
     */
    public String getMode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchRolloutResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FixedOrPercentResponse disruptionBudget;
        private String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchRolloutResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disruptionBudget = defaults.disruptionBudget;
    	      this.mode = defaults.mode;
        }

        public Builder setDisruptionBudget(FixedOrPercentResponse disruptionBudget) {
            this.disruptionBudget = Objects.requireNonNull(disruptionBudget);
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public PatchRolloutResponse build() {
            return new PatchRolloutResponse(disruptionBudget, mode);
        }
    }
}
