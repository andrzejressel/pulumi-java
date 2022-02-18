// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Configuration of Shielded Nodes feature.
 * 
 */
public final class ShieldedNodesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ShieldedNodesResponse Empty = new ShieldedNodesResponse();

    /**
     * Whether Shielded Nodes features are enabled on all nodes in this cluster.
     * 
     */
    @InputImport(name="enabled", required=true)
    private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public ShieldedNodesResponse(Boolean enabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private ShieldedNodesResponse() {
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShieldedNodesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ShieldedNodesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public ShieldedNodesResponse build() {
            return new ShieldedNodesResponse(enabled);
        }
    }
}
