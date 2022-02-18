// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies options for controlling advanced machine features.
 * 
 */
public final class AdvancedMachineFeaturesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AdvancedMachineFeaturesArgs Empty = new AdvancedMachineFeaturesArgs();

    /**
     * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * 
     */
    @InputImport(name="threadsPerCore")
    private final @Nullable Input<String> threadsPerCore;

    public Input<String> getThreadsPerCore() {
        return this.threadsPerCore == null ? Input.empty() : this.threadsPerCore;
    }

    public AdvancedMachineFeaturesArgs(@Nullable Input<String> threadsPerCore) {
        this.threadsPerCore = threadsPerCore;
    }

    private AdvancedMachineFeaturesArgs() {
        this.threadsPerCore = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedMachineFeaturesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> threadsPerCore;

        public Builder() {
    	      // Empty
        }

        public Builder(AdvancedMachineFeaturesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.threadsPerCore = defaults.threadsPerCore;
        }

        public Builder setThreadsPerCore(@Nullable Input<String> threadsPerCore) {
            this.threadsPerCore = threadsPerCore;
            return this;
        }

        public Builder setThreadsPerCore(@Nullable String threadsPerCore) {
            this.threadsPerCore = Input.ofNullable(threadsPerCore);
            return this;
        }

        public AdvancedMachineFeaturesArgs build() {
            return new AdvancedMachineFeaturesArgs(threadsPerCore);
        }
    }
}
