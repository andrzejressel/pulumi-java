// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of this run; can be either "AUTOMATED" or "ON_DEMAND". This field defaults to "ON_DEMAND" and is ignored, when specified for insert requests.
     * 
     */
    @EnumType
    public enum BackupRunType {
        /**
         * This is an unknown BackupRun type.
         * 
         */
        SqlBackupRunTypeUnspecified("SQL_BACKUP_RUN_TYPE_UNSPECIFIED"),
        /**
         * The backup schedule automatically triggers a backup.
         * 
         */
        Automated("AUTOMATED"),
        /**
         * The user manually triggers a backup.
         * 
         */
        OnDemand("ON_DEMAND");

        private final String value;

        BackupRunType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BackupRunType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
