// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.container.outputs.ClusterMaintenancePolicyDailyMaintenanceWindow;
import io.pulumi.gcp.container.outputs.ClusterMaintenancePolicyMaintenanceExclusion;
import io.pulumi.gcp.container.outputs.ClusterMaintenancePolicyRecurringWindow;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterMaintenancePolicy {
    /**
     * Time window specified for daily maintenance operations.
     * Specify `start_time` in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format "HH:MM”,
     * where HH : \[00-23\] and MM : \[00-59\] GMT. For example:
     * 
     */
    private final @Nullable ClusterMaintenancePolicyDailyMaintenanceWindow dailyMaintenanceWindow;
    /**
     * Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows. A cluster can have up to three maintenance exclusions at a time [Maintenance Window and Exclusions](https://cloud.google.com/kubernetes-engine/docs/concepts/maintenance-windows-and-exclusions)
     * 
     */
    private final @Nullable List<ClusterMaintenancePolicyMaintenanceExclusion> maintenanceExclusions;
    /**
     * Time window for recurring maintenance operations.
     * 
     */
    private final @Nullable ClusterMaintenancePolicyRecurringWindow recurringWindow;

    @OutputCustomType.Constructor({"dailyMaintenanceWindow","maintenanceExclusions","recurringWindow"})
    private ClusterMaintenancePolicy(
        @Nullable ClusterMaintenancePolicyDailyMaintenanceWindow dailyMaintenanceWindow,
        @Nullable List<ClusterMaintenancePolicyMaintenanceExclusion> maintenanceExclusions,
        @Nullable ClusterMaintenancePolicyRecurringWindow recurringWindow) {
        this.dailyMaintenanceWindow = dailyMaintenanceWindow;
        this.maintenanceExclusions = maintenanceExclusions;
        this.recurringWindow = recurringWindow;
    }

    /**
     * Time window specified for daily maintenance operations.
     * Specify `start_time` in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format "HH:MM”,
     * where HH : \[00-23\] and MM : \[00-59\] GMT. For example:
     * 
     */
    public Optional<ClusterMaintenancePolicyDailyMaintenanceWindow> getDailyMaintenanceWindow() {
        return Optional.ofNullable(this.dailyMaintenanceWindow);
    }
    /**
     * Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows. A cluster can have up to three maintenance exclusions at a time [Maintenance Window and Exclusions](https://cloud.google.com/kubernetes-engine/docs/concepts/maintenance-windows-and-exclusions)
     * 
     */
    public List<ClusterMaintenancePolicyMaintenanceExclusion> getMaintenanceExclusions() {
        return this.maintenanceExclusions == null ? List.of() : this.maintenanceExclusions;
    }
    /**
     * Time window for recurring maintenance operations.
     * 
     */
    public Optional<ClusterMaintenancePolicyRecurringWindow> getRecurringWindow() {
        return Optional.ofNullable(this.recurringWindow);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMaintenancePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterMaintenancePolicyDailyMaintenanceWindow dailyMaintenanceWindow;
        private @Nullable List<ClusterMaintenancePolicyMaintenanceExclusion> maintenanceExclusions;
        private @Nullable ClusterMaintenancePolicyRecurringWindow recurringWindow;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMaintenancePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyMaintenanceWindow = defaults.dailyMaintenanceWindow;
    	      this.maintenanceExclusions = defaults.maintenanceExclusions;
    	      this.recurringWindow = defaults.recurringWindow;
        }

        public Builder setDailyMaintenanceWindow(@Nullable ClusterMaintenancePolicyDailyMaintenanceWindow dailyMaintenanceWindow) {
            this.dailyMaintenanceWindow = dailyMaintenanceWindow;
            return this;
        }

        public Builder setMaintenanceExclusions(@Nullable List<ClusterMaintenancePolicyMaintenanceExclusion> maintenanceExclusions) {
            this.maintenanceExclusions = maintenanceExclusions;
            return this;
        }

        public Builder setRecurringWindow(@Nullable ClusterMaintenancePolicyRecurringWindow recurringWindow) {
            this.recurringWindow = recurringWindow;
            return this;
        }

        public ClusterMaintenancePolicy build() {
            return new ClusterMaintenancePolicy(dailyMaintenanceWindow, maintenanceExclusions, recurringWindow);
        }
    }
}
