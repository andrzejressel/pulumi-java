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
    public enum ConditionIam {
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        Approver("APPROVER"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        Attribution("ATTRIBUTION"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        Authority("AUTHORITY"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        CredentialsType("CREDENTIALS_TYPE"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        CredsAssertion("CREDS_ASSERTION"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        JustificationType("JUSTIFICATION_TYPE"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        NoAttr("NO_ATTR"),
        /**
         * This is deprecated and has no effect. Do not use.
         * 
         */
        SecurityRealm("SECURITY_REALM");

        private final String value;

        ConditionIam(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ConditionIam[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
