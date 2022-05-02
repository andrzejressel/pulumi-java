// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlarmModelAssetPropertyTimestamp {
    /**
     * @return The timestamp, in seconds, in the Unix epoch format. The valid range is between `1-31556889864403199`. You can also specify an expression.
     * 
     */
    private final @Nullable String offsetInNanos;
    /**
     * @return The nanosecond offset converted from `timeInSeconds`. The valid range is between `0-999999999`. You can also specify an expression.
     * 
     */
    private final String timeInSeconds;

    @CustomType.Constructor
    private AlarmModelAssetPropertyTimestamp(
        @CustomType.Parameter("offsetInNanos") @Nullable String offsetInNanos,
        @CustomType.Parameter("timeInSeconds") String timeInSeconds) {
        this.offsetInNanos = offsetInNanos;
        this.timeInSeconds = timeInSeconds;
    }

    /**
     * @return The timestamp, in seconds, in the Unix epoch format. The valid range is between `1-31556889864403199`. You can also specify an expression.
     * 
     */
    public Optional<String> offsetInNanos() {
        return Optional.ofNullable(this.offsetInNanos);
    }
    /**
     * @return The nanosecond offset converted from `timeInSeconds`. The valid range is between `0-999999999`. You can also specify an expression.
     * 
     */
    public String timeInSeconds() {
        return this.timeInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlarmModelAssetPropertyTimestamp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String offsetInNanos;
        private String timeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(AlarmModelAssetPropertyTimestamp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offsetInNanos = defaults.offsetInNanos;
    	      this.timeInSeconds = defaults.timeInSeconds;
        }

        public Builder offsetInNanos(@Nullable String offsetInNanos) {
            this.offsetInNanos = offsetInNanos;
            return this;
        }
        public Builder timeInSeconds(String timeInSeconds) {
            this.timeInSeconds = Objects.requireNonNull(timeInSeconds);
            return this;
        }        public AlarmModelAssetPropertyTimestamp build() {
            return new AlarmModelAssetPropertyTimestamp(offsetInNanos, timeInSeconds);
        }
    }
}
