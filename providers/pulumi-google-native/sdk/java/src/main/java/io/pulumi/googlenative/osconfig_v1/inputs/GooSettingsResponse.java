// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import java.util.Objects;


/**
 * Googet patching is performed by running `googet update`.
 * 
 */
public final class GooSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooSettingsResponse Empty = new GooSettingsResponse();

    public GooSettingsResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GooSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GooSettingsResponse build() {
            return new GooSettingsResponse();
        }
    }
}
