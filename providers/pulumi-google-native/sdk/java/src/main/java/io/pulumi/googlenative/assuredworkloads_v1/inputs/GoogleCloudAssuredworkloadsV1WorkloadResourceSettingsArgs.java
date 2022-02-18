// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.assuredworkloads_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.assuredworkloads_v1.enums.GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResourceType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represent the custom settings for the resources to be created.
 * 
 */
public final class GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs Empty = new GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs();

    /**
     * User-assigned resource display name. If not empty it will be used to create a resource with the specified name.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Resource identifier. For a project this represents project_id. If the project is already taken, the workload creation will fail.
     * 
     */
    @InputImport(name="resourceId")
    private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    /**
     * Indicates the type of resource. This field should be specified to correspond the id to the right project type (CONSUMER_PROJECT or ENCRYPTION_KEYS_PROJECT)
     * 
     */
    @InputImport(name="resourceType")
    private final @Nullable Input<GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResourceType> resourceType;

    public Input<GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResourceType> getPropResourceType() {
        return this.resourceType == null ? Input.empty() : this.resourceType;
    }

    public GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs(
        @Nullable Input<String> displayName,
        @Nullable Input<String> resourceId,
        @Nullable Input<GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResourceType> resourceType) {
        this.displayName = displayName;
        this.resourceId = resourceId;
        this.resourceType = resourceType;
    }

    private GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs() {
        this.displayName = Input.empty();
        this.resourceId = Input.empty();
        this.resourceType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> resourceId;
        private @Nullable Input<GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResourceType> resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public Builder setResourceType(@Nullable Input<GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResourceType> resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setResourceType(@Nullable GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsResourceType resourceType) {
            this.resourceType = Input.ofNullable(resourceType);
            return this;
        }

        public GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs build() {
            return new GoogleCloudAssuredworkloadsV1WorkloadResourceSettingsArgs(displayName, resourceId, resourceType);
        }
    }
}
