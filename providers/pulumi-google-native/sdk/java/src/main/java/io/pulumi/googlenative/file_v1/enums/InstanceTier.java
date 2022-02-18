// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.file_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The service tier of the instance.
     * 
     */
    @EnumType
    public enum InstanceTier {
        /**
         * Not set.
         * 
         */
        TierUnspecified("TIER_UNSPECIFIED"),
        /**
         * STANDARD tier.
         * 
         */
        Standard("STANDARD"),
        /**
         * PREMIUM tier.
         * 
         */
        Premium("PREMIUM"),
        /**
         * BASIC instances offer a maximum capacity of 63.9 TB. BASIC_HDD is an alias for STANDARD Tier, offering economical performance backed by HDD.
         * 
         */
        BasicHdd("BASIC_HDD"),
        /**
         * BASIC instances offer a maximum capacity of 63.9 TB. BASIC_SSD is an alias for PREMIUM Tier, and offers improved performance backed by SSD.
         * 
         */
        BasicSsd("BASIC_SSD"),
        /**
         * HIGH_SCALE instances offer expanded capacity and performance scaling capabilities.
         * 
         */
        HighScaleSsd("HIGH_SCALE_SSD"),
        /**
         * ENTERPRISE instances offer the features and availability needed for mission-critical workloads.
         * 
         */
        Enterprise("ENTERPRISE");

        private final String value;

        InstanceTier(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstanceTier[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
