// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @EnumType
    public enum RuleAction {
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        Allow("ALLOW"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        AllowWithLog("ALLOW_WITH_LOG"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        Deny("DENY"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        DenyWithLog("DENY_WITH_LOG"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        Log("LOG"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        NoAction("NO_ACTION");

        private final String value;

        RuleAction(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RuleAction[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
