// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.contactcenterinsights_v1.enums.PhraseMatcherRoleMatch;
import io.pulumi.googlenative.contactcenterinsights_v1.enums.PhraseMatcherType;
import io.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PhraseMatcherArgs extends io.pulumi.resources.ResourceArgs {

    public static final PhraseMatcherArgs Empty = new PhraseMatcherArgs();

    /**
     * Applies the phrase matcher only when it is active.
     * 
     */
    @InputImport(name="active")
    private final @Nullable Input<Boolean> active;

    public Input<Boolean> getActive() {
        return this.active == null ? Input.empty() : this.active;
    }

    /**
     * The human-readable name of the phrase matcher.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The resource name of the phrase matcher. Format: projects/{project}/locations/{location}/phraseMatchers/{phrase_matcher}
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of phase match rule groups that are included in this matcher.
     * 
     */
    @InputImport(name="phraseMatchRuleGroups")
    private final @Nullable Input<List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupArgs>> phraseMatchRuleGroups;

    public Input<List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupArgs>> getPhraseMatchRuleGroups() {
        return this.phraseMatchRuleGroups == null ? Input.empty() : this.phraseMatchRuleGroups;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The role whose utterances the phrase matcher should be matched against. If the role is ROLE_UNSPECIFIED it will be matched against any utterances in the transcript.
     * 
     */
    @InputImport(name="roleMatch")
    private final @Nullable Input<PhraseMatcherRoleMatch> roleMatch;

    public Input<PhraseMatcherRoleMatch> getRoleMatch() {
        return this.roleMatch == null ? Input.empty() : this.roleMatch;
    }

    /**
     * The type of this phrase matcher.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<PhraseMatcherType> type;

    public Input<PhraseMatcherType> getType() {
        return this.type;
    }

    /**
     * The customized version tag to use for the phrase matcher. If not specified, it will default to `revision_id`.
     * 
     */
    @InputImport(name="versionTag")
    private final @Nullable Input<String> versionTag;

    public Input<String> getVersionTag() {
        return this.versionTag == null ? Input.empty() : this.versionTag;
    }

    public PhraseMatcherArgs(
        @Nullable Input<Boolean> active,
        @Nullable Input<String> displayName,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupArgs>> phraseMatchRuleGroups,
        @Nullable Input<String> project,
        @Nullable Input<PhraseMatcherRoleMatch> roleMatch,
        Input<PhraseMatcherType> type,
        @Nullable Input<String> versionTag) {
        this.active = active;
        this.displayName = displayName;
        this.location = location;
        this.name = name;
        this.phraseMatchRuleGroups = phraseMatchRuleGroups;
        this.project = project;
        this.roleMatch = roleMatch;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.versionTag = versionTag;
    }

    private PhraseMatcherArgs() {
        this.active = Input.empty();
        this.displayName = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.phraseMatchRuleGroups = Input.empty();
        this.project = Input.empty();
        this.roleMatch = Input.empty();
        this.type = Input.empty();
        this.versionTag = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PhraseMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> active;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupArgs>> phraseMatchRuleGroups;
        private @Nullable Input<String> project;
        private @Nullable Input<PhraseMatcherRoleMatch> roleMatch;
        private Input<PhraseMatcherType> type;
        private @Nullable Input<String> versionTag;

        public Builder() {
    	      // Empty
        }

        public Builder(PhraseMatcherArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.displayName = defaults.displayName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.phraseMatchRuleGroups = defaults.phraseMatchRuleGroups;
    	      this.project = defaults.project;
    	      this.roleMatch = defaults.roleMatch;
    	      this.type = defaults.type;
    	      this.versionTag = defaults.versionTag;
        }

        public Builder setActive(@Nullable Input<Boolean> active) {
            this.active = active;
            return this;
        }

        public Builder setActive(@Nullable Boolean active) {
            this.active = Input.ofNullable(active);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
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

        public Builder setPhraseMatchRuleGroups(@Nullable Input<List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupArgs>> phraseMatchRuleGroups) {
            this.phraseMatchRuleGroups = phraseMatchRuleGroups;
            return this;
        }

        public Builder setPhraseMatchRuleGroups(@Nullable List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupArgs> phraseMatchRuleGroups) {
            this.phraseMatchRuleGroups = Input.ofNullable(phraseMatchRuleGroups);
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

        public Builder setRoleMatch(@Nullable Input<PhraseMatcherRoleMatch> roleMatch) {
            this.roleMatch = roleMatch;
            return this;
        }

        public Builder setRoleMatch(@Nullable PhraseMatcherRoleMatch roleMatch) {
            this.roleMatch = Input.ofNullable(roleMatch);
            return this;
        }

        public Builder setType(Input<PhraseMatcherType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(PhraseMatcherType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setVersionTag(@Nullable Input<String> versionTag) {
            this.versionTag = versionTag;
            return this;
        }

        public Builder setVersionTag(@Nullable String versionTag) {
            this.versionTag = Input.ofNullable(versionTag);
            return this;
        }

        public PhraseMatcherArgs build() {
            return new PhraseMatcherArgs(active, displayName, location, name, phraseMatchRuleGroups, project, roleMatch, type, versionTag);
        }
    }
}
