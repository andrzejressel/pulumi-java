// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class DataTransferConfigEmailPreferencesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataTransferConfigEmailPreferencesGetArgs Empty = new DataTransferConfigEmailPreferencesGetArgs();

    /**
     * If true, email notifications will be sent on transfer run failures.
     * 
     */
    @InputImport(name="enableFailureEmail", required=true)
    private final Input<Boolean> enableFailureEmail;

    public Input<Boolean> getEnableFailureEmail() {
        return this.enableFailureEmail;
    }

    public DataTransferConfigEmailPreferencesGetArgs(Input<Boolean> enableFailureEmail) {
        this.enableFailureEmail = Objects.requireNonNull(enableFailureEmail, "expected parameter 'enableFailureEmail' to be non-null");
    }

    private DataTransferConfigEmailPreferencesGetArgs() {
        this.enableFailureEmail = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataTransferConfigEmailPreferencesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> enableFailureEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(DataTransferConfigEmailPreferencesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableFailureEmail = defaults.enableFailureEmail;
        }

        public Builder setEnableFailureEmail(Input<Boolean> enableFailureEmail) {
            this.enableFailureEmail = Objects.requireNonNull(enableFailureEmail);
            return this;
        }

        public Builder setEnableFailureEmail(Boolean enableFailureEmail) {
            this.enableFailureEmail = Input.of(Objects.requireNonNull(enableFailureEmail));
            return this;
        }

        public DataTransferConfigEmailPreferencesGetArgs build() {
            return new DataTransferConfigEmailPreferencesGetArgs(enableFailureEmail);
        }
    }
}
