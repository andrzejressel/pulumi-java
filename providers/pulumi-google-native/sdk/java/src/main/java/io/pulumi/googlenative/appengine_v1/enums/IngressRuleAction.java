// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The action to take on matched requests.
     * 
     */
    @EnumType
    public enum IngressRuleAction {
        UnspecifiedAction("UNSPECIFIED_ACTION"),
        /**
         * Matching requests are allowed.
         * 
         */
        Allow("ALLOW"),
        /**
         * Matching requests are denied.
         * 
         */
        Deny("DENY");

        private final String value;

        IngressRuleAction(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "IngressRuleAction[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
