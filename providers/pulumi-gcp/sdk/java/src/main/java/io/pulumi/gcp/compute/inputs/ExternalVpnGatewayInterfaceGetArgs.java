// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExternalVpnGatewayInterfaceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExternalVpnGatewayInterfaceGetArgs Empty = new ExternalVpnGatewayInterfaceGetArgs();

    /**
     * The numeric ID for this interface. Allowed values are based on the redundancy type
     * of this external VPN gateway
     * * `0 - SINGLE_IP_INTERNALLY_REDUNDANT`
     * * `0, 1 - TWO_IPS_REDUNDANCY`
     * * `0, 1, 2, 3 - FOUR_IPS_REDUNDANCY`
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<Integer> id;

    public Input<Integer> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * IP address of the interface in the external VPN gateway.
     * Only IPv4 is supported. This IP address can be either from
     * your on-premise gateway or another Cloud provider's VPN gateway,
     * it cannot be an IP address from Google Compute Engine.
     * 
     */
    @InputImport(name="ipAddress")
    private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    public ExternalVpnGatewayInterfaceGetArgs(
        @Nullable Input<Integer> id,
        @Nullable Input<String> ipAddress) {
        this.id = id;
        this.ipAddress = ipAddress;
    }

    private ExternalVpnGatewayInterfaceGetArgs() {
        this.id = Input.empty();
        this.ipAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalVpnGatewayInterfaceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> id;
        private @Nullable Input<String> ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalVpnGatewayInterfaceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder setId(@Nullable Input<Integer> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable Integer id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setIpAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public ExternalVpnGatewayInterfaceGetArgs build() {
            return new ExternalVpnGatewayInterfaceGetArgs(id, ipAddress);
        }
    }
}
