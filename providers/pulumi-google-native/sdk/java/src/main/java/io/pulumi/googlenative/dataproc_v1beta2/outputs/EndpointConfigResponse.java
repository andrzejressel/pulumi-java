// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class EndpointConfigResponse {
    /**
     * Optional. If true, enable http access to specific ports on the cluster from external sources. Defaults to false.
     * 
     */
    private final Boolean enableHttpPortAccess;
    /**
     * The map of port descriptions to URLs. Will only be populated if enable_http_port_access is true.
     * 
     */
    private final Map<String,String> httpPorts;

    @OutputCustomType.Constructor({"enableHttpPortAccess","httpPorts"})
    private EndpointConfigResponse(
        Boolean enableHttpPortAccess,
        Map<String,String> httpPorts) {
        this.enableHttpPortAccess = Objects.requireNonNull(enableHttpPortAccess);
        this.httpPorts = Objects.requireNonNull(httpPorts);
    }

    /**
     * Optional. If true, enable http access to specific ports on the cluster from external sources. Defaults to false.
     * 
     */
    public Boolean getEnableHttpPortAccess() {
        return this.enableHttpPortAccess;
    }
    /**
     * The map of port descriptions to URLs. Will only be populated if enable_http_port_access is true.
     * 
     */
    public Map<String,String> getHttpPorts() {
        return this.httpPorts;
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
