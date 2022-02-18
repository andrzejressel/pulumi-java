// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.cloudbuild_v1.inputs.NetworkConfigArgs;
import io.pulumi.googlenative.cloudbuild_v1.inputs.WorkerConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for a V1 `PrivatePool`.
 * 
 */
public final class PrivatePoolV1ConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivatePoolV1ConfigArgs Empty = new PrivatePoolV1ConfigArgs();

    /**
     * Network configuration for the pool.
     * 
     */
    @InputImport(name="networkConfig")
    private final @Nullable Input<NetworkConfigArgs> networkConfig;

    public Input<NetworkConfigArgs> getNetworkConfig() {
        return this.networkConfig == null ? Input.empty() : this.networkConfig;
    }

    /**
     * Machine configuration for the workers in the pool.
     * 
     */
    @InputImport(name="workerConfig")
    private final @Nullable Input<WorkerConfigArgs> workerConfig;

    public Input<WorkerConfigArgs> getWorkerConfig() {
        return this.workerConfig == null ? Input.empty() : this.workerConfig;
    }

    public PrivatePoolV1ConfigArgs(
        @Nullable Input<NetworkConfigArgs> networkConfig,
        @Nullable Input<WorkerConfigArgs> workerConfig) {
        this.networkConfig = networkConfig;
        this.workerConfig = workerConfig;
    }

    private PrivatePoolV1ConfigArgs() {
        this.networkConfig = Input.empty();
        this.workerConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivatePoolV1ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<NetworkConfigArgs> networkConfig;
        private @Nullable Input<WorkerConfigArgs> workerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivatePoolV1ConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkConfig = defaults.networkConfig;
    	      this.workerConfig = defaults.workerConfig;
        }

        public Builder setNetworkConfig(@Nullable Input<NetworkConfigArgs> networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        public Builder setNetworkConfig(@Nullable NetworkConfigArgs networkConfig) {
            this.networkConfig = Input.ofNullable(networkConfig);
            return this;
        }

        public Builder setWorkerConfig(@Nullable Input<WorkerConfigArgs> workerConfig) {
            this.workerConfig = workerConfig;
            return this;
        }

        public Builder setWorkerConfig(@Nullable WorkerConfigArgs workerConfig) {
            this.workerConfig = Input.ofNullable(workerConfig);
            return this;
        }

        public PrivatePoolV1ConfigArgs build() {
            return new PrivatePoolV1ConfigArgs(networkConfig, workerConfig);
        }
    }
}
