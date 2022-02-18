// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Additional instance params.
 * 
 */
public final class InstanceParamsArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceParamsArgs Empty = new InstanceParamsArgs();

    /**
     * Resource manager tags to be bound to the instance. Tag keys and values have the same definition as resource manager tags. Keys must be in the format `tagKeys/{tag_key_id}`, and values are in the format `tagValues/456`. The field is ignored (both PUT & PATCH) when empty.
     * 
     */
    @InputImport(name="resourceManagerTags")
    private final @Nullable Input<Map<String,String>> resourceManagerTags;

    public Input<Map<String,String>> getResourceManagerTags() {
        return this.resourceManagerTags == null ? Input.empty() : this.resourceManagerTags;
    }

    public InstanceParamsArgs(@Nullable Input<Map<String,String>> resourceManagerTags) {
        this.resourceManagerTags = resourceManagerTags;
    }

    private InstanceParamsArgs() {
        this.resourceManagerTags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> resourceManagerTags;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceParamsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceManagerTags = defaults.resourceManagerTags;
        }

        public Builder setResourceManagerTags(@Nullable Input<Map<String,String>> resourceManagerTags) {
            this.resourceManagerTags = resourceManagerTags;
            return this;
        }

        public Builder setResourceManagerTags(@Nullable Map<String,String> resourceManagerTags) {
            this.resourceManagerTags = Input.ofNullable(resourceManagerTags);
            return this;
        }

        public InstanceParamsArgs build() {
            return new InstanceParamsArgs(resourceManagerTags);
        }
    }
}
