// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.ScaleRuleAuthResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class QueueScaleRuleResponse {
    /**
     * Authentication secrets for the queue scale rule.
     * 
     */
    private final @Nullable List<ScaleRuleAuthResponse> auth;
    /**
     * Queue length.
     * 
     */
    private final @Nullable Integer queueLength;
    /**
     * Queue name.
     * 
     */
    private final @Nullable String queueName;

    @OutputCustomType.Constructor
    private QueueScaleRuleResponse(
        @OutputCustomType.Parameter("auth") @Nullable List<ScaleRuleAuthResponse> auth,
        @OutputCustomType.Parameter("queueLength") @Nullable Integer queueLength,
        @OutputCustomType.Parameter("queueName") @Nullable String queueName) {
        this.auth = auth;
        this.queueLength = queueLength;
        this.queueName = queueName;
    }

    /**
     * Authentication secrets for the queue scale rule.
     * 
    */
    public List<ScaleRuleAuthResponse> getAuth() {
        return this.auth == null ? List.of() : this.auth;
    }
    /**
     * Queue length.
     * 
    */
    public Optional<Integer> getQueueLength() {
        return Optional.ofNullable(this.queueLength);
    }
    /**
     * Queue name.
     * 
    */
    public Optional<String> getQueueName() {
        return Optional.ofNullable(this.queueName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueScaleRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ScaleRuleAuthResponse> auth;
        private @Nullable Integer queueLength;
        private @Nullable String queueName;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueScaleRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.queueLength = defaults.queueLength;
    	      this.queueName = defaults.queueName;
        }

        public Builder setAuth(@Nullable List<ScaleRuleAuthResponse> auth) {
            this.auth = auth;
            return this;
        }

        public Builder setQueueLength(@Nullable Integer queueLength) {
            this.queueLength = queueLength;
            return this;
        }

        public Builder setQueueName(@Nullable String queueName) {
            this.queueName = queueName;
            return this;
        }
        public QueueScaleRuleResponse build() {
            return new QueueScaleRuleResponse(auth, queueLength, queueName);
        }
    }
}
