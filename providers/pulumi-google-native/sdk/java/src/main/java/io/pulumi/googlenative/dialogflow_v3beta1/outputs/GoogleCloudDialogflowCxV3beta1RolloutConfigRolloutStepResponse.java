// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse {
    /**
     * The name of the rollout step;
     * 
     */
    private final String displayName;
    /**
     * The minimum time that this step should last. Should be longer than 1 hour. If not set, the default minimum duration for each step will be 1 hour.
     * 
     */
    private final String minDuration;
    /**
     * The percentage of traffic allocated to the flow version of this rollout step. (0%, 100%].
     * 
     */
    private final Integer trafficPercent;

    @OutputCustomType.Constructor({"displayName","minDuration","trafficPercent"})
    private GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepResponse(
        String displayName,
        String minDuration,
        Integer trafficPercent) {
        this.displayName = Objects.requireNonNull(displayName);
        this.minDuration = Objects.requireNonNull(minDuration);
        this.trafficPercent = Objects.requireNonNull(trafficPercent);
    }

    /**
     * The name of the rollout step;
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The minimum time that this step should last. Should be longer than 1 hour. If not set, the default minimum duration for each step will be 1 hour.
     * 
     */
    public String getMinDuration() {
        return this.minDuration;
    }
    /**
     * The percentage of traffic allocated to the flow version of this rollout step. (0%, 100%].
     * 
     */
    public Integer getTrafficPercent() {
        return this.trafficPercent;
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
