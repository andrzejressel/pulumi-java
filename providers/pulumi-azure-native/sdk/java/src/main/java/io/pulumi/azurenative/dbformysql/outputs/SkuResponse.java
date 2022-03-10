// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SkuResponse {
    /**
     * The scale up/out capacity, representing server's compute units.
     * 
     */
    private final @Nullable Integer capacity;
    /**
     * The family of hardware.
     * 
     */
    private final @Nullable String family;
    /**
     * The name of the sku, typically, tier + family + cores, e.g. B_Gen4_1, GP_Gen5_8.
     * 
     */
    private final String name;
    /**
     * The size code, to be interpreted by resource as appropriate.
     * 
     */
    private final @Nullable String size;
    /**
     * The tier of the particular SKU, e.g. Basic.
     * 
     */
    private final @Nullable String tier;

    @OutputCustomType.Constructor
    private SkuResponse(
        @OutputCustomType.Parameter("capacity") @Nullable Integer capacity,
        @OutputCustomType.Parameter("family") @Nullable String family,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("size") @Nullable String size,
        @OutputCustomType.Parameter("tier") @Nullable String tier) {
        this.capacity = capacity;
        this.family = family;
        this.name = name;
        this.size = size;
        this.tier = tier;
    }

    /**
     * The scale up/out capacity, representing server's compute units.
     * 
    */
    public Optional<Integer> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * The family of hardware.
     * 
    */
    public Optional<String> getFamily() {
        return Optional.ofNullable(this.family);
    }
    /**
     * The name of the sku, typically, tier + family + cores, e.g. B_Gen4_1, GP_Gen5_8.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The size code, to be interpreted by resource as appropriate.
     * 
    */
    public Optional<String> getSize() {
        return Optional.ofNullable(this.size);
    }
    /**
     * The tier of the particular SKU, e.g. Basic.
     * 
    */
    public Optional<String> getTier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private @Nullable String family;
        private String name;
        private @Nullable String size;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.tier = defaults.tier;
        }

        public Builder setCapacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setFamily(@Nullable String family) {
            this.family = family;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
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
        public SkuResponse build() {
            return new SkuResponse(capacity, family, name, size, tier);
        }
    }
}
