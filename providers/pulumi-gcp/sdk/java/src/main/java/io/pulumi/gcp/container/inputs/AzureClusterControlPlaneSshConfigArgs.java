// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AzureClusterControlPlaneSshConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureClusterControlPlaneSshConfigArgs Empty = new AzureClusterControlPlaneSshConfigArgs();

    /**
     * Required. The SSH public key data for VMs managed by Anthos. This accepts the authorized_keys file format used in OpenSSH according to the sshd(8) manual page.
     * 
     */
    @InputImport(name="authorizedKey", required=true)
    private final Input<String> authorizedKey;

    public Input<String> getAuthorizedKey() {
        return this.authorizedKey;
    }

    public AzureClusterControlPlaneSshConfigArgs(Input<String> authorizedKey) {
        this.authorizedKey = Objects.requireNonNull(authorizedKey, "expected parameter 'authorizedKey' to be non-null");
    }

    private AzureClusterControlPlaneSshConfigArgs() {
        this.authorizedKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterControlPlaneSshConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> authorizedKey;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterControlPlaneSshConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedKey = defaults.authorizedKey;
        }

        public Builder setAuthorizedKey(Input<String> authorizedKey) {
            this.authorizedKey = Objects.requireNonNull(authorizedKey);
            return this;
        }

        public Builder setAuthorizedKey(String authorizedKey) {
            this.authorizedKey = Input.of(Objects.requireNonNull(authorizedKey));
            return this;
        }

        public AzureClusterControlPlaneSshConfigArgs build() {
            return new AzureClusterControlPlaneSshConfigArgs(authorizedKey);
        }
    }
}
