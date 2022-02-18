// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretRotationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretRotationArgs Empty = new SecretRotationArgs();

    /**
     * Timestamp in UTC at which the Secret is scheduled to rotate.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits. Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @InputImport(name="nextRotationTime")
    private final @Nullable Input<String> nextRotationTime;

    public Input<String> getNextRotationTime() {
        return this.nextRotationTime == null ? Input.empty() : this.nextRotationTime;
    }

    /**
     * The Duration between rotation notifications. Must be in seconds and at least 3600s (1h) and at most 3153600000s (100 years).
     * If rotationPeriod is set, `next_rotation_time` must be set. `next_rotation_time` will be advanced by this period when the service automatically sends rotation notifications.
     * 
     */
    @InputImport(name="rotationPeriod")
    private final @Nullable Input<String> rotationPeriod;

    public Input<String> getRotationPeriod() {
        return this.rotationPeriod == null ? Input.empty() : this.rotationPeriod;
    }

    public SecretRotationArgs(
        @Nullable Input<String> nextRotationTime,
        @Nullable Input<String> rotationPeriod) {
        this.nextRotationTime = nextRotationTime;
        this.rotationPeriod = rotationPeriod;
    }

    private SecretRotationArgs() {
        this.nextRotationTime = Input.empty();
        this.rotationPeriod = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretRotationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> nextRotationTime;
        private @Nullable Input<String> rotationPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretRotationArgs defaults) {
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

        public SecretRotationArgs build() {
            return new SecretRotationArgs(nextRotationTime, rotationPeriod);
        }
    }
}
