// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A single rollout step with specified traffic allocation.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepArgs Empty = new GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepArgs();

    /**
     * The name of the rollout step;
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The minimum time that this step should last. Should be longer than 1 hour. If not set, the default minimum duration for each step will be 1 hour.
     * 
     */
    @InputImport(name="minDuration")
    private final @Nullable Input<String> minDuration;

    public Input<String> getMinDuration() {
        return this.minDuration == null ? Input.empty() : this.minDuration;
    }

    /**
     * The percentage of traffic allocated to the flow version of this rollout step. (0%, 100%].
     * 
     */
    @InputImport(name="trafficPercent")
    private final @Nullable Input<Integer> trafficPercent;

    public Input<Integer> getTrafficPercent() {
        return this.trafficPercent == null ? Input.empty() : this.trafficPercent;
    }

    public GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepArgs(
        @Nullable Input<String> displayName,
        @Nullable Input<String> minDuration,
        @Nullable Input<Integer> trafficPercent) {
        this.displayName = displayName;
        this.minDuration = minDuration;
        this.trafficPercent = trafficPercent;
    }

    private GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepArgs() {
        this.displayName = Input.empty();
        this.minDuration = Input.empty();
        this.trafficPercent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> minDuration;
        private @Nullable Input<Integer> trafficPercent;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.minDuration = defaults.minDuration;
    	      this.trafficPercent = defaults.trafficPercent;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setMinDuration(@Nullable Input<String> minDuration) {
            this.minDuration = minDuration;
            return this;
        }

        public Builder setMinDuration(@Nullable String minDuration) {
            this.minDuration = Input.ofNullable(minDuration);
            return this;
        }

        public Builder setTrafficPercent(@Nullable Input<Integer> trafficPercent) {
            this.trafficPercent = trafficPercent;
            return this;
        }

        public Builder setTrafficPercent(@Nullable Integer trafficPercent) {
            this.trafficPercent = Input.ofNullable(trafficPercent);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepArgs build() {
            return new GoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStepArgs(displayName, minDuration, trafficPercent);
        }
    }
}
