// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hardwaresecuritymodules.outputs;

import io.pulumi.azurenative.hardwaresecuritymodules.outputs.NetworkProfileResponse;
import io.pulumi.azurenative.hardwaresecuritymodules.outputs.SkuResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDedicatedHsmResult {
    /**
     * The Azure Resource Manager resource ID for the dedicated HSM.
     * 
     */
    private final String id;
    /**
     * The supported Azure location where the dedicated HSM should be created.
     * 
     */
    private final String location;
    /**
     * The name of the dedicated HSM.
     * 
     */
    private final String name;
    /**
     * Specifies the network interfaces of the dedicated hsm.
     * 
     */
    private final @Nullable NetworkProfileResponse networkProfile;
    /**
     * Provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * SKU details
     * 
     */
    private final SkuResponse sku;
    /**
     * This field will be used when RP does not support Availability zones.
     * 
     */
    private final @Nullable String stampId;
    /**
     * Resource Status Message.
     * 
     */
    private final String statusMessage;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The resource type of the dedicated HSM.
     * 
     */
    private final String type;
    /**
     * The Dedicated Hsm zones.
     * 
     */
    private final @Nullable List<String> zones;

    @OutputCustomType.Constructor
    private GetDedicatedHsmResult(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("networkProfile") @Nullable NetworkProfileResponse networkProfile,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("sku") SkuResponse sku,
        @OutputCustomType.Parameter("stampId") @Nullable String stampId,
        @OutputCustomType.Parameter("statusMessage") String statusMessage,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("zones") @Nullable List<String> zones) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.networkProfile = networkProfile;
        this.provisioningState = provisioningState;
        this.sku = sku;
        this.stampId = stampId;
        this.statusMessage = statusMessage;
        this.tags = tags;
        this.type = type;
        this.zones = zones;
    }

    /**
     * The Azure Resource Manager resource ID for the dedicated HSM.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The supported Azure location where the dedicated HSM should be created.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the dedicated HSM.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Specifies the network interfaces of the dedicated hsm.
     * 
    */
    public Optional<NetworkProfileResponse> getNetworkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }
    /**
     * Provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * SKU details
     * 
    */
    public SkuResponse getSku() {
        return this.sku;
    }
    /**
     * This field will be used when RP does not support Availability zones.
     * 
    */
    public Optional<String> getStampId() {
        return Optional.ofNullable(this.stampId);
    }
    /**
     * Resource Status Message.
     * 
    */
    public String getStatusMessage() {
        return this.statusMessage;
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The resource type of the dedicated HSM.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The Dedicated Hsm zones.
     * 
    */
    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDedicatedHsmResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private @Nullable NetworkProfileResponse networkProfile;
        private String provisioningState;
        private SkuResponse sku;
        private @Nullable String stampId;
        private String statusMessage;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDedicatedHsmResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkProfile = defaults.networkProfile;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.stampId = defaults.stampId;
    	      this.statusMessage = defaults.statusMessage;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zones = defaults.zones;
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

        public Builder setNetworkProfile(@Nullable NetworkProfileResponse networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setStampId(@Nullable String stampId) {
            this.stampId = stampId;
            return this;
        }

        public Builder setStatusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
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

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public GetDedicatedHsmResult build() {
            return new GetDedicatedHsmResult(id, location, name, networkProfile, provisioningState, sku, stampId, statusMessage, tags, type, zones);
        }
    }
}
