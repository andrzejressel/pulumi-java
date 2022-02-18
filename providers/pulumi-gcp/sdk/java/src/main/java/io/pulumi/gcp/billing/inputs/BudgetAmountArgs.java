// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.billing.inputs.BudgetAmountSpecifiedAmountArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetAmountArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetAmountArgs Empty = new BudgetAmountArgs();

    /**
     * Configures a budget amount that is automatically set to 100% of
     * last period's spend.
     * Boolean. Set value to true to use. Do not set to false, instead
     * use the `specified_amount` block.
     * 
     */
    @InputImport(name="lastPeriodAmount")
    private final @Nullable Input<Boolean> lastPeriodAmount;

    public Input<Boolean> getLastPeriodAmount() {
        return this.lastPeriodAmount == null ? Input.empty() : this.lastPeriodAmount;
    }

    /**
     * A specified amount to use as the budget. currencyCode is
     * optional. If specified, it must match the currency of the
     * billing account. The currencyCode is provided on output.
     * Structure is documented below.
     * 
     */
    @InputImport(name="specifiedAmount")
    private final @Nullable Input<BudgetAmountSpecifiedAmountArgs> specifiedAmount;

    public Input<BudgetAmountSpecifiedAmountArgs> getSpecifiedAmount() {
        return this.specifiedAmount == null ? Input.empty() : this.specifiedAmount;
    }

    public BudgetAmountArgs(
        @Nullable Input<Boolean> lastPeriodAmount,
        @Nullable Input<BudgetAmountSpecifiedAmountArgs> specifiedAmount) {
        this.lastPeriodAmount = lastPeriodAmount;
        this.specifiedAmount = specifiedAmount;
    }

    private BudgetAmountArgs() {
        this.lastPeriodAmount = Input.empty();
        this.specifiedAmount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetAmountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> lastPeriodAmount;
        private @Nullable Input<BudgetAmountSpecifiedAmountArgs> specifiedAmount;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetAmountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastPeriodAmount = defaults.lastPeriodAmount;
    	      this.specifiedAmount = defaults.specifiedAmount;
        }

        public Builder setLastPeriodAmount(@Nullable Input<Boolean> lastPeriodAmount) {
            this.lastPeriodAmount = lastPeriodAmount;
            return this;
        }

        public Builder setLastPeriodAmount(@Nullable Boolean lastPeriodAmount) {
            this.lastPeriodAmount = Input.ofNullable(lastPeriodAmount);
            return this;
        }

        public Builder setSpecifiedAmount(@Nullable Input<BudgetAmountSpecifiedAmountArgs> specifiedAmount) {
            this.specifiedAmount = specifiedAmount;
            return this;
        }

        public Builder setSpecifiedAmount(@Nullable BudgetAmountSpecifiedAmountArgs specifiedAmount) {
            this.specifiedAmount = Input.ofNullable(specifiedAmount);
            return this;
        }

        public BudgetAmountArgs build() {
            return new BudgetAmountArgs(lastPeriodAmount, specifiedAmount);
        }
    }
}
