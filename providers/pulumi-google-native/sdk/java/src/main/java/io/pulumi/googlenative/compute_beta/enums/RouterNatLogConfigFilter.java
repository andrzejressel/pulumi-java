// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values: - ERRORS_ONLY: Export logs only for connection failures. - TRANSLATIONS_ONLY: Export logs only for successful connections. - ALL: Export logs for all connections, successful and unsuccessful.
     * 
     */
    @EnumType
    public enum RouterNatLogConfigFilter {
        /**
         * Export logs for all (successful and unsuccessful) connections.
         * 
         */
        All("ALL"),
        /**
         * Export logs for connection failures only.
         * 
         */
        ErrorsOnly("ERRORS_ONLY"),
        /**
         * Export logs for successful connections only.
         * 
         */
        TranslationsOnly("TRANSLATIONS_ONLY");

        private final String value;

        RouterNatLogConfigFilter(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RouterNatLogConfigFilter[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
