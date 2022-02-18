// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.AuthProviderResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.AuthenticationRuleResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AuthenticationResponse {
    /**
     * Defines a set of authentication providers that a service supports.
     * 
     */
    private final List<AuthProviderResponse> providers;
    /**
     * A list of authentication rules that apply to individual API methods. **NOTE:** All service configuration rules follow "last one wins" order.
     * 
     */
    private final List<AuthenticationRuleResponse> rules;

    @OutputCustomType.Constructor({"providers","rules"})
    private AuthenticationResponse(
        List<AuthProviderResponse> providers,
        List<AuthenticationRuleResponse> rules) {
        this.providers = Objects.requireNonNull(providers);
        this.rules = Objects.requireNonNull(rules);
    }

    /**
     * Defines a set of authentication providers that a service supports.
     * 
     */
    public List<AuthProviderResponse> getProviders() {
        return this.providers;
    }
    /**
     * A list of authentication rules that apply to individual API methods. **NOTE:** All service configuration rules follow "last one wins" order.
     * 
     */
    public List<AuthenticationRuleResponse> getRules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AuthProviderResponse> providers;
        private List<AuthenticationRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.providers = defaults.providers;
    	      this.rules = defaults.rules;
        }

        public Builder setProviders(List<AuthProviderResponse> providers) {
            this.providers = Objects.requireNonNull(providers);
            return this;
        }

        public Builder setRules(List<AuthenticationRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public AuthenticationResponse build() {
            return new AuthenticationResponse(providers, rules);
        }
    }
}
