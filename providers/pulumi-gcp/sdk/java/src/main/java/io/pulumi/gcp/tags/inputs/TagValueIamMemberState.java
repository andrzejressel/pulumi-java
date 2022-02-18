// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tags.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.tags.inputs.TagValueIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagValueIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final TagValueIamMemberState Empty = new TagValueIamMemberState();

    @InputImport(name="condition")
    private final @Nullable Input<TagValueIamMemberConditionGetArgs> condition;

    public Input<TagValueIamMemberConditionGetArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="member")
    private final @Nullable Input<String> member;

    public Input<String> getMember() {
        return this.member == null ? Input.empty() : this.member;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.tags.TagValueIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
    private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="tagValue")
    private final @Nullable Input<String> tagValue;

    public Input<String> getTagValue() {
        return this.tagValue == null ? Input.empty() : this.tagValue;
    }

    public TagValueIamMemberState(
        @Nullable Input<TagValueIamMemberConditionGetArgs> condition,
        @Nullable Input<String> etag,
        @Nullable Input<String> member,
        @Nullable Input<String> role,
        @Nullable Input<String> tagValue) {
        this.condition = condition;
        this.etag = etag;
        this.member = member;
        this.role = role;
        this.tagValue = tagValue;
    }

    private TagValueIamMemberState() {
        this.condition = Input.empty();
        this.etag = Input.empty();
        this.member = Input.empty();
        this.role = Input.empty();
        this.tagValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagValueIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TagValueIamMemberConditionGetArgs> condition;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> member;
        private @Nullable Input<String> role;
        private @Nullable Input<String> tagValue;

        public Builder() {
    	      // Empty
        }

        public Builder(TagValueIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
    	      this.tagValue = defaults.tagValue;
        }

        public Builder setCondition(@Nullable Input<TagValueIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable TagValueIamMemberConditionGetArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setMember(@Nullable Input<String> member) {
            this.member = member;
            return this;
        }

        public Builder setMember(@Nullable String member) {
            this.member = Input.ofNullable(member);
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public Builder setTagValue(@Nullable Input<String> tagValue) {
            this.tagValue = tagValue;
            return this;
        }

        public Builder setTagValue(@Nullable String tagValue) {
            this.tagValue = Input.ofNullable(tagValue);
            return this;
        }

        public TagValueIamMemberState build() {
            return new TagValueIamMemberState(condition, etag, member, role, tagValue);
        }
    }
}
