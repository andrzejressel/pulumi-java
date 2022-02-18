// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudidentity_v1beta1.outputs.CertificateAttributesResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class EndpointVerificationSpecificAttributesResponse {
    /**
     * Details of certificates.
     * 
     */
    private final List<CertificateAttributesResponse> certificateAttributes;

    @OutputCustomType.Constructor({"certificateAttributes"})
    private EndpointVerificationSpecificAttributesResponse(List<CertificateAttributesResponse> certificateAttributes) {
        this.certificateAttributes = Objects.requireNonNull(certificateAttributes);
    }

    /**
     * Details of certificates.
     * 
     */
    public List<CertificateAttributesResponse> getCertificateAttributes() {
        return this.certificateAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointVerificationSpecificAttributesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CertificateAttributesResponse> certificateAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointVerificationSpecificAttributesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAttributes = defaults.certificateAttributes;
        }

        public Builder setCertificateAttributes(List<CertificateAttributesResponse> certificateAttributes) {
            this.certificateAttributes = Objects.requireNonNull(certificateAttributes);
            return this;
        }

        public EndpointVerificationSpecificAttributesResponse build() {
            return new EndpointVerificationSpecificAttributesResponse(certificateAttributes);
        }
    }
}
