// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubAccountArgs Empty = new SubAccountArgs();

    /**
     * If set to "RENAME_ON_DESTROY" the billing account display_name
     * will be changed to "Destroyed" along with a timestamp.  If set to "" this will not occur.
     * Default is "".
     * 
     */
    @InputImport(name="deletionPolicy")
    private final @Nullable Input<String> deletionPolicy;

    public Input<String> getDeletionPolicy() {
        return this.deletionPolicy == null ? Input.empty() : this.deletionPolicy;
    }

    /**
     * The display name of the billing account.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * The name of the master billing account that the subaccount
     * will be created under in the form `{billing_account_id}` or `billingAccounts/{billing_account_id}`.
     * 
     */
    @InputImport(name="masterBillingAccount", required=true)
    private final Input<String> masterBillingAccount;

    public Input<String> getMasterBillingAccount() {
        return this.masterBillingAccount;
    }

    public SubAccountArgs(
        @Nullable Input<String> deletionPolicy,
        Input<String> displayName,
        Input<String> masterBillingAccount) {
        this.deletionPolicy = deletionPolicy;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.masterBillingAccount = Objects.requireNonNull(masterBillingAccount, "expected parameter 'masterBillingAccount' to be non-null");
    }

    private SubAccountArgs() {
        this.deletionPolicy = Input.empty();
        this.displayName = Input.empty();
        this.masterBillingAccount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deletionPolicy;
        private Input<String> displayName;
        private Input<String> masterBillingAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(SubAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deletionPolicy = defaults.deletionPolicy;
    	      this.displayName = defaults.displayName;
    	      this.masterBillingAccount = defaults.masterBillingAccount;
        }

        public Builder setDeletionPolicy(@Nullable Input<String> deletionPolicy) {
            this.deletionPolicy = deletionPolicy;
            return this;
        }

        public Builder setDeletionPolicy(@Nullable String deletionPolicy) {
            this.deletionPolicy = Input.ofNullable(deletionPolicy);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setMasterBillingAccount(Input<String> masterBillingAccount) {
            this.masterBillingAccount = Objects.requireNonNull(masterBillingAccount);
            return this;
        }

        public Builder setMasterBillingAccount(String masterBillingAccount) {
            this.masterBillingAccount = Input.of(Objects.requireNonNull(masterBillingAccount));
            return this;
        }

        public SubAccountArgs build() {
            return new SubAccountArgs(deletionPolicy, displayName, masterBillingAccount);
        }
    }
}
