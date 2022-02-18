// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The part of the time to keep.
     * 
     */
    @EnumType
    public enum GooglePrivacyDlpV2TimePartConfigPartToExtract {
        /**
         * Unused
         * 
         */
        TimePartUnspecified("TIME_PART_UNSPECIFIED"),
        /**
         * [0-9999]
         * 
         */
        Year("YEAR"),
        /**
         * [1-12]
         * 
         */
        Month("MONTH"),
        /**
         * [1-31]
         * 
         */
        DayOfMonth("DAY_OF_MONTH"),
        /**
         * [1-7]
         * 
         */
        DayOfWeek("DAY_OF_WEEK"),
        /**
         * [1-53]
         * 
         */
        WeekOfYear("WEEK_OF_YEAR"),
        /**
         * [0-23]
         * 
         */
        HourOfDay("HOUR_OF_DAY");

        private final String value;

        GooglePrivacyDlpV2TimePartConfigPartToExtract(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GooglePrivacyDlpV2TimePartConfigPartToExtract[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
