// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.BqmlIterationResultResponse;
import io.pulumi.googlenative.bigquery_v2.inputs.BqmlTrainingRunTrainingOptionsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class BqmlTrainingRunResponse extends io.pulumi.resources.InvokeArgs {

    public static final BqmlTrainingRunResponse Empty = new BqmlTrainingRunResponse();

    /**
     * [Output-only, Beta] List of each iteration results.
     * 
     */
    @InputImport(name="iterationResults", required=true)
    private final List<BqmlIterationResultResponse> iterationResults;

    public List<BqmlIterationResultResponse> getIterationResults() {
        return this.iterationResults;
    }

    /**
     * [Output-only, Beta] Training run start time in milliseconds since the epoch.
     * 
     */
    @InputImport(name="startTime", required=true)
    private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * [Output-only, Beta] Different state applicable for a training run. IN PROGRESS: Training run is in progress. FAILED: Training run ended due to a non-retryable failure. SUCCEEDED: Training run successfully completed. CANCELLED: Training run cancelled by the user.
     * 
     */
    @InputImport(name="state", required=true)
    private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * [Output-only, Beta] Training options used by this training run. These options are mutable for subsequent training runs. Default values are explicitly stored for options not specified in the input query of the first training run. For subsequent training runs, any option not explicitly specified in the input query will be copied from the previous training run.
     * 
     */
    @InputImport(name="trainingOptions", required=true)
    private final BqmlTrainingRunTrainingOptionsResponse trainingOptions;

    public BqmlTrainingRunTrainingOptionsResponse getTrainingOptions() {
        return this.trainingOptions;
    }

    public BqmlTrainingRunResponse(
        List<BqmlIterationResultResponse> iterationResults,
        String startTime,
        String state,
        BqmlTrainingRunTrainingOptionsResponse trainingOptions) {
        this.iterationResults = Objects.requireNonNull(iterationResults, "expected parameter 'iterationResults' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.trainingOptions = Objects.requireNonNull(trainingOptions, "expected parameter 'trainingOptions' to be non-null");
    }

    private BqmlTrainingRunResponse() {
        this.iterationResults = List.of();
        this.startTime = null;
        this.state = null;
        this.trainingOptions = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BqmlTrainingRunResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BqmlIterationResultResponse> iterationResults;
        private String startTime;
        private String state;
        private BqmlTrainingRunTrainingOptionsResponse trainingOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(BqmlTrainingRunResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iterationResults = defaults.iterationResults;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.trainingOptions = defaults.trainingOptions;
        }

        public Builder setIterationResults(List<BqmlIterationResultResponse> iterationResults) {
            this.iterationResults = Objects.requireNonNull(iterationResults);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTrainingOptions(BqmlTrainingRunTrainingOptionsResponse trainingOptions) {
            this.trainingOptions = Objects.requireNonNull(trainingOptions);
            return this;
        }

        public BqmlTrainingRunResponse build() {
            return new BqmlTrainingRunResponse(iterationResults, startTime, state, trainingOptions);
        }
    }
}
