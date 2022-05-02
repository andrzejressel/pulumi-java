// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lambda;

import com.pulumi.awsnative.lambda.enums.EventSourceMappingFunctionResponseTypesItem;
import com.pulumi.awsnative.lambda.inputs.EventSourceMappingDestinationConfigArgs;
import com.pulumi.awsnative.lambda.inputs.EventSourceMappingFilterCriteriaArgs;
import com.pulumi.awsnative.lambda.inputs.EventSourceMappingSelfManagedEventSourceArgs;
import com.pulumi.awsnative.lambda.inputs.EventSourceMappingSourceAccessConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventSourceMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventSourceMappingArgs Empty = new EventSourceMappingArgs();

    /**
     * The maximum number of items to retrieve in a single batch.
     * 
     */
    @Import(name="batchSize")
    private @Nullable Output<Integer> batchSize;

    /**
     * @return The maximum number of items to retrieve in a single batch.
     * 
     */
    public Optional<Output<Integer>> batchSize() {
        return Optional.ofNullable(this.batchSize);
    }

    /**
     * (Streams) If the function returns an error, split the batch in two and retry.
     * 
     */
    @Import(name="bisectBatchOnFunctionError")
    private @Nullable Output<Boolean> bisectBatchOnFunctionError;

    /**
     * @return (Streams) If the function returns an error, split the batch in two and retry.
     * 
     */
    public Optional<Output<Boolean>> bisectBatchOnFunctionError() {
        return Optional.ofNullable(this.bisectBatchOnFunctionError);
    }

    /**
     * (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     * 
     */
    @Import(name="destinationConfig")
    private @Nullable Output<EventSourceMappingDestinationConfigArgs> destinationConfig;

    /**
     * @return (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     * 
     */
    public Optional<Output<EventSourceMappingDestinationConfigArgs>> destinationConfig() {
        return Optional.ofNullable(this.destinationConfig);
    }

    /**
     * Disables the event source mapping to pause polling and invocation.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Disables the event source mapping to pause polling and invocation.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The Amazon Resource Name (ARN) of the event source.
     * 
     */
    @Import(name="eventSourceArn")
    private @Nullable Output<String> eventSourceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the event source.
     * 
     */
    public Optional<Output<String>> eventSourceArn() {
        return Optional.ofNullable(this.eventSourceArn);
    }

    /**
     * The filter criteria to control event filtering.
     * 
     */
    @Import(name="filterCriteria")
    private @Nullable Output<EventSourceMappingFilterCriteriaArgs> filterCriteria;

    /**
     * @return The filter criteria to control event filtering.
     * 
     */
    public Optional<Output<EventSourceMappingFilterCriteriaArgs>> filterCriteria() {
        return Optional.ofNullable(this.filterCriteria);
    }

    /**
     * The name of the Lambda function.
     * 
     */
    @Import(name="functionName", required=true)
    private Output<String> functionName;

    /**
     * @return The name of the Lambda function.
     * 
     */
    public Output<String> functionName() {
        return this.functionName;
    }

    /**
     * (Streams) A list of response types supported by the function.
     * 
     */
    @Import(name="functionResponseTypes")
    private @Nullable Output<List<EventSourceMappingFunctionResponseTypesItem>> functionResponseTypes;

    /**
     * @return (Streams) A list of response types supported by the function.
     * 
     */
    public Optional<Output<List<EventSourceMappingFunctionResponseTypesItem>>> functionResponseTypes() {
        return Optional.ofNullable(this.functionResponseTypes);
    }

    /**
     * (Streams) The maximum amount of time to gather records before invoking the function, in seconds.
     * 
     */
    @Import(name="maximumBatchingWindowInSeconds")
    private @Nullable Output<Integer> maximumBatchingWindowInSeconds;

    /**
     * @return (Streams) The maximum amount of time to gather records before invoking the function, in seconds.
     * 
     */
    public Optional<Output<Integer>> maximumBatchingWindowInSeconds() {
        return Optional.ofNullable(this.maximumBatchingWindowInSeconds);
    }

    /**
     * (Streams) The maximum age of a record that Lambda sends to a function for processing.
     * 
     */
    @Import(name="maximumRecordAgeInSeconds")
    private @Nullable Output<Integer> maximumRecordAgeInSeconds;

    /**
     * @return (Streams) The maximum age of a record that Lambda sends to a function for processing.
     * 
     */
    public Optional<Output<Integer>> maximumRecordAgeInSeconds() {
        return Optional.ofNullable(this.maximumRecordAgeInSeconds);
    }

    /**
     * (Streams) The maximum number of times to retry when the function returns an error.
     * 
     */
    @Import(name="maximumRetryAttempts")
    private @Nullable Output<Integer> maximumRetryAttempts;

    /**
     * @return (Streams) The maximum number of times to retry when the function returns an error.
     * 
     */
    public Optional<Output<Integer>> maximumRetryAttempts() {
        return Optional.ofNullable(this.maximumRetryAttempts);
    }

    /**
     * (Streams) The number of batches to process from each shard concurrently.
     * 
     */
    @Import(name="parallelizationFactor")
    private @Nullable Output<Integer> parallelizationFactor;

    /**
     * @return (Streams) The number of batches to process from each shard concurrently.
     * 
     */
    public Optional<Output<Integer>> parallelizationFactor() {
        return Optional.ofNullable(this.parallelizationFactor);
    }

    /**
     * (ActiveMQ) A list of ActiveMQ queues.
     * 
     */
    @Import(name="queues")
    private @Nullable Output<List<String>> queues;

    /**
     * @return (ActiveMQ) A list of ActiveMQ queues.
     * 
     */
    public Optional<Output<List<String>>> queues() {
        return Optional.ofNullable(this.queues);
    }

    /**
     * Self-managed event source endpoints.
     * 
     */
    @Import(name="selfManagedEventSource")
    private @Nullable Output<EventSourceMappingSelfManagedEventSourceArgs> selfManagedEventSource;

    /**
     * @return Self-managed event source endpoints.
     * 
     */
    public Optional<Output<EventSourceMappingSelfManagedEventSourceArgs>> selfManagedEventSource() {
        return Optional.ofNullable(this.selfManagedEventSource);
    }

    /**
     * A list of SourceAccessConfiguration.
     * 
     */
    @Import(name="sourceAccessConfigurations")
    private @Nullable Output<List<EventSourceMappingSourceAccessConfigurationArgs>> sourceAccessConfigurations;

    /**
     * @return A list of SourceAccessConfiguration.
     * 
     */
    public Optional<Output<List<EventSourceMappingSourceAccessConfigurationArgs>>> sourceAccessConfigurations() {
        return Optional.ofNullable(this.sourceAccessConfigurations);
    }

    /**
     * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams sources.
     * 
     */
    @Import(name="startingPosition")
    private @Nullable Output<String> startingPosition;

    /**
     * @return The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams sources.
     * 
     */
    public Optional<Output<String>> startingPosition() {
        return Optional.ofNullable(this.startingPosition);
    }

    /**
     * With StartingPosition set to AT_TIMESTAMP, the time from which to start reading, in Unix time seconds.
     * 
     */
    @Import(name="startingPositionTimestamp")
    private @Nullable Output<Double> startingPositionTimestamp;

    /**
     * @return With StartingPosition set to AT_TIMESTAMP, the time from which to start reading, in Unix time seconds.
     * 
     */
    public Optional<Output<Double>> startingPositionTimestamp() {
        return Optional.ofNullable(this.startingPositionTimestamp);
    }

    /**
     * (Kafka) A list of Kafka topics.
     * 
     */
    @Import(name="topics")
    private @Nullable Output<List<String>> topics;

    /**
     * @return (Kafka) A list of Kafka topics.
     * 
     */
    public Optional<Output<List<String>>> topics() {
        return Optional.ofNullable(this.topics);
    }

    /**
     * (Streams) Tumbling window (non-overlapping time window) duration to perform aggregations.
     * 
     */
    @Import(name="tumblingWindowInSeconds")
    private @Nullable Output<Integer> tumblingWindowInSeconds;

    /**
     * @return (Streams) Tumbling window (non-overlapping time window) duration to perform aggregations.
     * 
     */
    public Optional<Output<Integer>> tumblingWindowInSeconds() {
        return Optional.ofNullable(this.tumblingWindowInSeconds);
    }

    private EventSourceMappingArgs() {}

    private EventSourceMappingArgs(EventSourceMappingArgs $) {
        this.batchSize = $.batchSize;
        this.bisectBatchOnFunctionError = $.bisectBatchOnFunctionError;
        this.destinationConfig = $.destinationConfig;
        this.enabled = $.enabled;
        this.eventSourceArn = $.eventSourceArn;
        this.filterCriteria = $.filterCriteria;
        this.functionName = $.functionName;
        this.functionResponseTypes = $.functionResponseTypes;
        this.maximumBatchingWindowInSeconds = $.maximumBatchingWindowInSeconds;
        this.maximumRecordAgeInSeconds = $.maximumRecordAgeInSeconds;
        this.maximumRetryAttempts = $.maximumRetryAttempts;
        this.parallelizationFactor = $.parallelizationFactor;
        this.queues = $.queues;
        this.selfManagedEventSource = $.selfManagedEventSource;
        this.sourceAccessConfigurations = $.sourceAccessConfigurations;
        this.startingPosition = $.startingPosition;
        this.startingPositionTimestamp = $.startingPositionTimestamp;
        this.topics = $.topics;
        this.tumblingWindowInSeconds = $.tumblingWindowInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventSourceMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventSourceMappingArgs $;

        public Builder() {
            $ = new EventSourceMappingArgs();
        }

        public Builder(EventSourceMappingArgs defaults) {
            $ = new EventSourceMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param batchSize The maximum number of items to retrieve in a single batch.
         * 
         * @return builder
         * 
         */
        public Builder batchSize(@Nullable Output<Integer> batchSize) {
            $.batchSize = batchSize;
            return this;
        }

        /**
         * @param batchSize The maximum number of items to retrieve in a single batch.
         * 
         * @return builder
         * 
         */
        public Builder batchSize(Integer batchSize) {
            return batchSize(Output.of(batchSize));
        }

        /**
         * @param bisectBatchOnFunctionError (Streams) If the function returns an error, split the batch in two and retry.
         * 
         * @return builder
         * 
         */
        public Builder bisectBatchOnFunctionError(@Nullable Output<Boolean> bisectBatchOnFunctionError) {
            $.bisectBatchOnFunctionError = bisectBatchOnFunctionError;
            return this;
        }

        /**
         * @param bisectBatchOnFunctionError (Streams) If the function returns an error, split the batch in two and retry.
         * 
         * @return builder
         * 
         */
        public Builder bisectBatchOnFunctionError(Boolean bisectBatchOnFunctionError) {
            return bisectBatchOnFunctionError(Output.of(bisectBatchOnFunctionError));
        }

        /**
         * @param destinationConfig (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
         * 
         * @return builder
         * 
         */
        public Builder destinationConfig(@Nullable Output<EventSourceMappingDestinationConfigArgs> destinationConfig) {
            $.destinationConfig = destinationConfig;
            return this;
        }

        /**
         * @param destinationConfig (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
         * 
         * @return builder
         * 
         */
        public Builder destinationConfig(EventSourceMappingDestinationConfigArgs destinationConfig) {
            return destinationConfig(Output.of(destinationConfig));
        }

        /**
         * @param enabled Disables the event source mapping to pause polling and invocation.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Disables the event source mapping to pause polling and invocation.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param eventSourceArn The Amazon Resource Name (ARN) of the event source.
         * 
         * @return builder
         * 
         */
        public Builder eventSourceArn(@Nullable Output<String> eventSourceArn) {
            $.eventSourceArn = eventSourceArn;
            return this;
        }

        /**
         * @param eventSourceArn The Amazon Resource Name (ARN) of the event source.
         * 
         * @return builder
         * 
         */
        public Builder eventSourceArn(String eventSourceArn) {
            return eventSourceArn(Output.of(eventSourceArn));
        }

        /**
         * @param filterCriteria The filter criteria to control event filtering.
         * 
         * @return builder
         * 
         */
        public Builder filterCriteria(@Nullable Output<EventSourceMappingFilterCriteriaArgs> filterCriteria) {
            $.filterCriteria = filterCriteria;
            return this;
        }

        /**
         * @param filterCriteria The filter criteria to control event filtering.
         * 
         * @return builder
         * 
         */
        public Builder filterCriteria(EventSourceMappingFilterCriteriaArgs filterCriteria) {
            return filterCriteria(Output.of(filterCriteria));
        }

        /**
         * @param functionName The name of the Lambda function.
         * 
         * @return builder
         * 
         */
        public Builder functionName(Output<String> functionName) {
            $.functionName = functionName;
            return this;
        }

        /**
         * @param functionName The name of the Lambda function.
         * 
         * @return builder
         * 
         */
        public Builder functionName(String functionName) {
            return functionName(Output.of(functionName));
        }

        /**
         * @param functionResponseTypes (Streams) A list of response types supported by the function.
         * 
         * @return builder
         * 
         */
        public Builder functionResponseTypes(@Nullable Output<List<EventSourceMappingFunctionResponseTypesItem>> functionResponseTypes) {
            $.functionResponseTypes = functionResponseTypes;
            return this;
        }

        /**
         * @param functionResponseTypes (Streams) A list of response types supported by the function.
         * 
         * @return builder
         * 
         */
        public Builder functionResponseTypes(List<EventSourceMappingFunctionResponseTypesItem> functionResponseTypes) {
            return functionResponseTypes(Output.of(functionResponseTypes));
        }

        /**
         * @param functionResponseTypes (Streams) A list of response types supported by the function.
         * 
         * @return builder
         * 
         */
        public Builder functionResponseTypes(EventSourceMappingFunctionResponseTypesItem... functionResponseTypes) {
            return functionResponseTypes(List.of(functionResponseTypes));
        }

        /**
         * @param maximumBatchingWindowInSeconds (Streams) The maximum amount of time to gather records before invoking the function, in seconds.
         * 
         * @return builder
         * 
         */
        public Builder maximumBatchingWindowInSeconds(@Nullable Output<Integer> maximumBatchingWindowInSeconds) {
            $.maximumBatchingWindowInSeconds = maximumBatchingWindowInSeconds;
            return this;
        }

        /**
         * @param maximumBatchingWindowInSeconds (Streams) The maximum amount of time to gather records before invoking the function, in seconds.
         * 
         * @return builder
         * 
         */
        public Builder maximumBatchingWindowInSeconds(Integer maximumBatchingWindowInSeconds) {
            return maximumBatchingWindowInSeconds(Output.of(maximumBatchingWindowInSeconds));
        }

        /**
         * @param maximumRecordAgeInSeconds (Streams) The maximum age of a record that Lambda sends to a function for processing.
         * 
         * @return builder
         * 
         */
        public Builder maximumRecordAgeInSeconds(@Nullable Output<Integer> maximumRecordAgeInSeconds) {
            $.maximumRecordAgeInSeconds = maximumRecordAgeInSeconds;
            return this;
        }

        /**
         * @param maximumRecordAgeInSeconds (Streams) The maximum age of a record that Lambda sends to a function for processing.
         * 
         * @return builder
         * 
         */
        public Builder maximumRecordAgeInSeconds(Integer maximumRecordAgeInSeconds) {
            return maximumRecordAgeInSeconds(Output.of(maximumRecordAgeInSeconds));
        }

        /**
         * @param maximumRetryAttempts (Streams) The maximum number of times to retry when the function returns an error.
         * 
         * @return builder
         * 
         */
        public Builder maximumRetryAttempts(@Nullable Output<Integer> maximumRetryAttempts) {
            $.maximumRetryAttempts = maximumRetryAttempts;
            return this;
        }

        /**
         * @param maximumRetryAttempts (Streams) The maximum number of times to retry when the function returns an error.
         * 
         * @return builder
         * 
         */
        public Builder maximumRetryAttempts(Integer maximumRetryAttempts) {
            return maximumRetryAttempts(Output.of(maximumRetryAttempts));
        }

        /**
         * @param parallelizationFactor (Streams) The number of batches to process from each shard concurrently.
         * 
         * @return builder
         * 
         */
        public Builder parallelizationFactor(@Nullable Output<Integer> parallelizationFactor) {
            $.parallelizationFactor = parallelizationFactor;
            return this;
        }

        /**
         * @param parallelizationFactor (Streams) The number of batches to process from each shard concurrently.
         * 
         * @return builder
         * 
         */
        public Builder parallelizationFactor(Integer parallelizationFactor) {
            return parallelizationFactor(Output.of(parallelizationFactor));
        }

        /**
         * @param queues (ActiveMQ) A list of ActiveMQ queues.
         * 
         * @return builder
         * 
         */
        public Builder queues(@Nullable Output<List<String>> queues) {
            $.queues = queues;
            return this;
        }

        /**
         * @param queues (ActiveMQ) A list of ActiveMQ queues.
         * 
         * @return builder
         * 
         */
        public Builder queues(List<String> queues) {
            return queues(Output.of(queues));
        }

        /**
         * @param queues (ActiveMQ) A list of ActiveMQ queues.
         * 
         * @return builder
         * 
         */
        public Builder queues(String... queues) {
            return queues(List.of(queues));
        }

        /**
         * @param selfManagedEventSource Self-managed event source endpoints.
         * 
         * @return builder
         * 
         */
        public Builder selfManagedEventSource(@Nullable Output<EventSourceMappingSelfManagedEventSourceArgs> selfManagedEventSource) {
            $.selfManagedEventSource = selfManagedEventSource;
            return this;
        }

        /**
         * @param selfManagedEventSource Self-managed event source endpoints.
         * 
         * @return builder
         * 
         */
        public Builder selfManagedEventSource(EventSourceMappingSelfManagedEventSourceArgs selfManagedEventSource) {
            return selfManagedEventSource(Output.of(selfManagedEventSource));
        }

        /**
         * @param sourceAccessConfigurations A list of SourceAccessConfiguration.
         * 
         * @return builder
         * 
         */
        public Builder sourceAccessConfigurations(@Nullable Output<List<EventSourceMappingSourceAccessConfigurationArgs>> sourceAccessConfigurations) {
            $.sourceAccessConfigurations = sourceAccessConfigurations;
            return this;
        }

        /**
         * @param sourceAccessConfigurations A list of SourceAccessConfiguration.
         * 
         * @return builder
         * 
         */
        public Builder sourceAccessConfigurations(List<EventSourceMappingSourceAccessConfigurationArgs> sourceAccessConfigurations) {
            return sourceAccessConfigurations(Output.of(sourceAccessConfigurations));
        }

        /**
         * @param sourceAccessConfigurations A list of SourceAccessConfiguration.
         * 
         * @return builder
         * 
         */
        public Builder sourceAccessConfigurations(EventSourceMappingSourceAccessConfigurationArgs... sourceAccessConfigurations) {
            return sourceAccessConfigurations(List.of(sourceAccessConfigurations));
        }

        /**
         * @param startingPosition The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams sources.
         * 
         * @return builder
         * 
         */
        public Builder startingPosition(@Nullable Output<String> startingPosition) {
            $.startingPosition = startingPosition;
            return this;
        }

        /**
         * @param startingPosition The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams sources.
         * 
         * @return builder
         * 
         */
        public Builder startingPosition(String startingPosition) {
            return startingPosition(Output.of(startingPosition));
        }

        /**
         * @param startingPositionTimestamp With StartingPosition set to AT_TIMESTAMP, the time from which to start reading, in Unix time seconds.
         * 
         * @return builder
         * 
         */
        public Builder startingPositionTimestamp(@Nullable Output<Double> startingPositionTimestamp) {
            $.startingPositionTimestamp = startingPositionTimestamp;
            return this;
        }

        /**
         * @param startingPositionTimestamp With StartingPosition set to AT_TIMESTAMP, the time from which to start reading, in Unix time seconds.
         * 
         * @return builder
         * 
         */
        public Builder startingPositionTimestamp(Double startingPositionTimestamp) {
            return startingPositionTimestamp(Output.of(startingPositionTimestamp));
        }

        /**
         * @param topics (Kafka) A list of Kafka topics.
         * 
         * @return builder
         * 
         */
        public Builder topics(@Nullable Output<List<String>> topics) {
            $.topics = topics;
            return this;
        }

        /**
         * @param topics (Kafka) A list of Kafka topics.
         * 
         * @return builder
         * 
         */
        public Builder topics(List<String> topics) {
            return topics(Output.of(topics));
        }

        /**
         * @param topics (Kafka) A list of Kafka topics.
         * 
         * @return builder
         * 
         */
        public Builder topics(String... topics) {
            return topics(List.of(topics));
        }

        /**
         * @param tumblingWindowInSeconds (Streams) Tumbling window (non-overlapping time window) duration to perform aggregations.
         * 
         * @return builder
         * 
         */
        public Builder tumblingWindowInSeconds(@Nullable Output<Integer> tumblingWindowInSeconds) {
            $.tumblingWindowInSeconds = tumblingWindowInSeconds;
            return this;
        }

        /**
         * @param tumblingWindowInSeconds (Streams) Tumbling window (non-overlapping time window) duration to perform aggregations.
         * 
         * @return builder
         * 
         */
        public Builder tumblingWindowInSeconds(Integer tumblingWindowInSeconds) {
            return tumblingWindowInSeconds(Output.of(tumblingWindowInSeconds));
        }

        public EventSourceMappingArgs build() {
            $.functionName = Objects.requireNonNull($.functionName, "expected parameter 'functionName' to be non-null");
            return $;
        }
    }

}
