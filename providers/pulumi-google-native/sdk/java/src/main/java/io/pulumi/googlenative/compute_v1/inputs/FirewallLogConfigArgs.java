// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.enums.FirewallLogConfigMetadata;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The available logging options for a firewall rule.
 * 
 */
public final class FirewallLogConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallLogConfigArgs Empty = new FirewallLogConfigArgs();

    /**
     * This field denotes whether to enable logging for a particular firewall rule.
     * 
     */
    @InputImport(name="enable")
    private final @Nullable Input<Boolean> enable;

    public Input<Boolean> getEnable() {
        return this.enable == null ? Input.empty() : this.enable;
    }

    /**
     * This field can only be specified for a particular firewall rule if logging is enabled for that rule. This field denotes whether to include or exclude metadata for firewall logs.
     * 
     */
    @InputImport(name="metadata")
    private final @Nullable Input<FirewallLogConfigMetadata> metadata;

    public Input<FirewallLogConfigMetadata> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    public FirewallLogConfigArgs(
        @Nullable Input<Boolean> enable,
        @Nullable Input<FirewallLogConfigMetadata> metadata) {
        this.enable = enable;
        this.metadata = metadata;
    }

    private FirewallLogConfigArgs() {
        this.enable = Input.empty();
        this.metadata = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enable;
        private @Nullable Input<FirewallLogConfigMetadata> metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallLogConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.metadata = defaults.metadata;
        }

        public Builder setEnable(@Nullable Input<Boolean> enable) {
            this.enable = enable;
            return this;
        }

        public Builder setEnable(@Nullable Boolean enable) {
            this.enable = Input.ofNullable(enable);
            return this;
        }

        public Builder setMetadata(@Nullable Input<FirewallLogConfigMetadata> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable FirewallLogConfigMetadata metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public FirewallLogConfigArgs build() {
            return new FirewallLogConfigArgs(enable, metadata);
        }
    }
}
