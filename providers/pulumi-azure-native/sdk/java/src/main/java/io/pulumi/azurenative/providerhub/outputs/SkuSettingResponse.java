// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.azurenative.providerhub.outputs.SkuCapabilityResponse;
import io.pulumi.azurenative.providerhub.outputs.SkuCostResponse;
import io.pulumi.azurenative.providerhub.outputs.SkuLocationInfoResponse;
import io.pulumi.azurenative.providerhub.outputs.SkuSettingResponseCapacity;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SkuSettingResponse {
    private final @Nullable List<SkuCapabilityResponse> capabilities;
    private final @Nullable SkuSettingResponseCapacity capacity;
    private final @Nullable List<SkuCostResponse> costs;
    private final @Nullable String family;
    private final @Nullable String kind;
    private final @Nullable List<SkuLocationInfoResponse> locationInfo;
    private final @Nullable List<String> locations;
    private final String name;
    private final @Nullable List<String> requiredFeatures;
    private final @Nullable List<String> requiredQuotaIds;
    private final @Nullable String size;
    private final @Nullable String tier;

    @OutputCustomType.Constructor
    private SkuSettingResponse(
        @OutputCustomType.Parameter("capabilities") @Nullable List<SkuCapabilityResponse> capabilities,
        @OutputCustomType.Parameter("capacity") @Nullable SkuSettingResponseCapacity capacity,
        @OutputCustomType.Parameter("costs") @Nullable List<SkuCostResponse> costs,
        @OutputCustomType.Parameter("family") @Nullable String family,
        @OutputCustomType.Parameter("kind") @Nullable String kind,
        @OutputCustomType.Parameter("locationInfo") @Nullable List<SkuLocationInfoResponse> locationInfo,
        @OutputCustomType.Parameter("locations") @Nullable List<String> locations,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("requiredFeatures") @Nullable List<String> requiredFeatures,
        @OutputCustomType.Parameter("requiredQuotaIds") @Nullable List<String> requiredQuotaIds,
        @OutputCustomType.Parameter("size") @Nullable String size,
        @OutputCustomType.Parameter("tier") @Nullable String tier) {
        this.capabilities = capabilities;
        this.capacity = capacity;
        this.costs = costs;
        this.family = family;
        this.kind = kind;
        this.locationInfo = locationInfo;
        this.locations = locations;
        this.name = name;
        this.requiredFeatures = requiredFeatures;
        this.requiredQuotaIds = requiredQuotaIds;
        this.size = size;
        this.tier = tier;
    }

    public List<SkuCapabilityResponse> getCapabilities() {
        return this.capabilities == null ? List.of() : this.capabilities;
    }
    public Optional<SkuSettingResponseCapacity> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    public List<SkuCostResponse> getCosts() {
        return this.costs == null ? List.of() : this.costs;
    }
    public Optional<String> getFamily() {
        return Optional.ofNullable(this.family);
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public List<SkuLocationInfoResponse> getLocationInfo() {
        return this.locationInfo == null ? List.of() : this.locationInfo;
    }
    public List<String> getLocations() {
        return this.locations == null ? List.of() : this.locations;
    }
    public String getName() {
        return this.name;
    }
    public List<String> getRequiredFeatures() {
        return this.requiredFeatures == null ? List.of() : this.requiredFeatures;
    }
    public List<String> getRequiredQuotaIds() {
        return this.requiredQuotaIds == null ? List.of() : this.requiredQuotaIds;
    }
    public Optional<String> getSize() {
        return Optional.ofNullable(this.size);
    }
    public Optional<String> getTier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuSettingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SkuCapabilityResponse> capabilities;
        private @Nullable SkuSettingResponseCapacity capacity;
        private @Nullable List<SkuCostResponse> costs;
        private @Nullable String family;
        private @Nullable String kind;
        private @Nullable List<SkuLocationInfoResponse> locationInfo;
        private @Nullable List<String> locations;
        private String name;
        private @Nullable List<String> requiredFeatures;
        private @Nullable List<String> requiredQuotaIds;
        private @Nullable String size;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuSettingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilities = defaults.capabilities;
    	      this.capacity = defaults.capacity;
    	      this.costs = defaults.costs;
    	      this.family = defaults.family;
    	      this.kind = defaults.kind;
    	      this.locationInfo = defaults.locationInfo;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.requiredFeatures = defaults.requiredFeatures;
    	      this.requiredQuotaIds = defaults.requiredQuotaIds;
    	      this.size = defaults.size;
    	      this.tier = defaults.tier;
        }

        public Builder setCapabilities(@Nullable List<SkuCapabilityResponse> capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        public Builder setCapacity(@Nullable SkuSettingResponseCapacity capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setCosts(@Nullable List<SkuCostResponse> costs) {
            this.costs = costs;
            return this;
        }

        public Builder setFamily(@Nullable String family) {
            this.family = family;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setLocationInfo(@Nullable List<SkuLocationInfoResponse> locationInfo) {
            this.locationInfo = locationInfo;
            return this;
        }

        public Builder setLocations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRequiredFeatures(@Nullable List<String> requiredFeatures) {
            this.requiredFeatures = requiredFeatures;
            return this;
        }

        public Builder setRequiredQuotaIds(@Nullable List<String> requiredQuotaIds) {
            this.requiredQuotaIds = requiredQuotaIds;
            return this;
        }

        public Builder setSize(@Nullable String size) {
            this.size = size;
            return this;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }
        public SkuSettingResponse build() {
            return new SkuSettingResponse(capabilities, capacity, costs, family, kind, locationInfo, locations, name, requiredFeatures, requiredQuotaIds, size, tier);
        }
    }
}
