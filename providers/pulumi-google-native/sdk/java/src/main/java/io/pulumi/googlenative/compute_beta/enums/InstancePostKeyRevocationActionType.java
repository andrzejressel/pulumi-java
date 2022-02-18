// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * PostKeyRevocationActionType of the instance.
     * 
     */
    @EnumType
    public enum InstancePostKeyRevocationActionType {
        /**
         * Indicates user chose no operation.
         * 
         */
        Noop("NOOP"),
        /**
         * Default value. This value is unused.
         * 
         */
        PostKeyRevocationActionTypeUnspecified("POST_KEY_REVOCATION_ACTION_TYPE_UNSPECIFIED"),
        /**
         * Indicates user chose to opt for VM shutdown on key revocation.
         * 
         */
        Shutdown("SHUTDOWN");

        private final String value;

        InstancePostKeyRevocationActionType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstancePostKeyRevocationActionType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
