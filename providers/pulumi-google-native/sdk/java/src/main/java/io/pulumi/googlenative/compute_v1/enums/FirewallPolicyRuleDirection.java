// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The direction in which this rule applies.
     * 
     */
    @EnumType
    public enum FirewallPolicyRuleDirection {
        Egress("EGRESS"),
        Ingress("INGRESS");

        private final String value;

        FirewallPolicyRuleDirection(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FirewallPolicyRuleDirection[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
