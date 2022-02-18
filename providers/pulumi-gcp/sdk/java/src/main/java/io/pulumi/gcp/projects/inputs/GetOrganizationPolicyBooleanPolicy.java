// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class GetOrganizationPolicyBooleanPolicy extends io.pulumi.resources.InvokeArgs {

    public static final GetOrganizationPolicyBooleanPolicy Empty = new GetOrganizationPolicyBooleanPolicy();

    @InputImport(name="enforced", required=true)
    private final Boolean enforced;

    public Boolean getEnforced() {
        return this.enforced;
    }

    public GetOrganizationPolicyBooleanPolicy(Boolean enforced) {
        this.enforced = Objects.requireNonNull(enforced, "expected parameter 'enforced' to be non-null");
    }

    private GetOrganizationPolicyBooleanPolicy() {
        this.enforced = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationPolicyBooleanPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enforced;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationPolicyBooleanPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforced = defaults.enforced;
        }

        public Builder setEnforced(Boolean enforced) {
            this.enforced = Objects.requireNonNull(enforced);
            return this;
        }

        public GetOrganizationPolicyBooleanPolicy build() {
            return new GetOrganizationPolicyBooleanPolicy(enforced);
        }
    }
}
