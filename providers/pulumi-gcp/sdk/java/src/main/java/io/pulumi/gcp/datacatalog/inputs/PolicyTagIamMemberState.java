// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.datacatalog.inputs.PolicyTagIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyTagIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final PolicyTagIamMemberState Empty = new PolicyTagIamMemberState();

    @InputImport(name="condition")
    private final @Nullable Input<PolicyTagIamMemberConditionGetArgs> condition;

    public Input<PolicyTagIamMemberConditionGetArgs> getCondition() {
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
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="policyTag")
    private final @Nullable Input<String> policyTag;

    public Input<String> getPolicyTag() {
        return this.policyTag == null ? Input.empty() : this.policyTag;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.datacatalog.PolicyTagIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
    private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public PolicyTagIamMemberState(
        @Nullable Input<PolicyTagIamMemberConditionGetArgs> condition,
        @Nullable Input<String> etag,
        @Nullable Input<String> member,
        @Nullable Input<String> policyTag,
        @Nullable Input<String> role) {
        this.condition = condition;
        this.etag = etag;
        this.member = member;
        this.policyTag = policyTag;
        this.role = role;
    }

    private PolicyTagIamMemberState() {
        this.condition = Input.empty();
        this.etag = Input.empty();
        this.member = Input.empty();
        this.policyTag = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTagIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PolicyTagIamMemberConditionGetArgs> condition;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> member;
        private @Nullable Input<String> policyTag;
        private @Nullable Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyTagIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.member = defaults.member;
    	      this.policyTag = defaults.policyTag;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<PolicyTagIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable PolicyTagIamMemberConditionGetArgs condition) {
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

        public Builder setPolicyTag(@Nullable Input<String> policyTag) {
            this.policyTag = policyTag;
            return this;
        }

        public Builder setPolicyTag(@Nullable String policyTag) {
            this.policyTag = Input.ofNullable(policyTag);
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

        public PolicyTagIamMemberState build() {
            return new PolicyTagIamMemberState(condition, etag, member, policyTag, role);
        }
    }
}
