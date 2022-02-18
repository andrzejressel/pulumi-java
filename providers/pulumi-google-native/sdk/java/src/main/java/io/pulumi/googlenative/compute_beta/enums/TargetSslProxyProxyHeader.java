// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
     * 
     */
    @EnumType
    public enum TargetSslProxyProxyHeader {
        None("NONE"),
        ProxyV1("PROXY_V1");

        private final String value;

        TargetSslProxyProxyHeader(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TargetSslProxyProxyHeader[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
