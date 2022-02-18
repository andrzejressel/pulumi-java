// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Timestamp represents a point in time independent of any time zone or local calendar, encoded as a count of seconds and fractions of seconds at nanosecond resolution. The count is relative to an epoch at UTC midnight on January 1, 1970, in the proleptic Gregorian calendar which extends the Gregorian calendar backwards to year one. All minutes are 60 seconds long. Leap seconds are "smeared" so that no leap second table is needed for interpretation, using a [24-hour linear smear](https://developers.google.com/time/smear). The range is from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59.999999999Z. By restricting to that range, we ensure that we can convert to and from [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) date strings.
 * 
 */
public final class TimestampArgs extends io.pulumi.resources.ResourceArgs {

    public static final TimestampArgs Empty = new TimestampArgs();

    /**
     * Non-negative fractions of a second at nanosecond resolution. Negative second values with fractions must still have non-negative nanos values that count forward in time. Must be from 0 to 999,999,999 inclusive.
     * 
     */
    @InputImport(name="nanos")
    private final @Nullable Input<Integer> nanos;

    public Input<Integer> getNanos() {
        return this.nanos == null ? Input.empty() : this.nanos;
    }

    /**
     * Represents seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59Z inclusive.
     * 
     */
    @InputImport(name="seconds")
    private final @Nullable Input<String> seconds;

    public Input<String> getSeconds() {
        return this.seconds == null ? Input.empty() : this.seconds;
    }

    public TimestampArgs(
        @Nullable Input<Integer> nanos,
        @Nullable Input<String> seconds) {
        this.nanos = nanos;
        this.seconds = seconds;
    }

    private TimestampArgs() {
        this.nanos = Input.empty();
        this.seconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimestampArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> nanos;
        private @Nullable Input<String> seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(TimestampArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder setNanos(@Nullable Input<Integer> nanos) {
            this.nanos = nanos;
            return this;
        }

        public Builder setNanos(@Nullable Integer nanos) {
            this.nanos = Input.ofNullable(nanos);
            return this;
        }

        public Builder setSeconds(@Nullable Input<String> seconds) {
            this.seconds = seconds;
            return this;
        }

        public Builder setSeconds(@Nullable String seconds) {
            this.seconds = Input.ofNullable(seconds);
            return this;
        }

        public TimestampArgs build() {
            return new TimestampArgs(nanos, seconds);
        }
    }
}
