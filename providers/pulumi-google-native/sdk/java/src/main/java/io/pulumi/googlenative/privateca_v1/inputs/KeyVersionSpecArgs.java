// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1.enums.KeyVersionSpecAlgorithm;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Cloud KMS key configuration that a CertificateAuthority will use.
 * 
 */
public final class KeyVersionSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVersionSpecArgs Empty = new KeyVersionSpecArgs();

    /**
     * The algorithm to use for creating a managed Cloud KMS key for a for a simplified experience. All managed keys will be have their ProtectionLevel as `HSM`.
     * 
     */
    @InputImport(name="algorithm")
    private final @Nullable Input<KeyVersionSpecAlgorithm> algorithm;

    public Input<KeyVersionSpecAlgorithm> getAlgorithm() {
        return this.algorithm == null ? Input.empty() : this.algorithm;
    }

    /**
     * The resource name for an existing Cloud KMS CryptoKeyVersion in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*{@literal /}cryptoKeyVersions/*`. This option enables full flexibility in the key's capabilities and properties.
     * 
     */
    @InputImport(name="cloudKmsKeyVersion")
    private final @Nullable Input<String> cloudKmsKeyVersion;

    public Input<String> getCloudKmsKeyVersion() {
        return this.cloudKmsKeyVersion == null ? Input.empty() : this.cloudKmsKeyVersion;
    }

    public KeyVersionSpecArgs(
        @Nullable Input<KeyVersionSpecAlgorithm> algorithm,
        @Nullable Input<String> cloudKmsKeyVersion) {
        this.algorithm = algorithm;
        this.cloudKmsKeyVersion = cloudKmsKeyVersion;
    }

    private KeyVersionSpecArgs() {
        this.algorithm = Input.empty();
        this.cloudKmsKeyVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVersionSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<KeyVersionSpecAlgorithm> algorithm;
        private @Nullable Input<String> cloudKmsKeyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVersionSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.cloudKmsKeyVersion = defaults.cloudKmsKeyVersion;
        }

        public Builder setAlgorithm(@Nullable Input<KeyVersionSpecAlgorithm> algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        public Builder setAlgorithm(@Nullable KeyVersionSpecAlgorithm algorithm) {
            this.algorithm = Input.ofNullable(algorithm);
            return this;
        }

        public Builder setCloudKmsKeyVersion(@Nullable Input<String> cloudKmsKeyVersion) {
            this.cloudKmsKeyVersion = cloudKmsKeyVersion;
            return this;
        }

        public Builder setCloudKmsKeyVersion(@Nullable String cloudKmsKeyVersion) {
            this.cloudKmsKeyVersion = Input.ofNullable(cloudKmsKeyVersion);
            return this;
        }

        public KeyVersionSpecArgs build() {
            return new KeyVersionSpecArgs(algorithm, cloudKmsKeyVersion);
        }
    }
}
