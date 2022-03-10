// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SqlManagedInstanceSkuResponse {
    /**
     * If the SKU supports scale out/in then the capacity integer should be included. If scale out/in is not possible for the resource this may be omitted.
     * 
     */
    private final @Nullable Integer capacity;
    /**
     * Whether dev/test is enabled. When the dev field is set to true, the resource is used for dev/test purpose.
     * 
     */
    private final @Nullable Boolean dev;
    /**
     * If the service has different generations of hardware, for the same SKU, then that can be captured here.
     * 
     */
    private final @Nullable String family;
    /**
     * The name of the SKU.  It is typically a letter+number code
     * 
     */
    private final String name;
    /**
     * The SKU size. When the name field is the combination of tier and some other value, this would be the standalone code.
     * 
     */
    private final @Nullable String size;
    /**
     * This field is required to be implemented by the Resource Provider if the service has more than one tier.
     * 
     */
    private final @Nullable String tier;

    @OutputCustomType.Constructor
    private SqlManagedInstanceSkuResponse(
        @OutputCustomType.Parameter("capacity") @Nullable Integer capacity,
        @OutputCustomType.Parameter("dev") @Nullable Boolean dev,
        @OutputCustomType.Parameter("family") @Nullable String family,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("size") @Nullable String size,
        @OutputCustomType.Parameter("tier") @Nullable String tier) {
        this.capacity = capacity;
        this.dev = dev;
        this.family = family;
        this.name = name;
        this.size = size;
        this.tier = tier;
    }

    /**
     * If the SKU supports scale out/in then the capacity integer should be included. If scale out/in is not possible for the resource this may be omitted.
     * 
    */
    public Optional<Integer> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * Whether dev/test is enabled. When the dev field is set to true, the resource is used for dev/test purpose.
     * 
    */
    public Optional<Boolean> getDev() {
        return Optional.ofNullable(this.dev);
    }
    /**
     * If the service has different generations of hardware, for the same SKU, then that can be captured here.
     * 
    */
    public Optional<String> getFamily() {
        return Optional.ofNullable(this.family);
    }
    /**
     * The name of the SKU.  It is typically a letter+number code
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The SKU size. When the name field is the combination of tier and some other value, this would be the standalone code.
     * 
    */
    public Optional<String> getSize() {
        return Optional.ofNullable(this.size);
    }
    /**
     * This field is required to be implemented by the Resource Provider if the service has more than one tier.
     * 
    */
    public Optional<String> getTier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlManagedInstanceSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private @Nullable Boolean dev;
        private @Nullable String family;
        private String name;
        private @Nullable String size;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlManagedInstanceSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.dev = defaults.dev;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.tier = defaults.tier;
        }

        public Builder setCapacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setDev(@Nullable Boolean dev) {
            this.dev = dev;
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
        public SqlManagedInstanceSkuResponse build() {
            return new SqlManagedInstanceSkuResponse(capacity, dev, family, name, size, tier);
        }
    }
}
