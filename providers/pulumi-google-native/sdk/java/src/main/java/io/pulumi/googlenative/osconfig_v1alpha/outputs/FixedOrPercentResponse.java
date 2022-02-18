// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class FixedOrPercentResponse {
    /**
     * Specifies a fixed value.
     * 
     */
    private final Integer fixed;
    /**
     * Specifies the relative value defined as a percentage, which will be multiplied by a reference value.
     * 
     */
    private final Integer percent;

    @OutputCustomType.Constructor({"fixed","percent"})
    private FixedOrPercentResponse(
        Integer fixed,
        Integer percent) {
        this.fixed = Objects.requireNonNull(fixed);
        this.percent = Objects.requireNonNull(percent);
    }

    /**
     * Specifies a fixed value.
     * 
     */
    public Integer getFixed() {
        return this.fixed;
    }
    /**
     * Specifies the relative value defined as a percentage, which will be multiplied by a reference value.
     * 
     */
    public Integer getPercent() {
        return this.percent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FixedOrPercentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer fixed;
        private Integer percent;

        public Builder() {
    	      // Empty
        }

        public Builder(FixedOrPercentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixed = defaults.fixed;
    	      this.percent = defaults.percent;
        }

        public Builder setFixed(Integer fixed) {
            this.fixed = Objects.requireNonNull(fixed);
            return this;
        }

        public Builder setPercent(Integer percent) {
            this.percent = Objects.requireNonNull(percent);
            return this;
        }

        public FixedOrPercentResponse build() {
            return new FixedOrPercentResponse(fixed, percent);
        }
    }
}
