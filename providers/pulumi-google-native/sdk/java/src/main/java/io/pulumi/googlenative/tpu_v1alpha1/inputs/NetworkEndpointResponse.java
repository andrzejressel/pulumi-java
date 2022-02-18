// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v1alpha1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A network endpoint over which a TPU worker can be reached.
 * 
 */
public final class NetworkEndpointResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkEndpointResponse Empty = new NetworkEndpointResponse();

    /**
     * The IP address of this network endpoint.
     * 
     */
    @InputImport(name="ipAddress", required=true)
    private final String ipAddress;

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * The port of this network endpoint.
     * 
     */
    @InputImport(name="port", required=true)
    private final Integer port;

    public Integer getPort() {
        return this.port;
    }

    public NetworkEndpointResponse(
        String ipAddress,
        Integer port) {
        this.ipAddress = Objects.requireNonNull(ipAddress, "expected parameter 'ipAddress' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private NetworkEndpointResponse() {
        this.ipAddress = null;
        this.port = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipAddress;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.port = defaults.port;
        }

        public Builder setIpAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public NetworkEndpointResponse build() {
            return new NetworkEndpointResponse(ipAddress, port);
        }
    }
}
