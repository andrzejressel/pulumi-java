// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @EnumType
    public enum LogConfigDataAccessOptionsLogMode {
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        LogFailClosed("LOG_FAIL_CLOSED"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        LogModeUnspecified("LOG_MODE_UNSPECIFIED");

        private final String value;

        LogConfigDataAccessOptionsLogMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "LogConfigDataAccessOptionsLogMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
