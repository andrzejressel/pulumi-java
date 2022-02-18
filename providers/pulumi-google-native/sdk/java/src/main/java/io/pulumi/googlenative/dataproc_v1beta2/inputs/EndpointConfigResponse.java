// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Endpoint config for this cluster
 * 
 */
public final class EndpointConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final EndpointConfigResponse Empty = new EndpointConfigResponse();

    /**
     * Optional. If true, enable http access to specific ports on the cluster from external sources. Defaults to false.
     * 
     */
    @InputImport(name="enableHttpPortAccess", required=true)
    private final Boolean enableHttpPortAccess;

    public Boolean getEnableHttpPortAccess() {
        return this.enableHttpPortAccess;
    }

    /**
     * The map of port descriptions to URLs. Will only be populated if enable_http_port_access is true.
     * 
     */
    @InputImport(name="httpPorts", required=true)
    private final Map<String,String> httpPorts;

    public Map<String,String> getHttpPorts() {
        return this.httpPorts;
    }

    public EndpointConfigResponse(
        Boolean enableHttpPortAccess,
        Map<String,String> httpPorts) {
        this.enableHttpPortAccess = Objects.requireNonNull(enableHttpPortAccess, "expected parameter 'enableHttpPortAccess' to be non-null");
        this.httpPorts = Objects.requireNonNull(httpPorts, "expected parameter 'httpPorts' to be non-null");
    }

    private EndpointConfigResponse() {
        this.enableHttpPortAccess = null;
        this.httpPorts = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableHttpPortAccess;
        private Map<String,String> httpPorts;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableHttpPortAccess = defaults.enableHttpPortAccess;
    	      this.httpPorts = defaults.httpPorts;
        }

        public Builder setEnableHttpPortAccess(Boolean enableHttpPortAccess) {
            this.enableHttpPortAccess = Objects.requireNonNull(enableHttpPortAccess);
            return this;
        }

        public Builder setHttpPorts(Map<String,String> httpPorts) {
            this.httpPorts = Objects.requireNonNull(httpPorts);
            return this;
        }

        public EndpointConfigResponse build() {
            return new EndpointConfigResponse(enableHttpPortAccess, httpPorts);
        }
    }
}
