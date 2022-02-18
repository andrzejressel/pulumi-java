// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxIntentTrainingPhrasePartGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxIntentTrainingPhraseGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxIntentTrainingPhraseGetArgs Empty = new CxIntentTrainingPhraseGetArgs();

    /**
     * The unique identifier of the parameter. This field is used by training phrases to annotate their parts.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The ordered list of training phrase parts. The parts are concatenated in order to form the training phrase.
     * Note: The API does not automatically annotate training phrases like the Dialogflow Console does.
     * Note: Do not forget to include whitespace at part boundaries, so the training phrase is well formatted when the parts are concatenated.
     * If the training phrase does not need to be annotated with parameters, you just need a single part with only the Part.text field set.
     * If you want to annotate the training phrase, you must create multiple parts, where the fields of each part are populated in one of two ways:
     * Part.text is set to a part of the phrase that has no parameters.
     * Part.text is set to a part of the phrase that you want to annotate, and the parameterId field is set.
     * Structure is documented below.
     * 
     */
    @InputImport(name="parts", required=true)
    private final Input<List<CxIntentTrainingPhrasePartGetArgs>> parts;

    public Input<List<CxIntentTrainingPhrasePartGetArgs>> getParts() {
        return this.parts;
    }

    /**
     * Indicates how many times this example was added to the intent.
     * 
     */
    @InputImport(name="repeatCount")
    private final @Nullable Input<Integer> repeatCount;

    public Input<Integer> getRepeatCount() {
        return this.repeatCount == null ? Input.empty() : this.repeatCount;
    }

    public CxIntentTrainingPhraseGetArgs(
        @Nullable Input<String> id,
        Input<List<CxIntentTrainingPhrasePartGetArgs>> parts,
        @Nullable Input<Integer> repeatCount) {
        this.id = id;
        this.parts = Objects.requireNonNull(parts, "expected parameter 'parts' to be non-null");
        this.repeatCount = repeatCount;
    }

    private CxIntentTrainingPhraseGetArgs() {
        this.id = Input.empty();
        this.parts = Input.empty();
        this.repeatCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxIntentTrainingPhraseGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private Input<List<CxIntentTrainingPhrasePartGetArgs>> parts;
        private @Nullable Input<Integer> repeatCount;

        public Builder() {
    	      // Empty
        }

        public Builder(CxIntentTrainingPhraseGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.parts = defaults.parts;
    	      this.repeatCount = defaults.repeatCount;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setParts(Input<List<CxIntentTrainingPhrasePartGetArgs>> parts) {
            this.parts = Objects.requireNonNull(parts);
            return this;
        }

        public Builder setParts(List<CxIntentTrainingPhrasePartGetArgs> parts) {
            this.parts = Input.of(Objects.requireNonNull(parts));
            return this;
        }

        public Builder setRepeatCount(@Nullable Input<Integer> repeatCount) {
            this.repeatCount = repeatCount;
            return this;
        }

        public Builder setRepeatCount(@Nullable Integer repeatCount) {
            this.repeatCount = Input.ofNullable(repeatCount);
            return this;
        }

        public CxIntentTrainingPhraseGetArgs build() {
            return new CxIntentTrainingPhraseGetArgs(id, parts, repeatCount);
        }
    }
}
