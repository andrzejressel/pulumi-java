// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The unit that 'retained_backups' represents.
     * 
     */
    @EnumType
    public enum BackupRetentionSettingsRetentionUnit {
        /**
         * Backup retention unit is unspecified, will be treated as COUNT.
         * 
         */
        RetentionUnitUnspecified("RETENTION_UNIT_UNSPECIFIED"),
        /**
         * Retention will be by count, eg. "retain the most recent 7 backups".
         * 
         */
        Count("COUNT");

        private final String value;

        BackupRetentionSettingsRetentionUnit(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BackupRetentionSettingsRetentionUnit[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
