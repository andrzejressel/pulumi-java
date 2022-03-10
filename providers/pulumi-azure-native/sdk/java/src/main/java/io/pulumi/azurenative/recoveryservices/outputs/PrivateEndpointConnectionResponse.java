// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.PrivateEndpointResponse;
import io.pulumi.azurenative.recoveryservices.outputs.PrivateLinkServiceConnectionStateResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PrivateEndpointConnectionResponse {
    /**
     * Gets or sets private endpoint associated with the private endpoint connection
     * 
     */
    private final @Nullable PrivateEndpointResponse privateEndpoint;
    /**
     * Gets or sets private link service connection state
     * 
     */
    private final @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
    /**
     * Gets or sets provisioning state of the private endpoint connection
     * 
     */
    private final @Nullable String provisioningState;

    @OutputCustomType.Constructor
    private PrivateEndpointConnectionResponse(
        @OutputCustomType.Parameter("privateEndpoint") @Nullable PrivateEndpointResponse privateEndpoint,
        @OutputCustomType.Parameter("privateLinkServiceConnectionState") @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState,
        @OutputCustomType.Parameter("provisioningState") @Nullable String provisioningState) {
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
    }

    /**
     * Gets or sets private endpoint associated with the private endpoint connection
     * 
    */
    public Optional<PrivateEndpointResponse> getPrivateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * Gets or sets private link service connection state
     * 
    */
    public Optional<PrivateLinkServiceConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    /**
     * Gets or sets provisioning state of the private endpoint connection
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PrivateEndpointResponse privateEndpoint;
        private @Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
        private @Nullable String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setPrivateEndpoint(@Nullable PrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public PrivateEndpointConnectionResponse build() {
            return new PrivateEndpointConnectionResponse(privateEndpoint, privateLinkServiceConnectionState, provisioningState);
        }
    }
}
