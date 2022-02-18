// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.filestore.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceNetworkGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceNetworkGetArgs Empty = new InstanceNetworkGetArgs();

    /**
     * The network connect mode of the Filestore instance.
     * If not provided, the connect mode defaults to
     * DIRECT_PEERING.
     * Default value is `DIRECT_PEERING`.
     * Possible values are `DIRECT_PEERING` and `PRIVATE_SERVICE_ACCESS`.
     * 
     */
    @InputImport(name="connectMode")
    private final @Nullable Input<String> connectMode;

    public Input<String> getConnectMode() {
        return this.connectMode == null ? Input.empty() : this.connectMode;
    }

    /**
     * - 
     * A list of IPv4 or IPv6 addresses.
     * 
     */
    @InputImport(name="ipAddresses")
    private final @Nullable Input<List<String>> ipAddresses;

    public Input<List<String>> getIpAddresses() {
        return this.ipAddresses == null ? Input.empty() : this.ipAddresses;
    }

    /**
     * IP versions for which the instance has
     * IP addresses assigned.
     * Each value may be one of `ADDRESS_MODE_UNSPECIFIED`, `MODE_IPV4`, and `MODE_IPV6`.
     * 
     */
    @InputImport(name="modes", required=true)
    private final Input<List<String>> modes;

    public Input<List<String>> getModes() {
        return this.modes;
    }

    /**
     * The name of the GCE VPC network to which the
     * instance is connected.
     * 
     */
    @InputImport(name="network", required=true)
    private final Input<String> network;

    public Input<String> getNetwork() {
        return this.network;
    }

    /**
     * A /29 CIDR block that identifies the range of IP
     * addresses reserved for this instance.
     * 
     */
    @InputImport(name="reservedIpRange")
    private final @Nullable Input<String> reservedIpRange;

    public Input<String> getReservedIpRange() {
        return this.reservedIpRange == null ? Input.empty() : this.reservedIpRange;
    }

    public InstanceNetworkGetArgs(
        @Nullable Input<String> connectMode,
        @Nullable Input<List<String>> ipAddresses,
        Input<List<String>> modes,
        Input<String> network,
        @Nullable Input<String> reservedIpRange) {
        this.connectMode = connectMode;
        this.ipAddresses = ipAddresses;
        this.modes = Objects.requireNonNull(modes, "expected parameter 'modes' to be non-null");
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.reservedIpRange = reservedIpRange;
    }

    private InstanceNetworkGetArgs() {
        this.connectMode = Input.empty();
        this.ipAddresses = Input.empty();
        this.modes = Input.empty();
        this.network = Input.empty();
        this.reservedIpRange = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNetworkGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> connectMode;
        private @Nullable Input<List<String>> ipAddresses;
        private Input<List<String>> modes;
        private Input<String> network;
        private @Nullable Input<String> reservedIpRange;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNetworkGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectMode = defaults.connectMode;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.modes = defaults.modes;
    	      this.network = defaults.network;
    	      this.reservedIpRange = defaults.reservedIpRange;
        }

        public Builder setConnectMode(@Nullable Input<String> connectMode) {
            this.connectMode = connectMode;
            return this;
        }

        public Builder setConnectMode(@Nullable String connectMode) {
            this.connectMode = Input.ofNullable(connectMode);
            return this;
        }

        public Builder setIpAddresses(@Nullable Input<List<String>> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        public Builder setIpAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = Input.ofNullable(ipAddresses);
            return this;
        }

        public Builder setModes(Input<List<String>> modes) {
            this.modes = Objects.requireNonNull(modes);
            return this;
        }

        public Builder setModes(List<String> modes) {
            this.modes = Input.of(Objects.requireNonNull(modes));
            return this;
        }

        public Builder setNetwork(Input<String> network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Input.of(Objects.requireNonNull(network));
            return this;
        }

        public Builder setReservedIpRange(@Nullable Input<String> reservedIpRange) {
            this.reservedIpRange = reservedIpRange;
            return this;
        }

        public Builder setReservedIpRange(@Nullable String reservedIpRange) {
            this.reservedIpRange = Input.ofNullable(reservedIpRange);
            return this;
        }

        public InstanceNetworkGetArgs build() {
            return new InstanceNetworkGetArgs(connectMode, ipAddresses, modes, network, reservedIpRange);
        }
    }
}
