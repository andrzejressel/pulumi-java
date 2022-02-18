// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta3.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Immutable. The type of a queue (push or pull). `Queue.type` is an immutable property of the queue that is set at the queue creation time. When left unspecified, the default value of `PUSH` is selected.
     * 
     */
    @EnumType
    public enum QueueType {
        /**
         * Default value.
         * 
         */
        TypeUnspecified("TYPE_UNSPECIFIED"),
        /**
         * A pull queue.
         * 
         */
        Pull("PULL"),
        /**
         * A push queue.
         * 
         */
        Push("PUSH");

        private final String value;

        QueueType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "QueueType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
