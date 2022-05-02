// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.evidently.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LaunchExecutionStatusObjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final LaunchExecutionStatusObjectArgs Empty = new LaunchExecutionStatusObjectArgs();

    /**
     * Provide CANCELLED or COMPLETED as the launch desired state. Defaults to Completed if not provided.
     * 
     */
    @Import(name="desiredState")
    private @Nullable Output<String> desiredState;

    /**
     * @return Provide CANCELLED or COMPLETED as the launch desired state. Defaults to Completed if not provided.
     * 
     */
    public Optional<Output<String>> desiredState() {
        return Optional.ofNullable(this.desiredState);
    }

    /**
     * Provide a reason for stopping the launch. Defaults to empty if not provided.
     * 
     */
    @Import(name="reason")
    private @Nullable Output<String> reason;

    /**
     * @return Provide a reason for stopping the launch. Defaults to empty if not provided.
     * 
     */
    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    /**
     * Provide START or STOP action to apply on a launch
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    /**
     * @return Provide START or STOP action to apply on a launch
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    private LaunchExecutionStatusObjectArgs() {}

    private LaunchExecutionStatusObjectArgs(LaunchExecutionStatusObjectArgs $) {
        this.desiredState = $.desiredState;
        this.reason = $.reason;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LaunchExecutionStatusObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LaunchExecutionStatusObjectArgs $;

        public Builder() {
            $ = new LaunchExecutionStatusObjectArgs();
        }

        public Builder(LaunchExecutionStatusObjectArgs defaults) {
            $ = new LaunchExecutionStatusObjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param desiredState Provide CANCELLED or COMPLETED as the launch desired state. Defaults to Completed if not provided.
         * 
         * @return builder
         * 
         */
        public Builder desiredState(@Nullable Output<String> desiredState) {
            $.desiredState = desiredState;
            return this;
        }

        /**
         * @param desiredState Provide CANCELLED or COMPLETED as the launch desired state. Defaults to Completed if not provided.
         * 
         * @return builder
         * 
         */
        public Builder desiredState(String desiredState) {
            return desiredState(Output.of(desiredState));
        }

        /**
         * @param reason Provide a reason for stopping the launch. Defaults to empty if not provided.
         * 
         * @return builder
         * 
         */
        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param reason Provide a reason for stopping the launch. Defaults to empty if not provided.
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        /**
         * @param status Provide START or STOP action to apply on a launch
         * 
         * @return builder
         * 
         */
        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Provide START or STOP action to apply on a launch
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public LaunchExecutionStatusObjectArgs build() {
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
