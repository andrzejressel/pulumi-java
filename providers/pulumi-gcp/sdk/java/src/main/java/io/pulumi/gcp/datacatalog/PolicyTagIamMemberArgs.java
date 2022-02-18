// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.datacatalog.inputs.PolicyTagIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyTagIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyTagIamMemberArgs Empty = new PolicyTagIamMemberArgs();

    @InputImport(name="condition")
    private final @Nullable Input<PolicyTagIamMemberConditionArgs> condition;

    public Input<PolicyTagIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="member", required=true)
    private final Input<String> member;

    public Input<String> getMember() {
        return this.member;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="policyTag", required=true)
    private final Input<String> policyTag;

    public Input<String> getPolicyTag() {
        return this.policyTag;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.datacatalog.PolicyTagIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
    private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public PolicyTagIamMemberArgs(
        @Nullable Input<PolicyTagIamMemberConditionArgs> condition,
        Input<String> member,
        Input<String> policyTag,
        Input<String> role) {
        this.condition = condition;
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.policyTag = Objects.requireNonNull(policyTag, "expected parameter 'policyTag' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private PolicyTagIamMemberArgs() {
        this.condition = Input.empty();
        this.member = Input.empty();
        this.policyTag = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTagIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PolicyTagIamMemberConditionArgs> condition;
        private Input<String> member;
        private Input<String> policyTag;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyTagIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.member = defaults.member;
    	      this.policyTag = defaults.policyTag;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<PolicyTagIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable PolicyTagIamMemberConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setMember(Input<String> member) {
            this.member = Objects.requireNonNull(member);
            return this;
        }

        public Builder setMember(String member) {
            this.member = Input.of(Objects.requireNonNull(member));
            return this;
        }

        public Builder setPolicyTag(Input<String> policyTag) {
            this.policyTag = Objects.requireNonNull(policyTag);
            return this;
        }

        public Builder setPolicyTag(String policyTag) {
            this.policyTag = Input.of(Objects.requireNonNull(policyTag));
            return this;
        }

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }

        public PolicyTagIamMemberArgs build() {
            return new PolicyTagIamMemberArgs(condition, member, policyTag, role);
        }
    }
}
