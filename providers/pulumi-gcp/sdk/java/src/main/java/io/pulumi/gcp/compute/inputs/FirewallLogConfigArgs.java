// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FirewallLogConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallLogConfigArgs Empty = new FirewallLogConfigArgs();

    /**
     * This field denotes whether to include or exclude metadata for firewall logs.
     * Possible values are `EXCLUDE_ALL_METADATA` and `INCLUDE_ALL_METADATA`.
     * 
     */
    @InputImport(name="metadata", required=true)
    private final Input<String> metadata;

    public Input<String> getMetadata() {
        return this.metadata;
    }

    public FirewallLogConfigArgs(Input<String> metadata) {
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
    }

    private FirewallLogConfigArgs() {
        this.metadata = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallLogConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
        }

        public Builder setMetadata(Input<String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setMetadata(String metadata) {
            this.metadata = Input.of(Objects.requireNonNull(metadata));
            return this;
        }

        public FirewallLogConfigArgs build() {
            return new FirewallLogConfigArgs(metadata);
        }
    }
}
