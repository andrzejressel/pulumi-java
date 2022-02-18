// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import java.util.Objects;


/**
 * Publish the result summary of a DlpJob to the Cloud Security Command Center (CSCC Alpha). This action is only available for projects which are parts of an organization and whitelisted for the alpha Cloud Security Command Center. The action will publish count of finding instances and their info types. The summary of findings will be persisted in CSCC and are governed by CSCC service-specific policy, see https://cloud.google.com/terms/service-terms Only a single instance of this action can be specified. Compatible with: Inspect
 * 
 */
public final class GooglePrivacyDlpV2PublishSummaryToCsccArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2PublishSummaryToCsccArgs Empty = new GooglePrivacyDlpV2PublishSummaryToCsccArgs();

    public GooglePrivacyDlpV2PublishSummaryToCsccArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2PublishSummaryToCsccArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2PublishSummaryToCsccArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GooglePrivacyDlpV2PublishSummaryToCsccArgs build() {
            return new GooglePrivacyDlpV2PublishSummaryToCsccArgs();
        }
    }
}
