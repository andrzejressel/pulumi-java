// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IntegrationRuntimeCustomerVirtualNetworkResponse {
    /**
     * The ID of subnet to which Azure-SSIS integration runtime will join.
     * 
     */
    private final @Nullable String subnetId;

    @OutputCustomType.Constructor
    private IntegrationRuntimeCustomerVirtualNetworkResponse(@OutputCustomType.Parameter("subnetId") @Nullable String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * The ID of subnet to which Azure-SSIS integration runtime will join.
     * 
    */
    public Optional<String> getSubnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeCustomerVirtualNetworkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeCustomerVirtualNetworkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public IntegrationRuntimeCustomerVirtualNetworkResponse build() {
            return new IntegrationRuntimeCustomerVirtualNetworkResponse(subnetId);
        }
    }
}
