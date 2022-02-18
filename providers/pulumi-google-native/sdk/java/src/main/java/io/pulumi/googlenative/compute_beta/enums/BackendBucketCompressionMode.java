// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Compress text responses using Brotli or gzip compression, based on the client's Accept-Encoding header.
     * 
     */
    @EnumType
    public enum BackendBucketCompressionMode {
        /**
         * Automatically uses the best compression based on the Accept-Encoding header sent by the client.
         * 
         */
        Automatic("AUTOMATIC"),
        /**
         * Disables compression. Existing compressed responses cached by Cloud CDN will not be served to clients.
         * 
         */
        Disabled("DISABLED");

        private final String value;

        BackendBucketCompressionMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BackendBucketCompressionMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
