// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The backend type. `SECOND_GEN`: Cloud SQL database instance. `EXTERNAL`: A database server that is not managed by Google. This property is read-only; use the `tier` property in the `settings` object to determine the database type.
     * 
     */
    @EnumType
    public enum InstanceBackendType {
        /**
         * This is an unknown backend type for instance.
         * 
         */
        SqlBackendTypeUnspecified("SQL_BACKEND_TYPE_UNSPECIFIED"),
        /**
         * V1 speckle instance.
         * 
         */
        FirstGen("FIRST_GEN"),
        /**
         * V2 speckle instance.
         * 
         */
        SecondGen("SECOND_GEN"),
        /**
         * On premises instance.
         * 
         */
        External("EXTERNAL");

        private final String value;

        InstanceBackendType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstanceBackendType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
