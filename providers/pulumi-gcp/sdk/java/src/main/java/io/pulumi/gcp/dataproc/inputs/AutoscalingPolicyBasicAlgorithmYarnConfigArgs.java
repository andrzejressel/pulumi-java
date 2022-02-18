// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalingPolicyBasicAlgorithmYarnConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalingPolicyBasicAlgorithmYarnConfigArgs Empty = new AutoscalingPolicyBasicAlgorithmYarnConfigArgs();

    /**
     * Timeout for YARN graceful decommissioning of Node Managers. Specifies the
     * duration to wait for jobs to complete before forcefully removing workers
     * (and potentially interrupting jobs). Only applicable to downscaling operations.
     * Bounds: [0s, 1d].
     * 
     */
    @InputImport(name="gracefulDecommissionTimeout", required=true)
    private final Input<String> gracefulDecommissionTimeout;

    public Input<String> getGracefulDecommissionTimeout() {
        return this.gracefulDecommissionTimeout;
    }

    /**
     * Fraction of average pending memory in the last cooldown period for which to
     * remove workers. A scale-down factor of 1 will result in scaling down so that there
     * is no available memory remaining after the update (more aggressive scaling).
     * A scale-down factor of 0 disables removing workers, which can be beneficial for
     * autoscaling a single job.
     * Bounds: [0.0, 1.0].
     * 
     */
    @InputImport(name="scaleDownFactor", required=true)
    private final Input<Double> scaleDownFactor;

    public Input<Double> getScaleDownFactor() {
        return this.scaleDownFactor;
    }

    /**
     * Minimum scale-down threshold as a fraction of total cluster size before scaling occurs.
     * For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler must
     * recommend at least a 2 worker scale-down for the cluster to scale. A threshold of 0
     * means the autoscaler will scale down on any recommended change.
     * Bounds: [0.0, 1.0]. Default: 0.0.
     * 
     */
    @InputImport(name="scaleDownMinWorkerFraction")
    private final @Nullable Input<Double> scaleDownMinWorkerFraction;

    public Input<Double> getScaleDownMinWorkerFraction() {
        return this.scaleDownMinWorkerFraction == null ? Input.empty() : this.scaleDownMinWorkerFraction;
    }

    /**
     * Fraction of average pending memory in the last cooldown period for which to
     * add workers. A scale-up factor of 1.0 will result in scaling up so that there
     * is no pending memory remaining after the update (more aggressive scaling).
     * A scale-up factor closer to 0 will result in a smaller magnitude of scaling up
     * (less aggressive scaling).
     * Bounds: [0.0, 1.0].
     * 
     */
    @InputImport(name="scaleUpFactor", required=true)
    private final Input<Double> scaleUpFactor;

    public Input<Double> getScaleUpFactor() {
        return this.scaleUpFactor;
    }

    /**
     * Minimum scale-up threshold as a fraction of total cluster size before scaling
     * occurs. For example, in a 20-worker cluster, a threshold of 0.1 means the autoscaler
     * must recommend at least a 2-worker scale-up for the cluster to scale. A threshold of
     * 0 means the autoscaler will scale up on any recommended change.
     * Bounds: [0.0, 1.0]. Default: 0.0.
     * 
     */
    @InputImport(name="scaleUpMinWorkerFraction")
    private final @Nullable Input<Double> scaleUpMinWorkerFraction;

    public Input<Double> getScaleUpMinWorkerFraction() {
        return this.scaleUpMinWorkerFraction == null ? Input.empty() : this.scaleUpMinWorkerFraction;
    }

    public AutoscalingPolicyBasicAlgorithmYarnConfigArgs(
        Input<String> gracefulDecommissionTimeout,
        Input<Double> scaleDownFactor,
        @Nullable Input<Double> scaleDownMinWorkerFraction,
        Input<Double> scaleUpFactor,
        @Nullable Input<Double> scaleUpMinWorkerFraction) {
        this.gracefulDecommissionTimeout = Objects.requireNonNull(gracefulDecommissionTimeout, "expected parameter 'gracefulDecommissionTimeout' to be non-null");
        this.scaleDownFactor = Objects.requireNonNull(scaleDownFactor, "expected parameter 'scaleDownFactor' to be non-null");
        this.scaleDownMinWorkerFraction = scaleDownMinWorkerFraction;
        this.scaleUpFactor = Objects.requireNonNull(scaleUpFactor, "expected parameter 'scaleUpFactor' to be non-null");
        this.scaleUpMinWorkerFraction = scaleUpMinWorkerFraction;
    }

    private AutoscalingPolicyBasicAlgorithmYarnConfigArgs() {
        this.gracefulDecommissionTimeout = Input.empty();
        this.scaleDownFactor = Input.empty();
        this.scaleDownMinWorkerFraction = Input.empty();
        this.scaleUpFactor = Input.empty();
        this.scaleUpMinWorkerFraction = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyBasicAlgorithmYarnConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> gracefulDecommissionTimeout;
        private Input<Double> scaleDownFactor;
        private @Nullable Input<Double> scaleDownMinWorkerFraction;
        private Input<Double> scaleUpFactor;
        private @Nullable Input<Double> scaleUpMinWorkerFraction;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyBasicAlgorithmYarnConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gracefulDecommissionTimeout = defaults.gracefulDecommissionTimeout;
    	      this.scaleDownFactor = defaults.scaleDownFactor;
    	      this.scaleDownMinWorkerFraction = defaults.scaleDownMinWorkerFraction;
    	      this.scaleUpFactor = defaults.scaleUpFactor;
    	      this.scaleUpMinWorkerFraction = defaults.scaleUpMinWorkerFraction;
        }

        public Builder setGracefulDecommissionTimeout(Input<String> gracefulDecommissionTimeout) {
            this.gracefulDecommissionTimeout = Objects.requireNonNull(gracefulDecommissionTimeout);
            return this;
        }

        public Builder setGracefulDecommissionTimeout(String gracefulDecommissionTimeout) {
            this.gracefulDecommissionTimeout = Input.of(Objects.requireNonNull(gracefulDecommissionTimeout));
            return this;
        }

        public Builder setScaleDownFactor(Input<Double> scaleDownFactor) {
            this.scaleDownFactor = Objects.requireNonNull(scaleDownFactor);
            return this;
        }

        public Builder setScaleDownFactor(Double scaleDownFactor) {
            this.scaleDownFactor = Input.of(Objects.requireNonNull(scaleDownFactor));
            return this;
        }

        public Builder setScaleDownMinWorkerFraction(@Nullable Input<Double> scaleDownMinWorkerFraction) {
            this.scaleDownMinWorkerFraction = scaleDownMinWorkerFraction;
            return this;
        }

        public Builder setScaleDownMinWorkerFraction(@Nullable Double scaleDownMinWorkerFraction) {
            this.scaleDownMinWorkerFraction = Input.ofNullable(scaleDownMinWorkerFraction);
            return this;
        }

        public Builder setScaleUpFactor(Input<Double> scaleUpFactor) {
            this.scaleUpFactor = Objects.requireNonNull(scaleUpFactor);
            return this;
        }

        public Builder setScaleUpFactor(Double scaleUpFactor) {
            this.scaleUpFactor = Input.of(Objects.requireNonNull(scaleUpFactor));
            return this;
        }

        public Builder setScaleUpMinWorkerFraction(@Nullable Input<Double> scaleUpMinWorkerFraction) {
            this.scaleUpMinWorkerFraction = scaleUpMinWorkerFraction;
            return this;
        }

        public Builder setScaleUpMinWorkerFraction(@Nullable Double scaleUpMinWorkerFraction) {
            this.scaleUpMinWorkerFraction = Input.ofNullable(scaleUpMinWorkerFraction);
            return this;
        }

        public AutoscalingPolicyBasicAlgorithmYarnConfigArgs build() {
            return new AutoscalingPolicyBasicAlgorithmYarnConfigArgs(gracefulDecommissionTimeout, scaleDownFactor, scaleDownMinWorkerFraction, scaleUpFactor, scaleUpMinWorkerFraction);
        }
    }
}
