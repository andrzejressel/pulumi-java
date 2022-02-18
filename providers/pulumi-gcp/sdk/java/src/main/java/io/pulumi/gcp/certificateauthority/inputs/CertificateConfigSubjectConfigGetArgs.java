// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigSubjectConfigSubjectAltNameGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigSubjectConfigSubjectGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateConfigSubjectConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateConfigSubjectConfigGetArgs Empty = new CertificateConfigSubjectConfigGetArgs();

    /**
     * Contains distinguished name fields such as the location and organization.
     * Structure is documented below.
     * 
     */
    @InputImport(name="subject", required=true)
    private final Input<CertificateConfigSubjectConfigSubjectGetArgs> subject;

    public Input<CertificateConfigSubjectConfigSubjectGetArgs> getSubject() {
        return this.subject;
    }

    /**
     * The subject alternative name fields.
     * Structure is documented below.
     * 
     */
    @InputImport(name="subjectAltName")
    private final @Nullable Input<CertificateConfigSubjectConfigSubjectAltNameGetArgs> subjectAltName;

    public Input<CertificateConfigSubjectConfigSubjectAltNameGetArgs> getSubjectAltName() {
        return this.subjectAltName == null ? Input.empty() : this.subjectAltName;
    }

    public CertificateConfigSubjectConfigGetArgs(
        Input<CertificateConfigSubjectConfigSubjectGetArgs> subject,
        @Nullable Input<CertificateConfigSubjectConfigSubjectAltNameGetArgs> subjectAltName) {
        this.subject = Objects.requireNonNull(subject, "expected parameter 'subject' to be non-null");
        this.subjectAltName = subjectAltName;
    }

    private CertificateConfigSubjectConfigGetArgs() {
        this.subject = Input.empty();
        this.subjectAltName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigSubjectConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<CertificateConfigSubjectConfigSubjectGetArgs> subject;
        private @Nullable Input<CertificateConfigSubjectConfigSubjectAltNameGetArgs> subjectAltName;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigSubjectConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subject = defaults.subject;
    	      this.subjectAltName = defaults.subjectAltName;
        }

        public Builder setSubject(Input<CertificateConfigSubjectConfigSubjectGetArgs> subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }

        public Builder setSubject(CertificateConfigSubjectConfigSubjectGetArgs subject) {
            this.subject = Input.of(Objects.requireNonNull(subject));
            return this;
        }

        public Builder setSubjectAltName(@Nullable Input<CertificateConfigSubjectConfigSubjectAltNameGetArgs> subjectAltName) {
            this.subjectAltName = subjectAltName;
            return this;
        }

        public Builder setSubjectAltName(@Nullable CertificateConfigSubjectConfigSubjectAltNameGetArgs subjectAltName) {
            this.subjectAltName = Input.ofNullable(subjectAltName);
            return this;
        }

        public CertificateConfigSubjectConfigGetArgs build() {
            return new CertificateConfigSubjectConfigGetArgs(subject, subjectAltName);
        }
    }
}
