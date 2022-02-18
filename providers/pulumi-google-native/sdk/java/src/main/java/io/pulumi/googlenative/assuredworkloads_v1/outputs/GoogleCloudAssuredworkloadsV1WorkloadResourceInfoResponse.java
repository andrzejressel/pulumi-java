// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.assuredworkloads_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudAssuredworkloadsV1WorkloadResourceInfoResponse {
    /**
     * Resource identifier. For a project this represents project_number.
     * 
     */
    private final String resourceId;
    /**
     * Indicates the type of resource.
     * 
     */
    private final String resourceType;

    @OutputCustomType.Constructor({"resourceId","resourceType"})
    private GoogleCloudAssuredworkloadsV1WorkloadResourceInfoResponse(
        String resourceId,
        String resourceType) {
        this.resourceId = Objects.requireNonNull(resourceId);
        this.resourceType = Objects.requireNonNull(resourceType);
    }

    /**
     * Resource identifier. For a project this represents project_number.
     * 
     */
    public String getResourceId() {
        return this.resourceId;
    }
    /**
     * Indicates the type of resource.
     * 
     */
    public String getPropResourceType() {
        return this.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudAssuredworkloadsV1WorkloadResourceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceId;
        private String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudAssuredworkloadsV1WorkloadResourceInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public GoogleCloudAssuredworkloadsV1WorkloadResourceInfoResponse build() {
            return new GoogleCloudAssuredworkloadsV1WorkloadResourceInfoResponse(resourceId, resourceType);
        }
    }
}
