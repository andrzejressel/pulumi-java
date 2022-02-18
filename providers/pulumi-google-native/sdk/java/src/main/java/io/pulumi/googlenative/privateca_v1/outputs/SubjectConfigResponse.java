// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.privateca_v1.outputs.SubjectAltNamesResponse;
import io.pulumi.googlenative.privateca_v1.outputs.SubjectResponse;
import java.util.Objects;

@OutputCustomType
public final class SubjectConfigResponse {
    /**
     * Contains distinguished name fields such as the common name, location and organization.
     * 
     */
    private final SubjectResponse subject;
    /**
     * Optional. The subject alternative name fields.
     * 
     */
    private final SubjectAltNamesResponse subjectAltName;

    @OutputCustomType.Constructor({"subject","subjectAltName"})
    private SubjectConfigResponse(
        SubjectResponse subject,
        SubjectAltNamesResponse subjectAltName) {
        this.subject = Objects.requireNonNull(subject);
        this.subjectAltName = Objects.requireNonNull(subjectAltName);
    }

    /**
     * Contains distinguished name fields such as the common name, location and organization.
     * 
     */
    public SubjectResponse getSubject() {
        return this.subject;
    }
    /**
     * Optional. The subject alternative name fields.
     * 
     */
    public SubjectAltNamesResponse getSubjectAltName() {
        return this.subjectAltName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubjectResponse subject;
        private SubjectAltNamesResponse subjectAltName;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subject = defaults.subject;
    	      this.subjectAltName = defaults.subjectAltName;
        }

        public Builder setSubject(SubjectResponse subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }

        public Builder setSubjectAltName(SubjectAltNamesResponse subjectAltName) {
            this.subjectAltName = Objects.requireNonNull(subjectAltName);
            return this;
        }

        public SubjectConfigResponse build() {
            return new SubjectConfigResponse(subject, subjectAltName);
        }
    }
}
