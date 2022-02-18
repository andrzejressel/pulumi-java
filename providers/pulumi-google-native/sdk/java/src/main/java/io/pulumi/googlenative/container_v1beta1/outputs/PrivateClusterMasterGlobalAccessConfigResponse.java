// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class PrivateClusterMasterGlobalAccessConfigResponse {
    /**
     * Whenever master is accessible globally or not.
     * 
     */
    private final Boolean enabled;

    @OutputCustomType.Constructor({"enabled"})
    private PrivateClusterMasterGlobalAccessConfigResponse(Boolean enabled) {
        this.enabled = Objects.requireNonNull(enabled);
    }

    /**
     * Whenever master is accessible globally or not.
     * 
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateClusterMasterGlobalAccessConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateClusterMasterGlobalAccessConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public PrivateClusterMasterGlobalAccessConfigResponse build() {
            return new PrivateClusterMasterGlobalAccessConfigResponse(enabled);
        }
    }
}
