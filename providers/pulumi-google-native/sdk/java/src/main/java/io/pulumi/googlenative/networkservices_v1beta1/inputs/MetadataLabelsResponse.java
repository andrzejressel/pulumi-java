// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Defines a name-pair value for a single label.
 * 
 */
public final class MetadataLabelsResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetadataLabelsResponse Empty = new MetadataLabelsResponse();

    /**
     * Label name presented as key in xDS Node Metadata.
     * 
     */
    @InputImport(name="labelName", required=true)
    private final String labelName;

    public String getLabelName() {
        return this.labelName;
    }

    /**
     * Label value presented as value corresponding to the above key, in xDS Node Metadata.
     * 
     */
    @InputImport(name="labelValue", required=true)
    private final String labelValue;

    public String getLabelValue() {
        return this.labelValue;
    }

    public MetadataLabelsResponse(
        String labelName,
        String labelValue) {
        this.labelName = Objects.requireNonNull(labelName, "expected parameter 'labelName' to be non-null");
        this.labelValue = Objects.requireNonNull(labelValue, "expected parameter 'labelValue' to be non-null");
    }

    private MetadataLabelsResponse() {
        this.labelName = null;
        this.labelValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataLabelsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String labelName;
        private String labelValue;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataLabelsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelName = defaults.labelName;
    	      this.labelValue = defaults.labelValue;
        }

        public Builder setLabelName(String labelName) {
            this.labelName = Objects.requireNonNull(labelName);
            return this;
        }

        public Builder setLabelValue(String labelValue) {
            this.labelValue = Objects.requireNonNull(labelValue);
            return this;
        }

        public MetadataLabelsResponse build() {
            return new MetadataLabelsResponse(labelName, labelValue);
        }
    }
}
