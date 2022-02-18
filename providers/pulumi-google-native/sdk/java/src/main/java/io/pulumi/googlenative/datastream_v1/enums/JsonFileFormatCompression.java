// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Compression of the loaded JSON file.
     * 
     */
    @EnumType
    public enum JsonFileFormatCompression {
        /**
         * Unspecified json file compression.
         * 
         */
        JsonCompressionUnspecified("JSON_COMPRESSION_UNSPECIFIED"),
        /**
         * Do not compress JSON file.
         * 
         */
        NoCompression("NO_COMPRESSION"),
        /**
         * Gzip compression.
         * 
         */
        Gzip("GZIP");

        private final String value;

        JsonFileFormatCompression(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "JsonFileFormatCompression[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
