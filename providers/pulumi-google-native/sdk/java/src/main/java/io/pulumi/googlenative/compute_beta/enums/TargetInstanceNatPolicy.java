// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * NAT option controlling how IPs are NAT'ed to the instance. Currently only NO_NAT (default value) is supported.
     * 
     */
    @EnumType
    public enum TargetInstanceNatPolicy {
        /**
         * No NAT performed.
         * 
         */
        NoNat("NO_NAT");

        private final String value;

        TargetInstanceNatPolicy(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TargetInstanceNatPolicy[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
