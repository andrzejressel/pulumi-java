// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigqueryconnection_v1beta1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of the Cloud SQL database.
     * 
     */
    @EnumType
    public enum CloudSqlPropertiesType {
        /**
         * Unspecified database type.
         * 
         */
        DatabaseTypeUnspecified("DATABASE_TYPE_UNSPECIFIED"),
        /**
         * Cloud SQL for PostgreSQL.
         * 
         */
        Postgres("POSTGRES"),
        /**
         * Cloud SQL for MySQL.
         * 
         */
        Mysql("MYSQL");

        private final String value;

        CloudSqlPropertiesType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CloudSqlPropertiesType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
