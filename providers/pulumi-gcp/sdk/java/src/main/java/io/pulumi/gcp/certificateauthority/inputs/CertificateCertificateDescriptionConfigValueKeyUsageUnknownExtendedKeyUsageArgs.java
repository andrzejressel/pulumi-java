// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs Empty = new CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs();

    @InputImport(name="obectIds")
    private final @Nullable Input<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs>> obectIds;

    public Input<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs>> getObectIds() {
        return this.obectIds == null ? Input.empty() : this.obectIds;
    }

    public CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs(@Nullable Input<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs>> obectIds) {
        this.obectIds = obectIds;
    }

    private CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs() {
        this.obectIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs>> obectIds;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.obectIds = defaults.obectIds;
        }

        public Builder setObectIds(@Nullable Input<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs>> obectIds) {
            this.obectIds = obectIds;
            return this;
        }

        public Builder setObectIds(@Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs> obectIds) {
            this.obectIds = Input.ofNullable(obectIds);
            return this;
        }

        public CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs build() {
            return new CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs(obectIds);
        }
    }
}
