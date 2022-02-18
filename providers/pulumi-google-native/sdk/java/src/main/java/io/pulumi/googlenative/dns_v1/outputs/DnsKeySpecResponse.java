// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DnsKeySpecResponse {
    /**
     * String mnemonic specifying the DNSSEC algorithm of this key.
     * 
     */
    private final String algorithm;
    /**
     * Length of the keys in bits.
     * 
     */
    private final Integer keyLength;
    /**
     * Specifies whether this is a key signing key (KSK) or a zone signing key (ZSK). Key signing keys have the Secure Entry Point flag set and, when active, are only used to sign resource record sets of type DNSKEY. Zone signing keys do not have the Secure Entry Point flag set and are used to sign all other types of resource record sets.
     * 
     */
    private final String keyType;
    private final String kind;

    @OutputCustomType.Constructor({"algorithm","keyLength","keyType","kind"})
    private DnsKeySpecResponse(
        String algorithm,
        Integer keyLength,
        String keyType,
        String kind) {
        this.algorithm = Objects.requireNonNull(algorithm);
        this.keyLength = Objects.requireNonNull(keyLength);
        this.keyType = Objects.requireNonNull(keyType);
        this.kind = Objects.requireNonNull(kind);
    }

    /**
     * String mnemonic specifying the DNSSEC algorithm of this key.
     * 
     */
    public String getAlgorithm() {
        return this.algorithm;
    }
    /**
     * Length of the keys in bits.
     * 
     */
    public Integer getKeyLength() {
        return this.keyLength;
    }
    /**
     * Specifies whether this is a key signing key (KSK) or a zone signing key (ZSK). Key signing keys have the Secure Entry Point flag set and, when active, are only used to sign resource record sets of type DNSKEY. Zone signing keys do not have the Secure Entry Point flag set and are used to sign all other types of resource record sets.
     * 
     */
    public String getKeyType() {
        return this.keyType;
    }
    public String getKind() {
        return this.kind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsKeySpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private Integer keyLength;
        private String keyType;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(DnsKeySpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.keyLength = defaults.keyLength;
    	      this.keyType = defaults.keyType;
    	      this.kind = defaults.kind;
        }

        public Builder setAlgorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder setKeyLength(Integer keyLength) {
            this.keyLength = Objects.requireNonNull(keyLength);
            return this;
        }

        public Builder setKeyType(String keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public DnsKeySpecResponse build() {
            return new DnsKeySpecResponse(algorithm, keyLength, keyType, kind);
        }
    }
}
