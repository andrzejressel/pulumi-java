// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The VPC Peering configuration is used to create VPC peering between Datastream and the consumer's VPC.
 * 
 */
public final class VpcPeeringConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final VpcPeeringConfigResponse Empty = new VpcPeeringConfigResponse();

    /**
     * A free subnet for peering. (CIDR of /29) TODO(b/172995841) add validators.
     * 
     */
    @InputImport(name="subnet", required=true)
    private final String subnet;

    public String getSubnet() {
        return this.subnet;
    }

    /**
     * Fully qualified name of the VPC that Datastream will peer to. Format: `projects/{project}/global/{networks}/{name}`
     * 
     */
    @InputImport(name="vpc", required=true)
    private final String vpc;

    public String getVpc() {
        return this.vpc;
    }

    public VpcPeeringConfigResponse(
        String subnet,
        String vpc) {
        this.subnet = Objects.requireNonNull(subnet, "expected parameter 'subnet' to be non-null");
        this.vpc = Objects.requireNonNull(vpc, "expected parameter 'vpc' to be non-null");
    }

    private VpcPeeringConfigResponse() {
        this.subnet = null;
        this.vpc = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcPeeringConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String subnet;
        private String vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcPeeringConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnet = defaults.subnet;
    	      this.vpc = defaults.vpc;
        }

        public Builder setSubnet(String subnet) {
            this.subnet = Objects.requireNonNull(subnet);
            return this;
        }

        public Builder setVpc(String vpc) {
            this.vpc = Objects.requireNonNull(vpc);
            return this;
        }

        public VpcPeeringConfigResponse build() {
            return new VpcPeeringConfigResponse(subnet, vpc);
        }
    }
}
