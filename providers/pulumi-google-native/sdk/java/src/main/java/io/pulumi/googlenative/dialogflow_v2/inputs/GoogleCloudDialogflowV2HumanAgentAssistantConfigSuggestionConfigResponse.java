// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfigResponse;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;


/**
 * Detail human agent assistant config.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse Empty = new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse();

    /**
     * Configuration of different suggestion features. One feature can have only one config.
     * 
     */
    @InputImport(name="featureConfigs", required=true)
    private final List<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfigResponse> featureConfigs;

    public List<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfigResponse> getFeatureConfigs() {
        return this.featureConfigs;
    }

    /**
     * If `group_suggestion_responses` is false, and there are multiple `feature_configs` in `event based suggestion` or StreamingAnalyzeContent, we will try to deliver suggestions to customers as soon as we get new suggestion. Different type of suggestions based on the same context will be in separate Pub/Sub event or `StreamingAnalyzeContentResponse`. If `group_suggestion_responses` set to true. All the suggestions to the same participant based on the same context will be grouped into a single Pub/Sub event or StreamingAnalyzeContentResponse.
     * 
     */
    @InputImport(name="groupSuggestionResponses", required=true)
    private final Boolean groupSuggestionResponses;

    public Boolean getGroupSuggestionResponses() {
        return this.groupSuggestionResponses;
    }

    public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse(
        List<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfigResponse> featureConfigs,
        Boolean groupSuggestionResponses) {
        this.featureConfigs = Objects.requireNonNull(featureConfigs, "expected parameter 'featureConfigs' to be non-null");
        this.groupSuggestionResponses = Objects.requireNonNull(groupSuggestionResponses, "expected parameter 'groupSuggestionResponses' to be non-null");
    }

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse() {
        this.featureConfigs = List.of();
        this.groupSuggestionResponses = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfigResponse> featureConfigs;
        private Boolean groupSuggestionResponses;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.featureConfigs = defaults.featureConfigs;
    	      this.groupSuggestionResponses = defaults.groupSuggestionResponses;
        }

        public Builder setFeatureConfigs(List<GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfigResponse> featureConfigs) {
            this.featureConfigs = Objects.requireNonNull(featureConfigs);
            return this;
        }

        public Builder setGroupSuggestionResponses(Boolean groupSuggestionResponses) {
            this.groupSuggestionResponses = Objects.requireNonNull(groupSuggestionResponses);
            return this;
        }

        public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse build() {
            return new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse(featureConfigs, groupSuggestionResponses);
        }
    }
}
