// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LiteTopicRetentionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final LiteTopicRetentionConfigArgs Empty = new LiteTopicRetentionConfigArgs();

    /**
     * The provisioned storage, in bytes, per partition. If the number of bytes stored
     * in any of the topic's partitions grows beyond this value, older messages will be
     * dropped to make room for newer ones, regardless of the value of period.
     * 
     */
    @InputImport(name="perPartitionBytes", required=true)
    private final Input<String> perPartitionBytes;

    public Input<String> getPerPartitionBytes() {
        return this.perPartitionBytes;
    }

    /**
     * How long a published message is retained. If unset, messages will be retained as
     * long as the bytes retained for each partition is below perPartitionBytes. A
     * duration in seconds with up to nine fractional digits, terminated by 's'.
     * Example: "3.5s".
     * 
     */
    @InputImport(name="period")
    private final @Nullable Input<String> period;

    public Input<String> getPeriod() {
        return this.period == null ? Input.empty() : this.period;
    }

    public LiteTopicRetentionConfigArgs(
        Input<String> perPartitionBytes,
        @Nullable Input<String> period) {
        this.perPartitionBytes = Objects.requireNonNull(perPartitionBytes, "expected parameter 'perPartitionBytes' to be non-null");
        this.period = period;
    }

    private LiteTopicRetentionConfigArgs() {
        this.perPartitionBytes = Input.empty();
        this.period = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteTopicRetentionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> perPartitionBytes;
        private @Nullable Input<String> period;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteTopicRetentionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.perPartitionBytes = defaults.perPartitionBytes;
    	      this.period = defaults.period;
        }

        public Builder setPerPartitionBytes(Input<String> perPartitionBytes) {
            this.perPartitionBytes = Objects.requireNonNull(perPartitionBytes);
            return this;
        }

        public Builder setPerPartitionBytes(String perPartitionBytes) {
            this.perPartitionBytes = Input.of(Objects.requireNonNull(perPartitionBytes));
            return this;
        }

        public Builder setPeriod(@Nullable Input<String> period) {
            this.period = period;
            return this;
        }

        public Builder setPeriod(@Nullable String period) {
            this.period = Input.ofNullable(period);
            return this;
        }

        public LiteTopicRetentionConfigArgs build() {
            return new LiteTopicRetentionConfigArgs(perPartitionBytes, period);
        }
    }
}
