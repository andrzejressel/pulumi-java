// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The complexity of the password.
     * 
     */
    @EnumType
    public enum PasswordValidationPolicyComplexity {
        /**
         * Complexity check is not specified.
         * 
         */
        ComplexityUnspecified("COMPLEXITY_UNSPECIFIED"),
        /**
         * A combination of lowercase, uppercase, numeric, and non-alphanumeric characters.
         * 
         */
        ComplexityDefault("COMPLEXITY_DEFAULT");

        private final String value;

        PasswordValidationPolicyComplexity(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PasswordValidationPolicyComplexity[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
