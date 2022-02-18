// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse {
    /**
     * Knowledge bases to query. Format: `projects//locations//knowledgeBases/`. Currently, at most 5 knowledge bases are supported.
     * 
     */
    private final List<String> knowledgeBases;

    @OutputCustomType.Constructor({"knowledgeBases"})
    private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse(List<String> knowledgeBases) {
        this.knowledgeBases = Objects.requireNonNull(knowledgeBases);
    }

    /**
     * Knowledge bases to query. Format: `projects//locations//knowledgeBases/`. Currently, at most 5 knowledge bases are supported.
     * 
     */
    public List<String> getKnowledgeBases() {
        return this.knowledgeBases;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> knowledgeBases;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.knowledgeBases = defaults.knowledgeBases;
        }

        public Builder setKnowledgeBases(List<String> knowledgeBases) {
            this.knowledgeBases = Objects.requireNonNull(knowledgeBases);
            return this;
        }

        public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse build() {
            return new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse(knowledgeBases);
        }
    }
}
