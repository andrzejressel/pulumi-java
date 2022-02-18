// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class RateLimitsResponse {
    /**
     * The max burst size. Max burst size limits how fast tasks in queue are processed when many tasks are in the queue and the rate is high. This field allows the queue to have a high rate so processing starts shortly after a task is enqueued, but still limits resource usage when many tasks are enqueued in a short period of time. The [token bucket](https://wikipedia.org/wiki/Token_Bucket) algorithm is used to control the rate of task dispatches. Each queue has a token bucket that holds tokens, up to the maximum specified by `max_burst_size`. Each time a task is dispatched, a token is removed from the bucket. Tasks will be dispatched until the queue's bucket runs out of tokens. The bucket will be continuously refilled with new tokens based on max_dispatches_per_second. The default value of `max_burst_size` is picked by Cloud Tasks based on the value of max_dispatches_per_second. The maximum value of `max_burst_size` is 500. For App Engine queues that were created or updated using `queue.yaml/xml`, `max_burst_size` is equal to [bucket_size](https://cloud.google.com/appengine/docs/standard/python/config/queueref#bucket_size). If UpdateQueue is called on a queue without explicitly setting a value for `max_burst_size`, `max_burst_size` value will get updated if UpdateQueue is updating max_dispatches_per_second.
     * 
     */
    private final Integer maxBurstSize;
    /**
     * The maximum number of concurrent tasks that Cloud Tasks allows to be dispatched for this queue. After this threshold has been reached, Cloud Tasks stops dispatching tasks until the number of concurrent requests decreases. If unspecified when the queue is created, Cloud Tasks will pick the default. The maximum allowed value is 5,000. This field is output only for pull queues and always -1, which indicates no limit. No other queue types can have `max_concurrent_tasks` set to -1. This field has the same meaning as [max_concurrent_requests in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#max_concurrent_requests).
     * 
     */
    private final Integer maxConcurrentTasks;
    /**
     * The maximum rate at which tasks are dispatched from this queue. If unspecified when the queue is created, Cloud Tasks will pick the default. * For App Engine queues, the maximum allowed value is 500. * This field is output only for pull queues. In addition to the `max_tasks_dispatched_per_second` limit, a maximum of 10 QPS of LeaseTasks requests are allowed per pull queue. This field has the same meaning as [rate in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#rate).
     * 
     */
    private final Double maxTasksDispatchedPerSecond;

    @OutputCustomType.Constructor({"maxBurstSize","maxConcurrentTasks","maxTasksDispatchedPerSecond"})
    private RateLimitsResponse(
        Integer maxBurstSize,
        Integer maxConcurrentTasks,
        Double maxTasksDispatchedPerSecond) {
        this.maxBurstSize = Objects.requireNonNull(maxBurstSize);
        this.maxConcurrentTasks = Objects.requireNonNull(maxConcurrentTasks);
        this.maxTasksDispatchedPerSecond = Objects.requireNonNull(maxTasksDispatchedPerSecond);
    }

    /**
     * The max burst size. Max burst size limits how fast tasks in queue are processed when many tasks are in the queue and the rate is high. This field allows the queue to have a high rate so processing starts shortly after a task is enqueued, but still limits resource usage when many tasks are enqueued in a short period of time. The [token bucket](https://wikipedia.org/wiki/Token_Bucket) algorithm is used to control the rate of task dispatches. Each queue has a token bucket that holds tokens, up to the maximum specified by `max_burst_size`. Each time a task is dispatched, a token is removed from the bucket. Tasks will be dispatched until the queue's bucket runs out of tokens. The bucket will be continuously refilled with new tokens based on max_dispatches_per_second. The default value of `max_burst_size` is picked by Cloud Tasks based on the value of max_dispatches_per_second. The maximum value of `max_burst_size` is 500. For App Engine queues that were created or updated using `queue.yaml/xml`, `max_burst_size` is equal to [bucket_size](https://cloud.google.com/appengine/docs/standard/python/config/queueref#bucket_size). If UpdateQueue is called on a queue without explicitly setting a value for `max_burst_size`, `max_burst_size` value will get updated if UpdateQueue is updating max_dispatches_per_second.
     * 
     */
    public Integer getMaxBurstSize() {
        return this.maxBurstSize;
    }
    /**
     * The maximum number of concurrent tasks that Cloud Tasks allows to be dispatched for this queue. After this threshold has been reached, Cloud Tasks stops dispatching tasks until the number of concurrent requests decreases. If unspecified when the queue is created, Cloud Tasks will pick the default. The maximum allowed value is 5,000. This field is output only for pull queues and always -1, which indicates no limit. No other queue types can have `max_concurrent_tasks` set to -1. This field has the same meaning as [max_concurrent_requests in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#max_concurrent_requests).
     * 
     */
    public Integer getMaxConcurrentTasks() {
        return this.maxConcurrentTasks;
    }
    /**
     * The maximum rate at which tasks are dispatched from this queue. If unspecified when the queue is created, Cloud Tasks will pick the default. * For App Engine queues, the maximum allowed value is 500. * This field is output only for pull queues. In addition to the `max_tasks_dispatched_per_second` limit, a maximum of 10 QPS of LeaseTasks requests are allowed per pull queue. This field has the same meaning as [rate in queue.yaml/xml](https://cloud.google.com/appengine/docs/standard/python/config/queueref#rate).
     * 
     */
    public Double getMaxTasksDispatchedPerSecond() {
        return this.maxTasksDispatchedPerSecond;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RateLimitsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxBurstSize;
        private Integer maxConcurrentTasks;
        private Double maxTasksDispatchedPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(RateLimitsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxBurstSize = defaults.maxBurstSize;
    	      this.maxConcurrentTasks = defaults.maxConcurrentTasks;
    	      this.maxTasksDispatchedPerSecond = defaults.maxTasksDispatchedPerSecond;
        }

        public Builder setMaxBurstSize(Integer maxBurstSize) {
            this.maxBurstSize = Objects.requireNonNull(maxBurstSize);
            return this;
        }

        public Builder setMaxConcurrentTasks(Integer maxConcurrentTasks) {
            this.maxConcurrentTasks = Objects.requireNonNull(maxConcurrentTasks);
            return this;
        }

        public Builder setMaxTasksDispatchedPerSecond(Double maxTasksDispatchedPerSecond) {
            this.maxTasksDispatchedPerSecond = Objects.requireNonNull(maxTasksDispatchedPerSecond);
            return this;
        }

        public RateLimitsResponse build() {
            return new RateLimitsResponse(maxBurstSize, maxConcurrentTasks, maxTasksDispatchedPerSecond);
        }
    }
}
