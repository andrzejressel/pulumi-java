// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CaPoolIssuancePolicyBaselineValuesKeyUsageExtendedKeyUsageArgs extends io.pulumi.resources.ResourceArgs {

    public static final CaPoolIssuancePolicyBaselineValuesKeyUsageExtendedKeyUsageArgs Empty = new CaPoolIssuancePolicyBaselineValuesKeyUsageExtendedKeyUsageArgs();

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.2. Officially described as "TLS WWW client authentication", though regularly used for non-WWW TLS.
     * 
     */
    @InputImport(name="clientAuth")
    private final @Nullable Input<Boolean> clientAuth;

    public Input<Boolean> getClientAuth() {
        return this.clientAuth == null ? Input.empty() : this.clientAuth;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.3. Officially described as "Signing of downloadable executable code client authentication".
     * 
     */
    @InputImport(name="codeSigning")
    private final @Nullable Input<Boolean> codeSigning;

    public Input<Boolean> getCodeSigning() {
        return this.codeSigning == null ? Input.empty() : this.codeSigning;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.4. Officially described as "Email protection".
     * 
     */
    @InputImport(name="emailProtection")
    private final @Nullable Input<Boolean> emailProtection;

    public Input<Boolean> getEmailProtection() {
        return this.emailProtection == null ? Input.empty() : this.emailProtection;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.9. Officially described as "Signing OCSP responses".
     * 
     */
    @InputImport(name="ocspSigning")
    private final @Nullable Input<Boolean> ocspSigning;

    public Input<Boolean> getOcspSigning() {
        return this.ocspSigning == null ? Input.empty() : this.ocspSigning;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.1. Officially described as "TLS WWW server authentication", though regularly used for non-WWW TLS.
     * 
     */
    @InputImport(name="serverAuth")
    private final @Nullable Input<Boolean> serverAuth;

    public Input<Boolean> getServerAuth() {
        return this.serverAuth == null ? Input.empty() : this.serverAuth;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.8. Officially described as "Binding the hash of an object to a time".
     * 
     */
    @InputImport(name="timeStamping")
    private final @Nullable Input<Boolean> timeStamping;

    public Input<Boolean> getTimeStamping() {
        return this.timeStamping == null ? Input.empty() : this.timeStamping;
    }

    public CaPoolIssuancePolicyBaselineValuesKeyUsageExtendedKeyUsageArgs(
        @Nullable Input<Boolean> clientAuth,
        @Nullable Input<Boolean> codeSigning,
        @Nullable Input<Boolean> emailProtection,
        @Nullable Input<Boolean> ocspSigning,
        @Nullable Input<Boolean> serverAuth,
        @Nullable Input<Boolean> timeStamping) {
        this.clientAuth = clientAuth;
        this.codeSigning = codeSigning;
        this.emailProtection = emailProtection;
        this.ocspSigning = ocspSigning;
        this.serverAuth = serverAuth;
        this.timeStamping = timeStamping;
    }

    private CaPoolIssuancePolicyBaselineValuesKeyUsageExtendedKeyUsageArgs() {
        this.clientAuth = Input.empty();
        this.codeSigning = Input.empty();
        this.emailProtection = Input.empty();
        this.ocspSigning = Input.empty();
        this.serverAuth = Input.empty();
        this.timeStamping = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyBaselineValuesKeyUsageExtendedKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> clientAuth;
        private @Nullable Input<Boolean> codeSigning;
        private @Nullable Input<Boolean> emailProtection;
        private @Nullable Input<Boolean> ocspSigning;
        private @Nullable Input<Boolean> serverAuth;
        private @Nullable Input<Boolean> timeStamping;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIssuancePolicyBaselineValuesKeyUsageExtendedKeyUsageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientAuth = defaults.clientAuth;
    	      this.codeSigning = defaults.codeSigning;
    	      this.emailProtection = defaults.emailProtection;
    	      this.ocspSigning = defaults.ocspSigning;
    	      this.serverAuth = defaults.serverAuth;
    	      this.timeStamping = defaults.timeStamping;
        }

        public Builder setClientAuth(@Nullable Input<Boolean> clientAuth) {
            this.clientAuth = clientAuth;
            return this;
        }

        public Builder setClientAuth(@Nullable Boolean clientAuth) {
            this.clientAuth = Input.ofNullable(clientAuth);
            return this;
        }

        public Builder setCodeSigning(@Nullable Input<Boolean> codeSigning) {
            this.codeSigning = codeSigning;
            return this;
        }

        public Builder setCodeSigning(@Nullable Boolean codeSigning) {
            this.codeSigning = Input.ofNullable(codeSigning);
            return this;
        }

        public Builder setEmailProtection(@Nullable Input<Boolean> emailProtection) {
            this.emailProtection = emailProtection;
            return this;
        }

        public Builder setEmailProtection(@Nullable Boolean emailProtection) {
            this.emailProtection = Input.ofNullable(emailProtection);
            return this;
        }

        public Builder setOcspSigning(@Nullable Input<Boolean> ocspSigning) {
            this.ocspSigning = ocspSigning;
            return this;
        }

        public Builder setOcspSigning(@Nullable Boolean ocspSigning) {
            this.ocspSigning = Input.ofNullable(ocspSigning);
            return this;
        }

        public Builder setServerAuth(@Nullable Input<Boolean> serverAuth) {
            this.serverAuth = serverAuth;
            return this;
        }

        public Builder setServerAuth(@Nullable Boolean serverAuth) {
            this.serverAuth = Input.ofNullable(serverAuth);
            return this;
        }

        public Builder setTimeStamping(@Nullable Input<Boolean> timeStamping) {
            this.timeStamping = timeStamping;
            return this;
        }

        public Builder setTimeStamping(@Nullable Boolean timeStamping) {
            this.timeStamping = Input.ofNullable(timeStamping);
            return this;
        }

        public CaPoolIssuancePolicyBaselineValuesKeyUsageExtendedKeyUsageArgs build() {
            return new CaPoolIssuancePolicyBaselineValuesKeyUsageExtendedKeyUsageArgs(clientAuth, codeSigning, emailProtection, ocspSigning, serverAuth, timeStamping);
        }
    }
}
