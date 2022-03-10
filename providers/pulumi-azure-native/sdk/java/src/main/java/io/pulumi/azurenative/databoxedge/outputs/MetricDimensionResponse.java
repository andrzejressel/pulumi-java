// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MetricDimensionResponse {
    /**
     * The dimension value.
     * 
     */
    private final String sourceName;
    /**
     * The dimension type.
     * 
     */
    private final String sourceType;

    @OutputCustomType.Constructor
    private MetricDimensionResponse(
        @OutputCustomType.Parameter("sourceName") String sourceName,
        @OutputCustomType.Parameter("sourceType") String sourceType) {
        this.sourceName = sourceName;
        this.sourceType = sourceType;
    }

    /**
     * The dimension value.
     * 
    */
    public String getSourceName() {
        return this.sourceName;
    }
    /**
     * The dimension type.
     * 
    */
    public String getSourceType() {
        return this.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricDimensionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sourceName;
        private String sourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricDimensionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceName = defaults.sourceName;
    	      this.sourceType = defaults.sourceType;
        }

        public Builder setSourceName(String sourceName) {
            this.sourceName = Objects.requireNonNull(sourceName);
            return this;
        }

        public Builder setSourceType(String sourceType) {
            this.sourceType = Objects.requireNonNull(sourceType);
            return this;
        }
        public MetricDimensionResponse build() {
            return new MetricDimensionResponse(sourceName, sourceType);
        }
    }
}
