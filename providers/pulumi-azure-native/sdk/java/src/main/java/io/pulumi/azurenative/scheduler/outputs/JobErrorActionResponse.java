// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.outputs;

import io.pulumi.azurenative.scheduler.outputs.HttpRequestResponse;
import io.pulumi.azurenative.scheduler.outputs.RetryPolicyResponse;
import io.pulumi.azurenative.scheduler.outputs.ServiceBusQueueMessageResponse;
import io.pulumi.azurenative.scheduler.outputs.ServiceBusTopicMessageResponse;
import io.pulumi.azurenative.scheduler.outputs.StorageQueueMessageResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobErrorActionResponse {
    /**
     * Gets or sets the storage queue message.
     * 
     */
    private final @Nullable StorageQueueMessageResponse queueMessage;
    /**
     * Gets or sets the http requests.
     * 
     */
    private final @Nullable HttpRequestResponse request;
    /**
     * Gets or sets the retry policy.
     * 
     */
    private final @Nullable RetryPolicyResponse retryPolicy;
    /**
     * Gets or sets the service bus queue message.
     * 
     */
    private final @Nullable ServiceBusQueueMessageResponse serviceBusQueueMessage;
    /**
     * Gets or sets the service bus topic message.
     * 
     */
    private final @Nullable ServiceBusTopicMessageResponse serviceBusTopicMessage;
    /**
     * Gets or sets the job error action type.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor
    private JobErrorActionResponse(
        @OutputCustomType.Parameter("queueMessage") @Nullable StorageQueueMessageResponse queueMessage,
        @OutputCustomType.Parameter("request") @Nullable HttpRequestResponse request,
        @OutputCustomType.Parameter("retryPolicy") @Nullable RetryPolicyResponse retryPolicy,
        @OutputCustomType.Parameter("serviceBusQueueMessage") @Nullable ServiceBusQueueMessageResponse serviceBusQueueMessage,
        @OutputCustomType.Parameter("serviceBusTopicMessage") @Nullable ServiceBusTopicMessageResponse serviceBusTopicMessage,
        @OutputCustomType.Parameter("type") @Nullable String type) {
        this.queueMessage = queueMessage;
        this.request = request;
        this.retryPolicy = retryPolicy;
        this.serviceBusQueueMessage = serviceBusQueueMessage;
        this.serviceBusTopicMessage = serviceBusTopicMessage;
        this.type = type;
    }

    /**
     * Gets or sets the storage queue message.
     * 
    */
    public Optional<StorageQueueMessageResponse> getQueueMessage() {
        return Optional.ofNullable(this.queueMessage);
    }
    /**
     * Gets or sets the http requests.
     * 
    */
    public Optional<HttpRequestResponse> getRequest() {
        return Optional.ofNullable(this.request);
    }
    /**
     * Gets or sets the retry policy.
     * 
    */
    public Optional<RetryPolicyResponse> getRetryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }
    /**
     * Gets or sets the service bus queue message.
     * 
    */
    public Optional<ServiceBusQueueMessageResponse> getServiceBusQueueMessage() {
        return Optional.ofNullable(this.serviceBusQueueMessage);
    }
    /**
     * Gets or sets the service bus topic message.
     * 
    */
    public Optional<ServiceBusTopicMessageResponse> getServiceBusTopicMessage() {
        return Optional.ofNullable(this.serviceBusTopicMessage);
    }
    /**
     * Gets or sets the job error action type.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobErrorActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable StorageQueueMessageResponse queueMessage;
        private @Nullable HttpRequestResponse request;
        private @Nullable RetryPolicyResponse retryPolicy;
        private @Nullable ServiceBusQueueMessageResponse serviceBusQueueMessage;
        private @Nullable ServiceBusTopicMessageResponse serviceBusTopicMessage;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JobErrorActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queueMessage = defaults.queueMessage;
    	      this.request = defaults.request;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.serviceBusQueueMessage = defaults.serviceBusQueueMessage;
    	      this.serviceBusTopicMessage = defaults.serviceBusTopicMessage;
    	      this.type = defaults.type;
        }

        public Builder setQueueMessage(@Nullable StorageQueueMessageResponse queueMessage) {
            this.queueMessage = queueMessage;
            return this;
        }

        public Builder setRequest(@Nullable HttpRequestResponse request) {
            this.request = request;
            return this;
        }

        public Builder setRetryPolicy(@Nullable RetryPolicyResponse retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder setServiceBusQueueMessage(@Nullable ServiceBusQueueMessageResponse serviceBusQueueMessage) {
            this.serviceBusQueueMessage = serviceBusQueueMessage;
            return this;
        }

        public Builder setServiceBusTopicMessage(@Nullable ServiceBusTopicMessageResponse serviceBusTopicMessage) {
            this.serviceBusTopicMessage = serviceBusTopicMessage;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public JobErrorActionResponse build() {
            return new JobErrorActionResponse(queueMessage, request, retryPolicy, serviceBusQueueMessage, serviceBusTopicMessage, type);
        }
    }
}
