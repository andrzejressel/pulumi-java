// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the input for dtmf event.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1DtmfInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1DtmfInputArgs Empty = new GoogleCloudDialogflowCxV3beta1DtmfInputArgs();

    /**
     * The dtmf digits.
     * 
     */
    @InputImport(name="digits")
    private final @Nullable Input<String> digits;

    public Input<String> getDigits() {
        return this.digits == null ? Input.empty() : this.digits;
    }

    /**
     * The finish digit (if any).
     * 
     */
    @InputImport(name="finishDigit")
    private final @Nullable Input<String> finishDigit;

    public Input<String> getFinishDigit() {
        return this.finishDigit == null ? Input.empty() : this.finishDigit;
    }

    public GoogleCloudDialogflowCxV3beta1DtmfInputArgs(
        @Nullable Input<String> digits,
        @Nullable Input<String> finishDigit) {
        this.digits = digits;
        this.finishDigit = finishDigit;
    }

    private GoogleCloudDialogflowCxV3beta1DtmfInputArgs() {
        this.digits = Input.empty();
        this.finishDigit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1DtmfInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> digits;
        private @Nullable Input<String> finishDigit;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1DtmfInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digits = defaults.digits;
    	      this.finishDigit = defaults.finishDigit;
        }

        public Builder setDigits(@Nullable Input<String> digits) {
            this.digits = digits;
            return this;
        }

        public Builder setDigits(@Nullable String digits) {
            this.digits = Input.ofNullable(digits);
            return this;
        }

        public Builder setFinishDigit(@Nullable Input<String> finishDigit) {
            this.finishDigit = finishDigit;
            return this;
        }

        public Builder setFinishDigit(@Nullable String finishDigit) {
            this.finishDigit = Input.ofNullable(finishDigit);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1DtmfInputArgs build() {
            return new GoogleCloudDialogflowCxV3beta1DtmfInputArgs(digits, finishDigit);
        }
    }
}
