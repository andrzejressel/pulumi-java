// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.monitoring.outputs.AlertPolicyConditionConditionMonitoringQueryLanguageTrigger;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AlertPolicyConditionConditionMonitoringQueryLanguage {
    /**
     * The amount of time that a time series must
     * violate the threshold to be considered
     * failing. Currently, only values that are a
     * multiple of a minute--e.g., 0, 60, 120, or
     * 300 seconds--are supported. If an invalid
     * value is given, an error will be returned.
     * When choosing a duration, it is useful to
     * keep in mind the frequency of the underlying
     * time series data (which may also be affected
     * by any alignments specified in the
     * aggregations field); a good duration is long
     * enough so that a single outlier does not
     * generate spurious alerts, but short enough
     * that unhealthy states are detected and
     * alerted on quickly.
     * 
     */
    private final String duration;
    /**
     * Monitoring Query Language query that outputs a boolean stream.
     * 
     */
    private final String query;
    /**
     * The number/percent of time series for which
     * the comparison must hold in order for the
     * condition to trigger. If unspecified, then
     * the condition will trigger if the comparison
     * is true for any of the time series that have
     * been identified by filter and aggregations,
     * or by the ratio, if denominator_filter and
     * denominator_aggregations are specified.
     * Structure is documented below.
     * 
     */
    private final @Nullable AlertPolicyConditionConditionMonitoringQueryLanguageTrigger trigger;

    @OutputCustomType.Constructor({"duration","query","trigger"})
    private AlertPolicyConditionConditionMonitoringQueryLanguage(
        String duration,
        String query,
        @Nullable AlertPolicyConditionConditionMonitoringQueryLanguageTrigger trigger) {
        this.duration = Objects.requireNonNull(duration);
        this.query = Objects.requireNonNull(query);
        this.trigger = trigger;
    }

    /**
     * The amount of time that a time series must
     * violate the threshold to be considered
     * failing. Currently, only values that are a
     * multiple of a minute--e.g., 0, 60, 120, or
     * 300 seconds--are supported. If an invalid
     * value is given, an error will be returned.
     * When choosing a duration, it is useful to
     * keep in mind the frequency of the underlying
     * time series data (which may also be affected
     * by any alignments specified in the
     * aggregations field); a good duration is long
     * enough so that a single outlier does not
     * generate spurious alerts, but short enough
     * that unhealthy states are detected and
     * alerted on quickly.
     * 
     */
    public String getDuration() {
        return this.duration;
    }
    /**
     * Monitoring Query Language query that outputs a boolean stream.
     * 
     */
    public String getQuery() {
        return this.query;
    }
    /**
     * The number/percent of time series for which
     * the comparison must hold in order for the
     * condition to trigger. If unspecified, then
     * the condition will trigger if the comparison
     * is true for any of the time series that have
     * been identified by filter and aggregations,
     * or by the ratio, if denominator_filter and
     * denominator_aggregations are specified.
     * Structure is documented below.
     * 
     */
    public Optional<AlertPolicyConditionConditionMonitoringQueryLanguageTrigger> getTrigger() {
        return Optional.ofNullable(this.trigger);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyConditionConditionMonitoringQueryLanguage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String duration;
        private String query;
        private @Nullable AlertPolicyConditionConditionMonitoringQueryLanguageTrigger trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyConditionConditionMonitoringQueryLanguage defaults) {
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

        public Builder setTrigger(@Nullable AlertPolicyConditionConditionMonitoringQueryLanguageTrigger trigger) {
            this.trigger = trigger;
            return this;
        }

        public AlertPolicyConditionConditionMonitoringQueryLanguage build() {
            return new AlertPolicyConditionConditionMonitoringQueryLanguage(duration, query, trigger);
        }
    }
}
