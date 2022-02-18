// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CustomInfoTypeResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FindingLimitsResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InspectionRuleSetResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Configuration description of the scanning process. When used with redactContent only info_types and min_likelihood are currently used.
 * 
 */
public final class GooglePrivacyDlpV2InspectConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2InspectConfigResponse Empty = new GooglePrivacyDlpV2InspectConfigResponse();

    /**
     * CustomInfoTypes provided by the user. See https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
     * 
     */
    @InputImport(name="customInfoTypes", required=true)
    private final List<GooglePrivacyDlpV2CustomInfoTypeResponse> customInfoTypes;

    public List<GooglePrivacyDlpV2CustomInfoTypeResponse> getCustomInfoTypes() {
        return this.customInfoTypes;
    }

    /**
     * When true, excludes type information of the findings. This is not used for data profiling.
     * 
     */
    @InputImport(name="excludeInfoTypes", required=true)
    private final Boolean excludeInfoTypes;

    public Boolean getExcludeInfoTypes() {
        return this.excludeInfoTypes;
    }

    /**
     * When true, a contextual quote from the data that triggered a finding is included in the response; see Finding.quote. This is not used for data profiling.
     * 
     */
    @InputImport(name="includeQuote", required=true)
    private final Boolean includeQuote;

    public Boolean getIncludeQuote() {
        return this.includeQuote;
    }

    /**
     * Restricts what info_types to look for. The values must correspond to InfoType values returned by ListInfoTypes or listed at https://cloud.google.com/dlp/docs/infotypes-reference. When no InfoTypes or CustomInfoTypes are specified in a request, the system may automatically choose what detectors to run. By default this may be all types, but may change over time as detectors are updated. If you need precise control and predictability as to what detectors are run you should specify specific InfoTypes listed in the reference, otherwise a default list will be used, which may change over time.
     * 
     */
    @InputImport(name="infoTypes", required=true)
    private final List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes;

    public List<GooglePrivacyDlpV2InfoTypeResponse> getInfoTypes() {
        return this.infoTypes;
    }

    /**
     * Configuration to control the number of findings returned. This is not used for data profiling.
     * 
     */
    @InputImport(name="limits", required=true)
    private final GooglePrivacyDlpV2FindingLimitsResponse limits;

    public GooglePrivacyDlpV2FindingLimitsResponse getLimits() {
        return this.limits;
    }

    /**
     * Only returns findings equal or above this threshold. The default is POSSIBLE. See https://cloud.google.com/dlp/docs/likelihood to learn more.
     * 
     */
    @InputImport(name="minLikelihood", required=true)
    private final String minLikelihood;

    public String getMinLikelihood() {
        return this.minLikelihood;
    }

    /**
     * Set of rules to apply to the findings for this InspectConfig. Exclusion rules, contained in the set are executed in the end, other rules are executed in the order they are specified for each info type.
     * 
     */
    @InputImport(name="ruleSet", required=true)
    private final List<GooglePrivacyDlpV2InspectionRuleSetResponse> ruleSet;

    public List<GooglePrivacyDlpV2InspectionRuleSetResponse> getRuleSet() {
        return this.ruleSet;
    }

    public GooglePrivacyDlpV2InspectConfigResponse(
        List<GooglePrivacyDlpV2CustomInfoTypeResponse> customInfoTypes,
        Boolean excludeInfoTypes,
        Boolean includeQuote,
        List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes,
        GooglePrivacyDlpV2FindingLimitsResponse limits,
        String minLikelihood,
        List<GooglePrivacyDlpV2InspectionRuleSetResponse> ruleSet) {
        this.customInfoTypes = Objects.requireNonNull(customInfoTypes, "expected parameter 'customInfoTypes' to be non-null");
        this.excludeInfoTypes = Objects.requireNonNull(excludeInfoTypes, "expected parameter 'excludeInfoTypes' to be non-null");
        this.includeQuote = Objects.requireNonNull(includeQuote, "expected parameter 'includeQuote' to be non-null");
        this.infoTypes = Objects.requireNonNull(infoTypes, "expected parameter 'infoTypes' to be non-null");
        this.limits = Objects.requireNonNull(limits, "expected parameter 'limits' to be non-null");
        this.minLikelihood = Objects.requireNonNull(minLikelihood, "expected parameter 'minLikelihood' to be non-null");
        this.ruleSet = Objects.requireNonNull(ruleSet, "expected parameter 'ruleSet' to be non-null");
    }

    private GooglePrivacyDlpV2InspectConfigResponse() {
        this.customInfoTypes = List.of();
        this.excludeInfoTypes = null;
        this.includeQuote = null;
        this.infoTypes = List.of();
        this.limits = null;
        this.minLikelihood = null;
        this.ruleSet = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InspectConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2CustomInfoTypeResponse> customInfoTypes;
        private Boolean excludeInfoTypes;
        private Boolean includeQuote;
        private List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes;
        private GooglePrivacyDlpV2FindingLimitsResponse limits;
        private String minLikelihood;
        private List<GooglePrivacyDlpV2InspectionRuleSetResponse> ruleSet;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InspectConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customInfoTypes = defaults.customInfoTypes;
    	      this.excludeInfoTypes = defaults.excludeInfoTypes;
    	      this.includeQuote = defaults.includeQuote;
    	      this.infoTypes = defaults.infoTypes;
    	      this.limits = defaults.limits;
    	      this.minLikelihood = defaults.minLikelihood;
    	      this.ruleSet = defaults.ruleSet;
        }

        public Builder setCustomInfoTypes(List<GooglePrivacyDlpV2CustomInfoTypeResponse> customInfoTypes) {
            this.customInfoTypes = Objects.requireNonNull(customInfoTypes);
            return this;
        }

        public Builder setExcludeInfoTypes(Boolean excludeInfoTypes) {
            this.excludeInfoTypes = Objects.requireNonNull(excludeInfoTypes);
            return this;
        }

        public Builder setIncludeQuote(Boolean includeQuote) {
            this.includeQuote = Objects.requireNonNull(includeQuote);
            return this;
        }

        public Builder setInfoTypes(List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes) {
            this.infoTypes = Objects.requireNonNull(infoTypes);
            return this;
        }

        public Builder setLimits(GooglePrivacyDlpV2FindingLimitsResponse limits) {
            this.limits = Objects.requireNonNull(limits);
            return this;
        }

        public Builder setMinLikelihood(String minLikelihood) {
            this.minLikelihood = Objects.requireNonNull(minLikelihood);
            return this;
        }

        public Builder setRuleSet(List<GooglePrivacyDlpV2InspectionRuleSetResponse> ruleSet) {
            this.ruleSet = Objects.requireNonNull(ruleSet);
            return this;
        }

        public GooglePrivacyDlpV2InspectConfigResponse build() {
            return new GooglePrivacyDlpV2InspectConfigResponse(customInfoTypes, excludeInfoTypes, includeQuote, infoTypes, limits, minLikelihood, ruleSet);
        }
    }
}
