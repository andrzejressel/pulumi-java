// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.container_v1beta1.outputs.PrivateClusterMasterGlobalAccessConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PrivateClusterConfigResponse {
    /**
     * Whether the master's internal IP address is used as the cluster endpoint.
     * 
     */
    private final Boolean enablePrivateEndpoint;
    /**
     * Whether nodes have internal IP addresses only. If enabled, all nodes are given only RFC 1918 private addresses and communicate with the master via private networking.
     * 
     */
    private final Boolean enablePrivateNodes;
    /**
     * Controls master global access settings.
     * 
     */
    private final PrivateClusterMasterGlobalAccessConfigResponse masterGlobalAccessConfig;
    /**
     * The IP range in CIDR notation to use for the hosted master network. This range will be used for assigning internal IP addresses to the master or set of masters, as well as the ILB VIP. This range must not overlap with any other ranges in use within the cluster's network.
     * 
     */
    private final String masterIpv4CidrBlock;
    /**
     * The peering name in the customer VPC used by this cluster.
     * 
     */
    private final String peeringName;
    /**
     * The internal IP address of this cluster's master endpoint.
     * 
     */
    private final String privateEndpoint;
    /**
     * The external IP address of this cluster's master endpoint.
     * 
     */
    private final String publicEndpoint;

    @OutputCustomType.Constructor({"enablePrivateEndpoint","enablePrivateNodes","masterGlobalAccessConfig","masterIpv4CidrBlock","peeringName","privateEndpoint","publicEndpoint"})
    private PrivateClusterConfigResponse(
        Boolean enablePrivateEndpoint,
        Boolean enablePrivateNodes,
        PrivateClusterMasterGlobalAccessConfigResponse masterGlobalAccessConfig,
        String masterIpv4CidrBlock,
        String peeringName,
        String privateEndpoint,
        String publicEndpoint) {
        this.enablePrivateEndpoint = Objects.requireNonNull(enablePrivateEndpoint);
        this.enablePrivateNodes = Objects.requireNonNull(enablePrivateNodes);
        this.masterGlobalAccessConfig = Objects.requireNonNull(masterGlobalAccessConfig);
        this.masterIpv4CidrBlock = Objects.requireNonNull(masterIpv4CidrBlock);
        this.peeringName = Objects.requireNonNull(peeringName);
        this.privateEndpoint = Objects.requireNonNull(privateEndpoint);
        this.publicEndpoint = Objects.requireNonNull(publicEndpoint);
    }

    /**
     * Whether the master's internal IP address is used as the cluster endpoint.
     * 
     */
    public Boolean getEnablePrivateEndpoint() {
        return this.enablePrivateEndpoint;
    }
    /**
     * Whether nodes have internal IP addresses only. If enabled, all nodes are given only RFC 1918 private addresses and communicate with the master via private networking.
     * 
     */
    public Boolean getEnablePrivateNodes() {
        return this.enablePrivateNodes;
    }
    /**
     * Controls master global access settings.
     * 
     */
    public PrivateClusterMasterGlobalAccessConfigResponse getMasterGlobalAccessConfig() {
        return this.masterGlobalAccessConfig;
    }
    /**
     * The IP range in CIDR notation to use for the hosted master network. This range will be used for assigning internal IP addresses to the master or set of masters, as well as the ILB VIP. This range must not overlap with any other ranges in use within the cluster's network.
     * 
     */
    public String getMasterIpv4CidrBlock() {
        return this.masterIpv4CidrBlock;
    }
    /**
     * The peering name in the customer VPC used by this cluster.
     * 
     */
    public String getPeeringName() {
        return this.peeringName;
    }
    /**
     * The internal IP address of this cluster's master endpoint.
     * 
     */
    public String getPrivateEndpoint() {
        return this.privateEndpoint;
    }
    /**
     * The external IP address of this cluster's master endpoint.
     * 
     */
    public String getPublicEndpoint() {
        return this.publicEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateClusterConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enablePrivateEndpoint;
        private Boolean enablePrivateNodes;
        private PrivateClusterMasterGlobalAccessConfigResponse masterGlobalAccessConfig;
        private String masterIpv4CidrBlock;
        private String peeringName;
        private String privateEndpoint;
        private String publicEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateClusterConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enablePrivateEndpoint = defaults.enablePrivateEndpoint;
    	      this.enablePrivateNodes = defaults.enablePrivateNodes;
    	      this.masterGlobalAccessConfig = defaults.masterGlobalAccessConfig;
    	      this.masterIpv4CidrBlock = defaults.masterIpv4CidrBlock;
    	      this.peeringName = defaults.peeringName;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.publicEndpoint = defaults.publicEndpoint;
        }

        public Builder setEnablePrivateEndpoint(Boolean enablePrivateEndpoint) {
            this.enablePrivateEndpoint = Objects.requireNonNull(enablePrivateEndpoint);
            return this;
        }

        public Builder setEnablePrivateNodes(Boolean enablePrivateNodes) {
            this.enablePrivateNodes = Objects.requireNonNull(enablePrivateNodes);
            return this;
        }

        public Builder setMasterGlobalAccessConfig(PrivateClusterMasterGlobalAccessConfigResponse masterGlobalAccessConfig) {
            this.masterGlobalAccessConfig = Objects.requireNonNull(masterGlobalAccessConfig);
            return this;
        }

        public Builder setMasterIpv4CidrBlock(String masterIpv4CidrBlock) {
            this.masterIpv4CidrBlock = Objects.requireNonNull(masterIpv4CidrBlock);
            return this;
        }

        public Builder setPeeringName(String peeringName) {
            this.peeringName = Objects.requireNonNull(peeringName);
            return this;
        }

        public Builder setPrivateEndpoint(String privateEndpoint) {
            this.privateEndpoint = Objects.requireNonNull(privateEndpoint);
            return this;
        }

        public Builder setPublicEndpoint(String publicEndpoint) {
            this.publicEndpoint = Objects.requireNonNull(publicEndpoint);
            return this;
        }

        public PrivateClusterConfigResponse build() {
            return new PrivateClusterConfigResponse(enablePrivateEndpoint, enablePrivateNodes, masterGlobalAccessConfig, masterIpv4CidrBlock, peeringName, privateEndpoint, publicEndpoint);
        }
    }
}
