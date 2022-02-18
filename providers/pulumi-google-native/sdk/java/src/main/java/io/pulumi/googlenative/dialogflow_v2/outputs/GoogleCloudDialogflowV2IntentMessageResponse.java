// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageBasicCardResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageCardResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageImageResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageListSelectResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageMediaContentResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageQuickRepliesResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageSuggestionsResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageTableCardResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageTextResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2IntentMessageResponse {
    /**
     * The basic card response for Actions on Google.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageBasicCardResponse basicCard;
    /**
     * Browse carousel card for Actions on Google.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse browseCarouselCard;
    /**
     * The card response.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageCardResponse card;
    /**
     * The carousel card response for Actions on Google.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse carouselSelect;
    /**
     * The image response.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageImageResponse image;
    /**
     * The link out suggestion chip for Actions on Google.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionResponse linkOutSuggestion;
    /**
     * The list card response for Actions on Google.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageListSelectResponse listSelect;
    /**
     * The media content card for Actions on Google.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageMediaContentResponse mediaContent;
    /**
     * A custom platform-specific response.
     * 
     */
    private final Map<String,String> payload;
    /**
     * Optional. The platform that this message is intended for.
     * 
     */
    private final String platform;
    /**
     * The quick replies response.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageQuickRepliesResponse quickReplies;
    /**
     * The voice and text-only responses for Actions on Google.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse simpleResponses;
    /**
     * The suggestion chips for Actions on Google.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageSuggestionsResponse suggestions;
    /**
     * Table card for Actions on Google.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageTableCardResponse tableCard;
    /**
     * The text response.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageTextResponse text;

    @OutputCustomType.Constructor({"basicCard","browseCarouselCard","card","carouselSelect","image","linkOutSuggestion","listSelect","mediaContent","payload","platform","quickReplies","simpleResponses","suggestions","tableCard","text"})
    private GoogleCloudDialogflowV2IntentMessageResponse(
        GoogleCloudDialogflowV2IntentMessageBasicCardResponse basicCard,
        GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse browseCarouselCard,
        GoogleCloudDialogflowV2IntentMessageCardResponse card,
        GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse carouselSelect,
        GoogleCloudDialogflowV2IntentMessageImageResponse image,
        GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionResponse linkOutSuggestion,
        GoogleCloudDialogflowV2IntentMessageListSelectResponse listSelect,
        GoogleCloudDialogflowV2IntentMessageMediaContentResponse mediaContent,
        Map<String,String> payload,
        String platform,
        GoogleCloudDialogflowV2IntentMessageQuickRepliesResponse quickReplies,
        GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse simpleResponses,
        GoogleCloudDialogflowV2IntentMessageSuggestionsResponse suggestions,
        GoogleCloudDialogflowV2IntentMessageTableCardResponse tableCard,
        GoogleCloudDialogflowV2IntentMessageTextResponse text) {
        this.basicCard = Objects.requireNonNull(basicCard);
        this.browseCarouselCard = Objects.requireNonNull(browseCarouselCard);
        this.card = Objects.requireNonNull(card);
        this.carouselSelect = Objects.requireNonNull(carouselSelect);
        this.image = Objects.requireNonNull(image);
        this.linkOutSuggestion = Objects.requireNonNull(linkOutSuggestion);
        this.listSelect = Objects.requireNonNull(listSelect);
        this.mediaContent = Objects.requireNonNull(mediaContent);
        this.payload = Objects.requireNonNull(payload);
        this.platform = Objects.requireNonNull(platform);
        this.quickReplies = Objects.requireNonNull(quickReplies);
        this.simpleResponses = Objects.requireNonNull(simpleResponses);
        this.suggestions = Objects.requireNonNull(suggestions);
        this.tableCard = Objects.requireNonNull(tableCard);
        this.text = Objects.requireNonNull(text);
    }

    /**
     * The basic card response for Actions on Google.
     * 
     */
    public GoogleCloudDialogflowV2IntentMessageBasicCardResponse getBasicCard() {
        return this.basicCard;
    }
    /**
     * Browse carousel card for Actions on Google.
     * 
     */
    public GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse getBrowseCarouselCard() {
        return this.browseCarouselCard;
    }
    /**
     * The card response.
     * 
     */
    public GoogleCloudDialogflowV2IntentMessageCardResponse getCard() {
        return this.card;
    }
    /**
     * The carousel card response for Actions on Google.
     * 
     */
    public GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse getCarouselSelect() {
        return this.carouselSelect;
    }
    /**
     * The image response.
     * 
     */
    public GoogleCloudDialogflowV2IntentMessageImageResponse getImage() {
        return this.image;
    }
    /**
     * The link out suggestion chip for Actions on Google.
     * 
     */
    public GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionResponse getLinkOutSuggestion() {
        return this.linkOutSuggestion;
    }
    /**
     * The list card response for Actions on Google.
     * 
     */
    public GoogleCloudDialogflowV2IntentMessageListSelectResponse getListSelect() {
        return this.listSelect;
    }
    /**
     * The media content card for Actions on Google.
     * 
     */
    public GoogleCloudDialogflowV2IntentMessageMediaContentResponse getMediaContent() {
        return this.mediaContent;
    }
    /**
     * A custom platform-specific response.
     * 
     */
    public Map<String,String> getPayload() {
        return this.payload;
    }
    /**
     * Optional. The platform that this message is intended for.
     * 
     */
    public String getPlatform() {
        return this.platform;
    }
    /**
     * The quick replies response.
     * 
     */
    public GoogleCloudDialogflowV2IntentMessageQuickRepliesResponse getQuickReplies() {
        return this.quickReplies;
    }
    /**
     * The voice and text-only responses for Actions on Google.
     * 
     */
    public GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse getSimpleResponses() {
        return this.simpleResponses;
    }
    /**
     * The suggestion chips for Actions on Google.
     * 
     */
    public GoogleCloudDialogflowV2IntentMessageSuggestionsResponse getSuggestions() {
        return this.suggestions;
    }
    /**
     * Table card for Actions on Google.
     * 
     */
    public GoogleCloudDialogflowV2IntentMessageTableCardResponse getTableCard() {
        return this.tableCard;
    }
    /**
     * The text response.
     * 
     */
    public GoogleCloudDialogflowV2IntentMessageTextResponse getText() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentMessageBasicCardResponse basicCard;
        private GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse browseCarouselCard;
        private GoogleCloudDialogflowV2IntentMessageCardResponse card;
        private GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse carouselSelect;
        private GoogleCloudDialogflowV2IntentMessageImageResponse image;
        private GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionResponse linkOutSuggestion;
        private GoogleCloudDialogflowV2IntentMessageListSelectResponse listSelect;
        private GoogleCloudDialogflowV2IntentMessageMediaContentResponse mediaContent;
        private Map<String,String> payload;
        private String platform;
        private GoogleCloudDialogflowV2IntentMessageQuickRepliesResponse quickReplies;
        private GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse simpleResponses;
        private GoogleCloudDialogflowV2IntentMessageSuggestionsResponse suggestions;
        private GoogleCloudDialogflowV2IntentMessageTableCardResponse tableCard;
        private GoogleCloudDialogflowV2IntentMessageTextResponse text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicCard = defaults.basicCard;
    	      this.browseCarouselCard = defaults.browseCarouselCard;
    	      this.card = defaults.card;
    	      this.carouselSelect = defaults.carouselSelect;
    	      this.image = defaults.image;
    	      this.linkOutSuggestion = defaults.linkOutSuggestion;
    	      this.listSelect = defaults.listSelect;
    	      this.mediaContent = defaults.mediaContent;
    	      this.payload = defaults.payload;
    	      this.platform = defaults.platform;
    	      this.quickReplies = defaults.quickReplies;
    	      this.simpleResponses = defaults.simpleResponses;
    	      this.suggestions = defaults.suggestions;
    	      this.tableCard = defaults.tableCard;
    	      this.text = defaults.text;
        }

        public Builder setBasicCard(GoogleCloudDialogflowV2IntentMessageBasicCardResponse basicCard) {
            this.basicCard = Objects.requireNonNull(basicCard);
            return this;
        }

        public Builder setBrowseCarouselCard(GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse browseCarouselCard) {
            this.browseCarouselCard = Objects.requireNonNull(browseCarouselCard);
            return this;
        }

        public Builder setCard(GoogleCloudDialogflowV2IntentMessageCardResponse card) {
            this.card = Objects.requireNonNull(card);
            return this;
        }

        public Builder setCarouselSelect(GoogleCloudDialogflowV2IntentMessageCarouselSelectResponse carouselSelect) {
            this.carouselSelect = Objects.requireNonNull(carouselSelect);
            return this;
        }

        public Builder setImage(GoogleCloudDialogflowV2IntentMessageImageResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setLinkOutSuggestion(GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionResponse linkOutSuggestion) {
            this.linkOutSuggestion = Objects.requireNonNull(linkOutSuggestion);
            return this;
        }

        public Builder setListSelect(GoogleCloudDialogflowV2IntentMessageListSelectResponse listSelect) {
            this.listSelect = Objects.requireNonNull(listSelect);
            return this;
        }

        public Builder setMediaContent(GoogleCloudDialogflowV2IntentMessageMediaContentResponse mediaContent) {
            this.mediaContent = Objects.requireNonNull(mediaContent);
            return this;
        }

        public Builder setPayload(Map<String,String> payload) {
            this.payload = Objects.requireNonNull(payload);
            return this;
        }

        public Builder setPlatform(String platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }

        public Builder setQuickReplies(GoogleCloudDialogflowV2IntentMessageQuickRepliesResponse quickReplies) {
            this.quickReplies = Objects.requireNonNull(quickReplies);
            return this;
        }

        public Builder setSimpleResponses(GoogleCloudDialogflowV2IntentMessageSimpleResponsesResponse simpleResponses) {
            this.simpleResponses = Objects.requireNonNull(simpleResponses);
            return this;
        }

        public Builder setSuggestions(GoogleCloudDialogflowV2IntentMessageSuggestionsResponse suggestions) {
            this.suggestions = Objects.requireNonNull(suggestions);
            return this;
        }

        public Builder setTableCard(GoogleCloudDialogflowV2IntentMessageTableCardResponse tableCard) {
            this.tableCard = Objects.requireNonNull(tableCard);
            return this;
        }

        public Builder setText(GoogleCloudDialogflowV2IntentMessageTextResponse text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }

        public GoogleCloudDialogflowV2IntentMessageResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageResponse(basicCard, browseCarouselCard, card, carouselSelect, image, linkOutSuggestion, listSelect, mediaContent, payload, platform, quickReplies, simpleResponses, suggestions, tableCard, text);
        }
    }
}
