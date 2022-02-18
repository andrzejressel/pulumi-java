// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.container.inputs.ClusterMaintenancePolicyDailyMaintenanceWindowGetArgs;
import io.pulumi.gcp.container.inputs.ClusterMaintenancePolicyMaintenanceExclusionGetArgs;
import io.pulumi.gcp.container.inputs.ClusterMaintenancePolicyRecurringWindowGetArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterMaintenancePolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterMaintenancePolicyGetArgs Empty = new ClusterMaintenancePolicyGetArgs();

    /**
     * Time window specified for daily maintenance operations.
     * Specify `start_time` in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format "HH:MM”,
     * where HH : \[00-23\] and MM : \[00-59\] GMT. For example:
     * 
     */
    @InputImport(name="dailyMaintenanceWindow")
    private final @Nullable Input<ClusterMaintenancePolicyDailyMaintenanceWindowGetArgs> dailyMaintenanceWindow;

    public Input<ClusterMaintenancePolicyDailyMaintenanceWindowGetArgs> getDailyMaintenanceWindow() {
        return this.dailyMaintenanceWindow == null ? Input.empty() : this.dailyMaintenanceWindow;
    }

    /**
     * Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows. A cluster can have up to three maintenance exclusions at a time [Maintenance Window and Exclusions](https://cloud.google.com/kubernetes-engine/docs/concepts/maintenance-windows-and-exclusions)
     * 
     */
    @InputImport(name="maintenanceExclusions")
    private final @Nullable Input<List<ClusterMaintenancePolicyMaintenanceExclusionGetArgs>> maintenanceExclusions;

    public Input<List<ClusterMaintenancePolicyMaintenanceExclusionGetArgs>> getMaintenanceExclusions() {
        return this.maintenanceExclusions == null ? Input.empty() : this.maintenanceExclusions;
    }

    /**
     * Time window for recurring maintenance operations.
     * 
     */
    @InputImport(name="recurringWindow")
    private final @Nullable Input<ClusterMaintenancePolicyRecurringWindowGetArgs> recurringWindow;

    public Input<ClusterMaintenancePolicyRecurringWindowGetArgs> getRecurringWindow() {
        return this.recurringWindow == null ? Input.empty() : this.recurringWindow;
    }

    public ClusterMaintenancePolicyGetArgs(
        @Nullable Input<ClusterMaintenancePolicyDailyMaintenanceWindowGetArgs> dailyMaintenanceWindow,
        @Nullable Input<List<ClusterMaintenancePolicyMaintenanceExclusionGetArgs>> maintenanceExclusions,
        @Nullable Input<ClusterMaintenancePolicyRecurringWindowGetArgs> recurringWindow) {
        this.dailyMaintenanceWindow = dailyMaintenanceWindow;
        this.maintenanceExclusions = maintenanceExclusions;
        this.recurringWindow = recurringWindow;
    }

    private ClusterMaintenancePolicyGetArgs() {
        this.dailyMaintenanceWindow = Input.empty();
        this.maintenanceExclusions = Input.empty();
        this.recurringWindow = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMaintenancePolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClusterMaintenancePolicyDailyMaintenanceWindowGetArgs> dailyMaintenanceWindow;
        private @Nullable Input<List<ClusterMaintenancePolicyMaintenanceExclusionGetArgs>> maintenanceExclusions;
        private @Nullable Input<ClusterMaintenancePolicyRecurringWindowGetArgs> recurringWindow;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMaintenancePolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyMaintenanceWindow = defaults.dailyMaintenanceWindow;
    	      this.maintenanceExclusions = defaults.maintenanceExclusions;
    	      this.recurringWindow = defaults.recurringWindow;
        }

        public Builder setDailyMaintenanceWindow(@Nullable Input<ClusterMaintenancePolicyDailyMaintenanceWindowGetArgs> dailyMaintenanceWindow) {
            this.dailyMaintenanceWindow = dailyMaintenanceWindow;
            return this;
        }

        public Builder setDailyMaintenanceWindow(@Nullable ClusterMaintenancePolicyDailyMaintenanceWindowGetArgs dailyMaintenanceWindow) {
            this.dailyMaintenanceWindow = Input.ofNullable(dailyMaintenanceWindow);
            return this;
        }

        public Builder setMaintenanceExclusions(@Nullable Input<List<ClusterMaintenancePolicyMaintenanceExclusionGetArgs>> maintenanceExclusions) {
            this.maintenanceExclusions = maintenanceExclusions;
            return this;
        }

        public Builder setMaintenanceExclusions(@Nullable List<ClusterMaintenancePolicyMaintenanceExclusionGetArgs> maintenanceExclusions) {
            this.maintenanceExclusions = Input.ofNullable(maintenanceExclusions);
            return this;
        }

        public Builder setRecurringWindow(@Nullable Input<ClusterMaintenancePolicyRecurringWindowGetArgs> recurringWindow) {
            this.recurringWindow = recurringWindow;
            return this;
        }

        public Builder setRecurringWindow(@Nullable ClusterMaintenancePolicyRecurringWindowGetArgs recurringWindow) {
            this.recurringWindow = Input.ofNullable(recurringWindow);
            return this;
        }

        public ClusterMaintenancePolicyGetArgs build() {
            return new ClusterMaintenancePolicyGetArgs(dailyMaintenanceWindow, maintenanceExclusions, recurringWindow);
        }
    }
}
