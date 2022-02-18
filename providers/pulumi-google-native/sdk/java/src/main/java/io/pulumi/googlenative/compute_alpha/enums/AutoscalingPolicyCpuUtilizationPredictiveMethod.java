// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
     * 
     */
    @EnumType
    public enum AutoscalingPolicyCpuUtilizationPredictiveMethod {
        /**
         * No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics
         * 
         */
        None("NONE"),
        /**
         * Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
         * 
         */
        OptimizeAvailability("OPTIMIZE_AVAILABILITY"),
        PredictiveMethodUnspecified("PREDICTIVE_METHOD_UNSPECIFIED"),
        /**
         * Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand. This value is being DEPRECATED - it won't be promoted to beta and v1. Use OPTIMIZE_AVAILABILITY instead.
         * 
         */
        Standard("STANDARD");

        private final String value;

        AutoscalingPolicyCpuUtilizationPredictiveMethod(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AutoscalingPolicyCpuUtilizationPredictiveMethod[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
