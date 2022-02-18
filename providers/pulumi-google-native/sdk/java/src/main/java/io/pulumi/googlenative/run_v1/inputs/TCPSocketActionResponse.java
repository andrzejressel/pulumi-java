// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Not supported by Cloud Run TCPSocketAction describes an action based on opening a socket
 * 
 */
public final class TCPSocketActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final TCPSocketActionResponse Empty = new TCPSocketActionResponse();

    /**
     * (Optional) Optional: Host name to connect to, defaults to the pod IP.
     * 
     */
    @InputImport(name="host", required=true)
    private final String host;

    public String getHost() {
        return this.host;
    }

    /**
     * Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. This field is currently limited to integer types only because of proto's inability to properly support the IntOrString golang type.
     * 
     */
    @InputImport(name="port", required=true)
    private final Integer port;

    public Integer getPort() {
        return this.port;
    }

    public TCPSocketActionResponse(
        String host,
        Integer port) {
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private TCPSocketActionResponse() {
        this.host = null;
        this.port = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TCPSocketActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(TCPSocketActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public TCPSocketActionResponse build() {
            return new TCPSocketActionResponse(host, port);
        }
    }
}
