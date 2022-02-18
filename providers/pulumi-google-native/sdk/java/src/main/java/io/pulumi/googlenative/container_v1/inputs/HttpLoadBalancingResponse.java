// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Configuration options for the HTTP (L7) load balancing controller addon, which makes it easy to set up HTTP load balancers for services in a cluster.
 * 
 */
public final class HttpLoadBalancingResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpLoadBalancingResponse Empty = new HttpLoadBalancingResponse();

    /**
     * Whether the HTTP Load Balancing controller is enabled in the cluster. When enabled, it runs a small pod in the cluster that manages the load balancers.
     * 
     */
    @InputImport(name="disabled", required=true)
    private final Boolean disabled;

    public Boolean getDisabled() {
        return this.disabled;
    }

    public HttpLoadBalancingResponse(Boolean disabled) {
        this.disabled = Objects.requireNonNull(disabled, "expected parameter 'disabled' to be non-null");
    }

    private HttpLoadBalancingResponse() {
        this.disabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpLoadBalancingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpLoadBalancingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder setDisabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }

        public HttpLoadBalancingResponse build() {
            return new HttpLoadBalancingResponse(disabled);
        }
    }
}
