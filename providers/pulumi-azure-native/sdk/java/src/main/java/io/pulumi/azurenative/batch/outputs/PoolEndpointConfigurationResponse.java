// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.azurenative.batch.outputs.InboundNatPoolResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class PoolEndpointConfigurationResponse {
    /**
     * The maximum number of inbound NAT pools per Batch pool is 5. If the maximum number of inbound NAT pools is exceeded the request fails with HTTP status code 400. This cannot be specified if the IPAddressProvisioningType is NoPublicIPAddresses.
     * 
     */
    private final List<InboundNatPoolResponse> inboundNatPools;

    @OutputCustomType.Constructor
    private PoolEndpointConfigurationResponse(@OutputCustomType.Parameter("inboundNatPools") List<InboundNatPoolResponse> inboundNatPools) {
        this.inboundNatPools = inboundNatPools;
    }

    /**
     * The maximum number of inbound NAT pools per Batch pool is 5. If the maximum number of inbound NAT pools is exceeded the request fails with HTTP status code 400. This cannot be specified if the IPAddressProvisioningType is NoPublicIPAddresses.
     * 
    */
    public List<InboundNatPoolResponse> getInboundNatPools() {
        return this.inboundNatPools;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PoolEndpointConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<InboundNatPoolResponse> inboundNatPools;

        public Builder() {
    	      // Empty
        }

        public Builder(PoolEndpointConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inboundNatPools = defaults.inboundNatPools;
        }

        public Builder setInboundNatPools(List<InboundNatPoolResponse> inboundNatPools) {
            this.inboundNatPools = Objects.requireNonNull(inboundNatPools);
            return this;
        }
        public PoolEndpointConfigurationResponse build() {
            return new PoolEndpointConfigurationResponse(inboundNatPools);
        }
    }
}
