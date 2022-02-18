// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.ResourcePolicyGroupPlacementPolicyArgs;
import io.pulumi.googlenative.compute_beta.inputs.ResourcePolicyInstanceSchedulePolicyArgs;
import io.pulumi.googlenative.compute_beta.inputs.ResourcePolicySnapshotSchedulePolicyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourcePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyArgs Empty = new ResourcePolicyArgs();

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Resource policy for instances for placement configuration.
     * 
     */
    @InputImport(name="groupPlacementPolicy")
    private final @Nullable Input<ResourcePolicyGroupPlacementPolicyArgs> groupPlacementPolicy;

    public Input<ResourcePolicyGroupPlacementPolicyArgs> getGroupPlacementPolicy() {
        return this.groupPlacementPolicy == null ? Input.empty() : this.groupPlacementPolicy;
    }

    /**
     * Resource policy for scheduling instance operations.
     * 
     */
    @InputImport(name="instanceSchedulePolicy")
    private final @Nullable Input<ResourcePolicyInstanceSchedulePolicyArgs> instanceSchedulePolicy;

    public Input<ResourcePolicyInstanceSchedulePolicyArgs> getInstanceSchedulePolicy() {
        return this.instanceSchedulePolicy == null ? Input.empty() : this.instanceSchedulePolicy;
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region", required=true)
    private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * Resource policy for persistent disks for creating snapshots.
     * 
     */
    @InputImport(name="snapshotSchedulePolicy")
    private final @Nullable Input<ResourcePolicySnapshotSchedulePolicyArgs> snapshotSchedulePolicy;

    public Input<ResourcePolicySnapshotSchedulePolicyArgs> getSnapshotSchedulePolicy() {
        return this.snapshotSchedulePolicy == null ? Input.empty() : this.snapshotSchedulePolicy;
    }

    public ResourcePolicyArgs(
        @Nullable Input<String> description,
        @Nullable Input<ResourcePolicyGroupPlacementPolicyArgs> groupPlacementPolicy,
        @Nullable Input<ResourcePolicyInstanceSchedulePolicyArgs> instanceSchedulePolicy,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        Input<String> region,
        @Nullable Input<String> requestId,
        @Nullable Input<ResourcePolicySnapshotSchedulePolicyArgs> snapshotSchedulePolicy) {
        this.description = description;
        this.groupPlacementPolicy = groupPlacementPolicy;
        this.instanceSchedulePolicy = instanceSchedulePolicy;
        this.name = name;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.snapshotSchedulePolicy = snapshotSchedulePolicy;
    }

    private ResourcePolicyArgs() {
        this.description = Input.empty();
        this.groupPlacementPolicy = Input.empty();
        this.instanceSchedulePolicy = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.requestId = Input.empty();
        this.snapshotSchedulePolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<ResourcePolicyGroupPlacementPolicyArgs> groupPlacementPolicy;
        private @Nullable Input<ResourcePolicyInstanceSchedulePolicyArgs> instanceSchedulePolicy;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private Input<String> region;
        private @Nullable Input<String> requestId;
        private @Nullable Input<ResourcePolicySnapshotSchedulePolicyArgs> snapshotSchedulePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.groupPlacementPolicy = defaults.groupPlacementPolicy;
    	      this.instanceSchedulePolicy = defaults.instanceSchedulePolicy;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.snapshotSchedulePolicy = defaults.snapshotSchedulePolicy;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setGroupPlacementPolicy(@Nullable Input<ResourcePolicyGroupPlacementPolicyArgs> groupPlacementPolicy) {
            this.groupPlacementPolicy = groupPlacementPolicy;
            return this;
        }

        public Builder setGroupPlacementPolicy(@Nullable ResourcePolicyGroupPlacementPolicyArgs groupPlacementPolicy) {
            this.groupPlacementPolicy = Input.ofNullable(groupPlacementPolicy);
            return this;
        }

        public Builder setInstanceSchedulePolicy(@Nullable Input<ResourcePolicyInstanceSchedulePolicyArgs> instanceSchedulePolicy) {
            this.instanceSchedulePolicy = instanceSchedulePolicy;
            return this;
        }

        public Builder setInstanceSchedulePolicy(@Nullable ResourcePolicyInstanceSchedulePolicyArgs instanceSchedulePolicy) {
            this.instanceSchedulePolicy = Input.ofNullable(instanceSchedulePolicy);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setSnapshotSchedulePolicy(@Nullable Input<ResourcePolicySnapshotSchedulePolicyArgs> snapshotSchedulePolicy) {
            this.snapshotSchedulePolicy = snapshotSchedulePolicy;
            return this;
        }

        public Builder setSnapshotSchedulePolicy(@Nullable ResourcePolicySnapshotSchedulePolicyArgs snapshotSchedulePolicy) {
            this.snapshotSchedulePolicy = Input.ofNullable(snapshotSchedulePolicy);
            return this;
        }

        public ResourcePolicyArgs build() {
            return new ResourcePolicyArgs(description, groupPlacementPolicy, instanceSchedulePolicy, name, project, region, requestId, snapshotSchedulePolicy);
        }
    }
}
