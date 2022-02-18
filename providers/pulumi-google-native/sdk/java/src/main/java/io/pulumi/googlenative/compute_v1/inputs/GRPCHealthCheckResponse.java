// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GRPCHealthCheckResponse extends io.pulumi.resources.InvokeArgs {

    public static final GRPCHealthCheckResponse Empty = new GRPCHealthCheckResponse();

    /**
     * The gRPC service name for the health check. This field is optional. The value of grpc_service_name has the following meanings by convention: - Empty service_name means the overall status of all services at the backend. - Non-empty service_name means the health of that gRPC service, as defined by the owner of the service. The grpc_service_name can only be ASCII.
     * 
     */
    @InputImport(name="grpcServiceName", required=true)
    private final String grpcServiceName;

    public String getGrpcServiceName() {
        return this.grpcServiceName;
    }

    /**
     * The port number for the health check request. Must be specified if port_name and port_specification are not set or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
     * 
     */
    @InputImport(name="port", required=true)
    private final Integer port;

    public Integer getPort() {
        return this.port;
    }

    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence. The port_name should conform to RFC1035.
     * 
     */
    @InputImport(name="portName", required=true)
    private final String portName;

    public String getPortName() {
        return this.portName;
    }

    /**
     * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, gRPC health check follows behavior specified in port and portName fields.
     * 
     */
    @InputImport(name="portSpecification", required=true)
    private final String portSpecification;

    public String getPortSpecification() {
        return this.portSpecification;
    }

    public GRPCHealthCheckResponse(
        String grpcServiceName,
        Integer port,
        String portName,
        String portSpecification) {
        this.grpcServiceName = Objects.requireNonNull(grpcServiceName, "expected parameter 'grpcServiceName' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.portName = Objects.requireNonNull(portName, "expected parameter 'portName' to be non-null");
        this.portSpecification = Objects.requireNonNull(portSpecification, "expected parameter 'portSpecification' to be non-null");
    }

    private GRPCHealthCheckResponse() {
        this.grpcServiceName = null;
        this.port = null;
        this.portName = null;
        this.portSpecification = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GRPCHealthCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String grpcServiceName;
        private Integer port;
        private String portName;
        private String portSpecification;

        public Builder() {
    	      // Empty
        }

        public Builder(GRPCHealthCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.grpcServiceName = defaults.grpcServiceName;
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
        }

        public Builder setGrpcServiceName(String grpcServiceName) {
            this.grpcServiceName = Objects.requireNonNull(grpcServiceName);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setPortName(String portName) {
            this.portName = Objects.requireNonNull(portName);
            return this;
        }

        public Builder setPortSpecification(String portSpecification) {
            this.portSpecification = Objects.requireNonNull(portSpecification);
            return this;
        }

        public GRPCHealthCheckResponse build() {
            return new GRPCHealthCheckResponse(grpcServiceName, port, portName, portSpecification);
        }
    }
}
