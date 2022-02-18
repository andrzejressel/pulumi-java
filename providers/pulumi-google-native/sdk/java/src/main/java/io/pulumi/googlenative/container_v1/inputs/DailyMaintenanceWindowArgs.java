// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Time window specified for daily maintenance operations.
 * 
 */
public final class DailyMaintenanceWindowArgs extends io.pulumi.resources.ResourceArgs {

    public static final DailyMaintenanceWindowArgs Empty = new DailyMaintenanceWindowArgs();

    /**
     * Time within the maintenance window to start the maintenance operations. Time format should be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format "HH:MM", where HH : [00-23] and MM : [00-59] GMT.
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    public DailyMaintenanceWindowArgs(@Nullable Input<String> startTime) {
        this.startTime = startTime;
    }

    private DailyMaintenanceWindowArgs() {
        this.startTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DailyMaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DailyMaintenanceWindowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.startTime = defaults.startTime;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public DailyMaintenanceWindowArgs build() {
            return new DailyMaintenanceWindowArgs(startTime);
        }
    }
}
