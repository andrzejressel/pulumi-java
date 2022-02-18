// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FlexibleAppVersionDeploymentContainerGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionDeploymentContainerGetArgs Empty = new FlexibleAppVersionDeploymentContainerGetArgs();

    /**
     * URI to the hosted container image in Google Container Registry. The URI must be fully qualified and include a tag or digest.
     * Examples: "gcr.io/my-project/image:tag" or "gcr.io/my-project/image@digest"
     * 
     */
    @InputImport(name="image", required=true)
    private final Input<String> image;

    public Input<String> getImage() {
        return this.image;
    }

    public FlexibleAppVersionDeploymentContainerGetArgs(Input<String> image) {
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
    }

    private FlexibleAppVersionDeploymentContainerGetArgs() {
        this.image = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionDeploymentContainerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> image;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionDeploymentContainerGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.image = defaults.image;
        }

        public Builder setImage(Input<String> image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setImage(String image) {
            this.image = Input.of(Objects.requireNonNull(image));
            return this;
        }

        public FlexibleAppVersionDeploymentContainerGetArgs build() {
            return new FlexibleAppVersionDeploymentContainerGetArgs(image);
        }
    }
}
