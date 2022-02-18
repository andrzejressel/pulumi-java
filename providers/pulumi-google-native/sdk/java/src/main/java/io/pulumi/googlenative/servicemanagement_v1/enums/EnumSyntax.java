// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The source syntax.
     * 
     */
    @EnumType
    public enum EnumSyntax {
        /**
         * Syntax `proto2`.
         * 
         */
        SyntaxProto2("SYNTAX_PROTO2"),
        /**
         * Syntax `proto3`.
         * 
         */
        SyntaxProto3("SYNTAX_PROTO3");

        private final String value;

        EnumSyntax(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EnumSyntax[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
