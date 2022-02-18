// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The configuration for auto rollout.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1RolloutConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1RolloutConfigResponse Empty = new GoogleCloudDialogflowCxV3beta1RolloutConfigResponse();

    /**
     * The conditions that are used to evaluate the failure of a rollout step. If not specified, no rollout steps will fail. E.g. "containment_rate < 10% OR average_turn_count < 3". See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
     * 
     */
    @InputImport(name="failureCondition", required=true)
    private final String failureCondition;

    public String getFailureCondition() {
        return this.failureCondition;
    }

    /**
     * The conditions that are used to evaluate the success of a rollout step. If not specified, all rollout steps will proceed to the next one unless failure conditions are met. E.g. "containment_rate > 60% AND callback_rate < 20%". See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
     * 
     */
    @InputImport(name="rolloutCondition", required=true)
    private final String rolloutCondition;

    public String getRolloutCondition() {
        return this.rolloutCondition;
    }

    /**
     * Steps to roll out a flow version. Steps should be sorted by percentage in ascending order.
     * 
     */
    @InputImport(name="rolloutSteps", required=true)
    private final List<GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse> rolloutSteps;

    public List<GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse> getRolloutSteps() {
        return this.rolloutSteps;
    }

    public GoogleCloudDialogflowCxV3beta1RolloutConfigResponse(
        String failureCondition,
        String rolloutCondition,
        List<GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse> rolloutSteps) {
        this.failureCondition = Objects.requireNonNull(failureCondition, "expected parameter 'failureCondition' to be non-null");
        this.rolloutCondition = Objects.requireNonNull(rolloutCondition, "expected parameter 'rolloutCondition' to be non-null");
        this.rolloutSteps = Objects.requireNonNull(rolloutSteps, "expected parameter 'rolloutSteps' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1RolloutConfigResponse() {
        this.failureCondition = null;
        this.rolloutCondition = null;
        this.rolloutSteps = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1RolloutConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String failureCondition;
        private String rolloutCondition;
        private List<GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse> rolloutSteps;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1RolloutConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureCondition = defaults.failureCondition;
    	      this.rolloutCondition = defaults.rolloutCondition;
    	      this.rolloutSteps = defaults.rolloutSteps;
        }

        public Builder setFailureCondition(String failureCondition) {
            this.failureCondition = Objects.requireNonNull(failureCondition);
            return this;
        }

        public Builder setRolloutCondition(String rolloutCondition) {
            this.rolloutCondition = Objects.requireNonNull(rolloutCondition);
            return this;
        }

        public Builder setRolloutSteps(List<GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse> rolloutSteps) {
            this.rolloutSteps = Objects.requireNonNull(rolloutSteps);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1RolloutConfigResponse build() {
            return new GoogleCloudDialogflowCxV3beta1RolloutConfigResponse(failureCondition, rolloutCondition, rolloutSteps);
        }
    }
}
