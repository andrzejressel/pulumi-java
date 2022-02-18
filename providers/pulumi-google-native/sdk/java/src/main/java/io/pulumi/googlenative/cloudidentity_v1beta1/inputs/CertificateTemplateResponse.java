// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * CertificateTemplate (v3 Extension in X.509).
 * 
 */
public final class CertificateTemplateResponse extends io.pulumi.resources.InvokeArgs {

    public static final CertificateTemplateResponse Empty = new CertificateTemplateResponse();

    /**
     * The Major version of the template. Example: 100.
     * 
     */
    @InputImport(name="majorVersion", required=true)
    private final Integer majorVersion;

    public Integer getMajorVersion() {
        return this.majorVersion;
    }

    /**
     * The minor version of the template. Example: 12.
     * 
     */
    @InputImport(name="minorVersion", required=true)
    private final Integer minorVersion;

    public Integer getMinorVersion() {
        return this.minorVersion;
    }

    public CertificateTemplateResponse(
        Integer majorVersion,
        Integer minorVersion) {
        this.majorVersion = Objects.requireNonNull(majorVersion, "expected parameter 'majorVersion' to be non-null");
        this.minorVersion = Objects.requireNonNull(minorVersion, "expected parameter 'minorVersion' to be non-null");
    }

    private CertificateTemplateResponse() {
        this.majorVersion = null;
        this.minorVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer majorVersion;
        private Integer minorVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateTemplateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.majorVersion = defaults.majorVersion;
    	      this.minorVersion = defaults.minorVersion;
        }

        public Builder setMajorVersion(Integer majorVersion) {
            this.majorVersion = Objects.requireNonNull(majorVersion);
            return this;
        }

        public Builder setMinorVersion(Integer minorVersion) {
            this.minorVersion = Objects.requireNonNull(minorVersion);
            return this;
        }

        public CertificateTemplateResponse build() {
            return new CertificateTemplateResponse(majorVersion, minorVersion);
        }
    }
}
