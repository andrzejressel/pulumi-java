// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BoolEqualsAdvancedFilterResponse {
    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    private final @Nullable String key;
    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is 'BoolEquals'.
     * 
     */
    private final String operatorType;
    /**
     * The boolean filter value.
     * 
     */
    private final @Nullable Boolean value;

    @OutputCustomType.Constructor
    private BoolEqualsAdvancedFilterResponse(
        @OutputCustomType.Parameter("key") @Nullable String key,
        @OutputCustomType.Parameter("operatorType") String operatorType,
        @OutputCustomType.Parameter("value") @Nullable Boolean value) {
        this.key = key;
        this.operatorType = operatorType;
        this.value = value;
    }

    /**
     * The field/property in the event based on which you want to filter.
     * 
    */
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }
    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is 'BoolEquals'.
     * 
    */
    public String getOperatorType() {
        return this.operatorType;
    }
    /**
     * The boolean filter value.
     * 
    */
    public Optional<Boolean> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BoolEqualsAdvancedFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private String operatorType;
        private @Nullable Boolean value;

        public Builder() {
    	      // Empty
        }

        public Builder(BoolEqualsAdvancedFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operatorType = defaults.operatorType;
    	      this.value = defaults.value;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setOperatorType(String operatorType) {
            this.operatorType = Objects.requireNonNull(operatorType);
            return this;
        }

        public Builder setValue(@Nullable Boolean value) {
            this.value = value;
            return this;
        }
        public BoolEqualsAdvancedFilterResponse build() {
            return new BoolEqualsAdvancedFilterResponse(key, operatorType, value);
        }
    }
}
