// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class IncidentLabelResponse {
    /**
     * The name of the label
     * 
     */
    private final String labelName;
    /**
     * The type of the label
     * 
     */
    private final String labelType;

    @OutputCustomType.Constructor
    private IncidentLabelResponse(
        @OutputCustomType.Parameter("labelName") String labelName,
        @OutputCustomType.Parameter("labelType") String labelType) {
        this.labelName = labelName;
        this.labelType = labelType;
    }

    /**
     * The name of the label
     * 
    */
    public String getLabelName() {
        return this.labelName;
    }
    /**
     * The type of the label
     * 
    */
    public String getLabelType() {
        return this.labelType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IncidentLabelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String labelName;
        private String labelType;

        public Builder() {
    	      // Empty
        }

        public Builder(IncidentLabelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelName = defaults.labelName;
    	      this.labelType = defaults.labelType;
        }

        public Builder setLabelName(String labelName) {
            this.labelName = Objects.requireNonNull(labelName);
            return this;
        }

        public Builder setLabelType(String labelType) {
            this.labelType = Objects.requireNonNull(labelType);
            return this;
        }
        public IncidentLabelResponse build() {
            return new IncidentLabelResponse(labelName, labelType);
        }
    }
}
