// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A single rollout step with specified traffic allocation.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse Empty = new GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse();

    /**
     * The name of the rollout step;
     * 
     */
    @InputImport(name="displayName", required=true)
    private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * The minimum time that this step should last. Should be longer than 1 hour. If not set, the default minimum duration for each step will be 1 hour.
     * 
     */
    @InputImport(name="minDuration", required=true)
    private final String minDuration;

    public String getMinDuration() {
        return this.minDuration;
    }

    /**
     * The percentage of traffic allocated to the flow version of this rollout step. (0%, 100%].
     * 
     */
    @InputImport(name="trafficPercent", required=true)
    private final Integer trafficPercent;

    public Integer getTrafficPercent() {
        return this.trafficPercent;
    }

    public GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse(
        String displayName,
        String minDuration,
        Integer trafficPercent) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.minDuration = Objects.requireNonNull(minDuration, "expected parameter 'minDuration' to be non-null");
        this.trafficPercent = Objects.requireNonNull(trafficPercent, "expected parameter 'trafficPercent' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse() {
        this.displayName = null;
        this.minDuration = null;
        this.trafficPercent = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String minDuration;
        private Integer trafficPercent;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.minDuration = defaults.minDuration;
    	      this.trafficPercent = defaults.trafficPercent;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setMinDuration(String minDuration) {
            this.minDuration = Objects.requireNonNull(minDuration);
            return this;
        }

        public Builder setTrafficPercent(Integer trafficPercent) {
            this.trafficPercent = Objects.requireNonNull(trafficPercent);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse build() {
            return new GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse(displayName, minDuration, trafficPercent);
        }
    }
}
