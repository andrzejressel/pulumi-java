// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AwsClusterAuthorizationAdminUserGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsClusterAuthorizationAdminUserGetArgs Empty = new AwsClusterAuthorizationAdminUserGetArgs();

    /**
     * Required. The name of the user, e.g. `my-gcp-id@gmail.com`.
     * 
     */
    @InputImport(name="username", required=true)
    private final Input<String> username;

    public Input<String> getUsername() {
        return this.username;
    }

    public AwsClusterAuthorizationAdminUserGetArgs(Input<String> username) {
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private AwsClusterAuthorizationAdminUserGetArgs() {
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterAuthorizationAdminUserGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterAuthorizationAdminUserGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.username = defaults.username;
        }

        public Builder setUsername(Input<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Input.of(Objects.requireNonNull(username));
            return this;
        }

        public AwsClusterAuthorizationAdminUserGetArgs build() {
            return new AwsClusterAuthorizationAdminUserGetArgs(username);
        }
    }
}
