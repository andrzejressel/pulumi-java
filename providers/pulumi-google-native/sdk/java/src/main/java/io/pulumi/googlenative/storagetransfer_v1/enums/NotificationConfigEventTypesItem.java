// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum NotificationConfigEventTypesItem {
        /**
         * Illegal value, to avoid allowing a default.
         * 
         */
        EventTypeUnspecified("EVENT_TYPE_UNSPECIFIED"),
        /**
         * `TransferOperation` completed with status SUCCESS.
         * 
         */
        TransferOperationSuccess("TRANSFER_OPERATION_SUCCESS"),
        /**
         * `TransferOperation` completed with status FAILED.
         * 
         */
        TransferOperationFailed("TRANSFER_OPERATION_FAILED"),
        /**
         * `TransferOperation` completed with status ABORTED.
         * 
         */
        TransferOperationAborted("TRANSFER_OPERATION_ABORTED");

        private final String value;

        NotificationConfigEventTypesItem(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NotificationConfigEventTypesItem[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
