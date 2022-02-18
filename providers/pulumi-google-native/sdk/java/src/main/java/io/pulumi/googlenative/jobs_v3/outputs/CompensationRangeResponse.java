// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.jobs_v3.outputs.MoneyResponse;
import java.util.Objects;

@OutputCustomType
public final class CompensationRangeResponse {
    /**
     * Optional. The maximum amount of compensation. If left empty, the value is set to a maximal compensation value and the currency code is set to match the currency code of min_compensation.
     * 
     */
    private final MoneyResponse maxCompensation;
    /**
     * Optional. The minimum amount of compensation. If left empty, the value is set to zero and the currency code is set to match the currency code of max_compensation.
     * 
     */
    private final MoneyResponse minCompensation;

    @OutputCustomType.Constructor({"maxCompensation","minCompensation"})
    private CompensationRangeResponse(
        MoneyResponse maxCompensation,
        MoneyResponse minCompensation) {
        this.maxCompensation = Objects.requireNonNull(maxCompensation);
        this.minCompensation = Objects.requireNonNull(minCompensation);
    }

    /**
     * Optional. The maximum amount of compensation. If left empty, the value is set to a maximal compensation value and the currency code is set to match the currency code of min_compensation.
     * 
     */
    public MoneyResponse getMaxCompensation() {
        return this.maxCompensation;
    }
    /**
     * Optional. The minimum amount of compensation. If left empty, the value is set to zero and the currency code is set to match the currency code of max_compensation.
     * 
     */
    public MoneyResponse getMinCompensation() {
        return this.minCompensation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompensationRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MoneyResponse maxCompensation;
        private MoneyResponse minCompensation;

        public Builder() {
    	      // Empty
        }

        public Builder(CompensationRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxCompensation = defaults.maxCompensation;
    	      this.minCompensation = defaults.minCompensation;
        }

        public Builder setMaxCompensation(MoneyResponse maxCompensation) {
            this.maxCompensation = Objects.requireNonNull(maxCompensation);
            return this;
        }

        public Builder setMinCompensation(MoneyResponse minCompensation) {
            this.minCompensation = Objects.requireNonNull(minCompensation);
            return this;
        }

        public CompensationRangeResponse build() {
            return new CompensationRangeResponse(maxCompensation, minCompensation);
        }
    }
}
