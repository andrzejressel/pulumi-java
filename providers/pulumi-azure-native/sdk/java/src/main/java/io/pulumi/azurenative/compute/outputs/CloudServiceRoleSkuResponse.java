// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CloudServiceRoleSkuResponse {
    /**
     * Specifies the number of role instances in the cloud service.
     * 
     */
    private final @Nullable Double capacity;
    /**
     * The sku name. NOTE: If the new SKU is not supported on the hardware the cloud service is currently on, you need to delete and recreate the cloud service or move back to the old sku.
     * 
     */
    private final @Nullable String name;
    /**
     * Specifies the tier of the cloud service. Possible Values are <br /><br /> **Standard** <br /><br /> **Basic**
     * 
     */
    private final @Nullable String tier;

    @OutputCustomType.Constructor
    private CloudServiceRoleSkuResponse(
        @OutputCustomType.Parameter("capacity") @Nullable Double capacity,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("tier") @Nullable String tier) {
        this.capacity = capacity;
        this.name = name;
        this.tier = tier;
    }

    /**
     * Specifies the number of role instances in the cloud service.
     * 
    */
    public Optional<Double> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * The sku name. NOTE: If the new SKU is not supported on the hardware the cloud service is currently on, you need to delete and recreate the cloud service or move back to the old sku.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Specifies the tier of the cloud service. Possible Values are <br /><br /> **Standard** <br /><br /> **Basic**
     * 
    */
    public Optional<String> getTier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceRoleSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double capacity;
        private @Nullable String name;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceRoleSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder setCapacity(@Nullable Double capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }
        public CloudServiceRoleSkuResponse build() {
            return new CloudServiceRoleSkuResponse(capacity, name, tier);
        }
    }
}
