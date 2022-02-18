// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class AwsClusterNetworkingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsClusterNetworkingGetArgs Empty = new AwsClusterNetworkingGetArgs();

    /**
     * Required. All pods in the cluster are assigned an RFC1918 IPv4 address from these ranges. Only a single range is supported. This field cannot be changed after creation.
     * 
     */
    @InputImport(name="podAddressCidrBlocks", required=true)
    private final Input<List<String>> podAddressCidrBlocks;

    public Input<List<String>> getPodAddressCidrBlocks() {
        return this.podAddressCidrBlocks;
    }

    /**
     * Required. All services in the cluster are assigned an RFC1918 IPv4 address from these ranges. Only a single range is supported. This field cannot be changed after creation.
     * 
     */
    @InputImport(name="serviceAddressCidrBlocks", required=true)
    private final Input<List<String>> serviceAddressCidrBlocks;

    public Input<List<String>> getServiceAddressCidrBlocks() {
        return this.serviceAddressCidrBlocks;
    }

    /**
     * Required. The VPC associated with the cluster. All component clusters (i.e. control plane and node pools) run on a single VPC. This field cannot be changed after creation.
     * 
     */
    @InputImport(name="vpcId", required=true)
    private final Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId;
    }

    public AwsClusterNetworkingGetArgs(
        Input<List<String>> podAddressCidrBlocks,
        Input<List<String>> serviceAddressCidrBlocks,
        Input<String> vpcId) {
        this.podAddressCidrBlocks = Objects.requireNonNull(podAddressCidrBlocks, "expected parameter 'podAddressCidrBlocks' to be non-null");
        this.serviceAddressCidrBlocks = Objects.requireNonNull(serviceAddressCidrBlocks, "expected parameter 'serviceAddressCidrBlocks' to be non-null");
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private AwsClusterNetworkingGetArgs() {
        this.podAddressCidrBlocks = Input.empty();
        this.serviceAddressCidrBlocks = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterNetworkingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> podAddressCidrBlocks;
        private Input<List<String>> serviceAddressCidrBlocks;
        private Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterNetworkingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.podAddressCidrBlocks = defaults.podAddressCidrBlocks;
    	      this.serviceAddressCidrBlocks = defaults.serviceAddressCidrBlocks;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setPodAddressCidrBlocks(Input<List<String>> podAddressCidrBlocks) {
            this.podAddressCidrBlocks = Objects.requireNonNull(podAddressCidrBlocks);
            return this;
        }

        public Builder setPodAddressCidrBlocks(List<String> podAddressCidrBlocks) {
            this.podAddressCidrBlocks = Input.of(Objects.requireNonNull(podAddressCidrBlocks));
            return this;
        }

        public Builder setServiceAddressCidrBlocks(Input<List<String>> serviceAddressCidrBlocks) {
            this.serviceAddressCidrBlocks = Objects.requireNonNull(serviceAddressCidrBlocks);
            return this;
        }

        public Builder setServiceAddressCidrBlocks(List<String> serviceAddressCidrBlocks) {
            this.serviceAddressCidrBlocks = Input.of(Objects.requireNonNull(serviceAddressCidrBlocks));
            return this;
        }

        public Builder setVpcId(Input<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Input.of(Objects.requireNonNull(vpcId));
            return this;
        }

        public AwsClusterNetworkingGetArgs build() {
            return new AwsClusterNetworkingGetArgs(podAddressCidrBlocks, serviceAddressCidrBlocks, vpcId);
        }
    }
}
