// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.container.inputs.ClusterPrivateClusterConfigMasterGlobalAccessConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterPrivateClusterConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterPrivateClusterConfigArgs Empty = new ClusterPrivateClusterConfigArgs();

    /**
     * When `true`, the cluster's private
     * endpoint is used as the cluster endpoint and access through the public endpoint
     * is disabled. When `false`, either endpoint can be used. This field only applies
     * to private clusters, when `enable_private_nodes` is `true`.
     * 
     */
    @InputImport(name="enablePrivateEndpoint", required=true)
    private final Input<Boolean> enablePrivateEndpoint;

    public Input<Boolean> getEnablePrivateEndpoint() {
        return this.enablePrivateEndpoint;
    }

    /**
     * Enables the private cluster feature,
     * creating a private endpoint on the cluster. In a private cluster, nodes only
     * have RFC 1918 private addresses and communicate with the master's private
     * endpoint via private networking.
     * 
     */
    @InputImport(name="enablePrivateNodes")
    private final @Nullable Input<Boolean> enablePrivateNodes;

    public Input<Boolean> getEnablePrivateNodes() {
        return this.enablePrivateNodes == null ? Input.empty() : this.enablePrivateNodes;
    }

    /**
     * Controls cluster master global
     * access settings. If unset, the provider will no longer manage this field and will
     * not modify the previously-set value. Structure is documented below.
     * 
     */
    @InputImport(name="masterGlobalAccessConfig")
    private final @Nullable Input<ClusterPrivateClusterConfigMasterGlobalAccessConfigArgs> masterGlobalAccessConfig;

    public Input<ClusterPrivateClusterConfigMasterGlobalAccessConfigArgs> getMasterGlobalAccessConfig() {
        return this.masterGlobalAccessConfig == null ? Input.empty() : this.masterGlobalAccessConfig;
    }

    /**
     * The IP range in CIDR notation to use for
     * the hosted master network. This range will be used for assigning private IP
     * addresses to the cluster master(s) and the ILB VIP. This range must not overlap
     * with any other ranges in use within the cluster's network, and it must be a /28
     * subnet. See [Private Cluster Limitations](https://cloud.google.com/kubernetes-engine/docs/how-to/private-clusters#req_res_lim)
     * for more details. This field only applies to private clusters, when
     * `enable_private_nodes` is `true`.
     * 
     */
    @InputImport(name="masterIpv4CidrBlock")
    private final @Nullable Input<String> masterIpv4CidrBlock;

    public Input<String> getMasterIpv4CidrBlock() {
        return this.masterIpv4CidrBlock == null ? Input.empty() : this.masterIpv4CidrBlock;
    }

    /**
     * The name of the peering between this cluster and the Google owned VPC.
     * 
     */
    @InputImport(name="peeringName")
    private final @Nullable Input<String> peeringName;

    public Input<String> getPeeringName() {
        return this.peeringName == null ? Input.empty() : this.peeringName;
    }

    /**
     * The internal IP address of this cluster's master endpoint.
     * 
     */
    @InputImport(name="privateEndpoint")
    private final @Nullable Input<String> privateEndpoint;

    public Input<String> getPrivateEndpoint() {
        return this.privateEndpoint == null ? Input.empty() : this.privateEndpoint;
    }

    /**
     * The external IP address of this cluster's master endpoint.
     * 
     */
    @InputImport(name="publicEndpoint")
    private final @Nullable Input<String> publicEndpoint;

    public Input<String> getPublicEndpoint() {
        return this.publicEndpoint == null ? Input.empty() : this.publicEndpoint;
    }

    public ClusterPrivateClusterConfigArgs(
        Input<Boolean> enablePrivateEndpoint,
        @Nullable Input<Boolean> enablePrivateNodes,
        @Nullable Input<ClusterPrivateClusterConfigMasterGlobalAccessConfigArgs> masterGlobalAccessConfig,
        @Nullable Input<String> masterIpv4CidrBlock,
        @Nullable Input<String> peeringName,
        @Nullable Input<String> privateEndpoint,
        @Nullable Input<String> publicEndpoint) {
        this.enablePrivateEndpoint = Objects.requireNonNull(enablePrivateEndpoint, "expected parameter 'enablePrivateEndpoint' to be non-null");
        this.enablePrivateNodes = enablePrivateNodes;
        this.masterGlobalAccessConfig = masterGlobalAccessConfig;
        this.masterIpv4CidrBlock = masterIpv4CidrBlock;
        this.peeringName = peeringName;
        this.privateEndpoint = privateEndpoint;
        this.publicEndpoint = publicEndpoint;
    }

    private ClusterPrivateClusterConfigArgs() {
        this.enablePrivateEndpoint = Input.empty();
        this.enablePrivateNodes = Input.empty();
        this.masterGlobalAccessConfig = Input.empty();
        this.masterIpv4CidrBlock = Input.empty();
        this.peeringName = Input.empty();
        this.privateEndpoint = Input.empty();
        this.publicEndpoint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterPrivateClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> enablePrivateEndpoint;
        private @Nullable Input<Boolean> enablePrivateNodes;
        private @Nullable Input<ClusterPrivateClusterConfigMasterGlobalAccessConfigArgs> masterGlobalAccessConfig;
        private @Nullable Input<String> masterIpv4CidrBlock;
        private @Nullable Input<String> peeringName;
        private @Nullable Input<String> privateEndpoint;
        private @Nullable Input<String> publicEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterPrivateClusterConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enablePrivateEndpoint = defaults.enablePrivateEndpoint;
    	      this.enablePrivateNodes = defaults.enablePrivateNodes;
    	      this.masterGlobalAccessConfig = defaults.masterGlobalAccessConfig;
    	      this.masterIpv4CidrBlock = defaults.masterIpv4CidrBlock;
    	      this.peeringName = defaults.peeringName;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.publicEndpoint = defaults.publicEndpoint;
        }

        public Builder setEnablePrivateEndpoint(Input<Boolean> enablePrivateEndpoint) {
            this.enablePrivateEndpoint = Objects.requireNonNull(enablePrivateEndpoint);
            return this;
        }

        public Builder setEnablePrivateEndpoint(Boolean enablePrivateEndpoint) {
            this.enablePrivateEndpoint = Input.of(Objects.requireNonNull(enablePrivateEndpoint));
            return this;
        }

        public Builder setEnablePrivateNodes(@Nullable Input<Boolean> enablePrivateNodes) {
            this.enablePrivateNodes = enablePrivateNodes;
            return this;
        }

        public Builder setEnablePrivateNodes(@Nullable Boolean enablePrivateNodes) {
            this.enablePrivateNodes = Input.ofNullable(enablePrivateNodes);
            return this;
        }

        public Builder setMasterGlobalAccessConfig(@Nullable Input<ClusterPrivateClusterConfigMasterGlobalAccessConfigArgs> masterGlobalAccessConfig) {
            this.masterGlobalAccessConfig = masterGlobalAccessConfig;
            return this;
        }

        public Builder setMasterGlobalAccessConfig(@Nullable ClusterPrivateClusterConfigMasterGlobalAccessConfigArgs masterGlobalAccessConfig) {
            this.masterGlobalAccessConfig = Input.ofNullable(masterGlobalAccessConfig);
            return this;
        }

        public Builder setMasterIpv4CidrBlock(@Nullable Input<String> masterIpv4CidrBlock) {
            this.masterIpv4CidrBlock = masterIpv4CidrBlock;
            return this;
        }

        public Builder setMasterIpv4CidrBlock(@Nullable String masterIpv4CidrBlock) {
            this.masterIpv4CidrBlock = Input.ofNullable(masterIpv4CidrBlock);
            return this;
        }

        public Builder setPeeringName(@Nullable Input<String> peeringName) {
            this.peeringName = peeringName;
            return this;
        }

        public Builder setPeeringName(@Nullable String peeringName) {
            this.peeringName = Input.ofNullable(peeringName);
            return this;
        }

        public Builder setPrivateEndpoint(@Nullable Input<String> privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateEndpoint(@Nullable String privateEndpoint) {
            this.privateEndpoint = Input.ofNullable(privateEndpoint);
            return this;
        }

        public Builder setPublicEndpoint(@Nullable Input<String> publicEndpoint) {
            this.publicEndpoint = publicEndpoint;
            return this;
        }

        public Builder setPublicEndpoint(@Nullable String publicEndpoint) {
            this.publicEndpoint = Input.ofNullable(publicEndpoint);
            return this;
        }

        public ClusterPrivateClusterConfigArgs build() {
            return new ClusterPrivateClusterConfigArgs(enablePrivateEndpoint, enablePrivateNodes, masterGlobalAccessConfig, masterIpv4CidrBlock, peeringName, privateEndpoint, publicEndpoint);
        }
    }
}
