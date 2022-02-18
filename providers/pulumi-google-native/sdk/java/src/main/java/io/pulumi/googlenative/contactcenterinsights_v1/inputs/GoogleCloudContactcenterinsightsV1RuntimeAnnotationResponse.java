// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1AnswerFeedbackResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1SmartReplyDataResponse;
import java.lang.String;
import java.util.Objects;


/**
 * An annotation that was generated during the customer and agent interaction.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse Empty = new GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse();

    /**
     * The unique identifier of the annotation. Format: projects/{project}/locations/{location}/conversationDatasets/{dataset}/conversationDataItems/{data_item}/conversationAnnotations/{annotation}
     * 
     */
    @InputImport(name="annotationId", required=true)
    private final String annotationId;

    public String getAnnotationId() {
        return this.annotationId;
    }

    /**
     * The feedback that the customer has about the answer in `data`.
     * 
     */
    @InputImport(name="answerFeedback", required=true)
    private final GoogleCloudContactcenterinsightsV1AnswerFeedbackResponse answerFeedback;

    public GoogleCloudContactcenterinsightsV1AnswerFeedbackResponse getAnswerFeedback() {
        return this.answerFeedback;
    }

    /**
     * Agent Assist Article Suggestion data.
     * 
     */
    @InputImport(name="articleSuggestion", required=true)
    private final GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse articleSuggestion;

    public GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse getArticleSuggestion() {
        return this.articleSuggestion;
    }

    /**
     * The time at which this annotation was created.
     * 
     */
    @InputImport(name="createTime", required=true)
    private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * Dialogflow interaction data.
     * 
     */
    @InputImport(name="dialogflowInteraction", required=true)
    private final GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse dialogflowInteraction;

    public GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse getDialogflowInteraction() {
        return this.dialogflowInteraction;
    }

    /**
     * The boundary in the conversation where the annotation ends, inclusive.
     * 
     */
    @InputImport(name="endBoundary", required=true)
    private final GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse endBoundary;

    public GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse getEndBoundary() {
        return this.endBoundary;
    }

    /**
     * Agent Assist FAQ answer data.
     * 
     */
    @InputImport(name="faqAnswer", required=true)
    private final GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse faqAnswer;

    public GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse getFaqAnswer() {
        return this.faqAnswer;
    }

    /**
     * Agent Assist Smart Compose suggestion data.
     * 
     */
    @InputImport(name="smartComposeSuggestion", required=true)
    private final GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse smartComposeSuggestion;

    public GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse getSmartComposeSuggestion() {
        return this.smartComposeSuggestion;
    }

    /**
     * Agent Assist Smart Reply data.
     * 
     */
    @InputImport(name="smartReply", required=true)
    private final GoogleCloudContactcenterinsightsV1SmartReplyDataResponse smartReply;

    public GoogleCloudContactcenterinsightsV1SmartReplyDataResponse getSmartReply() {
        return this.smartReply;
    }

    /**
     * The boundary in the conversation where the annotation starts, inclusive.
     * 
     */
    @InputImport(name="startBoundary", required=true)
    private final GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse startBoundary;

    public GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse getStartBoundary() {
        return this.startBoundary;
    }

    public GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse(
        String annotationId,
        GoogleCloudContactcenterinsightsV1AnswerFeedbackResponse answerFeedback,
        GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse articleSuggestion,
        String createTime,
        GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse dialogflowInteraction,
        GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse endBoundary,
        GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse faqAnswer,
        GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse smartComposeSuggestion,
        GoogleCloudContactcenterinsightsV1SmartReplyDataResponse smartReply,
        GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse startBoundary) {
        this.annotationId = Objects.requireNonNull(annotationId, "expected parameter 'annotationId' to be non-null");
        this.answerFeedback = Objects.requireNonNull(answerFeedback, "expected parameter 'answerFeedback' to be non-null");
        this.articleSuggestion = Objects.requireNonNull(articleSuggestion, "expected parameter 'articleSuggestion' to be non-null");
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.dialogflowInteraction = Objects.requireNonNull(dialogflowInteraction, "expected parameter 'dialogflowInteraction' to be non-null");
        this.endBoundary = Objects.requireNonNull(endBoundary, "expected parameter 'endBoundary' to be non-null");
        this.faqAnswer = Objects.requireNonNull(faqAnswer, "expected parameter 'faqAnswer' to be non-null");
        this.smartComposeSuggestion = Objects.requireNonNull(smartComposeSuggestion, "expected parameter 'smartComposeSuggestion' to be non-null");
        this.smartReply = Objects.requireNonNull(smartReply, "expected parameter 'smartReply' to be non-null");
        this.startBoundary = Objects.requireNonNull(startBoundary, "expected parameter 'startBoundary' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse() {
        this.annotationId = null;
        this.answerFeedback = null;
        this.articleSuggestion = null;
        this.createTime = null;
        this.dialogflowInteraction = null;
        this.endBoundary = null;
        this.faqAnswer = null;
        this.smartComposeSuggestion = null;
        this.smartReply = null;
        this.startBoundary = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String annotationId;
        private GoogleCloudContactcenterinsightsV1AnswerFeedbackResponse answerFeedback;
        private GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse articleSuggestion;
        private String createTime;
        private GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse dialogflowInteraction;
        private GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse endBoundary;
        private GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse faqAnswer;
        private GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse smartComposeSuggestion;
        private GoogleCloudContactcenterinsightsV1SmartReplyDataResponse smartReply;
        private GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse startBoundary;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotationId = defaults.annotationId;
    	      this.answerFeedback = defaults.answerFeedback;
    	      this.articleSuggestion = defaults.articleSuggestion;
    	      this.createTime = defaults.createTime;
    	      this.dialogflowInteraction = defaults.dialogflowInteraction;
    	      this.endBoundary = defaults.endBoundary;
    	      this.faqAnswer = defaults.faqAnswer;
    	      this.smartComposeSuggestion = defaults.smartComposeSuggestion;
    	      this.smartReply = defaults.smartReply;
    	      this.startBoundary = defaults.startBoundary;
        }

        public Builder setAnnotationId(String annotationId) {
            this.annotationId = Objects.requireNonNull(annotationId);
            return this;
        }

        public Builder setAnswerFeedback(GoogleCloudContactcenterinsightsV1AnswerFeedbackResponse answerFeedback) {
            this.answerFeedback = Objects.requireNonNull(answerFeedback);
            return this;
        }

        public Builder setArticleSuggestion(GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse articleSuggestion) {
            this.articleSuggestion = Objects.requireNonNull(articleSuggestion);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDialogflowInteraction(GoogleCloudContactcenterinsightsV1DialogflowInteractionDataResponse dialogflowInteraction) {
            this.dialogflowInteraction = Objects.requireNonNull(dialogflowInteraction);
            return this;
        }

        public Builder setEndBoundary(GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse endBoundary) {
            this.endBoundary = Objects.requireNonNull(endBoundary);
            return this;
        }

        public Builder setFaqAnswer(GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse faqAnswer) {
            this.faqAnswer = Objects.requireNonNull(faqAnswer);
            return this;
        }

        public Builder setSmartComposeSuggestion(GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse smartComposeSuggestion) {
            this.smartComposeSuggestion = Objects.requireNonNull(smartComposeSuggestion);
            return this;
        }

        public Builder setSmartReply(GoogleCloudContactcenterinsightsV1SmartReplyDataResponse smartReply) {
            this.smartReply = Objects.requireNonNull(smartReply);
            return this;
        }

        public Builder setStartBoundary(GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse startBoundary) {
            this.startBoundary = Objects.requireNonNull(startBoundary);
            return this;
        }

        public GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse build() {
            return new GoogleCloudContactcenterinsightsV1RuntimeAnnotationResponse(annotationId, answerFeedback, articleSuggestion, createTime, dialogflowInteraction, endBoundary, faqAnswer, smartComposeSuggestion, smartReply, startBoundary);
        }
    }
}
