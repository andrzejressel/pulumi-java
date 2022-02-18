// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Defines how target utilization value is expressed for a Stackdriver Monitoring metric. Either GAUGE, DELTA_PER_SECOND, or DELTA_PER_MINUTE.
     * 
     */
    @EnumType
    public enum AutoscalingPolicyCustomMetricUtilizationUtilizationTargetType {
        /**
         * Sets the utilization target value for a cumulative or delta metric, expressed as the rate of growth per minute.
         * 
         */
        DeltaPerMinute("DELTA_PER_MINUTE"),
        /**
         * Sets the utilization target value for a cumulative or delta metric, expressed as the rate of growth per second.
         * 
         */
        DeltaPerSecond("DELTA_PER_SECOND"),
        /**
         * Sets the utilization target value for a gauge metric. The autoscaler will collect the average utilization of the virtual machines from the last couple of minutes, and compare the value to the utilization target value to perform autoscaling.
         * 
         */
        Gauge("GAUGE");

        private final String value;

        AutoscalingPolicyCustomMetricUtilizationUtilizationTargetType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AutoscalingPolicyCustomMetricUtilizationUtilizationTargetType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
