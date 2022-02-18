// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2IntentTrainingPhrasePartResponse {
    /**
     * Optional. The parameter name for the value extracted from the annotated part of the example. This field is required for annotated parts of the training phrase.
     * 
     */
    private final String alias;
    /**
     * Optional. The entity type name prefixed with `@`. This field is required for annotated parts of the training phrase.
     * 
     */
    private final String entityType;
    /**
     * The text for this part.
     * 
     */
    private final String text;
    /**
     * Optional. Indicates whether the text was manually annotated. This field is set to true when the Dialogflow Console is used to manually annotate the part. When creating an annotated part with the API, you must set this to true.
     * 
     */
    private final Boolean userDefined;

    @OutputCustomType.Constructor({"alias","entityType","text","userDefined"})
    private GoogleCloudDialogflowV2IntentTrainingPhrasePartResponse(
        String alias,
        String entityType,
        String text,
        Boolean userDefined) {
        this.alias = Objects.requireNonNull(alias);
        this.entityType = Objects.requireNonNull(entityType);
        this.text = Objects.requireNonNull(text);
        this.userDefined = Objects.requireNonNull(userDefined);
    }

    /**
     * Optional. The parameter name for the value extracted from the annotated part of the example. This field is required for annotated parts of the training phrase.
     * 
     */
    public String getAlias() {
        return this.alias;
    }
    /**
     * Optional. The entity type name prefixed with `@`. This field is required for annotated parts of the training phrase.
     * 
     */
    public String getEntityType() {
        return this.entityType;
    }
    /**
     * The text for this part.
     * 
     */
    public String getText() {
        return this.text;
    }
    /**
     * Optional. Indicates whether the text was manually annotated. This field is set to true when the Dialogflow Console is used to manually annotate the part. When creating an annotated part with the API, you must set this to true.
     * 
     */
    public Boolean getUserDefined() {
        return this.userDefined;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentTrainingPhrasePartResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alias;
        private String entityType;
        private String text;
        private Boolean userDefined;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentTrainingPhrasePartResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.entityType = defaults.entityType;
    	      this.text = defaults.text;
    	      this.userDefined = defaults.userDefined;
        }

        public Builder setAlias(String alias) {
            this.alias = Objects.requireNonNull(alias);
            return this;
        }

        public Builder setEntityType(String entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }

        public Builder setText(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }

        public Builder setUserDefined(Boolean userDefined) {
            this.userDefined = Objects.requireNonNull(userDefined);
            return this;
        }

        public GoogleCloudDialogflowV2IntentTrainingPhrasePartResponse build() {
            return new GoogleCloudDialogflowV2IntentTrainingPhrasePartResponse(alias, entityType, text, userDefined);
        }
    }
}
