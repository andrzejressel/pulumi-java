// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Transfers the call in Telephony Gateway.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallArgs();

    /**
     * The phone number to transfer the call to in [E.164 format](https://en.wikipedia.org/wiki/E.164). We currently only allow transferring to US numbers (+1xxxyyyzzzz).
     * 
     */
    @InputImport(name="phoneNumber", required=true)
    private final Input<String> phoneNumber;

    public Input<String> getPhoneNumber() {
        return this.phoneNumber;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallArgs(Input<String> phoneNumber) {
        this.phoneNumber = Objects.requireNonNull(phoneNumber, "expected parameter 'phoneNumber' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallArgs() {
        this.phoneNumber = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder setPhoneNumber(Input<String> phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = Input.of(Objects.requireNonNull(phoneNumber));
            return this;
        }

        public GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallArgs(phoneNumber);
        }
    }
}
