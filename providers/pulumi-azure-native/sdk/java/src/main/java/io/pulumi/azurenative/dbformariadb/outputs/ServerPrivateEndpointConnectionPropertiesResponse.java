// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformariadb.outputs;

import io.pulumi.azurenative.dbformariadb.outputs.PrivateEndpointPropertyResponse;
import io.pulumi.azurenative.dbformariadb.outputs.ServerPrivateLinkServiceConnectionStatePropertyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServerPrivateEndpointConnectionPropertiesResponse {
    /**
     * Private endpoint which the connection belongs to.
     * 
     */
    private final @Nullable PrivateEndpointPropertyResponse privateEndpoint;
    /**
     * Connection state of the private endpoint connection.
     * 
     */
    private final @Nullable ServerPrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState;
    /**
     * State of the private endpoint connection.
     * 
     */
    private final String provisioningState;

    @OutputCustomType.Constructor
    private ServerPrivateEndpointConnectionPropertiesResponse(
        @OutputCustomType.Parameter("privateEndpoint") @Nullable PrivateEndpointPropertyResponse privateEndpoint,
        @OutputCustomType.Parameter("privateLinkServiceConnectionState") @Nullable ServerPrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState,
        @OutputCustomType.Parameter("provisioningState") String provisioningState) {
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
    }

    /**
     * Private endpoint which the connection belongs to.
     * 
    */
    public Optional<PrivateEndpointPropertyResponse> getPrivateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * Connection state of the private endpoint connection.
     * 
    */
    public Optional<ServerPrivateLinkServiceConnectionStatePropertyResponse> getPrivateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    /**
     * State of the private endpoint connection.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerPrivateEndpointConnectionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PrivateEndpointPropertyResponse privateEndpoint;
        private @Nullable ServerPrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerPrivateEndpointConnectionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setPrivateEndpoint(@Nullable PrivateEndpointPropertyResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable ServerPrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public ServerPrivateEndpointConnectionPropertiesResponse build() {
            return new ServerPrivateEndpointConnectionPropertiesResponse(privateEndpoint, privateLinkServiceConnectionState, provisioningState);
        }
    }
}
