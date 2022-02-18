// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.assuredworkloads.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkloadResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkloadResourceArgs Empty = new WorkloadResourceArgs();

    /**
     * Resource identifier. For a project this represents project_number. If the project is already taken, the workload creation will fail.
     * 
     */
    @InputImport(name="resourceId")
    private final @Nullable Input<Integer> resourceId;

    public Input<Integer> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    /**
     * Indicates the type of resource. This field should be specified to correspond the id to the right project type (CONSUMER_PROJECT or ENCRYPTION_KEYS_PROJECT) Possible values: RESOURCE_TYPE_UNSPECIFIED, CONSUMER_PROJECT, ENCRYPTION_KEYS_PROJECT, KEYRING, CONSUMER_FOLDER
     * 
     */
    @InputImport(name="resourceType")
    private final @Nullable Input<String> resourceType;

    public Input<String> getPropResourceType() {
        return this.resourceType == null ? Input.empty() : this.resourceType;
    }

    public WorkloadResourceArgs(
        @Nullable Input<Integer> resourceId,
        @Nullable Input<String> resourceType) {
        this.resourceId = resourceId;
        this.resourceType = resourceType;
    }

    private WorkloadResourceArgs() {
        this.resourceId = Input.empty();
        this.resourceType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> resourceId;
        private @Nullable Input<String> resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder setResourceId(@Nullable Input<Integer> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable Integer resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public Builder setResourceType(@Nullable Input<String> resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setResourceType(@Nullable String resourceType) {
            this.resourceType = Input.ofNullable(resourceType);
            return this;
        }

        public WorkloadResourceArgs build() {
            return new WorkloadResourceArgs(resourceId, resourceType);
        }
    }
}
