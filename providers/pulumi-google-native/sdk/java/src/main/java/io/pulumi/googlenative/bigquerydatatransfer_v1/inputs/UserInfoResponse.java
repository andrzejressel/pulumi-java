// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquerydatatransfer_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Information about a user.
 * 
 */
public final class UserInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final UserInfoResponse Empty = new UserInfoResponse();

    /**
     * E-mail address of the user.
     * 
     */
    @InputImport(name="email", required=true)
    private final String email;

    public String getEmail() {
        return this.email;
    }

    public UserInfoResponse(String email) {
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
    }

    private UserInfoResponse() {
        this.email = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;

        public Builder() {
    	      // Empty
        }

        public Builder(UserInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public UserInfoResponse build() {
            return new UserInfoResponse(email);
        }
    }
}
