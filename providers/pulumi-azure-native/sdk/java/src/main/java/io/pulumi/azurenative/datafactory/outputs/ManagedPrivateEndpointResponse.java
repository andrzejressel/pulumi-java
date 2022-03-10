// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ConnectionStatePropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedPrivateEndpointResponse {
    /**
     * The managed private endpoint connection state
     * 
     */
    private final @Nullable ConnectionStatePropertiesResponse connectionState;
    /**
     * Fully qualified domain names
     * 
     */
    private final @Nullable List<String> fqdns;
    /**
     * The groupId to which the managed private endpoint is created
     * 
     */
    private final @Nullable String groupId;
    /**
     * Denotes whether the managed private endpoint is reserved
     * 
     */
    private final Boolean isReserved;
    /**
     * The ARM resource ID of the resource to which the managed private endpoint is created
     * 
     */
    private final @Nullable String privateLinkResourceId;
    /**
     * The managed private endpoint provisioning state
     * 
     */
    private final String provisioningState;

    @OutputCustomType.Constructor
    private ManagedPrivateEndpointResponse(
        @OutputCustomType.Parameter("connectionState") @Nullable ConnectionStatePropertiesResponse connectionState,
        @OutputCustomType.Parameter("fqdns") @Nullable List<String> fqdns,
        @OutputCustomType.Parameter("groupId") @Nullable String groupId,
        @OutputCustomType.Parameter("isReserved") Boolean isReserved,
        @OutputCustomType.Parameter("privateLinkResourceId") @Nullable String privateLinkResourceId,
        @OutputCustomType.Parameter("provisioningState") String provisioningState) {
        this.connectionState = connectionState;
        this.fqdns = fqdns;
        this.groupId = groupId;
        this.isReserved = isReserved;
        this.privateLinkResourceId = privateLinkResourceId;
        this.provisioningState = provisioningState;
    }

    /**
     * The managed private endpoint connection state
     * 
    */
    public Optional<ConnectionStatePropertiesResponse> getConnectionState() {
        return Optional.ofNullable(this.connectionState);
    }
    /**
     * Fully qualified domain names
     * 
    */
    public List<String> getFqdns() {
        return this.fqdns == null ? List.of() : this.fqdns;
    }
    /**
     * The groupId to which the managed private endpoint is created
     * 
    */
    public Optional<String> getGroupId() {
        return Optional.ofNullable(this.groupId);
    }
    /**
     * Denotes whether the managed private endpoint is reserved
     * 
    */
    public Boolean getIsReserved() {
        return this.isReserved;
    }
    /**
     * The ARM resource ID of the resource to which the managed private endpoint is created
     * 
    */
    public Optional<String> getPrivateLinkResourceId() {
        return Optional.ofNullable(this.privateLinkResourceId);
    }
    /**
     * The managed private endpoint provisioning state
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedPrivateEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConnectionStatePropertiesResponse connectionState;
        private @Nullable List<String> fqdns;
        private @Nullable String groupId;
        private Boolean isReserved;
        private @Nullable String privateLinkResourceId;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedPrivateEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionState = defaults.connectionState;
    	      this.fqdns = defaults.fqdns;
    	      this.groupId = defaults.groupId;
    	      this.isReserved = defaults.isReserved;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setConnectionState(@Nullable ConnectionStatePropertiesResponse connectionState) {
            this.connectionState = connectionState;
            return this;
        }

        public Builder setFqdns(@Nullable List<String> fqdns) {
            this.fqdns = fqdns;
            return this;
        }

        public Builder setGroupId(@Nullable String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder setIsReserved(Boolean isReserved) {
            this.isReserved = Objects.requireNonNull(isReserved);
            return this;
        }

        public Builder setPrivateLinkResourceId(@Nullable String privateLinkResourceId) {
            this.privateLinkResourceId = privateLinkResourceId;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public ManagedPrivateEndpointResponse build() {
            return new ManagedPrivateEndpointResponse(connectionState, fqdns, groupId, isReserved, privateLinkResourceId, provisioningState);
        }
    }
}
