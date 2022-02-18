// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigAdditionalExtensionArgs;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigCaOptionsArgs;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageArgs;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigPolicyIdArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorityConfigX509ConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorityConfigX509ConfigArgs Empty = new AuthorityConfigX509ConfigArgs();

    /**
     * Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
     * Structure is documented below.
     * 
     */
    @InputImport(name="additionalExtensions")
    private final @Nullable Input<List<AuthorityConfigX509ConfigAdditionalExtensionArgs>> additionalExtensions;

    public Input<List<AuthorityConfigX509ConfigAdditionalExtensionArgs>> getAdditionalExtensions() {
        return this.additionalExtensions == null ? Input.empty() : this.additionalExtensions;
    }

    /**
     * Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
     * "Authority Information Access" extension in the certificate.
     * 
     */
    @InputImport(name="aiaOcspServers")
    private final @Nullable Input<List<String>> aiaOcspServers;

    public Input<List<String>> getAiaOcspServers() {
        return this.aiaOcspServers == null ? Input.empty() : this.aiaOcspServers;
    }

    /**
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    @InputImport(name="caOptions", required=true)
    private final Input<AuthorityConfigX509ConfigCaOptionsArgs> caOptions;

    public Input<AuthorityConfigX509ConfigCaOptionsArgs> getCaOptions() {
        return this.caOptions;
    }

    /**
     * Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    @InputImport(name="keyUsage", required=true)
    private final Input<AuthorityConfigX509ConfigKeyUsageArgs> keyUsage;

    public Input<AuthorityConfigX509ConfigKeyUsageArgs> getKeyUsage() {
        return this.keyUsage;
    }

    /**
     * Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * 
     */
    @InputImport(name="policyIds")
    private final @Nullable Input<List<AuthorityConfigX509ConfigPolicyIdArgs>> policyIds;

    public Input<List<AuthorityConfigX509ConfigPolicyIdArgs>> getPolicyIds() {
        return this.policyIds == null ? Input.empty() : this.policyIds;
    }

    public AuthorityConfigX509ConfigArgs(
        @Nullable Input<List<AuthorityConfigX509ConfigAdditionalExtensionArgs>> additionalExtensions,
        @Nullable Input<List<String>> aiaOcspServers,
        Input<AuthorityConfigX509ConfigCaOptionsArgs> caOptions,
        Input<AuthorityConfigX509ConfigKeyUsageArgs> keyUsage,
        @Nullable Input<List<AuthorityConfigX509ConfigPolicyIdArgs>> policyIds) {
        this.additionalExtensions = additionalExtensions;
        this.aiaOcspServers = aiaOcspServers;
        this.caOptions = Objects.requireNonNull(caOptions, "expected parameter 'caOptions' to be non-null");
        this.keyUsage = Objects.requireNonNull(keyUsage, "expected parameter 'keyUsage' to be non-null");
        this.policyIds = policyIds;
    }

    private AuthorityConfigX509ConfigArgs() {
        this.additionalExtensions = Input.empty();
        this.aiaOcspServers = Input.empty();
        this.caOptions = Input.empty();
        this.keyUsage = Input.empty();
        this.policyIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigX509ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AuthorityConfigX509ConfigAdditionalExtensionArgs>> additionalExtensions;
        private @Nullable Input<List<String>> aiaOcspServers;
        private Input<AuthorityConfigX509ConfigCaOptionsArgs> caOptions;
        private Input<AuthorityConfigX509ConfigKeyUsageArgs> keyUsage;
        private @Nullable Input<List<AuthorityConfigX509ConfigPolicyIdArgs>> policyIds;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigX509ConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.aiaOcspServers = defaults.aiaOcspServers;
    	      this.caOptions = defaults.caOptions;
    	      this.keyUsage = defaults.keyUsage;
    	      this.policyIds = defaults.policyIds;
        }

        public Builder setAdditionalExtensions(@Nullable Input<List<AuthorityConfigX509ConfigAdditionalExtensionArgs>> additionalExtensions) {
            this.additionalExtensions = additionalExtensions;
            return this;
        }

        public Builder setAdditionalExtensions(@Nullable List<AuthorityConfigX509ConfigAdditionalExtensionArgs> additionalExtensions) {
            this.additionalExtensions = Input.ofNullable(additionalExtensions);
            return this;
        }

        public Builder setAiaOcspServers(@Nullable Input<List<String>> aiaOcspServers) {
            this.aiaOcspServers = aiaOcspServers;
            return this;
        }

        public Builder setAiaOcspServers(@Nullable List<String> aiaOcspServers) {
            this.aiaOcspServers = Input.ofNullable(aiaOcspServers);
            return this;
        }

        public Builder setCaOptions(Input<AuthorityConfigX509ConfigCaOptionsArgs> caOptions) {
            this.caOptions = Objects.requireNonNull(caOptions);
            return this;
        }

        public Builder setCaOptions(AuthorityConfigX509ConfigCaOptionsArgs caOptions) {
            this.caOptions = Input.of(Objects.requireNonNull(caOptions));
            return this;
        }

        public Builder setKeyUsage(Input<AuthorityConfigX509ConfigKeyUsageArgs> keyUsage) {
            this.keyUsage = Objects.requireNonNull(keyUsage);
            return this;
        }

        public Builder setKeyUsage(AuthorityConfigX509ConfigKeyUsageArgs keyUsage) {
            this.keyUsage = Input.of(Objects.requireNonNull(keyUsage));
            return this;
        }

        public Builder setPolicyIds(@Nullable Input<List<AuthorityConfigX509ConfigPolicyIdArgs>> policyIds) {
            this.policyIds = policyIds;
            return this;
        }

        public Builder setPolicyIds(@Nullable List<AuthorityConfigX509ConfigPolicyIdArgs> policyIds) {
            this.policyIds = Input.ofNullable(policyIds);
            return this;
        }

        public AuthorityConfigX509ConfigArgs build() {
            return new AuthorityConfigX509ConfigArgs(additionalExtensions, aiaOcspServers, caOptions, keyUsage, policyIds);
        }
    }
}
