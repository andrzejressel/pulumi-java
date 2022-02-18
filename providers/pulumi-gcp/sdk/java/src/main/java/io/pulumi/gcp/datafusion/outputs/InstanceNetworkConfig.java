// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datafusion.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class InstanceNetworkConfig {
    /**
     * The IP range in CIDR notation to use for the managed Data Fusion instance
     * nodes. This range must not overlap with any other ranges used in the Data Fusion instance network.
     * 
     */
    private final String ipAllocation;
    /**
     * Name of the network in the project with which the tenant project
     * will be peered for executing pipelines. In case of shared VPC where the network resides in another host
     * project the network should specified in the form of projects/{host-project-id}/global/networks/{network}
     * 
     */
    private final String network;

    @OutputCustomType.Constructor({"ipAllocation","network"})
    private InstanceNetworkConfig(
        String ipAllocation,
        String network) {
        this.ipAllocation = Objects.requireNonNull(ipAllocation);
        this.network = Objects.requireNonNull(network);
    }

    /**
     * The IP range in CIDR notation to use for the managed Data Fusion instance
     * nodes. This range must not overlap with any other ranges used in the Data Fusion instance network.
     * 
     */
    public String getIpAllocation() {
        return this.ipAllocation;
    }
    /**
     * Name of the network in the project with which the tenant project
     * will be peered for executing pipelines. In case of shared VPC where the network resides in another host
     * project the network should specified in the form of projects/{host-project-id}/global/networks/{network}
     * 
     */
    public String getNetwork() {
        return this.network;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNetworkConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipAllocation;
        private String network;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAllocation = defaults.ipAllocation;
    	      this.network = defaults.network;
        }

        public Builder setIpAllocation(String ipAllocation) {
            this.ipAllocation = Objects.requireNonNull(ipAllocation);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public InstanceNetworkConfig build() {
            return new InstanceNetworkConfig(ipAllocation, network);
        }
    }
}
