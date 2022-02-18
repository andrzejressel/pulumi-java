// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * A TextAnnotation specifies a text range that includes sensitive information.
 * 
 */
public final class SensitiveTextAnnotationResponse extends io.pulumi.resources.InvokeArgs {

    public static final SensitiveTextAnnotationResponse Empty = new SensitiveTextAnnotationResponse();

    /**
     * Maps from a resource slice. For example, FHIR resource field path to a set of sensitive text findings. For example, Appointment.Narrative text1 --> {findings_1, findings_2, findings_3}
     * 
     */
    @InputImport(name="details", required=true)
    private final Map<String,String> details;

    public Map<String,String> getDetails() {
        return this.details;
    }

    public SensitiveTextAnnotationResponse(Map<String,String> details) {
        this.details = Objects.requireNonNull(details, "expected parameter 'details' to be non-null");
    }

    private SensitiveTextAnnotationResponse() {
        this.details = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SensitiveTextAnnotationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> details;

        public Builder() {
    	      // Empty
        }

        public Builder(SensitiveTextAnnotationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
        }

        public Builder setDetails(Map<String,String> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public SensitiveTextAnnotationResponse build() {
            return new SensitiveTextAnnotationResponse(details);
        }
    }
}
