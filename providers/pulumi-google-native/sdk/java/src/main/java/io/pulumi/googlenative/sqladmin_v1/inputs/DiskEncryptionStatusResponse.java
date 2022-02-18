// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Disk encryption status for an instance.
 * 
 */
public final class DiskEncryptionStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiskEncryptionStatusResponse Empty = new DiskEncryptionStatusResponse();

    /**
     * This is always `sql#diskEncryptionStatus`.
     * 
     */
    @InputImport(name="kind", required=true)
    private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * KMS key version used to encrypt the Cloud SQL instance resource
     * 
     */
    @InputImport(name="kmsKeyVersionName", required=true)
    private final String kmsKeyVersionName;

    public String getKmsKeyVersionName() {
        return this.kmsKeyVersionName;
    }

    public DiskEncryptionStatusResponse(
        String kind,
        String kmsKeyVersionName) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.kmsKeyVersionName = Objects.requireNonNull(kmsKeyVersionName, "expected parameter 'kmsKeyVersionName' to be non-null");
    }

    private DiskEncryptionStatusResponse() {
        this.kind = null;
        this.kmsKeyVersionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskEncryptionStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String kmsKeyVersionName;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskEncryptionStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.kmsKeyVersionName = defaults.kmsKeyVersionName;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKmsKeyVersionName(String kmsKeyVersionName) {
            this.kmsKeyVersionName = Objects.requireNonNull(kmsKeyVersionName);
            return this;
        }

        public DiskEncryptionStatusResponse build() {
            return new DiskEncryptionStatusResponse(kind, kmsKeyVersionName);
        }
    }
}
