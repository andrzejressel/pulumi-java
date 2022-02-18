// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta3;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.cloudtasks_v2beta3.enums.QueueType;
import io.pulumi.googlenative.cloudtasks_v2beta3.inputs.AppEngineHttpQueueArgs;
import io.pulumi.googlenative.cloudtasks_v2beta3.inputs.RateLimitsArgs;
import io.pulumi.googlenative.cloudtasks_v2beta3.inputs.RetryConfigArgs;
import io.pulumi.googlenative.cloudtasks_v2beta3.inputs.StackdriverLoggingConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueueArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueueArgs Empty = new QueueArgs();

    /**
     * AppEngineHttpQueue settings apply only to App Engine tasks in this queue. Http tasks are not affected by this proto.
     * 
     */
    @InputImport(name="appEngineHttpQueue")
    private final @Nullable Input<AppEngineHttpQueueArgs> appEngineHttpQueue;

    public Input<AppEngineHttpQueueArgs> getAppEngineHttpQueue() {
        return this.appEngineHttpQueue == null ? Input.empty() : this.appEngineHttpQueue;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Caller-specified and required in CreateQueue, after which it becomes output only. The queue name. The queue name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the queue's location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Rate limits for task dispatches. rate_limits and retry_config are related because they both control task attempts. However they control task attempts in different ways: * rate_limits controls the total rate of dispatches from a queue (i.e. all traffic dispatched from the queue, regardless of whether the dispatch is from a first attempt or a retry). * retry_config controls what happens to particular a task after its first attempt fails. That is, retry_config controls task retries (the second attempt, third attempt, etc). The queue's actual dispatch rate is the result of: * Number of tasks in the queue * User-specified throttling: rate_limits, retry_config, and the queue's state. * System throttling due to `429` (Too Many Requests) or `503` (Service Unavailable) responses from the worker, high error rates, or to smooth sudden large traffic spikes.
     * 
     */
    @InputImport(name="rateLimits")
    private final @Nullable Input<RateLimitsArgs> rateLimits;

    public Input<RateLimitsArgs> getRateLimits() {
        return this.rateLimits == null ? Input.empty() : this.rateLimits;
    }

    /**
     * Settings that determine the retry behavior. * For tasks created using Cloud Tasks: the queue-level retry settings apply to all tasks in the queue that were created using Cloud Tasks. Retry settings cannot be set on individual tasks. * For tasks created using the App Engine SDK: the queue-level retry settings apply to all tasks in the queue which do not have retry settings explicitly set on the task and were created by the App Engine SDK. See [App Engine documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
     * 
     */
    @InputImport(name="retryConfig")
    private final @Nullable Input<RetryConfigArgs> retryConfig;

    public Input<RetryConfigArgs> getRetryConfig() {
        return this.retryConfig == null ? Input.empty() : this.retryConfig;
    }

    /**
     * Configuration options for writing logs to [Stackdriver Logging](https://cloud.google.com/logging/docs/). If this field is unset, then no logs are written.
     * 
     */
    @InputImport(name="stackdriverLoggingConfig")
    private final @Nullable Input<StackdriverLoggingConfigArgs> stackdriverLoggingConfig;

    public Input<StackdriverLoggingConfigArgs> getStackdriverLoggingConfig() {
        return this.stackdriverLoggingConfig == null ? Input.empty() : this.stackdriverLoggingConfig;
    }

    /**
     * The maximum amount of time that a task will be retained in this queue. Queues created by Cloud Tasks have a default `task_ttl` of 31 days. After a task has lived for `task_ttl`, the task will be deleted regardless of whether it was dispatched or not. The `task_ttl` for queues created via queue.yaml/xml is equal to the maximum duration because there is a [storage quota](https://cloud.google.com/appengine/quotas#Task_Queue) for these queues. To view the maximum valid duration, see the documentation for Duration.
     * 
     */
    @InputImport(name="taskTtl")
    private final @Nullable Input<String> taskTtl;

    public Input<String> getTaskTtl() {
        return this.taskTtl == null ? Input.empty() : this.taskTtl;
    }

    /**
     * The task tombstone time to live (TTL). After a task is deleted or executed, the task's tombstone is retained for the length of time specified by `tombstone_ttl`. The tombstone is used by task de-duplication; another task with the same name can't be created until the tombstone has expired. For more information about task de-duplication, see the documentation for CreateTaskRequest. Queues created by Cloud Tasks have a default `tombstone_ttl` of 1 hour.
     * 
     */
    @InputImport(name="tombstoneTtl")
    private final @Nullable Input<String> tombstoneTtl;

    public Input<String> getTombstoneTtl() {
        return this.tombstoneTtl == null ? Input.empty() : this.tombstoneTtl;
    }

    /**
     * Immutable. The type of a queue (push or pull). `Queue.type` is an immutable property of the queue that is set at the queue creation time. When left unspecified, the default value of `PUSH` is selected.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<QueueType> type;

    public Input<QueueType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public QueueArgs(
        @Nullable Input<AppEngineHttpQueueArgs> appEngineHttpQueue,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<RateLimitsArgs> rateLimits,
        @Nullable Input<RetryConfigArgs> retryConfig,
        @Nullable Input<StackdriverLoggingConfigArgs> stackdriverLoggingConfig,
        @Nullable Input<String> taskTtl,
        @Nullable Input<String> tombstoneTtl,
        @Nullable Input<QueueType> type) {
        this.appEngineHttpQueue = appEngineHttpQueue;
        this.location = location;
        this.name = name;
        this.project = project;
        this.rateLimits = rateLimits;
        this.retryConfig = retryConfig;
        this.stackdriverLoggingConfig = stackdriverLoggingConfig;
        this.taskTtl = taskTtl;
        this.tombstoneTtl = tombstoneTtl;
        this.type = type;
    }

    private QueueArgs() {
        this.appEngineHttpQueue = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.rateLimits = Input.empty();
        this.retryConfig = Input.empty();
        this.stackdriverLoggingConfig = Input.empty();
        this.taskTtl = Input.empty();
        this.tombstoneTtl = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AppEngineHttpQueueArgs> appEngineHttpQueue;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<RateLimitsArgs> rateLimits;
        private @Nullable Input<RetryConfigArgs> retryConfig;
        private @Nullable Input<StackdriverLoggingConfigArgs> stackdriverLoggingConfig;
        private @Nullable Input<String> taskTtl;
        private @Nullable Input<String> tombstoneTtl;
        private @Nullable Input<QueueType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineHttpQueue = defaults.appEngineHttpQueue;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.rateLimits = defaults.rateLimits;
    	      this.retryConfig = defaults.retryConfig;
    	      this.stackdriverLoggingConfig = defaults.stackdriverLoggingConfig;
    	      this.taskTtl = defaults.taskTtl;
    	      this.tombstoneTtl = defaults.tombstoneTtl;
    	      this.type = defaults.type;
        }

        public Builder setAppEngineHttpQueue(@Nullable Input<AppEngineHttpQueueArgs> appEngineHttpQueue) {
            this.appEngineHttpQueue = appEngineHttpQueue;
            return this;
        }

        public Builder setAppEngineHttpQueue(@Nullable AppEngineHttpQueueArgs appEngineHttpQueue) {
            this.appEngineHttpQueue = Input.ofNullable(appEngineHttpQueue);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRateLimits(@Nullable Input<RateLimitsArgs> rateLimits) {
            this.rateLimits = rateLimits;
            return this;
        }

        public Builder setRateLimits(@Nullable RateLimitsArgs rateLimits) {
            this.rateLimits = Input.ofNullable(rateLimits);
            return this;
        }

        public Builder setRetryConfig(@Nullable Input<RetryConfigArgs> retryConfig) {
            this.retryConfig = retryConfig;
            return this;
        }

        public Builder setRetryConfig(@Nullable RetryConfigArgs retryConfig) {
            this.retryConfig = Input.ofNullable(retryConfig);
            return this;
        }

        public Builder setStackdriverLoggingConfig(@Nullable Input<StackdriverLoggingConfigArgs> stackdriverLoggingConfig) {
            this.stackdriverLoggingConfig = stackdriverLoggingConfig;
            return this;
        }

        public Builder setStackdriverLoggingConfig(@Nullable StackdriverLoggingConfigArgs stackdriverLoggingConfig) {
            this.stackdriverLoggingConfig = Input.ofNullable(stackdriverLoggingConfig);
            return this;
        }

        public Builder setTaskTtl(@Nullable Input<String> taskTtl) {
            this.taskTtl = taskTtl;
            return this;
        }

        public Builder setTaskTtl(@Nullable String taskTtl) {
            this.taskTtl = Input.ofNullable(taskTtl);
            return this;
        }

        public Builder setTombstoneTtl(@Nullable Input<String> tombstoneTtl) {
            this.tombstoneTtl = tombstoneTtl;
            return this;
        }

        public Builder setTombstoneTtl(@Nullable String tombstoneTtl) {
            this.tombstoneTtl = Input.ofNullable(tombstoneTtl);
            return this;
        }

        public Builder setType(@Nullable Input<QueueType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable QueueType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public QueueArgs build() {
            return new QueueArgs(appEngineHttpQueue, location, name, project, rateLimits, retryConfig, stackdriverLoggingConfig, taskTtl, tombstoneTtl, type);
        }
    }
}
