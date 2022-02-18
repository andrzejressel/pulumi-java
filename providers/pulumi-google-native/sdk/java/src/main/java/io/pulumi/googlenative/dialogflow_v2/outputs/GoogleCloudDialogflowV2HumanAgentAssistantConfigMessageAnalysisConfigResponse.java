// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigResponse {
    /**
     * Enable entity extraction in conversation messages on [agent assist stage](https://cloud.google.com/dialogflow/priv/docs/contact-center/basics#stages). If unspecified, defaults to false. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    private final Boolean enableEntityExtraction;
    /**
     * Enable sentiment analysis in conversation messages on [agent assist stage](https://cloud.google.com/dialogflow/priv/docs/contact-center/basics#stages). If unspecified, defaults to false. Sentiment analysis inspects user input and identifies the prevailing subjective opinion, especially to determine a user's attitude as positive, negative, or neutral: https://cloud.google.com/natural-language/docs/basics#sentiment_analysis For Participants.StreamingAnalyzeContent method, result will be in StreamingAnalyzeContentResponse.message.SentimentAnalysisResult. For Participants.AnalyzeContent method, result will be in AnalyzeContentResponse.message.SentimentAnalysisResult For Conversations.ListMessages method, result will be in ListMessagesResponse.messages.SentimentAnalysisResult If Pub/Sub notification is configured, result will be in ConversationEvent.new_message_payload.SentimentAnalysisResult.
     * 
     */
    private final Boolean enableSentimentAnalysis;

    @OutputCustomType.Constructor({"enableEntityExtraction","enableSentimentAnalysis"})
    private GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigResponse(
        Boolean enableEntityExtraction,
        Boolean enableSentimentAnalysis) {
        this.enableEntityExtraction = Objects.requireNonNull(enableEntityExtraction);
        this.enableSentimentAnalysis = Objects.requireNonNull(enableSentimentAnalysis);
    }

    /**
     * Enable entity extraction in conversation messages on [agent assist stage](https://cloud.google.com/dialogflow/priv/docs/contact-center/basics#stages). If unspecified, defaults to false. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    public Boolean getEnableEntityExtraction() {
        return this.enableEntityExtraction;
    }
    /**
     * Enable sentiment analysis in conversation messages on [agent assist stage](https://cloud.google.com/dialogflow/priv/docs/contact-center/basics#stages). If unspecified, defaults to false. Sentiment analysis inspects user input and identifies the prevailing subjective opinion, especially to determine a user's attitude as positive, negative, or neutral: https://cloud.google.com/natural-language/docs/basics#sentiment_analysis For Participants.StreamingAnalyzeContent method, result will be in StreamingAnalyzeContentResponse.message.SentimentAnalysisResult. For Participants.AnalyzeContent method, result will be in AnalyzeContentResponse.message.SentimentAnalysisResult For Conversations.ListMessages method, result will be in ListMessagesResponse.messages.SentimentAnalysisResult If Pub/Sub notification is configured, result will be in ConversationEvent.new_message_payload.SentimentAnalysisResult.
     * 
     */
    public Boolean getEnableSentimentAnalysis() {
        return this.enableSentimentAnalysis;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableEntityExtraction;
        private Boolean enableSentimentAnalysis;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableEntityExtraction = defaults.enableEntityExtraction;
    	      this.enableSentimentAnalysis = defaults.enableSentimentAnalysis;
        }

        public Builder setEnableEntityExtraction(Boolean enableEntityExtraction) {
            this.enableEntityExtraction = Objects.requireNonNull(enableEntityExtraction);
            return this;
        }

        public Builder setEnableSentimentAnalysis(Boolean enableSentimentAnalysis) {
            this.enableSentimentAnalysis = Objects.requireNonNull(enableSentimentAnalysis);
            return this;
        }

        public GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigResponse build() {
            return new GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigResponse(enableEntityExtraction, enableSentimentAnalysis);
        }
    }
}
