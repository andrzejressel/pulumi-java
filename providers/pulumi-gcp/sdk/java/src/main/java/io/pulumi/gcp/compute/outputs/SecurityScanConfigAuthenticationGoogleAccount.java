// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SecurityScanConfigAuthenticationGoogleAccount {
    /**
     * The password of the custom account. The credential is stored encrypted
     * in GCP.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    private final String password;
    /**
     * The user name of the custom account.
     * 
     */
    private final String username;

    @OutputCustomType.Constructor({"password","username"})
    private SecurityScanConfigAuthenticationGoogleAccount(
        String password,
        String username) {
        this.password = Objects.requireNonNull(password);
        this.username = Objects.requireNonNull(username);
    }

    /**
     * The password of the custom account. The credential is stored encrypted
     * in GCP.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public String getPassword() {
        return this.password;
    }
    /**
     * The user name of the custom account.
     * 
     */
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityScanConfigAuthenticationGoogleAccount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityScanConfigAuthenticationGoogleAccount defaults) {
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

        public SecurityScanConfigAuthenticationGoogleAccount build() {
            return new SecurityScanConfigAuthenticationGoogleAccount(password, username);
        }
    }
}
