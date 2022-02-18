// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Time window specified for daily maintenance operations. GCE's internal maintenance will be performed within this window.
 * 
 */
public final class NodeGroupMaintenanceWindowArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupMaintenanceWindowArgs Empty = new NodeGroupMaintenanceWindowArgs();

    /**
     * Start time of the window. This must be in UTC format that resolves to one of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5 and 08:00 are valid.
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    public NodeGroupMaintenanceWindowArgs(@Nullable Input<String> startTime) {
        this.startTime = startTime;
    }

    private NodeGroupMaintenanceWindowArgs() {
        this.startTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupMaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupMaintenanceWindowArgs defaults) {
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

        public NodeGroupMaintenanceWindowArgs build() {
            return new NodeGroupMaintenanceWindowArgs(startTime);
        }
    }
}
