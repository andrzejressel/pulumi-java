// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.azurenative.customerinsights.outputs.HubBillingInfoFormatResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetHubResult {
    /**
     * API endpoint URL of the hub.
     * 
     */
    private final String apiEndpoint;
    /**
     * Billing settings of the hub.
     * 
     */
    private final @Nullable HubBillingInfoFormatResponse hubBillingInfo;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Provisioning state of the hub.
     * 
     */
    private final String provisioningState;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The bit flags for enabled hub features. Bit 0 is set to 1 indicates graph is enabled, or disabled if set to 0. Bit 1 is set to 1 indicates the hub is disabled, or enabled if set to 0.
     * 
     */
    private final @Nullable Integer tenantFeatures;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * Web endpoint URL of the hub.
     * 
     */
    private final String webEndpoint;

    @OutputCustomType.Constructor
    private GetHubResult(
        @OutputCustomType.Parameter("apiEndpoint") String apiEndpoint,
        @OutputCustomType.Parameter("hubBillingInfo") @Nullable HubBillingInfoFormatResponse hubBillingInfo,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("tenantFeatures") @Nullable Integer tenantFeatures,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("webEndpoint") String webEndpoint) {
        this.apiEndpoint = apiEndpoint;
        this.hubBillingInfo = hubBillingInfo;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.tenantFeatures = tenantFeatures;
        this.type = type;
        this.webEndpoint = webEndpoint;
    }

    /**
     * API endpoint URL of the hub.
     * 
    */
    public String getApiEndpoint() {
        return this.apiEndpoint;
    }
    /**
     * Billing settings of the hub.
     * 
    */
    public Optional<HubBillingInfoFormatResponse> getHubBillingInfo() {
        return Optional.ofNullable(this.hubBillingInfo);
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state of the hub.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The bit flags for enabled hub features. Bit 0 is set to 1 indicates graph is enabled, or disabled if set to 0. Bit 1 is set to 1 indicates the hub is disabled, or enabled if set to 0.
     * 
    */
    public Optional<Integer> getTenantFeatures() {
        return Optional.ofNullable(this.tenantFeatures);
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Web endpoint URL of the hub.
     * 
    */
    public String getWebEndpoint() {
        return this.webEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHubResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiEndpoint;
        private @Nullable HubBillingInfoFormatResponse hubBillingInfo;
        private String id;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private @Nullable Integer tenantFeatures;
        private String type;
        private String webEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHubResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiEndpoint = defaults.apiEndpoint;
    	      this.hubBillingInfo = defaults.hubBillingInfo;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.tenantFeatures = defaults.tenantFeatures;
    	      this.type = defaults.type;
    	      this.webEndpoint = defaults.webEndpoint;
        }

        public Builder setApiEndpoint(String apiEndpoint) {
            this.apiEndpoint = Objects.requireNonNull(apiEndpoint);
            return this;
        }

        public Builder setHubBillingInfo(@Nullable HubBillingInfoFormatResponse hubBillingInfo) {
            this.hubBillingInfo = hubBillingInfo;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
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

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTenantFeatures(@Nullable Integer tenantFeatures) {
            this.tenantFeatures = tenantFeatures;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWebEndpoint(String webEndpoint) {
            this.webEndpoint = Objects.requireNonNull(webEndpoint);
            return this;
        }
        public GetHubResult build() {
            return new GetHubResult(apiEndpoint, hubBillingInfo, id, location, name, provisioningState, tags, tenantFeatures, type, webEndpoint);
        }
    }
}
