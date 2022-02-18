// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigArgs();

    /**
     * Optional. The time when cluster will be auto-deleted (see JSON representation of (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    @InputImport(name="autoDeleteTime")
    private final @Nullable Input<String> autoDeleteTime;

    public Input<String> getAutoDeleteTime() {
        return this.autoDeleteTime == null ? Input.empty() : this.autoDeleteTime;
    }

    /**
     * Optional. The lifetime duration of cluster. The cluster will be auto-deleted at the end of this period. Minimum value is 10 minutes; maximum value is 14 days (see JSON representation of (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    @InputImport(name="autoDeleteTtl")
    private final @Nullable Input<String> autoDeleteTtl;

    public Input<String> getAutoDeleteTtl() {
        return this.autoDeleteTtl == null ? Input.empty() : this.autoDeleteTtl;
    }

    /**
     * Optional. The duration to keep the cluster alive while idling (when no jobs are running). Passing this threshold will cause the cluster to be deleted. Minimum value is 5 minutes; maximum value is 14 days (see JSON representation of (https://developers.google.com/protocol-buffers/docs/proto3#json).
     * 
     */
    @InputImport(name="idleDeleteTtl")
    private final @Nullable Input<String> idleDeleteTtl;

    public Input<String> getIdleDeleteTtl() {
        return this.idleDeleteTtl == null ? Input.empty() : this.idleDeleteTtl;
    }

    /**
     * - 
     * Output only. The time when cluster became idle (most recent job finished) and became eligible for deletion due to idleness (see JSON representation of (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    @InputImport(name="idleStartTime")
    private final @Nullable Input<String> idleStartTime;

    public Input<String> getIdleStartTime() {
        return this.idleStartTime == null ? Input.empty() : this.idleStartTime;
    }

    public WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigArgs(
        @Nullable Input<String> autoDeleteTime,
        @Nullable Input<String> autoDeleteTtl,
        @Nullable Input<String> idleDeleteTtl,
        @Nullable Input<String> idleStartTime) {
        this.autoDeleteTime = autoDeleteTime;
        this.autoDeleteTtl = autoDeleteTtl;
        this.idleDeleteTtl = idleDeleteTtl;
        this.idleStartTime = idleStartTime;
    }

    private WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigArgs() {
        this.autoDeleteTime = Input.empty();
        this.autoDeleteTtl = Input.empty();
        this.idleDeleteTtl = Input.empty();
        this.idleStartTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> autoDeleteTime;
        private @Nullable Input<String> autoDeleteTtl;
        private @Nullable Input<String> idleDeleteTtl;
        private @Nullable Input<String> idleStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDeleteTime = defaults.autoDeleteTime;
    	      this.autoDeleteTtl = defaults.autoDeleteTtl;
    	      this.idleDeleteTtl = defaults.idleDeleteTtl;
    	      this.idleStartTime = defaults.idleStartTime;
        }

        public Builder setAutoDeleteTime(@Nullable Input<String> autoDeleteTime) {
            this.autoDeleteTime = autoDeleteTime;
            return this;
        }

        public Builder setAutoDeleteTime(@Nullable String autoDeleteTime) {
            this.autoDeleteTime = Input.ofNullable(autoDeleteTime);
            return this;
        }

        public Builder setAutoDeleteTtl(@Nullable Input<String> autoDeleteTtl) {
            this.autoDeleteTtl = autoDeleteTtl;
            return this;
        }

        public Builder setAutoDeleteTtl(@Nullable String autoDeleteTtl) {
            this.autoDeleteTtl = Input.ofNullable(autoDeleteTtl);
            return this;
        }

        public Builder setIdleDeleteTtl(@Nullable Input<String> idleDeleteTtl) {
            this.idleDeleteTtl = idleDeleteTtl;
            return this;
        }

        public Builder setIdleDeleteTtl(@Nullable String idleDeleteTtl) {
            this.idleDeleteTtl = Input.ofNullable(idleDeleteTtl);
            return this;
        }

        public Builder setIdleStartTime(@Nullable Input<String> idleStartTime) {
            this.idleStartTime = idleStartTime;
            return this;
        }

        public Builder setIdleStartTime(@Nullable String idleStartTime) {
            this.idleStartTime = Input.ofNullable(idleStartTime);
            return this;
        }

        public WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigLifecycleConfigArgs(autoDeleteTime, autoDeleteTtl, idleDeleteTtl, idleStartTime);
        }
    }
}
