// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. Toggles the aggregation interval for collecting flow logs. Increasing the interval time will reduce the amount of generated flow logs for long lasting connections. Default is an interval of 5 seconds per connection.
     * 
     */
    @EnumType
    public enum SubnetworkLogConfigAggregationInterval {
        Interval10Min("INTERVAL_10_MIN"),
        Interval15Min("INTERVAL_15_MIN"),
        Interval1Min("INTERVAL_1_MIN"),
        Interval30Sec("INTERVAL_30_SEC"),
        Interval5Min("INTERVAL_5_MIN"),
        Interval5Sec("INTERVAL_5_SEC");

        private final String value;

        SubnetworkLogConfigAggregationInterval(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SubnetworkLogConfigAggregationInterval[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
