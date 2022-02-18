// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.container_v1beta1.outputs.AutoUpgradeOptionsResponse;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class NodeManagementResponse {
    /**
     * Whether the nodes will be automatically repaired.
     * 
     */
    private final Boolean autoRepair;
    /**
     * Whether the nodes will be automatically upgraded.
     * 
     */
    private final Boolean autoUpgrade;
    /**
     * Specifies the Auto Upgrade knobs for the node pool.
     * 
     */
    private final AutoUpgradeOptionsResponse upgradeOptions;

    @OutputCustomType.Constructor({"autoRepair","autoUpgrade","upgradeOptions"})
    private NodeManagementResponse(
        Boolean autoRepair,
        Boolean autoUpgrade,
        AutoUpgradeOptionsResponse upgradeOptions) {
        this.autoRepair = Objects.requireNonNull(autoRepair);
        this.autoUpgrade = Objects.requireNonNull(autoUpgrade);
        this.upgradeOptions = Objects.requireNonNull(upgradeOptions);
    }

    /**
     * Whether the nodes will be automatically repaired.
     * 
     */
    public Boolean getAutoRepair() {
        return this.autoRepair;
    }
    /**
     * Whether the nodes will be automatically upgraded.
     * 
     */
    public Boolean getAutoUpgrade() {
        return this.autoUpgrade;
    }
    /**
     * Specifies the Auto Upgrade knobs for the node pool.
     * 
     */
    public AutoUpgradeOptionsResponse getUpgradeOptions() {
        return this.upgradeOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeManagementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoRepair;
        private Boolean autoUpgrade;
        private AutoUpgradeOptionsResponse upgradeOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeManagementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRepair = defaults.autoRepair;
    	      this.autoUpgrade = defaults.autoUpgrade;
    	      this.upgradeOptions = defaults.upgradeOptions;
        }

        public Builder setAutoRepair(Boolean autoRepair) {
            this.autoRepair = Objects.requireNonNull(autoRepair);
            return this;
        }

        public Builder setAutoUpgrade(Boolean autoUpgrade) {
            this.autoUpgrade = Objects.requireNonNull(autoUpgrade);
            return this;
        }

        public Builder setUpgradeOptions(AutoUpgradeOptionsResponse upgradeOptions) {
            this.upgradeOptions = Objects.requireNonNull(upgradeOptions);
            return this;
        }

        public NodeManagementResponse build() {
            return new NodeManagementResponse(autoRepair, autoUpgrade, upgradeOptions);
        }
    }
}
