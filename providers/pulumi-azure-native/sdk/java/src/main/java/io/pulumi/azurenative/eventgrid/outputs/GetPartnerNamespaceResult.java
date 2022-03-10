// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.azurenative.eventgrid.outputs.InboundIpRuleResponse;
import io.pulumi.azurenative.eventgrid.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.eventgrid.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPartnerNamespaceResult {
    /**
     * This boolean is used to enable or disable local auth. Default value is false. When the property is set to true, only AAD token will be used to authenticate if user is allowed to publish to the partner namespace.
     * 
     */
    private final @Nullable Boolean disableLocalAuth;
    /**
     * Endpoint for the partner namespace.
     * 
     */
    private final String endpoint;
    /**
     * Fully qualified identifier of the resource.
     * 
     */
    private final String id;
    /**
     * This can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     * 
     */
    private final @Nullable List<InboundIpRuleResponse> inboundIpRules;
    /**
     * Location of the resource.
     * 
     */
    private final String location;
    /**
     * Name of the resource.
     * 
     */
    private final String name;
    /**
     * The fully qualified ARM Id of the partner registration that should be associated with this partner namespace. This takes the following format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/partnerRegistrations/{partnerRegistrationName}.
     * 
     */
    private final @Nullable String partnerRegistrationFullyQualifiedId;
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * Provisioning state of the partner namespace.
     * 
     */
    private final String provisioningState;
    /**
     * This determines if traffic is allowed over public network. By default it is enabled.
     * You can further restrict to specific IPs by configuring <seealso cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PartnerNamespaceProperties.InboundIpRules" />
     * 
     */
    private final @Nullable String publicNetworkAccess;
    /**
     * The system metadata relating to Partner Namespace resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetPartnerNamespaceResult(
        @OutputCustomType.Parameter("disableLocalAuth") @Nullable Boolean disableLocalAuth,
        @OutputCustomType.Parameter("endpoint") String endpoint,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("inboundIpRules") @Nullable List<InboundIpRuleResponse> inboundIpRules,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("partnerRegistrationFullyQualifiedId") @Nullable String partnerRegistrationFullyQualifiedId,
        @OutputCustomType.Parameter("privateEndpointConnections") List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("publicNetworkAccess") @Nullable String publicNetworkAccess,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type) {
        this.disableLocalAuth = disableLocalAuth;
        this.endpoint = endpoint;
        this.id = id;
        this.inboundIpRules = inboundIpRules;
        this.location = location;
        this.name = name;
        this.partnerRegistrationFullyQualifiedId = partnerRegistrationFullyQualifiedId;
        this.privateEndpointConnections = privateEndpointConnections;
        this.provisioningState = provisioningState;
        this.publicNetworkAccess = publicNetworkAccess;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * This boolean is used to enable or disable local auth. Default value is false. When the property is set to true, only AAD token will be used to authenticate if user is allowed to publish to the partner namespace.
     * 
    */
    public Optional<Boolean> getDisableLocalAuth() {
        return Optional.ofNullable(this.disableLocalAuth);
    }
    /**
     * Endpoint for the partner namespace.
     * 
    */
    public String getEndpoint() {
        return this.endpoint;
    }
    /**
     * Fully qualified identifier of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * This can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     * 
    */
    public List<InboundIpRuleResponse> getInboundIpRules() {
        return this.inboundIpRules == null ? List.of() : this.inboundIpRules;
    }
    /**
     * Location of the resource.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The fully qualified ARM Id of the partner registration that should be associated with this partner namespace. This takes the following format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/partnerRegistrations/{partnerRegistrationName}.
     * 
    */
    public Optional<String> getPartnerRegistrationFullyQualifiedId() {
        return Optional.ofNullable(this.partnerRegistrationFullyQualifiedId);
    }
    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Provisioning state of the partner namespace.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * This determines if traffic is allowed over public network. By default it is enabled.
     * You can further restrict to specific IPs by configuring <seealso cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PartnerNamespaceProperties.InboundIpRules" />
     * 
    */
    public Optional<String> getPublicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    /**
     * The system metadata relating to Partner Namespace resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Tags of the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPartnerNamespaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean disableLocalAuth;
        private String endpoint;
        private String id;
        private @Nullable List<InboundIpRuleResponse> inboundIpRules;
        private String location;
        private String name;
        private @Nullable String partnerRegistrationFullyQualifiedId;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPartnerNamespaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableLocalAuth = defaults.disableLocalAuth;
    	      this.endpoint = defaults.endpoint;
    	      this.id = defaults.id;
    	      this.inboundIpRules = defaults.inboundIpRules;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.partnerRegistrationFullyQualifiedId = defaults.partnerRegistrationFullyQualifiedId;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setDisableLocalAuth(@Nullable Boolean disableLocalAuth) {
            this.disableLocalAuth = disableLocalAuth;
            return this;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInboundIpRules(@Nullable List<InboundIpRuleResponse> inboundIpRules) {
            this.inboundIpRules = inboundIpRules;
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

        public Builder setPartnerRegistrationFullyQualifiedId(@Nullable String partnerRegistrationFullyQualifiedId) {
            this.partnerRegistrationFullyQualifiedId = partnerRegistrationFullyQualifiedId;
            return this;
        }

        public Builder setPrivateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
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
        public GetPartnerNamespaceResult build() {
            return new GetPartnerNamespaceResult(disableLocalAuth, endpoint, id, inboundIpRules, location, name, partnerRegistrationFullyQualifiedId, privateEndpointConnections, provisioningState, publicNetworkAccess, systemData, tags, type);
        }
    }
}
