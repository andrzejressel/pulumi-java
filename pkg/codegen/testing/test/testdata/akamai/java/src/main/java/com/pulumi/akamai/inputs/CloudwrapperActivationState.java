// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.CloudwrapperActivationTimeoutsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudwrapperActivationState extends com.pulumi.resources.ResourceArgs {

    public static final CloudwrapperActivationState Empty = new CloudwrapperActivationState();

    /**
     * The configuration you want to activate.
     * 
     */
    @Import(name="configId")
    private @Nullable Output<Integer> configId;

    /**
     * @return The configuration you want to activate.
     * 
     */
    public Optional<Output<Integer>> configId() {
        return Optional.ofNullable(this.configId);
    }

    /**
     * Unique hash value of the configuration.
     * 
     */
    @Import(name="revision")
    private @Nullable Output<String> revision;

    /**
     * @return Unique hash value of the configuration.
     * 
     */
    public Optional<Output<String>> revision() {
        return Optional.ofNullable(this.revision);
    }

    @Import(name="timeouts")
    private @Nullable Output<CloudwrapperActivationTimeoutsArgs> timeouts;

    public Optional<Output<CloudwrapperActivationTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    private CloudwrapperActivationState() {}

    private CloudwrapperActivationState(CloudwrapperActivationState $) {
        this.configId = $.configId;
        this.revision = $.revision;
        this.timeouts = $.timeouts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudwrapperActivationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudwrapperActivationState $;

        public Builder() {
            $ = new CloudwrapperActivationState();
        }

        public Builder(CloudwrapperActivationState defaults) {
            $ = new CloudwrapperActivationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param configId The configuration you want to activate.
         * 
         * @return builder
         * 
         */
        public Builder configId(@Nullable Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        /**
         * @param configId The configuration you want to activate.
         * 
         * @return builder
         * 
         */
        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        /**
         * @param revision Unique hash value of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder revision(@Nullable Output<String> revision) {
            $.revision = revision;
            return this;
        }

        /**
         * @param revision Unique hash value of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder revision(String revision) {
            return revision(Output.of(revision));
        }

        public Builder timeouts(@Nullable Output<CloudwrapperActivationTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(CloudwrapperActivationTimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        public CloudwrapperActivationState build() {
            return $;
        }
    }

}
