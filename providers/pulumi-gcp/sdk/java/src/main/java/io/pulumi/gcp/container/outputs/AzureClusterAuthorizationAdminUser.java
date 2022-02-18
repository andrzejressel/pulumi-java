// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AzureClusterAuthorizationAdminUser {
    /**
     * Required. The name of the user, e.g. `my-gcp-id@gmail.com`.
     * 
     */
    private final String username;

    @OutputCustomType.Constructor({"username"})
    private AzureClusterAuthorizationAdminUser(String username) {
        this.username = Objects.requireNonNull(username);
    }

    /**
     * Required. The name of the user, e.g. `my-gcp-id@gmail.com`.
     * 
     */
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterAuthorizationAdminUser defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterAuthorizationAdminUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.username = defaults.username;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public AzureClusterAuthorizationAdminUser build() {
            return new AzureClusterAuthorizationAdminUser(username);
        }
    }
}
