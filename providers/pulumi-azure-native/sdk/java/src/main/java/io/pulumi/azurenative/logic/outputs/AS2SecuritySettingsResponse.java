// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AS2SecuritySettingsResponse {
    /**
     * The value indicating whether to enable NRR for inbound decoded messages.
     * 
     */
    private final Boolean enableNRRForInboundDecodedMessages;
    /**
     * The value indicating whether to enable NRR for inbound encoded messages.
     * 
     */
    private final Boolean enableNRRForInboundEncodedMessages;
    /**
     * The value indicating whether to enable NRR for inbound MDN.
     * 
     */
    private final Boolean enableNRRForInboundMDN;
    /**
     * The value indicating whether to enable NRR for outbound decoded messages.
     * 
     */
    private final Boolean enableNRRForOutboundDecodedMessages;
    /**
     * The value indicating whether to enable NRR for outbound encoded messages.
     * 
     */
    private final Boolean enableNRRForOutboundEncodedMessages;
    /**
     * The value indicating whether to enable NRR for outbound MDN.
     * 
     */
    private final Boolean enableNRRForOutboundMDN;
    /**
     * The name of the encryption certificate.
     * 
     */
    private final @Nullable String encryptionCertificateName;
    /**
     * The value indicating whether to send or request a MDN.
     * 
     */
    private final Boolean overrideGroupSigningCertificate;
    /**
     * The Sha2 algorithm format. Valid values are Sha2, ShaHashSize, ShaHyphenHashSize, Sha2UnderscoreHashSize.
     * 
     */
    private final @Nullable String sha2AlgorithmFormat;
    /**
     * The name of the signing certificate.
     * 
     */
    private final @Nullable String signingCertificateName;

    @OutputCustomType.Constructor
    private AS2SecuritySettingsResponse(
        @OutputCustomType.Parameter("enableNRRForInboundDecodedMessages") Boolean enableNRRForInboundDecodedMessages,
        @OutputCustomType.Parameter("enableNRRForInboundEncodedMessages") Boolean enableNRRForInboundEncodedMessages,
        @OutputCustomType.Parameter("enableNRRForInboundMDN") Boolean enableNRRForInboundMDN,
        @OutputCustomType.Parameter("enableNRRForOutboundDecodedMessages") Boolean enableNRRForOutboundDecodedMessages,
        @OutputCustomType.Parameter("enableNRRForOutboundEncodedMessages") Boolean enableNRRForOutboundEncodedMessages,
        @OutputCustomType.Parameter("enableNRRForOutboundMDN") Boolean enableNRRForOutboundMDN,
        @OutputCustomType.Parameter("encryptionCertificateName") @Nullable String encryptionCertificateName,
        @OutputCustomType.Parameter("overrideGroupSigningCertificate") Boolean overrideGroupSigningCertificate,
        @OutputCustomType.Parameter("sha2AlgorithmFormat") @Nullable String sha2AlgorithmFormat,
        @OutputCustomType.Parameter("signingCertificateName") @Nullable String signingCertificateName) {
        this.enableNRRForInboundDecodedMessages = enableNRRForInboundDecodedMessages;
        this.enableNRRForInboundEncodedMessages = enableNRRForInboundEncodedMessages;
        this.enableNRRForInboundMDN = enableNRRForInboundMDN;
        this.enableNRRForOutboundDecodedMessages = enableNRRForOutboundDecodedMessages;
        this.enableNRRForOutboundEncodedMessages = enableNRRForOutboundEncodedMessages;
        this.enableNRRForOutboundMDN = enableNRRForOutboundMDN;
        this.encryptionCertificateName = encryptionCertificateName;
        this.overrideGroupSigningCertificate = overrideGroupSigningCertificate;
        this.sha2AlgorithmFormat = sha2AlgorithmFormat;
        this.signingCertificateName = signingCertificateName;
    }

    /**
     * The value indicating whether to enable NRR for inbound decoded messages.
     * 
    */
    public Boolean getEnableNRRForInboundDecodedMessages() {
        return this.enableNRRForInboundDecodedMessages;
    }
    /**
     * The value indicating whether to enable NRR for inbound encoded messages.
     * 
    */
    public Boolean getEnableNRRForInboundEncodedMessages() {
        return this.enableNRRForInboundEncodedMessages;
    }
    /**
     * The value indicating whether to enable NRR for inbound MDN.
     * 
    */
    public Boolean getEnableNRRForInboundMDN() {
        return this.enableNRRForInboundMDN;
    }
    /**
     * The value indicating whether to enable NRR for outbound decoded messages.
     * 
    */
    public Boolean getEnableNRRForOutboundDecodedMessages() {
        return this.enableNRRForOutboundDecodedMessages;
    }
    /**
     * The value indicating whether to enable NRR for outbound encoded messages.
     * 
    */
    public Boolean getEnableNRRForOutboundEncodedMessages() {
        return this.enableNRRForOutboundEncodedMessages;
    }
    /**
     * The value indicating whether to enable NRR for outbound MDN.
     * 
    */
    public Boolean getEnableNRRForOutboundMDN() {
        return this.enableNRRForOutboundMDN;
    }
    /**
     * The name of the encryption certificate.
     * 
    */
    public Optional<String> getEncryptionCertificateName() {
        return Optional.ofNullable(this.encryptionCertificateName);
    }
    /**
     * The value indicating whether to send or request a MDN.
     * 
    */
    public Boolean getOverrideGroupSigningCertificate() {
        return this.overrideGroupSigningCertificate;
    }
    /**
     * The Sha2 algorithm format. Valid values are Sha2, ShaHashSize, ShaHyphenHashSize, Sha2UnderscoreHashSize.
     * 
    */
    public Optional<String> getSha2AlgorithmFormat() {
        return Optional.ofNullable(this.sha2AlgorithmFormat);
    }
    /**
     * The name of the signing certificate.
     * 
    */
    public Optional<String> getSigningCertificateName() {
        return Optional.ofNullable(this.signingCertificateName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2SecuritySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableNRRForInboundDecodedMessages;
        private Boolean enableNRRForInboundEncodedMessages;
        private Boolean enableNRRForInboundMDN;
        private Boolean enableNRRForOutboundDecodedMessages;
        private Boolean enableNRRForOutboundEncodedMessages;
        private Boolean enableNRRForOutboundMDN;
        private @Nullable String encryptionCertificateName;
        private Boolean overrideGroupSigningCertificate;
        private @Nullable String sha2AlgorithmFormat;
        private @Nullable String signingCertificateName;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2SecuritySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableNRRForInboundDecodedMessages = defaults.enableNRRForInboundDecodedMessages;
    	      this.enableNRRForInboundEncodedMessages = defaults.enableNRRForInboundEncodedMessages;
    	      this.enableNRRForInboundMDN = defaults.enableNRRForInboundMDN;
    	      this.enableNRRForOutboundDecodedMessages = defaults.enableNRRForOutboundDecodedMessages;
    	      this.enableNRRForOutboundEncodedMessages = defaults.enableNRRForOutboundEncodedMessages;
    	      this.enableNRRForOutboundMDN = defaults.enableNRRForOutboundMDN;
    	      this.encryptionCertificateName = defaults.encryptionCertificateName;
    	      this.overrideGroupSigningCertificate = defaults.overrideGroupSigningCertificate;
    	      this.sha2AlgorithmFormat = defaults.sha2AlgorithmFormat;
    	      this.signingCertificateName = defaults.signingCertificateName;
        }

        public Builder setEnableNRRForInboundDecodedMessages(Boolean enableNRRForInboundDecodedMessages) {
            this.enableNRRForInboundDecodedMessages = Objects.requireNonNull(enableNRRForInboundDecodedMessages);
            return this;
        }

        public Builder setEnableNRRForInboundEncodedMessages(Boolean enableNRRForInboundEncodedMessages) {
            this.enableNRRForInboundEncodedMessages = Objects.requireNonNull(enableNRRForInboundEncodedMessages);
            return this;
        }

        public Builder setEnableNRRForInboundMDN(Boolean enableNRRForInboundMDN) {
            this.enableNRRForInboundMDN = Objects.requireNonNull(enableNRRForInboundMDN);
            return this;
        }

        public Builder setEnableNRRForOutboundDecodedMessages(Boolean enableNRRForOutboundDecodedMessages) {
            this.enableNRRForOutboundDecodedMessages = Objects.requireNonNull(enableNRRForOutboundDecodedMessages);
            return this;
        }

        public Builder setEnableNRRForOutboundEncodedMessages(Boolean enableNRRForOutboundEncodedMessages) {
            this.enableNRRForOutboundEncodedMessages = Objects.requireNonNull(enableNRRForOutboundEncodedMessages);
            return this;
        }

        public Builder setEnableNRRForOutboundMDN(Boolean enableNRRForOutboundMDN) {
            this.enableNRRForOutboundMDN = Objects.requireNonNull(enableNRRForOutboundMDN);
            return this;
        }

        public Builder setEncryptionCertificateName(@Nullable String encryptionCertificateName) {
            this.encryptionCertificateName = encryptionCertificateName;
            return this;
        }

        public Builder setOverrideGroupSigningCertificate(Boolean overrideGroupSigningCertificate) {
            this.overrideGroupSigningCertificate = Objects.requireNonNull(overrideGroupSigningCertificate);
            return this;
        }

        public Builder setSha2AlgorithmFormat(@Nullable String sha2AlgorithmFormat) {
            this.sha2AlgorithmFormat = sha2AlgorithmFormat;
            return this;
        }

        public Builder setSigningCertificateName(@Nullable String signingCertificateName) {
            this.signingCertificateName = signingCertificateName;
            return this;
        }
        public AS2SecuritySettingsResponse build() {
            return new AS2SecuritySettingsResponse(enableNRRForInboundDecodedMessages, enableNRRForInboundEncodedMessages, enableNRRForInboundMDN, enableNRRForOutboundDecodedMessages, enableNRRForOutboundEncodedMessages, enableNRRForOutboundMDN, encryptionCertificateName, overrideGroupSigningCertificate, sha2AlgorithmFormat, signingCertificateName);
        }
    }
}
