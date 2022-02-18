// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A TextAnnotation specifies a text range that includes sensitive information.
 * 
 */
public final class SensitiveTextAnnotationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SensitiveTextAnnotationArgs Empty = new SensitiveTextAnnotationArgs();

    /**
     * Maps from a resource slice. For example, FHIR resource field path to a set of sensitive text findings. For example, Appointment.Narrative text1 --> {findings_1, findings_2, findings_3}
     * 
     */
    @InputImport(name="details")
    private final @Nullable Input<Map<String,String>> details;

    public Input<Map<String,String>> getDetails() {
        return this.details == null ? Input.empty() : this.details;
    }

    public SensitiveTextAnnotationArgs(@Nullable Input<Map<String,String>> details) {
        this.details = details;
    }

    private SensitiveTextAnnotationArgs() {
        this.details = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SensitiveTextAnnotationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> details;

        public Builder() {
    	      // Empty
        }

        public Builder(SensitiveTextAnnotationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
        }

        public Builder setDetails(@Nullable Input<Map<String,String>> details) {
            this.details = details;
            return this;
        }

        public Builder setDetails(@Nullable Map<String,String> details) {
            this.details = Input.ofNullable(details);
            return this;
        }

        public SensitiveTextAnnotationArgs build() {
            return new SensitiveTextAnnotationArgs(details);
        }
    }
}
