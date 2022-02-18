// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The rotation time and period for a Secret. At next_rotation_time, Secret Manager will send a Pub/Sub notification to the topics configured on the Secret. Secret.topics must be set to configure rotation.
 * 
 */
public final class RotationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RotationArgs Empty = new RotationArgs();

    /**
     * Optional. Timestamp in UTC at which the Secret is scheduled to rotate. Cannot be set to less than 300s (5 min) in the future and at most 3153600000s (100 years). next_rotation_time MUST be set if rotation_period is set.
     * 
     */
    @InputImport(name="nextRotationTime")
    private final @Nullable Input<String> nextRotationTime;

    public Input<String> getNextRotationTime() {
        return this.nextRotationTime == null ? Input.empty() : this.nextRotationTime;
    }

    /**
     * Input only. The Duration between rotation notifications. Must be in seconds and at least 3600s (1h) and at most 3153600000s (100 years). If rotation_period is set, next_rotation_time must be set. next_rotation_time will be advanced by this period when the service automatically sends rotation notifications.
     * 
     */
    @InputImport(name="rotationPeriod")
    private final @Nullable Input<String> rotationPeriod;

    public Input<String> getRotationPeriod() {
        return this.rotationPeriod == null ? Input.empty() : this.rotationPeriod;
    }

    public RotationArgs(
        @Nullable Input<String> nextRotationTime,
        @Nullable Input<String> rotationPeriod) {
        this.nextRotationTime = nextRotationTime;
        this.rotationPeriod = rotationPeriod;
    }

    private RotationArgs() {
        this.nextRotationTime = Input.empty();
        this.rotationPeriod = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RotationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> nextRotationTime;
        private @Nullable Input<String> rotationPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(RotationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextRotationTime = defaults.nextRotationTime;
    	      this.rotationPeriod = defaults.rotationPeriod;
        }

        public Builder setNextRotationTime(@Nullable Input<String> nextRotationTime) {
            this.nextRotationTime = nextRotationTime;
            return this;
        }

        public Builder setNextRotationTime(@Nullable String nextRotationTime) {
            this.nextRotationTime = Input.ofNullable(nextRotationTime);
            return this;
        }

        public Builder setRotationPeriod(@Nullable Input<String> rotationPeriod) {
            this.rotationPeriod = rotationPeriod;
            return this;
        }

        public Builder setRotationPeriod(@Nullable String rotationPeriod) {
            this.rotationPeriod = Input.ofNullable(rotationPeriod);
            return this;
        }

        public RotationArgs build() {
            return new RotationArgs(nextRotationTime, rotationPeriod);
        }
    }
}
