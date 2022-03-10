// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class PermissionsResponse {
    /**
     * Permissions to certificates
     * 
     */
    private final @Nullable List<String> certificates;
    /**
     * Permissions to keys
     * 
     */
    private final @Nullable List<String> keys;
    /**
     * Permissions to secrets
     * 
     */
    private final @Nullable List<String> secrets;
    /**
     * Permissions to storage accounts
     * 
     */
    private final @Nullable List<String> storage;

    @OutputCustomType.Constructor
    private PermissionsResponse(
        @OutputCustomType.Parameter("certificates") @Nullable List<String> certificates,
        @OutputCustomType.Parameter("keys") @Nullable List<String> keys,
        @OutputCustomType.Parameter("secrets") @Nullable List<String> secrets,
        @OutputCustomType.Parameter("storage") @Nullable List<String> storage) {
        this.certificates = certificates;
        this.keys = keys;
        this.secrets = secrets;
        this.storage = storage;
    }

    /**
     * Permissions to certificates
     * 
    */
    public List<String> getCertificates() {
        return this.certificates == null ? List.of() : this.certificates;
    }
    /**
     * Permissions to keys
     * 
    */
    public List<String> getKeys() {
        return this.keys == null ? List.of() : this.keys;
    }
    /**
     * Permissions to secrets
     * 
    */
    public List<String> getSecrets() {
        return this.secrets == null ? List.of() : this.secrets;
    }
    /**
     * Permissions to storage accounts
     * 
    */
    public List<String> getStorage() {
        return this.storage == null ? List.of() : this.storage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> certificates;
        private @Nullable List<String> keys;
        private @Nullable List<String> secrets;
        private @Nullable List<String> storage;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificates = defaults.certificates;
    	      this.keys = defaults.keys;
    	      this.secrets = defaults.secrets;
    	      this.storage = defaults.storage;
        }

        public Builder setCertificates(@Nullable List<String> certificates) {
            this.certificates = certificates;
            return this;
        }

        public Builder setKeys(@Nullable List<String> keys) {
            this.keys = keys;
            return this;
        }

        public Builder setSecrets(@Nullable List<String> secrets) {
            this.secrets = secrets;
            return this;
        }

        public Builder setStorage(@Nullable List<String> storage) {
            this.storage = storage;
            return this;
        }
        public PermissionsResponse build() {
            return new PermissionsResponse(certificates, keys, secrets, storage);
        }
    }
}
