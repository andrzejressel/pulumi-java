// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigee;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.apigee.inputs.EnvironmentIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentIamBindingArgs Empty = new EnvironmentIamBindingArgs();

    @InputImport(name="condition")
    private final @Nullable Input<EnvironmentIamBindingConditionArgs> condition;

    public Input<EnvironmentIamBindingConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="envId", required=true)
    private final Input<String> envId;

    public Input<String> getEnvId() {
        return this.envId;
    }

    @InputImport(name="members", required=true)
    private final Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members;
    }

    @InputImport(name="orgId", required=true)
    private final Input<String> orgId;

    public Input<String> getOrgId() {
        return this.orgId;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.apigee.EnvironmentIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
    private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public EnvironmentIamBindingArgs(
        @Nullable Input<EnvironmentIamBindingConditionArgs> condition,
        Input<String> envId,
        Input<List<String>> members,
        Input<String> orgId,
        Input<String> role) {
        this.condition = condition;
        this.envId = Objects.requireNonNull(envId, "expected parameter 'envId' to be non-null");
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.orgId = Objects.requireNonNull(orgId, "expected parameter 'orgId' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private EnvironmentIamBindingArgs() {
        this.condition = Input.empty();
        this.envId = Input.empty();
        this.members = Input.empty();
        this.orgId = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EnvironmentIamBindingConditionArgs> condition;
        private Input<String> envId;
        private Input<List<String>> members;
        private Input<String> orgId;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.envId = defaults.envId;
    	      this.members = defaults.members;
    	      this.orgId = defaults.orgId;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<EnvironmentIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable EnvironmentIamBindingConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setEnvId(Input<String> envId) {
            this.envId = Objects.requireNonNull(envId);
            return this;
        }

        public Builder setEnvId(String envId) {
            this.envId = Input.of(Objects.requireNonNull(envId));
            return this;
        }

        public Builder setMembers(Input<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder setMembers(List<String> members) {
            this.members = Input.of(Objects.requireNonNull(members));
            return this;
        }

        public Builder setOrgId(Input<String> orgId) {
            this.orgId = Objects.requireNonNull(orgId);
            return this;
        }

        public Builder setOrgId(String orgId) {
            this.orgId = Input.of(Objects.requireNonNull(orgId));
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

        public EnvironmentIamBindingArgs build() {
            return new EnvironmentIamBindingArgs(condition, envId, members, orgId, role);
        }
    }
}
