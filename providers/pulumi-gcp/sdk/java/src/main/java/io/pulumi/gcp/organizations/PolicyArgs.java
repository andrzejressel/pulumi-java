// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.organizations.inputs.PolicyBooleanPolicyArgs;
import io.pulumi.gcp.organizations.inputs.PolicyListPolicyArgs;
import io.pulumi.gcp.organizations.inputs.PolicyRestorePolicyArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * A boolean policy is a constraint that is either enforced or not. Structure is documented
     * below.
     * 
     */
    @InputImport(name="booleanPolicy")
    private final @Nullable Input<PolicyBooleanPolicyArgs> booleanPolicy;

    public Input<PolicyBooleanPolicyArgs> getBooleanPolicy() {
        return this.booleanPolicy == null ? Input.empty() : this.booleanPolicy;
    }

    /**
     * The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
     * 
     */
    @InputImport(name="constraint", required=true)
    private final Input<String> constraint;

    public Input<String> getConstraint() {
        return this.constraint;
    }

    /**
     * A policy that can define specific values that are allowed or denied for the given constraint. It can also be used to allow or deny all values. Structure is documented below.
     * 
     */
    @InputImport(name="listPolicy")
    private final @Nullable Input<PolicyListPolicyArgs> listPolicy;

    public Input<PolicyListPolicyArgs> getListPolicy() {
        return this.listPolicy == null ? Input.empty() : this.listPolicy;
    }

    /**
     * The numeric ID of the organization to set the policy for.
     * 
     */
    @InputImport(name="orgId", required=true)
    private final Input<String> orgId;

    public Input<String> getOrgId() {
        return this.orgId;
    }

    /**
     * A restore policy is a constraint to restore the default policy. Structure is documented below.
     * 
     */
    @InputImport(name="restorePolicy")
    private final @Nullable Input<PolicyRestorePolicyArgs> restorePolicy;

    public Input<PolicyRestorePolicyArgs> getRestorePolicy() {
        return this.restorePolicy == null ? Input.empty() : this.restorePolicy;
    }

    /**
     * Version of the Policy. Default version is 0.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<Integer> version;

    public Input<Integer> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public PolicyArgs(
        @Nullable Input<PolicyBooleanPolicyArgs> booleanPolicy,
        Input<String> constraint,
        @Nullable Input<PolicyListPolicyArgs> listPolicy,
        Input<String> orgId,
        @Nullable Input<PolicyRestorePolicyArgs> restorePolicy,
        @Nullable Input<Integer> version) {
        this.booleanPolicy = booleanPolicy;
        this.constraint = Objects.requireNonNull(constraint, "expected parameter 'constraint' to be non-null");
        this.listPolicy = listPolicy;
        this.orgId = Objects.requireNonNull(orgId, "expected parameter 'orgId' to be non-null");
        this.restorePolicy = restorePolicy;
        this.version = version;
    }

    private PolicyArgs() {
        this.booleanPolicy = Input.empty();
        this.constraint = Input.empty();
        this.listPolicy = Input.empty();
        this.orgId = Input.empty();
        this.restorePolicy = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PolicyBooleanPolicyArgs> booleanPolicy;
        private Input<String> constraint;
        private @Nullable Input<PolicyListPolicyArgs> listPolicy;
        private Input<String> orgId;
        private @Nullable Input<PolicyRestorePolicyArgs> restorePolicy;
        private @Nullable Input<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.booleanPolicy = defaults.booleanPolicy;
    	      this.constraint = defaults.constraint;
    	      this.listPolicy = defaults.listPolicy;
    	      this.orgId = defaults.orgId;
    	      this.restorePolicy = defaults.restorePolicy;
    	      this.version = defaults.version;
        }

        public Builder setBooleanPolicy(@Nullable Input<PolicyBooleanPolicyArgs> booleanPolicy) {
            this.booleanPolicy = booleanPolicy;
            return this;
        }

        public Builder setBooleanPolicy(@Nullable PolicyBooleanPolicyArgs booleanPolicy) {
            this.booleanPolicy = Input.ofNullable(booleanPolicy);
            return this;
        }

        public Builder setConstraint(Input<String> constraint) {
            this.constraint = Objects.requireNonNull(constraint);
            return this;
        }

        public Builder setConstraint(String constraint) {
            this.constraint = Input.of(Objects.requireNonNull(constraint));
            return this;
        }

        public Builder setListPolicy(@Nullable Input<PolicyListPolicyArgs> listPolicy) {
            this.listPolicy = listPolicy;
            return this;
        }

        public Builder setListPolicy(@Nullable PolicyListPolicyArgs listPolicy) {
            this.listPolicy = Input.ofNullable(listPolicy);
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

        public Builder setRestorePolicy(@Nullable Input<PolicyRestorePolicyArgs> restorePolicy) {
            this.restorePolicy = restorePolicy;
            return this;
        }

        public Builder setRestorePolicy(@Nullable PolicyRestorePolicyArgs restorePolicy) {
            this.restorePolicy = Input.ofNullable(restorePolicy);
            return this;
        }

        public Builder setVersion(@Nullable Input<Integer> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable Integer version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public PolicyArgs build() {
            return new PolicyArgs(booleanPolicy, constraint, listPolicy, orgId, restorePolicy, version);
        }
    }
}
