// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The VPC Peering configuration is used to create VPC peering between Datastream and the consumer's VPC.
 * 
 */
public final class VpcPeeringConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcPeeringConfigArgs Empty = new VpcPeeringConfigArgs();

    /**
     * A free subnet for peering. (CIDR of /29) TODO(b/172995841) add validators.
     * 
     */
    @InputImport(name="subnet", required=true)
    private final Input<String> subnet;

    public Input<String> getSubnet() {
        return this.subnet;
    }

    /**
     * fully qualified name of the VPC Datastream will peer to.
     * 
     */
    @InputImport(name="vpcName", required=true)
    private final Input<String> vpcName;

    public Input<String> getVpcName() {
        return this.vpcName;
    }

    public VpcPeeringConfigArgs(
        Input<String> subnet,
        Input<String> vpcName) {
        this.subnet = Objects.requireNonNull(subnet, "expected parameter 'subnet' to be non-null");
        this.vpcName = Objects.requireNonNull(vpcName, "expected parameter 'vpcName' to be non-null");
    }

    private VpcPeeringConfigArgs() {
        this.subnet = Input.empty();
        this.vpcName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcPeeringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> subnet;
        private Input<String> vpcName;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcPeeringConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnet = defaults.subnet;
    	      this.vpcName = defaults.vpcName;
        }

        public Builder setSubnet(Input<String> subnet) {
            this.subnet = Objects.requireNonNull(subnet);
            return this;
        }

        public Builder setSubnet(String subnet) {
            this.subnet = Input.of(Objects.requireNonNull(subnet));
            return this;
        }

        public Builder setVpcName(Input<String> vpcName) {
            this.vpcName = Objects.requireNonNull(vpcName);
            return this;
        }

        public Builder setVpcName(String vpcName) {
            this.vpcName = Input.of(Objects.requireNonNull(vpcName));
            return this;
        }

        public VpcPeeringConfigArgs build() {
            return new VpcPeeringConfigArgs(subnet, vpcName);
        }
    }
}
