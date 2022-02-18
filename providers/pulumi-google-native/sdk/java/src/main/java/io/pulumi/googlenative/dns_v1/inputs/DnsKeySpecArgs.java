// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dns_v1.enums.DnsKeySpecAlgorithm;
import io.pulumi.googlenative.dns_v1.enums.DnsKeySpecKeyType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters for DnsKey key generation. Used for generating initial keys for a new ManagedZone and as default when adding a new DnsKey.
 * 
 */
public final class DnsKeySpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final DnsKeySpecArgs Empty = new DnsKeySpecArgs();

    /**
     * String mnemonic specifying the DNSSEC algorithm of this key.
     * 
     */
    @InputImport(name="algorithm")
    private final @Nullable Input<DnsKeySpecAlgorithm> algorithm;

    public Input<DnsKeySpecAlgorithm> getAlgorithm() {
        return this.algorithm == null ? Input.empty() : this.algorithm;
    }

    /**
     * Length of the keys in bits.
     * 
     */
    @InputImport(name="keyLength")
    private final @Nullable Input<Integer> keyLength;

    public Input<Integer> getKeyLength() {
        return this.keyLength == null ? Input.empty() : this.keyLength;
    }

    /**
     * Specifies whether this is a key signing key (KSK) or a zone signing key (ZSK). Key signing keys have the Secure Entry Point flag set and, when active, are only used to sign resource record sets of type DNSKEY. Zone signing keys do not have the Secure Entry Point flag set and are used to sign all other types of resource record sets.
     * 
     */
    @InputImport(name="keyType")
    private final @Nullable Input<DnsKeySpecKeyType> keyType;

    public Input<DnsKeySpecKeyType> getKeyType() {
        return this.keyType == null ? Input.empty() : this.keyType;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    public DnsKeySpecArgs(
        @Nullable Input<DnsKeySpecAlgorithm> algorithm,
        @Nullable Input<Integer> keyLength,
        @Nullable Input<DnsKeySpecKeyType> keyType,
        @Nullable Input<String> kind) {
        this.algorithm = algorithm;
        this.keyLength = keyLength;
        this.keyType = keyType;
        this.kind = kind;
    }

    private DnsKeySpecArgs() {
        this.algorithm = Input.empty();
        this.keyLength = Input.empty();
        this.keyType = Input.empty();
        this.kind = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsKeySpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DnsKeySpecAlgorithm> algorithm;
        private @Nullable Input<Integer> keyLength;
        private @Nullable Input<DnsKeySpecKeyType> keyType;
        private @Nullable Input<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(DnsKeySpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.keyLength = defaults.keyLength;
    	      this.keyType = defaults.keyType;
    	      this.kind = defaults.kind;
        }

        public Builder setAlgorithm(@Nullable Input<DnsKeySpecAlgorithm> algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        public Builder setAlgorithm(@Nullable DnsKeySpecAlgorithm algorithm) {
            this.algorithm = Input.ofNullable(algorithm);
            return this;
        }

        public Builder setKeyLength(@Nullable Input<Integer> keyLength) {
            this.keyLength = keyLength;
            return this;
        }

        public Builder setKeyLength(@Nullable Integer keyLength) {
            this.keyLength = Input.ofNullable(keyLength);
            return this;
        }

        public Builder setKeyType(@Nullable Input<DnsKeySpecKeyType> keyType) {
            this.keyType = keyType;
            return this;
        }

        public Builder setKeyType(@Nullable DnsKeySpecKeyType keyType) {
            this.keyType = Input.ofNullable(keyType);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public DnsKeySpecArgs build() {
            return new DnsKeySpecArgs(algorithm, keyLength, keyType, kind);
        }
    }
}
