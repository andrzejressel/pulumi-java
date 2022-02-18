// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class PolicyBooleanPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyBooleanPolicyGetArgs Empty = new PolicyBooleanPolicyGetArgs();

    /**
     * If true, then the Policy is enforced. If false, then any configuration is acceptable.
     * 
     */
    @InputImport(name="enforced", required=true)
    private final Input<Boolean> enforced;

    public Input<Boolean> getEnforced() {
        return this.enforced;
    }

    public PolicyBooleanPolicyGetArgs(Input<Boolean> enforced) {
        this.enforced = Objects.requireNonNull(enforced, "expected parameter 'enforced' to be non-null");
    }

    private PolicyBooleanPolicyGetArgs() {
        this.enforced = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyBooleanPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> enforced;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyBooleanPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforced = defaults.enforced;
        }

        public Builder setEnforced(Input<Boolean> enforced) {
            this.enforced = Objects.requireNonNull(enforced);
            return this;
        }

        public Builder setEnforced(Boolean enforced) {
            this.enforced = Input.of(Objects.requireNonNull(enforced));
            return this;
        }

        public PolicyBooleanPolicyGetArgs build() {
            return new PolicyBooleanPolicyGetArgs(enforced);
        }
    }
}
