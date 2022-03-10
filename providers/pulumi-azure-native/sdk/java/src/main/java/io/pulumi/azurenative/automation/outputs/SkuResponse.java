// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SkuResponse {
    /**
     * Gets or sets the SKU capacity.
     * 
     */
    private final @Nullable Integer capacity;
    /**
     * Gets or sets the SKU family.
     * 
     */
    private final @Nullable String family;
    /**
     * Gets or sets the SKU name of the account.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor
    private SkuResponse(
        @OutputCustomType.Parameter("capacity") @Nullable Integer capacity,
        @OutputCustomType.Parameter("family") @Nullable String family,
        @OutputCustomType.Parameter("name") String name) {
        this.capacity = capacity;
        this.family = family;
        this.name = name;
    }

    /**
     * Gets or sets the SKU capacity.
     * 
    */
    public Optional<Integer> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * Gets or sets the SKU family.
     * 
    */
    public Optional<String> getFamily() {
        return Optional.ofNullable(this.family);
    }
    /**
     * Gets or sets the SKU name of the account.
     * 
    */
    public String getName() {
        return this.name;
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

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
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
        public SkuResponse build() {
            return new SkuResponse(capacity, family, name);
        }
    }
}
