// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKMSCryptoKeyVersionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetKMSCryptoKeyVersionArgs Empty = new GetKMSCryptoKeyVersionArgs();

    /**
     * The `id` of the Google Cloud Platform CryptoKey to which the key version belongs. This is also the `id` field of the
     * `gcp.kms.CryptoKey` resource/datasource.
     * 
     */
    @InputImport(name="cryptoKey", required=true)
    private final String cryptoKey;

    public String getCryptoKey() {
        return this.cryptoKey;
    }

    /**
     * The version number for this CryptoKeyVersion. Defaults to `1`.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Integer version;

    public Optional<Integer> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public GetKMSCryptoKeyVersionArgs(
        String cryptoKey,
        @Nullable Integer version) {
        this.cryptoKey = Objects.requireNonNull(cryptoKey, "expected parameter 'cryptoKey' to be non-null");
        this.version = version;
    }

    private GetKMSCryptoKeyVersionArgs() {
        this.cryptoKey = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKMSCryptoKeyVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cryptoKey;
        private @Nullable Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKMSCryptoKeyVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cryptoKey = defaults.cryptoKey;
    	      this.version = defaults.version;
        }

        public Builder setCryptoKey(String cryptoKey) {
            this.cryptoKey = Objects.requireNonNull(cryptoKey);
            return this;
        }

        public Builder setVersion(@Nullable Integer version) {
            this.version = version;
            return this;
        }

        public GetKMSCryptoKeyVersionArgs build() {
            return new GetKMSCryptoKeyVersionArgs(cryptoKey, version);
        }
    }
}
