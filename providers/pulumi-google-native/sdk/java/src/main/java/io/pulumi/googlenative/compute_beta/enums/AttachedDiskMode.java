// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode.
     * 
     */
    @EnumType
    public enum AttachedDiskMode {
        /**
         * Attaches this disk in read-only mode. Multiple virtual machines can use a disk in read-only mode at a time.
         * 
         */
        ReadOnly("READ_ONLY"),
        /**
         * *[Default]* Attaches this disk in read-write mode. Only one virtual machine at a time can be attached to a disk in read-write mode.
         * 
         */
        ReadWrite("READ_WRITE");

        private final String value;

        AttachedDiskMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AttachedDiskMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
