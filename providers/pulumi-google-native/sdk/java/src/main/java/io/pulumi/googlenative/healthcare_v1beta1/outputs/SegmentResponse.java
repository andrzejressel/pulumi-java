// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class SegmentResponse {
    /**
     * A mapping from the positional location to the value. The key string uses zero-based indexes separated by dots to identify Fields, components and sub-components. A bracket notation is also used to identify different instances of a repeated field. Regex for key: (\d+)(\[\d+\])?(.\d+)?(.\d+)? Examples of (key, value) pairs: * (0.1, "hemoglobin") denotes that the first component of Field 0 has the value "hemoglobin". * (1.1.2, "CBC") denotes that the second sub-component of the first component of Field 1 has the value "CBC". * (1[0].1, "HbA1c") denotes that the first component of the first Instance of Field 1, which is repeated, has the value "HbA1c".
     * 
     */
    private final Map<String,String> fields;
    /**
     * A string that indicates the type of segment. For example, EVN or PID.
     * 
     */
    private final String segmentId;
    /**
     * Set ID for segments that can be in a set. This can be empty if it's missing or isn't applicable.
     * 
     */
    private final String setId;

    @OutputCustomType.Constructor({"fields","segmentId","setId"})
    private SegmentResponse(
        Map<String,String> fields,
        String segmentId,
        String setId) {
        this.fields = Objects.requireNonNull(fields);
        this.segmentId = Objects.requireNonNull(segmentId);
        this.setId = Objects.requireNonNull(setId);
    }

    /**
     * A mapping from the positional location to the value. The key string uses zero-based indexes separated by dots to identify Fields, components and sub-components. A bracket notation is also used to identify different instances of a repeated field. Regex for key: (\d+)(\[\d+\])?(.\d+)?(.\d+)? Examples of (key, value) pairs: * (0.1, "hemoglobin") denotes that the first component of Field 0 has the value "hemoglobin". * (1.1.2, "CBC") denotes that the second sub-component of the first component of Field 1 has the value "CBC". * (1[0].1, "HbA1c") denotes that the first component of the first Instance of Field 1, which is repeated, has the value "HbA1c".
     * 
     */
    public Map<String,String> getFields() {
        return this.fields;
    }
    /**
     * A string that indicates the type of segment. For example, EVN or PID.
     * 
     */
    public String getSegmentId() {
        return this.segmentId;
    }
    /**
     * Set ID for segments that can be in a set. This can be empty if it's missing or isn't applicable.
     * 
     */
    public String getSetId() {
        return this.setId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SegmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> fields;
        private String segmentId;
        private String setId;

        public Builder() {
    	      // Empty
        }

        public Builder(SegmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
    	      this.segmentId = defaults.segmentId;
    	      this.setId = defaults.setId;
        }

        public Builder setFields(Map<String,String> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }

        public Builder setSegmentId(String segmentId) {
            this.segmentId = Objects.requireNonNull(segmentId);
            return this;
        }

        public Builder setSetId(String setId) {
            this.setId = Objects.requireNonNull(setId);
            return this;
        }

        public SegmentResponse build() {
            return new SegmentResponse(fields, segmentId, setId);
        }
    }
}
