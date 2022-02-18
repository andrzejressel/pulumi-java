// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import java.util.Objects;


/**
 * Replace each matching finding with the name of the info_type.
 * 
 */
public final class GooglePrivacyDlpV2ReplaceWithInfoTypeConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2ReplaceWithInfoTypeConfigResponse Empty = new GooglePrivacyDlpV2ReplaceWithInfoTypeConfigResponse();

    public GooglePrivacyDlpV2ReplaceWithInfoTypeConfigResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ReplaceWithInfoTypeConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ReplaceWithInfoTypeConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GooglePrivacyDlpV2ReplaceWithInfoTypeConfigResponse build() {
            return new GooglePrivacyDlpV2ReplaceWithInfoTypeConfigResponse();
        }
    }
}
