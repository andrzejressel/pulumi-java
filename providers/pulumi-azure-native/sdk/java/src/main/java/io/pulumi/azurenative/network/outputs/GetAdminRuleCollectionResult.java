// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.NetworkManagerSecurityGroupItemResponse;
import io.pulumi.azurenative.network.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAdminRuleCollectionResult {
    /**
     * Groups for configuration
     * 
     */
    private final @Nullable List<NetworkManagerSecurityGroupItemResponse> appliesToGroups;
    /**
     * A description of the rule collection.
     * 
     */
    private final @Nullable String description;
    /**
     * A display name of the rule collection.
     * 
     */
    private final @Nullable String displayName;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The system metadata related to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetAdminRuleCollectionResult(
        @OutputCustomType.Parameter("appliesToGroups") @Nullable List<NetworkManagerSecurityGroupItemResponse> appliesToGroups,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("displayName") @Nullable String displayName,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("type") String type) {
        this.appliesToGroups = appliesToGroups;
        this.description = description;
        this.displayName = displayName;
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Groups for configuration
     * 
    */
    public List<NetworkManagerSecurityGroupItemResponse> getAppliesToGroups() {
        return this.appliesToGroups == null ? List.of() : this.appliesToGroups;
    }
    /**
     * A description of the rule collection.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * A display name of the rule collection.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The system metadata related to this resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAdminRuleCollectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<NetworkManagerSecurityGroupItemResponse> appliesToGroups;
        private @Nullable String description;
        private @Nullable String displayName;
        private String etag;
        private String id;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAdminRuleCollectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appliesToGroups = defaults.appliesToGroups;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setAppliesToGroups(@Nullable List<NetworkManagerSecurityGroupItemResponse> appliesToGroups) {
            this.appliesToGroups = appliesToGroups;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAdminRuleCollectionResult build() {
            return new GetAdminRuleCollectionResult(appliesToGroups, description, displayName, etag, id, name, provisioningState, systemData, type);
        }
    }
}
