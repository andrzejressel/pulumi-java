// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VpcPeeringConfigResponse {
    /**
     * A free subnet for peering. (CIDR of /29) TODO(b/172995841) add validators.
     * 
     */
    private final String subnet;
    /**
     * fully qualified name of the VPC Datastream will peer to.
     * 
     */
    private final String vpcName;

    @OutputCustomType.Constructor({"subnet","vpcName"})
    private VpcPeeringConfigResponse(
        String subnet,
        String vpcName) {
        this.subnet = Objects.requireNonNull(subnet);
        this.vpcName = Objects.requireNonNull(vpcName);
    }

    /**
     * A free subnet for peering. (CIDR of /29) TODO(b/172995841) add validators.
     * 
     */
    public String getSubnet() {
        return this.subnet;
    }
    /**
     * fully qualified name of the VPC Datastream will peer to.
     * 
     */
    public String getVpcName() {
        return this.vpcName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcPeeringConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String subnet;
        private String vpcName;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcPeeringConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnet = defaults.subnet;
    	      this.vpcName = defaults.vpcName;
        }

        public Builder setSubnet(String subnet) {
            this.subnet = Objects.requireNonNull(subnet);
            return this;
        }

        public Builder setVpcName(String vpcName) {
            this.vpcName = Objects.requireNonNull(vpcName);
            return this;
        }

        public VpcPeeringConfigResponse build() {
            return new VpcPeeringConfigResponse(subnet, vpcName);
        }
    }
}
