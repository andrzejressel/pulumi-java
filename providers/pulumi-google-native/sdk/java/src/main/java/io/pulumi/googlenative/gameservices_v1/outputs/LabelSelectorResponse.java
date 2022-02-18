// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class LabelSelectorResponse {
    /**
     * Resource labels for this selector.
     * 
     */
    private final Map<String,String> labels;

    @OutputCustomType.Constructor({"labels"})
    private LabelSelectorResponse(Map<String,String> labels) {
        this.labels = Objects.requireNonNull(labels);
    }

    /**
     * Resource labels for this selector.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelSelectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelSelectorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public LabelSelectorResponse build() {
            return new LabelSelectorResponse(labels);
        }
    }
}
