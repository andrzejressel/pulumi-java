// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.OpenAuthenticationAccessPolicyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class OpenAuthenticationAccessPoliciesResponse {
    /**
     * Open authentication policies.
     * 
     */
    private final @Nullable Map<String,OpenAuthenticationAccessPolicyResponse> policies;

    @OutputCustomType.Constructor
    private OpenAuthenticationAccessPoliciesResponse(@OutputCustomType.Parameter("policies") @Nullable Map<String,OpenAuthenticationAccessPolicyResponse> policies) {
        this.policies = policies;
    }

    /**
     * Open authentication policies.
     * 
    */
    public Map<String,OpenAuthenticationAccessPolicyResponse> getPolicies() {
        return this.policies == null ? Map.of() : this.policies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenAuthenticationAccessPoliciesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,OpenAuthenticationAccessPolicyResponse> policies;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenAuthenticationAccessPoliciesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policies = defaults.policies;
        }

        public Builder setPolicies(@Nullable Map<String,OpenAuthenticationAccessPolicyResponse> policies) {
            this.policies = policies;
            return this;
        }
        public OpenAuthenticationAccessPoliciesResponse build() {
            return new OpenAuthenticationAccessPoliciesResponse(policies);
        }
    }
}
