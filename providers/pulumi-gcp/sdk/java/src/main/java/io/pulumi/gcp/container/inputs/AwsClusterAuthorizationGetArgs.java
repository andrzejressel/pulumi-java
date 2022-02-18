// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.container.inputs.AwsClusterAuthorizationAdminUserGetArgs;
import java.util.List;
import java.util.Objects;


public final class AwsClusterAuthorizationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsClusterAuthorizationGetArgs Empty = new AwsClusterAuthorizationGetArgs();

    /**
     * Required. Users to perform operations as a cluster admin. A managed ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole to the users. At most one user can be specified. For more info on RBAC, see https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * 
     */
    @InputImport(name="adminUsers", required=true)
    private final Input<List<AwsClusterAuthorizationAdminUserGetArgs>> adminUsers;

    public Input<List<AwsClusterAuthorizationAdminUserGetArgs>> getAdminUsers() {
        return this.adminUsers;
    }

    public AwsClusterAuthorizationGetArgs(Input<List<AwsClusterAuthorizationAdminUserGetArgs>> adminUsers) {
        this.adminUsers = Objects.requireNonNull(adminUsers, "expected parameter 'adminUsers' to be non-null");
    }

    private AwsClusterAuthorizationGetArgs() {
        this.adminUsers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterAuthorizationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<AwsClusterAuthorizationAdminUserGetArgs>> adminUsers;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterAuthorizationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminUsers = defaults.adminUsers;
        }

        public Builder setAdminUsers(Input<List<AwsClusterAuthorizationAdminUserGetArgs>> adminUsers) {
            this.adminUsers = Objects.requireNonNull(adminUsers);
            return this;
        }

        public Builder setAdminUsers(List<AwsClusterAuthorizationAdminUserGetArgs> adminUsers) {
            this.adminUsers = Input.of(Objects.requireNonNull(adminUsers));
            return this;
        }

        public AwsClusterAuthorizationGetArgs build() {
            return new AwsClusterAuthorizationGetArgs(adminUsers);
        }
    }
}
