// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PlanQuantityResponse {
    /**
     * The quantity added to the commitment plan at an interval specified by its allowance frequency.
     * 
     */
    private final Double allowance;
    /**
     * The quantity available to the plan the last time usage was calculated.
     * 
     */
    private final Double amount;
    /**
     * The Azure meter for usage against included quantities.
     * 
     */
    private final String includedQuantityMeter;
    /**
     * The Azure meter for usage which exceeds included quantities.
     * 
     */
    private final String overageMeter;

    @OutputCustomType.Constructor
    private PlanQuantityResponse(
        @OutputCustomType.Parameter("allowance") Double allowance,
        @OutputCustomType.Parameter("amount") Double amount,
        @OutputCustomType.Parameter("includedQuantityMeter") String includedQuantityMeter,
        @OutputCustomType.Parameter("overageMeter") String overageMeter) {
        this.allowance = allowance;
        this.amount = amount;
        this.includedQuantityMeter = includedQuantityMeter;
        this.overageMeter = overageMeter;
    }

    /**
     * The quantity added to the commitment plan at an interval specified by its allowance frequency.
     * 
    */
    public Double getAllowance() {
        return this.allowance;
    }
    /**
     * The quantity available to the plan the last time usage was calculated.
     * 
    */
    public Double getAmount() {
        return this.amount;
    }
    /**
     * The Azure meter for usage against included quantities.
     * 
    */
    public String getIncludedQuantityMeter() {
        return this.includedQuantityMeter;
    }
    /**
     * The Azure meter for usage which exceeds included quantities.
     * 
    */
    public String getOverageMeter() {
        return this.overageMeter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlanQuantityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double allowance;
        private Double amount;
        private String includedQuantityMeter;
        private String overageMeter;

        public Builder() {
    	      // Empty
        }

        public Builder(PlanQuantityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowance = defaults.allowance;
    	      this.amount = defaults.amount;
    	      this.includedQuantityMeter = defaults.includedQuantityMeter;
    	      this.overageMeter = defaults.overageMeter;
        }

        public Builder setAllowance(Double allowance) {
            this.allowance = Objects.requireNonNull(allowance);
            return this;
        }

        public Builder setAmount(Double amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }

        public Builder setIncludedQuantityMeter(String includedQuantityMeter) {
            this.includedQuantityMeter = Objects.requireNonNull(includedQuantityMeter);
            return this;
        }

        public Builder setOverageMeter(String overageMeter) {
            this.overageMeter = Objects.requireNonNull(overageMeter);
            return this;
        }
        public PlanQuantityResponse build() {
            return new PlanQuantityResponse(allowance, amount, includedQuantityMeter, overageMeter);
        }
    }
}
