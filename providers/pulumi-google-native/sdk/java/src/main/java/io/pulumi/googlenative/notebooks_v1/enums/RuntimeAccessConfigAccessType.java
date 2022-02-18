// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of access mode this instance.
     * 
     */
    @EnumType
    public enum RuntimeAccessConfigAccessType {
        /**
         * Unspecified access.
         * 
         */
        RuntimeAccessTypeUnspecified("RUNTIME_ACCESS_TYPE_UNSPECIFIED"),
        /**
         * Single user login.
         * 
         */
        SingleUser("SINGLE_USER");

        private final String value;

        RuntimeAccessConfigAccessType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RuntimeAccessConfigAccessType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
