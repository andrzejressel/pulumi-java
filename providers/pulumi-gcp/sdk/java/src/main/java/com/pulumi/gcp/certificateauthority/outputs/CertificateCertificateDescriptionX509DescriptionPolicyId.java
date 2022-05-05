// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CertificateCertificateDescriptionX509DescriptionPolicyId {
    /**
     * @return An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * 
     */
    private final @Nullable List<Integer> objectIdPaths;

    @CustomType.Constructor
    private CertificateCertificateDescriptionX509DescriptionPolicyId(@CustomType.Parameter("objectIdPaths") @Nullable List<Integer> objectIdPaths) {
        this.objectIdPaths = objectIdPaths;
    }

    /**
     * @return An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * 
     */
    public List<Integer> objectIdPaths() {
        return this.objectIdPaths == null ? List.of() : this.objectIdPaths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionX509DescriptionPolicyId defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Integer> objectIdPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionX509DescriptionPolicyId defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectIdPaths = defaults.objectIdPaths;
        }

        public Builder objectIdPaths(@Nullable List<Integer> objectIdPaths) {
            this.objectIdPaths = objectIdPaths;
            return this;
        }
        public Builder objectIdPaths(Integer... objectIdPaths) {
            return objectIdPaths(List.of(objectIdPaths));
        }        public CertificateCertificateDescriptionX509DescriptionPolicyId build() {
            return new CertificateCertificateDescriptionX509DescriptionPolicyId(objectIdPaths);
        }
    }
}
