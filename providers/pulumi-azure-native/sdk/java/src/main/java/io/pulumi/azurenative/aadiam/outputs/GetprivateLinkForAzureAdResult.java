// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aadiam.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetprivateLinkForAzureAdResult {
    /**
     * Flag indicating whether all tenants are allowed
     * 
     */
    private final @Nullable Boolean allTenants;
    /**
     * String Id used to locate any resource on Azure.
     * 
     */
    private final String id;
    /**
     * Name of this resource.
     * 
     */
    private final @Nullable String name;
    /**
     * Guid of the owner tenant
     * 
     */
    private final @Nullable String ownerTenantId;
    /**
     * Name of the resource group
     * 
     */
    private final @Nullable String resourceGroup;
    /**
     * Name of the private link policy resource
     * 
     */
    private final @Nullable String resourceName;
    /**
     * Subscription Identifier
     * 
     */
    private final @Nullable String subscriptionId;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The list of tenantIds.
     * 
     */
    private final @Nullable List<String> tenants;
    /**
     * Type of this resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetprivateLinkForAzureAdResult(
        @OutputCustomType.Parameter("allTenants") @Nullable Boolean allTenants,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("ownerTenantId") @Nullable String ownerTenantId,
        @OutputCustomType.Parameter("resourceGroup") @Nullable String resourceGroup,
        @OutputCustomType.Parameter("resourceName") @Nullable String resourceName,
        @OutputCustomType.Parameter("subscriptionId") @Nullable String subscriptionId,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("tenants") @Nullable List<String> tenants,
        @OutputCustomType.Parameter("type") String type) {
        this.allTenants = allTenants;
        this.id = id;
        this.name = name;
        this.ownerTenantId = ownerTenantId;
        this.resourceGroup = resourceGroup;
        this.resourceName = resourceName;
        this.subscriptionId = subscriptionId;
        this.tags = tags;
        this.tenants = tenants;
        this.type = type;
    }

    /**
     * Flag indicating whether all tenants are allowed
     * 
    */
    public Optional<Boolean> getAllTenants() {
        return Optional.ofNullable(this.allTenants);
    }
    /**
     * String Id used to locate any resource on Azure.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Name of this resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Guid of the owner tenant
     * 
    */
    public Optional<String> getOwnerTenantId() {
        return Optional.ofNullable(this.ownerTenantId);
    }
    /**
     * Name of the resource group
     * 
    */
    public Optional<String> getResourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    /**
     * Name of the private link policy resource
     * 
    */
    public Optional<String> getPropResourceName() {
        return Optional.ofNullable(this.resourceName);
    }
    /**
     * Subscription Identifier
     * 
    */
    public Optional<String> getSubscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The list of tenantIds.
     * 
    */
    public List<String> getTenants() {
        return this.tenants == null ? List.of() : this.tenants;
    }
    /**
     * Type of this resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetprivateLinkForAzureAdResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allTenants;
        private String id;
        private @Nullable String name;
        private @Nullable String ownerTenantId;
        private @Nullable String resourceGroup;
        private @Nullable String resourceName;
        private @Nullable String subscriptionId;
        private @Nullable Map<String,String> tags;
        private @Nullable List<String> tenants;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetprivateLinkForAzureAdResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allTenants = defaults.allTenants;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.ownerTenantId = defaults.ownerTenantId;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceName = defaults.resourceName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tags = defaults.tags;
    	      this.tenants = defaults.tenants;
    	      this.type = defaults.type;
        }

        public Builder setAllTenants(@Nullable Boolean allTenants) {
            this.allTenants = allTenants;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setOwnerTenantId(@Nullable String ownerTenantId) {
            this.ownerTenantId = ownerTenantId;
            return this;
        }

        public Builder setResourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder setResourceName(@Nullable String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder setSubscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTenants(@Nullable List<String> tenants) {
            this.tenants = tenants;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetprivateLinkForAzureAdResult build() {
            return new GetprivateLinkForAzureAdResult(allTenants, id, name, ownerTenantId, resourceGroup, resourceName, subscriptionId, tags, tenants, type);
        }
    }
}
