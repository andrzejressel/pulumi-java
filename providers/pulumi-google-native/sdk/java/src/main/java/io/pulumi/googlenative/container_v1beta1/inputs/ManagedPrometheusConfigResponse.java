// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * ManagedPrometheusConfig defines the configuration for Google Cloud Managed Service for Prometheus.
 * 
 */
public final class ManagedPrometheusConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedPrometheusConfigResponse Empty = new ManagedPrometheusConfigResponse();

    /**
     * Enable Managed Collection.
     * 
     */
    @InputImport(name="enabled", required=true)
    private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public ManagedPrometheusConfigResponse(Boolean enabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private ManagedPrometheusConfigResponse() {
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedPrometheusConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedPrometheusConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public ManagedPrometheusConfigResponse build() {
            return new ManagedPrometheusConfigResponse(enabled);
        }
    }
}
