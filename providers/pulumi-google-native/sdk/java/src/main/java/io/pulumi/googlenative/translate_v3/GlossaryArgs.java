// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.translate_v3;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.translate_v3.inputs.GlossaryInputConfigArgs;
import io.pulumi.googlenative.translate_v3.inputs.LanguageCodePairArgs;
import io.pulumi.googlenative.translate_v3.inputs.LanguageCodesSetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlossaryArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlossaryArgs Empty = new GlossaryArgs();

    /**
     * Provides examples to build the glossary from. Total glossary must not exceed 10M Unicode codepoints.
     * 
     */
    @InputImport(name="inputConfig", required=true)
    private final Input<GlossaryInputConfigArgs> inputConfig;

    public Input<GlossaryInputConfigArgs> getInputConfig() {
        return this.inputConfig;
    }

    /**
     * Used with equivalent term set glossaries.
     * 
     */
    @InputImport(name="languageCodesSet")
    private final @Nullable Input<LanguageCodesSetArgs> languageCodesSet;

    public Input<LanguageCodesSetArgs> getLanguageCodesSet() {
        return this.languageCodesSet == null ? Input.empty() : this.languageCodesSet;
    }

    /**
     * Used with unidirectional glossaries.
     * 
     */
    @InputImport(name="languagePair")
    private final @Nullable Input<LanguageCodePairArgs> languagePair;

    public Input<LanguageCodePairArgs> getLanguagePair() {
        return this.languagePair == null ? Input.empty() : this.languagePair;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The resource name of the glossary. Glossary names have the form `projects/{project-number-or-id}/locations/{location-id}/glossaries/{glossary-id}`.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public GlossaryArgs(
        Input<GlossaryInputConfigArgs> inputConfig,
        @Nullable Input<LanguageCodesSetArgs> languageCodesSet,
        @Nullable Input<LanguageCodePairArgs> languagePair,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project) {
        this.inputConfig = Objects.requireNonNull(inputConfig, "expected parameter 'inputConfig' to be non-null");
        this.languageCodesSet = languageCodesSet;
        this.languagePair = languagePair;
        this.location = location;
        this.name = name;
        this.project = project;
    }

    private GlossaryArgs() {
        this.inputConfig = Input.empty();
        this.languageCodesSet = Input.empty();
        this.languagePair = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlossaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<GlossaryInputConfigArgs> inputConfig;
        private @Nullable Input<LanguageCodesSetArgs> languageCodesSet;
        private @Nullable Input<LanguageCodePairArgs> languagePair;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(GlossaryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputConfig = defaults.inputConfig;
    	      this.languageCodesSet = defaults.languageCodesSet;
    	      this.languagePair = defaults.languagePair;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder setInputConfig(Input<GlossaryInputConfigArgs> inputConfig) {
            this.inputConfig = Objects.requireNonNull(inputConfig);
            return this;
        }

        public Builder setInputConfig(GlossaryInputConfigArgs inputConfig) {
            this.inputConfig = Input.of(Objects.requireNonNull(inputConfig));
            return this;
        }

        public Builder setLanguageCodesSet(@Nullable Input<LanguageCodesSetArgs> languageCodesSet) {
            this.languageCodesSet = languageCodesSet;
            return this;
        }

        public Builder setLanguageCodesSet(@Nullable LanguageCodesSetArgs languageCodesSet) {
            this.languageCodesSet = Input.ofNullable(languageCodesSet);
            return this;
        }

        public Builder setLanguagePair(@Nullable Input<LanguageCodePairArgs> languagePair) {
            this.languagePair = languagePair;
            return this;
        }

        public Builder setLanguagePair(@Nullable LanguageCodePairArgs languagePair) {
            this.languagePair = Input.ofNullable(languagePair);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public GlossaryArgs build() {
            return new GlossaryArgs(inputConfig, languageCodesSet, languagePair, location, name, project);
        }
    }
}
