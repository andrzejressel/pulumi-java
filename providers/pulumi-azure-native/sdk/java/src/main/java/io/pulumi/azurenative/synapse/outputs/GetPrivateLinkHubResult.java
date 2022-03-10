// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.azurenative.synapse.outputs.PrivateEndpointConnectionForPrivateLinkHubBasicResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPrivateLinkHubResult {
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * List of private endpoint connections
     * 
     */
    private final List<PrivateEndpointConnectionForPrivateLinkHubBasicResponse> privateEndpointConnections;
    /**
     * PrivateLinkHub provisioning state
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetPrivateLinkHubResult(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("privateEndpointConnections") List<PrivateEndpointConnectionForPrivateLinkHubBasicResponse> privateEndpointConnections,
        @OutputCustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.privateEndpointConnections = privateEndpointConnections;
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * List of private endpoint connections
     * 
    */
    public List<PrivateEndpointConnectionForPrivateLinkHubBasicResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * PrivateLinkHub provisioning state
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateLinkHubResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private List<PrivateEndpointConnectionForPrivateLinkHubBasicResponse> privateEndpointConnections;
        private @Nullable String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateLinkHubResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateEndpointConnections(List<PrivateEndpointConnectionForPrivateLinkHubBasicResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetPrivateLinkHubResult build() {
            return new GetPrivateLinkHubResult(id, location, name, privateEndpointConnections, provisioningState, tags, type);
        }
    }
}
