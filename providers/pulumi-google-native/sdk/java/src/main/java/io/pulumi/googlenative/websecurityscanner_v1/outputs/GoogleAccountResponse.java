// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleAccountResponse {
    /**
     * Input only. The password of the Google account. The credential is stored encrypted and not returned in any response nor included in audit logs.
     * 
     */
    private final String password;
    /**
     * The user name of the Google account.
     * 
     */
    private final String username;

    @OutputCustomType.Constructor({"password","username"})
    private GoogleAccountResponse(
        String password,
        String username) {
        this.password = Objects.requireNonNull(password);
        this.username = Objects.requireNonNull(username);
    }

    /**
     * Input only. The password of the Google account. The credential is stored encrypted and not returned in any response nor included in audit logs.
     * 
     */
    public String getPassword() {
        return this.password;
    }
    /**
     * The user name of the Google account.
     * 
     */
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public GoogleAccountResponse build() {
            return new GoogleAccountResponse(password, username);
        }
    }
}
