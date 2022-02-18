// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudtasks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueueRetryConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueueRetryConfigGetArgs Empty = new QueueRetryConfigGetArgs();

    /**
     * Number of attempts per task.
     * Cloud Tasks will attempt the task maxAttempts times (that is, if
     * the first attempt fails, then there will be maxAttempts - 1
     * retries). Must be >= -1.
     * If unspecified when the queue is created, Cloud Tasks will pick
     * the default.
     * -1 indicates unlimited attempts.
     * 
     */
    @InputImport(name="maxAttempts")
    private final @Nullable Input<Integer> maxAttempts;

    public Input<Integer> getMaxAttempts() {
        return this.maxAttempts == null ? Input.empty() : this.maxAttempts;
    }

    /**
     * A task will be scheduled for retry between minBackoff and
     * maxBackoff duration after it fails, if the queue's RetryConfig
     * specifies that the task should be retried.
     * 
     */
    @InputImport(name="maxBackoff")
    private final @Nullable Input<String> maxBackoff;

    public Input<String> getMaxBackoff() {
        return this.maxBackoff == null ? Input.empty() : this.maxBackoff;
    }

    /**
     * The time between retries will double maxDoublings times.
     * A task's retry interval starts at minBackoff, then doubles maxDoublings times,
     * then increases linearly, and finally retries retries at intervals of maxBackoff
     * up to maxAttempts times.
     * 
     */
    @InputImport(name="maxDoublings")
    private final @Nullable Input<Integer> maxDoublings;

    public Input<Integer> getMaxDoublings() {
        return this.maxDoublings == null ? Input.empty() : this.maxDoublings;
    }

    /**
     * If positive, maxRetryDuration specifies the time limit for
     * retrying a failed task, measured from when the task was first
     * attempted. Once maxRetryDuration time has passed and the task has
     * been attempted maxAttempts times, no further attempts will be
     * made and the task will be deleted.
     * If zero, then the task age is unlimited.
     * 
     */
    @InputImport(name="maxRetryDuration")
    private final @Nullable Input<String> maxRetryDuration;

    public Input<String> getMaxRetryDuration() {
        return this.maxRetryDuration == null ? Input.empty() : this.maxRetryDuration;
    }

    /**
     * A task will be scheduled for retry between minBackoff and
     * maxBackoff duration after it fails, if the queue's RetryConfig
     * specifies that the task should be retried.
     * 
     */
    @InputImport(name="minBackoff")
    private final @Nullable Input<String> minBackoff;

    public Input<String> getMinBackoff() {
        return this.minBackoff == null ? Input.empty() : this.minBackoff;
    }

    public QueueRetryConfigGetArgs(
        @Nullable Input<Integer> maxAttempts,
        @Nullable Input<String> maxBackoff,
        @Nullable Input<Integer> maxDoublings,
        @Nullable Input<String> maxRetryDuration,
        @Nullable Input<String> minBackoff) {
        this.maxAttempts = maxAttempts;
        this.maxBackoff = maxBackoff;
        this.maxDoublings = maxDoublings;
        this.maxRetryDuration = maxRetryDuration;
        this.minBackoff = minBackoff;
    }

    private QueueRetryConfigGetArgs() {
        this.maxAttempts = Input.empty();
        this.maxBackoff = Input.empty();
        this.maxDoublings = Input.empty();
        this.maxRetryDuration = Input.empty();
        this.minBackoff = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueRetryConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maxAttempts;
        private @Nullable Input<String> maxBackoff;
        private @Nullable Input<Integer> maxDoublings;
        private @Nullable Input<String> maxRetryDuration;
        private @Nullable Input<String> minBackoff;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueRetryConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxAttempts = defaults.maxAttempts;
    	      this.maxBackoff = defaults.maxBackoff;
    	      this.maxDoublings = defaults.maxDoublings;
    	      this.maxRetryDuration = defaults.maxRetryDuration;
    	      this.minBackoff = defaults.minBackoff;
        }

        public Builder setMaxAttempts(@Nullable Input<Integer> maxAttempts) {
            this.maxAttempts = maxAttempts;
            return this;
        }

        public Builder setMaxAttempts(@Nullable Integer maxAttempts) {
            this.maxAttempts = Input.ofNullable(maxAttempts);
            return this;
        }

        public Builder setMaxBackoff(@Nullable Input<String> maxBackoff) {
            this.maxBackoff = maxBackoff;
            return this;
        }

        public Builder setMaxBackoff(@Nullable String maxBackoff) {
            this.maxBackoff = Input.ofNullable(maxBackoff);
            return this;
        }

        public Builder setMaxDoublings(@Nullable Input<Integer> maxDoublings) {
            this.maxDoublings = maxDoublings;
            return this;
        }

        public Builder setMaxDoublings(@Nullable Integer maxDoublings) {
            this.maxDoublings = Input.ofNullable(maxDoublings);
            return this;
        }

        public Builder setMaxRetryDuration(@Nullable Input<String> maxRetryDuration) {
            this.maxRetryDuration = maxRetryDuration;
            return this;
        }

        public Builder setMaxRetryDuration(@Nullable String maxRetryDuration) {
            this.maxRetryDuration = Input.ofNullable(maxRetryDuration);
            return this;
        }

        public Builder setMinBackoff(@Nullable Input<String> minBackoff) {
            this.minBackoff = minBackoff;
            return this;
        }

        public Builder setMinBackoff(@Nullable String minBackoff) {
            this.minBackoff = Input.ofNullable(minBackoff);
            return this;
        }

        public QueueRetryConfigGetArgs build() {
            return new QueueRetryConfigGetArgs(maxAttempts, maxBackoff, maxDoublings, maxRetryDuration, minBackoff);
        }
    }
}
