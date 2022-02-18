// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * Attributes credit by computing the XRAI taking advantage of the model's fully differentiable structure. Refer to this paper for more details: https://arxiv.org/abs/1906.02825 Currently only implemented for models with natural image inputs.
 * 
 */
public final class GoogleCloudMlV1__XraiAttributionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__XraiAttributionResponse Empty = new GoogleCloudMlV1__XraiAttributionResponse();

    /**
     * Number of steps for approximating the path integral. A good value to start is 50 and gradually increase until the sum to diff property is met within the desired error range.
     * 
     */
    @InputImport(name="numIntegralSteps", required=true)
    private final Integer numIntegralSteps;

    public Integer getNumIntegralSteps() {
        return this.numIntegralSteps;
    }

    public GoogleCloudMlV1__XraiAttributionResponse(Integer numIntegralSteps) {
        this.numIntegralSteps = Objects.requireNonNull(numIntegralSteps, "expected parameter 'numIntegralSteps' to be non-null");
    }

    private GoogleCloudMlV1__XraiAttributionResponse() {
        this.numIntegralSteps = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__XraiAttributionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer numIntegralSteps;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__XraiAttributionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numIntegralSteps = defaults.numIntegralSteps;
        }

        public Builder setNumIntegralSteps(Integer numIntegralSteps) {
            this.numIntegralSteps = Objects.requireNonNull(numIntegralSteps);
            return this;
        }

        public GoogleCloudMlV1__XraiAttributionResponse build() {
            return new GoogleCloudMlV1__XraiAttributionResponse(numIntegralSteps);
        }
    }
}
