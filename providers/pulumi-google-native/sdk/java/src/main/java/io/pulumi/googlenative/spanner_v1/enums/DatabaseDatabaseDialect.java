// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.spanner_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. The dialect of the Cloud Spanner Database.
     * 
     */
    @EnumType
    public enum DatabaseDatabaseDialect {
        /**
         * Default value. This value will create a database with the GOOGLE_STANDARD_SQL dialect.
         * 
         */
        DatabaseDialectUnspecified("DATABASE_DIALECT_UNSPECIFIED"),
        /**
         * Google standard SQL.
         * 
         */
        GoogleStandardSql("GOOGLE_STANDARD_SQL"),
        /**
         * PostgreSQL supported SQL.
         * 
         */
        Postgresql("POSTGRESQL");

        private final String value;

        DatabaseDatabaseDialect(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DatabaseDatabaseDialect[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
