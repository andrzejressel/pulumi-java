// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2HotwordRuleResponse;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2DetectionRuleResponse {
    /**
     * Hotword-based detection rule.
     * 
     */
    private final GooglePrivacyDlpV2HotwordRuleResponse hotwordRule;

    @OutputCustomType.Constructor({"hotwordRule"})
    private GooglePrivacyDlpV2DetectionRuleResponse(GooglePrivacyDlpV2HotwordRuleResponse hotwordRule) {
        this.hotwordRule = Objects.requireNonNull(hotwordRule);
    }

    /**
     * Hotword-based detection rule.
     * 
     */
    public GooglePrivacyDlpV2HotwordRuleResponse getHotwordRule() {
        return this.hotwordRule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2DetectionRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2HotwordRuleResponse hotwordRule;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2DetectionRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hotwordRule = defaults.hotwordRule;
        }

        public Builder setHotwordRule(GooglePrivacyDlpV2HotwordRuleResponse hotwordRule) {
            this.hotwordRule = Objects.requireNonNull(hotwordRule);
            return this;
        }

        public GooglePrivacyDlpV2DetectionRuleResponse build() {
            return new GooglePrivacyDlpV2DetectionRuleResponse(hotwordRule);
        }
    }
}
