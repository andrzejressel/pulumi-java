// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudwatch.outputs;

import com.pulumi.awsnative.cloudwatch.outputs.MetricStreamFilter;
import com.pulumi.awsnative.cloudwatch.outputs.MetricStreamStatisticsConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMetricStreamResult {
    /**
     * @return Amazon Resource Name of the metric stream.
     * 
     */
    private final @Nullable String arn;
    /**
     * @return The date of creation of the metric stream.
     * 
     */
    private final @Nullable String creationDate;
    /**
     * @return Define which metrics will be not streamed. Metrics matched by multiple instances of MetricStreamFilter are joined with an OR operation by default. If both IncludeFilters and ExcludeFilters are omitted, all metrics in the account will be streamed. IncludeFilters and ExcludeFilters are mutually exclusive. Default to null.
     * 
     */
    private final @Nullable List<MetricStreamFilter> excludeFilters;
    /**
     * @return The ARN of the Kinesis Firehose where to stream the data.
     * 
     */
    private final @Nullable String firehoseArn;
    /**
     * @return Define which metrics will be streamed. Metrics matched by multiple instances of MetricStreamFilter are joined with an OR operation by default. If both IncludeFilters and ExcludeFilters are omitted, all metrics in the account will be streamed. IncludeFilters and ExcludeFilters are mutually exclusive. Default to null.
     * 
     */
    private final @Nullable List<MetricStreamFilter> includeFilters;
    /**
     * @return The date of the last update of the metric stream.
     * 
     */
    private final @Nullable String lastUpdateDate;
    /**
     * @return The output format of the data streamed to the Kinesis Firehose.
     * 
     */
    private final @Nullable String outputFormat;
    /**
     * @return The ARN of the role that provides access to the Kinesis Firehose.
     * 
     */
    private final @Nullable String roleArn;
    /**
     * @return Displays the state of the Metric Stream.
     * 
     */
    private final @Nullable String state;
    /**
     * @return By default, a metric stream always sends the MAX, MIN, SUM, and SAMPLECOUNT statistics for each metric that is streamed. You can use this parameter to have the metric stream also send additional statistics in the stream. This array can have up to 100 members.
     * 
     */
    private final @Nullable List<MetricStreamStatisticsConfiguration> statisticsConfigurations;

    @CustomType.Constructor
    private GetMetricStreamResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("creationDate") @Nullable String creationDate,
        @CustomType.Parameter("excludeFilters") @Nullable List<MetricStreamFilter> excludeFilters,
        @CustomType.Parameter("firehoseArn") @Nullable String firehoseArn,
        @CustomType.Parameter("includeFilters") @Nullable List<MetricStreamFilter> includeFilters,
        @CustomType.Parameter("lastUpdateDate") @Nullable String lastUpdateDate,
        @CustomType.Parameter("outputFormat") @Nullable String outputFormat,
        @CustomType.Parameter("roleArn") @Nullable String roleArn,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("statisticsConfigurations") @Nullable List<MetricStreamStatisticsConfiguration> statisticsConfigurations) {
        this.arn = arn;
        this.creationDate = creationDate;
        this.excludeFilters = excludeFilters;
        this.firehoseArn = firehoseArn;
        this.includeFilters = includeFilters;
        this.lastUpdateDate = lastUpdateDate;
        this.outputFormat = outputFormat;
        this.roleArn = roleArn;
        this.state = state;
        this.statisticsConfigurations = statisticsConfigurations;
    }

    /**
     * @return Amazon Resource Name of the metric stream.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return The date of creation of the metric stream.
     * 
     */
    public Optional<String> creationDate() {
        return Optional.ofNullable(this.creationDate);
    }
    /**
     * @return Define which metrics will be not streamed. Metrics matched by multiple instances of MetricStreamFilter are joined with an OR operation by default. If both IncludeFilters and ExcludeFilters are omitted, all metrics in the account will be streamed. IncludeFilters and ExcludeFilters are mutually exclusive. Default to null.
     * 
     */
    public List<MetricStreamFilter> excludeFilters() {
        return this.excludeFilters == null ? List.of() : this.excludeFilters;
    }
    /**
     * @return The ARN of the Kinesis Firehose where to stream the data.
     * 
     */
    public Optional<String> firehoseArn() {
        return Optional.ofNullable(this.firehoseArn);
    }
    /**
     * @return Define which metrics will be streamed. Metrics matched by multiple instances of MetricStreamFilter are joined with an OR operation by default. If both IncludeFilters and ExcludeFilters are omitted, all metrics in the account will be streamed. IncludeFilters and ExcludeFilters are mutually exclusive. Default to null.
     * 
     */
    public List<MetricStreamFilter> includeFilters() {
        return this.includeFilters == null ? List.of() : this.includeFilters;
    }
    /**
     * @return The date of the last update of the metric stream.
     * 
     */
    public Optional<String> lastUpdateDate() {
        return Optional.ofNullable(this.lastUpdateDate);
    }
    /**
     * @return The output format of the data streamed to the Kinesis Firehose.
     * 
     */
    public Optional<String> outputFormat() {
        return Optional.ofNullable(this.outputFormat);
    }
    /**
     * @return The ARN of the role that provides access to the Kinesis Firehose.
     * 
     */
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * @return Displays the state of the Metric Stream.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return By default, a metric stream always sends the MAX, MIN, SUM, and SAMPLECOUNT statistics for each metric that is streamed. You can use this parameter to have the metric stream also send additional statistics in the stream. This array can have up to 100 members.
     * 
     */
    public List<MetricStreamStatisticsConfiguration> statisticsConfigurations() {
        return this.statisticsConfigurations == null ? List.of() : this.statisticsConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetricStreamResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String creationDate;
        private @Nullable List<MetricStreamFilter> excludeFilters;
        private @Nullable String firehoseArn;
        private @Nullable List<MetricStreamFilter> includeFilters;
        private @Nullable String lastUpdateDate;
        private @Nullable String outputFormat;
        private @Nullable String roleArn;
        private @Nullable String state;
        private @Nullable List<MetricStreamStatisticsConfiguration> statisticsConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMetricStreamResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.creationDate = defaults.creationDate;
    	      this.excludeFilters = defaults.excludeFilters;
    	      this.firehoseArn = defaults.firehoseArn;
    	      this.includeFilters = defaults.includeFilters;
    	      this.lastUpdateDate = defaults.lastUpdateDate;
    	      this.outputFormat = defaults.outputFormat;
    	      this.roleArn = defaults.roleArn;
    	      this.state = defaults.state;
    	      this.statisticsConfigurations = defaults.statisticsConfigurations;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder creationDate(@Nullable String creationDate) {
            this.creationDate = creationDate;
            return this;
        }
        public Builder excludeFilters(@Nullable List<MetricStreamFilter> excludeFilters) {
            this.excludeFilters = excludeFilters;
            return this;
        }
        public Builder excludeFilters(MetricStreamFilter... excludeFilters) {
            return excludeFilters(List.of(excludeFilters));
        }
        public Builder firehoseArn(@Nullable String firehoseArn) {
            this.firehoseArn = firehoseArn;
            return this;
        }
        public Builder includeFilters(@Nullable List<MetricStreamFilter> includeFilters) {
            this.includeFilters = includeFilters;
            return this;
        }
        public Builder includeFilters(MetricStreamFilter... includeFilters) {
            return includeFilters(List.of(includeFilters));
        }
        public Builder lastUpdateDate(@Nullable String lastUpdateDate) {
            this.lastUpdateDate = lastUpdateDate;
            return this;
        }
        public Builder outputFormat(@Nullable String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder statisticsConfigurations(@Nullable List<MetricStreamStatisticsConfiguration> statisticsConfigurations) {
            this.statisticsConfigurations = statisticsConfigurations;
            return this;
        }
        public Builder statisticsConfigurations(MetricStreamStatisticsConfiguration... statisticsConfigurations) {
            return statisticsConfigurations(List.of(statisticsConfigurations));
        }        public GetMetricStreamResult build() {
            return new GetMetricStreamResult(arn, creationDate, excludeFilters, firehoseArn, includeFilters, lastUpdateDate, outputFormat, roleArn, state, statisticsConfigurations);
        }
    }
}
