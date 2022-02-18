// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.serviceAccount.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.serviceAccount.inputs.IAMBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IAMBindingState extends io.pulumi.resources.ResourceArgs {

    public static final IAMBindingState Empty = new IAMBindingState();

    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @InputImport(name="condition")
    private final @Nullable Input<IAMBindingConditionGetArgs> condition;

    public Input<IAMBindingConditionGetArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the service account IAM policy.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="members")
    private final @Nullable Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members == null ? Input.empty() : this.members;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.serviceAccount.IAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
    private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    /**
     * The fully-qualified name of the service account to apply policy to.
     * 
     */
    @InputImport(name="serviceAccountId")
    private final @Nullable Input<String> serviceAccountId;

    public Input<String> getServiceAccountId() {
        return this.serviceAccountId == null ? Input.empty() : this.serviceAccountId;
    }

    public IAMBindingState(
        @Nullable Input<IAMBindingConditionGetArgs> condition,
        @Nullable Input<String> etag,
        @Nullable Input<List<String>> members,
        @Nullable Input<String> role,
        @Nullable Input<String> serviceAccountId) {
        this.condition = condition;
        this.etag = etag;
        this.members = members;
        this.role = role;
        this.serviceAccountId = serviceAccountId;
    }

    private IAMBindingState() {
        this.condition = Input.empty();
        this.etag = Input.empty();
        this.members = Input.empty();
        this.role = Input.empty();
        this.serviceAccountId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IAMBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IAMBindingConditionGetArgs> condition;
        private @Nullable Input<String> etag;
        private @Nullable Input<List<String>> members;
        private @Nullable Input<String> role;
        private @Nullable Input<String> serviceAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(IAMBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
    	      this.serviceAccountId = defaults.serviceAccountId;
        }

        public Builder setCondition(@Nullable Input<IAMBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable IAMBindingConditionGetArgs condition) {
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

        public Builder setMembers(@Nullable Input<List<String>> members) {
            this.members = members;
            return this;
        }

        public Builder setMembers(@Nullable List<String> members) {
            this.members = Input.ofNullable(members);
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

        public Builder setServiceAccountId(@Nullable Input<String> serviceAccountId) {
            this.serviceAccountId = serviceAccountId;
            return this;
        }

        public Builder setServiceAccountId(@Nullable String serviceAccountId) {
            this.serviceAccountId = Input.ofNullable(serviceAccountId);
            return this;
        }

        public IAMBindingState build() {
            return new IAMBindingState(condition, etag, members, role, serviceAccountId);
        }
    }
}
