// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Options regarding evaluation between bounding boxes.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsArgs Empty = new GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsArgs();

    /**
     * Minimum [intersection-over-union (IOU)](/vision/automl/object-detection/docs/evaluate#intersection-over-union) required for 2 bounding boxes to be considered a match. This must be a number between 0 and 1.
     * 
     */
    @InputImport(name="iouThreshold")
    private final @Nullable Input<Double> iouThreshold;

    public Input<Double> getIouThreshold() {
        return this.iouThreshold == null ? Input.empty() : this.iouThreshold;
    }

    public GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsArgs(@Nullable Input<Double> iouThreshold) {
        this.iouThreshold = iouThreshold;
    }

    private GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsArgs() {
        this.iouThreshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> iouThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iouThreshold = defaults.iouThreshold;
        }

        public Builder setIouThreshold(@Nullable Input<Double> iouThreshold) {
            this.iouThreshold = iouThreshold;
            return this;
        }

        public Builder setIouThreshold(@Nullable Double iouThreshold) {
            this.iouThreshold = Input.ofNullable(iouThreshold);
            return this;
        }

        public GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsArgs build() {
            return new GoogleCloudDatalabelingV1beta1BoundingBoxEvaluationOptionsArgs(iouThreshold);
        }
    }
}
