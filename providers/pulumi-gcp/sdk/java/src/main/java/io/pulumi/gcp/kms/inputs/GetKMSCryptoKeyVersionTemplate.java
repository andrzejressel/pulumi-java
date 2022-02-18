// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetKMSCryptoKeyVersionTemplate extends io.pulumi.resources.InvokeArgs {

    public static final GetKMSCryptoKeyVersionTemplate Empty = new GetKMSCryptoKeyVersionTemplate();

    @InputImport(name="algorithm", required=true)
    private final String algorithm;

    public String getAlgorithm() {
        return this.algorithm;
    }

    @InputImport(name="protectionLevel", required=true)
    private final String protectionLevel;

    public String getProtectionLevel() {
        return this.protectionLevel;
    }

    public GetKMSCryptoKeyVersionTemplate(
        String algorithm,
        String protectionLevel) {
        this.algorithm = Objects.requireNonNull(algorithm, "expected parameter 'algorithm' to be non-null");
        this.protectionLevel = Objects.requireNonNull(protectionLevel, "expected parameter 'protectionLevel' to be non-null");
    }

    private GetKMSCryptoKeyVersionTemplate() {
        this.algorithm = null;
        this.protectionLevel = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKMSCryptoKeyVersionTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private String protectionLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKMSCryptoKeyVersionTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.protectionLevel = defaults.protectionLevel;
        }

        public Builder setAlgorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder setProtectionLevel(String protectionLevel) {
            this.protectionLevel = Objects.requireNonNull(protectionLevel);
            return this;
        }

        public GetKMSCryptoKeyVersionTemplate build() {
            return new GetKMSCryptoKeyVersionTemplate(algorithm, protectionLevel);
        }
    }
}
