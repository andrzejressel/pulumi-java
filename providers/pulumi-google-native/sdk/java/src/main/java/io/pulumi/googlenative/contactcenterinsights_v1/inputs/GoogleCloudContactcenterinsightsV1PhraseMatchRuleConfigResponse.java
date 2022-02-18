// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse;
import java.util.Objects;


/**
 * Configuration information of a phrase match rule.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse Empty = new GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse();

    /**
     * The configuration for the exact match rule.
     * 
     */
    @InputImport(name="exactMatchConfig", required=true)
    private final GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse exactMatchConfig;

    public GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse getExactMatchConfig() {
        return this.exactMatchConfig;
    }

    public GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse(GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse exactMatchConfig) {
        this.exactMatchConfig = Objects.requireNonNull(exactMatchConfig, "expected parameter 'exactMatchConfig' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse() {
        this.exactMatchConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse exactMatchConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactMatchConfig = defaults.exactMatchConfig;
        }

        public Builder setExactMatchConfig(GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse exactMatchConfig) {
            this.exactMatchConfig = Objects.requireNonNull(exactMatchConfig);
            return this;
        }

        public GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse build() {
            return new GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse(exactMatchConfig);
        }
    }
}
