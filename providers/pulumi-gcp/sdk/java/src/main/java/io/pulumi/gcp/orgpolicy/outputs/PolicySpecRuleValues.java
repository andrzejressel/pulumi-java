// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.orgpolicy.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class PolicySpecRuleValues {
    /**
     * List of values allowed at this resource.
     * 
     */
    private final @Nullable List<String> allowedValues;
    /**
     * List of values denied at this resource.
     * 
     */
    private final @Nullable List<String> deniedValues;

    @OutputCustomType.Constructor({"allowedValues","deniedValues"})
    private PolicySpecRuleValues(
        @Nullable List<String> allowedValues,
        @Nullable List<String> deniedValues) {
        this.allowedValues = allowedValues;
        this.deniedValues = deniedValues;
    }

    /**
     * List of values allowed at this resource.
     * 
     */
    public List<String> getAllowedValues() {
        return this.allowedValues == null ? List.of() : this.allowedValues;
    }
    /**
     * List of values denied at this resource.
     * 
     */
    public List<String> getDeniedValues() {
        return this.deniedValues == null ? List.of() : this.deniedValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicySpecRuleValues defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedValues;
        private @Nullable List<String> deniedValues;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicySpecRuleValues defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
    	      this.deniedValues = defaults.deniedValues;
        }

        public Builder setAllowedValues(@Nullable List<String> allowedValues) {
            this.allowedValues = allowedValues;
            return this;
        }

        public Builder setDeniedValues(@Nullable List<String> deniedValues) {
            this.deniedValues = deniedValues;
            return this;
        }

        public PolicySpecRuleValues build() {
            return new PolicySpecRuleValues(allowedValues, deniedValues);
        }
    }
}
