// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Disk encryption configuration for an instance.
 * 
 */
public final class DiskEncryptionConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiskEncryptionConfigurationResponse Empty = new DiskEncryptionConfigurationResponse();

    /**
     * This is always `sql#diskEncryptionConfiguration`.
     * 
     */
    @InputImport(name="kind", required=true)
    private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * Resource name of KMS key for disk encryption
     * 
     */
    @InputImport(name="kmsKeyName", required=true)
    private final String kmsKeyName;

    public String getKmsKeyName() {
        return this.kmsKeyName;
    }

    public DiskEncryptionConfigurationResponse(
        String kind,
        String kmsKeyName) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
    }

    private DiskEncryptionConfigurationResponse() {
        this.kind = null;
        this.kmsKeyName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskEncryptionConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskEncryptionConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public DiskEncryptionConfigurationResponse build() {
            return new DiskEncryptionConfigurationResponse(kind, kmsKeyName);
        }
    }
}
