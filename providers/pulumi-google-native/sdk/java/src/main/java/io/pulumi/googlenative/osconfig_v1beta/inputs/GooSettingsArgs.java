// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import java.util.Objects;


/**
 * Googet patching is performed by running `googet update`.
 * 
 */
public final class GooSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooSettingsArgs Empty = new GooSettingsArgs();

    public GooSettingsArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GooSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GooSettingsArgs build() {
            return new GooSettingsArgs();
        }
    }
}
