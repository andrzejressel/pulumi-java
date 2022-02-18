// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSecretReplicationUserManagedReplicaCustomerManagedEncryption extends io.pulumi.resources.InvokeArgs {

    public static final GetSecretReplicationUserManagedReplicaCustomerManagedEncryption Empty = new GetSecretReplicationUserManagedReplicaCustomerManagedEncryption();

    @InputImport(name="kmsKeyName", required=true)
    private final String kmsKeyName;

    public String getKmsKeyName() {
        return this.kmsKeyName;
    }

    public GetSecretReplicationUserManagedReplicaCustomerManagedEncryption(String kmsKeyName) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
    }

    private GetSecretReplicationUserManagedReplicaCustomerManagedEncryption() {
        this.kmsKeyName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretReplicationUserManagedReplicaCustomerManagedEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretReplicationUserManagedReplicaCustomerManagedEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public GetSecretReplicationUserManagedReplicaCustomerManagedEncryption build() {
            return new GetSecretReplicationUserManagedReplicaCustomerManagedEncryption(kmsKeyName);
        }
    }
}
