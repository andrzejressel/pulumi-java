// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourceIdResponse {
    /**
     * Required field representing the resource type this id is for. At present, the valid types are "project", "folder", and "organization".
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"type"})
    private ResourceIdResponse(String type) {
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Required field representing the resource type this id is for. At present, the valid types are "project", "folder", and "organization".
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ResourceIdResponse build() {
            return new ResourceIdResponse(type);
        }
    }
}
