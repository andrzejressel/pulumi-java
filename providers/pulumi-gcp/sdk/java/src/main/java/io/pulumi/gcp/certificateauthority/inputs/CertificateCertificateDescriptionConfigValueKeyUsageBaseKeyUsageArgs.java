// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs Empty = new CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs();

    @InputImport(name="keyUsageOptions")
    private final @Nullable Input<List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs>> keyUsageOptions;

    public Input<List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs>> getKeyUsageOptions() {
        return this.keyUsageOptions == null ? Input.empty() : this.keyUsageOptions;
    }

    public CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs(@Nullable Input<List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs>> keyUsageOptions) {
        this.keyUsageOptions = keyUsageOptions;
    }

    private CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs() {
        this.keyUsageOptions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs>> keyUsageOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUsageOptions = defaults.keyUsageOptions;
        }

        public Builder setKeyUsageOptions(@Nullable Input<List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs>> keyUsageOptions) {
            this.keyUsageOptions = keyUsageOptions;
            return this;
        }

        public Builder setKeyUsageOptions(@Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageKeyUsageOptionArgs> keyUsageOptions) {
            this.keyUsageOptions = Input.ofNullable(keyUsageOptions);
            return this;
        }

        public CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs build() {
            return new CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs(keyUsageOptions);
        }
    }
}
