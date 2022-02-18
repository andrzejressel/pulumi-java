// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BillingAccountExclusionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BillingAccountExclusionArgs Empty = new BillingAccountExclusionArgs();

    /**
     * The billing account to create the exclusion for.
     * 
     */
    @InputImport(name="billingAccount", required=true)
    private final Input<String> billingAccount;

    public Input<String> getBillingAccount() {
        return this.billingAccount;
    }

    /**
     * A human-readable description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Whether this exclusion rule should be disabled or not. This defaults to
     * false.
     * 
     */
    @InputImport(name="disabled")
    private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    /**
     * The filter to apply when excluding logs. Only log entries that match the filter are excluded.
     * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
     * write a filter.
     * 
     */
    @InputImport(name="filter", required=true)
    private final Input<String> filter;

    public Input<String> getFilter() {
        return this.filter;
    }

    /**
     * The name of the logging exclusion.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public BillingAccountExclusionArgs(
        Input<String> billingAccount,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> disabled,
        Input<String> filter,
        @Nullable Input<String> name) {
        this.billingAccount = Objects.requireNonNull(billingAccount, "expected parameter 'billingAccount' to be non-null");
        this.description = description;
        this.disabled = disabled;
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.name = name;
    }

    private BillingAccountExclusionArgs() {
        this.billingAccount = Input.empty();
        this.description = Input.empty();
        this.disabled = Input.empty();
        this.filter = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingAccountExclusionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> billingAccount;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> disabled;
        private Input<String> filter;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(BillingAccountExclusionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccount = defaults.billingAccount;
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
        }

        public Builder setBillingAccount(Input<String> billingAccount) {
            this.billingAccount = Objects.requireNonNull(billingAccount);
            return this;
        }

        public Builder setBillingAccount(String billingAccount) {
            this.billingAccount = Input.of(Objects.requireNonNull(billingAccount));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public Builder setFilter(Input<String> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setFilter(String filter) {
            this.filter = Input.of(Objects.requireNonNull(filter));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public BillingAccountExclusionArgs build() {
            return new BillingAccountExclusionArgs(billingAccount, description, disabled, filter, name);
        }
    }
}
