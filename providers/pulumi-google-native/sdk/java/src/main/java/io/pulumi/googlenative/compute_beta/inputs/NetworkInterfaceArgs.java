// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.enums.NetworkInterfaceNicType;
import io.pulumi.googlenative.compute_beta.enums.NetworkInterfaceStackType;
import io.pulumi.googlenative.compute_beta.inputs.AccessConfigArgs;
import io.pulumi.googlenative.compute_beta.inputs.AliasIpRangeArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A network interface resource attached to an instance.
 * 
 */
public final class NetworkInterfaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceArgs Empty = new NetworkInterfaceArgs();

    /**
     * An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
     * 
     */
    @InputImport(name="accessConfigs")
    private final @Nullable Input<List<AccessConfigArgs>> accessConfigs;

    public Input<List<AccessConfigArgs>> getAccessConfigs() {
        return this.accessConfigs == null ? Input.empty() : this.accessConfigs;
    }

    /**
     * An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
     * 
     */
    @InputImport(name="aliasIpRanges")
    private final @Nullable Input<List<AliasIpRangeArgs>> aliasIpRanges;

    public Input<List<AliasIpRangeArgs>> getAliasIpRanges() {
        return this.aliasIpRanges == null ? Input.empty() : this.aliasIpRanges;
    }

    /**
     * An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
     * 
     */
    @InputImport(name="ipv6AccessConfigs")
    private final @Nullable Input<List<AccessConfigArgs>> ipv6AccessConfigs;

    public Input<List<AccessConfigArgs>> getIpv6AccessConfigs() {
        return this.ipv6AccessConfigs == null ? Input.empty() : this.ipv6AccessConfigs;
    }

    /**
     * An IPv6 internal network address for this network interface.
     * 
     */
    @InputImport(name="ipv6Address")
    private final @Nullable Input<String> ipv6Address;

    public Input<String> getIpv6Address() {
        return this.ipv6Address == null ? Input.empty() : this.ipv6Address;
    }

    /**
     * URL of the VPC network resource for this instance. When creating an instance, if neither the network nor the subnetwork is specified, the default network global/networks/default is used. If the selected project doesn't have the default network, you must specify a network or subnet. If the network is not specified but the subnetwork is specified, the network is inferred. If you specify this property, you can specify the network as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/global/networks/ network - projects/project/global/networks/network - global/networks/default
     * 
     */
    @InputImport(name="network")
    private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * An IPv4 internal IP address to assign to the instance for this network interface. If not specified by the user, an unused internal IP is assigned by the system.
     * 
     */
    @InputImport(name="networkIP")
    private final @Nullable Input<String> networkIP;

    public Input<String> getNetworkIP() {
        return this.networkIP == null ? Input.empty() : this.networkIP;
    }

    /**
     * The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
     * 
     */
    @InputImport(name="nicType")
    private final @Nullable Input<NetworkInterfaceNicType> nicType;

    public Input<NetworkInterfaceNicType> getNicType() {
        return this.nicType == null ? Input.empty() : this.nicType;
    }

    /**
     * The networking queue count that's specified by users for the network interface. Both Rx and Tx queues will be set to this number. It'll be empty if not specified by the users.
     * 
     */
    @InputImport(name="queueCount")
    private final @Nullable Input<Integer> queueCount;

    public Input<Integer> getQueueCount() {
        return this.queueCount == null ? Input.empty() : this.queueCount;
    }

    /**
     * The stack type for this network interface to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used. This field can be both set at instance creation and update network interface operations.
     * 
     */
    @InputImport(name="stackType")
    private final @Nullable Input<NetworkInterfaceStackType> stackType;

    public Input<NetworkInterfaceStackType> getStackType() {
        return this.stackType == null ? Input.empty() : this.stackType;
    }

    /**
     * The URL of the Subnetwork resource for this instance. If the network resource is in legacy mode, do not specify this field. If the network is in auto subnet mode, specifying the subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is required. If you specify this field, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork - regions/region/subnetworks/subnetwork
     * 
     */
    @InputImport(name="subnetwork")
    private final @Nullable Input<String> subnetwork;

    public Input<String> getSubnetwork() {
        return this.subnetwork == null ? Input.empty() : this.subnetwork;
    }

    public NetworkInterfaceArgs(
        @Nullable Input<List<AccessConfigArgs>> accessConfigs,
        @Nullable Input<List<AliasIpRangeArgs>> aliasIpRanges,
        @Nullable Input<List<AccessConfigArgs>> ipv6AccessConfigs,
        @Nullable Input<String> ipv6Address,
        @Nullable Input<String> network,
        @Nullable Input<String> networkIP,
        @Nullable Input<NetworkInterfaceNicType> nicType,
        @Nullable Input<Integer> queueCount,
        @Nullable Input<NetworkInterfaceStackType> stackType,
        @Nullable Input<String> subnetwork) {
        this.accessConfigs = accessConfigs;
        this.aliasIpRanges = aliasIpRanges;
        this.ipv6AccessConfigs = ipv6AccessConfigs;
        this.ipv6Address = ipv6Address;
        this.network = network;
        this.networkIP = networkIP;
        this.nicType = nicType;
        this.queueCount = queueCount;
        this.stackType = stackType;
        this.subnetwork = subnetwork;
    }

    private NetworkInterfaceArgs() {
        this.accessConfigs = Input.empty();
        this.aliasIpRanges = Input.empty();
        this.ipv6AccessConfigs = Input.empty();
        this.ipv6Address = Input.empty();
        this.network = Input.empty();
        this.networkIP = Input.empty();
        this.nicType = Input.empty();
        this.queueCount = Input.empty();
        this.stackType = Input.empty();
        this.subnetwork = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AccessConfigArgs>> accessConfigs;
        private @Nullable Input<List<AliasIpRangeArgs>> aliasIpRanges;
        private @Nullable Input<List<AccessConfigArgs>> ipv6AccessConfigs;
        private @Nullable Input<String> ipv6Address;
        private @Nullable Input<String> network;
        private @Nullable Input<String> networkIP;
        private @Nullable Input<NetworkInterfaceNicType> nicType;
        private @Nullable Input<Integer> queueCount;
        private @Nullable Input<NetworkInterfaceStackType> stackType;
        private @Nullable Input<String> subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessConfigs = defaults.accessConfigs;
    	      this.aliasIpRanges = defaults.aliasIpRanges;
    	      this.ipv6AccessConfigs = defaults.ipv6AccessConfigs;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.network = defaults.network;
    	      this.networkIP = defaults.networkIP;
    	      this.nicType = defaults.nicType;
    	      this.queueCount = defaults.queueCount;
    	      this.stackType = defaults.stackType;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder setAccessConfigs(@Nullable Input<List<AccessConfigArgs>> accessConfigs) {
            this.accessConfigs = accessConfigs;
            return this;
        }

        public Builder setAccessConfigs(@Nullable List<AccessConfigArgs> accessConfigs) {
            this.accessConfigs = Input.ofNullable(accessConfigs);
            return this;
        }

        public Builder setAliasIpRanges(@Nullable Input<List<AliasIpRangeArgs>> aliasIpRanges) {
            this.aliasIpRanges = aliasIpRanges;
            return this;
        }

        public Builder setAliasIpRanges(@Nullable List<AliasIpRangeArgs> aliasIpRanges) {
            this.aliasIpRanges = Input.ofNullable(aliasIpRanges);
            return this;
        }

        public Builder setIpv6AccessConfigs(@Nullable Input<List<AccessConfigArgs>> ipv6AccessConfigs) {
            this.ipv6AccessConfigs = ipv6AccessConfigs;
            return this;
        }

        public Builder setIpv6AccessConfigs(@Nullable List<AccessConfigArgs> ipv6AccessConfigs) {
            this.ipv6AccessConfigs = Input.ofNullable(ipv6AccessConfigs);
            return this;
        }

        public Builder setIpv6Address(@Nullable Input<String> ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }

        public Builder setIpv6Address(@Nullable String ipv6Address) {
            this.ipv6Address = Input.ofNullable(ipv6Address);
            return this;
        }

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setNetworkIP(@Nullable Input<String> networkIP) {
            this.networkIP = networkIP;
            return this;
        }

        public Builder setNetworkIP(@Nullable String networkIP) {
            this.networkIP = Input.ofNullable(networkIP);
            return this;
        }

        public Builder setNicType(@Nullable Input<NetworkInterfaceNicType> nicType) {
            this.nicType = nicType;
            return this;
        }

        public Builder setNicType(@Nullable NetworkInterfaceNicType nicType) {
            this.nicType = Input.ofNullable(nicType);
            return this;
        }

        public Builder setQueueCount(@Nullable Input<Integer> queueCount) {
            this.queueCount = queueCount;
            return this;
        }

        public Builder setQueueCount(@Nullable Integer queueCount) {
            this.queueCount = Input.ofNullable(queueCount);
            return this;
        }

        public Builder setStackType(@Nullable Input<NetworkInterfaceStackType> stackType) {
            this.stackType = stackType;
            return this;
        }

        public Builder setStackType(@Nullable NetworkInterfaceStackType stackType) {
            this.stackType = Input.ofNullable(stackType);
            return this;
        }

        public Builder setSubnetwork(@Nullable Input<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }

        public Builder setSubnetwork(@Nullable String subnetwork) {
            this.subnetwork = Input.ofNullable(subnetwork);
            return this;
        }

        public NetworkInterfaceArgs build() {
            return new NetworkInterfaceArgs(accessConfigs, aliasIpRanges, ipv6AccessConfigs, ipv6Address, network, networkIP, nicType, queueCount, stackType, subnetwork);
        }
    }
}
