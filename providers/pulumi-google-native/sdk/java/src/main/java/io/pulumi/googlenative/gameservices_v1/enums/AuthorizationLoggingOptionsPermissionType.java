// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of the permission that was checked.
     * 
     */
    @EnumType
    public enum AuthorizationLoggingOptionsPermissionType {
        /**
         * Default. Should not be used.
         * 
         */
        PermissionTypeUnspecified("PERMISSION_TYPE_UNSPECIFIED"),
        /**
         * A read of admin (meta) data.
         * 
         */
        AdminRead("ADMIN_READ"),
        /**
         * A write of admin (meta) data.
         * 
         */
        AdminWrite("ADMIN_WRITE"),
        /**
         * A read of standard data.
         * 
         */
        DataRead("DATA_READ"),
        /**
         * A write of standard data.
         * 
         */
        DataWrite("DATA_WRITE");

        private final String value;

        AuthorizationLoggingOptionsPermissionType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AuthorizationLoggingOptionsPermissionType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
