// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse {
    /**
     * The objective value at this training step.
     * 
     */
    private final Double objectiveValue;
    /**
     * The global training step for this metric.
     * 
     */
    private final String trainingStep;

    @OutputCustomType.Constructor({"objectiveValue","trainingStep"})
    private GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse(
        Double objectiveValue,
        String trainingStep) {
        this.objectiveValue = Objects.requireNonNull(objectiveValue);
        this.trainingStep = Objects.requireNonNull(trainingStep);
    }

    /**
     * The objective value at this training step.
     * 
     */
    public Double getObjectiveValue() {
        return this.objectiveValue;
    }
    /**
     * The global training step for this metric.
     * 
     */
    public String getTrainingStep() {
        return this.trainingStep;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double objectiveValue;
        private String trainingStep;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectiveValue = defaults.objectiveValue;
    	      this.trainingStep = defaults.trainingStep;
        }

        public Builder setObjectiveValue(Double objectiveValue) {
            this.objectiveValue = Objects.requireNonNull(objectiveValue);
            return this;
        }

        public Builder setTrainingStep(String trainingStep) {
            this.trainingStep = Objects.requireNonNull(trainingStep);
            return this;
        }

        public GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse build() {
            return new GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse(objectiveValue, trainingStep);
        }
    }
}
