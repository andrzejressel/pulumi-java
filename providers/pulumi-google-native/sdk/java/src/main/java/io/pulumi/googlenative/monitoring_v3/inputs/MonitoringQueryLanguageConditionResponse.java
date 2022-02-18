// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v3.inputs.TriggerResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A condition type that allows alert policies to be defined using Monitoring Query Language (https://cloud.google.com/monitoring/mql).
 * 
 */
public final class MonitoringQueryLanguageConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final MonitoringQueryLanguageConditionResponse Empty = new MonitoringQueryLanguageConditionResponse();

    /**
     * The amount of time that a time series must violate the threshold to be considered failing. Currently, only values that are a multiple of a minute--e.g., 0, 60, 120, or 300 seconds--are supported. If an invalid value is given, an error will be returned. When choosing a duration, it is useful to keep in mind the frequency of the underlying time series data (which may also be affected by any alignments specified in the aggregations field); a good duration is long enough so that a single outlier does not generate spurious alerts, but short enough that unhealthy states are detected and alerted on quickly.
     * 
     */
    @InputImport(name="duration", required=true)
    private final String duration;

    public String getDuration() {
        return this.duration;
    }

    /**
     * Monitoring Query Language (https://cloud.google.com/monitoring/mql) query that outputs a boolean stream.
     * 
     */
    @InputImport(name="query", required=true)
    private final String query;

    public String getQuery() {
        return this.query;
    }

    /**
     * The number/percent of time series for which the comparison must hold in order for the condition to trigger. If unspecified, then the condition will trigger if the comparison is true for any of the time series that have been identified by filter and aggregations, or by the ratio, if denominator_filter and denominator_aggregations are specified.
     * 
     */
    @InputImport(name="trigger", required=true)
    private final TriggerResponse trigger;

    public TriggerResponse getTrigger() {
        return this.trigger;
    }

    public MonitoringQueryLanguageConditionResponse(
        String duration,
        String query,
        TriggerResponse trigger) {
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.trigger = Objects.requireNonNull(trigger, "expected parameter 'trigger' to be non-null");
    }

    private MonitoringQueryLanguageConditionResponse() {
        this.duration = null;
        this.query = null;
        this.trigger = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringQueryLanguageConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String duration;
        private String query;
        private TriggerResponse trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringQueryLanguageConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.query = defaults.query;
    	      this.trigger = defaults.trigger;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setQuery(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder setTrigger(TriggerResponse trigger) {
            this.trigger = Objects.requireNonNull(trigger);
            return this;
        }

        public MonitoringQueryLanguageConditionResponse build() {
            return new MonitoringQueryLanguageConditionResponse(duration, query, trigger);
        }
    }
}
