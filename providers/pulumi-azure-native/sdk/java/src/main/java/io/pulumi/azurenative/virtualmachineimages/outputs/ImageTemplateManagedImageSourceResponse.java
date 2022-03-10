// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ImageTemplateManagedImageSourceResponse {
    /**
     * ARM resource id of the managed image in customer subscription
     * 
     */
    private final String imageId;
    /**
     * Specifies the type of source image you want to start with.
     * Expected value is 'ManagedImage'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private ImageTemplateManagedImageSourceResponse(
        @OutputCustomType.Parameter("imageId") String imageId,
        @OutputCustomType.Parameter("type") String type) {
        this.imageId = imageId;
        this.type = type;
    }

    /**
     * ARM resource id of the managed image in customer subscription
     * 
    */
    public String getImageId() {
        return this.imageId;
    }
    /**
     * Specifies the type of source image you want to start with.
     * Expected value is 'ManagedImage'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateManagedImageSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imageId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateManagedImageSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageId = defaults.imageId;
    	      this.type = defaults.type;
        }

        public Builder setImageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ImageTemplateManagedImageSourceResponse build() {
            return new ImageTemplateManagedImageSourceResponse(imageId, type);
        }
    }
}
