// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.billing.inputs.BudgetAllUpdatesRuleArgs;
import io.pulumi.gcp.billing.inputs.BudgetAmountArgs;
import io.pulumi.gcp.billing.inputs.BudgetBudgetFilterArgs;
import io.pulumi.gcp.billing.inputs.BudgetThresholdRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetArgs Empty = new BudgetArgs();

    /**
     * Defines notifications that are sent on every update to the
     * billing account's spend, regardless of the thresholds defined
     * using threshold rules.
     * Structure is documented below.
     * 
     */
    @InputImport(name="allUpdatesRule")
    private final @Nullable Input<BudgetAllUpdatesRuleArgs> allUpdatesRule;

    public Input<BudgetAllUpdatesRuleArgs> getAllUpdatesRule() {
        return this.allUpdatesRule == null ? Input.empty() : this.allUpdatesRule;
    }

    /**
     * The budgeted amount for each usage period.
     * Structure is documented below.
     * 
     */
    @InputImport(name="amount", required=true)
    private final Input<BudgetAmountArgs> amount;

    public Input<BudgetAmountArgs> getAmount() {
        return this.amount;
    }

    /**
     * ID of the billing account to set a budget on.
     * 
     */
    @InputImport(name="billingAccount", required=true)
    private final Input<String> billingAccount;

    public Input<String> getBillingAccount() {
        return this.billingAccount;
    }

    /**
     * Filters that define which resources are used to compute the actual
     * spend against the budget.
     * Structure is documented below.
     * 
     */
    @InputImport(name="budgetFilter")
    private final @Nullable Input<BudgetBudgetFilterArgs> budgetFilter;

    public Input<BudgetBudgetFilterArgs> getBudgetFilter() {
        return this.budgetFilter == null ? Input.empty() : this.budgetFilter;
    }

    /**
     * User data for display name in UI. Must be <= 60 chars.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Rules that trigger alerts (notifications of thresholds being
     * crossed) when spend exceeds the specified percentages of the
     * budget.
     * Structure is documented below.
     * 
     */
    @InputImport(name="thresholdRules", required=true)
    private final Input<List<BudgetThresholdRuleArgs>> thresholdRules;

    public Input<List<BudgetThresholdRuleArgs>> getThresholdRules() {
        return this.thresholdRules;
    }

    public BudgetArgs(
        @Nullable Input<BudgetAllUpdatesRuleArgs> allUpdatesRule,
        Input<BudgetAmountArgs> amount,
        Input<String> billingAccount,
        @Nullable Input<BudgetBudgetFilterArgs> budgetFilter,
        @Nullable Input<String> displayName,
        Input<List<BudgetThresholdRuleArgs>> thresholdRules) {
        this.allUpdatesRule = allUpdatesRule;
        this.amount = Objects.requireNonNull(amount, "expected parameter 'amount' to be non-null");
        this.billingAccount = Objects.requireNonNull(billingAccount, "expected parameter 'billingAccount' to be non-null");
        this.budgetFilter = budgetFilter;
        this.displayName = displayName;
        this.thresholdRules = Objects.requireNonNull(thresholdRules, "expected parameter 'thresholdRules' to be non-null");
    }

    private BudgetArgs() {
        this.allUpdatesRule = Input.empty();
        this.amount = Input.empty();
        this.billingAccount = Input.empty();
        this.budgetFilter = Input.empty();
        this.displayName = Input.empty();
        this.thresholdRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BudgetAllUpdatesRuleArgs> allUpdatesRule;
        private Input<BudgetAmountArgs> amount;
        private Input<String> billingAccount;
        private @Nullable Input<BudgetBudgetFilterArgs> budgetFilter;
        private @Nullable Input<String> displayName;
        private Input<List<BudgetThresholdRuleArgs>> thresholdRules;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allUpdatesRule = defaults.allUpdatesRule;
    	      this.amount = defaults.amount;
    	      this.billingAccount = defaults.billingAccount;
    	      this.budgetFilter = defaults.budgetFilter;
    	      this.displayName = defaults.displayName;
    	      this.thresholdRules = defaults.thresholdRules;
        }

        public Builder setAllUpdatesRule(@Nullable Input<BudgetAllUpdatesRuleArgs> allUpdatesRule) {
            this.allUpdatesRule = allUpdatesRule;
            return this;
        }

        public Builder setAllUpdatesRule(@Nullable BudgetAllUpdatesRuleArgs allUpdatesRule) {
            this.allUpdatesRule = Input.ofNullable(allUpdatesRule);
            return this;
        }

        public Builder setAmount(Input<BudgetAmountArgs> amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }

        public Builder setAmount(BudgetAmountArgs amount) {
            this.amount = Input.of(Objects.requireNonNull(amount));
            return this;
        }

        public Builder setBillingAccount(Input<String> billingAccount) {
            this.billingAccount = Objects.requireNonNull(billingAccount);
            return this;
        }

        public Builder setBillingAccount(String billingAccount) {
            this.billingAccount = Input.of(Objects.requireNonNull(billingAccount));
            return this;
        }

        public Builder setBudgetFilter(@Nullable Input<BudgetBudgetFilterArgs> budgetFilter) {
            this.budgetFilter = budgetFilter;
            return this;
        }

        public Builder setBudgetFilter(@Nullable BudgetBudgetFilterArgs budgetFilter) {
            this.budgetFilter = Input.ofNullable(budgetFilter);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setThresholdRules(Input<List<BudgetThresholdRuleArgs>> thresholdRules) {
            this.thresholdRules = Objects.requireNonNull(thresholdRules);
            return this;
        }

        public Builder setThresholdRules(List<BudgetThresholdRuleArgs> thresholdRules) {
            this.thresholdRules = Input.of(Objects.requireNonNull(thresholdRules));
            return this;
        }

        public BudgetArgs build() {
            return new BudgetArgs(allUpdatesRule, amount, billingAccount, budgetFilter, displayName, thresholdRules);
        }
    }
}
