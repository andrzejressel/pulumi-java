// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The stack type for this network interface to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used. This field can be both set at instance creation and update network interface operations.
     * 
     */
    @EnumType
    public enum NetworkInterfaceStackType {
        /**
         * The network interface can have both IPv4 and IPv6 addresses.
         * 
         */
        Ipv4Ipv6("IPV4_IPV6"),
        /**
         * The network interface will be assigned IPv4 address.
         * 
         */
        Ipv4Only("IPV4_ONLY"),
        UnspecifiedStackType("UNSPECIFIED_STACK_TYPE");

        private final String value;

        NetworkInterfaceStackType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NetworkInterfaceStackType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
