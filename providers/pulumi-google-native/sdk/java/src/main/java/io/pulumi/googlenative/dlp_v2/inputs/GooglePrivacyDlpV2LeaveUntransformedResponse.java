// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import java.util.Objects;


/**
 * Skips the data without modifying it if the requested transformation would cause an error. For example, if a `DateShift` transformation were applied an an IP address, this mode would leave the IP address unchanged in the response.
 * 
 */
public final class GooglePrivacyDlpV2LeaveUntransformedResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2LeaveUntransformedResponse Empty = new GooglePrivacyDlpV2LeaveUntransformedResponse();

    public GooglePrivacyDlpV2LeaveUntransformedResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2LeaveUntransformedResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2LeaveUntransformedResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GooglePrivacyDlpV2LeaveUntransformedResponse build() {
            return new GooglePrivacyDlpV2LeaveUntransformedResponse();
        }
    }
}
