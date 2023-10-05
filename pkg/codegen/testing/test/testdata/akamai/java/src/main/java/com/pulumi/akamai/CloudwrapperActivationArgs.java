// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.inputs.CloudwrapperActivationTimeoutsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudwrapperActivationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudwrapperActivationArgs Empty = new CloudwrapperActivationArgs();

    /**
     * The configuration you want to activate.
     * 
     */
    @Import(name="configId", required=true)
    private Output<Integer> configId;

    /**
     * @return The configuration you want to activate.
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }

    /**
     * Unique hash value of the configuration.
     * 
     */
    @Import(name="revision", required=true)
    private Output<String> revision;

    /**
     * @return Unique hash value of the configuration.
     * 
     */
    public Output<String> revision() {
        return this.revision;
    }

    @Import(name="timeouts")
    private @Nullable Output<CloudwrapperActivationTimeoutsArgs> timeouts;

    public Optional<Output<CloudwrapperActivationTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    private CloudwrapperActivationArgs() {}

    private CloudwrapperActivationArgs(CloudwrapperActivationArgs $) {
        this.configId = $.configId;
        this.revision = $.revision;
        this.timeouts = $.timeouts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudwrapperActivationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudwrapperActivationArgs $;

        public Builder() {
            $ = new CloudwrapperActivationArgs();
        }

        public Builder(CloudwrapperActivationArgs defaults) {
            $ = new CloudwrapperActivationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configId The configuration you want to activate.
         * 
         * @return builder
         * 
         */
        public Builder configId(Output<Integer> configId) {
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
        public Builder revision(Output<String> revision) {
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

        public CloudwrapperActivationArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.revision = Objects.requireNonNull($.revision, "expected parameter 'revision' to be non-null");
            return $;
        }
    }

}
