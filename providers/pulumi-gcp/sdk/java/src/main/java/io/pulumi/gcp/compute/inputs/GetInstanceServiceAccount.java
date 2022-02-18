// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetInstanceServiceAccount extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceServiceAccount Empty = new GetInstanceServiceAccount();

    /**
     * The service account e-mail address.
     * 
     */
    @InputImport(name="email", required=true)
    private final String email;

    public String getEmail() {
        return this.email;
    }

    /**
     * A list of service scopes.
     * 
     */
    @InputImport(name="scopes", required=true)
    private final List<String> scopes;

    public List<String> getScopes() {
        return this.scopes;
    }

    public GetInstanceServiceAccount(
        String email,
        List<String> scopes) {
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.scopes = Objects.requireNonNull(scopes, "expected parameter 'scopes' to be non-null");
    }

    private GetInstanceServiceAccount() {
        this.email = null;
        this.scopes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceServiceAccount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private List<String> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceServiceAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.scopes = defaults.scopes;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setScopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }

        public GetInstanceServiceAccount build() {
            return new GetInstanceServiceAccount(email, scopes);
        }
    }
}
